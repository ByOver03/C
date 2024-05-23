(:Mostrar el título del libro, su precio y su precio con el IVA incluido, cada uno con su propia etiqueta. Ordénalos por precio con IVA.:)
for $libro in /bookstore/book
let $iva := ($libro/prive*1.21) order by $iva
return <libro>
  <titulo>{$libro/title/text()}</titulo>
  <precio>{$libro/price/text()}</precio>
  <precio_iva>{$iva}€</precio_iva>
  </libro>