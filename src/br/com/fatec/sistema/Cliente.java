package br.com.fatec.sistema;
import java.io.PrintWriter;
import java.net.Socket;


public class Cliente {
	
	private Socket socketCliente;
	public Cliente(String ip) throws Exception{
		System.out.println("Fazendo conexão");
		socketCliente = new Socket(ip,1234);
	}
	
	public void conectarEnviar()throws Exception{
		PrintWriter escritor = 
				new PrintWriter(socketCliente.getOutputStream());
		System.out.println("Enviando...");
		escritor.write("Teste");
		escritor.close();
	}
}