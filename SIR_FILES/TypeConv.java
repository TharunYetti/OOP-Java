class TypeConv{
	public static void main(String args[])
	{
		 short number1=10, number2=4;
		 short number3=(short)(number1+number2); 
		  System.out.println(number3);
		  double n1=2, n3;
		  int n2=4;
		  n3=n1+n2;
		  System.out.println(n3);
		  int varInt = 5, resultInt, resultFl;
		float varFloat = 7.5f, resultFloat, resultFloatDbl;
		double varDouble = 2.55, resultDoubleFl, resultDoubleDbl;
		resultInt = (int)(varInt + varFloat);		// possible loss of  precision
		resultFl = (int)(varInt + varFloat);		// possible loss of  precision
		resultFloat = varInt + varFloat;		
		resultFloatDbl =(float)( varFloat + varDouble);	// possible loss of precision
		resultDoubleFl = varInt + varFloat;
		resultDoubleDbl = varFloat + varDouble;
		System.out.println( "resultInt = " + resultInt );
System.out.println( "resultFloat = " + resultFloat );
System.out.println( "resultDoubleFl = " + resultDoubleFl );
System.out.println( "resultDoubleDbl = " + resultDoubleDbl );


		  
		  
	}
}
