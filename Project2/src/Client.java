import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;


public class Client {
/*Mostafa El-Katerji 201203987
 * 
 * This is the client class of this program, it sends the Colorizer a program source code, then fetches the generated HTML code
 * and saves it to a file "output.html"
 */

	public static void main(String[] args) throws IOException{
		String program = "int main(){ int i = 0; { boolean b = true; int x = 12; int z = 421; { boolean inner = true; }} return i;}";
		Colorizer col = new Colorizer(program);
		
		FileWriter write = new FileWriter("output.html", false);
		PrintWriter output = new PrintWriter(write);
		output.print(col.getHTML());
		output.close();
	}
}
