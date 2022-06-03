def Zakupy(**kwargs):
    suma=0
    for key, item in kwargs.items():
        print("Przedmiot |", key, "| Ilosc:", item)
        suma+=item
    print("Laczna ilosc kupionych przedmiotow",suma)
Zakupy(maslo=1, cola=2, popcorn=3)
