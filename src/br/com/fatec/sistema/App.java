package br.com.fatec.sistema;

import java.util.Scanner;

public class App {

	public static void main(String[] args) throws Exception {
		
		String prof = "172.16.3.141";
		String amigo = "172.16.4.196";
		Scanner scanner = new Scanner(System.in);
		
		threadUtils replica1 = new threadUtils(prof);
		threadUtils replica2 = new threadUtils(amigo);
		
		Thread t1 = new Thread(replica1);
		Thread t2 = new Thread(replica2);
	
		int opt = 99;
		while(opt != 0) {
			System.out.println("1 - Replica");
			opt = scanner.nextInt();
			if(opt == 1) {
				t1.start();
				t2.start();	
			}
		}
//		
//		Servidor serv = new Servidor();
//		serv.iniciar();

	}
}
