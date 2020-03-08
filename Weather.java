class Wdata {
    int  month;
    int day;
    String sky;
}

class Weather {
    public static void main(String[] args) {
        Wdata today = new Wdata();
        today.month = 10;
        today.day = 5;
        today.sky = "はれ";
        System.out.println(today.month + " 月 " + today.day + " 日 " today.sky);
    }
}