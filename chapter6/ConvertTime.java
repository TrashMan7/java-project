/*Maximus Mackert,
 * 2/21/2019,
 * I created a program that converts millisecond to hours, minutes, and seconds
 */

public class ConvertTime {
//main method
	public static void main(String[] args) {
		System.out.println("234975399 converted into hours, minuets, and seconds is: " + convertMillis(234975399));
		
	}
//method converting milliseconds
	public static String convertMillis(long millis) {
		int hour = (int) (millis / 3600000);
		int remainder = (int) (millis - (hour * 3600000));
		int min = (int) (remainder / 60000);
		remainder = (int)(remainder - (min * 60000));
		int seconds = (int)(remainder / 1000);
		String s = hour + ":" + min + ":" + seconds;
		return s;
	}
}