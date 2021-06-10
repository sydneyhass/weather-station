import { Container, List, ListIcon, ListItem } from "@chakra-ui/layout";
import { VscHome } from "react-icons/vsc";
import { SiGooglemaps, SiGooglecalendar } from "react-icons/si";
import { FaBalanceScale, FaArrowUp, FaArrowDown } from "react-icons/fa";
import { React } from "react";

export default function Details({ station }) {
  return (
    <>
      <Container p="20px">
        <List spacing={4}>
          <ListItem>
            <ListIcon as={VscHome}></ListIcon>Station Name:{" "}
            {station.stationName}
          </ListItem>
          <ListItem>
            <ListIcon as={SiGooglemaps}></ListIcon>Province: {station.province}
          </ListItem>
          <ListItem>
            <ListIcon as={SiGooglecalendar}></ListIcon>Date: {station.date}
          </ListItem>
          <ListItem>
            <ListIcon as={FaBalanceScale}></ListIcon>Mean Temperature:{" "}
            {station.meanTemp}
          </ListItem>
          <ListItem>
            <ListIcon as={FaArrowUp}></ListIcon>Highest Monthly Temperature:{" "}
            {station.highestTemp}
          </ListItem>
          <ListItem>
            <ListIcon as={FaArrowDown}></ListIcon>Lowest Monthly Temperature:{" "}
            {station.lowestTemp}
          </ListItem>
        </List>
      </Container>
    </>
  );
}
