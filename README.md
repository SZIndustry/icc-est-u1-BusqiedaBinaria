
# Práctica de Método de busqueda Binaria

## 📌 Información General

- **Título:** Práctica de Metodos de Busqueda
- **Asignatura:** Estructura de Datos
- **Carrera:** Computación
- **Estudiante:** Cristopher Salinas
- **Fecha:** 21/04/2025
- **Profesor:** Ing. Pablo Torres

---

## 🛠️ Descripción

Aplicación que recibe un arreglo de personas con dos atributos (Edad y nombre) y un elemnto que es la edad a buscar con un esquema referente:

• Entrada:  
o Arreglo ingresado por teclado. 

o Ordenar el arreglo con el método que desee.  

• Salida:  
o Arreglo en cada búsqueda, alto, bajo, valor de centro.   
o Elemento encontrado o no.  
o Indicar si va a buscar en el subarreglo de la derecha o izquierda.  

---

## 🚀 Ejecución

Para ejecutar el proyecto:

1. Compila el código:
    ```bash
    javac App.java
    ```
2. Ejecuta la aplicación:
    ```bash
    java App
    ```
3. Ingresa la cantidad de personas
    ```bash
    Ingrese la cantidad de personas:
    ```
5. Ingresa los datos:
    ```bash
    Nombre:
    Edad:
    ```
2. Edad a buscar:
    ```bash
    Ingrese la edad que desea buscar:
    ```

---

## 🧑‍💻 Ejemplo de SALIDA 


8 | 4 | 5 | 9 | 12 | 18 | 25 | 40 | 60

bajo=0 alto=8 centro=4 valorCentro=12 --> DERECHA

18 | 25 | 40 | 60

bajo=5 alto=8 centro=6 valorCentro=25 --> IZQUIERDA

18 |

bajo=5 alto=5 centro=5 valorCentro=18 --> ENCONTRADO

La persona con la edad 18 es Pablo


---
