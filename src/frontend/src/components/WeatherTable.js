import React from "react";
import TableRow from "../components/TableRow";
import {
  Table,
  Thead,
  Tbody,
  Tr,
  Th,
  TableCaption,
  Box,
} from "@chakra-ui/react";

export default function WeatherTable({ stations }) {
  return (
    <Box p="2.5rem">
      <Table variant="simple" size="lg">
        <TableCaption placement="top">
          Click <i>Mean Temperature</i> for more details
        </TableCaption>
        <Thead>
          <Tr>
            <Th>Station Name</Th>
            <Th>Date</Th>
            <Th>Mean Temperature</Th>
          </Tr>
        </Thead>
        <Tbody>
          {stations.map((station) => (
            <TableRow station={station} />
          ))}
        </Tbody>
      </Table>
    </Box>
  );
}
