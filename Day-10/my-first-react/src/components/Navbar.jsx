import React from 'react'
import { Link } from 'react-router-dom';

const Navbar = ({isAuthenticated}) => {
  const authbtns = ["Dashboard"];
  const noAuthbtns = ["Login"]
  return (
    <div className='navbar'>
       {isAuthenticated ? authbtns.map((i,index)=>{
          return <Link to={"/"+i.toLocaleLowerCase()} key={index}>{i}</Link>
       }):noAuthbtns.map((i,index)=>{
        return <Link to={i.toLocaleLowerCase()} key={index}>{i}</Link>
       })}
    </div>
  )
}

export default Navbar