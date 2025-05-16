Watchlist App
Overview
Welcome to the Watchlist App! This is a comprehensive web application built with Spring Boot, designed for movie lovers to effortlessly manage their personal movie watchlist. It goes beyond simple tracking, offering robust data persistence and rich movie details.

Features
Home Page: A welcoming introduction to the application.
Watchlist Management (CRUD):
Add New Items: Easily submit new movies to your watchlist.
View Watchlist: See a comprehensive list of all your saved movies.
Edit Watchlist Items: Modify details of existing movies on your list.
Delete Watchlist Items: Remove movies you've already watched or no longer wish to track.
Data Persistence: Watchlist items are stored persistently in a database.
External API Integration: Automatically fetches movie details like IMDb rating, genre, and plot from external movie APIs to enrich your watchlist entries.
Simple UI: Built with HTML and Bootstrap for a clean and responsive user experience.
Robust Spring Boot Backend: Efficiently handles all application logic, data interactions, and API calls.
Technologies Used
Backend:
Java 21
Spring Boot (v3.2.x or v3.3.x - adjust to your exact version)
Maven (for dependency management and build automation)
Spring Data JPA (for database interaction)
(Specify your database here, e.g., H2 Database, MySQL, PostgreSQL)
Frontend:
HTML
CSS (with custom styles and Bootstrap 4)
JavaScript (for Bootstrap's interactive components)
API Integration:
(Specify the API you used, e.g., OMDB API, TMDB API)
Database
The application uses (mention your database, e.g., H2 for development, MySQL for production) to store watchlist items.

For H2 (in-memory/file-based): No external setup is typically required for development.
For external databases (e.g., MySQL): Ensure your database server is running and configured correctly. Update src/main/resources/application.properties with your database connection details.
API Integration
Movie details are fetched from the (mention your API, e.g., OMDB API) when adding a new watchlist item. An API key may be required for this service. If so, ensure your API key is configured in src/main/resources/application.properties (e.g., api.omdb.key=YOUR_API_KEY).
