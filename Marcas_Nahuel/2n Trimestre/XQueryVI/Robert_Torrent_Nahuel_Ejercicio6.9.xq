(:Mostrar los títulos de los libros y al final una etiqueta con el número total de libros.
:)
let $libro:=count(/bookstore/book),
    $lib := (
        for $l in /bookstore/book/title
        return <titulo>{$l/text()}</titulo>
    )
return <resultado>{$lib}<total>{$libro}</total></resultado>