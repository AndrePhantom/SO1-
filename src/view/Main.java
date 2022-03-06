package view;

import Controller.RedesController;

public class Main {

	public static void main(String[] args) {
		
		RedesController procController = new RedesController();
	//	String os = procController.os();
	//	System.out.print(os);
		
	//	String process = "C:\\Windows\\write.exe";
	//	procController.callProcess(process);
		
		String process = "IPCONFIG";
		procController.readProcess(process);
		
		String process = "PING -4 -n 10 www.google.com.br";
		procController.readProcess(process);
			    
	}

}