import axios from "axios";
import { firebaseUrl } from "../../api/firebaseUrl";

// import 리액트
import React, { useEffect, useState } from "react";

function CheckEmailComponents() {
  useEffect(() => {}, []);

  const [email, setEmail] = useState("");

  const handleEmailChange = (event) => {
    setEmail(event.target.value);
  };

  const handleSubmit = async (event) => {
    event.preventDefault();
    try {
      const response = await axios.post(`${firebaseUrl}/login`, {
        email,
      });
    } catch {}
  };

  return (
    // 무조건 div는 하나
    <div className="check-email-container container ">
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
    </div>
  );
}

/* eslint-disable-next-line  */
export default CheckEmailComponents;
