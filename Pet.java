class Cat {
    String name;
    String place;
    int age;

    void setData(String n, Sting p, int a) {
        name = n;
        place = p;
    }
    void print() {
        System.out.println(place + " : " + name + " " + age + " 歳 ");
    }

    void print(String p, int a) {
        place = p;
        System.out.println(place + " : ねこは" + a + "匹です。");
    }

    void print(String variety) {
        System.out.println(place + " : " + name + " " + age + " 歳 " + variety);
    }

    class Pet {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        cat1.setData("ロビン", "うち", 10);
        cat2.setData("ちび", "となり", 14);
        cat1.print("雑種");
        cat2.print();
        cat3.print("うら", 0);
    }
}