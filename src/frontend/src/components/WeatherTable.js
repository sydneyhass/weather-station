import React from "react";

import {
  Table,
  Thead,
  Tbody,
  Tfoot,
  Tr,
  Th,
  Td,
  TableCaption,
  Flex,
  Box,
  Link,
} from "@chakra-ui/react";

export default function WeatherTable({ props }) {
  return (
    <Box p="2.5rem">
      <Table variant="simple" size="lg">
        <TableCaption placement="top">
          Click <i>Mean Temperature</i> for more details
        </TableCaption>
        <Thead>
          <Th>Station Name</Th>
          <Th>Date</Th>
          <Th>Mean Temperature</Th>
        </Thead>
        <Tbody>
          <Tr>
            <Td>1</Td>
            <Td>2</Td>
            <Td>
              <Link href="/">3</Link>
            </Td>
          </Tr>
          <Tr>
            <Td>1</Td>
            <Td>2</Td>
            <Td>3</Td>
          </Tr>
        </Tbody>
      </Table>
    </Box>
  );
}
