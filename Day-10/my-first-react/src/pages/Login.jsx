import React, { useEffect } from 'react'
import { useNavigate } from 'react-router-dom'

const Login = ({handleLogin,isLogin}) => {
  const navigate = useNavigate();
  useEffect(()=>{
    if(isLogin)
      navigate('/dashboard')
  })
  const loginHandler = ()=>{
     handleLogin();
     navigate('/dashboard');
  }
  return (
    <div>
        <button onClick={loginHandler}>Login</button>
    </div>
  )
}

export default Login