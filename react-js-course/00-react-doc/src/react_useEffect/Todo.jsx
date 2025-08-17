import React, { useEffect, useState } from 'react'

const Todo = () => {

    const [count, setCount] = useState(0);

    const [heading, setHeading] = useState(false);

    const [isVisible, setIsVisible] = useState(true);


    const [width, setWitdth] = useState(window.innerWidth);

    useEffect(() => {

        const size = () => setWitdth(window.innerWidth)
        window.addEventListener("resize", size)

        return () => window.removeEventListener('resize',size )
    }, [])





    useEffect(() => {

        const timer = setTimeout(() => {
            setIsVisible(false);
        }, 3000)


        return () => clearTimeout(timer);


    }, [])




    useEffect(() => {
        document.title = `You clicked ${count} times`;
    }, [count]);


    // hide and show heading 
    useEffect(() => {
        heading === true
            ? setHeading("Hey I am learning React.useEffect(()=> {},[])")
            : "";
    }, [heading])

    return (
        <div>
            <h1 className='m-10'>current window with is {width}px</h1>
            <p className='m-10'>You clicked {count} || times</p>
            <button onClick={() => setCount(count + 1)} className='bg-black text-white px-3 py-2 rounded-md m-10'>Click me</button>

            <p>{heading}</p>
            <button onClick={() => setHeading(!heading)} className='bg-black text-white px-3 py-2 rounded-md m-10'>{heading ? "Hide" : "Show"}</button>

            <h1 className=' m-10 font-boldxt text-lg text-black'>Example: Show a message for 3 seconds, then hide it</h1>
            <h3 className='m-10'>{isVisible ? <h1>This will disappear in 3 seconds...</h1> : <h3 className='text-red-600'>Time Out</h3>}</h3>

        </div>
    );
}

export default Todo