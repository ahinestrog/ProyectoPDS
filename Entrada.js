class Entrada{
    constructor(){
        
    }
}


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
}

function register(){
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;
    if (username=="") {
        alert("La informaion de su actividad de su usuario es obligatoria ingresarla");
        document.getElementById("username").focus();
    }else{
        if (password=="") {
            alert("La informaion de su contraseña es obligatoria ingresarla");
            document.getElementById("password").focus();
        }else{
            console.log(username +" "+password);
            document.getElementById("username").value="";
            document.getElementById("password").value="";
            document.getElementById("username").focus();
        }
    }
}

function EstadoAnimo(){
    var EstadoAnimo=document.getElementById("EstadoAnimo").value;
    if (EstadoAnimo=="") {
        alert("La informaion de su estado de ánimo es obligatoria ingresarla");
        document.getElementById("EstadoAnimo").focus();
    }else{
            console.log(EstadoAnimo);
            document.getElementById("EstadoAnimo").value="";
            document.getElementById("EstadoAnimo").focus(); 
        }
}

function PadecimientosU(){
    var Entrada=document.getElementById("PadecimientosU").value;
    if (PadecimientosU=="") {
        alert("La informaion de sus padecimientos es obligatoria ingresarla");
        document.getElementById("PadecimientosU").focus();
    }else{
            console.log(Entrada);
            document.getElementById("PadecimientosU").value="";
            document.getElementById("PadecimientosU").focus(); 
        }
}

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
}

function Comidas(){
    var Comidas=document.getElementById("Comidas").value;
    if (Comidas=="") {
        alert("La informaion de sus comidas es obligatoria ingresarla");
        document.getElementById("Comidas").focus();
    }else{
            console.log(Comidas);
            document.getElementById("Comidas").value="";
            document.getElementById("Comidas").focus(); 
        }
}

function mpdc(){
    var mpdc=document.getElementById("mpdc").value;
    if (mpdc=="") {
        alert("La informaion de sus medicamentos pendientes de compra es obligatoria ingresarla");
        document.getElementById("mpdc").focus();
    }else{
            console.log(Comidas);
            document.getElementById("mpdc").value="";
            document.getElementById("mpdc").focus(); 
        }
}




