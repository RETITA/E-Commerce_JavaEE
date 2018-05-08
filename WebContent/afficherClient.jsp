<%@ page pageEncoding="UTF-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Affichage Client</title>
    </head>
 
    <body>
		<p>Value :
       <c:out value="test" /></p>
       
       <%-- Affichage de la chaîne "message" transmise par la servlet --%>

        <p class="info">${ message }</p>

        <%-- Puis affichage des données enregistrées dans le bean "client" transmis par la servlet --%>

        <p>Nom : ${ client.nom }</p>

        <p>Prénom : ${ client.prenom }</p>

        <p>Adresse : ${ client.adresse }</p>

        <p>Numéro de téléphone : ${ client.mobile }</p>

        <p>Email : ${ client.mail }</p>

    </body>
</html>