<div id="top">

<!-- HEADER STYLE: CLASSIC -->
<div align="center">


# FINALPROJECT-BACKOFFICE

<em>Empowering Management, Accelerating Innovation Seamlessly</em>

<!-- BADGES -->
<img src="https://img.shields.io/github/last-commit/marcogulino-mg/finalproject-backoffice?style=flat&logo=git&logoColor=white&color=0080ff" alt="last-commit">
<img src="https://img.shields.io/github/languages/top/marcogulino-mg/finalproject-backoffice?style=flat&color=0080ff" alt="repo-top-language">
<img src="https://img.shields.io/github/languages/count/marcogulino-mg/finalproject-backoffice?style=flat&color=0080ff" alt="repo-language-count">

<em>Built with the tools and technologies:</em>

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white)
</div>
<br>

---

## 📄 Table of Contents

- [Overview](#-overview)
- [Getting Started](#-getting-started)
    - [Prerequisites](#-prerequisites)
    - [Installation](#-installation)
    - [Usage](#-usage)
    - [Testing](#-testing)
- [Features](#-features)
- [Project Structure](#-project-structure)
    - [Project Index](#-project-index)

---

## ✨ Overview

finalproject-backoffice is a feature-rich Spring Boot application tailored for managing gaming content through a secure, scalable, and user-friendly backoffice system. It combines RESTful APIs, a modular MVC architecture, and comprehensive security features to streamline content administration.

**Why finalproject-backoffice?**

This project empowers developers to build robust backends with seamless data management and secure user access. The core features include:

- 🛠️ **API-Driven Management:** RESTful endpoints for efficient CRUD operations on videogames and consoles.
- 🔒 **Security & Authentication:** Custom user details and role-based access control for protected operations.
- 🎨 **Modular Web UI:** Reusable templates and fragments for a cohesive, maintainable front-end experience.
- 💾 **Database Integration:** Repositories optimized for quick data retrieval and management.
- 🚀 **Extensible Architecture:** Well-structured MVC setup supporting easy customization and scaling.

---

## 📌 Features

|      | Component       | Details                                                                                     |
| :--- | :-------------- | :------------------------------------------------------------------------------------------ |
| ⚙️  | **Architecture**  | <ul><li>Java-based backend with Spring Boot framework</li><li>HTML frontend with Bootstrap for UI</li><li>Layered architecture: Controller, Service, Repository</li></ul> |
| 🔩 | **Code Quality**  | <ul><li>Uses Maven for dependency management and build automation</li><li>Code organized into packages following standard conventions</li><li>Includes basic code comments and structure</li></ul> |
| 📄 | **Documentation** | <ul><li>Minimal inline comments in code</li><li>README.md provides project overview</li><li>No dedicated API or developer documentation found</li></ul> |
| 🔌 | **Integrations**  | <ul><li>Uses Maven dependencies for external libraries</li><li>Bootstrap for frontend styling</li><li>Potential REST API endpoints for integration with other services</li></ul> |
| 🧩 | **Modularity**    | <ul><li>Separate packages for controllers, services, repositories</li><li>Frontend components separated into HTML and Bootstrap</li></ul> |
| 🧪 | **Testing**       | <ul><li>No explicit test classes or frameworks (e.g., JUnit) identified in the codebase</li><li>Potential for unit testing via Maven</li></ul> |
| ⚡️  | **Performance**   | <ul><li>Basic performance considerations with Spring Boot and Bootstrap</li><li>No advanced caching or optimization techniques evident</li></ul> |
| 🛡️ | **Security**      | <ul><li>Security features not explicitly implemented or configured</li><li>Potential for Spring Security integration</li></ul> |
| 📦 | **Dependencies**  | <ul><li>Relies on Maven dependencies specified in `pom.xml`</li><li>Includes Java, HTML, Bootstrap, XML libraries</li></ul> |

---

## 📁 Project Structure

```sh
└── finalproject-backoffice/
    ├── mvnw
    ├── mvnw.cmd
    ├── pom.xml
    └── src
        ├── main
        └── test
```

---

### 📑 Project Index

<details open>
	<summary><b><code>FINALPROJECT-BACKOFFICE/</code></b></summary>
	<!-- __root__ Submodule -->
	<details>
		<summary><b>__root__</b></summary>
		<blockquote>
			<div class='directory-path' style='padding: 8px 0; color: #666;'>
				<code><b>⦿ __root__</b></code>
			<table style='width: 100%; border-collapse: collapse;'>
			<thead>
				<tr style='background-color: #f8f9fa;'>
					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
					<th style='text-align: left; padding: 8px;'>Summary</th>
				</tr>
			</thead>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/marcogulino-mg/finalproject-backoffice/blob/master/pom.xml'>pom.xml</a></b></td>
					<td style='padding: 8px;'>- Defines project dependencies and configuration for a Spring Boot-based backoffice application, integrating core functionalities such as data persistence, security, web interface, and validation<br>- Facilitates seamless setup and management of the applications architecture, ensuring compatibility with MySQL, Thymeleaf templates, and security features, thereby supporting robust development and deployment of the overall system.</td>
				</tr>
			</table>
		</blockquote>
	</details>
	<!-- src Submodule -->
	<details>
		<summary><b>src</b></summary>
		<blockquote>
			<div class='directory-path' style='padding: 8px 0; color: #666;'>
				<code><b>⦿ src</b></code>
			<!-- main Submodule -->
			<details>
				<summary><b>main</b></summary>
				<blockquote>
					<div class='directory-path' style='padding: 8px 0; color: #666;'>
						<code><b>⦿ src.main</b></code>
					<!-- java Submodule -->
					<details>
						<summary><b>java</b></summary>
						<blockquote>
							<div class='directory-path' style='padding: 8px 0; color: #666;'>
								<code><b>⦿ src.main.java</b></code>
							<!-- com Submodule -->
							<details>
								<summary><b>com</b></summary>
								<blockquote>
									<div class='directory-path' style='padding: 8px 0; color: #666;'>
										<code><b>⦿ src.main.java.com</b></code>
									<!-- marco Submodule -->
									<details>
										<summary><b>marco</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ src.main.java.com.marco</b></code>
											<!-- finalproject Submodule -->
											<details>
												<summary><b>finalproject</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ src.main.java.com.marco.finalproject</b></code>
													<!-- finalproject_backoffice Submodule -->
													<details>
														<summary><b>finalproject_backoffice</b></summary>
														<blockquote>
															<div class='directory-path' style='padding: 8px 0; color: #666;'>
																<code><b>⦿ src.main.java.com.marco.finalproject.finalproject_backoffice</b></code>
															<table style='width: 100%; border-collapse: collapse;'>
															<thead>
																<tr style='background-color: #f8f9fa;'>
																	<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																	<th style='text-align: left; padding: 8px;'>Summary</th>
																</tr>
															</thead>
																<tr style='border-bottom: 1px solid #eee;'>
																	<td style='padding: 8px;'><b><a href='https://github.com/marcogulino-mg/finalproject-backoffice/blob/master/src/main/java/com/marco/finalproject/finalproject_backoffice/FinalprojectBackofficeApplication.java'>FinalprojectBackofficeApplication.java</a></b></td>
																	<td style='padding: 8px;'>- Initialize and bootstrap the Spring Boot application, serving as the entry point for the backoffice system<br>- It orchestrates the startup process, enabling the configuration and deployment of the applications core functionalities within the overall architecture<br>- This setup ensures the backoffice environment is ready to support administrative and management operations.</td>
																</tr>
															</table>
															<!-- api Submodule -->
															<details>
																<summary><b>api</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ src.main.java.com.marco.finalproject.finalproject_backoffice.api</b></code>
																	<table style='width: 100%; border-collapse: collapse;'>
																	<thead>
																		<tr style='background-color: #f8f9fa;'>
																			<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																			<th style='text-align: left; padding: 8px;'>Summary</th>
																		</tr>
																	</thead>
																		<tr style='border-bottom: 1px solid #eee;'>
																			<td style='padding: 8px;'><b><a href='https://github.com/marcogulino-mg/finalproject-backoffice/blob/master/src/main/java/com/marco/finalproject/finalproject_backoffice/api/VideogameApiController.java'>VideogameApiController.java</a></b></td>
																			<td style='padding: 8px;'>- Provides RESTful API endpoints for managing video game data within the application<br>- Facilitates operations such as listing, searching, retrieving by ID or slug, creating, updating, and deleting video game records, integrating with the service layer to support the overall architectures data handling and client interaction.</td>
																		</tr>
																		<tr style='border-bottom: 1px solid #eee;'>
																			<td style='padding: 8px;'><b><a href='https://github.com/marcogulino-mg/finalproject-backoffice/blob/master/src/main/java/com/marco/finalproject/finalproject_backoffice/api/ConsoleApiController.java'>ConsoleApiController.java</a></b></td>
																			<td style='padding: 8px;'>- Provides RESTful API endpoints for managing console entities within the backend architecture<br>- Facilitates creation, retrieval, updating, and deletion of console data, supporting search and lookup by ID or slug<br>- Serves as the primary interface for client interactions with console-related resources, integrating with the service layer to ensure data consistency and proper handling within the overall system.</td>
																		</tr>
																	</table>
																</blockquote>
															</details>
															<!-- controllers Submodule -->
															<details>
																<summary><b>controllers</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ src.main.java.com.marco.finalproject.finalproject_backoffice.controllers</b></code>
																	<table style='width: 100%; border-collapse: collapse;'>
																	<thead>
																		<tr style='background-color: #f8f9fa;'>
																			<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																			<th style='text-align: left; padding: 8px;'>Summary</th>
																		</tr>
																	</thead>
																		<tr style='border-bottom: 1px solid #eee;'>
																			<td style='padding: 8px;'><b><a href='https://github.com/marcogulino-mg/finalproject-backoffice/blob/master/src/main/java/com/marco/finalproject/finalproject_backoffice/controllers/HomeController.java'>HomeController.java</a></b></td>
																			<td style='padding: 8px;'>- Defines the main entry point for the applications web interface, handling requests to the root URL<br>- It directs users to the homepage view, facilitating user navigation and serving as a foundational component for the front-end routing within the overall architecture<br>- This controller supports the user interface flow and integrates the back-end with the visual presentation layer.</td>
																		</tr>
																		<tr style='border-bottom: 1px solid #eee;'>
																			<td style='padding: 8px;'><b><a href='https://github.com/marcogulino-mg/finalproject-backoffice/blob/master/src/main/java/com/marco/finalproject/finalproject_backoffice/controllers/ConsoleController.java'>ConsoleController.java</a></b></td>
																			<td style='padding: 8px;'>- Manages CRUD operations for console entities within the backoffice application, enabling listing, viewing, searching, creating, editing, and deleting consoles<br>- Integrates with the ConsoleService to handle data interactions and provides web endpoints for administrative management, supporting seamless console data management as part of the overall system architecture.</td>
																		</tr>
																		<tr style='border-bottom: 1px solid #eee;'>
																			<td style='padding: 8px;'><b><a href='https://github.com/marcogulino-mg/finalproject-backoffice/blob/master/src/main/java/com/marco/finalproject/finalproject_backoffice/controllers/VideogameController.java'>VideogameController.java</a></b></td>
																			<td style='padding: 8px;'>- Manages CRUD operations and user interactions for videogame entities within the application<br>- Facilitates listing, viewing, creating, editing, deleting, and searching videogames, integrating with service layers to handle data persistence and retrieval<br>- Serves as the primary controller for the videogame module, enabling seamless management and navigation of videogame data in the backoffice architecture.</td>
																		</tr>
																	</table>
																</blockquote>
															</details>
															<!-- repositories Submodule -->
															<details>
																<summary><b>repositories</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ src.main.java.com.marco.finalproject.finalproject_backoffice.repositories</b></code>
																	<table style='width: 100%; border-collapse: collapse;'>
																	<thead>
																		<tr style='background-color: #f8f9fa;'>
																			<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																			<th style='text-align: left; padding: 8px;'>Summary</th>
																		</tr>
																	</thead>
																		<tr style='border-bottom: 1px solid #eee;'>
																			<td style='padding: 8px;'><b><a href='https://github.com/marcogulino-mg/finalproject-backoffice/blob/master/src/main/java/com/marco/finalproject/finalproject_backoffice/repositories/UserRepo.java'>UserRepo.java</a></b></td>
																			<td style='padding: 8px;'>- Provides data access capabilities for User entities within the application, enabling retrieval and management of user information<br>- Integrates with the overall architecture to facilitate user authentication and profile handling, supporting the backoffice functionalities<br>- Serves as a key component for interacting with the database layer, ensuring efficient and organized user data operations.</td>
																		</tr>
																		<tr style='border-bottom: 1px solid #eee;'>
																			<td style='padding: 8px;'><b><a href='https://github.com/marcogulino-mg/finalproject-backoffice/blob/master/src/main/java/com/marco/finalproject/finalproject_backoffice/repositories/ConsoleRepo.java'>ConsoleRepo.java</a></b></td>
																			<td style='padding: 8px;'>- Provides data access methods for Console entities within the backoffice application, enabling retrieval of console records by name or slug<br>- Facilitates seamless database interactions for managing console information, supporting features like search and detailed lookup, thereby integrating core data operations into the overall architecture of the backend system.</td>
																		</tr>
																		<tr style='border-bottom: 1px solid #eee;'>
																			<td style='padding: 8px;'><b><a href='https://github.com/marcogulino-mg/finalproject-backoffice/blob/master/src/main/java/com/marco/finalproject/finalproject_backoffice/repositories/VideogameRepo.java'>VideogameRepo.java</a></b></td>
																			<td style='padding: 8px;'>- Provides data access methods for Videogame entities within the backoffice system, enabling retrieval of videogames by name or slug<br>- Integrates with the overall architecture to facilitate efficient querying and management of videogame records, supporting features like search and detailed lookup essential for administrative and content management functionalities.</td>
																		</tr>
																	</table>
																</blockquote>
															</details>
															<!-- exceptions Submodule -->
															<details>
																<summary><b>exceptions</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ src.main.java.com.marco.finalproject.finalproject_backoffice.exceptions</b></code>
																	<table style='width: 100%; border-collapse: collapse;'>
																	<thead>
																		<tr style='background-color: #f8f9fa;'>
																			<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																			<th style='text-align: left; padding: 8px;'>Summary</th>
																		</tr>
																	</thead>
																		<tr style='border-bottom: 1px solid #eee;'>
																			<td style='padding: 8px;'><b><a href='https://github.com/marcogulino-mg/finalproject-backoffice/blob/master/src/main/java/com/marco/finalproject/finalproject_backoffice/exceptions/MissingElementException.java'>MissingElementException.java</a></b></td>
																			<td style='padding: 8px;'>- Defines a custom exception to handle cases where a requested element is missing, resulting in an HTTP 404 response<br>- Integrates with the applications error handling to provide clear feedback during REST API interactions, supporting robust and user-friendly error management within the overall backend architecture.</td>
																		</tr>
																	</table>
																</blockquote>
															</details>
															<!-- models Submodule -->
															<details>
																<summary><b>models</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ src.main.java.com.marco.finalproject.finalproject_backoffice.models</b></code>
																	<table style='width: 100%; border-collapse: collapse;'>
																	<thead>
																		<tr style='background-color: #f8f9fa;'>
																			<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																			<th style='text-align: left; padding: 8px;'>Summary</th>
																		</tr>
																	</thead>
																		<tr style='border-bottom: 1px solid #eee;'>
																			<td style='padding: 8px;'><b><a href='https://github.com/marcogulino-mg/finalproject-backoffice/blob/master/src/main/java/com/marco/finalproject/finalproject_backoffice/models/User.java'>User.java</a></b></td>
																			<td style='padding: 8px;'>- Defines the User entity within the applications data model, representing user accounts with associated credentials and roles<br>- Facilitates user management, authentication, and authorization by mapping user data to the database and establishing relationships with roles, supporting role-based access control across the system.</td>
																		</tr>
																		<tr style='border-bottom: 1px solid #eee;'>
																			<td style='padding: 8px;'><b><a href='https://github.com/marcogulino-mg/finalproject-backoffice/blob/master/src/main/java/com/marco/finalproject/finalproject_backoffice/models/Role.java'>Role.java</a></b></td>
																			<td style='padding: 8px;'>- Defines the Role entity within the applications security model, representing user permissions and access levels<br>- Facilitates role management and association with users through a many-to-many relationship, supporting role-based authorization across the system<br>- Integrates with the database to persist role data and supports dynamic user-role assignments within the overall architecture.</td>
																		</tr>
																		<tr style='border-bottom: 1px solid #eee;'>
																			<td style='padding: 8px;'><b><a href='https://github.com/marcogulino-mg/finalproject-backoffice/blob/master/src/main/java/com/marco/finalproject/finalproject_backoffice/models/Console.java'>Console.java</a></b></td>
																			<td style='padding: 8px;'>- Defines the Console entity within the applications data model, representing gaming consoles with attributes like name, publisher, release date, and visual assets<br>- Facilitates database interactions and relationships with associated videogames, enabling structured storage, retrieval, and management of console data in the overall architecture<br>- Supports data integrity and automatic slug generation for URL-friendly identifiers.</td>
																		</tr>
																		<tr style='border-bottom: 1px solid #eee;'>
																			<td style='padding: 8px;'><b><a href='https://github.com/marcogulino-mg/finalproject-backoffice/blob/master/src/main/java/com/marco/finalproject/finalproject_backoffice/models/Videogame.java'>Videogame.java</a></b></td>
																			<td style='padding: 8px;'>- Defines the Videogame entity within the applications data model, representing video game records in the database<br>- Facilitates CRUD operations and enforces data validation, while establishing relationships with console entities<br>- Supports consistent data handling and integrity across the architecture, enabling seamless integration of video game information within the overall system.</td>
																		</tr>
																	</table>
																</blockquote>
															</details>
															<!-- security Submodule -->
															<details>
																<summary><b>security</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ src.main.java.com.marco.finalproject.finalproject_backoffice.security</b></code>
																	<table style='width: 100%; border-collapse: collapse;'>
																	<thead>
																		<tr style='background-color: #f8f9fa;'>
																			<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																			<th style='text-align: left; padding: 8px;'>Summary</th>
																		</tr>
																	</thead>
																		<tr style='border-bottom: 1px solid #eee;'>
																			<td style='padding: 8px;'><b><a href='https://github.com/marcogulino-mg/finalproject-backoffice/blob/master/src/main/java/com/marco/finalproject/finalproject_backoffice/security/DatabaseUserDetails.java'>DatabaseUserDetails.java</a></b></td>
																			<td style='padding: 8px;'>- Defines a custom user details implementation for Spring Security, encapsulating user identity and roles to facilitate authentication and authorization processes within the applications security architecture<br>- It bridges the applications user model with Spring Security's security context, enabling role-based access control and user management.</td>
																		</tr>
																		<tr style='border-bottom: 1px solid #eee;'>
																			<td style='padding: 8px;'><b><a href='https://github.com/marcogulino-mg/finalproject-backoffice/blob/master/src/main/java/com/marco/finalproject/finalproject_backoffice/security/SecurityConfiguration.java'>SecurityConfiguration.java</a></b></td>
																			<td style='padding: 8px;'>- Defines security configurations for the application, managing authentication, authorization, and CORS policies<br>- Facilitates secure access control by permitting public API endpoints while restricting others to admin users<br>- Integrates user details retrieval from the database and employs password encoding to ensure secure user authentication within the overall system architecture.</td>
																		</tr>
																		<tr style='border-bottom: 1px solid #eee;'>
																			<td style='padding: 8px;'><b><a href='https://github.com/marcogulino-mg/finalproject-backoffice/blob/master/src/main/java/com/marco/finalproject/finalproject_backoffice/security/DatabaseUserDetailService.java'>DatabaseUserDetailService.java</a></b></td>
																			<td style='padding: 8px;'>- Provides user authentication support by retrieving user details from the database based on username, enabling secure login processes within the applications security architecture<br>- Integrates with Spring Security to facilitate user validation and authorization, ensuring that only registered users can access protected resources in the overall system.</td>
																		</tr>
																	</table>
																</blockquote>
															</details>
															<!-- services Submodule -->
															<details>
																<summary><b>services</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ src.main.java.com.marco.finalproject.finalproject_backoffice.services</b></code>
																	<table style='width: 100%; border-collapse: collapse;'>
																	<thead>
																		<tr style='background-color: #f8f9fa;'>
																			<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																			<th style='text-align: left; padding: 8px;'>Summary</th>
																		</tr>
																	</thead>
																		<tr style='border-bottom: 1px solid #eee;'>
																			<td style='padding: 8px;'><b><a href='https://github.com/marcogulino-mg/finalproject-backoffice/blob/master/src/main/java/com/marco/finalproject/finalproject_backoffice/services/ConsoleService.java'>ConsoleService.java</a></b></td>
																			<td style='padding: 8px;'>- Provides core services for managing video game consoles within the application, enabling operations such as retrieval, creation, deletion, and search by name or slug<br>- Facilitates seamless integration between the data layer and business logic, ensuring consistent handling of console entities and their associations with video games, thereby supporting the overall architectures focus on efficient content management.</td>
																		</tr>
																		<tr style='border-bottom: 1px solid #eee;'>
																			<td style='padding: 8px;'><b><a href='https://github.com/marcogulino-mg/finalproject-backoffice/blob/master/src/main/java/com/marco/finalproject/finalproject_backoffice/services/VideogameService.java'>VideogameService.java</a></b></td>
																			<td style='padding: 8px;'>- Provides core business logic for managing videogame data within the application<br>- Facilitates retrieval, creation, deletion, and validation of videogame records, supporting seamless integration with the data repository<br>- Serves as a crucial layer that ensures consistent access and manipulation of videogame information, enabling other components to interact with the data model efficiently and reliably.</td>
																		</tr>
																	</table>
																</blockquote>
															</details>
														</blockquote>
													</details>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
					<!-- resources Submodule -->
					<details>
						<summary><b>resources</b></summary>
						<blockquote>
							<div class='directory-path' style='padding: 8px 0; color: #666;'>
								<code><b>⦿ src.main.resources</b></code>
							<!-- templates Submodule -->
							<details>
								<summary><b>templates</b></summary>
								<blockquote>
									<div class='directory-path' style='padding: 8px 0; color: #666;'>
										<code><b>⦿ src.main.resources.templates</b></code>
									<table style='width: 100%; border-collapse: collapse;'>
									<thead>
										<tr style='background-color: #f8f9fa;'>
											<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
											<th style='text-align: left; padding: 8px;'>Summary</th>
										</tr>
									</thead>
										<tr style='border-bottom: 1px solid #eee;'>
											<td style='padding: 8px;'><b><a href='https://github.com/marcogulino-mg/finalproject-backoffice/blob/master/src/main/resources/templates/home.html'>home.html</a></b></td>
											<td style='padding: 8px;'>- Defines the structure of the homepage by assembling a web page layout with dynamic fragments for the head, header, and JavaScript resources<br>- It orchestrates the presentation layer, ensuring consistent inclusion of common UI components and scripts across the application’s main entry point, thereby supporting a cohesive and maintainable user interface within the overall web architecture.</td>
										</tr>
									</table>
									<!-- fragments Submodule -->
									<details>
										<summary><b>fragments</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ src.main.resources.templates.fragments</b></code>
											<table style='width: 100%; border-collapse: collapse;'>
											<thead>
												<tr style='background-color: #f8f9fa;'>
													<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
													<th style='text-align: left; padding: 8px;'>Summary</th>
												</tr>
											</thead>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/marcogulino-mg/finalproject-backoffice/blob/master/src/main/resources/templates/fragments/head.html'>head.html</a></b></td>
													<td style='padding: 8px;'>- Defines a reusable HTML fragment for the document head, centralizing metadata, stylesheet links, and page titles<br>- Facilitates consistent and maintainable inclusion of essential resources across web pages within the application, supporting a cohesive user interface and streamlined template management in the overall project architecture.</td>
												</tr>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/marcogulino-mg/finalproject-backoffice/blob/master/src/main/resources/templates/fragments/header.html'>header.html</a></b></td>
													<td style='padding: 8px;'>- Defines a reusable header fragment that provides consistent navigation, user info display, and search functionality across web pages<br>- Integrates Bootstrap styling and supports dynamic content based on user authentication and page context, ensuring a cohesive and interactive user interface within the overall application architecture.</td>
												</tr>
											</table>
										</blockquote>
									</details>
									<!-- consoles Submodule -->
									<details>
										<summary><b>consoles</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ src.main.resources.templates.consoles</b></code>
											<table style='width: 100%; border-collapse: collapse;'>
											<thead>
												<tr style='background-color: #f8f9fa;'>
													<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
													<th style='text-align: left; padding: 8px;'>Summary</th>
												</tr>
											</thead>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/marcogulino-mg/finalproject-backoffice/blob/master/src/main/resources/templates/consoles/show.html'>show.html</a></b></td>
													<td style='padding: 8px;'>- Render detailed view of a specific console, displaying its key attributes such as name, description, publisher, and release date<br>- Facilitates user interactions for editing or deleting the console, including confirmation modals<br>- Integrates seamlessly within the overall architecture to support intuitive navigation and management of console data within the application.</td>
												</tr>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/marcogulino-mg/finalproject-backoffice/blob/master/src/main/resources/templates/consoles/create-or-edit.html'>create-or-edit.html</a></b></td>
													<td style='padding: 8px;'>- Facilitates creation and editing of console entries within the application interface<br>- Provides a user-friendly form for inputting console details such as name, release date, publisher, description, and related images<br>- Integrates validation feedback to ensure data accuracy, supporting seamless management of console records within the overall system architecture.</td>
												</tr>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/marcogulino-mg/finalproject-backoffice/blob/master/src/main/resources/templates/consoles/index.html'>index.html</a></b></td>
													<td style='padding: 8px;'>- Provides a user interface for managing a collection of gaming consoles, displaying key details and offering options to view, edit, or delete entries<br>- Facilitates interaction with console data through dynamic modals for deletion confirmation, integrating seamlessly into the overall web application architecture to support CRUD operations and enhance user experience.</td>
												</tr>
											</table>
										</blockquote>
									</details>
									<!-- error Submodule -->
									<details>
										<summary><b>error</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ src.main.resources.templates.error</b></code>
											<table style='width: 100%; border-collapse: collapse;'>
											<thead>
												<tr style='background-color: #f8f9fa;'>
													<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
													<th style='text-align: left; padding: 8px;'>Summary</th>
												</tr>
											</thead>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/marcogulino-mg/finalproject-backoffice/blob/master/src/main/resources/templates/error/404.html'>404.html</a></b></td>
													<td style='padding: 8px;'>- Defines the custom 404 error page for the application, providing users with a friendly message and navigation option to return to the homepage<br>- Integrates with the overall web architecture to enhance user experience during navigation errors, ensuring consistent styling and layout across the site’s error handling framework.</td>
												</tr>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/marcogulino-mg/finalproject-backoffice/blob/master/src/main/resources/templates/error/400.html'>400.html</a></b></td>
													<td style='padding: 8px;'>- Defines the custom 400 Bad Request error page, providing users with a clear visual indication of the error and navigation options to return to the homepage<br>- Integrates with the overall web application layout, ensuring consistent styling and user experience during client-side error handling within the applications architecture.</td>
												</tr>
											</table>
										</blockquote>
									</details>
									<!-- videogames Submodule -->
									<details>
										<summary><b>videogames</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ src.main.resources.templates.videogames</b></code>
											<table style='width: 100%; border-collapse: collapse;'>
											<thead>
												<tr style='background-color: #f8f9fa;'>
													<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
													<th style='text-align: left; padding: 8px;'>Summary</th>
												</tr>
											</thead>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/marcogulino-mg/finalproject-backoffice/blob/master/src/main/resources/templates/videogames/show.html'>show.html</a></b></td>
													<td style='padding: 8px;'>- Displays detailed information about a specific video game, including visuals, description, publisher, developer, release date, and supported consoles<br>- Facilitates user interactions such as editing, deleting, and navigation within the application<br>- Serves as the primary view for presenting comprehensive game data, integrating dynamic content rendering and user action modals within the overall web architecture.</td>
												</tr>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/marcogulino-mg/finalproject-backoffice/blob/master/src/main/resources/templates/videogames/create-or-edit.html'>create-or-edit.html</a></b></td>
													<td style='padding: 8px;'>- Facilitates creation and editing of videogame entries through a user-friendly form interface<br>- Integrates form validation, dynamic checkbox selection for consoles, and supports both adding new and modifying existing videogame data within the applications architecture<br>- Ensures seamless data input, validation feedback, and interaction with backend endpoints for persistent storage.</td>
												</tr>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/marcogulino-mg/finalproject-backoffice/blob/master/src/main/resources/templates/videogames/index.html'>index.html</a></b></td>
													<td style='padding: 8px;'>- Render a comprehensive view of the videogame collection, enabling users to browse, create, update, and delete entries seamlessly<br>- It facilitates interaction with the backend to manage videogame data, providing an intuitive interface for viewing details, editing information, and confirming deletions through modal dialogs<br>- This template integrates with the overall architecture to support CRUD operations within the application.</td>
												</tr>
											</table>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
			<!-- test Submodule -->
			<details>
				<summary><b>test</b></summary>
				<blockquote>
					<div class='directory-path' style='padding: 8px 0; color: #666;'>
						<code><b>⦿ src.test</b></code>
					<!-- java Submodule -->
					<details>
						<summary><b>java</b></summary>
						<blockquote>
							<div class='directory-path' style='padding: 8px 0; color: #666;'>
								<code><b>⦿ src.test.java</b></code>
							<!-- com Submodule -->
							<details>
								<summary><b>com</b></summary>
								<blockquote>
									<div class='directory-path' style='padding: 8px 0; color: #666;'>
										<code><b>⦿ src.test.java.com</b></code>
									<!-- marco Submodule -->
									<details>
										<summary><b>marco</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ src.test.java.com.marco</b></code>
											<!-- finalproject Submodule -->
											<details>
												<summary><b>finalproject</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ src.test.java.com.marco.finalproject</b></code>
													<!-- finalproject_backoffice Submodule -->
													<details>
														<summary><b>finalproject_backoffice</b></summary>
														<blockquote>
															<div class='directory-path' style='padding: 8px 0; color: #666;'>
																<code><b>⦿ src.test.java.com.marco.finalproject.finalproject_backoffice</b></code>
															<table style='width: 100%; border-collapse: collapse;'>
															<thead>
																<tr style='background-color: #f8f9fa;'>
																	<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																	<th style='text-align: left; padding: 8px;'>Summary</th>
																</tr>
															</thead>
																<tr style='border-bottom: 1px solid #eee;'>
																	<td style='padding: 8px;'><b><a href='https://github.com/marcogulino-mg/finalproject-backoffice/blob/master/src/test/java/com/marco/finalproject/finalproject_backoffice/FinalprojectBackofficeApplicationTests.java'>FinalprojectBackofficeApplicationTests.java</a></b></td>
																	<td style='padding: 8px;'>- Validates the applications context loading within the overall project architecture, ensuring that the Spring Boot environment initializes correctly<br>- Serves as a foundational test to confirm that core components are properly configured and integrated, supporting reliable startup and operation of the backoffice system<br>- This test helps maintain stability and early detection of configuration issues in the codebase.</td>
																</tr>
															</table>
														</blockquote>
													</details>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
		</blockquote>
	</details>
</details>

---

## 🚀 Getting Started

### 📋 Prerequisites

This project requires the following dependencies:

- **Programming Language:** Java
- **Package Manager:** Maven

### ⚙️ Installation

Build finalproject-backoffice from the source and install dependencies:

1. **Clone the repository:**

    ```sh
    ❯ git clone https://github.com/marcogulino-mg/finalproject-backoffice
    ```

2. **Navigate to the project directory:**

    ```sh
    ❯ cd finalproject-backoffice
    ```

3. **Install the dependencies:**

**Using [maven](https://maven.apache.org/):**

```sh
❯ mvn install
```

### 💻 Usage

Run the project with:

**Using [maven](https://maven.apache.org/):**

```sh
mvn exec:java
```

### 🧪 Testing

Finalproject-backoffice uses the {__test_framework__} test framework. Run the test suite with:

**Using [maven](https://maven.apache.org/):**

```sh
mvn test
```

---

<div align="left"><a href="#top">⬆ Return</a></div>

---
