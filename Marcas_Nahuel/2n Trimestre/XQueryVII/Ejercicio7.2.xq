(:Mostrar los nombres de los bailes seguidos con el número de plazas entre paréntesis, ambos dentro de la misma etiqueta "losbailes":)
for $baile in /bailes/baile
return <losbailes>{$baile/nombre/text()} ({$baile/plazas/text()})</losbailes>