package com.company;

import java.util.*;

enum Gender {
    MALE,
    FEMALE
}

class Numbers {
    List num = new ArrayList();

    public Numbers(List numbers) {
        this.num = numbers;
    }

    public List getNum() {
        return num;
    }

    public void printList() {
        for (int i = 0; i < num.size(); i++) {
            System.out.printf("List index %d, member %d\n", i, num.get(i));
        }
    }

    public void setNum(List num) {
        this.num = num;
    }

    public void sortList() {
        Collections.sort(num);
    }

}

class Words {
    List<String> words = new ArrayList();

    public Words(List wordsList) {
        this.words = wordsList;
    }

    public void searchList(String searchWord) {
        ListIterator<String> i = null;
        i = words.listIterator();
        while(i.hasNext()) {
            if(i.next().equalsIgnoreCase(searchWord))
            {
                System.out.printf("List contains %s\n", i.previous());
                return;
            }
        }
        System.out.printf("Doesn't contain %s", searchWord);
    }
}

class Operations {
    final double pi = 3.14;

    public double surfaceSquare(int a) {
        return a*a;
    }

    public double extentSquare(int a) {
        return 4*a;
    }

    public double surfaceCircle(int r) {
        return r*r*pi;
    }

    public double extentCircle(int r) {
        return 2*r*pi;
    }

    public int sumArray(int[] a) {
        int arraySize;
        arraySize = a.length;
        return a[0] + a[arraySize-1];
    }
}

class Car {
    private int tireDim;

    public int getTireDim(){
        getSpecs();
        return tireDim;
    }

    public void getSpecs(){
        Tire dim = new Tire(15);
        tireDim = dim.getDim();
    }

    static class Tire {
        private int dim;

        public Tire(int r) {
            this.dim = r;
        }

        public int getDim() {
            return dim;
        }
    }
}

class Dog {
    String name;
    Gender gender;
    int age;

    public Dog(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Kernel {
    List<Dog> doggy = new ArrayList<Dog>();

    public Kernel() {
        doggy.add(new Dog("ema", Gender.FEMALE, 5));
        doggy.add(new Dog("snipsy", Gender.FEMALE, 2));
        doggy.add(new Dog("lea", Gender.FEMALE, 4));
        doggy.add(new Dog("biba", Gender.FEMALE, 2));
        doggy.add(new Dog("marko", Gender.MALE, 10));
        doggy.add(new Dog( "bane", Gender.MALE, 9));
        doggy.add(new Dog("jura", Gender.MALE, 7));
    }

    public void ageFilter(int age)
    {
        for(Dog doge: doggy) {
            if (doge.getAge() == age) {
                System.out.printf("Doggy with age %d is %s\n", age, doge.getName());
            }
        }
    }

    public List genderSelection(Gender gender)
    {
        List<Dog> genderDoggy = new ArrayList<>();
        for (Dog doge: doggy){
            if (doge.getGender() == Gender.MALE) {
                genderDoggy.add(doge);
            }
        }
        return genderDoggy;
    }
}

class WordList {
    List<String> wordList = new ArrayList<>();

    public WordList(List<String> wordList) {
        this.wordList = wordList;
    }
    /* Test 1 GIT*/
    public void printOut(){
        for(String word: wordList){
            System.out.printf("%s - %d\n", word, word.length());
        }
    }
}

public class Main {

    public static void main(String[] args) {
        // write your code here
        sedmi();
    }

    static void prvi() {
        int listSize;
        List numbers = new ArrayList();
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter list size\n");
        listSize = input.nextInt();
        for (int i = 0; i < listSize; i++) {
            System.out.printf("Enter %d element\n", i);
            numbers.add(input.nextInt());
        }

        Numbers numberList = new Numbers(numbers);
        numberList.sortList();
        numberList.printList();
    }

    static void drugi() {
        String searchW;
        int listSize;
        List words = new ArrayList();
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter list size\n");
        listSize = input.nextInt();
        input.nextLine();
        for (int i = 0; i < listSize; i++) {
            System.out.printf("Enter %d element\n", i);
            words.add(input.nextLine());
        }
        Words wordList = new Words(words);

        System.out.printf("Enter search word\n");
        searchW = input.nextLine();
        wordList.searchList(searchW);
    }

    static void treci() {
        int a;
        int[] b = {1, 2, 3, 4, 5, 6, 7};
        Scanner input = new Scanner(System.in);
        Operations op = new Operations();

        System.out.printf("Enter radius/length \n");
        a = input.nextInt();

        System.out.printf("Extend of square with side length %d is %f\n", a, op.extentSquare(a));
        System.out.printf("Surface of square with side length %d is %f\n", a, op.surfaceSquare(a));
        System.out.printf("Extend of circle with side length %d is %f\n", a, op.extentCircle(a));
        System.out.printf("Surface of circle with side length %d is %f\n", a, op.surfaceCircle(a));

        System.out.printf("Sum of first and last element of array is: %d", op.sumArray(b));
    }

    static void cetvrti() {
        Car myCar = new Car();
        Car.Tire tireDim = new Car.Tire(17);

        System.out.printf("Tire dim of my car is %d\n", myCar.getTireDim());

        System.out.printf("2nd car tire dim is %d\n", tireDim.getDim());
    }

    static void peti() {
        Calendar date = Calendar.getInstance();

        System.out.printf("Current date is %d.%d.%d", date.get(Calendar.DAY_OF_MONTH),
                date.get(Calendar.MONTH)+1, date.get(Calendar.YEAR));
    }

    static void sesti() {
        Kernel azil = new Kernel();
        List<Dog> maleDogs;

        System.out.printf("2 year dogs are\n");
        azil.ageFilter(2);

        maleDogs = azil.genderSelection(Gender.MALE);
        System.out.println("Male dogs are:");
        for (Dog doge: maleDogs){
            System.out.printf("%s\n", doge.getName());
        }
    }

    static void sedmi() {
        List<String> words = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String word;
        WordList test;

        do {
           word = input.nextLine();
           if (!word.equalsIgnoreCase("end"))
           {
               words.add(word);
           }
        }while(!word.equalsIgnoreCase("end"));

        test = new WordList(words);
        test.printOut();
    }
}
