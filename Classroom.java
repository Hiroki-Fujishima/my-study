class Test {
    String subject; //フィールド　教科名
    int point; //フィールド　得点

    void setPoint(String s, int p) { // 得点を設定するメソッド
        subject = s;
        point = p;
    }

    String getPoint() { //　１科目の得点を得るメソッド
        return subject + ":" + point;

    }
}

class Student {
    int id; //フィールド　生徒の番号
    String name; //フィールド　名前
    int subnum; //フィールド　教科数
    Test[] test; //フィールド　testクラスのオブジェクトの配列

    Student(int i, String n, int s) { //コンストラクタ
        id = i;
        name = n;
        subnum = s;
        test = new Test[s];
        for(int j = 0; j < s; j++)
            test[j] = new Test(); //配列の要素ひとつひとつに対して
                                  //newでオブジェクトを生成

    }

    String getName() { //名前を得るメソッド
        return id + ":" + name;
    }

    int getGrade() { //総合点を得るメソッド
        int sum = 0;
        for(int i = 0; i < subnum; i++)
            sum += test[i].point;
        return sum;
    }
    //メソッドのオーバーロード
    int getGrade(int a) { //評価を得るメソッド
        int base = 100 * subnum / a;
        int rank = getGrade() / base + 1;
        return (rank > a) ? a : rank; //rankがaより大きいときはaを、
                                      //それ以外はrankを返す。
    }

    void printScore() { //成績を表示するメソッド
        System.out.println(getName());
        for(int i = 0; i < subnum; i++)
            System.out.print(test[i].getPoint() + " ");
        System.out.println();
        System.out.println("総合点" + getGrade());
        int rank = 5;
        System.out.println(rank + "段階評価" + getGrade(rank));
        System.out.println();
    }
}

class Classroom {
    public static void main(String[] args) {
        Student taro = new Student(12, "taro", 3);
        taro.test[0].setPoint("国語",95);
        taro.test[1].setPoint("数学",83);
        taro.test[2].setPoint("英語",76);
        taro.printScore();

        Student jiro = new Student(7, "jiro", 3);
        jiro.test[0].setPoint("国語", 66);
        jiro.test[1].setPoint("数学", 97);
        jiro.test[2].setPoint("英語", 72);
        jiro.printScore();
    }
}