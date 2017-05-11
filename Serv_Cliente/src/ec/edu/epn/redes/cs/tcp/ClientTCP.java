package ec.edu.epn.redes.cs.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JOptionPane;

public class ClientTCP {
	
	private static int SERVER_PORT= 9090;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String serverAddress= JOptionPane.showInputDialog("Ingrese direción IP del servidor: ");
		
		Socket clientSocket= new Socket(serverAddress, SERVER_PORT); //Establece conexipn con el servidor mediante socket
		
		InputStreamReader inputStream= new InputStreamReader(clientSocket.getInputStream()); //obtiene el mensaje enviado por el serv idor a traves del socket
		
		
		//lee los datos del mensaje
		BufferedReader input = new BufferedReader(inputStream);
		String answer= input.readLine();
		
		//imprime los datos del mensaje
		
		JOptionPane.showMessageDialog(null, answer);
		System.exit(0);

	}

}
