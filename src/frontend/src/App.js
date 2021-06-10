import * as React from "react";
import { BrowserRouter as Router, Link, Route } from "react-router-dom";

import { ChakraProvider } from "@chakra-ui/react";
import Homepage from "./pages/Homepage";
import DetailPage from "./pages/DetailPage";

class App extends React.Component {
  render() {
    return (
      <ChakraProvider>
        <Router>
          {/* <Route path="/">
            <Homepage />
          </Route> */}
          <Route path="/station/id=:id">
            <DetailPage />
          </Route>
        </Router>
      </ChakraProvider>
    );
  }
}

export default App;
