class Variable{
	public static void main(String[] a)
	{
		//定义整型变量
		   //byte
		//byte b1 = 128; 这是不可以的, 因为一个字节的可表示数的范围: -128 - 127.
		byte b2 = -127;
			//int
		int i1 = 1;//实际编程中, 定义整型变量常用int.
			//long 
		long l1 = 123l;  // 注意: long定义时，要在数值后面加'L'或'l'.
		
		//定义浮点型
			//float
		float f1 = 123.1f; // 注意: float定义时, 要在数值后面加'F'或‘f’.
			//double
		double d1 = 123.456;
		
		//定义字符型
			//英文字符
		char c1 = 'a';
			//中文字符
		char c2 = '中';
			//其他
		char c3 = 'α';
			//转义字符
		char c4 = '\n';
			//unicode的值
		char c5 = '\u0043';
		
		//定义boolean型
		boolean B1 = true;
		boolean B2 = false;  // 只有 true 和 false 两个值.
	}
}