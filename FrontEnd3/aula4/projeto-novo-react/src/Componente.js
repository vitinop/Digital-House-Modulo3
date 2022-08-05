// Forma 1
// function Componente(props) {
//   console.log(props.titulo);
//   return (
//   <h1>Componente</h1>
//   )
// }



//forma2
function Componente({ titulo, descricao }) {
  // console.log(titulo);
  return (
  <div>
    
    <h1>{titulo}</h1>
    <h2>{descricao}</h2>

  </div>
  )
}
export default Componente;
