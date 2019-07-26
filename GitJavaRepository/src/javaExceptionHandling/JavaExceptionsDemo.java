package javaExceptionHandling;

/* 
 * Finally will work only with the combination of TRY and CATCH
 * Finally block will be executed regardless of failure or pass
 * Basing on the type of eror occured the catch will execute
 * throw will throw the exception which user has mentioned. It doesnot do it automatically as TRY & CATCH
 * 
 * 
 * 
 * */

public class JavaExceptionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("Exception handling is on the way");
		
		int arr[] = {12,13,15};
		
		//System.out.println(arr[3]);
		
		throw new ArrayIndexOutOfBoundsException("How are u doing this babu pada pada");
		
//		try 
//		{			
//			int a=0,b=10;
//			
//			int c=b/a;
//			
//			//System.out.println(c);				
//			
//		}
//		
//		catch(ArrayIndexOutOfBoundsException a)
//		{
//			a.printStackTrace();
//		}
//		
////		catch(ArithmeticException ar)
////		{
////			ar.printStackTrace();
////		}
		
//		finally
//		{
//			System.out.println("You have to show this message");
//		}
//		
	}

}
