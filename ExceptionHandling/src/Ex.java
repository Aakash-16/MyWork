
public class Ex {

	public static void main(String[] args) throws Exception {
		
		int a = 9 ;
		try {
			int b = a/0;
			return ;
		}

		catch (ArithmeticException ae)
		{System.out.println( " in AE");
			throw new RuntimeException();
		
		}
		catch(RuntimeException re){
			System.out.println( " in RE");
			throw  new Exception();
		
		}
		catch(Exception e ){
			
		}
		catch (Throwable t )	{
			
		}
			
			
finally{
		System.out.println("in finally ");	
		}
	}
}
