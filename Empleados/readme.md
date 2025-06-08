# 👩‍💼 Sistema de Pago de Empleados en Java

Este proyecto es una simulación simple de cómo calcular el sueldo total de un empleado, considerando sueldo base, pago por horas extra, y deducciones por ISR (Impuesto Sobre la Renta).

Este código representa uno de mis **primeros ejercicios con Programación Orientada a Objetos (OOP)** y uso de funciones, atributos y lógica condicional. Fue un buen reto y una excelente práctica.

---

## 🧾 ¿Qué hace el programa?

El código define una clase `Empleado` con métodos que permiten:

- Calcular el pago por horas extra
- Ajustar la tasa de ISR si el empleado está casado o tiene hijos
- Calcular el pago total después de deducciones
- Imprimir los datos relevantes del empleado

---

## 🧠 Cosas que aprendí y practiqué

- Creación de clases y objetos en Java
- Uso de métodos con parámetros
- Encapsulamiento de lógica en funciones (`pago_horas()`, `pago()`, `impresion()`)
- Operadores aritméticos y condicionales
- Diferencias entre `==` y `.equals()` (¡ojo! aún falta corregirlo 👀)

---

## 🛠 Estructura de la Clase

### Atributos:
- `RFC`: Identificador del empleado
- `Nombre`: Nombre del empleado
- `Sueldo`: Sueldo base
- `Pago_Hora`: Pago por hora extra
- `Horas_Extras`: Horas trabajadas fuera del horario regular
- `ISR`: Porcentaje de deducción por impuestos
- `Casado`: Si el empleado está casado (`"si"` o `"no"`)
- `Hijos`: Número de hijos
- `Pago`: Pago total después de cálculos

### Métodos:
- `Datos()`: Carga los datos económicos del empleado
- `pago_horas()`: Calcula el monto por horas extra
- `pago()`: Aplica deducciones y calcula el pago neto
- `impresion()`: Muestra toda la información del empleado

---

## 💡 Nota importante

Actualmente el programa compara `Casado == "si"` con `==`, lo cual en Java no es seguro. Lo ideal sería:

```java
if ("si".equalsIgnoreCase(Casado)) {
   // correcto
}
Este código me costó sangre, sudor y muchas risas de frustración pero también me enseñó a confiar en que sí puedo resolver cosas con lógica y esfuerzo. Es parte de mi evolución como programadora y me recuerda que cada línea de código tiene un poco de mi crecimiento