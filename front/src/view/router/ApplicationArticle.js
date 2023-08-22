// 리액트 import
import React from "react";
import axios from "axios";

// component
import Manu from "../components/Manu";
import ApplicationArticle_contant from "../screen/ApplicationArticle_contant";

function ApplicationArticle() {
  return (
    <div>
      <Manu></Manu>
      <ApplicationArticle_contant></ApplicationArticle_contant>
    </div>
  );
}

export default ApplicationArticle;
