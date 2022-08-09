let produtos = {
  id:1,
  nome: 'leite',
  preco:7
}

console.log(" Acessando valores a partir da chave");

console.log ("id" , produtos ['id']);
console.log ("nome" , produtos ['nome']);
console.log ("preco" , produtos ['preco']);

console.log (produtos.id);
console.log (produtos.nome);
console.log (produtos.preco);

console.log("Estrutura de repetição");

for (let chave in produtos){
  console.log (chave,produtos[chave])
}