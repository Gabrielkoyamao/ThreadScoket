package br.com.fatec.sistema;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {


	private ServerSocket socketServidor;
	
	public Servidor() throws IOException{
		System.out.println("Iniciando servidor");
		socketServidor = new ServerSocket(1234);
	}
	public void iniciar() throws Exception{
		while(true) {
			Socket socketEscuta = socketServidor.accept();
			InputStreamReader streamReader = 
					new InputStreamReader(socketEscuta.getInputStream());
			
			BufferedReader reader = new BufferedReader (streamReader);
			String textoEnviado = reader.readLine();
			System.out.println(textoEnviado);
			
			int num1 = Integer.parseInt(textoEnviado.split(":")[0]);
			int num2 = Integer.parseInt(textoEnviado.split(":")[1]);
			int result = num1 + num2;
			
			System.out.println("A some é: " + result);
			
			reader.close();
		}
	}
}

