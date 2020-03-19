class Main {
    public static void main(String[] args) {
        try {
            back(args[0]);
        } catch(Exception e) {
            System.out.println("コマンドライン引数がありません");
        } finally {
            System.out.println("終了します。");
        }
    }
    static void back(String a) throws Exception {
        System.out.println(a);
    }
}