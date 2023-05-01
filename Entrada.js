
const formulario = document.querySelector("#formulario")

// Se crea el JSON para almacenar los usuarios.
const estadossaludJSON = {
  estadossalud: []
}

formulario.addEventListener("submit", (e) => {
  e.preventDefault()

  const estadosalud = {
    saludhoy: formulario.elements['estadossalud'].value,
  }

  estadossaludJSON.estadossalud.push(estadosalud)

  alert("registrado con éxito la actividad de salud")
  console.log(estadossaludJSON.estadossalud);
});

window.addEventListener("beforeunload", function() {
  // Guardar el JSON de manera local (en el navegador) para que aún si se cierra la ventana los usuarios queden guardados.
  const estadossaludActualizadosJSON = JSON.stringify(estadossaludJSON)
  localStorage.setItem("estadossalud", estadossaludActualizadosJSON)
});

const formulario2 = document.querySelector("#formulario")

// Se crea el JSON para almacenar los usuarios.
const estadosanimoJSON = {
  estadosanimo: []
}

formulario2.addEventListener("submit", (e) => {
  e.preventDefault()

  const estadoanimo = {
    animohoy: formulario.elements['animohoy'].value,
  }

  estadosanimoJSON.estadosanimo.push(estadoanimo)

  alert("registrado con éxito la actividad de salud")
  console.log(estadosanimoJSON.estadosanimo);
});

window.addEventListener("beforeunload", function() {
  // Guardar el JSON de manera local (en el navegador) para que aún si se cierra la ventana los usuarios queden guardados.
  const estadosanimoActualizadosJSON = JSON.stringify(estadosanimoJSON)
  localStorage.setItem("estadosanimo", estadosanimoActualizadosJSON)
});


const formulario3 = document.querySelector("#formulario")

// Se crea el JSON para almacenar los usuarios.
const PadecimientosUJSON = {
  PadecimientosU: []
}

formulario3.addEventListener("submit", (e) => {
  e.preventDefault()

  const PadecimientoU = {
    Padecimientos: formulario.elements['Padecimientos'].value,
  }

  PadecimientosUJSON.PadecimientosU.push(PadecimientoU) 

  alert("registrado con éxito la actividad de salud")
  console.log(PadecimientosUJSON.PadecimientosU);
});

window.addEventListener("beforeunload", function() {
  // Guardar el JSON de manera local (en el navegador) para que aún si se cierra la ventana los usuarios queden guardados.
  const PadecimientosUActualizadosJSON = JSON.stringify(PadecimientosUJSON)
  localStorage.setItem("PadecimientosU", PadecimientosUActualizadosJSON)
});


const formulario4 = document.querySelector("#formulario")

// Se crea el JSON para almacenar los usuarios.
const comidasJSON = {
  comidas: []
}

formulario4.addEventListener("submit", (e) => {
  e.preventDefault()

  const  comida = {
    animohoy: formulario.elements['comida'].value,
  }

  comidasJSON.comidas.push(comida)

  alert("registrado con éxito la actividad de salud")
  console.log(comidasJSON.comidas);
});

window.addEventListener("beforeunload", function() {
  // Guardar el JSON de manera local (en el navegador) para que aún si se cierra la ventana los usuarios queden guardados.
  const comidasActualizadosJSON = JSON.stringify(comidasJSON)
  localStorage.setItem("comidas", comidasActualizadosJSON)
});


const formulario5 = document.querySelector("#formulario")

// Se crea el JSON para almacenar los usuarios.
const mpdcJSON = {
  mdpc: []
}

formulario5.addEventListener("submit", (e) => {
  e.preventDefault()

  const mdp = {
    medicamentos: formulario.elements['Medicamentos pendientes'].value,
  }

  mpdcJSON.mpdc.push(mdp)

  alert("registrado con éxito la actividad de salud")
  console.log(mpdcJSON.mdpc);
});

window.addEventListener("beforeunload", function() {
  // Guardar el JSON de manera local (en el navegador) para que aún si se cierra la ventana los usuarios queden guardados.
  const mpdcActualizadosJSON = JSON.stringify(mpdcJSON)
  localStorage.setItem("medicamentosCompra", mpdcActualizadosJSON)
});




