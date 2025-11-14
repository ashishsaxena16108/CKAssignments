import React,{useState} from 'react'

const Counter = () => {
    const [count, setCount] = useState(0);
    
  return (
    <div className='counter'>
        <div className='count-btn'>
        <button onClick={()=>{setCount(count=>count-1)}}>-</button>
        </div>
        <div className='count'>{count}</div>
        <div className='count-btn'>
        <button onClick={()=>{setCount(count=>count+1)}}>+</button>
        </div>
    </div>
  )
}

export default Counter