package artifact;

/***
 * Demo class containing {@link LogicdropDemo#fun(int)} method
 * @author rgrigg
 *
 */
public class LogicdropDemo {
	/***
	 * fun - function to provide results requested in demo requirements.<br><br> 
	 * Accepts integer or zero as parameter and <br><br> 
	 * Return  the result of "Logic", "drop", or "Logicdrop" depending on the input.<br><br>
	 * <br>So:<br> 
	 * Return "Logicdrop", if the number is divisible by 15.<br>
	 * Return "Logic", if the number is divisible by 3.<br>
	 * Return "drop", if the number is divisible by 5. <br>
	 * If no other requirement is met then Return the same number . 
	 * 
	 * @param number integer or zero return
	 * @return
	 */
	public String fun(int number) {
		if (number == 0){
			return  String.valueOf(number) ;
		}else if (number % 15 == 0 ){
			return "Logicdrop";
		}else if (number % 3 == 0) {
			return "Logic";
		} else if (number % 5 == 0) {
			return "drop";
		} else {
			return  String.valueOf(number) ;
		}
	}
}
