# Esercizio distributore automatico

Realizzare un sistema per la gestione di un distributore
automatico di bibite fresche. Tale sistema deve fare
fronte alle seguenti richieste:

1. Bevande
   Il distributore automatico può gestire diversi tipi di
   bevande.  Ogni bevanda è caratterizzata dal nome
   (univoco) e dal prezzo di vendita. Per esempio:
   
   Nome bevanda|Prezzo di vendita
   ---|---
   Chinotto|1.2
   Gazosa|0.7
   Birra|1.3
   
   Il metodo aggiungiBevanda() della classe
   DistributoreAutomatico consente all'amministratore del
   sistema di aggiungere la descrizione di una nuova
   bevanda. Per ottenere il prezzo di una bevanda, si
   fornisce il metodo ottieniPrezzo(). Se viene richiesto
   il prezzo di una bevanda inesistente, il metodo
   restituisce un codice di errore (per esempio -1).

2. Schede prepagate
   Il distributore automatico funziona per mezzo di schede
   prepagate. Ogni scheda è caratterizzata da un id
   univoco (numero intero) ed il credito disponibile.
   Per esempio:
   Id Scheda|Credito
   ---|---
   76|9.50
   12|5.70
   23|2.90
   Le schede vengono ricaricate attraverso il metoto
   ricaricaScheda() della classe DistributoreAutomatico.
   Se viene inserito il codice di una scheda inesistente,
   una nuova scheda viene generata. E' inoltre possibile
   richiedere il credito di ciscuna scheda attraverso il
   metodo verificaCredito(). Se viene inserito l'id di una
   scheda inesistente, il metodo restituisce un codice di
   errore (per esempio -1).

3. Ricarica del distributore
   Il distributore è strutturato su 4 colonne, ciascuna
   delle quali è caratterizzata da un tipo particolare di
   bevanda e dal numero di lattine presenti.
   La stessa bevanda può essere presente su più colonne
   (ma ogni colonna contiene soltanto un tipo di bevanda).
   Allo startup del sistema le colonne sono vuote.
   Per caricare le colonne, si stabilisce il tipo di
   bevanda da inserire e la quantità di lattine.
   Per far ciò si utilizza il metodo ricaricaColonna().
   Le colonne sono numerate a partire da 1. Per esempio:
   
   Numero colonna|Nome bevanda|Numero di lattine
   ---|---|---
   1|Chinotto|20
   2|Birra|15
   3|Chinotto|20
   4|Gazosa|10

   Dato il nome della bevanda (es. Chinotto) è possibile
   conoscere, attraverso il metodo lattineDisponibili(),
   la quantita totale di lattine disponibile per quella
   bevanda.
    
4. Vendita
   Il distributore automatico vende un prodotto quando si
   specifica il nome della bevanda e l'id della scheda
   prepagata. Il metodo vendi() restituisce la colonna da
   dove la lattina è stata prelevata. Se i codici non sono
   validi (bevanda o scheda), oppure la bevanda selezionata
   è esaurita, o ancora il credito sulla scheda prepagata
   non è sufficiente per comprare la bevanda richiesta,
   il sistema restituisce un codice di errore (per esempio,
   -1). In comportamento normale, il sistema riduce il
   credito sulla scheda prepagata e la quantità di lattine
   disponibili per la colonna selezionata. Si noti che il
   distributore seleziona la prima colonna sulla quale è
   disponibile la bevanda richiesta.