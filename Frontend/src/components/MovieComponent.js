import React from "react"
import MovieService from "../services/MovieService"
import axios from "axios";

class MovieComponent extends React.Component{
    constructor(){
        super();
        this.state = {
            movies :[]
        }
    }

    componentDidMount(){
      //  UserService.getUsers()
      axios.get("http://localhost:3000/movies").then((res) => {
        const data = res.data;
        this.setState({movies: data });
      });
  }

    render(){
        return <div>
            <h1>Movies list</h1>
            <ul>
                {
                this.state.movies.map(m => 
                <li key={m.id}>{m.name} - Category: {m.category}</li>)
                }
            </ul>
        </div>
    }
}

export default MovieComponent;