<%@ page pageEncoding="UTF-8" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Affichage Commande</title>
    </head>

    <body>

        <%-- Affichage de la chaîne "message" transmise par la servlet --%>

        <p class="info">${ message }</p>

        <%-- Puis affichage des données enregistrées dans le bean "commande" transmis par la servlet --%>

        <p>Client</p>

        <%-- Les 5 expressions suivantes accèdent aux propriétés du client, qui est lui-même une propriété du bean commande --%>

        <p>Nom : ${ commande.client.nom }</p>

        <p>Prénom : ${ commande.client.prenom }</p>

        <p>Adresse : ${ commande.client.adresse }</p>

        <p>Numéro de téléphone : ${ commande.client.mobile }</p>

        <p>Email : ${ commande.client.mail }</p>

        <p>Commande</p>
 

        <p>Montant  : ${ commande.montant }</p> 

        <p>Mode de paiement  : ${ commande.modePaiement }</p> 

        <p>Statut du paiement  : ${ commande.statutPaiement }</p> 

        <p>Mode de livraison  : ${ commande.modeLivraison }</p> 

        <p>Statut de la livraison  : ${ commande.statutLivraison }</p> 

    </body>
</html>