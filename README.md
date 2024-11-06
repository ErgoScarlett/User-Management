# User Management System - CRUD Application

## Descrizione

User Management System è un'applicazione CRUD che permette di gestire una risorsa "utenti". Ogni utente ha i seguenti attributi:
- **Nome**
- **Cognome**
- **Indirizzo Email**
- **Data di Nascita**

L'applicazione è composta da due parti principali:
- **Backend**: Implementato utilizzando **Spring Boot**. Espone delle API REST che consentono le operazioni di creazione, lettura, modifica e cancellazione (CRUD) degli utenti. La lista degli utenti è paginata a livello di server per migliorare le prestazioni.
- **Frontend**: Realizzato con **Angular**. Mostra una semplice interfaccia che consente di visualizzare gli utenti in una tabella e di eseguire le operazioni CRUD su ciascun utente. Non è richiesta autenticazione per l'uso dell'interfaccia.

## Caratteristiche

- **Spring Boot Backend**:
  - API RESTful per la gestione degli utenti.
  - Operazioni CRUD (Create, Read, Update, Delete).
  - Paginazione server-side per la visualizzazione degli utenti.
  
- **Frontend con Angular**:
  - Interfaccia utente per la visualizzazione e gestione degli utenti.
  - Utilizzo di tabelle paginate per visualizzare gli utenti.
