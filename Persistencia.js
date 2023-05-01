const formulario = document.querySelector("#formulario")

// Se crea el JSON para almacenar los usuarios.
const usuariosJSON = {
  usuarios: []
}

formulario.addEventListener("submit", (e) => {
  e.preventDefault()

  const usuario = {
    nombre: formulario.elements['username'].value,
    pass: formulario.elements['password'].value,
  }

  usuariosJSON.usuarios.push(usuario)

  alert("Usuario registrado con éxito.")
  console.log(usuariosJSON.usuarios);
});

window.addEventListener("beforeunload", function() {
  // Guardar el JSON de manera local (en el navegador) para que aún si se cierra la ventana los usuarios queden guardados.
  const usuariosActualizadosJSON = JSON.stringify(usuariosJSON)
  localStorage.setItem("usuarios", usuariosActualizadosJSON)
});


const formulario2 = document.querySelector("#formulario")

// Se crea el JSON para almacenar los usuarios.
const MedicamentosDJSON = {
  MedicamentosD: []
}

formulario2.addEventListener("submit", (e) => {
  e.preventDefault()

  const Medicamento = {
    medicamentosDoctor: formulario.elements['Medicamentos D'].value,
  }

  MedicamentosDJSON.MedicamentosD.push(Medicamento)

  alert("Usuario registrado con éxito.")
  console.log(MedicamentosDJSON.MedicamentosD);
});

window.addEventListener("beforeunload", function() {
  // Guardar el JSON de manera local (en el navegador) para que aún si se cierra la ventana los usuarios queden guardados.
  const MedicamentosDActualizadosJSON = JSON.stringify(MedicamentosDJSON)
  localStorage.setItem("uMedicamentosD", MedicamentosDActualizadosJSON)
});

const formulario3 = document.querySelector("#formulario")

// Se crea el JSON para almacenar los usuarios.
const MedicamentosNoJSON = {
  MedicamentosNo: []
}

formulario3.addEventListener("submit", (e) => {
  e.preventDefault()

  const MedicamentoNo = {
    NoMedicamentos: formulario.elements['MedicamentosNo'].value,
  }

  MedicamentosNoJSON.MedicamentosNo.push(MedicamentoNo)

  alert("Usuario registrado con éxito.")
  console.log(MedicamentosNoJSON.MedicamentosNo);
});

window.addEventListener("beforeunload", function() {
  // Guardar el JSON de manera local (en el navegador) para que aún si se cierra la ventana los usuarios queden guardados.
  const MedicamentosNoActualizadosJSON = JSON.stringify(MedicamentosNoJSON)
  localStorage.setItem("MedicamentosNo", MedicamentosNoActualizadosJSON)
});


