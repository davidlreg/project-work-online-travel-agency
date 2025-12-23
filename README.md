# Online Travel Agency – Java Application

## Project Description

This project is a Java-based desktop application that simulates a simple **online travel agency**.  
It is developed as part of an individual university project in the course *Concepts of Programming*.

The application allows users to browse travel offers, filter them by different criteria, add selected trips to a shopping cart, and complete a booking process including the automatic creation of an invoice.

The main objective of this project is to demonstrate a **clear program structure**, the use of **basic object-oriented programming concepts**, and an understandable user interface.

---

## Functional Requirements

The application fulfills the following requirements:

- Travel offers are loaded from an external CSV file at application startup  
- At least 10 travel offers are available  
- Each travel offer contains:
  - Travel date
  - Departure location
  - Destination
  - Flight route (direct or with stopovers)
  - Price

- All available travel offers are displayed after system startup  
- Travel offers can be filtered by:
  - Price
  - Departure location
  - Destination

- Users can select multiple travel offers and add them to a shopping cart  
- The shopping cart can be reviewed and a booking can be completed  
- After booking, an invoice containing the travel details is automatically generated and displayed  
- The application provides feedback for incorrect user input and explains correct usage

---

## Project Structure

The application follows a simple and understandable structure to separate responsibilities:

- **model**  
  Contains data classes representing travel information

- **data**  
  Handles loading travel offers from a CSV file

- **service**  
  Contains the business logic, such as filtering, cart management, and booking

- **ui**  
  Responsible for the graphical user interface and user interaction

This structure improves readability and makes the application easier to understand, especially for beginners.

---

## User Interface

The application provides a graphical user interface that allows users to:

- View all available travel offers in a structured list
- Apply filters using input fields
- Add selected travel offers to a shopping cart
- Review the shopping cart
- Complete a booking and view the generated invoice

The interface is designed to be intuitive and suitable for users without technical background.

---

## Technologies Used

- Java  
- JavaFX (graphical user interface)  
- CSV file for persistent data storage  
- Git for version control  

---

## Purpose of the Project

The purpose of this project is to demonstrate:

- Basic object-oriented programming concepts
- File handling in Java
- Separation of data, business logic, and user interface
- Simple and user-friendly interface design
- Clean and structured code organization

This application is developed for educational purposes only and does not represent a commercial system.

---

## Notes

This project is an individual university assignment.  
All functionalities are implemented according to the official project specification.
