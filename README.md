
![img.png](assets/img.png)
# JAVA SDK 17 + Intellij IDEA
## Challenge Conversor de Monedas G6 One
### Profesores: Bruno Fernández / Genesys Rondon

<hr>

![Static Badge](https://img.shields.io/badge/Lenguaje-Java%2017-blue)  ![Static Badge](https://img.shields.io/badge/Versi%C3%B3n-Beta-Yellow)  <label><img src="https://img.shields.io/badge/Estatus-En%20Desarrollo-green"></label>
<hr>
    <img src="assets/4373217_java_logo_logos_icon.png" alt="Logo Java" width="200px">
<hr>

### Características del Reto que se personalizarán en esta versión

| Item | Descripción                                                       | Observación |
|------|-------------------------------------------------------------------|-------------|
| 1.   | Será para usuarios que vivan en Colombia                          |             |
|      | por lo que se activaran las monedas que mas interesen en el pais: |             |
|      |                                                                   |             |
|      | 1. Peso Colombiano                                                | COP         |
|      | 2. Bolivar Venezolano                                             | VEF         |
|      | 3. Real Brasilero                                                 | BRL         |
|      | 4. Dolar EEUU, incluye Ecuador                                    | USD         |
|      | 5. Sol Peruano                                                    | PEN         |
|      | 6. Balboa Panameño                                                | PAB         |
|      |                                                                   |             |
| 2.   | La API a usar será la recomendada en el trello.                   |             |
|      | revisando en la documentacion se usará la opcion PAIR de la API   |             |
|      | ejemplo:                                                          |             |
|      | https://v6.exchangerate-api.com/v6/MI_API_KEY/pair/COP/USD        |             |

### Tecnologías Utilizadas

| Item | Descripción             | Razón                               |
|------|-------------------------|-------------------------------------|
| 1    | Java SDK 17             |                                     |
| 2    | Clase Enum para Monedas | Mejora la mantenibilidad del códido |

### Clases

| Item | Descripción           | Observación                                                                            | Tipo  |
|------|-----------------------|----------------------------------------------------------------------------------------|-------|
| 1    | Main                  | Función principal                                                                      | Clase |
| 2    | Menu                  | Contiene los menus de cada caso                                                        | Clase |
| 3    | Monedas               | Contiene las definiciones de las monedas                                               | Enum  |
|      |                       |                                                                                        |       |
| 4    | ConvertirMoneda       | Usa una frase para convertir una moneda en otra                                        | Clase |
| 5    | VerMonedasDisponibles | Usa la clase Monedas para mostrar un listado de las monedas disponibles                | Clase |
|      |                       |                                                                                        |       |
|      | API_KEY               | es necesario crear esa variable en las variables de entorno con su valor de la API key |       |

### Menú Principal
![img.png](src/img/img.png)

### Menú convertir un monto
![img_1.png](src/img/img_1.png)

### Menú ver monedas disponibles
![img_2.png](src/img/img_2.png)

### Menú salir
![img_3.png](src/img/img_3.png)