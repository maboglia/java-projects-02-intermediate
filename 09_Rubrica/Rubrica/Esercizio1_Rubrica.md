
# Esercizio Rubrica


Progettare ed implementare un programma che possa gestire una rubrIca
che contiene delle voci.

Le voci sono definite da nome, cognome e numero di telefono.

Quando si crea un oggetto Rubrica si deve fornire un titolo che è
poi accessibile tramite il metodo **getTitolo()**.
 
L'inserimento di una nuova voce nella rubrica avviene tramite il metodo
**aggiungi()** che
riceve tre parametri stringa: nome, cognome, e telefono.

Per accedere al primo elemento della rubrica si utilizza il metodo **primo()** che restituisce una
stringa contenente nome, congnome e telefono separati da uno spazio.

Per accedere ad un elemento qualsiasi nella rubrica si utilizza il
metodo **voce()** che
riceve come parametro il numero d'ordine della voce (a partire da 1,
perciò **primo()** == voce(1));
il formato della stringa restituita è lo stesso del metodo
precedente.

Il metodo **elenco()**
restituisce una stringa con l'elenco delle voci della rubrica separate
da ", "; l'elenco inizia con "(" e termina con ")".

Infine, il metodo **ricerca()** restituisce
la stringa corrispondente alla prima voce che contiene il parametro
come nome, cognome oppure telefono.

Utilizzare come base di partenza la classe Rubricache si trova nel
package rubrica.


