import { Container, List, ListIcon, ListItem } from "@chakra-ui/layout";

import { VscHome } from "react-icons/vsc";
import { SiGooglemaps, SiGooglecalendar } from "react-icons/si";
import { FaBalanceScale, FaArrowUp, FaArrowDown } from "react-icons/fa";

import React from "react";

export default function Details() {
  return (
    <>
      <Container p="20px">
        <List spacing={4}>
          <ListItem>
            <ListIcon as={VscHome}></ListIcon>Station Name:
          </ListItem>
          <ListItem>
            <ListIcon as={SiGooglemaps}></ListIcon>Province:
          </ListItem>
          <ListItem>
            <ListIcon as={SiGooglecalendar}></ListIcon>Date:
          </ListItem>
          <ListItem>
            <ListIcon as={FaBalanceScale}></ListIcon>Mean Temperature:
          </ListItem>
          <ListItem>
            <ListIcon as={FaArrowUp}></ListIcon>Highest Monthly Temperature:
          </ListItem>
          <ListItem>
            <ListIcon as={FaArrowDown}></ListIcon>Lowest Monthly Temperature:
          </ListItem>
        </List>
      </Container>
    </>
  );
}
