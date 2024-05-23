(:Mostrar los años de publicación, primero con "for" y luego con "let" para comprobar la diferencia entre ellos. Etiquetar la salida con "publicacion".:)
let $libro := /bookstore/book
return <publicacion>{$libro/year}</publicacion>