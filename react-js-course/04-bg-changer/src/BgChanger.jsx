import React from 'react'
import { useState } from 'react'

const BgChanger = () => {

    const [color, setColor] = useState("");
    // const [colorname, setColorname] = useState("text");


    return (
        <div className="w-full h-screen duration-200" style={{ backgroundColor: color }}>


            <div className='fixed flex flex-wrap justify-center bottom-12 inset-x-0 px-2'>

                <div className='flex flex-wrap justify-center gap-3 shadow-lg bg-white border px-3 py-2 rounded-3xl'>
                    <button className='outline-none px-4 py-1 rounded-full text-white shadow-lg' style={{ backgroundColor: "red" }}>
                        Red
                    </button>
                    <button className='outline-none px-4 py-1 rounded-full text-white shadow-lg' style={{ backgroundColor: "green" }}>
                        Green
                    </button>
                    <button className='outline-none px-4 py-1 rounded-full text-white shadow-lg' style={{ backgroundColor: "blue" }}>
                        Blue
                    </button>
                    <button className='outline-none px-4 py-1 rounded-full text-white shadow-lg' style={{ backgroundColor: "olive" }}>
                        Red
                    </button>
                    <button className='outline-none px-4 py-1 rounded-full text-white shadow-lg' style={{ backgroundColor: "yellow" }}>
                        Red
                    </button>
                    <button className='outline-none px-4 py-1 rounded-full text-white shadow-lg' style={{ backgroundColor: "gray" }}>
                        Red
                    </button>
                    <button className='outline-none px-4 py-1 rounded-full text-white shadow-lg' style={{ backgroundColor: "pink" }}>
                        Red
                    </button>
                    <button className='outline-none px-4 py-1 rounded-full text-white shadow-lg' style={{ backgroundColor: "purple" }}>
                        Red
                    </button>
                    <button className='outline-none px-4 py-1 rounded-full text-white shadow-lg' style={{ backgroundColor: "white" }}>
                        Red
                    </button>
                    <button className='outline-none px-4 py-1 rounded-full text-white shadow-lg' style={{ backgroundColor: "black" }}>
                        Red
                    </button>
                    <button className='outline-none px-4 py-1 rounded-full text-white shadow-lg' style={{ backgroundColor: "lavender" }}>
                        Red
                    </button>



                </div>

            </div>


        </div>
    )
}

export default BgChanger