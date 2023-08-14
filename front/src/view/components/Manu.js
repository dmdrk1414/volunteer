// import 리액트
import React from "react";
import { Link } from "react-router-dom";

// import 부트스트랩
import {
  Navbar,
  Nav,
  NavDropdown,
  Form,
  Button,
  FormControl,
  Container,
} from "react-bootstrap";

import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faBars } from "@fortawesome/free-solid-svg-icons";

function Manu() {
  return (
    // 무조건 div는 하나
    <div className="manu">
      <Navbar bg="light" expand="lg" className="navbar-container">
        <Container>
          <Navbar.Brand href="#home" className="navber_title">
            <Link to="/">image </Link>
            <Link to="/">광주 봉사 포털</Link>
          </Navbar.Brand>
          <Navbar>
            <Nav className="justify-content-arount">
              <Nav.Link className="nav_items">
                <Link to="#action/3.1">봉사 신청</Link>
              </Nav.Link>
              <Nav.Link className="nav_items">
                <Link to="#action/3.2">신청 현황</Link>
              </Nav.Link>
              <NavDropdown title="나의 자원 봉사">
                <NavDropdown.Item href="/login">로그인</NavDropdown.Item>
                <NavDropdown.Item href="#action/3.4">
                  나의 신청현황
                </NavDropdown.Item>
              </NavDropdown>
            </Nav>
          </Navbar>
        </Container>
      </Navbar>
    </div>
  );
}

/* eslint-disable-next-line  */
export default Manu;
