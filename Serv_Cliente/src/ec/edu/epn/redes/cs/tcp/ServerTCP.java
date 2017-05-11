package ec.edu.epn.redes.cs.tcp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

public class ServerTCP {
	
	//Hace correr el servidor
	
	private static int PORT= 9090;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ServerSocket serverSocket= new ServerSocket(PORT);
		System.out.println("bbbbbbb "+PORT);
		
		try{
			while(true){ // mientras el servidor este encendido---> aiempre encendido dedicado
				Socket socket = serverSocket.accept(); //acepta la conexion con ete socket
				try{
					PrintWriter out = new PrintWriter(socket.getOutputStream(), true); //sirve para Input output datos sobre un objeto
					out.println("Any");
					
				}finally{
					socket.close();
				}
			}
		}
		finally{
			serverSocket.close();
		}
		
	}

}
