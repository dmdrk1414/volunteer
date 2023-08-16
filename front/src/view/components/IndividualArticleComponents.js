// import 리액트
import React, { useEffect, useState } from "react";

// 개별 페이지를 위한 useParms 사용
import { useParams } from "react-router-dom";

// firebase
import axios from "axios";
import { firebaseUrl } from "../../api/firebaseUrl";

function IndividualArticleComponents() {
  const [individualAriticleList, setIndividualAriticleList] = useState([]);

  const { articleId } = useParams();
  useEffect(() => {
    fetchData();
  }, []);

  const fetchData = async () => {
    // TODO
    await axios
      .get(`${firebaseUrl}/article/volunteers/${articleId}.json`)
      .then((response) => {
        const data = response.data;
        setIndividualAriticleList(data);
        console.log(individualAriticleList);
      })
      .catch((error) => console.log(error));
  };

  return (
    // 무조건 div는 하나
    <div className="volunteer-individual-article-container">
      <div className="container-title"></div>
      <div className="items-container">
        <div className="items d-flex justify-content-center align-items-center">
          <div className="items-contant-title d-flex justify-content-center align-items-center">
            봉사 기간
          </div>
          <div className="items-contant d-flex align-items-center">
            {individualAriticleList.volunteer_period}
          </div>
          <div className="items-contant-title d-flex justify-content-center align-items-center">
            봉사 시간
          </div>
          <div className="items-contant d-flex align-items-center">
            {individualAriticleList.volunteer_time}
          </div>
        </div>
        <div className="items d-flex justify-content-center align-items-center">
          <div className="items-contant-title d-flex justify-content-center align-items-center">
            모집 기간
          </div>
          <div className="items-contant d-flex align-items-center">
            {individualAriticleList.ad_period}
          </div>
          <div className="items-contant-title d-flex justify-content-center align-items-center">
            봉사 장소
          </div>
          <div className="items-contant d-flex align-items-center">
            {individualAriticleList.volunteer}
          </div>
        </div>
        <div className="items d-flex justify-content-center align-items-center">
          <div className="items-contant-title d-flex justify-content-center align-items-center">
            모집 인원
          </div>
          <div className="items-contant d-flex align-items-center">
            {individualAriticleList.ad_people}
          </div>
          <div className="items-contant-title d-flex justify-content-center align-items-center">
            신청 인원
          </div>
          <div className="items-contant d-flex align-items-center">
            {individualAriticleList.application_people}
          </div>
        </div>
        <div className="items d-flex justify-content-center align-items-center">
          <div className="items-contant-title d-flex justify-content-center align-items-center">
            모집 기관
          </div>
          <div className="items-contant d-flex align-items-center">
            {individualAriticleList.ad_office}
          </div>
          <div className="items-contant-title d-flex justify-content-center align-items-center">
            봉사자 유형
          </div>
          <div className="items-contant d-flex align-items-center">
            {individualAriticleList.volunteer_type}
          </div>
        </div>
      </div>
      <div className="individual-contant">{individualAriticleList.content}</div>
    </div>
  );
}

/* eslint-disable-next-line  */
export default IndividualArticleComponents;
