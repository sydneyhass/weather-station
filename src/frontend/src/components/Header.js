import React from "react";
import { Flex, Heading } from "@chakra-ui/react";

export default function Header() {
  return (
    <Flex align="center" justify="center" shadow="sm" h="120px">
      <Heading
        bgClip="text"
        color="black"
        fontSize="4xl"
        textAlign="center"
        textTransform="uppercase"
        fontFamily="monospace"
        letterSpacing="wider"
      >
        Weather Station
      </Heading>
    </Flex>
  );
}
