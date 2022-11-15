import React from "react"
import UserService from "../services/UserService"
import axios from "axios";

class UserComponent extends React.Component{
    constructor(){
        super();
        this.state = {
            users :[]
        }
    }

    componentDidMount(){
      //  UserService.getUsers()
      axios.get("http://localhost:3000/users").then((res) => {
        const persons = res.data;
        this.setState({users: persons });
      });
  }

    render(){
        return <div>
            <h1>Users list</h1>
            <ul>
                {
                this.state.users.map(user => 
                <li key={user.id}>{user.name}</li>)
                }
            </ul>
        </div>
    }
}

export default UserComponent;