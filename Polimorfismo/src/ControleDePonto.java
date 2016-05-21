import java.text.SimpleDateFormat;
import java.util.Date;

public class ControleDePonto {
	public void registraEntrada(Funcionario f) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date agora = new Date();
		System.out.println("ENTRADA");
		System.out.println("Funcionário: " + f.getNome());
		System.out.println("Data: " + sdf.format(agora));
		if (f instanceof Gerente) {
			// Gerente g = (Gerente) f;
			System.out.println("Bom dia, " + ((Gerente) f).getUsuario() + "!");
		}
	}
	
	public void registraSaida(Funcionario f) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date agora = new Date();
		System.out.println("SAÍDA");
		System.out.println("Funcionário: " + f.getNome());
		System.out.println("Data: " + sdf.format(agora));
	}
}
