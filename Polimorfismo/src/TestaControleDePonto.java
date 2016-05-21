public class TestaControleDePonto {
	
	public static void main(String[] args) {
		ControleDePonto cdp = new ControleDePonto();
		Gerente g = new Gerente();
		g.setNome("Gerente 1");
		g.setUsuario("gerente1.user");
		cdp.registraEntrada(g);
		Telefonista t = new Telefonista();
		t.setNome("Telefonista 1");
		t.setRamal(1550);
		cdp.registraEntrada(t);
		try {
			Thread.sleep(5000l);
		} catch (InterruptedException e) {
			System.out.println("ERRO: " + e.getMessage());
		}
		cdp.registraSaida(t);
		cdp.registraSaida(g);
	}
	
}
