import React from 'react'

const Card = ({ btn="Empty", cardTitle }) => {
    return (
        <>
            <div className="grid place-items-center min-h-screen">
                <div className="col-span-12 md:col-span-4">
                    <h1 className="text-3xl font-bold underline bg-green-500 text-black border mb-7 p-3">
                        Hello world!
                    </h1>
                    <div className="card bg-base-100 w-96 shadow-sm border p-3">
                        <figure>
                            <img
                                src="https://img.daisyui.com/images/stock/photo-1606107557195-0e29a4b5b4aa.webp"
                                alt="Shoes" />
                        </figure>
                        <div className="card-body py-3">
                            <h2 className="card-title font-bold">{cardTitle}</h2>
                            <p>A card component has a figure, a body part, and inside body there are title and actions parts</p>
                            <div className="card-actions justify-center mt-4">
                                <button className="px-6 py-2 border border-blue-600 text-blue-600 font-semibold rounded-lg 
                                hover:bg-blue-600 hover:text-white transition">{btn}</button>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </>
    )
}

export default Card