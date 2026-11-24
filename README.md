# Ejercicio: Clases internas y anidadas

## 📌 Descripción

Este ejercicio consiste en crear una clase `Casa` que contiene dos tipos de clases anidadas: una clase interna no estática llamada `Habitacion` y una clase anidada estática llamada `Constructora`.

Se trabaja la diferencia entre ambas y su relación con la clase principal.

## ⚙️ Funcionamiento

La clase `Casa` contiene el atributo privado `direccion` y dos clases anidadas:

- **Habitacion:** es una clase interna no estática que contiene el atributo `nombre` y un método `imprimir()` que muestra el nombre de la habitación y la dirección de la casa.
- **Constructora:** es una clase anidada estática pública que contiene el atributo `nombre`.

## 🧪 Pruebas realizadas

En la clase `Main` se realizan las siguientes operaciones:

1. Crear un objeto `Casa`.
2. Crear una habitación utilizando `casa.new Habitacion("Salón")`.
3. Llamar al método `imprimir()` para mostrar la habitación y la dirección de la casa.
4. Crear una constructora utilizando `new Casa.Constructora("Obras Sur")`, sin necesidad de crear una casa.
