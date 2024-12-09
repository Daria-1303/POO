/*
 3. S˘a se implementeze ierarhia de clase descris˘a mai jos:
• Clasa Tip: reprezint˘a un tip de date abstract
– Date membru: nu are
– Metode membru
⇤ public String getTip(): returneaz˘a numele clasei sub forma unui ¸sir de
caractere precedat de ¸sirul ”Tip: ”
⇤ public String toString(): afi¸seaz˘a valoarea atributului ˆıncapsulat de
clasele derivate
Metoda getTip nu are init¸ial nici o implementare.
• Clasa Intreg: reprezint˘a tipul de date ˆıntreg (mo¸stene¸ste clasa Tip)
– Date membru: un atribut de tip int
– Metode membru
⇤ public String getTip()
⇤ public String toString()
• Clasa Sir: reprezint˘a tipul de date ¸sir de caractere (mo¸stene¸ste clasa Tip)
– Date membru: un atribut de tip String
– Metode membru
⇤ public String getTip()
⇤ public String toString()

• Clasa Colectie: reprezint˘a tipul de date colect¸ie de obiecte Tip
– Date membru: un atribut ce stocheaz˘a elementele colect¸iei
– Metode membru
⇤ public String getTip()
⇤ public String toString()
⇤ o metod˘a care testeaz˘a egalitatea dintre dou˘a colect¸ii din punct de
vedere al cont¸inutului elementelor. Dou˘a colect¸ii sunt considerate a fi
egale din punct de vedere al cont¸inutului dac˘a ambele cont¸in acela¸si
num˘ar de elemente iar elementele cont¸inute sunt egale, mai mult, ele
sunt stocate ˆın aceea¸si ordine.
⇤ o metod˘a pentru ad˘augarea de elemente ˆın colect¸ie
Acest tip de colect¸ie trebuie implementat astfel ˆıncˆat o colect¸ie s˘a poat˘a cont¸ine
elemente de tip Colectie.
Exemple. Presupunem c˘a avem o colect¸ie format˘a din urm˘atoarele elemente:
7, 4, Eu, 12. Apelul metodei toString trebuie s˘a furnizeze rezultatul (7, 4, Eu,
12).
Presupunem c˘a avem o colect¸ie format˘a din urm˘atoarele elemente: 7, 4, Eu,
12 ¸si colect¸ia format˘a din elementele 2 ¸si 8. Apelul metodei toString trebuie
s˘a furnizeze rezultatul (7, 4, Eu, 12, (2, 8)). Metoda toString din aceast˘a clas˘a
trebuie s˘a fie implementat˘a urm˘arind urm˘atoarele cerint¸e
– folosirea operatorului instanceof e STRICT interzis˘a
– trebuie s˘a existe o variabil˘a de tip Iterator ˆın interiorul metodei
Se va scrie ¸si o metod˘a main ˆıntr-o alt˘a clas˘a ˆın care se va crea o colect¸ie de obiecte
Tip ce va avea cel put¸in un element de tip Colectie, dupa care aceasta se va afi¸sa.
Se va testa ¸si egalitatea elementelor dintre dou˘a colect¸ii.

 */
public class Client {
    
}
