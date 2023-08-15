// 리액트 import
import React from "react";
import axios from "axios";

// component
import Manu from "../components/Manu";
import VolunteerArticle_contant from "../screen/VolunteerArticle_contant";

function Home() {
  return (
    <div>
      <Manu></Manu>
      <VolunteerArticle_contant></VolunteerArticle_contant>
    </div>
  );
}

export default Home;
