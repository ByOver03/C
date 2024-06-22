//Seleccionar los elementos del DOM
//querySelector
const contenedor = document.querySelector('.contenedor');
const asientos = document.querySelectorAll('.fila .asiento:not(.ocupado)');
const contador = document.getElementById('count');
const total = document.getElementById('total');
const peliculaSelect = document.getElementById('pelicula');
let precioTicket = +peliculaSelect.value;

contenedor.addEventListener('click', (e) => {
    e.target.classList.toggle('seleccionado');
});

