package Abstract;

public class Funcionario {
//
	private String nome;
	protected double salario;
	
	public String getNome() {
		return nome;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}	
	
	private double getBonus() {
		return this.salario * 0.2;
	}
	
	
}
