package HerancaPolimorfismo;

public class ContaPoupanca extends Conta {
	
	@Override
	public void atualizaSaldo(double taxa) {
		this.saldo += saldo * taxa * 3;
	}
	
	@Override
	public void deposita(double valor) {
		super.deposita(valor - 0.10f);
	}
}
