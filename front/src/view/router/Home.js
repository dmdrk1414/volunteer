// 리액트 import
import React from "react";
import axios from "axios";

// component
import Manu from "../components/Manu";
import Home_contant from "../screen/Home_contant";

function Home() {
  return (
    <div>
      <Manu></Manu>
      <Home_contant></Home_contant>
    </div>
  );
}

export default Home;
