import React from 'react'
import Login from './Login'
import Axios from 'axios'

const login = (data) => {
  Axios.post('http://localhost:8080/login', data).then(console.log).catch(console.error)
}

const App = () => (
  <Login login={login} />
)

export default App