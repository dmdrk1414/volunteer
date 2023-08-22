// import 리액트
import React, { useEffect, useState } from "react";

function ApplicationArticleContantComponents({ data }) {
  return (
    // 무조건 div는 하나
    <div className="application-items-container">
      <div className="application-items d-flex justify-content-between">
        <div>{data.id}</div>
        <div>{data.title}</div>
      </div>
    </div>
  );
}

/* eslint-disable-next-line  */
export default ApplicationArticleContantComponents;
