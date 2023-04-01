//* html

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>HISTORIAL</title>
    <link rel="stylesheet" href="index.css">
    <meta charset="uft-8">
</head>
<body>
    <header>
        <div class="contenedor">
            <p class="logo">Historial</p>
            <nav>
                <a href="#">Menú</a>
                <a href="#">Home</a>
                <a href="#">Soporte</a>
            </nav>
        </div>
    </header>
    
    <section id="hero">
        <h1>¿Por qué es importante llevar un registro de salud?</h1>
        <button>Informate aquí </button>
    </section>

    <link rel="stylesheet" href="index.css">
  </head>
  <body>
    <h1>Registro de usuario</h1>
    <form>
      <label for="username">Nombre de usuario:</label>
      <input type="text" id="username" name="username" required>
      <label for="password">Contraseña:</label>
      <input type="password" id="password" name="password" required>
      <button type="button" onclick="register()">Registrarse</button>
    </form>
    <script src="Base datos.js"></script>
    
    <section id="Historial"></section>
        <div class="contenedor">

        <div class="img-contenedor"></div>
            <h2>Sobre su salud</h2>
            <p>En estos apartados el paciente podrá consignar su actividad de salud a diario, sobre como se ha sentido, si ha tenido un malestar, si ha tomado una pastilla o medicamento de cualquier tipo, si este realmente le funciono o no, también a su vez con base a la información acerca de la actividad de salud consignada por el usuario, el aplicativo o versión web generara un reporte semanal con todas las fluctuaciones de la semana, la cual puede ser descargada o enviada al médico, si así el paciente lo quiere. También podrá llevar el registro de los medicamentos que no puede tomar o que con base a su historial en un pasado o no le han servido de absolutamente nada, o incluso que pueda llegar a ser nocivo para su salud.</p>
        </div>
    </section>

        <section id="Sobre-Su-Salud">
            <div class="contenedor">
            <div class="carta">
            <h3>Su actividad de salud</h3>
            <p>En estos apartados el paciente podrá consignar su actividad de salud a diario, sobre cómo se ha sentido, si ha tenido un malestar, si ha tomado una pastilla o medicamento de cualquier tipo, si este realmente le funciono o no. Y demás cosas referentes a su salud.</p>
            <form>
                <input type="text" name="estadosalud" id="estadosalud" placeholder="Digite su estado de salud el dia de hoy" size="100"><br>
                <input type="text" name="medicamentos" id="medicamentos" placeholder="Digite los medicamentos que consumio el dia de hoy" size="100"><br>
                <button type="button" onclick="guardar()">Guardar</button>
            </form>

        <br>   
        <br>
        <script type="text/JAVASCRIPT" src="Base datos.js"></script>
        <button>Aquí</button>
        
        </div>
        <div class="carta">
            <h3>Reporte semanal</h3>
            <p>En este apartado semanalmente el sistema generara para el usuario un reporte, sobre como se ha sentido en la semana y que de esa forma el doctor lo pueda visualizar.</p>
            <button>Aquí</button>
        </div>
        <div class="carta">
            <h3>Medicamentos</h3>
            <p> En este apartado estarán consignados los medicamentos que para el paciente no están permitidos, ya sea porque le perjudican o no están autorizados.</p>
            <button>Aquí</button>
        </div>
    </div>
</section>


<div class="img-contenedor"></div>
            <h2>Control de salud</h2>
            <p>En estos apartados el doctor podrá interactuar directamente con el paciente, recetándole e indicándole, lo que debe y no debe tomar, y las demás recomendaciones del doctor.</p>
        </div>
    </section>

        <section id="control-salud">
            <div class="contenedor">
            <div class="cartaa">
            <h3>Indicaciones medicas</h3>
            <p>Aquí el medico instruye el paciente para que tenga en cuenta durante el tiempo de algún tratamiento o medicamentos, las cosas que debe tomar en cuenta. Y demás.</p>
            <button>Aquí</button>
        </div>
        <div class="cartaa">
            <h3>Medicamentos</h3>
            <p>Aquí estarán consignados lo medicamentos recetados por el doctor.</p>
            <button>Aquí</button>
        </div>
        <div class="cartaa">
            <h3>Reporte para doctor</h3>
            <p>En este medio podrá ser enviado el reporte al doctor, ya sea el reporte semanal y mensual al doctor, para que pueda hacer una valoración.</p>
            <button>Aquí</button>
        </div>
    </div>
</section>

<div class="img-contenedor"></div>
            <h2>Herramientas saludables</h2>
            <p>En estos apartados se encontrarán diferentes herramientas y utilidades de la web, a manera que la experiencia del paciente sea mas enriquecedora, pudiendo completar información y elementos que considere importantes. O que en dado caso lo necesite.</p>
        </div>
    </section>

        <section id="Herramientas-1">
            <div class="contenedor">
            <div class="cartaaa">
            <h3>Padre de familia</h3>
            <p>En este apartado los usuarios o personas padres de familia que tengan hijos, podrán monitorizar y vigilar la actividad medica de sus hijos, indicándoles los medicamentos que deben y no deben consumir, por ejemplo.</p>
            <button>Aquí</button>
        </div>
        <div class="cartaaa">
            <h3>Medicamentos comunes</h3>
            <p>Aquí se encontrará información básica de medicamentos comunes, que el cliente pueda requerir.</p>
            <button>Aquí</button>
        </div>
        <div class="cartaaa">
            <h3>Por comprar</h3>
            <p>Aquí estarán los medicamentos que el cliente pueda estar requiriendo, ya sea porque se están acabando o porque han sido recetados por el doctor, y todavía no los ha comprado. Con su nivel de urgencia, cada uno.</p>
            <button>Aquí</button>
        </div>
        <div class="cartaaa">
            <h3>Información adicional</h3>
            <p>Aquí estará la información adicional a la médica, que el paciente ingrese, que puede ser de utilidad para el usuario y para el médico. </p>
            <button>Aquí</button>
    </div>
</section>
      
</body>
</html>

//* css

*{
    box-sizing: border-box;
}

html{
    scroll-behavior: smooth;
}

body{
    font-family: 'Roboto', sans-serif;
    margin: 0;
}

h1{ font-size: 3.5em;}
h2{ font-size: 2.7em;}
h3{ font-size: 2em;}
p{ font-size: 1.25em;}
ul{ list-style: none;}
li{ font-size: 1.25em;}

button{
    font-size: 1.25em;
    font-weight: bold;
    padding: 10px 30px;
    border-radius: 5px;
    border: 2px solid rgba(0,0,0,0.3);
    box-shadow: 2px 2px 10px rgba(0,0,0,0.5);
    color: white;
    background-color: blueviolet;
}

button:hover{
    background-color: rgb(101, 33, 165);
}

.container{
    max-width: 1400px;
    margin: auto;
}

.color-acento{ color:blueviolet; }

header{
    background-color: rgb(245,245,245);
    
}

header .logo{
    margin: 0;
    padding: 25px 30px;
    font-weight: bold;
    color: blueviolet;
    font-size: 1.6em;
}

header .container{
    display: flex;
    flex-direction: column;
    align-items: center;
}

header nav{
    display: flex;
    flex-direction: column;
    text-align: center;
    padding-bottom: 25px;
}

header a{
    padding: 5px 12px;
    text-decoration: none;
    font-weight: bold;
    color: black;
}

header a:hover{
    color: blueviolet;
}

#hero{
    display: flex;
    align-items: center;
    justify-content: center;
    text-align: center;
    flex-direction: column;
    height: 90vh;
    background-image: linear-gradient(
        0deg,
        rgba(0,0,0,0.5),
        rgba(0,0,0,0.5)
    )
    ,url("imagenes/Historial-clinico.jpg");
    background-repeat: no-repeat;
    background-size: cover;
    background-position: center center;
}

#hero h1{
    color: white;
}

#hero button{
    font-size: 1.75em;
}

body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
  }
  
  h1 {
    margin: 0 0 20px 0;
    
  }
  
  form {
    width: 400px;
    margin: 0 auto;
  }
  
  label {
    display: block;
    margin-bottom: 10px;
  }
  
  input {
    display: block;
    width: 100%;
    padding: 10px;
    margin-bottom: 20px;
    box-sizing: border-box;
    border-radius: 5px;
    border: 1px solid #ccc;
  }
  
  button {
    background-color: #4CAF50;
    color: white;
    padding: 10px 20px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
  }
  
  button:hover {
    background-color: #3e8e41;
  }

#Historial .container{
    text-align: center;
    padding: 200px 12px;
}

#Sobre-Su-Salud{
    background-color: rgb(30,30,30);
    color: white;
    text-align: center;
}

#Sobre-Su-Salud .container{
    padding: 150px 12px;
}

#Sobre-Su-Salud h2{
    margin-top: 5;
    font-size: 3.2em;
}

#Sobre-Su-Salud p{
    display: none;
}

#Sobre-Su-Salud .carta{
    background-position: center center;
    background-size: cover;
    padding: 50px 0px;
    margin: 30px;
    border-radius: 15px;
}

.carta:first-child{
    background-image: linear-gradient(
        0deg,
        rgba(0,0,0,0.5),
        rgba(0,0,0,0.5)
    )
    ,url("imagenes/suactividadsalud.jpeg");

}

.carta:nth-child(2){
    background-image: linear-gradient(
        0deg,
        rgba(0,0,0,0.5),
        rgba(0,0,0,0.5)
    )
    ,url("imagenes/controlsalud.jpeg");
}

.carta:nth-child(3){
    background-image: linear-gradient(
        0deg,
        rgba(0,0,0,0.5),
        rgba(0,0,0,0.5)
    )
    ,url("imagenes/medicamentos.jpeg");

}

#control-salud{
    background-color: rgb(30,30,30);
    color: white;
    text-align: center;
}

#control-salud .container{
    padding: 150px 12px;
}

#control-salud h2{
    margin-top: 0;
    font-size: 3.2em;
}

#control-salud p1{
    display: none;
}

#control-salud .cartaa{
    background-position: center center;
    background-size: cover;
    padding: 50px 0px;
    margin: 30px;
    border-radius: 15px;
}

.cartaa:first-child{
    background-image: linear-gradient(
        0deg,
        rgba(0,0,0,0.5),
        rgba(0,0,0,0.5)
    )
    ,url("imagenes/instruccionmedica.jpeg");

}

.cartaa:nth-child(2){
    background-image: linear-gradient(
        0deg,
        rgba(0,0,0,0.5),
        rgba(0,0,0,0.5)
    )
    ,url("imagenes/medicamentos.jpeg");
}

.cartaa:nth-child(3){
    background-image: linear-gradient(
        0deg,
        rgba(0,0,0,0.5),
        rgba(0,0,0,0.5)
    )
    ,url("imagenes/doctorreporte.jpg");

}

#Herramientas-1{
    background-color: rgb(30,30,30);
    color: white;
    text-align: center;
}

#Herramientas-1 .container{
    padding: 150px 12px;
}

#Herramientas-1 h2{
    margin-top: 0;
    font-size: 3.2em;
}

#Herramientas-1 p1{
    display: none;
}

#Herramientas-1 .cartaaa{
    background-position: center center;
    background-size: cover;
    padding: 50px 0px;
    margin: 30px;
    border-radius: 15px;
}

.cartaaa:first-child{
    background-image: linear-gradient(
        0deg,
        rgba(0,0,0,0.5),
        rgba(0,0,0,0.5)
    )
    ,url("imagenes/padres.jpeg");

}

.cartaaa:nth-child(2){
    background-image: linear-gradient(
        0deg,
        rgba(0,0,0,0.5),
        rgba(0,0,0,0.5)
    )
    ,url("imagenes/medicamentos.jpeg");
}

.cartaaa:nth-child(3){
    background-image: linear-gradient(
        0deg,
        rgba(0,0,0,0.5),
        rgba(0,0,0,0.5)
    )
    ,url("imagenes/porcomprar.jpeg");

}

.cartaaa:nth-child(4){
    background-image: linear-gradient(
        0deg,
        rgba(0,0,0,0.5),
        rgba(0,0,0,0.5)
    )
    ,url("imagenes/informacionadicional.jpeg");

}

#caracteristicas .container{
    text-align: center;
    padding: 250px 12px;
}

#caracteristicas li{
    margin: 16px 0px;
    font-weight: bold;
}

#final{
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    text-align: center;
    background-color: rgb(30,30,30);
    color: white;
    height: 80vh;
}

#final h2{
    font-size: 9vw;
}

#final button{
    font-size: 5vw;
}

footer{
    background-color: rgb(230,230,230);
}

footer p{
    margin: 0;
    padding: 12px;
    color: rgb(100,100,100);
}

footer .container{
    height: 150px;
    display: flex;
    justify-content: center;
    align-items: flex-end;
}

@media (min-width: 850px){
    header{
        position: fixed;
        width: 100%;
    }

    header .container{
        flex-direction: row;
        justify-content: space-between;
    }

    header nav{
        flex-direction: row;
        padding-bottom: 0;
        padding-right: 20px;
    }

    #hero h1{
        font-size: 5em;
    }

    #somos-proya .container{
        display: flex;
        justify-content: space-evenly;
    }

    #somos-proya .texto{
        width: 50%;
        max-width: 600px;
        text-align: initial;
        padding-left: 30px;
        display: flex;
        flex-direction: column;
        justify-content: center;
    }

    #somos-proya h2{
        margin-top: 0px;
    }

    #Sobre-Su-Salud .img-container{
        background-image: url("media/somos-proya.jpg");
        background-size: cover;
        background-position: center center;
        height: 500px;
        width: 400px; 
    }

    #Sobre-Su-Salud .programas{
        display: flex;
        justify-content: center;
    }

    #Sobre-Su-Salud p{
        display: block;
        margin-bottom: 30px;
    }

    #Sobre-Su-Salud h2{
        font-size: 4em;
    }

    #Sobre-su-salud h3{
        margin-top: 0;
    }

    #Sobre-su-salud .carta1{
        padding: 50px;
        background-size: 100% 150px;
        background-repeat: no-repeat;
        background-position-y: 0;
        background-color: rgba(50, 50, 50, 1);
        box-shadow: 2px 2px 10px rgba(0,0,0,0.5);
    }

    .carta1:first-child{
        background-image: linear-gradient(
            0deg,
            rgba(0,0,0,0.5),
            rgba(0,0,0,0.5)
        )
        ,url("media/front-end-cropped.jpg");

    }

    .carta1:nth-child(2){
        background-image: linear-gradient(
            0deg,
            rgba(0,0,0,0.5),
            rgba(0,0,0,0.5)
        )
        ,url("media/full-stack-cropped.jpg");
    }

    .carta1:nth-child(3){
        background-image: linear-gradient(
            0deg,
            rgba(0,0,0,0.5),
            rgba(0,0,0,0.5)
        )
        ,url("media/python-cropped.jpg");

    }

    #caracteristicas{
        background-image: url("media/background-2.jpeg");
        background-repeat: no-repeat;
        background-size: 500px 400px;
        background-position: calc(100vw - 500px) 120px;
    }

    #caracteristicas .container{
        text-align: initial;
    }

    #caracteristicas ul{
        margin-left: 100px;
    }

    #final h2{
        font-size: 5em;
    }

    #final button{
        font-size: 2em;
    }

    footer .container{
        justify-content: flex-end;
    }
}

@media (min-width: 1200px) {
    #caracteristicas{
        background-position-x: calc(100vw - 800px);
    }
}


//* javascript

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
