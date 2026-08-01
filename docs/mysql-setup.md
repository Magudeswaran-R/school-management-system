# MYSQL Setup
- MYSQL is running in port 3306 in the Windows PC
- It is added as a service with Manual start so that DB can be started/stopped from Windows services UI rather than running bat scripts everytime
- I have set up 2 DBs, school_management for application backend and keycloak_db for Keycloak backend.

# Schemas

school_management - Schema for the springboot app

## User Creation

Create the technical account used by the springboot application and provide full access to the school_management schema

```SQL
CREATE USER 'school_management_ta'@'%' IDENTIFIED BY 'P@ssw0rd';
GRANT ALL PRIVILEGES ON school_management.* TO 'school_management_ta'@'%';
FLUSH PRIVILEGES;
```


## Note
- Database and Schemas are the same in MySQL unlike Postgres SQL.
