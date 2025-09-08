let nombre;
let edad;

function solicitarDatos() {
    nombre = prompt("Ingrese su nombre:");
    edad = parseInt(prompt("Ingrese su edad:"));
    if (nombre && !isNaN(edad)) {
        document.getElementById("saludo").innerText = `¡Hola, ${nombre}! Tienes ${edad} años.`;
    } else {
        document.getElementById("saludo").innerText = "Por favor, ingrese datos válidos.";
    }
}

function mostrarHobbies() {
    let hobbies = ["leer", "correr", "nadar", "programar", "dormir"];
    let lista = document.getElementById("listaHobbies");
    lista.innerHTML = "";
    hobbies.forEach(function(hobby) {
        let li = document.createElement("li");
        li.textContent = hobby;
        lista.appendChild(li);
    });
}

function cambiarFondo() {
    const colores = ["#f8b400", "#6a2c70", "#b83b5e", "#0bceaf", "#f38181"];
    document.body.style.backgroundColor = colores[Math.floor(Math.random() * colores.length)];
}

