public class Strings{
	public static String modifyWords(String str, char put)
	{
        for(char c : str.toCharArray()){
        	if(c == 'H')
        		c=put;
        }
        System.out.println(str);
   return str;
	}
	public static void main(String[] args) {
		String str ="Hello World";
		System.out.println(modifyWords(str,'M'));
	}
}