function guardar(){
    var basedatos=document.getElementById("estadosalud").value;
    var medicamentos=document.getElementById("medicamentos").value;
    if (basedatos=="") {
        alert("La informaion de su actividad de salud es obligatoria ingresarla");
        document.getElementById("estadosalud").focus();
    }else{
        if (medicamentos=="") {
            alert("La informaion de sus medicamentos es obligatoria ingresarla");
            document.getElementById("medicamentos").focus();
        }else{
            console.log(basedatos +" "+medicamentos);
            document.getElementById("estadosalud").value="";
            document.getElementById("medicamentos").value="";
            document.getElementById("estadosalud").focus();
        }
    }

function register() {
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;
    console.log("El usuario " + username + " se ha registrado con la contraseña " + password);
    document.getElementById("username").value = "";
    document.getElementById("password").value = "";
}
}