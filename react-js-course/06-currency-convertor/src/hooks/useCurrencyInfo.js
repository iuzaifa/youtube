import { useState, useEffect } from "react";


function useCurrencyInfo(){
    const {data, setData} = useState({})

    let apiUrl = `https://cdn.jsdelivr.net/gh/fawazahmed0/currency-api@1/latest/currencies/${currency}.json`

    useEffect(()=> {
        fetch(apiUrl)
        .then((res) => res.json )
        .then((res) => setData(res[currency]))
    }, [currency])
    
    return data
}


export default useCurrencyInfo;