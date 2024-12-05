class StringPract{
	static String a;
	public static void main(String args[]){
		//System.out.println(a.isEmpty());
		String s1="RUNTHARUN";
		System.out.println(s1.indexOf("RUN"));//0
		System.out.println(s1.lastIndexOf("RUN"));//6
		System.out.println(s1.contains("HA"));//true
		s1.replace("RUN","GUN");
		System.out.println(s1	);
		StringBuffer sb=new StringBuffer("THARUN");
		sb.delete(6,9);
		System.out.println(sb);
	}
}
