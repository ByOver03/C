(:Mostrar el título y el número de caracteres que tiene cada título, cada uno con su propia etiqueta:)
for $libro in /bookstore/book
return 
  <libro>
    {$libro/title}
    <length>{string-length($libro/title)}</length>
  </libro>