// import 리액트
import React, { useEffect, useState } from "react";
import { Link } from "react-router-dom";

// firebase
import axios from "axios";
import { firebaseUrl } from "../../api/firebaseUrl";
import SignupContantComponents from "../components/SignupContantComponents";

function SignupForm_contant() {
  return (
    // 무조건 div는 하나
    <div className="signup-form-container container">
      <div className="stepbar-container d-flex justify-content-center">
        <div className="stepbar d-flex justify-content-between">
          <div className="step1">1. 실명확인</div>
          <div className="step2"></div>
          <div className="step2text ">2. 실명확인</div>
        </div>
      </div>
      <SignupContantComponents />
    </div>
  );
}

/* eslint-disable-next-line  */
export default SignupForm_contant;
