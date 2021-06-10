import { React, useEffect, useState } from "react";
import { useParams } from "react-router-dom";

import Footer from "../components/Footer";
import Header from "../components/Header";
import Details from "../components/Details";

export default function DetailPage() {
  const [station, setStations] = useState({});

  const { id } = useParams();

  useEffect(() => {
    const fetchDetails = async () => {
      await fetch(`http://localhost:8080/station/id=${id}`)
        .then((response) => response.json())
        .then((json) => {
          console.log(json);
          setStations(json);
        });
    };
    fetchDetails();
  }, []);

  return (
    <>
      <Header />
      <Details station={station} />
      <Footer />
    </>
  );
}
