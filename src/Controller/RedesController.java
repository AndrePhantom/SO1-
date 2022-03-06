package Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RedesController {
   public RedesController() {
	   super();
	   
   }
      public String os() {
    	  String os = System.getProperty("os.name");
    	  String Ip = System.getProperty("os.Ip");
    	  String ping = System.getProperty("os.ping");
    	  return os + " - Ip." + Ip + "- ping" + ping;
    	  
      }
           public void callProcess(String process) {
            try {
            	Runtime.getRuntime().exec(process);
            	} catch (Exception e) {
            		String msgErro = e.getMessage();
            		if (msgErro.contains("740")) {
            			StringBuffer buffer = new StringBuffer();
            			buffer.append("cmd/c");
            			buffer.append(" ");
            			buffer.append(process);
            			try {
            				Runtime.getRuntime().exec(buffer.toString());
            			} catch (IOException e1) {
            				e1.printStackTrace();
            				
            			}
            		} else {
            			e.printStackTrace();
            		}
            	}
           
           
           }
           
           public void readProcess(String process) {
        	   try {
        		   Process p = Runtime.getRuntime().exec(process);
        		   InputStream fluxo = p.getInputStream();
        		   InputStreamReader leitor = new InputStreamReader(fluxo);
        		   BufferedReader buffer = new BufferedReader(leitor);
        		   String linha = buffer.readLine();
        		   while (linha != null) {
        			     System.out.print(linha);
        			     linha = buffer.readLine();
        		   }
        		   buffer.close();
        		   leitor.close();
        		   fluxo.close();
        		   
        	     } catch (IOException e) {
        	       e.printStackTrace();
        	       
        	       
        	   }
           }
}
