// import 리액트
import React, { useEffect, useState } from "react";

function AirticleContant({ data }) {
  return (
    // 무조건 div는 하나
    <div className="article-items d-flex align-items-center">
      <div className="item-day d-flex justify-content-center align-items-center">
        <div className="d-flex align-items-center justify-content-center">
          D - {data.remainPeriod}
        </div>
      </div>
      <div className="item-contant">
        <div>
          {data.region} {data.title}
        </div>
        <div className="item-contant-info d-flex justify-content-around">
          <div>[모집기관] {data.ad_office}</div>
          <div>[모집기간] {data.ad_preriod}</div>
          <div>[봉사기간] {data.volunteer_period}</div>
        </div>
      </div>
    </div>
  );
}

/* eslint-disable-next-line  */
export default AirticleContant;
