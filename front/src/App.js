import { Route, Routes } from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.min.css';
import Main from './components/js/Main';

function App() {
  return (
    <Routes>
      <Route path='/main' element={<Main />} />
    </Routes>
  );
}

export default App;