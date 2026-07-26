School Management System

The project is a set of spring boot based REST APIs that can be used to manage all the functionalities required to manage a school.

# Tech Stack Used
- SpringBoot for API development
- MYSQL as the database
- Keycloak with MYSQL as the Auth service provider
- Flyway for DB migration

# MYSQL Setup
- MYSQL is running in port 3306 in the Windows PC
- It is added as a service with Manual start so that DB can be started/stopped from Windows services UI rather than running bat scripts everytime
- I have set up 2 DBs, school_management for application backend and keycloak_db for Keycloak backend.
- Database and Schemas are the same in MySQL unlike Postgres SQL.

## Keycloak Setup with MYSQL as backend
- Create the keycloak database/schema
- Create a keycloak admin user and grant all the privileges in the schema(what is the need for this user??)
```SQL
CREATE USER 'keycloak_admin_user_name'@'%' IDENTIFIED BY 'Keycloak@123';
GRANT ALL PRIVILEGES ON keycloak_db.* TO 'keycloak_admin_user_name'@'%';
FLUSH PRIVILEGES;
```
- Download MySQL Connector/J to keycloak_home\providers folder.
- Edit keycloak_home\conf\keycloak.conf and add the DB details
```properties
db=mysql
db-url=jdbc:mysql://localhost:3306/keycloak_db
db-username=keycloak_admin_user_name
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
```
- Register school-management app as a client so that all the users created can get a token for this client. 
Also,each NPTA is registered as a client and the responsibility to check if the token is issued for school-management is handled by spring security config of the app by verifying the AUD.
Else any token issued for any client within 'keycloak realm/Microsoft AD tenant' will get accepted.


//Next week
Set up AUD for User Tokens
Configure Keycloak in springboot
Setup Role based Authorization
Test the Authentication/Authorization
Setu


