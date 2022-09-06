import { useEffect, useState } from "react";

export default function App() {
  const [posts, definirPosts] = useState([]);
  const [comentarios, definirComentarios] = useState([]);
  const [perfil, definirPerfil] = useState([]);

  useEffect(() => {
    fetch("http://localhost:3000/posts")
      .then((response) => response.json())
      .then((json) => definirPosts(json));

    fetch("http://localhost:3000/comments")
      .then((response) => response.json())
      .then((json) => definirComentarios(json));

    fetch("http://localhost:3000/profile")
      .then((response) => response.json())
      .then((json) => definirPerfil([json]));
  

    /* 
	
			Adicione a comunicação 
			com servidor aqui...

			Endpoint

			GET http://localhost:3000/posts

			GET http://localhost:3000/comments

			GET http://localhost:3000/profile

			Response

			{
				"posts": [
					{ 
						"id": 1, 
						"title": "json-server", 
						"author": "typicode" 
					}
				],
				"comments": [
					{ 
						"id": 1, 
						"body": "some comment", 
						"postId": 1 
					}
				],
				"profile": { 
					"name": "typicode" 
				}
			}
		
		*/
  }, []);

  /*
		Renderize as tarefas em tela...
		utilize map()
	*/
  return (
    <div>
      <ul>
        <h1> Posts </h1>
        {posts.map((post) => (
          <div key={post.id}>{post.title}</div>
        ))}
      </ul>

      <ul>
        <h1> Comentarios </h1>
        {comentarios.map((comentario) => (
          <div key={comentario.id}>{comentario.body}</div>
        ))}
      </ul>
      
      <ul>
        <h1> Perfil </h1>
        {perfil.map((perfil) => (
          <div key={perfil.name}>{perfil.name}</div>
        ))}
      </ul>
    </div>
  );
}
