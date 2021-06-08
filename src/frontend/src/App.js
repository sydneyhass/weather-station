import * as React from "react";

import { ChakraProvider } from "@chakra-ui/react";
import Homepage from "./pages/Homepage";
import DetailPage from "./pages/DetailPage";

class App extends React.Component {
  render() {
    return (
      <ChakraProvider>
        {/* <Homepage /> */}
        <DetailPage />
      </ChakraProvider>
    );
  }
}

export default App;
