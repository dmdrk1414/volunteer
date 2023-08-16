import {
  BrowserRouter as Router,
  Routes,
  Route,
  useLocation,
} from "react-router-dom";

// import bootstrap
import "bootstrap/dist/css/bootstrap.min.css";

// router
import Home from "./router/Home";
import Login from "./router/Login";

// 봉사 활동 게시물
import VolunteerArticle from "./router/VolunteerArticle";
import VolunteerIndividualArticle from "./router/VolunteerIndividualArticle";

// 지원 현황
import ApplicationArticle from "./router/ApplicationArticle";

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/login" element={<Login />} />
        <Route path="/article/volunteer" element={<VolunteerArticle />} />
        <Route
          path="/article/application-status"
          element={<ApplicationArticle />}
        />
        <Route
          path="/article/volunteers/:articleId"
          element={<VolunteerIndividualArticle />}
        />
      </Routes>
    </Router>
  );
}

export default App;
