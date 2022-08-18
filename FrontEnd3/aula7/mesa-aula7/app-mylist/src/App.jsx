import MinhaLista from "./componentes/MinhaLista"

export default function App() {

	const produtos = [
		{
			id: 1,
			nome: "Banana",
			preco: 5.40
		},
		{
			id: 2,
			nome: "Uva",
			preco: 12
		},
		{
			id: 3,
			nome: "Morango",
			preco: 10
		},
		{
			id: 4,
			nome: "Abacate",
			preco: 8.42
		},
		{
			id: 5,
			nome: "Côco",
			preco: 2.70
		},
		{
			id: 6,
			nome: "Maçã",
			preco: 3.8
		},
		{
			id: 7,
			nome: "Açaí",
			preco: 18
		},
		{
			id: 8,
			nome: "Pêra",
			preco: 5.31
		},
		{
			id: 9,
			nome: "Mamão",
			preco: 2.10
		},
		{
			id: 10,
			nome: "Pêssego",
			preco: 5.31
		}
	]


	return (
		<MinhaLista produtos={produtos} />
	)
}