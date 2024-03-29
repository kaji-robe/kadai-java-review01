//■仕様
//実行結果の例:1500円の商品の税込価格は1650円（消費税は150円）です。
//mainメソッドとtaxメソッドを切り分けて作成
//taxメソッドは消費税額（商品価格の10％）が戻り値となるメソッドに
//mainメソッドでtaxメソッドを呼び出して、戻り値の消費税額をmainメソッド内で受ける
//消費税の計算は10で割るのではなく、税率の数字を変更するだけでプログラムを書き直す必要がないように
//税込価格 = 商品価格 + 消費税額 となるように計算

//■課題
//intとdoubleのキャスト
//戻り値のメソッドづくり


public class Review01 {

    public static void main(String[] args) {
        int price = 1500; //商品価格
        int taxRate = 10; //消費税率

        int result;
        result = tax(price, taxRate); //taxメソッドを呼び出し

        System.out.println(price + "円の商品の税込価格は" + (price + result) + "円（消費税は" + result + "円）です。");
        }

    public static int tax(int price, int taxRate) {
        int result = price * taxRate / 100 ;
        return result; //戻り値

        }
}
