class itemy{
    protected String nazwa;
    protected double cena;
itemy(String nazwa, double cena){
    this.nazwa=nazwa;
    this.cena=cena;
}
public void info()
{
    System.out.println("Nazwa przedmiotu "+nazwa);
    System.out.println("Cena przedmiotu "+cena+"zl");
}
public double getCena(){return cena;}
    public String getNazwa(){return nazwa;}
}

class Gazetki extends itemy
{
    protected String firma;
    protected String kategoria;
    protected boolean czyjestosporcie;
    Gazetki(String firma, String kategoria, boolean czyjestosporcie, double cena, String nazwa)
    {
       super(nazwa, cena);
       this.firma=firma;
       this.kategoria=kategoria;
       this.czyjestosporcie=czyjestosporcie;
    }
    public void GazetkiInfo(){
        System.out.println("Firma: "+firma);
        System.out.println("Kategoria: "+ kategoria);
        System.out.println("Czy zawiera informacje sportowe? "+czyjestosporcie);
        if (czyjestosporcie)
        {
            System.out.println("Tak dzien dobry zrobilem tu XDDD zmiane");
        }else {
            System.out.println("Nie");
        }
    }

    public String getFirma(){return firma;}
    public String getkategoria(){return kategoria;}
    public boolean getczyjestosporcie(){return czyjestosporcie;}
    public double getrabat(){return cena*0.6;}
}

public class Kiosk {
    public static void main(String[] args) {
        itemy itemek1=new itemy("Gazeta wyborcza",3.90);
        itemek1.info();
        Gazetki itemek2=new Gazetki("CKM","Polityczna",false, 3.60, "test");
        itemek2.GazetkiInfo();
        System.out.println("Gazeta po rabacie "+itemek2.getrabat()+"zl");
    }
}
