(:Mostrar los nombres de los bailes cuyo precio sea mayor de 30:)
for $baile in /bailes/baile
where $baile/precio > 30
return $baile/nombre