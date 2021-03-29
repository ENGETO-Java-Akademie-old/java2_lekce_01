<p align="center">
  <img src="https://engeto.cz/wp-content/uploads/2019/01/engeto-square.png" width="200" height="200">
</p>

# Java 2 - 1. lekce

## Co nás čeká

 - [Představení kurzu](#představení-kurzu)
 
 - [Představení lektorů](#představení-lektorů)
 
 - [Datové struktury](#datové-struktury)

 - [Algoritmy](#algoritmy)

 - [Složitost](#složitost)

 - [Bonus](#bonus)
 
## Představení kurzu
 
V tomto kurzu se společně podíváme na pokročilejší oblasti spojené s programováním (nejen) v Javě jako testování, streamy, či práce s vlákny. Vše si pak procvičíme na domácích úkolech i větších projektech.
 
## Představení lektorů
 
 Na tomto kurzu se vám budou věnovat dva lektoři, kteří se na lekcích budou střídat, ale na Slacku nás najdete oba.
 
### Marek Nedbal
 
 <p align="left">
  <img src="https://github.com/ENGETO-Java-Akademie/java2_lekce_01/blob/main/engeto_profile.jpg" width="300" height="400">
</p>
 
  - živím se jako software engineer a krom krátkého extempore na začátku mé programátorské kariéry programuji již šestým rokem právě v Javě - momentálně pro společnost, o které v rámci Java kurzu ještě nekolikrát uslyšíte - <b>Oracle</b>
  
  - učení je mým koníčkem, který jsem objevil před rokem a máloco mě potěší tak, jako radost studenta, když ho drobnými radami doštouchám k tomu, aby si na řešení problému, na kterém se zasekl, přišel skoro sám
 
### Lukáš Horák
 
  <p align="left">
  <img src="https://github.com/ENGETO-Java-Akademie/java2_lekce_01/blob/main/lukashorak.png" width="500" height="360">
</p>
 
 - v současné době pracuji jako consultant ve společnosti Adastra, ale s programováním jsem žačal již před dlouhou dobou na základní škole. Měl jsem šteští, že díky práci jsem mohl pracovat v různých kulturách a setkat se s množštvím zajímavých lidí, od kterých jsem se sám mohl hodně naučit. Nyní je idealní příležitost znalosti předat dalším lidem a idealně nadchnout nové studenty.
 

## Datové struktury

Krom základních datových typů (int, float, String, boolean,..), které znáte z kurzu Java 1, budeme v tomto kurzu pracovat i se složitejšími datovými strukturami jako jsou seznamy, fronty, stromy a grafy. Stromové struktury slouží k uchovávání hierarchicky uspořádaných dat. Data jsou zde řazena od kořene (root), přes vnitřní uzly (node) po listy (leaf). Grafy se skládají z uzlů (node), které uchovávají data a hrany (edge) reprezentující vazby nebo vztahy mezi uzly.

### Seznam

Je vhodný pro procházení prvků popořadě – sekvenčně. Jde o datovou strukturu, ve které každá položka obsahuje odkaz na následující, případně i předešlou položku. Na základě toho rozlišujeme tři typy seznamů:

 - Jednostranně spojovaný – každý prvek odkazuje na následující nebo předešlý prvek seznamu. Když prvek odkazuje na následující, poslední odkazuje na None. Pokud prvek odkazuje na předešlý, první odkazuje na None.
 - Oboustranně spojovaný – každý prvek odkazuje na následující i předešlý prvek seznamu. První i poslední prvek ukazují každý v jednom (jiném) směru na None.
 - Kruhový – může být jednostranně i oboustranně spojovaný. V kruhovém seznamu však místo toho, aby poslední, případně první prvek ukazoval na None, ukazuje na první, případně poslední prvek seznamu.

### Fronta

Jde o jeden ze základních datových typů, který se využívá na ukládání a výběr dat. Pracuje na principu FIFO – first in, first out. Znamená to, že první prvek, který je do ní vložen, musí být i první vybrán. Prvky jsou tím pádem vkládány na konec fronty a vybírány z jejího začátku. Dobře si tento princip můžeš zapamatovat na frontě v obchodě – kdo se dříve do fronty postaví, dříve je obsloužen. Existuje ale také prioritní fronta, ve které prvek s vyšší prioritou může předběhnou ty s nižší prioritou. Když budeme v této lekci provádět operace nad frontou, budeme ji implementovat také jako list.

### Zásobník

Tato datová struktura se používá především pro dočasné ukládání dat. Pro svoji práci využívá způsob LIFO – last in, first out. Znamená to, že prvek, který je do zásobníku vložen jako poslední, je z něho odebrán jako první. Prvky jsou vkládány na vrchol zásobníku a vybírány jsou také z něho. Když budeme v této lekci provádět operace nad zásobníkem, budeme ho implementovat také jako list.

### Strom

  <p align="left">
  <img src="https://github.com/ENGETO-Java-Akademie/java2_lekce_01/blob/main/tree.png" width="500" height="360">
</p>

Už v předchozí lekci jsme je v opakování o datových typech a strukturách zmínili. Teď si to jen zopakujeme a něco k tomu přidáme.

Jak jsme říkali, stromové struktury slouží k uchovávání hierarchicky uspořádaných dat a skládají se z jednotlivých uzlů. Kdyby data neměla svou hierarchii, strom by se nám z nich jen těžko vytvářel. Významnou částí stromu je podstrom. Je tvořen vybraným uzlem a všemi jeho potomky.

Stromové struktury se skládají z uzlů. Uzly mohou obsahovat konkrétní hodnotu, podmínku nebo dokonce strukturu oddělených dat. Jsou navzájem spojeny hranami – edge.

Každý uzel může mít maximálně jednoho rodiče a 0–N potomků. Podle počtu potomků pak umíme určit stupeň uzlu. Každá stromová datová struktura by měla obsahovat právě jeden uzel, který nazýváme kořen – root. Je to jediný uzel, který nemá žádné rodiče. V takovém případě jde o kořenový strom.

Dále se v struktuře nacházejí listy – leaf. Tyto uzly naopak nemají žádné potomky.

Pokud má strom jen jeden uzel, tak je tento uzel zároveň kořenem i listem.

Pokud se ve stromu nachází uzel, který není ani kořenem a nemůže být ani listem, jde o vnitřní uzel – node.

#### Pojmy

 - Cesta k uzlu – posloupnost uzlů mezi kořenem a cílovým uzlem.
 - Délka cesty – počet hran, které obsahuje daná cesta. Pokud mají uzly stejnou délku cesty od kořene, hovoříme o uzlech stejné úrovně. Úroveň se počítá jako hodnota délky cesty + 1.
 - Výška (hloubka) stromu – hodnota nejdelší cesty od kořene k uzlu, která se ve stromu nachází.
 - Hloubka uzlu – délka cesty od kořene k danému uzlu.
 - Šířka stromu – počet uzlů v poslední úrovni stromu.
 - Váhově vyvážený strom – pro všechny jeho uzly platí, že počty uzlů jejich levého podstromu a pravého podstromu se rovnají nebo liší nejvíce o 1.
 - Výškově vyvážený strom – pro všechny jeho uzly platí, že výška levého podstromu a pravého podstromu se rovnají nebo liší nejvíce o 1.

## Algoritmy

Představ si například recept v kuchařce. Na začátku jsou v něm uvedené suroviny, které budeš potřebovat. Dále je uvedený postup, co máš kdy s čím smíchat, kam co hodit, na kolik stupňů předehřát troubu… Zkrátka popsáno přesně krok za krokem, jak na to. Samozřejmě nesmí chybět ani nějaký obrázek toho, jak to má ve výsledku celé vypadat. Na podobném principu v podstatě fungují i algoritmy.

Algoritmus je přesná posloupnost kroků a pravidel (samotný postup receptu), díky kterým dokážeme převést nějaká vstupní data (potřebné suroviny na začátku) na požadovaný výstup (obrázek výsledku na konci). Jde však jen o teoretické řešení problému, ne samotnou činnost. Proto bývají psány jen v takzvanému pseudokódu. Když ho chceme realizovat v praxi, musíme k tomu použít některý z programovacích jazyků.

Právě proto, abychom ho mohli realizovat, každý algoritmus musí být dobře popsán, nesmí v něm nic chybět. V každém okamžiku musí být každému také jasné, co má dělat, nic nemůžeme nechat na náhodu, podobně jako u dobrého receptu.

Proč algoritmy? Jak už je asi zřejmé, při dobře navrženém algoritmu nás „nemá co překvapit“ – když do něj nasypeme jakákoliv správná data a dodržíme všechny předem naplánované kroky, tak dostaneme vždy výstup, jaký od daného algoritmu očekáváme. Tato předvídatelnost je na nich to nejlepší. Výsledek sčítání stejných čísel bude vždy totožný. Výsledkem hledání nejkratší cesty na plánku z bodu A do bodu B za stejných podmínek bude vždy stejná cesta, aniž bychom to museli nějak speciálně zabezpečovat. No není to super?

### Základní vlastnosti algoritmů

Už jsme tady lehce naznačili, jaký by měl algoritmus být a co by mu nemělo chybět. Teď se na to pojďme podívat blíž. V tomto kurzu si pro lepší zapamatování základních doporučených vlastností zavedeme zkratku DEKOD.

 - Determinismus – každý krok algoritmu je přesně definován. V každém okamžiku musí být jasné, co se má za jakých okolností vykonávat, jak se má pokračovat.
 - Elementárnost – kroky použité v algoritmu jsou jednoduché – elementární.
 - Konečnost – pro každý algoritmus musí existovat konečný počet kroků, po kterých skončí. Nezáleží na tom, jak velký je tento počet, hlavně musí být konečný.
 - Obecnost – algoritmus nesmí řešit jen jeden konkrétní problém pro konkrétní vstup, ale musí tento problém umět řešit obecně pro jakoukoliv kombinaci vstupů.
 - Determinovanost – algoritmus musí pro stejnou kombinaci vstupu za stejných podmínek vždy vrátit stejný výstup.
 
### Druhy algoritmů

Algoritmy nejsou ve všem stejné, mají svoje charakteristické rysy a můžou se dělit do několika skupin. Zde je jedno z nejpoužívanějších dělení:

 - Genetické – za vzor si berou evoluční procesy z oblasti biologie – například dědičnost, křížení, mutace, přirozený výběr – pro zdokonalování dané úlohy. Na počátku je zvolena úplně náhodná „populace“, která se iteracemi změn mění a zdokonaluje.
 - Heuristické – většinou se využívají na data, která nejsou dostačující, úplná. Proto nekladou důraz na nalezení úplně přesného řešení, jen se mu snaží co nejvíc přiblížit.
 - Paralelní – využíváme je, když máme k dispozici více procesorů na to, abychom úlohu rozdělili na podproblémy a vyřešili ji rychleji. Ale ne vždy tomu tak ve skutečnosti je. Nutné je správně vyhodnotit samotný problém.
 - Pravděpodobnostní – některá rozhodnutí nevykonávají na základě něčeho konkrétního, místo toho se rozhodují náhodně nebo pseudonáhodně.
 - Rekurzivní – algoritmus pro to, aby se dopracoval k výsledku, využívá volání sebe samého.
 - Iterativní – algoritmus opakovaně využívá toho samého bloku.

### Etapy algoritmizace úloh a metody návrhu

Vytváření algoritmů je samo o sobě složitý proces. Na to, abychom si ho mohli zjednodušit, musíme danou úlohu správně uchopit. Neexistuje přesný předepsaný postup, ale doporučuje se například rozdělení na etapy:

 - Formulace úlohy a problému – formulace úlohy musí být jasná, nesmí v ní nic chybět. Musí být zřetelné, k čemu se algoritmus má dopracovat. Pak je důležitá formulace problému, kde lze využít například matematické rovnice nebo různé grafy.
 - Analýza úlohy – v této části je nutné zjistit, kolik má úloha řešení. Může mít jen jedno, více nebo také žádné. Vybírá se metoda pro řešení dané úlohy. Metoda musí dosahovat nejen požadovaného výstupu, ale také přesně definovat vstupní data.
 - Sestavení řešícího algoritmu – jedná se o detailní popis postupu řešení dané úlohy pomocí vymýšlené metody. Výsledkem by měl být algoritmus, který vyřeší nejen konkrétní úlohu, ale i variantu jakýchkoliv vstupů.
Metod pro vytváření algoritmu je také více. Někdy je lepší jeden velký problém rozkládat na stále menší podproblémy, až se dostaneme k úplně elementárním krokům, které potřebujeme pro vytváření algoritmů. Taková metoda se nazývá metoda shora dolů. V jiném případě je lepší skládat elementární kroky dohromady, dokud nepřijdeme na komplexní řešení celého problému – metoda zdola nahoru. Často se také používá kombinace těchto dvou metod.

### Paralelní algoritmy

Jak už jsme si vysvětlovali výše, když využíváme paralelních algoritmů, můžeme úlohu rozdělit na několik podproblémů. Tyto podproblémy můžeme díky vícero procesorům řešit najednou, nemusíme čekat na to, až přijde na podproblém řada. S výjimkou toho, kdy podproblémy na sebe navazují a potřebují výsledek nějakého jiného podproblému. Na to, abychom vytvořili paralelní algoritmus, častokrát stačí jen vhodně upravit princip algoritmu sekvenčního.

Pro paralelní zpracování se využívají čtyři základní typy von Neumannových architektur:

 - SISD – single instruction, single data – někteří tento typ považují spíše za sekvenční. Typickým zástupcem jsou pipeline a superskalární procesory.
 - SIMD (vektorové, maticové) – single instruction, multiple data – používají se pro vědecké výpočty, zpracování grafů, docela špatně se programují, lze je využít jen u některých algoritmů.
 - MISD – multiple instruction, single data – někteří tvrdí, že reprezentace neexistuje, využívají se například v počítačích pro řízení letu raketoplánu.
 - MIMD – multiple instruction, multiple data – multiprocesory, multicomputery. Využití najdou zejména při simulacích, modelování nebo jako komunikační přepínače.

## Složitost

Častokrát si lidé zaměňují pojem časová složitost a doba běhu programu. Doba běhu programu je čas vykonávání samotného programu. Časová složitost závisí na velikosti vstupu. Je to funkce, která každé množině vstupních dat přiřazuje počet operací vykonaných při výpočtu podle daného algoritmu – vypočítá, kolik operací se musí vykonat na to, abychom dostali požadovaný výstup.

Například když hledáme maximum z N čísel, můžeme použít takový algoritmus, co za maximum na začátku vezme první číslo. V takovém případě maximum hledá porovnáváním všech dalších čísel s nastaveným maximem, které podle porovnávání postupně upravuje. Víme, že každé porovnání trvá stejně dlouho – jednu časovou jednotku. Neexistují dvě čísla, která by se porovnávala hůř nebo naopak lépe. Z toho vyplývá, že časová složitost bude sečtení těchto porovnání, co je v podstatě lineární a bude záviset jen na počtu prvků N.

Složitost označujeme O, takže v našem příkladě bychom časovou složitost mohli zapsat jako O(N).

Příklady časových složitostí v závislosti na počtu prvků:

 - exponenciální – O(k^n)
 - lineární – O(n)
 - logaritmická – O(log(n))
 - kubická – O(n³)
 - kvadratická – O(n²)
 - konstantní - O(1)

Co se týče prostorové složitosti, jde o spotřebu paměti. Závisí na velikosti datových struktur, které algoritmus využívá, a na velikosti vstupu. Jejím výsledkem je maximální součet takzvaných elementárních buněk (například integer, float, byte), které budou na každém kroku v algoritmu použity. Pokud budeme používat pouze konstantní množství celočíselných proměnných, prostorová složitost bude vždy O(1).

## Bonus

Společná implementace vybraných řadících algoritmů (Select sort a Bubble sort) a určení jejich časové a prostorové složitosti.

### Select sort

Verze s pomocným polem.

Dokud jsou v poli, které máme seřadit, opakuj následující:

 - projdi pole, které máme seřadit a najdi v něm nejmenší či největší prvek, ten z tohoto pole odeber a přidej ho nakonec pomocného pole

Takto si v pomocném poli vybudujeme seřazenou posloupnoust, která bude představovat náš výsledek.

### Bubble sort

Dokud dojde aspoň k jednomu prohození, procházej postupně pole k seřazení a porovnávej sousední prvky - pokud jsou ve špatném pořadí, prohoď je.
