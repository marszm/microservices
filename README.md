# microservices
Należy zaimplementować dwa mikroserwisy oparte o Spring Boot, z których jeden będzie posiadał kontroler REST/HTTP, natomiast drugi będzie łączyć się z pamięciową bazą danych i wyciągać z niej dane.

1)Na żądanie użytkownika przesłane do pierwszego serwisu, kontroler powinien wywołać drugi serwis, pobrać z niego dane i zwrócić użytkownikowi.

2)Komunikacja między dwoma serwisami powinna być zrealizowana na dwa alternatywne sposoby (rozróżniane np. przez dwa osobne adresy kontrolera w pierwszym serwisie):

a)poprzez RestTemplate z użyciem nazwy drugiego mikroserwisu, a nie poprzez adres IP i port (podpowiedź: adnotacja @LoadBalanced)

b)poprzez system kolejkowy, np. Kafka i KafkaTemplate (opcjonalnie)

3)Drugi serwis powinien tworzyć schemat bazy danych poprzez bibliotekę FlywayDB lub Liquibase.

4)Oba serwisy powinny zgłaszać się w rejestrze usług, np. w Netflix Eureka.

5)Oba serwisy powinny pobierać swoją konfigurację (np. adres rejestru usług) z serwera konfiguracji korzystającego z repozytorium Git.
