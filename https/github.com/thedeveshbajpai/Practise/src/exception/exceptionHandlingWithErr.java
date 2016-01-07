package exception;

public class exceptionHandlingWithErr {

	public static void main(String[] args) {
		exceptionHandlingWithErr insta=new exceptionHandlingWithErr();
		try{
			insta.err();
		System.out.println("111111");}
		catch(Exception E){
			System.out.println("2222");		}
		finally{
			System.out.println("3333");

		}
	}

	public void err(){
		throw new Error();
	}

}
