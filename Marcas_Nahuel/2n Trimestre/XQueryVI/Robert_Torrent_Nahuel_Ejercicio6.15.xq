(:Mostrar en la misma etiqueta el título y entre paréntesis el número de autores que tiene ese título.:)
for $libro in /bookstore/book
return <libro>{$libro/title/text()} ({count($libro/author)})</libro>