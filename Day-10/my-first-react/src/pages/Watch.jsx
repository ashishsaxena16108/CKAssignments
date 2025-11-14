import React,{useState,useEffect} from 'react'

const Watch = () => {
  const [hour,setHour] = useState(new Date().getHours());
  const [minute,setMinute] = useState(new Date().getMinutes());
  const [second, setSecond] = useState(new Date().getSeconds());
  useEffect(() => {
    const interval = setInterval(()=>{
     setSecond((second)=>second+1);
     if(second>=59){
        setSecond(0);
        setMinute((minute)=>minute+1);
     }
     if(minute>=59 && second>=59){
        setMinute(0);
        setHour((hour)=>hour+1);
     }
      
  },1000);
     return ()=>{
       clearInterval(interval);
     }
  })
  


//   console.log(Date().getHours(),Date().getMinutes(),Date().getSeconds())
  return (
    <div className='clock'>
        <div className="small-box">{String(hour).padStart(2,'0')}</div>:
        <div className="small-box">{String(minute).padStart(2,'0')}</div>:
        <div className="small-box">{String(second).padStart(2,'0')}</div>
    </div>
  )
}

export default Watch