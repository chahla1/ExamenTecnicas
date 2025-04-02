https://github.com/chahla1/ExamenTecnicas.git

#Ejercicio 2:

En la representacion de un laberinto, los nodos representan las habitaciones, intersecciones o puntos clave del laberinto. Cada nodo simboliza una ubicacion en la que se puede estar dentro del laberinto;
y las aristas representan los pasillos o caminos que conectan dos habitaciones. Si existe una arista entre dos nodos, significa que se puede ir de una habitación a otra directamente.

#Ejercicio5

Si tuviera que implementar un codigo avido para el proceso, lo que haria seria lo siguiente:
Ordenaria a las personas segun el nivel de cariño, de mayor a menor, priorizando a los que mas quiero.
Seleccionaria a los primeros P de la lista, que son los que caben en el coche. Asique, en ese caso, entrarian primero a los que les tengo mas cariño, como por ejemplo a la esposa.

#Ejercicio8

En la pila, se almacenan el metodo main, ya que se declara la variable p, y el metodo imprimePersona, ya que es una copia de la referencia p.
En el Heap, se almacena el objeto nwe Persona(); ya que crea una instancia de Persona.
Se inserta cuando la referencia p se almacena en la pila cuando se declara en main() y cuando el objeto Persona se crea en el Heap.
Se liberan cuando imprimePersona() termina y cuando main() termina de finalizarse.

#Ejercicio9

El GC funciona en segundo plano buscando objetos sin referencias y los elimina cuando le da la gana. Es facil de usar y evita errores, pero puede hacer pausas molestas y usa mas memoria.
En cambio, el ARC cuenta cuantas referencias tiene un objeto y lo elimina en cuanto llega a 0. Es mas eficiente y predecible, pero puede causar problemas si hay referencias circulares, porque nunca llegan a 0.

#Ejercicio10

@SuppressWarnings: Se usa en tiempo de compilacion para evitar advertencias sobre codigo obsoleto. Sirve cuando quiero que el compilador deje de molestar con advertencias.

@Deprecated: Se usa en tiempo de compilacion y ejecucion. Marca un metodo o clase como obsoleto, indicando que no se debe usar porque hay algo mejor o va a desaparecer en futuras versiones.

@Override: Se usa en tiempo de compilacion. Indica que un metodo está sobrescribiendo uno de la superclase. Si me equivoco en la firma del metodo, el compilador me avisa.

@Test: Se usa en tiempo de ejecucion. Marca un metodo como una prueba unitaria en JUnit, así puedo ejecutarlo automaticamente sin necesidad de un main().

