# 사용 API 정리

## fire base 사용

1. firebase.config.js 파일 생성
```js
// firebase.config.js
// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
import { getDatabase } from "firebase/database";

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
  apiKey: "AIzaSyCaW_CAc7V5WGEKEa4B_UZjPEq2wv2PENI",
  authDomain: "volunteer-97f8c.firebaseapp.com",
  databaseURL:
    "https://volunteer-97f8c-default-rtdb.europe-west1.firebasedatabase.app",
  projectId: "volunteer-97f8c",
  storageBucket: "volunteer-97f8c.appspot.com",
  messagingSenderId: "503912574287",
  appId: "1:503912574287:web:95fa0066639fc140e5293a",
  measurementId: "G-LYP7B3T9RR",
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);

// Initialize Realtime Database and get a reference to the service
const database = getDatabase(app);

export default database;

```

2. 사용
```js
// import 리액트
import React, { useEffect, useState } from "react";
import { Link } from "react-router-dom";

// firebase
import database from "../../db/firebase.config";
import axios from "axios";
import { firebaseUrl } from "../../api/firebaseUrl";

function Home_contant() {
  const [eastContant, setEastContant] = useState([]);

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

      })
      .catch((error) => console.log(error));
  };
```