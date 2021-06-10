import React from "react";
import { BrowserRouter as Router, Link as Route } from "react-router-dom";
import { Tr, Td, Link } from "@chakra-ui/react";

export default function TableRow({ station }) {
  return (
    <Tr>
      <Td>{station.stationName}</Td>
      <Td>{station.province}</Td>
      <Td>
        <Link>{station.meanTemp}</Link>
      </Td>
    </Tr>
  );
}
