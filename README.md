# Noticias deportivas

## Descripción
Una aplicación de consola desarrollada en Java para gestionar una redacción de noticias deportivas. La aplicación permite
gestionar redactores y sus noticias, así como calcular el precio y la puntuación de cada noticia según las reglas 
definidas para cada deporte.

## 📌 Enunciado del ejercicio
El objetivo de este ejercicio es desarrollar un sistema de gestión de noticias deportivas aplicando conceptos de 
programación orientada a objetos en Java.

La aplicación representa una redacción en la que se pueden registrar redactores y asociarlos a noticias de diferentes 
deportes. Cada noticia tiene características específicas que determinan su precio y su puntuación.

El ejercicio abarca fútbol, baloncesto, tenis, Fórmula 1 y motociclismo.

## ✨ Características
- **Gestión de redactores:** Añadir y eliminar redactores.
- **Gestión de noticias:** Crear noticias, asociarlas a un redactor y eliminar noticias existentes.
- **Consulta de noticias:** Mostrar las noticias asociadas a un redactor o recuperar las noticias de todos los redactores.
- **Cálculo del precio:** Calcular el precio de cada noticia según su deporte y las características relevantes, como la 
competición, el club, el jugador o el equipo.
- **Cálculo de la puntuación:** Calcular la puntuación de cada noticia según las reglas establecidas para cada deporte.
- **Menú interactivo:** Acceder a las funcionalidades de la aplicación mediante un menú de consola.


## 🧩 Investigación
- **Herencia y abstracción:** La clase abstracta `News` define la estructura común de los diferentes tipos de noticias, 
implementados por las clases `Football`, `Basketball`, `Tennis`, `F1` y `Motorcycling`.
- **Polimorfismo:** Las subclases sobrescriben los métodos `calculatePriceNews()` y `calculateScoreNews()` para 
implementar las reglas de cálculo específicas de cada deporte.
- **Encapsulación:** Los atributos privados controlan el acceso directo a los datos gestionados por cada clase.
- **Atributos estáticos y constantes:** El atributo `salary` representa el salario común de los redactores, mientras que
las constantes `static final` definen valores fijos utilizados en los cálculos del precio y la puntuación.
- **Relaciones entre objetos:** Las noticias están asociadas a los redactores, lo que permite que cada redactor gestione
sus propias noticias.
- **Colecciones:** Se utiliza `ArrayList` para almacenar y gestionar redactores y noticias.