
public class DeclareDataType {
	
	// 希望一个常量 在 同一类下的  不同方法中都能 使用
	static final int BOOK_PAGE = 1000;
	public static void main(String[] args)
	{
		//常量的声明
		final int DEAD_AGE = 100;
		// int i; -- 错误  java中必须在声明时进行初始化
		int i = 0;
		float a = 0.1f; // float 类型的必须在数值后面 跟上 f或者 F
		double d = 0.123154d;
		byte c = 125;
		System.out.println(i);
		System.out.println(a);
		System.out.println(c);
		System.out.println(d);
		int humanAge = 1; // 声明的 变量的 命名格式是 小驼峰
		System.out.print("人的初始年纪为 ");
		System.out.println(humanAge);
		System.out.print("人的死亡年纪 ：");
		System.out.println(DEAD_AGE);
		//char 类型 
		char e = 'A';
		int b = e;// 强制类型转换
		System.out.println(e);
		System.out.println(b);
		
		// boolean 布尔类型
		boolean t = true;
		boolean f = false;
		// int j = t; 布尔类型不能和整数类型进行 强制类型转换
		System.out.println(f);
		System.out.println(t);
		
		// 尽量不要 出现 int a,b,c; 的情况,为了程序的可读性,我们一般逐一声明变量
		
		// java 对于大小写很敏感
		int box = 1;
		int Box = 2;
		System.out.print("box的值 :");
		System.out.println(box);
		System.out.print("Box的值 :");
		System.out.println(Box);
		System.out.println(BOOK_PAGE);
		
		enum Lauguage {中文,日文,英语}; // 自定义  枚举类型
		Lauguage l1 = Lauguage.中文;  // 声明 枚举类型的 变量 ， 变量存储的值 为 枚举类型 声明中的 某个枚举值
		Lauguage l2 = Lauguage.日文;
		Lauguage l3 = Lauguage.英语;
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		
		System.out.println(15/2);  // 整数除法
		System.out.println(15.0/2.0); // 浮点数除法
		System.out.println(15%7); // 取余操作
		System.out.println(Math.sqrt(6)); // 调用 Math类中的 sqrt 方法 实现 开平方根 返回类型是double类型
		System.out.println(Math.pow(5, 3)); // 调用 Math 类中的 pow方法 实现 平方 pow(x,a) -- 表示 x 的 a次幂
		// pow() 中 传递的是两个double类型的参数，返回的类型也是 double类型
		
		
		System.out.println((0-1)%12); 
		System.out.println((0-2)%12);// n%m 取余，如果 n 是 负数，我们得到的 就是 负数 
		// 这一个是时间调整问题中 -- 给定 当前时钟时针的位置，问调整后时针的位置 或者说 时间
		// 那如果像上面一样,我们就不能 得到我们想要得到的结果，因为我们调整后 至少应该的到一个 0-11 范围里的 整数
		System.out.println(Math.floorMod(0-1,12));// 而 Math中的floorMod方法很好的解决了这个问题, 使用它我们就总会的到一个 0-11 范围内的整数
		
		System.out.println(Math.sin(Math.PI/2)); // math类中调用三角函数 以及 math 类中 直接提供了 Π 的值（近似值）
		System.out.println(Math.cos(Math.PI/2)); // 还有 Math.acos、 Math.asin
		System.out.println(Math.tan(Math.PI/3));
		System.out.println(Math.atan(1));
		System.out.println(Math.atan2(1,2));
		
		System.out.println(Math.exp(2)); // 表示 e 的 4 次方
		System.out.println(Math.E); // Math.E 表示 e 的近似值
		System.out.println(Math.log(Math.E)); // public static double log(double a)
		// 返回是lna
		
		System.out.println(Math.log10(100)); // 返回的是 以 10 为底的对数
	} 
	public static void main2(String[] args)
	{
		System.out.println(BOOK_PAGE);
	}
}
