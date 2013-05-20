package br.unip.telas;

import java.io.IOException;
import java.util.Scanner;

import br.unip.db.FileAdministradorDeEntidadesProfessor;

public class TelaInicial implements ITela{

	@Override
	public void show() {
		System.out.println(" Bem vindo ao sistema de LPOO");
		System.out.println(" Digite o numero correspondente a tela para onde voce quer ir");
		System.out.println("1 Professores ");
		System.out.println("2 Alunos ");
		System.out.println("3 Materias ");
		System.out.println("4 Cursos ");
		System.out.println("5 Sair da Aplica��o ");
		Scanner leitor = new Scanner(System.in);
		switch(leitor.nextInt()){
		case 1 : {
			new CadastroProfessor(new FileAdministradorDeEntidadesProfessor("/Users/dirceu/"));
			break;
		}
		case 2 : {
			//new CadastroAluno();
			break;
		}
		case 3 : {
			//new CadastroMateria();
			break;
		}
		case 4 : {
			//new CadastroCurso();
			break;
		}
		case 5 : {
			System.exit(0);
		}
		default : {
			System.out.println(" Opcao invalida!");
			try {
				Runtime.getRuntime().exec(" clear");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.show();
			break;	
		}
		}
	}

}
