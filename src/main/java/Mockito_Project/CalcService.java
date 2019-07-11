package Mockito_Project;


public class CalcService {
	
	private  AddService addService;
	
	public CalcService(AddService addService) {
		this.addService = addService;
	}

	public int calc(int num1, int num2) {
		System.out.println("**--- CalcService calc executed ---**");
		return addService.add(num1, num2);
	}
	private  int multiply(int num1,int num2) { 
		  int mul=num1*num2;
		  System.out.println(mul);
		  return mul;
		  
		 }
		 public int privateCall(int num1,int num2) {
			  
			  int mul= multiply(num1,num2);
			 return mul ;
		  }

}
