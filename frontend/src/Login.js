import React, { useState } from 'react'

const App = ({ login }) => {
    const [cpf, setCPF] = useState('')
    const [password, setPassword] = useState('')

  const submit = e => {
      e.preventDefault()
      login({ cpf, password })
  }

  return (
    <form onSubmit={submit}>
        <label>Cpf</label>
        <input required value={cpf} onChange={e => setCPF(e.target.value)}/>
        <br/>
        <label>Senha</label>
        <input required type="password" value={password} onChange={e => setPassword(e.target.value)}/>
        <br/>
        <button className="btn btn-primary">Logar</button>
    </form>
)
}

export default App