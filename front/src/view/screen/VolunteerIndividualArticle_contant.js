// import 리액트
import React, { useState } from "react";

// import components
import IndividualArticleComponents from "../components/IndividualArticleComponents";

import axios from "axios";

// firebase
import { firebaseUrl } from "../../api/firebaseUrl";
import { useParams } from "react-router-dom";

function VolunteerIndividualArticle_contant() {
  const [name, setName] = useState("");
  const [phonNum, setPhonNum] = useState("");
  const { articleId } = useParams();

  const handleNameChange = (event) => {
    setName(event.target.value);
  };

  const handlePhonNumChange = (event) => {
    setPhonNum(event.target.value);
  };

  const handleSubmit = async (event) => {
    event.preventDefault();
    try {
      await axios.post(`${firebaseUrl}/application/article`, {
        name,
        phonNum,
        articleId,
      });
      console.log("post 완성");
    } catch {}
  };

  return (
    // 무조건 div는 하나
    <div className="volunteer-individual-article-container container">
      <div className="individual-title">제목(모집중)</div>
      <IndividualArticleComponents />
      <form onSubmit={handleSubmit} className="volunteer-application-form ">
        <div className="application-form-title">신청 현황에 추가하기</div>
        <div className="form-container d-flex justify-content-around">
          <div className="d-flex justify-content-around align-items-center">
            이름
          </div>
          <input
            className="application-custom-placeholder form-control "
            type="name"
            id="name"
            name="name"
            placeholder="이름"
            value={name}
            onChange={handleNameChange}
            required
          />
          <div className="d-flex justify-content-around align-items-center">
            전화 번호
          </div>
          <input
            className="application-custom-placeholder form-control "
            type="phonNum"
            id="phonNum"
            name="phonNum"
            placeholder="전화번호"
            value={phonNum}
            onChange={handlePhonNumChange}
            required
          />
          <div className="application-inner-form">
            <button type="submit" className="application-btn form-control">
              신청하기
            </button>
          </div>
        </div>
      </form>
    </div>
  );
}

/* eslint-disable-next-line  */
export default VolunteerIndividualArticle_contant;
