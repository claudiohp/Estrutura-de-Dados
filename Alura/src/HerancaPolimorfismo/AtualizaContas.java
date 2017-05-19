package HerancaPolimorfismo;

public class AtualizaContas {

	private double saldoTotal = 0;
	private double selic;
	
	public void atualizaContas(double selic){
		this.selic = selic;
	}

	public void getSelic() {
		this.selic = selic;
	}
	
	public void rodaConta(Conta c){
		System.out.println("Saldo anterior: "+ c.getSaldo());
		c.atualizaSaldo(selic);
		System.out.println("Saldo atual: "+ c.getSaldo());
		this.saldoTotal += c.getSaldo();
	}
	
	public double getSaldoTotal() {
		return this.saldoTotal;
	}
	
}
