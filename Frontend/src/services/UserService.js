import axios from "axios";

const GET_ALL_USERS_API_URL = "http://localhost:3000/users";

class UserService {
  getUsers() {
    axios.get(GET_ALL_USERS_API_URL);
  }
}
export default new UserService();
