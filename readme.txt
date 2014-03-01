eroul jocului este reprezentat de limbajul de programare pe care acesta il alege

cum se genereaza cartea:
-indiferent de clasa cartii, avem un random float intre 0 si 1 pe baza caruia se vor genera atacul, health-ul si mana acesteia
-dupa ce se genereaza aceste caracteristici, se va face atribuirea la o clasa de carte

clasele de carti:
-carti de atack/defense (gen minons din hearthstone)
-carti de charm(trebuie sa gasim o denumire catchy, in stilu moloz la rulmentiada) sunt carti care vor contine perk-urile specifice limbajului

pachetul de carti va contine 30 de carti, iar numarul de aparitii al unei carti este de minim 1. (poate aparea de mai multe ori)

dupa generarea lui se va face un random shuffle la deck si fiecarui jucator i se vor aloca 5 carti, urmand sa primeasca in fiecare runda cate o carte

playerul va avea un health de 6 "script-uri"
script-urile sunt practic niste scuturi, fiecare avand 100 de "linii de cod".
la fiecare atac al unei carti, sunt "sterse" din liniile de cod ale scriptului, jucatorul primind astfel damage.

jocul se termina cand
- unul dintre jucatori ramane fara carti in deck
- jucatorlui ii sunt "sterse" toate cele 6 scripturi
- remiza nu poate avea loc*