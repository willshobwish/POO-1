package aula;

public class Aluno {
private String nome;
private String RA;
private float Nota1;
private float Nota2;

public float media() {
	return (Nota1 + Nota2)/2;
}

public boolean aprovado() {
	if(media()>=5) {
		return true;
	}else {
		return false;
	}
}

public void setNome(String nome) {
	this.nome = nome;
}

public void setRA(String rA) {
	RA = rA;
}

public void setNota1(float nota1) {
	Nota1 = nota1;
}

public void setNota2(float nota2) {
	Nota2 = nota2;
}


}
