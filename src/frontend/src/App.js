import * as React from "react";

import { ChakraProvider } from "@chakra-ui/react";
import Homepage from "./pages/Homepage";

class App extends React.Component {
  render() {
    return (
      <ChakraProvider>
        <Homepage />
      </ChakraProvider>
    );
  }
}

export default App;
