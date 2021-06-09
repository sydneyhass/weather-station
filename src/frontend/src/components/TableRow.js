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

export default function TableRow({ station }) {
  return (
    <Tr>
      <Td>{station.stationName}</Td>
      <Td>{station.province}</Td>
      <Td>
        <Link href={"/station/id=" + station.id}>{station.meanTemp}</Link>
      </Td>
    </Tr>
  );
}
