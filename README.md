# contact-management-spring
contact management project built using Spring Boot.

Une application de gestion de contacts qui permet de :
a. Lister les contacts de votre base de données.
b. Ajouter un nouveau contact
c. Modifier un contact
d. Supprimer un contact

- la base de données pour l’authentification-
- une API qui permet d’interroger le serveur afin d’obtenir des réponses au format XML. Par exemple :
a. En entrant http://localhost:8080/xml?action=listContacts, on obtiendrait une réponse
au format XML contenant la liste des contacts.
b. En entrant http://localhost:8080/xml?action=getContact&id=42, on obtiendrait une
réponse au format XML contenant le contact d’identifiant 42.
c. En entrant http://localhost:8080/xml?action=delContact&id=42, on supprimerait le
contact d’identifiant 42
