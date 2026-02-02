# 💳 Alke Wallet: Sistema de Billetera Digital

¡Bienvenido a **Alke Wallet**! Esta es una aplicación robusta de consola desarrollada en **Java**. El proyecto simula el funcionamiento de una billetera virtual, permitiendo la gestión de fondos, seguridad mediante PIN y conversión de divisas en tiempo real.

---

## 🎯 Objetivo del Proyecto

El objetivo principal es demostrar el dominio de los pilares de la **Programación Orientada a Objetos (POO)** y la correcta estructuración de un proyecto Java utilizando paquetes (packages) y pruebas unitarias.

---

## 🚀 Funcionalidades Principales:

- **Gestión de Cuentas:** Creación de cuentas con titular y saldo inicial.
- **Operaciones Financieras:** Depósitos y retiros en Pesos Chilenos (CLP).
- **Control de Riesgo:** Límite de retiro diario automatizado de **$200.000 CLP**.
- **Conversión de Divisas:** Consulta de saldo equivalente en Dólares (USD) mediante un servicio dedicado.
- **Persistencia de Datos:** Exportación del historial de movimientos a un archivo físico `.txt`.

---

## 🏗️ Arquitectura y Diseño

El proyecto sigue una estructura de **Separación por Capas**:

1.  **`principal`**: Contiene la lógica del menú e interacción con el usuario.
2.  **`modelo`**: Contiene la lógica de negocio y los datos (`CuentaBase` y `Cuenta`).
3.  **`servicio`**: Contiene utilidades de soporte como el `Conversor` de moneda.

### Conceptos de POO Aplicados:

* **Abstracción:** Uso de la clase `CuentaBase` para definir el contrato de una cuenta.
* **Herencia:** `Cuenta` extiende de `CuentaBase` para especializar el comportamiento.
* **Encapsulamiento:** Atributos protegidos (`protected`) y privados (`private`) con acceso mediante métodos públicos.
* **Polimorfismo:** Sobrescritura de métodos (`@Override`) para personalizar la lógica de retiro.


## 📊 Diagrama de Clases (UML)

<img width="3879" height="2365" alt="Duck Fish Zebra Flow Model-2026-02-01-213533" src="https://github.com/user-attachments/assets/01335e8d-5acd-454b-a56e-b1e9715ba0f1" />

---

## 📂 Estructura del proyecto.

<img width="670" height="255" alt="Estructura" src="https://github.com/user-attachments/assets/27d78866-f8cb-44a8-9191-99a089a4ee21" />



## 🧪 Pruebas Unitarias
Se implementaron pruebas automáticas utilizando JUnit 5 para asegurar la integridad de los datos:

✅ Validación de depósitos correctos.
✅ Bloqueo de retiros que exceden el saldo disponible.
✅ Validación del límite diario de retiro ($200.000).
✅ Precisión en la conversión de moneda CLP/USD.

## 🛠️ Tecnologías Utilizadas:

* Lenguaje: Java 25.0.1
* IDE: Eclipse IDE
* Gestión de Pruebas: JUnit 5
* Documentación: Mermaid.js
* Control de Versiones: Git / GitHub


3. Diagrama de Flujo de Datos
Este diagrama ayuda a explicar cómo viaja la información desde que el usuario presiona una tecla hasta que se guarda en el archivo.

4. Guía de Instalación y Ejecución
Esto es vital para que el profesor sepa cómo probar tu trabajo:

Requisitos: Tener instalado Java 17 y Eclipse IDE.

Importación: * Abrir Eclipse.

File > Import > General > Existing Projects into Workspace.

Seleccionar la carpeta del proyecto.

Ejecución:

Clic derecho en Principal.java > Run As > Java Application.

Pruebas:

Clic derecho en CuentaTest.java > Run As > JUnit Test.

---

## 👤 Autor
Camila Fernanda Torres Reyes, estudiante curso Desarrollo de Aplicaciones Móviles Android Trainee.

---

## 📚 Fuentes de Información y Referencias
Para la realización de este proyecto, se consultaron las siguientes fuentes técnicas y académicas:

1. Documentación Oficial de Java (Oracle):
  * Se utilizó como guía principal para la implementación de Clases Abstractas, Herencia y el uso de la clase ArrayList.
  * Referencia: Java SE Documentation.

2. Documentación de JUnit 5:

  *  Fuente clave para estructurar las pruebas unitarias y entender el uso de las aserciones (assertEquals).
  *  Referencia: JUnit 5 User Guide.

3. Estándares de Diseño de Software (POO):

  * Se aplicaron los principios de Encapsulamiento y Abstracción basados en la bibliografía clásica de Programación Orientada a Objetos.

4. Soporte de Inteligencia Artificial (Gemini):

  - Se utilizó IA de Google (Gemini) como tutor y colaborador técnico para:
  *  Refinar la estructura de los paquetes (principal, modelo, servicio).
  *  Generar diagramas en formato Mermaid para la documentación técnica.
  *  Revisar la lógica de negocio del límite diario de retiro.

***Nota: La IA actuó como una herramienta de guía y corrección, mientras que la implementación y lógica final fue implementada por la autora del proyecto***.

5. Mermaid.js Documentation:

  *  Para la creación del diagrama de clases UML integrado en el README.

6. Clases sincrónicas del curso:

   * Atención a clases y realización de ejercicios a base del Github del curso
   * https://github.com/patricioyaneza/Android2025_G1/tree/main/Modulo%202
     
---

## 🎓NOTAS

Este proyecto fue desarrollado con **fines estrictamente educativos** como parte del proceso de formación en desarrollo de software. Su propósito es aplicar de manera práctica los conocimientos adquiridos sobre lógica de programación creación de códigos y aplicar todo el contenido visto por el momento.
