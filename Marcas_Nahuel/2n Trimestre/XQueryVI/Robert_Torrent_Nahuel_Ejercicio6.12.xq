(:Mostrar la suma total de los precios de los libros con la etiqueta "total".:)
let $libro := /bookstore/book
return <total>{sum($libro/price)}</total>