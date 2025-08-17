import { useCallback, useEffect, useState, useRef } from "react"

function App() {

  const [length, setLength] = useState(8)
  const [numberAllowed, setNumberAllowed] = useState(false)
  const [charAllowed, setCharAllowed] = useState(false)
  const [password, setPassword] = useState("")

  const passwordGenerator = useCallback(() => {

    let pass = ''
    let str = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz'

    if (numberAllowed) str += '0123456789';
    if (charAllowed) str += "!@#$%^&*()-_=+[]{};:'\",.<>/?\\|`~";

    for (let i = 1; i <= length; i++) {
      let char = Math.floor(Math.random() * str.length + 1)
      pass += str.charAt(char);
    }


    setPassword(pass)
  }, [length, numberAllowed, charAllowed, setPassword])


  const passwordRef = useRef(null);

  const copyPasswordToClipboard = useCallback(() => {

    passwordRef.current?.select()
    passwordRef.current?.setSelectionRange(0, length)
    window.navigator.clipboard.writeText(password)

  }, [password])


  const [copyMessage, setCopyMessage] = useState(false)


  const handleCopy = () => {
    navigator.clipboard.writeText(password)
    setCopyMessage(true)

    setTimeout(() => setCopyMessage(false), 3000)

  }


  useEffect(() => {
    passwordGenerator();
  }, [length, numberAllowed, charAllowed, passwordGenerator])

  return (
    <>

      <div className="bg-gray-300 p-5 my-10 rounded-lg " >
        <div className="flex justify-center items-cente py-4">
          {copyMessage && (
            <span className="inline-block rounded-2xl text-xs border border-green-300 bg-green-50 px-2 py-1 text-green-800 shadow-md">
              Password Copied!
            </span>
          )}
        </div>

        <h1 className="text-3xl font-extrabold pb-4 text-center text-gray-950">Password Generater</h1>


        <div className="flex items-center gap-3 w-full">
          <input
            type="text"
            placeholder="Password"
            value={password}
            ref={passwordRef}
            readOnly
            className="flex-1 px-3 py-2 border border-gray-950 rounded-sm focus:outline-none focus:ring-1 focus:ring-gray-950"
          />

          <button onClick={() => { copyPasswordToClipboard(), handleCopy() }} className="px-4 py-2 bg-slate-950 text-white rounded-sm shadow hover:bg-gray-800">
            Copy Password
          </button>
        </div>

        <div className="flex gap-3 w-full py-2 text-black">
          <div className="flex items-center gap-2">
            <input type="range"
              name=""
              id="lengthInput"
              min={8}
              max={25}
              value={length}
              onChange={(e) => setLength(e.target.value)}
              className="flex-1 accent-black cursor-pointer" />
            <label className="w-24">Length : {length}</label>
          </div>

          <div className="flex items-center gap-2">
            <input
              type="checkbox"
              defaultChecked={numberAllowed}
              name=""
              id="numberInput"
              onChange={() => setNumberAllowed((prev) => !prev)}

              className="accent-black cursor-pointer"
            />
            <label className="w-24">Numbers</label>
          </div>

          <div className="flex items-center gap-2">
            <input
              type="checkbox"
              defaultChecked={charAllowed}
              name=""
              id="characterInput"
              onChange={() => setCharAllowed((prev) => !prev)}
              className="accent-black cursor-pointer" />
            <label className="w-24">Charecters</label>
          </div>

        </div>




      </div>





    </>
  )
}

export default App


