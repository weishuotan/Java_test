//类名与Java文件名一致问题
class Demo03HelloWorld{  //如果不一致需要将class前面的public干掉
	public static void main(String[] args){
		System.out.println("窗子");
		System.out.println("windows");
	}
}
//一个文件可以写多个class类但只有一个是带着public的
//main必须写在public中的类中
//最好是在一个Java文件中只写一个带有public和一个class
//一个文件中必须要有一个public才能不报错如果只有class则将会报错
public class Demo04HelloWorld{
	public static void main(String[] args){
		System.out.println("窗子");
		System.out.println("windows");
	}
}




