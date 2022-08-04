 const frutas = [" banana", "pera", "maça"]

 console.log("acessando valore a  partir de indice");

 console.log(0, frutas[0])
 console.log(1, frutas[1])
 console.log(2, frutas[2])

 console.log(" Estrutura de repetição")

 frutas.forEach((item,indice)=> console.log(indice,item));

 let sacola= frutas.map((item,indice)=> console.log(indice,item))

