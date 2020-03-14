import java.io.*;
import java.util.*;

class QuandA {
    String question; //問題の文字列
    String[] answer; //解答の文字列

    QuandA(String question, String answerline) {
        this.question = question;
        StringTokenizer token = new StringTokenizer(answerline, ",");
        answer = new String[token.countTokens()];
        for(int i = 0; token.hasMoreTokens(); i++)
            answer[i] = token.nextToken();
    }

    //正解を判定し、正解した文字列を返す
    String[] getCorrect(String inputline) {
        //回答を分割
        StringTokenizer token = new StringTokenizer(inputline, ",");
        int inputnum = token.countTokens();
        String[] input = new String[inputnum];
        for(int i = 0; token.hasMoreTokens(); i++)
            input[i] = token.nextToken();
        
        //重複チェック
        for(int i = 1; i < inputnum; i++)
            for(int j = i-1; j >= 0; j--)
                if(input[i].equals(answer[j])) //以前に同じ文字列があった場合
                    input[i] = "0"; //この文字列に不正解（０）を代入
        //照合
        int correctnum = 0; //正解した数
        for(int i = 0; i < inputnum; i++)
            for(int j = 0; j < answer.length; j++)
                if(input[i].equals(answer[j]))
                    correctnum++;
        
        String[] correct = new String[correctnum]; //正解した回答]
        int k=0;
        for(int i = 0; i < inputnum; i++)
            for(int j = 0; j < answer.length; j++)
                if(input[i].equals(answer[j])) {
                    correct[k] = input[i];
                    k++;
                }
            return correct;
        }
    }

    class Quiz {
        static String getInput() {
            String input = new String();
            try {
                BufferedReader in =
                    new BufferedReader(new InputStreamReader(System.in));
                input = in.readLine();
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                return input;
            }
        }

        public static void main(String[] args) {
            //問題と解答
            QuandA qa = new QuandA("曜日（英語）",
                "Sunday,Monday,TuesDay,Wednesday,Tursday,Friday,Saturday");
            System.out.print("【問題】" + qa.question +
                "を「,」で区切って答えなさい。¥n> ");
            
            int answernum = qa.answer.length; //回答の個数
            String input = getInput();
            String[] correct = qa.getCorrect(input);
            int correctnum = (correct == null) ? 0 : correct.length;

            //正解した数が0でなかった場合、正解した解答を表示
            if(correctnum > 0) {
                System.out.print("正解：");
                for(int j = 0; j < correctnum; j++)
                    System.out.print(correct[j] + " ");
                System.out.println();
            }
            //正解の数を表示
            System.out.println(correctnum + " / " + "正解");

            if(correctnum == answernum) //全部正解した場合
                System.out.println("すばらしい！！");
            else if(correctnum > answernum/2) // 半分より多く正解した場合
                System.out.println("よくできました！");
            else //正解が半分以下だった場合
                System.out.println("まだまだです。");
        }
    }