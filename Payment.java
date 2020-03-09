class Drink {
    String name; //商品名
    int price; //単価
    int count; //数量

    //コンストラクタ
    Drink(String n, int p, int c) {
        name = n;
        price = p;
        count = c;
    }

    int getTotalPrice() { //金額を換算
        return count * price;
    }

    static void printTitle() {
        System.out.println("商品名 ¥t¥t 単価 ¥t 数量 ¥t 金額");
    }

    void printData() {
            System.out.println(name + "¥t" + price + "¥t"
                            + count + "¥t" + getTotalPrice());
        }
    }

    class Alcohol extends Drink {
        float alcper; //アルコールの度数

        //コンストラクタ
        Alcohol(String n, int p, int c, float a) {
            super(n, p, c); //スーパークラスのコンストラクタを呼び出す
            alcper = a;
        }

        //メソッドのオーバーライド
        static void printTitle() {
            System.out.println("商品名（度数[%]）¥t 単価¥t 数量 ¥t 金額");
        }

        //メソッドのオーバーライド
        void printData() {
            System.out.println(name + "(" + alcper + ")" + "¥t"
                        + price + "¥t" + count + "¥t" + getTotalPrice());
        }
    }

    class Payment {
        public static void main(String[] args) {
            Drink coffee = new Drink("コーヒー", 200, 3);
            Drink oolongTea = new Drink("ウーロン茶", 150, 2);
            Alcohol wine = new Alcohol("ワイン", 300, 2, 15.0f);
            
            Drink.printTitle();
            coffee.printData();
            oolongTea.printData();
            System.out.println();

            Alcohol.printTitle();
            wine.printData();
            int sum = coffee.getTotalPrice()
                + oolongTea.getTotalPrice() + wine.getTotalPrice();
            System.out.println("¥n*** 合計金額" + sum + "円***");
        }
    }
