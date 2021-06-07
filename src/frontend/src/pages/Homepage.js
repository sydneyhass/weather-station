import React from "react";
import DateForm from "../components/DateForm";
import Header from "../components/Header";
import Footer from "../components/Footer";
import WeatherTable from "../components/WeatherTable";

export default function Homepage() {
  return (
    <>
      <Header />
      <DateForm />
      <WeatherTable />
      <Footer />
    </>
  );
}
