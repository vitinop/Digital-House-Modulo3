function MyTask() {
  return (
    <div className="row g-3">
      <div className="col">
        <section className="py-5">
          <h2 className="h5 mb-4">My tasks</h2>
          <ul className="list-group" data-todo-target="list">
            <div className="alert alert-success" role="alert">
              <h2 className="h6 m-0">There are no tasks! 🙌🎉</h2>
            </div>
          </ul>
        </section>
      </div>
    </div>
  );
}
export default MyTask;
