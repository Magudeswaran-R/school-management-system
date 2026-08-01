## Keycloak Setup with MYSQL as backend
- Create the keycloak database/schema
- Create a keycloak admin user and grant all the privileges in the schema(what is the need for this user??)
```SQL
CREATE USER 'keycloak_user'@'%' IDENTIFIED BY 'Keycloak@123';
GRANT ALL PRIVILEGES ON keycloak_db.* TO 'keycloak_admin_user_name'@'%';
FLUSH PRIVILEGES;
```
- Download MySQL Connector/J to keycloak_home\providers folder.
- Edit keycloak_home\conf\keycloak.conf and add the DB details
```properties
db=mysql
db-url=jdbc:mysql://localhost:3306/keycloak_db
db-username=keycloak_user
db-password=Keycloak@123
hostname=localhost
http-port=8081
```
- Create a keycloak admin to manage keycloak realms. This is not the admin user of the school_management app.
```shell
# Current KC does not take password directly from command. Setting password as an env
$env:KC_ADMIN_PASS = "KcAdmin@123"
kc.bat bootstrap-admin user --username school-admin --password:env KC_ADMIN_PASS
# Build keycloak again to persist the addition of MySQL DB driver
kc.bat build
# Start keycloak 
kc.bat start-dev
```
- Create school-management realm which will be used to manage the application.

## Note:
- Register school-management app as a client so that all the users created can get a token for this client.
  Also,each NPTA is registered as a client and the responsibility to check if the token is issued for school-management is handled by spring security config of the app by verifying the AUD.
  Else any token issued for any client within 'keycloak realm/Microsoft AD tenant' will get accepted.
