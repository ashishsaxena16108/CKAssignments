import React from 'react'
import Navbar from '../components/Navbar'

const Home = ({isAuthenticated}) => {
  return (
    <div>
        <Navbar isAuthenticated={isAuthenticated}/>
    </div>
  )
}

export default Home