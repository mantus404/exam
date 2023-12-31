import logo from './logo.svg';
import './App.css';
import { HashRouter, Route, Routes } from 'react-router-dom';
import { IndexView } from './pages/IndexView';
import { Nav } from './components/Nav';
import { AdminIndex } from './pages/AdminIndex';
import { ViewService } from './pages/ViewService';
import { CreateService } from './pages/CreateService';

function App() {
  return (
    <div className="App">
      <HashRouter>
        <Nav />
        <Routes>
          <Route path='/' element={<IndexView />} />
          <Route path='/admin' element={<AdminIndex />} />
          <Route path='/viewservice' element={<ViewService />} />
          <Route path='/createservice' element={<CreateService />} />
        </Routes>
      </HashRouter>
    </div>
  );
}

export default App;
