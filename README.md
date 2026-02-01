# 💳 Alke Wallet: Sistema de Billetera Digital

¡Bienvenido a **Alkewallet**! Esta es una aplicación robusta de consola desarrollada en **Java**. El proyecto simula el funcionamiento de una billetera virtual, permitiendo la gestión de fondos, seguridad mediante PIN y conversión de divisas en tiempo real.

---

## 🎯 Objetivo del Proyecto

El objetivo principal es demostrar el dominio de los pilares de la **Programación Orientada a Objetos (POO)** y la correcta estructuración de un proyecto Java utilizando paquetes (packages) y pruebas unitarias.

---

## 🚀 Funcionalidades Principales:

- **Gestión de Cuentas:** Creación de cuentas con titular y saldo inicial.
- **Seguridad:** Acceso restringido mediante PIN de seguridad.
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

## 🧪 Pruebas Unitarias
Se implementaron pruebas automáticas utilizando JUnit 5 para asegurar la integridad de los datos:

✅ Validación de depósitos correctos.
✅ Bloqueo de retiros que exceden el saldo disponible.
✅ Validación del límite diario de retiro ($200.000).
✅ Precisión en la conversión de moneda CLP/USD.

## 🛠️ Tecnologías Utilizadas:

* Lenguaje: Java 25.0.1
* IDE: Eclipse IDEGestión de Pruebas: JUnit 5
* Documentación: Mermaid.js
* Control de Versiones: Git / GitHub

---

👤 Autor
Camila Fernanda Torres Reyes, estudiante curso Desarrollo de Aplicaciones Móviles Android Trainee.

---

## 🎓NOTAS

Este proyecto fue desarrollado con **fines estrictamente educativos** como parte del proceso de formación en desarrollo de software. Su propósito es aplicar de manera práctica los conocimientos adquiridos sobre lógica de programación creación de códigos y aplicar todo el contenido visto por el momento.
