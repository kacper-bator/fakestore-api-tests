# Plan Testów — FakeStore API

## 1. Cel
Weryfikacja poprawności działania endpointów FakeStore API.

## 2. Zakres testów
### W zakresie:
- GET /products — lista wszystkich produktów
- GET /products/{id} — pojedynczy produkt
- POST /products — tworzenie produktu
- PUT/PATCH /products/{id} — aktualizacja
- DELETE /products/{id} — usuwanie
- GET /carts — koszyki
- GET /users — użytkownicy
- POST /auth/login — logowanie

### Poza zakresem (na tym etapie):
- Testy wydajnościowe
- Testy bezpieczeństwa
- Testy UI

## 3. Podejście
- Testy niskopoziomowe REST API
- Weryfikacja: statusy HTTP, pola odpowiedzi, typy danych
- Przypadki pozytywne i negatywne

## 4. Środowisko
- FakeStore API (https://fakestoreapi.com) — publiczne sandbox
- Java 21, Maven 3.9, JUnit5, Rest-Assured, Allure

## 5. Kryteria zakończenia
- Wszystkie endpointy pokryte minimum jednym testem
- Testy uruchamiają się przez mvn verify
- Raport Allure dostępny po mvn allure:serve