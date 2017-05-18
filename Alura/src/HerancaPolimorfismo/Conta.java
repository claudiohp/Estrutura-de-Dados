package HerancaPolimorfismo;

public class Conta {

	protected double saldo;
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public void sacar(double valor){
		this.saldo -= valor;
	}
	
	public void atualizaSaldo(double taxa){
		this.saldo += saldo * taxa;	
	}
}

