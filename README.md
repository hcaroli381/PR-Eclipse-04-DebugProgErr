# 🐞 Práctica: Depuración de código en Eclipse

## Objetivo

* Usar el **depurador** de Eclipse (breakpoints, Resume, Step Over/Into/Return).
* Observar **variables** y **flujo** de ejecución.
* **Encontrar y describir** errores (compilación, ejecución o lógica) y corregirlos.
* Entregar evidencias (capturas) + código corregido.

---

## 1. Errores  

- Los errores que he encontrado es que a veces da mal la media, la operacion que hace por lo tanto no sirve para todos los casos. Además siempre pide un alumno de mas , por ejemplo si ponemos 2 alumnos, el programa nos pedirá 0, 1 y 2 que suman 3 alumnos. Y por último, aunque pongamos una nota fuera de rango esta se sumara al contador y pasaremos al siguiente alumno
---
## 2. Como los encontré   

- En mi caso me gusta mucho utilizar la tecla f6, que me marca por la linea que voy mientras puedo ver en la ista de variables como cambia el valor de las mismas, asi vi que el contador sumaba 1 de más siempre y que esto generaba que la media tambien fuese erronea. Tambien comprobe que aunque el sysout existía nada paraba al programa a la hora de seguir bajando, y por lo tanto seguir sumando al counter y asignar la nota a nuestros alumnos.
---

## 3. Solucion
- Me doy cuenta de que contador sigue hasta el numero de alumnos empezando desde 0, cambiamos el <= por <. Para que la nota no se sume cuando es invalida añadimos al else a la condicion que nos marca cuando la misma esta fuera de rango.

## 4. Breakpoint condicional      

- Añadimos la expresion contraria al if para configurar el breakpoint con condicion
---
## 5. Expressions     

- En su apartado podemos añadir o variables o expresiones a las que visualizar
   
   ---
## 6. Templates  

- En el menú de Templates dentro de Window podemos crear un preset, por así decirlo, que sirva para automatizar en este caso el pedir una nota.

  ---
