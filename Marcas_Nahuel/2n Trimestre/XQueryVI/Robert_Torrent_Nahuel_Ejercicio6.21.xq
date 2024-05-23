(:Mostrar los títulos en una tabla de HTML:)
<table>
{
  for $libro in /bookstore/book
  return 
    <tr>
      <td>{$libro/title/text()}</td>
    </tr>
}
</table>