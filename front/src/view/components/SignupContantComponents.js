// import 리액트
import React, { useEffect, useState } from "react";
import { Button } from "react-bootstrap";
import axios from "axios";

function SignupContantComponents() {
  const [email, setEmail] = useState("");
  const [checkNum, setCheckNum] = useState("");
  const [name, setName] = useState("");
  const [password, setPassword] = useState("");

  // form 핸들러
  const handleEmailChange = (event) => {
    setEmail(event.target.value);
  };
  const handlCheckNumChange = (event) => {
    setCheckNum(event.target.value);
  };
  const handleNameChange = (event) => {
    setName(event.target.value);
    console.log(name);
  };
  const handlePasswordChange = (event) => {
    setPassword(event.target.value);
  };

  // button 핸들러
  const handleEmailCheckButtonClick = async (event) => {
    event.preventDefault();
    try {
      await axios.post(`/signup/email`, {
        email,
      });
    } catch {}
  };

  const handleCheckNumButtonClick = async (event) => {
    event.preventDefault();
    try {
      await axios.post(`/signup/email/check`, {
        checkNum,
      });
    } catch {}
  };

  const handleSignupButtonClick = async (event) => {
    event.preventDefault();
    try {
      await axios.post(`/signup`, {
        email,
        name,
        password,
      });
    } catch {}
  };

  useEffect(() => {}, []);

  return (
    // 무조건 div는 하나
    <div className="signup-contant-container container ">
      <div className="input-forms-container form-custom email-container d-flex justify-content-center  align-items-center">
        <div className="input-forms-title">이메일</div>
        <input
          className="placehold form-control "
          type="email"
          id="email"
          name="email"
          placeholder="이메일을 입력하세요"
          value={email}
          onChange={handleEmailChange}
          required
        />
        <button onClick={handleEmailCheckButtonClick}>전송</button>
      </div>
      <div className="input-forms-container form-custom checknum-container d-flex justify-content-center  align-items-center">
        <div className="input-forms-title">인증번호</div>
        <input
          className="placehold form-control "
          type="number"
          id="checkNum"
          name="checkNum"
          placeholder="인증번호를 입력하세요"
          value={checkNum}
          onChange={handlCheckNumChange}
          required
        />
        <button onClick={handleCheckNumButtonClick}>전송</button>
      </div>
      <div className="input-forms-container name-container d-flex justify-content-center  align-items-center">
        <div className="input-forms-title">이름</div>
        <input
          className="placehold form-control "
          type="text"
          id="name"
          name="name"
          placeholder="이름을 입력하세요"
          value={name}
          onChange={handleNameChange}
          required
        />
      </div>
      <div className="input-forms-container password-container d-flex justify-content-center  align-items-center">
        <div className="input-forms-title">비밀번호</div>
        <input
          className="placehold form-control "
          type="password"
          id="password"
          name="password"
          placeholder="비밀번호를 입력하세요"
          value={password}
          onChange={handlePasswordChange}
          required
        />
      </div>
      <div className="input-forms-container check-password-container d-flex justify-content-center  align-items-center">
        <div className="input-forms-title">비밀번호 확인</div>
        <input
          className="placehold form-control "
          type="password"
          id="password"
          name="password"
          placeholder="확인 비밀번호를 입력하세요"
          required
        />
      </div>
      <div className="signup-button-container d-flex justify-content-center  align-items-center">
        <button onClick={handleSignupButtonClick}>가입하기</button>
      </div>
    </div>
  );
}

/* eslint-disable-next-line  */
export default SignupContantComponents;
