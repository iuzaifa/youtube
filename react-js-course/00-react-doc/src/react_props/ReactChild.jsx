import * as React from 'react';

// ({ username ,profile }) OR (props)

const ReactChild = ({ username, profile }) => {
    // console.log(props.userDetails)

    return (

        <>
            <div className="card bg-base-100 w-96 m-10">
                <div className="card-body">


                    {/* (props) call */}
                    {/* <p>Name : {props.profile.name} </p>
                    <p>Phone : {props.profile.phone}</p>
                    <p>Email : {props.profile.email}</p>
                    <p>Current Address : {props.profile.address}</p> */}


                    {/* Object calll (profile)  */}
                    <p>Name : {profile.name} </p>
                    <p>Phone : {profile.phone}</p>
                    <p>Email : {profile.email}</p>
                    <p>Current Address : {profile.address}</p>

                    <div className="card-actions m-5">
                        <button className="hover:bg-purple-300 active:bg-purple-400 transition bg-purple-200 font-bold rounded-sm py-2 px-3 text-purple-800 on">Call Now</button>
                    </div>
                </div>
            </div>

        </>


    )
}

export default ReactChild