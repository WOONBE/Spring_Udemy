
import { useState } from 'react'
import {BrowserRouter, Route, Routes, useNavigate, useParams,Link} from 'react-router-dom'
export default function LoginComponent(){

    const [username, setUsername]= useState('in28minutes')

    const [passwowrd, setPassword]= useState('')
    const [showSuccessMessage, setshowSuccessMessage]= useState(false)

    const [showErrorMessage, setshowErrorMessage]= useState(false)

    const navigate = useNavigate()

    function handleUsernameChange(event){
        setUsername(event.target.value)
    }//react state와 연결


    function handlePasswordChange(event){
        setPassword(event.target.value)
    }//react state와 연결

    function handleSubmit(){
        if(username === 'in28minutes' && passwowrd ==='dummy'){
            setshowSuccessMessage(true)
            setshowErrorMessage(false)
            navigate(`/welcome/${username}`) //백틱 사용해야함
        }
        else{
            setshowSuccessMessage(false)
            setshowErrorMessage(true)
        }

        
    }

    return(
        <div className="Login">
            <h1>Time to Login</h1>
            {showSuccessMessage &&     <div className='successMessage'>Authenticated Successfully</div>}
            {showErrorMessage &&     < div className='errorMessage'>Authenticated failed. Please check your credential</div>}
            <div className="LoginForm">
                <div>
                    <label>User Name</label>
                    <input type="text" name="username" value={username} onChange={handleUsernameChange}/>
                </div>
                <div>
                    <label>Password</label>
                    <input type="password" name="password" value={passwowrd} onChange={handlePasswordChange}/>
                </div>
                <div>
                    <button type="button" name="login" onClick={handleSubmit}>Login</button>
                </div>

            </div>
        </div>


    )
}