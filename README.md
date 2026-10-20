# Sports News Editorial Office

## Description

A Java console application developed to manage a sports news editorial office. The application allows users to manage editors and their news articles, as well as calculate the price and score of each article according to the rules defined for each sport.

## 📌 Exercise Statement

The objective of this exercise is to develop a sports news management system while applying object-oriented programming concepts in Java.

The application represents an editorial office where editors can be registered and associated with news articles from different sports. Each news article has specific characteristics that determine its price and score.

The exercise covers football, basketball, tennis, Formula 1, and motorcycling.

## ✨ Features

- **Editor management:** Add and delete editors.
- **News management:** Create news articles, associate them with an editor, and delete existing articles.
- **News consultation:** Display the news articles associated with an editor or retrieve the articles from all editors.
- **Price calculation:** Calculate the price of each article according to its sport and relevant characteristics, such as the competition, club, player, or team.
- **Score calculation:** Calculate the score of each article according to the rules established for each sport.
- **Interactive menu:** Access the application's features through a console menu.

## 🛠 Technologies

- **Java:** Programming language used to develop the application.
- **IntelliJ IDEA:** Integrated development environment used for the project.

## 🚀 Installation and Execution

1. **Clone the repository**

2. **Open the project:** Open the cloned project in IntelliJ IDEA.

3. **Run the application:** Execute the `Main` class to display the interactive console menu.

4. **Test the functionality:** Use the menu options to add and delete editors, manage news articles, and calculate their prices and scores. Check that the results match the rules defined in the exercise.

## 🧩 Java Concepts Applied

- **Inheritance and abstraction:** The abstract class `News` defines the common structure for the different types of news articles, implemented by `Football`, `Basketball`, `Tennis`, `F1`, and `Motorcycling`.
- **Polymorphism:** The subclasses override `calculatePriceNews()` and `calculateScoreNews()` to implement the calculation rules specific to each sport.
- **Encapsulation:** Private attributes control direct access to the data managed by each class.
- **Static attributes and constants:** The `salary` attribute represents the common salary of editors, while `static final` constants define fixed values used in price and score calculations.
- **Object relationships:** News articles are associated with editors, allowing each editor to manage their own articles.
- **Collections:** `ArrayList` is used to store and manage editors and news articles.