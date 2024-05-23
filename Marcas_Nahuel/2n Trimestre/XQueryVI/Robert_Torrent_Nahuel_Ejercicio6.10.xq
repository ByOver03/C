(:Mostrar el precio mínimo y máximo de los libros.:)
let $lib_max := max (/bookstore/book/price),
    $lib_min := min (/bookstore/book/price)
return <resultado><max>{$lib_max}</max><min>{$lib_min}</min></resultado>