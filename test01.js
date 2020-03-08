/**
 * セミコロンの使い分け
 * スコープを作る場合 → つける
 * スコープを作らない場合 → つけない
 */

/**
 * スコープを持つものの定義
 * 1. 引数を持つ
 * 2. 処理の加工ができる
 * 3. 戻り値を持つことができる
 */


 const firstNumber = 2;
 const secondNumber = 5;
 const thirdNumber = 3;

 function sample1(num) {
   num += firstNumber;
   return num;
 }

 function sample2(num) {
  num += secondNumber;
  return num;
}

const result = sample1(thirdNumber) + sample2(thirdNumber);

console.log(result);