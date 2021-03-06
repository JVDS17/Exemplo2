package com.ti2cc;

public class Principal {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();

		
		//Inserir um elemento na tabela
		/* Usuario usuario = new Usuario(11, "pablo", "pablo",'M');
		 *  if(dao.inserirUsuario(usuario) == true) {
		 *	System.out.println("Inserção com sucesso -> " + usuario.toString());
	     *}
	     */
		Curso curso = new Curso(101, "Direito");
		if(dao.inserirCurso(curso) == true) {
			System.out.println("Inser??o com sucesso -> " + curso.toString());
		}
		
		//Mostrar usuários do sexo masculino		
		/*System.out.println("==== Mostrar usu?rios do sexo masculino === ");
		  Usuario[] usuarios = dao.getUsuariosMasculinos();
		  for(int i = 0; i < usuarios.length; i++) {
			System.out.println(usuarios[i].toString());
		}*/
		
		System.out.println("==== Mostrar cursos === ");
		Curso[] cursos = dao.getCurso();
		for(int i = 0; i < cursos.length; i++) {
			System.out.println(cursos[i].toString());
		}

		//Atualizar usuário
		/*usuario.setSenha("nova senha");
		dao.atualizarUsuario(usuario);
		*/
		
		curso.setNome("medicina");
		dao.atualizarCurso(curso);

		//Mostrar usuários do sexo masculino
		/*System.out.println("==== Mostrar usuários === ");
		 *usuarios = dao.getUsuarios();
		 *for(int i = 0; i < usuarios.length; i++) {
		 *  System.out.println(usuarios[i].toString());
		 *}
		*/
		
		//Excluir usuário
		//dao.excluirUsuario(usuario.getCodigo());
		
		dao.excluirCurso(curso.getID());
		
		//Mostrar usuários
		/*		usuarios = dao.getUsuarios();
		 *System.out.println("==== Mostrar usuários === ");		
		 *for(int i = 0; i < usuarios.length; i++) {
		 *	System.out.println(usuarios[i].toString());
		 * }
		 */
		
		cursos = dao.getCurso();
		System.out.println("==== Mostrar usuários === ");		
		for(int i = 0; i < cursos.length; i++) {
			System.out.println(cursos[i].toString());
		}
		
		dao.close();
	}
}