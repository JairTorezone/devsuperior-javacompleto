package com.devsuperior.m19.genericsMaps.exercicio2.entities;

public class Aluno {

	private int idAluno;

	public Aluno(int idAluno) {
		this.idAluno = idAluno;
	}

	public int getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idAluno;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (idAluno != other.idAluno)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return ""+getIdAluno();
	}
	
	
}
