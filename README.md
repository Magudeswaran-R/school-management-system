School Management System

The project is a set of spring boot based REST APIs that can be used to manage all the functionalities required to manage a school.

# Tech Stack Used
- [MYSQL as the database](docs/mysql-setup.md)
- [Keycloak with MYSQL](docs/keycloak-setup.md) as the Auth service provider
- [SpringBoot]() for API development
- Flyway for DB migration
- Application/Admin [users](docs/user.md) used for the application


# Steps to setup the application in Windows Machine
- Open windows services as admin and start MySQL service
- Go into the Keycloak install folder and start keycloak using "kc.bat start-dev"

# Admin Module
- Admin can add Principal, Teacher, Students

## TO-DO later
Set up AUD for User Tokens --- later


