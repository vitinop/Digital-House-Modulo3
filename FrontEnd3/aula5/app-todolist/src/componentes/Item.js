export default function Item({ item }) {

    const { id, nome } = item;

    return (
        <li className="list-group-item">
            {id} - {nome}
        </li>
    )
}