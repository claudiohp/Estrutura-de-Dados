package HerancaPolimorfismo;

public class TestContas {

	public static void main(String[] args) {
		
		AtualizaContas a = new AtualizaContas();
		Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		c.deposita(1000.00);
		cc.deposita(1100.00);
		cp.deposita(1200.00);

		a.atualizaContas(0.2);
		a.rodaConta(c);
		a.rodaConta(cc);
		a.rodaConta(cp);
				
	}
}
