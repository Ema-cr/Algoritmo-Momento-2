# 🛒 Caja Registradora - Catálogo Local

Un programa en Java que simula una **caja registradora**: el cliente elige productos de un menú, y al terminar la compra el programa calcula el descuento, el IVA y el total a pagar. 💸

> 📌 Proyecto **CAT-004** · Módulo de Ventas Iterativo con Estadísticas de Catálogo

---

## ✨ ¿Qué hace?

1. Muestra un **menú** con 3 productos y una opción para finalizar.
2. Deja comprar **todos los productos que quieras**: el menú se repite hasta que elijas finalizar.
3. Va sumando el **total** de tu compra a medida que eliges.
4. Al finalizar, calcula automáticamente:
   - 🎁 el **descuento** (si aplica)
   - 🧾 el **IVA**
   - 💰 el **total a pagar**
   - ⭐ el **porcentaje de productos premium** que compraste

---

## 🧺 Productos disponibles

| Opción | Producto | Precio |
|:---:|---|---:|
| 1 | Producto Básico | $20,000 |
| 2 | Producto Medio | $50,000 |
| 3 | Producto Premium | $90,000 |
| 4 | Finalizar compra | — |

Si escribes cualquier otro número, el programa te avisa que la opción es **inválida** y te vuelve a mostrar el menú.

---

## 📏 Las reglas de la caja

- 🎁 **Descuento del 10%** solo si la compra **supera** los $100,000.
- 🧾 **IVA del 19%**, calculado sobre el valor **ya con descuento**.
- ⭐ Al final se muestra qué porcentaje de tus artículos fueron **premium**.
- 🛡️ Si no compras nada y finalizas de inmediato, el programa no falla: muestra `0.0%`.

---

## 🧪 Ejemplo

Un cliente compra un **básico**, un **premium** y otro **básico**, y finaliza:

| Concepto | Valor |
|---|---:|
| Compra total | $130,000 |
| Descuento (10%) | -$13,000 |
| Total con descuento | $117,000 |
| IVA (19%) | $22,230 |
| **Total a pagar** | **$139,230** |
| Productos premium | 33.33% (1 de 3) |

---

## ▶️ ¿Cómo ejecutarlo?

### Lo que necesitas
- ☕ Tener **Java (JDK)** instalado. Para comprobarlo, abre una terminal y escribe:
  ```
  java -version
  ```

### Opción 1: desde la terminal
1. Abre una terminal en la carpeta donde está el archivo `App.java`.
2. Compila el programa:
   ```
   javac App.java
   ```
3. Ejecútalo:
   ```
   java App
   ```

### Opción 2: desde VS Code
1. Abre la carpeta del proyecto en **Visual Studio Code**.
2. Instala la extensión **Extension Pack for Java** (si no la tienes).
3. Abre `App.java` y presiona el botón **▶ Run** que aparece arriba del `main`.

---

## 🎮 ¿Cómo se usa?

1. Aparece el menú. Escribe el **número** del producto que quieres y presiona **Enter**.
2. El programa te muestra cuánto **llevas** acumulado.
3. Repite todas las veces que quieras.
4. Escribe **4** para finalizar y ver tu factura. 🧾

---

## 🧰 Qué se practicó en este proyecto

- Ciclo `do-while` para mantener la caja abierta
- Condicionales `if / else if / else`
- Lectura de datos con `Scanner`
- Constantes (`final`) en lugar de números sueltos
- Prevención de la división por cero
- Uso del cast `(double)` para calcular porcentajes
- Control de versiones con Git (3 commits)

---
