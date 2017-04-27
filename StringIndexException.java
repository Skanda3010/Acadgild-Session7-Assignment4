
public class StringIndexException {

	public static void main(String[] args) throws StringIndexOutOfBoundsException{
		// TODO Auto-generated method stub
	try{
		String str = "Skanda";
		char st;
		st=str.charAt(9);
		System.out.println("the character at the 9th element of the string is "+st);
		
	}catch(StringIndexOutOfBoundsException e){
		System.out.println("Exception!! there is no 9th elemenet in the string Str");
		e.printStackTrace();
		
	}
	
	}

}
