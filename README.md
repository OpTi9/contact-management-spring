# contact-management-spring
Contact management project built using Spring Boot.

A contact management application that allows you to:
a. List the contacts in your database.
b. Add a new contact
c. Edit a contact
d. Delete a contact

1. The database for authentication.
2. An API that allows you to query the server to obtain responses in XML format. For example:
- By entering http://localhost:8080/xml?action=listContacts, we get a response in XML format containing the list of contacts.
- Entering http://localhost:8080/xml?action=getContact&id=42, we obtain a response in XML format containing the contact with id=42.
- Enter http://localhost:8080/xml?action=delContact&id=42 to delete the contact with id=42.
