// import 리액트
import React, { useEffect, useState } from "react";
import { Link } from "react-router-dom";

// firebase
import axios from "axios";
import { firebaseUrl } from "../../api/firebaseUrl";
import ApplicationArticleContantComponents from "../components/ApplicationArticleContantComponents";

function ApplicationArticle_contant() {
  const [applicationAriticleList, setApplicationAriticleList] = useState([]);

  useEffect(() => {
    fetchData();
  }, []);

  const fetchData = async () => {
    // TODO
    await axios
      .get(`${firebaseUrl}/article/application-status.json`)
      .then((response) => {
        setApplicationAriticleList(response.data);
        console.log(response.data);
      })
      .catch((error) => console.log(error));
  };
  return (
    // 무조건 div는 하나
    <div className="application_contant container">
      <div className="application-subject ">봉사 신청 현황</div>
      <div className="application-title">
        <div
          className=" d-flex justify-content-between"
          style={{ width: "50%" }}
        >
          <div style={{ marginLeft: "60px" }}>번호</div>
          <div>제목</div>
        </div>
      </div>
      <div className="applications-container ">
        {applicationAriticleList.map((item, index) => (
          <ApplicationArticleContantComponents key={index} data={item} />
        ))}
      </div>
    </div>
  );
}

/* eslint-disable-next-line  */
export default ApplicationArticle_contant;
