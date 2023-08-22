// import 리액트
import React, { useEffect, useState } from "react";
import { Link } from "react-router-dom";

// firebase
import axios from "axios";
import { firebaseUrl } from "../../api/firebaseUrl";
import HomeContantComponents from "../components/HomeContantComponents";

function Home_contant() {
  const [eastAriticle, setEastAriticle] = useState([]);
  const [westAriticle, setWestAriticle] = useState([]);
  const [southAriticle, setSouthAriticle] = useState([]);
  const [northAriticle, setNorthAriticle] = useState([]);

  useEffect(() => {
    fetchData();
  }, []);

  const fetchData = async () => {
    // TODO
    await axios
      .get(`${firebaseUrl}/main.json`)
      .then((response) => {
        const data = response.data;
        setEastAriticle(data.east);
        setWestAriticle(data.west);
        setNorthAriticle(data.north);
        setSouthAriticle(data.south);
      })
      .catch((error) => console.log(error));
  };
  return (
    // 무조건 div는 하나
    <div className="home_contant">
      <div className="background_image"></div>
      <div className="d-flex contant_container align-items-center justify-content-around">
        <HomeContantComponents data={eastAriticle} />
        <HomeContantComponents data={westAriticle} />
        <HomeContantComponents data={southAriticle} />
        <HomeContantComponents data={northAriticle} />
      </div>
    </div>
  );
}

/* eslint-disable-next-line  */
export default Home_contant;
