class methodsOfString{
	public static void main(String args[]){
		String str1="Tharun",str2="Yetti",str=str1+str2;
		System.out.println(str);
		String str3=str1.concat(str2);
		System.out.println(str3);
		System.out.println(str.compareTo(str3));
		String s1="java",s2="JaVa";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2.replace("a","A"));
		int k=20;
		String t1=String.valueOf(k);//valueOf() function vonverts any data into strings
		System.out.println(t1);
		String t2=Integer.toString(k);//same operation as of valueOf();
		System.out.println(t2);
	}
}
