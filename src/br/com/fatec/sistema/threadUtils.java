package br.com.fatec.sistema;

public class threadUtils implements Runnable{
	private Cliente cl;
	private String ip;
	public threadUtils(String ip) {
		this.ip = ip;
	}
	
	public void replicaMensagem() throws Exception {
		cl = new Cliente(ip);
		cl.conectarEnviar();
	}
	
	@Override
	public void run() {
		try {
			replicaMensagem();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}