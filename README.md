¿Qué es JDK y para qué se utiliza?
- Son las herramientas de desarrollo que se encargan de compilar, ejecutar y generar el codigo de Java

¿Qué es la reflexión en Java y para qué se utiliza?
- La reflexion es la habilidad que tiene java de inspeccionar codigo en el mismo sistema en tiempo real

¿Cómo manejas excepciones en Java?
- En Java se utiliza el try-catch para capturar errores al ejecutar el codigo

¿Qué tipo de arquitectura manejas en Java?
- Estoy mas familiarizado con MVC, ya que la he implementado en varios proyectos personales. Tambien he trabajado con Microservicios
¿Qué es la Garbage Collection en Java?
- Java utiliza el garbage collector para deshacerse de objetos que ya no estan en uso

##  Tecnologías

- Java 8
- Spring Boot 2.7.18
- MyBatis 2.2.2
- Oracle Database (en Docker)
- Maven

## Estructura

- `model/` – Entidades (`Book`, `Student`, `Loan`)
- `repository/` – Interfaces de MyBatis
- `mapper/` – Archivos XML con las consultas SQL
- `service/` – Lógica de negocio
- `controller/` – Endpoints REST

## Cómo correr el proyecto

1. Asegurate de tener Docker corriendo:

- docker compose up -d

2. Configurá la conexión en src/main/resources/application.properties:

  spring.datasource.url=jdbc:oracle:thin:@localhost:1521/XEPDB1
  spring.datasource.username=miq
  spring.datasource.password=12345

3. Compilá y ejecutá:

  mvn clean install
  mvn spring-boot:run
