package dev.leandromodena.emailjava;

/**
 * Hello world!
 *
 */
public class App {
	
    public static void main( String[] args ){
        String listaDestinatario = "informaremail@email.com";
        String nomeRemetente = "Seu Nome";
        String assuntoEmail = "Assunto";
        String textoEmail = "Esse é um email simples feito em JAVAX MAIL";
        
        ObjetoEnviaEmail objetoEnviaEmail = new ObjetoEnviaEmail(listaDestinatario, nomeRemetente, assuntoEmail, textoEmail);
        
        try {
			objetoEnviaEmail.enviarEmail(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
        
    }
}
