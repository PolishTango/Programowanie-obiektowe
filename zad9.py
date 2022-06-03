def Zakupy(**kwargs):
    suma=0
    for key, item in kwargs.items():
        print("Przedmiot |", key, "| Ilosc:", item)
        suma+=item
    print("Laczna ilosc kupionych przedmiotow super zmiana",suma)
Zakupy(maslo=1, cola=2, popcorn=3)
print("Nowa galez")
