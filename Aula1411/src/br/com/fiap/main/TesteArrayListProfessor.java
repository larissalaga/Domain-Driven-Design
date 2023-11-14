package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import br.com.br.beans.Professor;

public class TesteArrayListProfessor {

	public static void main(String[] args) {
		Professor professorUm = new Professor("Ronqui", 37, 2533);
		Professor professorDois = new Professor("Desiderio", 39, 3658);
		Professor professorTres = new Professor("Karina", 35, 4000 );
		// 
		List<Professor> professores = new ArrayList<Professor>();
		professores.add(professorUm);
		professores.add(professorDois);
		professores.add(professorTres);
		
		for (Professor professor : professores) {
			System.out.println(professor.getNome() + " " +
					professor.getIdade() + " " +
					professor.getSalario() +
					"\n"
					);
			
		}

	}

}
