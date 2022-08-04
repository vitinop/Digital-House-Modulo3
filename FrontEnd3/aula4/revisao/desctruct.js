const frutas = [" banana", "pera", "maça"];

const itemA = frutas[0];
const itemB = frutas[1];
const itemC = frutas[2];

console.log(itemA,itemB,itemC)

console.log("Destruction Array");
const [item1,item2,item3] =frutas;
console.log(item1,item2,item3);

console.log("Destruction de Objeto Literal");

let produtos = {
  id:1,
  nome: 'leite',
  preco:7
}

const {id,nome,preco} = produtos
console.log(id,nome,preco)