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
