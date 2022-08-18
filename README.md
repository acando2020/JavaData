
## Requirements
```shell
For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)# JavaData
```

## Create Database

```shell
uncomment for create Table 
spring.jpa.hibernate.ddl-auto=create
```

## Connect sql server database - spring-boot
```shell
spring.jpa.database=POSTGRESQL
spring.sql.init.platform=postgres
spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
spring.datasource.username=odooAJ
spring.datasource.password=odooAJ
spring.jpa.show-sql=true
spring.jpa.generate-ddl=true
#spring.jpa.hibernate.ddl-auto=create
spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
```

## Running the application locally
```shell
mvn spring-boot:run
or 
mvn spring-boot:start
```
