// import 리액트
import React, { useEffect, useState } from "react";
import { Link } from "react-router-dom";

// firebase
import database from "../../db/firebase.config";
import axios from "axios";
import { firebaseUrl } from "../../api/firebaseUrl";

function Home_contant() {
  const [eastContant, setEastContant] = useState([]);
  const [westContant, setWestContant] = useState([]);
  const [southContant, setSouthContant] = useState([]);
  const [northContant, setNorthContant] = useState([]);

  useEffect(() => {
    const dataBase = database;
    fetchData();
  }, []);

  const fetchData = async () => {
    // TODO
    await axios
      .get(`${firebaseUrl}main.json`)
      .then((response) => {
        const data = response.data;
        setEastContant(data.남구);
        setWestContant(data.서구);
        setSouthContant(data.남구);
        setNorthContant(data.북구);
        console.log(data.남구);
      })
      .catch((error) => console.log(error));
  };
  return (
    // 무조건 div는 하나
    <div className="home_contant">
      <div className="background_image"></div>
      <div className="d-flex contant_container align-items-center justify-content-around">
        <div className="contant-container-items ">
          <div className="item-region d-flex justify-content-center">동 구</div>
          <div className="item-contant">
            {eastContant.map((item, index) => (
              <a key={index} href={`/#action/3.${index + 1}`}>
                <div className="items">{item}</div>
              </a>
            ))}
          </div>
        </div>
        <div className="contant-container-items ">
          <div className="item-region d-flex justify-content-center">서 구</div>
          <div className="item-contant">
            {westContant.map((item, index) => (
              <a key={index} href={`/#action/3.${index + 1}`}>
                <div className="items">{item}</div>
              </a>
            ))}
          </div>
        </div>
        <div className="contant-container-items ">
          <div className="item-region d-flex justify-content-center">남 구</div>
          <div className="item-contant">
            {southContant.map((item, index) => (
              <a key={index} href={`/#action/3.${index + 1}`}>
                <div className="items">{item}</div>
              </a>
            ))}
          </div>
        </div>
        <div className="contant-container-items ">
          <div className="item-region d-flex justify-content-center">북 구</div>
          <div className="item-contant">
            {northContant.map((item, index) => (
              <a key={index} href={`/#action/3.${index + 1}`}>
                <div className="items">{item}</div>
              </a>
            ))}
          </div>
        </div>
      </div>
    </div>
  );
}

/* eslint-disable-next-line  */
export default Home_contant;
