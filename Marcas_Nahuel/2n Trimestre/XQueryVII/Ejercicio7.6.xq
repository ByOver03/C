(:Mostrar los nombres de los profesores y la sala en la que dan clase, ordénalos por sala:)
for $baile in /bailes/baile
order by $baile/sala
return 
   <baile>
      {$baile/profesor}
      {$baile/sala}
   </baile>