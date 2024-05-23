(:Mostrar todos los años en los que se ha publicado un libro eliminando los repetidos. Etiquétalos con "año":)
for $ano in distinct-values(/bookstore/book/year)
return <ano>{$ano}</ano>