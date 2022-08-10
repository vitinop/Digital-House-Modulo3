import Item from './Item';

export default function Lista(titulo, itens) {
    return (
        <section className="py-5">
            <h2 className="h5 mb-4">{titulo}</h2>
            <ul className="list-group" data-todo-target="list">
                <Item itens={itens[0]}/>
            </ul>
        </section>
    )
}