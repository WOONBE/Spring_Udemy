import { createContext, useContext, useState } from "react";

//1: Create a Context
export const AuthContext = createContext()

//추가
export const useAuth = () => useContext(AuthContext)

//2: Share the created context with other components
export default function AuthProvider({ children }) {

    //Put some state in the context
    const [number, setNumber] = useState(10)
    //10초마다 number 확인
    setInterval( () => setNumber(number+1), 10000)

    return (
        <AuthContext.Provider value={ {number} }>
            {children}
        </AuthContext.Provider>
    )
} 
