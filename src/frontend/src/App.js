import * as React from "react";
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";

import { ChakraProvider } from "@chakra-ui/react";
import Homepage from "./pages/Homepage";
import DetailPage from "./pages/DetailPage";
import FourOhFourPage from "./pages/FourOhFourPage";

class App extends React.Component {
  render() {
    return (
      <ChakraProvider>
        <Router>
          <Switch>
            <Route path="/">
              <Homepage />
            </Route>
            <Route path="/station/id=:id">
              <DetailPage />
            </Route>
            <Route>
              <FourOhFourPage />
            </Route>
          </Switch>
        </Router>
      </ChakraProvider>
    );
  }
}

export default App;
