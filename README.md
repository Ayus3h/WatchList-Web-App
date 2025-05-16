# 🎬 Watchlist App

---

## ✨ Overview

Welcome to the Watchlist App! This is a **comprehensive web application** built with Spring Boot, designed for movie lovers to effortlessly manage their personal movie watchlist. It goes beyond simple tracking, offering **robust data persistence** and **rich movie details** fetched from external APIs.

---

## 🌟 Features

* **Watchlist Management (CRUD Operations):**
    * ➕ **Add New Items:** Easily submit new movies to your watchlist.
    * 👀 **View Watchlist:** See a comprehensive list of all your saved movies.
    * ✏️ **Edit Watchlist Items:** Modify details of existing movies on your list.
    * 🗑️ **Delete Watchlist Items:** Remove movies you've already watched or no longer wish to track.
* **💾 Data Persistence:** Watchlist items are stored persistently in a database.
* **🌐 External API Integration:** Automatically fetches movie details like IMDb rating from the OMDB API to enrich your watchlist entries.
* **🖥️ Simple UI:** Built with HTML and Bootstrap for a clean and responsive user experience.
* **🚀 Robust Spring Boot Backend:** Efficiently handles all application logic, data interactions, and API calls.

---

## 🛠️ Technologies Used

* **Backend:**
    * Java 21
    * Spring Boot (v3.2.x)
    * Maven (for dependency management and build automation)
    * Spring Data JPA (for seamless database interaction)
    * Database used: **H2 Database**
* **Frontend:**
    * HTML
    * CSS (with custom styles and Bootstrap 4)
    * JavaScript (for Bootstrap's interactive components)
* **API Integration:**
    * API used: **OMDB API**

---

## 🗄️ Database

The application uses **H2 Database** to store watchlist items.

* **Why H2 (in-memory/file-based):** No external setup is typically required for development.

---

## 🔗 API Integration

Movie details are fetched from the **OMDB API** when adding a new watchlist item. An API key is required for this service.


🚀 Getting Started
To get the Watchlist App up and running on your local machine, follow these steps:

Prerequisites
Java Development Kit (JDK) 17 or higher
Maven 3.6 or higher
An IDE (like IntelliJ IDEA, Eclipse, or VS Code)
Setup
Clone the repository:

Bash

git clone [https://github.com/Ayus3h/WatchList-Web-App.git](https://github.com/Ayus3h/WatchList-Web-App.git)
cd WatchList-Web-App
Configure OMDB API Key:

The application uses the OMDB API to fetch movie ratings. A placeholder API key might be provided.
For production or heavy use, it's recommended to get your own free API key from OMDB and update it in src/main/java/com/example/ayush/WatchList/service/RatingService.java for reliability.
Build the project:

Bash

mvn clean install
Run the application:
You can run it directly from your IDE or using Maven:

Bash

mvn spring-boot:run
Accessing the Application
Once the application starts successfully, open your web browser and navigate to:

http://localhost:8080
📸 Screenshots
Here are some glimpses of the Watchlist App in action:

Home Page
(Please replace homepage_screenshot.png with an actual screenshot of your enhanced home page once you take it.)

Watchlist Page
(Please replace watchlist_screenshot.png with an actual screenshot of your enhanced watchlist page once you take it.)

Submit Item Form
(Please replace submitform_screenshot.png with an actual screenshot of your enhanced submit item form once you take it.)

🤝 Contributing
Feel free to fork the repository, make improvements, and submit pull requests. Any contributions are welcome!

📄 License
MIT License

Copyright (c) 2024 Ayush

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
📞 Contact
For any questions or suggestions, feel free to reach out.```properties
api.omdb.key=YOUR_ACTUAL_API_KEY
