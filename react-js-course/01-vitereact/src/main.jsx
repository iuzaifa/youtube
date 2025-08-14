import { StrictMode } from 'react'
import React from 'react'
import { createRoot } from 'react-dom/client'
import App from './App'


function MyApp() {

  return (
    <>
      <h1>Hello Custom My App!.............</h1>
      <p>I am Abu Huzaifa The writer of the code</p>
    </>
  )
}

const reactElement = React.createElement(
  'a',
  {href : 'https://google.com', target : '_blank'},
  'click me'
)

createRoot(document.getElementById('root')).render(



  <StrictMode>
    <App/>
    
  </StrictMode>

  // reactElement
  // MyApp()


)
