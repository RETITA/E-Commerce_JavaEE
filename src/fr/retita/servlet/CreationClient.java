package fr.retita.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.retita.beans.Client;
import fr.retita.beans.Coyote;


public class CreationClient extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
	{
		
	
	        
		
		Client client = new Client();
		client.setNom(request.getParameter("nomClient"));
		client.setPrenom(request.getParameter("prenomClient"));
		client.setAdresse(request.getParameter("adresseClient"));
		client.setMobile(request.getParameter("telephoneClient"));
		client.setMail(request.getParameter("emailClient"));
		
		request.setAttribute( "client", client );
	
		//this.getServletContext().getRequestDispatcher( "/CreationClient.jsp" ).forward( request, response );
		
		
		this.getServletContext().getRequestDispatcher( "/afficherClient.jsp" ).forward( request, response );

	}

}
