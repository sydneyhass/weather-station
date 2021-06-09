import { React, useEffect, useState } from "react";
import DateForm from "../components/DateForm";
import Header from "../components/Header";
import Footer from "../components/Footer";
import WeatherTable from "../components/WeatherTable";
import TableRow from "../components/TableRow";

export default function Homepage() {
  const [stations, setStations] = useState([]);

  useEffect(() => {
    const fetchDetails = async () => {
      await fetch("http://localhost:8080/")
        .then((response) => response.json())
        .then((json) => {
          setStations(json);
        });
    };
    fetchDetails();
  }, []);

  return (
    <>
      <Header />
      <DateForm />
      <WeatherTable stations={stations} />
      <Footer />
    </>
  );
}
