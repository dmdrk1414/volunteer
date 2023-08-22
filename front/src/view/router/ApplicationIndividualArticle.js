// 리액트 import
import React from "react";

// component
import Manu from "../components/Manu";
import IndividualArticleComponents from "../components/IndividualArticleComponents";

function ApplicationIndividualArticle() {
  return (
    <div>
      <Manu></Manu>
      <div className="volunteer-individual-article-container container">
        <div className="individual-title">제목</div>
        <IndividualArticleComponents></IndividualArticleComponents>
      </div>
    </div>
  );
}

export default ApplicationIndividualArticle;
