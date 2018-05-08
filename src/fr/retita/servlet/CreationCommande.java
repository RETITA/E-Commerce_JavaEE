package fr.retita.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.retita.beans.Client;
import fr.retita.beans.Commande;


public class CreationCommande extends HttpServlet {
	
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		

		Commande commande = new Commande();
		Client client = new Client();
		
		client.setNom(request.getParameter("nomClient"));
		client.setPrenom(request.getParameter("prenomClient"));
		client.setAdresse(request.getParameter("adresseClient"));
		client.setMobile(request.getParameter("telephoneClient"));
		client.setMail(request.getParameter("emailClient"));
		
		
		//  dateCommande
          
        
		commande.setClient(client);
		commande.setMontant(Double.parseDouble(request.getParameter("montantCommande")));
		commande.setModeLivraison(request.getParameter("modeLivraisonCommande"));
		commande.setModePaiement(request.getParameter("modePaiementCommande"));
		commande.setStatutLivraison(request.getParameter("statutLivraisonCommande"));
		commande.setStatutPaiement(request.getParameter("statutPaiementCommande"));
		
		
		request.setAttribute( "commande", commande);
		
		this.getServletContext().getRequestDispatcher( "/afficherCommande.jsp" ).forward( request, response );

}
}
