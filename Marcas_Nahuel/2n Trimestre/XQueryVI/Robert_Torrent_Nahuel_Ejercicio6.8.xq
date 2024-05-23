(:Mostrar los títulos de los libros y al final una etiqueta con el número total de libros:)
let $libro := count (/bookstore/book)
return <total>{$libro}</total>