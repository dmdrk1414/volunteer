// import 리액트
import React, { useEffect, useState } from "react";

// import components
import IndividualArticleComponents from "../components/IndividualArticleComponents";

function Home_contant() {
  return (
    // 무조건 div는 하나
    <div className="volunteer-individual-article-container container">
      <IndividualArticleComponents />
    </div>
  );
}

/* eslint-disable-next-line  */
export default Home_contant;
