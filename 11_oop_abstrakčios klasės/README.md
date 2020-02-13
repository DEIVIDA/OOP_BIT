Pateikiamas sprendimas su JAVA ir su C# (WindowsFormsApp10_gyvunai)

Užduotis

Namuose auginame daug gyvūnų. Jie yra dviejų rūšių: Žuvys ir Žiurkėnai. Sukurkime programėlę kurioje surašytumėme visus turimus gyvunus.
1. Užduotis.
Visi gyvunai turi vieną bendrą tėvinę klasę: Gyvunas ji turi turėti du atributus vardas ir tipas (žuvis arba žiurkėnas). Taip pat šiems atributams skirtus setter'ius ir getter'ius. Klasė gyvūnas negalės turėti objektų, todėl ją padarykite abstrakčia.
Tiek žuvis tiek ir žiurkėnas turės savo atskiras klases kurios paveldės tėvinę klasę Gyvunas ir turės tam tikrus skirtingus atributus - kaip parodyta paveiksle. Tėvinė klasė Gyvunas turi turėti konstruktorių su dviem kintamaisiais: vardu ir tipu, klasės žuvis ir žiurkėnas turi turėti po vieną konstruktorių su vienu kintamuoju: vardas. Sukurkite šias klases.

2. Užduotis
Abiem gyvunu klasėm perrašykite metodus toString(), tam kad išvestų informaciją tokiu būdų (jei būtų sudėti šie atributai į objektą):
Žiurkėnui: 
Žiurkėnas. Vardas: Antanas, Uodegos ilgis: 10 cm, Spalva: baltas

Žuviai:
Žuvis. Vardas: Aukse, Peleku kiekis: 10

3. Užduotis

Sudarykite LinkedList sudarytą iš gyvūnų ir pamėginkite į jį įdėti kelias žuvytes ir kelis žiurkėnus (skirtingus objektus, juos galite sukurti kode arba padaryti įvedamus klaviatūros pagalba).

4. Užduotis

Padarykite jog klasės Gyvunai objektai (ir tame tarpe ją paveldinčių klasių objektai) būtų rikiuojami t.y. padarykite, kad klasė įgyvendintų interfeisą Comparable ir turėtų lyginti tokia tvarka: Pirma pagal tipą, poto pagal vardą. Išrikiuokite gyvunus esančius sąraše ir išveskite į ekraną sąrašą.

5. Užduotis

Sukurkite metodą skirtą gyvūno paieškai sąraše. Metodui paduodamas gyvūno vardas, metodas turi surasti gyvūną tokiu vardu ir išvesti informaciją apie jį. Jei gyvūnų sąraše bus daugiau nei vienas, tuomet jie visi turėtų būti išvesti.