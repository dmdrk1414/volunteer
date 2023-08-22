// import 리액트
import React, { useEffect, useState } from "react";
import { Link } from "react-router-dom";

// firebase
import axios from "axios";
import { firebaseUrl } from "../../api/firebaseUrl";
import AirticleContantComponents from "../components/AirticleContantComponents";

function Home_contant() {
  const [ariticleList, setAriticleList] = useState([]);

  useEffect(() => {
    fetchData();
  }, []);

  const fetchData = async () => {
    // TODO
    await axios
      .get(`${firebaseUrl}/article/volunteer.json`)
      .then((response) => {
        setAriticleList(response.data);
      })
      .catch((error) => console.log(error));
  };
  return (
    // 무조건 div는 하나
    <div className="airticle_contant container">
      <div className="article-subject ">봉사신청 게시판</div>
      <div className="articles-container ">
        {ariticleList.map((item, index) => (
          <Link to={`/article/volunteers/${item.id}`} key={item.id}>
            <AirticleContantComponents key={index} data={item} />
          </Link>
        ))}
      </div>
    </div>
  );
}

/* eslint-disable-next-line  */
export default Home_contant;
