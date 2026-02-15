# 🌍 Online Travel Agency (CLI Application)

This project was developed as part of a **Business Informatics project work**. It demonstrates the implementation of a modular Java application focusing on Clean Code principles, the IPO (Input-Process-Output) model, and a strict separation of logic and presentation.

---

## 📖 Project Overview
The application is a console-based travel booking system. it allows users to load travel offers from an external data source, filter them, and go through the entire process from the shopping cart to final invoicing.

### Core Features
* **Dynamic Data Import**: Reading travel data from a semicolon-separated CSV file (`traveldata.csv`).
* **Smart Filter Logic**: Search for destinations and price ceilings.
* **Shopping Cart Management**: Adding trips with automatic total price calculation.
* **Structured Invoicing**: Generating an overview of all booked services.
* **Robustness**: Implementation of exception handling to prevent program crashes during invalid inputs.

---

## 🏗 Software Architecture
The application follows a clear layer separation to ensure maintainability and extensibility:



* **`model`**: Contains the domain model (`Travel.java`) as a POJO (Plain Old Java Object).
* **`service`**: Includes the business logic (`FilterService`, `CartService`, `BookingService`).
* **`ui`**: Encapsulates the entire presentation logic for the command-line interface (CLI).
* **`data`**: Responsible for the persistence layer and data access (`CsvTravelLoader`).

---

## 📂 Project Structure
```text
src/reisebuero/
├── data/       # Data access (CSV parsing)
├── model/      # Data models (Travel class)
├── service/    # Business logic & state management
├── ui/         # User interface (MainView, ListView, CartView)
└── App.java    # Main entry point & Controller
resources/
└── traveldata.csv # Data source for travel offers
```

🛠 Installation & Execution
Prerequisites
Java Development Kit (JDK) version 17 or higher.

A terminal or an IDE (e.g., VS Code, IntelliJ).

Running the Application
Clone the repository:

```
Bash
git clone [https://github.com/davidlreg/project-work-online-travel-agency.git](https://github.com/davidlreg/project-work-online-travel-agency.git)
```
Navigate to the directory:

```
Bash
cd project-work-online-travel-agency
```
Compile (from the src folder):

```
Bash
javac reisebuero/App.java
```
Start the program:

```
Bash
java reisebuero.App
```

🎓 Academic Context
This software was created as a practical component of a project thesis in Business Informatics. The focus of the work was Object-Oriented Programming (OOP) as well as the application of non-functional requirements in Java.

Author: David Gerliz
