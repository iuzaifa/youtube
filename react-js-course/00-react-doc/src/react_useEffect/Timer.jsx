import React from 'react'
import { useEffect, useState } from 'react';

const Timer = () => {
  const [count, setCount] = useState(0);

  // useEffect(() => {
  //   setTimeout(() => {
  //     setCount((count) => count + 1); 
  //   }, 1000)

  // });



  useEffect(() => {
    
    alert("Apply Alert 1")



  }, [count]); // 



  return (
    <>
      <h1>I've rendered {count} times!</h1>

      <button onClick={() => setCount(prev => prev + 1)} className='border-b-gray-950 bg-slate-950 text-white m-10 py-2 px-6 rounded-sm'>click </button>

    </>
  )
}

export default Timer