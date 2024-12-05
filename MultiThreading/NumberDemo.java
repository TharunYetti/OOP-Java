class NumberDemo{
	public static void main(String args[]){
		EvenNums e1=new EvenNums("Sigma",100,200);
		EvenNums e2=new EvenNums("Alpha",100,200);
		OddNums o1=new OddNums("Beta",100,200);
		OddNums o2=new OddNums("Gamma",100,200);
		Thread et1,et2,ot1,ot2;
		et1=new Thread(e1);
		et2=new Thread(e2);
		ot1=new Thread(o1);
		ot2=new Thread(o2);
		//ot1.setPriority(Thread.NORM_PRIORITY);
		et1.start();
		et2.start();
		ot1.start();
		ot2.start();
		ot2.setPriority(2);
		System.out.println("OT2 priority:"+ot2.getPriority());
		System.out.println("OT1 Name:"+ot1.getName());
		System.out.println("OT2 Name:"+ot2.getName());
		System.out.println("ET1 Name:"+et1.getName());
		System.out.println("ET2 Name:"+et2.getName());
		//System.out.println("THARUN YETTI"); will be print first
	}
}
