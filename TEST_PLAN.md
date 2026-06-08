# Plan Testów — FakeStore API

## 1. Wprowadzenie

### 1.1 Cel dokumentu
Dokument opisuje zakres, podejście, zasoby i harmonogram planowanych
działań testowych dla projektu automatyzacji testów API FakeStore.

### 1.2 Testowany obiekt
- **Aplikacja:** FakeStore API
- **URL:** https://fakestoreapi.com
- **Typ:** REST API (publiczny sandbox)

---

## 2. Zakres testów

| Endpoint              | Metody                        |
|-----------------------|-------------------------------|
| /products             | GET, POST                     |
| /products/{id}        | GET, PUT, PATCH, DELETE       |
| /products/categories  | GET                           |
| /carts                | GET, POST                     |
| /carts/{id}           | GET, PUT, PATCH, DELETE       |
| /users                | GET, POST                     |
| /auth/login           | POST                          |
| /users/{id}           | GET, PUT, PATCH, DELETE       |


---

## 3. Podejście do testów

### 3.1 Poziom testów
Testy niskopoziomowe REST API - weryfikacja kontraktu między klientem a serwerem.

### 3.2 Typy testów
- **Testy funkcjonalne** - weryfikacja poprawności odpowiedzi API
- **Testy negatywne** - weryfikacja obsługi błędnych danych
  (np. nieistniejące ID, brakujące pola)
- **Testy E2E** - scenariusze wielokrokowe (np. utwórz -> pobierz
  → zaktualizuj -> usuń) - planowane w kolejnych iteracjach

### 3.3 Co weryfikujemy w każdym teście
- Kod statusu HTTP (200, 201, 400, 404 itp.)
- Struktura i pola odpowiedzi JSON
- Typy danych pól (np. price to liczba, nie string)
- Wartości pól dla konkretnych zasobów

### 3.4 Techniki projektowania testów
- **Podział na klasy równoważności** - np. prawidłowe ID vs
  nieprawidłowe ID
- **Analiza wartości brzegowych** - np. ID = 0, ID = 9999
- **Testy eksploracyjne** - odkrywanie zachowania API

---

## 4. Środowisko testowe

| Element    | Wartość                              |
|------------|--------------------------------------|
| Java       | 21                                   |
| Maven      | 3.9.x                                |
| JUnit      | 5.10.2                               |
| Rest-Assured | 5.4.0                              |
| Raportowanie | Allure 2.27.0                      |
| System     | Windows 11                           |
| API        | https://fakestoreapi.com (sandbox)   |

---

## 5. Kryteria wejścia i wyjścia

### 5.1 Kryteria wejścia (kiedy zaczynamy testy)
- Projekt skonfigurowany i uruchamialny przez `mvn verify`
- API dostępne pod adresem https://fakestoreapi.com
- Zależności pobrane i skompilowane

### 5.2 Kryteria wyjścia (kiedy kończymy)
- Wszystkie zaplanowane endpointy pokryte testami
- 100% testów przechodzi (`BUILD SUCCESS`)
- Raport Allure wygenerowany i czytelny
- Brak testów z błędami (`Errors: 0`)

---
