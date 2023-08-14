import React from "react";
import ReactDOM from "react-dom/client";
import App from "./view/App";
import reportWebVitals from "./reportWebVitals";

// import bootstrap
import "bootstrap/dist/css/bootstrap.min.css";

// index.scss 통합 import scss 파일
import "./scss/index.scss";

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
