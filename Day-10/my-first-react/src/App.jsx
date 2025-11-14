import { useState } from 'react'
import './App.css'
import Navbar from './components/Navbar'
import { BrowserRouter, Routes,Route} from 'react-router-dom';
import Login from './pages/Login';
import ProtectedRoute from './components/ProtectedRoute';
import Counter from './pages/Counter';
import Watch from './pages/Watch';
import Home from './pages/Home';
import Dashboard from './pages/Dashboard';
import NotFound from './pages/NotFound';

function App() {
  const [isLogin, setIsLogin] = useState(localStorage.getItem("isAuthenticated") || false);

  const handleLogin = () => {
    setIsLogin(true);
    localStorage.setItem("isAuthenticated", "true");
  };

  const handleLogout = () => {
    setIsLogin(false);
    localStorage.removeItem("isAuthenticated");
  };
  return (
    <>
      
      <BrowserRouter>
      <Routes>
        <Route path='/login' element={<Login handleLogin={handleLogin} isLogin={isLogin}/>}/>
        <Route path='/' element={<Home isAuthenticated={isLogin}/>} />
        <Route path='/dashboard' element={<ProtectedRoute isAuthenticated={isLogin}><Dashboard handleLogout={handleLogout}/></ProtectedRoute>} >
        <Route path='/dashboard/watch' element={<ProtectedRoute isAuthenticated={isLogin}><Watch/></ProtectedRoute>}/>
        <Route path='/dashboard/counter' element={<ProtectedRoute isAuthenticated={isLogin}><Counter/></ProtectedRoute>}/>
        </Route>
        <Route path='*' element={<NotFound/>}/>
      </Routes>
      </BrowserRouter>

    </>
  )
}

export default App
