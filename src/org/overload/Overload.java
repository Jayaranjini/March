package org.overload;

public class Overload {
	
	private void emp(int age) {
		System.out.println("emp age is :");

	}

	private void emp(String FN,String LN) {
         System.out.println("emp firstname is "+FN +"\n"+ "emp lastname is "+LN);
	}

    private void emp(float phonenumber,String address,String empid) {
         System.out.println("emp numer is :"+phonenumber+"\n"+"emp address is :"+address+"\n"+"emp id is :"+empid);
	
    System.out.println("jayaranjini");
    
    
    }
    
    
    

public static void main(String[] args) {
	Overload a=new Overload();
	a.emp(30);
	a.emp("sasi", "kumar");
	a.emp(5846356465f, "OMR Thoraipakkam", "jayaranjini.oim@gmail.com");
	a.emp(45);
	a.emp("geetha", "kumari");
}

}
