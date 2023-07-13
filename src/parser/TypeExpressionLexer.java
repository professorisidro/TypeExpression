// Generated from TypeExpression.g4 by ANTLR 4.13.0
package parser;

	import java.util.ArrayList;
	import symbols.DataType;
	import symbols.Identifier;
	import symbols.SymbolTable;
	import expressions.*;
	import ast.*;
	

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TypeExpressionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, NUMBER=11, TEXT=12, ATTR=13, SUM=14, SUB=15, OPREL=16, ID=17, 
		VIRG=18, PF=19, AP=20, FP=21, BLANK=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "NUMBER", "TEXT", "ATTR", "SUM", "SUB", "OPREL", "ID", "VIRG", 
			"PF", "AP", "FP", "BLANK"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog.'", "'INTEGER'", "'REAL'", "'se'", "'entao'", 
			"'senao'", "'fimse'", "'leia'", "'escreva'", null, null, "':='", "'+'", 
			"'-'", null, null, "','", "'.'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "NUMBER", 
			"TEXT", "ATTR", "SUM", "SUB", "OPREL", "ID", "VIRG", "PF", "AP", "FP", 
			"BLANK"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


		private SymbolTable symbolTable = new SymbolTable();
		private DataType currentType;
		private AbstractExpression expression;
		private char operator;
		private DataType leftDT;
		private DataType rightDT;
		private String   idAtribuido;
		private String   text;
		private Program  program = new Program();
		
		public void init(){
			program.setSymbolTable(symbolTable);
		}
			
		public void exibirID(){
			symbolTable.getSymbols().values().stream().forEach((id)->System.out.println(id));
		}
		
		public void generateObjectCode(){
			program.generateTarget();
		}
		
		public void runInterpreter(){
			program.run();
		}


	public TypeExpressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TypeExpression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0016\u00a2\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0004\np\b\n\u000b\n\f\nq\u0001"+
		"\u000b\u0001\u000b\u0005\u000bv\b\u000b\n\u000b\f\u000by\t\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u008e\b\u000f\u0001\u0010\u0001\u0010\u0005\u0010\u0092\b\u0010\n\u0010"+
		"\f\u0010\u0095\t\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0000\u0000\u0016\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016\u0001\u0000\u0005\u0001\u000009\u0006"+
		"\u0000\t\t !--09AZaz\u0001\u0000az\u0003\u000009AZaz\u0003\u0000\t\n\r"+
		"\r  \u00a9\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0001-\u0001\u0000\u0000"+
		"\u0000\u00036\u0001\u0000\u0000\u0000\u0005?\u0001\u0000\u0000\u0000\u0007"+
		"G\u0001\u0000\u0000\u0000\tL\u0001\u0000\u0000\u0000\u000bO\u0001\u0000"+
		"\u0000\u0000\rU\u0001\u0000\u0000\u0000\u000f[\u0001\u0000\u0000\u0000"+
		"\u0011a\u0001\u0000\u0000\u0000\u0013f\u0001\u0000\u0000\u0000\u0015o"+
		"\u0001\u0000\u0000\u0000\u0017s\u0001\u0000\u0000\u0000\u0019|\u0001\u0000"+
		"\u0000\u0000\u001b\u007f\u0001\u0000\u0000\u0000\u001d\u0081\u0001\u0000"+
		"\u0000\u0000\u001f\u008d\u0001\u0000\u0000\u0000!\u008f\u0001\u0000\u0000"+
		"\u0000#\u0096\u0001\u0000\u0000\u0000%\u0098\u0001\u0000\u0000\u0000\'"+
		"\u009a\u0001\u0000\u0000\u0000)\u009c\u0001\u0000\u0000\u0000+\u009e\u0001"+
		"\u0000\u0000\u0000-.\u0005p\u0000\u0000./\u0005r\u0000\u0000/0\u0005o"+
		"\u0000\u000001\u0005g\u0000\u000012\u0005r\u0000\u000023\u0005a\u0000"+
		"\u000034\u0005m\u0000\u000045\u0005a\u0000\u00005\u0002\u0001\u0000\u0000"+
		"\u000067\u0005f\u0000\u000078\u0005i\u0000\u000089\u0005m\u0000\u0000"+
		"9:\u0005p\u0000\u0000:;\u0005r\u0000\u0000;<\u0005o\u0000\u0000<=\u0005"+
		"g\u0000\u0000=>\u0005.\u0000\u0000>\u0004\u0001\u0000\u0000\u0000?@\u0005"+
		"I\u0000\u0000@A\u0005N\u0000\u0000AB\u0005T\u0000\u0000BC\u0005E\u0000"+
		"\u0000CD\u0005G\u0000\u0000DE\u0005E\u0000\u0000EF\u0005R\u0000\u0000"+
		"F\u0006\u0001\u0000\u0000\u0000GH\u0005R\u0000\u0000HI\u0005E\u0000\u0000"+
		"IJ\u0005A\u0000\u0000JK\u0005L\u0000\u0000K\b\u0001\u0000\u0000\u0000"+
		"LM\u0005s\u0000\u0000MN\u0005e\u0000\u0000N\n\u0001\u0000\u0000\u0000"+
		"OP\u0005e\u0000\u0000PQ\u0005n\u0000\u0000QR\u0005t\u0000\u0000RS\u0005"+
		"a\u0000\u0000ST\u0005o\u0000\u0000T\f\u0001\u0000\u0000\u0000UV\u0005"+
		"s\u0000\u0000VW\u0005e\u0000\u0000WX\u0005n\u0000\u0000XY\u0005a\u0000"+
		"\u0000YZ\u0005o\u0000\u0000Z\u000e\u0001\u0000\u0000\u0000[\\\u0005f\u0000"+
		"\u0000\\]\u0005i\u0000\u0000]^\u0005m\u0000\u0000^_\u0005s\u0000\u0000"+
		"_`\u0005e\u0000\u0000`\u0010\u0001\u0000\u0000\u0000ab\u0005l\u0000\u0000"+
		"bc\u0005e\u0000\u0000cd\u0005i\u0000\u0000de\u0005a\u0000\u0000e\u0012"+
		"\u0001\u0000\u0000\u0000fg\u0005e\u0000\u0000gh\u0005s\u0000\u0000hi\u0005"+
		"c\u0000\u0000ij\u0005r\u0000\u0000jk\u0005e\u0000\u0000kl\u0005v\u0000"+
		"\u0000lm\u0005a\u0000\u0000m\u0014\u0001\u0000\u0000\u0000np\u0007\u0000"+
		"\u0000\u0000on\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qo\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r\u0016\u0001\u0000\u0000"+
		"\u0000sw\u0005\"\u0000\u0000tv\u0007\u0001\u0000\u0000ut\u0001\u0000\u0000"+
		"\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000xz\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z{\u0005"+
		"\"\u0000\u0000{\u0018\u0001\u0000\u0000\u0000|}\u0005:\u0000\u0000}~\u0005"+
		"=\u0000\u0000~\u001a\u0001\u0000\u0000\u0000\u007f\u0080\u0005+\u0000"+
		"\u0000\u0080\u001c\u0001\u0000\u0000\u0000\u0081\u0082\u0005-\u0000\u0000"+
		"\u0082\u001e\u0001\u0000\u0000\u0000\u0083\u008e\u0005>\u0000\u0000\u0084"+
		"\u0085\u0005>\u0000\u0000\u0085\u008e\u0005=\u0000\u0000\u0086\u008e\u0005"+
		"<\u0000\u0000\u0087\u0088\u0005<\u0000\u0000\u0088\u008e\u0005=\u0000"+
		"\u0000\u0089\u008a\u0005=\u0000\u0000\u008a\u008e\u0005=\u0000\u0000\u008b"+
		"\u008c\u0005<\u0000\u0000\u008c\u008e\u0005>\u0000\u0000\u008d\u0083\u0001"+
		"\u0000\u0000\u0000\u008d\u0084\u0001\u0000\u0000\u0000\u008d\u0086\u0001"+
		"\u0000\u0000\u0000\u008d\u0087\u0001\u0000\u0000\u0000\u008d\u0089\u0001"+
		"\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e \u0001\u0000"+
		"\u0000\u0000\u008f\u0093\u0007\u0002\u0000\u0000\u0090\u0092\u0007\u0003"+
		"\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000"+
		"\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000"+
		"\u0000\u0000\u0094\"\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0005,\u0000\u0000\u0097$\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0005.\u0000\u0000\u0099&\u0001\u0000\u0000\u0000\u009a\u009b\u0005"+
		"(\u0000\u0000\u009b(\u0001\u0000\u0000\u0000\u009c\u009d\u0005)\u0000"+
		"\u0000\u009d*\u0001\u0000\u0000\u0000\u009e\u009f\u0007\u0004\u0000\u0000"+
		"\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0006\u0015\u0000\u0000"+
		"\u00a1,\u0001\u0000\u0000\u0000\u0007\u0000quw\u008d\u0091\u0093\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}