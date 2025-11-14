import React from 'react'
import { NavLink, Outlet } from 'react-router-dom'

const Dashboard = ({handleLogout}) => {

  return (
    <div className='dashboard'>
        <div className='logout-btn'>
          <button onClick={()=>handleLogout()}>Logout</button>
        </div>
        <div className='navbar'>
            <NavLink className={({isActive})=>isActive?"active":""} to='/dashboard/watch'>Watch</NavLink>
            <NavLink className={({isActive})=>isActive?"active":""} to='/dashboard/counter'>Counter</NavLink>
        </div>
        <div className='outlet'>
            <Outlet/>
        </div>
    </div>
  )
}

export default Dashboard