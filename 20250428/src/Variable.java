
public class Variable {
//公開　静的　Voidを返す　mianMethod(引数)	
public static void main(String[] args) {
	//変数の宣言
	//型　変数名=初期値;
	/**
	 * コメントには種類がある
	 * 改行できる
	 */
	/*
	 * これもコメント
	 * 改行できる
	 * 
	 */
	int takahashi=41;//int は数値型　ex)1,100,1000
	int hanaki = 20;
	int diff = takahashi - hanaki;
	
	System.out.print("年齢差:");
	System.out.println(diff);
	
	//String は　文字列型
	String kogo = "40";
	String okanami = "-21";
	String add = kogo + okanami;
 
	System.out.println(add);
	//boolean は　新偽値
	boolean studentFlg = true;
	System.out.println("あなたは学生ですか？");
	System.out.println(studentFlg);
}
     
}