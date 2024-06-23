import { useState } from 'react'
import {BrowserRouter, Route, Routes, useNavigate, useParams,Link} from 'react-router-dom'
import './TodoApp.css'
import LogoutComponent from './LogoutComponent'
import FooterComponent from './FooterComponent'
import WelcomeComponent from './WelcomeComponent'
import ErrorComponent from './ErrorComponent'
import ListTodosComponent from './ListTodosComponent'
import HeaderComponent from './HeaderComponent'
import LoginComponent from './LoginComponent'
import AuthProvider from './security/AuthContext'
export default function TodoApp(){


    return( 
        <div className="TodoApp">
            <AuthProvider>
            <BrowserRouter>
            <HeaderComponent/>
            <Routes>
                <Route path='/login' element={<LoginComponent/>}/>
                <Route path='/welcome/:username' element={<WelcomeComponent/>}/>
                <Route path='/todos' element={<ListTodosComponent/>}/>
                <Route path='/logout' element={<LogoutComponent/>}/>


                <Route path='*' element={<ErrorComponent/>}/>

            </Routes>
            
            </BrowserRouter>
            <FooterComponent/>
            </AuthProvider>

            
        
        </div>
    )
}












