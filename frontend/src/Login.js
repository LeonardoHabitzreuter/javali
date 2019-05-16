import React, { useState } from 'react'

const App = ({ login }) => {
    const [cpf, setCPF] = useState('')
    const [password, setPassword] = useState('')

  const submit = e => {
      e.preventDefault()
      login({ cpf, password })
  }

  return (
    <form className='w-50 mx-auto mt-5' onSubmit={submit}>
      <div className='form-group'>
        <label>Cpf</label>
        <input required className="form-control" value={cpf} onChange={e => setCPF(e.target.value)}/>
      </div>
      <br/>
      <div className='form-group'>
        <label>Senha</label>
        <input required type="password" className="form-control" value={password} onChange={e => setPassword(e.target.value)}/>
      </div>
        <br/>
        <button className="btn btn-primary">Logar</button>
    </form>
)
}

export default App