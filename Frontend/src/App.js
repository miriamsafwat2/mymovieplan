import './App.css';
import MovieComponent from './components/MovieComponent';
import UserComponent from './components/UserComponent';

const viewUsers = (() => {return <UserComponent />;});
function App() {
  return (
    <div>
      <UserComponent />
      <MovieComponent />
      <div>
        <button id="btnUsers" onClick="viewUsers">
          {" "}
          View all users{" "}
        </button>
        <button id="btnMovies" onClick="viewMovies">
          {" "}
          View all movies{" "}
        </button>
      </div>
    </div>
  );
}

export default App;
