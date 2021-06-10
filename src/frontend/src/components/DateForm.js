import React from "react";
import { FaFilter } from "react-icons/fa";
import { FormControl, FormLabel } from "@chakra-ui/form-control";
import { Flex, Spacer, Box, Stack, Button, Container } from "@chakra-ui/react";
import DatePicker from "react-datepicker";

import "react-datepicker/dist/react-datepicker.css";
import "../css/date-picker.css";

export default function DateForm(startDate, endDate) {
  return (
    <Container maxW="fit-content" centerContent my="40px">
      <Flex grow="initial">
        <Box p="10" w="lg">
          <FormControl id="start-date" isRequired>
            <FormLabel>Start Date</FormLabel>
            <DatePicker
              id="start-date"
              placeholderText="Enter Start Date (MM-DD-YY)"
              selectedDate={startDate}
            />
          </FormControl>
        </Box>
        <Spacer />
        <Box p="10" w="lg">
          <FormControl id="end-date" isRequired>
            <FormLabel>End Date</FormLabel>
            <DatePicker
              id="end-date"
              placeholderText="Enter End Date (MM-DD-YY)"
              selectedDate="02-02-2021"
            />
          </FormControl>
        </Box>
      </Flex>
      <Stack
        direction="row"
        align="center"
        justify="center"
        spacing={20}
        pb="20"
      >
        <Button
          colorScheme="blue"
          bgColor="blue.400"
          leftIcon={<FaFilter />}
          w="sm"
        >
          Filter
        </Button>
        <Button colorScheme="gray" w="sm">
          Cancel
        </Button>
      </Stack>
    </Container>
  );
}
