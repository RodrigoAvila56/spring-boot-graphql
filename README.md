<a name="readme-top"></a>

# Spring Boot GraphQL

> Description.
Este proyecto es una API desarrollada con Spring Boot e implementa GraphQL para ofrecer un enfoque eficiente y flexible en el acceso a datos. La aplicación gestiona dos entidades principales: Course y Student, permitiendo realizar operaciones CRUD a través de consultas GraphQL.

## Built With

-- Java 

-- Spring Boot 

-- GraphQL Spring Boot Starter

-- Spring Data JPA (Persistencia)

-- Base de datos Mysql

-- Maven (Gestión de dependencias)


<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Arquitectura del Proyecto
Este proyecto sigue una arquitectura en capas bien definida:

--Controladores (GraphQL Resolvers): Los controladores están implementados como resolvers de GraphQL, manejando las consultas y mutaciones que permiten interactuar con las entidades Course y Student.

--Capa de Entidades: Dos entidades principales:

--Course: Representa un curso, con atributos como id, name, y description.

--Student: Representa a un estudiante, con atributos como id, firstName, y lastName.

--Capa de Servicio: La lógica de negocio está encapsulada en la capa de servicio, lo que permite mantener un código modular y reutilizable.

--Capa de Persistencia: Utiliza Spring Data JPA para interactuar con la base de datos y gestionar las operaciones CRUD de manera eficiente.

## Authors

👤 **Author1**

- GitHub:https://github.com/RodrigoAvila56
- LinkedIn:https://www.linkedin.com/in/rodrigo-avila-76068729a/

## 🤝 Contributing

Las contribuciones son bienvenidas. Si tienes sugerencias o mejoras, no dudes en abrir un issue o hacer un pull request.

## Show your support

Give a ⭐️ if you like this project!

