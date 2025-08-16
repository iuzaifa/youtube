
import React from 'react'
import ReactChild from './ReactChild'

const ReactParent = () => {

    let data ={
        name: "Abu Huzaifa",
        phone: "98765432",
        email: "abuhuzaifa@test.com",
        address: "Delhi, New Delhi, India"
    }

    return (
        <>
            <ReactChild username="Abu Huzaifa" profile={data} />
        </>
    )
}

export default ReactParent