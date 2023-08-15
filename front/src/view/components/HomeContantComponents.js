// import 리액트
import React, { useEffect, useState } from "react";

function HomeContantComponents({ data }) {
  return (
    // 무조건 div는 하나
    <div className="contant-container-items ">
      <div className="item-region d-flex justify-content-center  align-items-center ">
        {data.region}
      </div>
      <div className="item-contant d-flex   align-items-center ">
        <div className="items  ">
          <div>{data.title}</div>
          <div className="items-contant">
            <div>· 모집인원 : {data.numOfRecruits}</div>
            <div>· 모집기간 : {data.ad_preriod}</div>
            <div>· 봉사기간 : {data.volunteer_period}</div>
          </div>
        </div>
      </div>
    </div>
  );
}

/* eslint-disable-next-line  */
export default HomeContantComponents;
