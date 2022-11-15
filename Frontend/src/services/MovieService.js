import axios from 'axios';

const GET_ALL_MOVIES_API_URL = "http://localhost:3000/movies";

class MovieService{
    getUsers(){
        axios.get(GET_ALL_MOVIES_API_URL);
    }
}
export default new MovieService();
