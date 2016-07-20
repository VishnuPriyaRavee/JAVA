
public class Camelcase {
	
		public static String toCamelCase(final String init) {
		    if (init==null)
		        return null;

		    final StringBuilder ret = new StringBuilder(init.length());

		    for (final String word : init.split(" ")) {
		        if (!word.isEmpty()) {
		            ret.append(word.substring(0, 1).toUpperCase());
		            ret.append(word.substring(1).toLowerCase());
		        }
		        if (!(ret.length()==init.length()))
		            ret.append(" ");
		    }

		    return ret.toString();
		}
		public static void main(String[] args) {
			A a=new A();
			System.out.println(a.toCamelCase("priya"));
			

}
}
