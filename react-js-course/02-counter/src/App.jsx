import { useState } from 'react'
import './App.css'

function App() {

  const [counter, setCounter] = useState(0);

  const addValue = () => {
    // counter = counter + 1;
    // setCounter(counter) 
    if(counter == 20 ) return;
    setCounter(counter + 1);
  }


  const removeValue = () => {
    if (counter == 0) return;
    else setCounter(counter - 1);
  }

  // new way to increase value
  const rValue = () => {
    setCounter(prevCounter => prevCounter + 1)

  }

  return (
    <>
      <h1>Chai or Code </h1>
      <h2>Counter {counter}</h2>
      <div className='d-flex'>
        <button onClick={addValue}>Add Value </button>
        <button onClick={removeValue}>Remove Value </button>
        <button onClick={rValue}>add Value </button>
      </div>

    </>
  )
}

export default App
