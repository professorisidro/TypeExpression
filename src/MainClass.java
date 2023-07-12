import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import parser.TypeExpressionLexer;
import parser.TypeExpressionParser;

public class MainClass {
	public static void main(String[] args) {
		try {
			TypeExpressionLexer lexer = new TypeExpressionLexer(CharStreams.fromFileName("input.expr"));
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			TypeExpressionParser parser = new TypeExpressionParser(tokenStream);
			
			System.out.println("Starting Expression Analysis");
			parser.programa();
			System.out.println("Compilation Successful! Good Job");
//			parser.exibirID();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
