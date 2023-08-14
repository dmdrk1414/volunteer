import { React, useState, useEffect } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";
import Toast from "react-bootstrap/Toast";
import ToastContainer from "react-bootstrap/ToastContainer";
import imageSrc from "../../image/google.png";

// firebase
import { firebaseUrl } from "../../api/firebaseUrl";

export default function Login() {
  const navigate = useNavigate();

  useEffect(() => {
    const token = localStorage.getItem("token");
    if (token) {
      navigate("/main");
    }
  }, [navigate]);

  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");

  const handleEmailChange = (event) => {
    setEmail(event.target.value);
  };

  const handlePasswordChange = (event) => {
    setPassword(event.target.value);
  };

  const handleSubmit = async (event) => {
    event.preventDefault();
    try {
      const response = await axios.post(`${firebaseUrl}/login`, {
        email,
        password,
      });

      if (response.status === 200) {
        // 로그인 성공 시 할 일
        localStorage.setItem("token", response.data.accessToken);
        navigate("/main");
      }
    } catch {}
  };

  const handleClickJoinBtn = () => {
    navigate("/SignUp");
  };

  const moveToMain = () => {
    navigate("/");
  };

  return (
    <div className="login-container container ">
      <div className="login-inside form-group ">
        <h1 className="login-title d-flex justify-content-center">
          로그인 페이지
        </h1>
        <form onSubmit={handleSubmit} className="login-form">
          <div className="login-inner-form mx-auto">
            <input
              className="login-custom-placeholder form-control "
              type="email"
              id="email"
              name="email"
              placeholder="아이디를 입력하세요"
              value={email}
              onChange={handleEmailChange}
              required
            />
          </div>
          <div className="login-inner-form mx-auto">
            <input
              className="login-custom-placeholder form-control"
              type="password"
              id="password"
              name="password"
              placeholder="비밀번호를 입력하세요"
              value={password}
              onChange={handlePasswordChange}
              required
            />
          </div>
          <div className="login-inner-form mx-auto">
            <button
              type="submit"
              className="login-btn login-custom-placeholder form-control"
            >
              로그인
            </button>
          </div>
          <div
            className="mx-auto d-flex justify-content-around"
            style={{ width: "200px" }}
          >
            <a href="#" className="login-no-underline">
              비밀번호 찾기
            </a>
            <a href="#" className="login-no-underline">
              아이디 찾기
            </a>
          </div>
        </form>
        <a href="/oauth2/authorization/google">
          <div class="google-login-container mx-auto d-flex justify-content-center ">
            <img src={imageSrc} className="google-image" />
            <div className="google-text ">Google 계정으로 계속하기</div>
          </div>
        </a>
      </div>
      <hr />

      <div
        className="login-inside mx-auto d-flex justify-content-around"
        style={{ width: "300px" }}
      >
        <label htmlFor="joinBtn">만약 회원가입을 안하셨다면</label>
        <button id="joinBtn" className="login-btn" onClick={handleClickJoinBtn}>
          회원가입하기
        </button>
      </div>
    </div>
  );
}
