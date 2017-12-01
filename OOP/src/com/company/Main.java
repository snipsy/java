package com.company;

class Automobil {
    private String carName;
    private int fuelSpend;
    private int width;
    private int tire;
    private boolean hybrid;

    public Automobil(String name, int fuel, int dim, int tireDim, boolean electric) {
        carName = name;
        fuelSpend = fuel;
        width = dim;
        tire = tireDim;
        hybrid = electric;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String name) {
        carName = name;
    }

    public int getFuelSpend() {
        return fuelSpend;
    }

    public void setFuelSpend(int fuel) {
        fuelSpend = fuel;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int dim) {
        width = dim;
    }

    public int getTire() {
        return tire;
    }

    public void setTire(int tireDim) {
        tire = tireDim;
    }

    public boolean getHybrid() {
        return hybrid;
    }

    public void setHybrid(boolean electric) {
        hybrid = electric;
    }
}

class Zivotinja {
    private String name;
    private int size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    Zivotinja(String name, int size) {
        this.name = name;
        this.size = size;
    }
}

class Pas extends Zivotinja {
    private String bark;

    public void setBark(String bark) {
        this.bark = bark;
    }

    public Pas(String ema, int i) {
        super(ema, i);
    }

    public String glasanje() {
        return bark;
    }
}

class Macka extends Zivotinja {
    private String mijau;

    public void setMijau(String mijau) {
        this.mijau = mijau;
    }

    public Macka(String cica, int i) {
        super(cica, i);
    }

    public String glasanje() {
        return mijau;
    }
}

abstract class Osoba {
        public static final int money = 50;
        public static final int age = 25;
        abstract boolean radi();
}

class Doc extends Osoba{
    boolean radi() {
        return true;
    }
}

class Police extends Osoba{
    boolean radi() {
        return false;
    }
}

class Ispis {
    Doc pero = new Doc();
    Police ivo = new Police();
}

interface Pen {
    String draw();
}

class WoodPen implements Pen {
    public String draw() {
        return "Can be erased.";
    }
}

class MechanicPen implements Pen {
    public String draw() {
        return "Can not be erased.";
    }
}

class Comp {
    int price;
    int pdv;

    public int getPdv() {
        return (int) (price*0.25);
    }

    public Comp(int price) {
        this.price = price;
    }

    int price(int cijena, int pdv){
        price = cijena + pdv;
        return price;
    }

    int price(int cijena) {
        price = cijena;
        pdv = (int) (cijena * 0.25);
        return price;
    }

}

public class Main {

    public static void main(String[] args) {
        // write your code here
        peti();
    }

    static void prvi() {
        Automobil auto = new Automobil("BMW", 5, 200, 17, true);

        System.out.printf("Car name:%s\n", auto.getCarName());
        System.out.printf("Car fuel consumption: %s l\n", auto.getFuelSpend());
        System.out.printf("Car dimension (width):%d cm\n", auto.getWidth());
        System.out.printf("Car tire dimension: %d\n", auto.getTire());
        System.out.printf("Is car hybrid: %s\n", auto.getHybrid() == true ? "YES" : "NO");
    }

    static void drugi() {
        Pas ema = new Pas("ema", 10);
        Macka cica = new Macka("cica", 15);

        ema.setBark("VAUVAU!!");
        cica.setMijau("Mijaauuuuu!!!");

        System.out.printf("Dog name: %s\n", ema.getName());
        System.out.printf("Dog size: %d\n", ema.getSize());
        System.out.printf("%s says %s\n", ema.getName(), ema.glasanje());

        System.out.printf("Cat name: %s\n", cica.getName());
        System.out.printf("Cat size: %d\n", cica.getSize());
        System.out.printf("%s says %s\n", cica.getName(), cica.glasanje());
    }

    static void treci() {
        Ispis ispis = new Ispis();

        System.out.printf("Doc %s\n", ispis.pero.radi() ? "Radi":"Neradi");
        System.out.printf("Police officer %s\n", ispis.ivo.radi() ? "Radi":"Neradi");
    }

    static void cetvrti() {
        WoodPen olovka = new WoodPen();
        MechanicPen olovka2 = new MechanicPen();

        System.out.printf("1st pen %s\n", olovka.draw());
        System.out.printf("2nd pen %s\n", olovka2.draw());
    }

    static void peti() {
        Comp masina = new Comp(2500);
        Comp masina2 = new Comp(2700);

        int cijena = masina.price(2500);
        int cijena2 = masina2.price(2000, 700);

        System.out.printf("Cijena masine je %d pdv %d\n", cijena, masina.getPdv());
        System.out.printf("Cijena 2 masine je %d pdv je %d\n", cijena2, masina2.getPdv());
    }
}
