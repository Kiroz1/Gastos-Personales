# 💰 Sistema de Gestión de Gastos Personales

Aplicación web desarrollada con **Spring Boot** que permite registrar, consultar, editar y eliminar gastos personales.
Este proyecto fue creado con fines de **aprendizaje y portafolio**, implementando un CRUD completo con arquitectura MVC.

---

## 🚀 Tecnologías utilizadas

* Java 17
* Spring Boot
* Spring Data JPA
* H2 Database
* Thymeleaf
* Maven
* HTML5 / CSS3

Framework principal:

* Spring Boot

Base de datos utilizada:

* H2 Database (en memoria para desarrollo)

---

## 📂 Arquitectura del proyecto

El proyecto sigue una arquitectura **MVC (Model - View - Controller)**:

src/main/java

controller → Controladores de la aplicación
service → Lógica de negocio
repository → Acceso a datos (JPA Repository)
model → Entidades del sistema

src/main/resources

templates → Vistas HTML (Thymeleaf)
static → Recursos estáticos (CSS, JS)

---

## ⚙️ Funcionalidades actuales

* Registrar gastos
* Listar gastos registrados
* Editar gastos
* Eliminar gastos
* Persistencia de datos con JPA
* Interfaz web con Thymeleaf
* Base de datos en memoria H2

---

## 🖥️ Ejecución del proyecto

### 1️⃣ Clonar el repositorio

git clone https://github.com/tuusuario/gastos-personales.git

### 2️⃣ Compilar el proyecto

./mvnw clean package -DskipTests

### 3️⃣ Ejecutar la aplicación

java -jar target/gastos-personales-0.0.1-SNAPSHOT.jar

Luego abrir en el navegador:

http://localhost:8080

---

## 🗄️ Consola de base de datos

La base de datos H2 puede visualizarse en:

http://localhost:8080/h2-console

Configuración típica:

JDBC URL: jdbc:h2:mem:testdb
User: sa
Password: (vacío)

---

## 📸 Capturas (pendiente)

Próximamente se agregarán capturas de la aplicación funcionando.

---

## 🔧 Mejoras planificadas

Este proyecto continuará evolucionando.
Próximas mejoras:

* Implementación de **Bootstrap** para mejorar la interfaz
* Diseño responsive
* Filtros de gastos por fecha o categoría
* Dashboard con estadísticas de gastos
* Gráficas de análisis de gastos
* Mejoras en validación de formularios
* Refactorización del frontend

---

## 🎯 Objetivo del proyecto

El objetivo de este proyecto es practicar:

* Desarrollo backend con Spring Boot
* Implementación de CRUD con JPA
* Arquitectura MVC
* Integración entre backend y frontend
* Buenas prácticas para proyectos Java

---

## 👨‍💻 Autor

Miguel Quiroz

Proyecto desarrollado como parte de mi aprendizaje en **Java y Spring Boot**.

---

## 📄 Licencia

Este proyecto se encuentra disponible con fines educativos y de portafolio.
