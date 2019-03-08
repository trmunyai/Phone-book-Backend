# Rest Server with h2 database

This App uses Spring Boot Data with H2 In Memory Database
Application.properties

```
spring.datasource.url=jdbc:h2:mem:TEST;MVCC=true;DB_CLOSE_DELAY=-1;MODE=Oracle
spring.datasource.username=sa
spring.datasource.password=
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.platform=h2
spring.jpa.hibernate.ddl-auto=none
```

This single line will do all the magic for you using Spring JPA

```
public interface PhoneBookService extends JpaRepository<PhoneBook, Integer>{
}
```

To download this code
