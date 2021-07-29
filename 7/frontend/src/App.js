import logo from './logo.svg';

import './App.css';
import { Component } from 'react';
import Animal from './Animal';

class App extends Component {
  state = {
    animals:[]
  }

  componentDidMount() {
    fetch('http://localhost:8080/api/animals')
        .then(response => response.json())
        .then(data => this.setState({animals: data}));
}

  viewAnimal = () => {
    return this.state.animals.map((el)=>{
      return(
        <Animal id={el.id} name={el.name}/>
      );
    });
  }

  render() {
    return (
      <div className="App">
        <h2>Animal list:</h2>
        {this.viewAnimal()}
      </div>
    );
  }
}

export default App;
