# contact-management-spring
contact management project built using Spring Boot.

Une application de gestion de contacts qui permet de :
a. Lister les contacts de votre base de données.
b. Ajouter un nouveau contact
c. Modifier un contact
d. Supprimer un contact

1. La base de données pour l’authentification.
2. Une API qui permet d’interroger le serveur afin d’obtenir des réponses au format XML. Par exemple :
- En entrant http://localhost:8080/xml?action=listContacts, on obtient une réponse au format XML contenant la liste des contacts.
- En entrant http://localhost:8080/xml?action=getContact&id=42, on obtient une réponse au format XML contenant le contact d’identifiant 42.
- En entrant http://localhost:8080/xml?action=delContact&id=42, on supprime le contact d’identifiant 42.
