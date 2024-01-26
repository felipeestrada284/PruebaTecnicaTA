# **Prueba Técnica TA**

## **Descripción del Proyecto**
Este es un proyecto de automatización de pruebas de aceptación usando **Java** como lenguaje de desarrollo, además se implementa el patrón **Screenplay** 
para la escritura de pruebas usando el core de **Serenity**. En este proyecto los requerimientos se escriben en lenguaje **Gherkin** con la implementación 
de **Cucumber** para Java.

Las pruebas están centradas en el sitio web (https://demoqa.com/) con los siguientes escenarios:

- **Verificar el formulario de registro**:
- **Verificar la funcionalidad de los enlaces**
- **Verificar la funcionalidad del carrusel**:

## **Instrucciones de Instalación**
Para garantizar un funcionamiento óptimo, siga las instrucciones de instalación a continuación.

**Requisitos Previos**:
- IntelliJ IDEA
- JDK 11 y JDK (variables de entorno configuradas).
- Gradle 8.2 (variables de entorno configuradas).
- Cucumber for Java Plugin
- Gherkin Plugin

## **Ejecutar pruebas**

La herramienta de compilación de código y administrador de dependencias para este proyecto es **Gradle**, así que pare ejecutar las pruebas use el siguiente 
comando en la raíz del proyecto.

	gradle clean test aggregate -i

Si desea ejecutar algún Runner especifico puede usar el siguiente comando, por ejemplo para el Formulario de registro.

    gradle clean test --tests "PracticeFormRunner"

## **Navegador Web**
Actualmente la automatización ejecuta por defecto con MicrosoftEdge.

## **Ver los informes**
El comando proporcionado anteriormente para la ejecución de las pruebas, generará un informe de prueba de Serenity **index.html** en el directorio target/site/serenity. 

## **Construido con**
La automatización fue desarrollada con:
- BDD - Estrategia de desarrollo basada en el comportamiento
- Screenplay - Patrón de diseño de escritura de pruebas
- Gradle - Administrador del proyecto, dependencias y plugins
- Selenium Web Driver - Herramienta para interactuar con navegadores web
- Cucumber - Implementación de lenguaje Gherkin para java
- Serenity BDD - Librería de código abierto para escribir pruebas de aceptación automatizadas
- Gherkin - Lenguaje DSL de lectura empresarial (lenguaje específico de dominio)

## **Versionamiento**
Se usó Git para el control de versiones.

## **Autor**

**Felipe Estarda** - [felipeestrada284@gmail.com]()