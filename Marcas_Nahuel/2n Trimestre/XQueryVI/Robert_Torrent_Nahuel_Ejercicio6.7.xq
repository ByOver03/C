(:Mostrar cuántos libros hay, y etiquetarlo con "total":)

for $libro in /bookstore
let $lib := count($libro/book)
return <total>{$lib}</total>