// import 리액트
import React, { useEffect, useState } from "react";
import { Link } from "react-router-dom";

// firebase
import axios from "axios";
import { firebaseUrl } from "../../api/firebaseUrl";
import AirticleContantComponents from "../components/AirticleContantComponents";

function SignupForm_contant() {
  return (
    // 무조건 div는 하나
    <div className="signup-form-container container">
      <div class="stepbar">
        <div class="step1">1. 실명확인</div>
        <div class="step2"></div>
        <div class="step2text">2. 실명확인</div>
      </div>
      <div className="articles-container "></div>
    </div>
  );
}

/* eslint-disable-next-line  */
export default SignupForm_contant;
