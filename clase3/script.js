let estuadinte1 = {
    nombre: "Ana",
    edad: 20,
    notas: [10, 8, 9],
}

let estudiante2 = {
    nombre: "Luis",
    edad: 22,
    notas: [7, 6, 8],
}

let estudiante3 = {
    nombre: "Maria",
    edad: 21,
    notas: [9, 9, 10],
}

let estudiantes = [estuadinte1, estudiante2, estudiante3];

function calcularPromedio(notas){
    let suma = 0;
    for(let i = 0; i < notas.length; i++){
        suma += notas[i];
    }
    return suma / notas.length;
}

function mostrarEstudiantes(estudiantes){
    let promedio = calcularPromedio(estudiantes[0].notas);
    console.log("Nombre: " + estudiantes[0].nombre);
    console.log("Edad: " + estudiantes[0].edad);
    console.log("Notas: " + estudiantes[0].notas);
    console.log("El promedio de " + estudiantes[0].nombre + " es: " + promedio);
    console.log("-----------------------");
}

for (let i = 0; i < estudiantes.length; i++){
    mostrarEstudiantes([estudiantes[i]]);
}