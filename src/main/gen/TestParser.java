// Generated from D:/����/Compiler/src/main/gen/generated\Test.g4 by ANTLR 4.8
package main.gen;

    import main.handle.GrammaHandler;
    import main.handle.MyParser;
    import main.model.*;
    
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TestParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, MATH_SYMB=37, STRING=38, 
		INT=39, WORD=40, WS=41, SYMB=42;
	public static final int
		RULE_program = 0, RULE_variable = 1, RULE_type = 2, RULE_name = 3, RULE_value = 4, 
		RULE_expression = 5, RULE_relation = 6, RULE_statement = 7, RULE_ifstatement = 8, 
		RULE_whilestatement = 9, RULE_forstatement = 10, RULE_switchstatement = 11, 
		RULE_procedure = 12, RULE_function = 13, RULE_function_call = 14, RULE_parameters = 15, 
		RULE_parameter = 16, RULE_print = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "variable", "type", "name", "value", "expression", "relation", 
			"statement", "ifstatement", "whilestatement", "forstatement", "switchstatement", 
			"procedure", "function", "function_call", "parameters", "parameter", 
			"print"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'start'", "'finish'", "' = '", "', '", "';'", "'int'", 
			"'String'", "'\"'", "'=='", "'!='", "'<'", "'<='", "'>='", "'>'", "'if'", 
			"'('", "')'", "'else'", "'endif'", "'while'", "'endwhile'", "'for'", 
			"'endfor'", "'switch'", "':'", "'case'", "'endcase'", "'default'", "'endswitch'", 
			"'procedure'", "'end'", "'function'", "'return'", "','", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "MATH_SYMB", "STRING", "INT", "WORD", "WS", "SYMB"
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

	@Override
	public String getGrammarFileName() { return "Test.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private GrammaHandler handler = new GrammaHandler();
	    private MyParser parser = new MyParser();
	    
	public TestParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(TestParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TestParser.WS, i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<ProcedureContext> procedure() {
			return getRuleContexts(ProcedureContext.class);
		}
		public ProcedureContext procedure(int i) {
			return getRuleContext(ProcedureContext.class,i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__0);
			parser.prepareFiles();
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(38);
				match(WS);
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			match(T__1);
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(45);
					match(WS);
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(58);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(51);
						variable();
						}
						break;
					case 2:
						{
						setState(52);
						expression();
						}
						break;
					case 3:
						{
						setState(53);
						statement();
						}
						break;
					case 4:
						{
						setState(54);
						function();
						}
						break;
					case 5:
						{
						setState(55);
						procedure();
						}
						break;
					case 6:
						{
						setState(56);
						function_call();
						}
						break;
					case 7:
						{
						setState(57);
						print();
						}
						break;
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(63);
				match(WS);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			match(T__2);
			parser.closeFiles();
			handler.test();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TypeContext type;
		public NameContext name;
		public ValueContext value;
		public ExpressionContext expression;
		public Function_callContext function_call;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(TestParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TestParser.WS, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(73);
				match(WS);
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			((VariableContext)_localctx).type = type();
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				match(WS);
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(85);
			((VariableContext)_localctx).name = name();
			handler.addVar(new Variable((((VariableContext)_localctx).name!=null?_input.getText(((VariableContext)_localctx).name.start,((VariableContext)_localctx).name.stop):null), (((VariableContext)_localctx).type!=null?_input.getText(((VariableContext)_localctx).type.start,((VariableContext)_localctx).type.stop):null), handler.scope));
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(87);
				match(T__3);
				}
			}

			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(90);
				((VariableContext)_localctx).value = value();
				handler.getVarByName((((VariableContext)_localctx).name!=null?_input.getText(((VariableContext)_localctx).name.start,((VariableContext)_localctx).name.stop):null)).setValue(((VariableContext)_localctx).value.val);
				}
				break;
			case 2:
				{
				setState(93);
				((VariableContext)_localctx).expression = expression();
				handler.getVarByName((((VariableContext)_localctx).name!=null?_input.getText(((VariableContext)_localctx).name.start,((VariableContext)_localctx).name.stop):null)).setValue(((VariableContext)_localctx).expression.val);
				}
				break;
			case 3:
				{
				setState(96);
				((VariableContext)_localctx).function_call = function_call();
				handler.getVarByName((((VariableContext)_localctx).name!=null?_input.getText(((VariableContext)_localctx).name.start,((VariableContext)_localctx).name.stop):null)).setValue(((VariableContext)_localctx).function_call.val);
				}
				break;
			}
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(101);
				match(T__4);
				setState(102);
				((VariableContext)_localctx).name = name();
				handler.addVar(new Variable((((VariableContext)_localctx).name!=null?_input.getText(((VariableContext)_localctx).name.start,((VariableContext)_localctx).name.stop):null), (((VariableContext)_localctx).type!=null?_input.getText(((VariableContext)_localctx).type.start,((VariableContext)_localctx).type.stop):null), handler.scope));
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(104);
					match(T__3);
					}
				}

				setState(116);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(107);
					((VariableContext)_localctx).value = value();
					handler.getVarByName((((VariableContext)_localctx).name!=null?_input.getText(((VariableContext)_localctx).name.start,((VariableContext)_localctx).name.stop):null)).setValue(((VariableContext)_localctx).value.val);
					}
					break;
				case 2:
					{
					setState(110);
					((VariableContext)_localctx).expression = expression();
					handler.getVarByName((((VariableContext)_localctx).name!=null?_input.getText(((VariableContext)_localctx).name.start,((VariableContext)_localctx).name.stop):null)).setValue(((VariableContext)_localctx).expression.val);
					}
					break;
				case 3:
					{
					setState(113);
					((VariableContext)_localctx).function_call = function_call();
					handler.getVarByName((((VariableContext)_localctx).name!=null?_input.getText(((VariableContext)_localctx).name.start,((VariableContext)_localctx).name.stop):null)).setValue(((VariableContext)_localctx).function_call.val);
					}
					break;
				}
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(123);
				match(WS);
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			match(T__5);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(130);
					match(WS);
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			parser.writeVariables(handler.scope);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TestParser.STRING, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public String val;
		public String typeOfVal;
		public Token STRING;
		public Token INT;
		public TerminalNode STRING() { return getToken(TestParser.STRING, 0); }
		public TerminalNode INT() { return getToken(TestParser.INT, 0); }
		public List<TerminalNode> WS() { return getTokens(TestParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TestParser.WS, i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				{
				setState(142);
				match(T__8);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(143);
					match(WS);
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(149);
				((ValueContext)_localctx).STRING = match(STRING);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(150);
					match(WS);
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(156);
				match(T__8);
				((ValueContext)_localctx).val =  "\"" + (((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null) + "\""; ((ValueContext)_localctx).typeOfVal =  "String";
				}
				break;
			case INT:
				{
				setState(158);
				((ValueContext)_localctx).INT = match(INT);
				((ValueContext)_localctx).val =  (((ValueContext)_localctx).INT!=null?((ValueContext)_localctx).INT.getText():null); ((ValueContext)_localctx).typeOfVal =  "Int";
				}
				break;
			case STRING:
				{
				setState(160);
				((ValueContext)_localctx).STRING = match(STRING);
				((ValueContext)_localctx).val =  (((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null); ((ValueContext)_localctx).typeOfVal =  "Var";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public String val;
		public ValueContext s1;
		public Token MATH_SYMB;
		public ValueContext s2;
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(TestParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TestParser.WS, i);
		}
		public List<TerminalNode> MATH_SYMB() { return getTokens(TestParser.MATH_SYMB); }
		public TerminalNode MATH_SYMB(int i) {
			return getToken(TestParser.MATH_SYMB, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(164);
				match(WS);
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			((ExpressionContext)_localctx).s1 = value();
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(171);
					match(WS);
					}
					} 
				}
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			((ExpressionContext)_localctx).val =  (((ExpressionContext)_localctx).s1!=null?_input.getText(((ExpressionContext)_localctx).s1.start,((ExpressionContext)_localctx).s1.stop):null);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MATH_SYMB) {
				{
				{
				setState(178);
				((ExpressionContext)_localctx).MATH_SYMB = match(MATH_SYMB);
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(179);
						match(WS);
						}
						} 
					}
					setState(184);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(185);
						((ExpressionContext)_localctx).s2 = value();
						}
						} 
					}
					setState(190);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(191);
						match(WS);
						}
						} 
					}
					setState(196);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				if ((((ExpressionContext)_localctx).s2!=null?_input.getText(((ExpressionContext)_localctx).s2.start,((ExpressionContext)_localctx).s2.stop):null)!=null) {
				                                         if (((ExpressionContext)_localctx).s1.typeOfVal.equals("String")){
				                                            ((ExpressionContext)_localctx).val =  _localctx.val + parser.getMathSign("String", (((ExpressionContext)_localctx).MATH_SYMB!=null?((ExpressionContext)_localctx).MATH_SYMB.getText():null), _localctx.val, (((ExpressionContext)_localctx).s2!=null?_input.getText(((ExpressionContext)_localctx).s2.start,((ExpressionContext)_localctx).s2.stop):null));
				                                            } else {
				                                            ((ExpressionContext)_localctx).val =  _localctx.val + " " + parser.getMathSign("Int", (((ExpressionContext)_localctx).MATH_SYMB!=null?((ExpressionContext)_localctx).MATH_SYMB.getText():null), _localctx.val, (((ExpressionContext)_localctx).s2!=null?_input.getText(((ExpressionContext)_localctx).s2.start,((ExpressionContext)_localctx).s2.stop):null));
				                                            }

				                                         } else {((ExpressionContext)_localctx).val =  _localctx.val + " " + (((ExpressionContext)_localctx).MATH_SYMB!=null?((ExpressionContext)_localctx).MATH_SYMB.getText():null);
				                                         }
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public String strValF;
		public String strValS;
		public String typeOfValue;
		public String sign;
		public ValueContext v1;
		public ValueContext v2;
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(TestParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TestParser.WS, i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_relation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(203);
				match(WS);
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
			((RelationContext)_localctx).v1 = value();
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(210);
					match(WS);
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) {
				{
				{
				setState(228);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__9:
					{
					setState(216);
					match(T__9);
					((RelationContext)_localctx).sign = "==";
					}
					break;
				case T__10:
					{
					setState(218);
					match(T__10);
					((RelationContext)_localctx).sign = "!=";
					}
					break;
				case T__11:
					{
					setState(220);
					match(T__11);
					((RelationContext)_localctx).sign = "<";
					}
					break;
				case T__12:
					{
					setState(222);
					match(T__12);
					((RelationContext)_localctx).sign = "<=";
					}
					break;
				case T__13:
					{
					setState(224);
					match(T__13);
					((RelationContext)_localctx).sign = ">=";
					}
					break;
				case T__14:
					{
					setState(226);
					match(T__14);
					((RelationContext)_localctx).sign = ">";
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(230);
					match(WS);
					}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(236);
				((RelationContext)_localctx).v2 = value();
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(237);
						match(WS);
						}
						} 
					}
					setState(242);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				((RelationContext)_localctx).strValF =  ((RelationContext)_localctx).v1.val; ((RelationContext)_localctx).strValS =  ((RelationContext)_localctx).v2.val;
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public WhilestatementContext whilestatement() {
			return getRuleContext(WhilestatementContext.class,0);
		}
		public ForstatementContext forstatement() {
			return getRuleContext(ForstatementContext.class,0);
		}
		public SwitchstatementContext switchstatement() {
			return getRuleContext(SwitchstatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				ifstatement();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				whilestatement();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				forstatement();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				switchstatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfstatementContext extends ParserRuleContext {
		public RelationContext relation;
		public ExpressionContext expression;
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TestParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TestParser.WS, i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterIfstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitIfstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitIfstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifstatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(T__15);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(257);
				match(WS);
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
			match(T__16);
			setState(267);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(264);
					match(WS);
					}
					} 
				}
				setState(269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(270);
			((IfstatementContext)_localctx).relation = relation();
			parser.makeRelationHeader(((IfstatementContext)_localctx).relation.strValF, ((IfstatementContext)_localctx).relation.strValS, "if", handler.scope);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(272);
				match(WS);
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
			match(T__17);
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(279);
					match(WS);
					}
					} 
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(299);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						setState(285);
						variable();
						}
						break;
					case 2:
						{
						setState(286);
						((IfstatementContext)_localctx).expression = expression();
						setState(290);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(287);
								match(WS);
								}
								} 
							}
							setState(292);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
						}
						}
						break;
					case 3:
						{
						setState(293);
						function_call();
						}
						break;
					case 4:
						{
						setState(294);
						statement();
						}
						break;
					case 5:
						{
						setState(295);
						print();
						setState(296);
						match(T__5);
						parser.makeRelationBody(((IfstatementContext)_localctx).expression.val, handler.scope);
						}
						break;
					}
					} 
				}
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(304);
					match(WS);
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(339);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(337);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						setState(310);
						match(T__18);
						setState(314);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(311);
								match(WS);
								}
								} 
							}
							setState(316);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
						}
						setState(317);
						variable();
						}
						break;
					case 2:
						{
						setState(318);
						((IfstatementContext)_localctx).expression = expression();
						setState(322);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(319);
								match(WS);
								}
								} 
							}
							setState(324);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
						}
						}
						break;
					case 3:
						{
						setState(325);
						function_call();
						}
						break;
					case 4:
						{
						setState(326);
						statement();
						}
						break;
					case 5:
						{
						setState(327);
						print();
						setState(331);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(328);
							match(WS);
							}
							}
							setState(333);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(334);
						match(T__5);
						parser.makeRelationBody(" } else {" + ((IfstatementContext)_localctx).expression.val + " }", handler.scope);
						}
						break;
					}
					} 
				}
				setState(341);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(342);
				match(WS);
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(348);
			match(T__19);
			setState(352);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(349);
					match(WS);
					}
					} 
				}
				setState(354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhilestatementContext extends ParserRuleContext {
		public RelationContext relation;
		public ExpressionContext expression;
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TestParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TestParser.WS, i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public WhilestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterWhilestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitWhilestatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitWhilestatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilestatementContext whilestatement() throws RecognitionException {
		WhilestatementContext _localctx = new WhilestatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whilestatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(T__20);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(356);
				match(WS);
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(362);
			match(T__16);
			setState(366);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(363);
					match(WS);
					}
					} 
				}
				setState(368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(369);
			((WhilestatementContext)_localctx).relation = relation();
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(370);
				match(WS);
				}
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			parser.makeRelationHeader(((WhilestatementContext)_localctx).relation.strValF, ((WhilestatementContext)_localctx).relation.strValS, "while", handler.scope);
			setState(377);
			match(T__17);
			setState(381);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(378);
					match(WS);
					}
					} 
				}
				setState(383);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			setState(412);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(410);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						setState(387);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(384);
								match(WS);
								}
								} 
							}
							setState(389);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
						}
						setState(390);
						variable();
						}
						break;
					case 2:
						{
						setState(391);
						((WhilestatementContext)_localctx).expression = expression();
						setState(395);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(392);
								match(WS);
								}
								} 
							}
							setState(397);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
						}
						}
						break;
					case 3:
						{
						setState(398);
						function_call();
						}
						break;
					case 4:
						{
						setState(399);
						statement();
						}
						break;
					case 5:
						{
						setState(400);
						print();
						setState(404);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(401);
							match(WS);
							}
							}
							setState(406);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(407);
						match(T__5);
						parser.makeRelationBody(((WhilestatementContext)_localctx).expression.val, handler.scope);
						}
						break;
					}
					} 
				}
				setState(414);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(415);
				match(WS);
				}
				}
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(421);
			match(T__21);
			setState(425);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(422);
					match(WS);
					}
					} 
				}
				setState(427);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			parser.closeRelation(handler.scope);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForstatementContext extends ParserRuleContext {
		public RelationContext relation;
		public ExpressionContext expression;
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(TestParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TestParser.WS, i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public ForstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterForstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitForstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitForstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForstatementContext forstatement() throws RecognitionException {
		ForstatementContext _localctx = new ForstatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forstatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(T__22);
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(431);
				match(WS);
				}
				}
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(437);
			match(T__16);
			parser.makeLoopHeader(handler.scope);
			setState(442);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(439);
					match(WS);
					}
					} 
				}
				setState(444);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(445);
			variable();
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(446);
				match(WS);
				}
				}
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(452);
			match(T__5);
			setState(456);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(453);
					match(WS);
					}
					} 
				}
				setState(458);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			setState(459);
			((ForstatementContext)_localctx).relation = relation();
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(460);
				match(WS);
				}
				}
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(466);
			match(T__5);
			setState(470);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(467);
					match(WS);
					}
					} 
				}
				setState(472);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			setState(473);
			((ForstatementContext)_localctx).expression = expression();
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(474);
				match(WS);
				}
				}
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(480);
			match(T__17);
			setState(484);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(481);
					match(WS);
					}
					} 
				}
				setState(486);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			parser.makeLoopHeaderParams(((ForstatementContext)_localctx).relation.strValF, ((ForstatementContext)_localctx).relation.sign, ((ForstatementContext)_localctx).relation.strValS, ((ForstatementContext)_localctx).expression.val, handler.scope);
			setState(516);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(514);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						setState(491);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(488);
								match(WS);
								}
								} 
							}
							setState(493);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
						}
						setState(494);
						variable();
						}
						break;
					case 2:
						{
						setState(495);
						((ForstatementContext)_localctx).expression = expression();
						parser.makeRelationBody(((ForstatementContext)_localctx).expression.val, handler.scope);
						setState(500);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(497);
								match(WS);
								}
								} 
							}
							setState(502);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
						}
						}
						break;
					case 3:
						{
						setState(503);
						function_call();
						}
						break;
					case 4:
						{
						setState(504);
						statement();
						}
						break;
					case 5:
						{
						setState(505);
						print();
						setState(509);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(506);
							match(WS);
							}
							}
							setState(511);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(512);
						match(T__5);
						}
						break;
					}
					} 
				}
				setState(518);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(519);
				match(WS);
				}
				}
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(525);
			match(T__23);
			setState(529);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(526);
					match(WS);
					}
					} 
				}
				setState(531);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			parser.closeRelation(handler.scope);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchstatementContext extends ParserRuleContext {
		public ExpressionContext expression;
		public ValueContext value;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(TestParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TestParser.WS, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public SwitchstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterSwitchstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitSwitchstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitSwitchstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchstatementContext switchstatement() throws RecognitionException {
		SwitchstatementContext _localctx = new SwitchstatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_switchstatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(T__24);
			setState(538);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(535);
					match(WS);
					}
					} 
				}
				setState(540);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(541);
			((SwitchstatementContext)_localctx).expression = expression();
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(542);
				match(WS);
				}
				}
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			parser.makeRelationHeader(((SwitchstatementContext)_localctx).expression.val, ((SwitchstatementContext)_localctx).expression.val, "switch", handler.scope);
			setState(549);
			match(T__25);
			setState(553);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(550);
					match(WS);
					}
					} 
				}
				setState(555);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			setState(623); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(559);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(556);
						match(WS);
						}
						}
						setState(561);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(562);
					match(T__26);
					setState(566);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(563);
						match(WS);
						}
						}
						setState(568);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(569);
					((SwitchstatementContext)_localctx).value = value();
					setState(573);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(570);
						match(WS);
						}
						}
						setState(575);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					parser.makeRelationHeader(((SwitchstatementContext)_localctx).value.val, ((SwitchstatementContext)_localctx).value.val, "case", handler.scope);
					setState(577);
					match(T__25);
					setState(581);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(578);
							match(WS);
							}
							} 
						}
						setState(583);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
					}
					setState(611);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							setState(609);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
							case 1:
								{
								setState(587);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(584);
										match(WS);
										}
										} 
									}
									setState(589);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
								}
								setState(590);
								variable();
								}
								break;
							case 2:
								{
								setState(591);
								((SwitchstatementContext)_localctx).expression = expression();
								setState(595);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(592);
										match(WS);
										}
										} 
									}
									setState(597);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
								}
								}
								break;
							case 3:
								{
								setState(598);
								function_call();
								}
								break;
							case 4:
								{
								setState(599);
								statement();
								}
								break;
							case 5:
								{
								setState(600);
								print();
								setState(604);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==WS) {
									{
									{
									setState(601);
									match(WS);
									}
									}
									setState(606);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(607);
								match(T__5);
								}
								break;
							}
							} 
						}
						setState(613);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
					}
					setState(617);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(614);
						match(WS);
						}
						}
						setState(619);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(620);
					match(T__27);
					parser.makeRelationHeader(((SwitchstatementContext)_localctx).value.val, ((SwitchstatementContext)_localctx).value.val, "endcase", handler.scope);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(625); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(630);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(627);
					match(WS);
					}
					} 
				}
				setState(632);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			}
			setState(692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(633);
					match(WS);
					}
					}
					setState(638);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(639);
				match(T__28);
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(640);
					match(WS);
					}
					}
					setState(645);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				parser.makeRelationHeader(((SwitchstatementContext)_localctx).value.val, ((SwitchstatementContext)_localctx).value.val, "default", handler.scope);
				setState(647);
				match(T__25);
				setState(651);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(648);
						match(WS);
						}
						} 
					}
					setState(653);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				}
				setState(681);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(679);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
						case 1:
							{
							setState(657);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(654);
									match(WS);
									}
									} 
								}
								setState(659);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
							}
							setState(660);
							variable();
							}
							break;
						case 2:
							{
							setState(661);
							((SwitchstatementContext)_localctx).expression = expression();
							setState(665);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(662);
									match(WS);
									}
									} 
								}
								setState(667);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
							}
							}
							break;
						case 3:
							{
							setState(668);
							function_call();
							}
							break;
						case 4:
							{
							setState(669);
							statement();
							}
							break;
						case 5:
							{
							setState(670);
							print();
							setState(674);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS) {
								{
								{
								setState(671);
								match(WS);
								}
								}
								setState(676);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(677);
							match(T__5);
							}
							break;
						}
						} 
					}
					setState(683);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				}
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(684);
					match(WS);
					}
					}
					setState(689);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(690);
				match(T__27);
				parser.makeRelationHeader(((SwitchstatementContext)_localctx).value.val, ((SwitchstatementContext)_localctx).value.val, "endcase", handler.scope);
				}
				break;
			}
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(694);
				match(WS);
				}
				}
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(700);
			match(T__29);
			setState(704);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(701);
					match(WS);
					}
					} 
				}
				setState(706);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			}
			parser.closeRelation(handler.scope);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureContext extends ParserRuleContext {
		public NameContext name;
		public ParametersContext parameters;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TestParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TestParser.WS, i);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_procedure);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			match(T__30);
			setState(711); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(710);
				match(WS);
				}
				}
				setState(713); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(715);
			((ProcedureContext)_localctx).name = name();
			handler.scope = (((ProcedureContext)_localctx).name!=null?_input.getText(((ProcedureContext)_localctx).name.start,((ProcedureContext)_localctx).name.stop):null);
			setState(720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(717);
				match(WS);
				}
				}
				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(723);
			match(T__16);
			setState(727);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(724);
					match(WS);
					}
					} 
				}
				setState(729);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			}
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << STRING))) != 0)) {
				{
				setState(730);
				((ProcedureContext)_localctx).parameters = parameters();
				}
			}

			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(733);
				match(WS);
				}
				}
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(739);
			match(T__17);
			parser.makeProcedureHeader((((ProcedureContext)_localctx).name!=null?_input.getText(((ProcedureContext)_localctx).name.start,((ProcedureContext)_localctx).name.stop):null), ((ProcedureContext)_localctx).parameters.val);
			setState(744);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(741);
					match(WS);
					}
					} 
				}
				setState(746);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			}
			setState(760);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(758);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
					case 1:
						{
						setState(747);
						variable();
						}
						break;
					case 2:
						{
						setState(748);
						expression();
						setState(752);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(749);
								match(WS);
								}
								} 
							}
							setState(754);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
						}
						}
						break;
					case 3:
						{
						setState(755);
						function_call();
						}
						break;
					case 4:
						{
						setState(756);
						statement();
						}
						break;
					case 5:
						{
						setState(757);
						print();
						}
						break;
					}
					} 
				}
				setState(762);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			}
			setState(766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(763);
				match(WS);
				}
				}
				setState(768);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(769);
			match(T__31);
			parser.closeProcedure();
			handler.scope = "global";
			setState(775);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(772);
					match(WS);
					}
					} 
				}
				setState(777);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public String val;
		public TypeContext type;
		public NameContext name;
		public ParametersContext parameters;
		public ExpressionContext expression;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(TestParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TestParser.WS, i);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			match(T__32);
			setState(780); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(779);
				match(WS);
				}
				}
				setState(782); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(784);
			((FunctionContext)_localctx).type = type();
			setState(786); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(785);
				match(WS);
				}
				}
				setState(788); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(790);
			((FunctionContext)_localctx).name = name();
			handler.scope = (((FunctionContext)_localctx).name!=null?_input.getText(((FunctionContext)_localctx).name.start,((FunctionContext)_localctx).name.stop):null);
			setState(795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(792);
				match(WS);
				}
				}
				setState(797);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(798);
			match(T__16);
			setState(802);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(799);
					match(WS);
					}
					} 
				}
				setState(804);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			}
			setState(806);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << STRING))) != 0)) {
				{
				setState(805);
				((FunctionContext)_localctx).parameters = parameters();
				}
			}

			setState(811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(808);
				match(WS);
				}
				}
				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(814);
			match(T__17);
			parser.makeFuncHeader((((FunctionContext)_localctx).type!=null?_input.getText(((FunctionContext)_localctx).type.start,((FunctionContext)_localctx).type.stop):null) + " " + (((FunctionContext)_localctx).name!=null?_input.getText(((FunctionContext)_localctx).name.start,((FunctionContext)_localctx).name.stop):null), ((FunctionContext)_localctx).parameters.val);
			setState(819);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(816);
					match(WS);
					}
					} 
				}
				setState(821);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			}
			setState(835);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(833);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
					case 1:
						{
						setState(822);
						variable();
						}
						break;
					case 2:
						{
						setState(823);
						((FunctionContext)_localctx).expression = expression();
						setState(827);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(824);
								match(WS);
								}
								} 
							}
							setState(829);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
						}
						}
						break;
					case 3:
						{
						setState(830);
						function_call();
						}
						break;
					case 4:
						{
						setState(831);
						statement();
						}
						break;
					case 5:
						{
						setState(832);
						print();
						}
						break;
					}
					} 
				}
				setState(837);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			}
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(838);
				match(WS);
				}
				}
				setState(843);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(844);
			match(T__33);
			setState(846); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(845);
					match(WS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(848); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(850);
			((FunctionContext)_localctx).expression = expression();
			setState(854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(851);
				match(WS);
				}
				}
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(857);
			match(T__5);
			parser.closeFunc(((FunctionContext)_localctx).expression.val);
			handler.scope = "global";
			setState(863);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(860);
					match(WS);
					}
					} 
				}
				setState(865);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public String val;
		public NameContext name;
		public ParametersContext parameters;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TestParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TestParser.WS, i);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_call);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(866);
				match(WS);
				}
				}
				setState(871);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(872);
			((Function_callContext)_localctx).name = name();
			setState(876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(873);
				match(WS);
				}
				}
				setState(878);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(879);
			match(T__16);
			setState(883);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(880);
					match(WS);
					}
					} 
				}
				setState(885);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			}
			setState(887);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << STRING))) != 0)) {
				{
				setState(886);
				((Function_callContext)_localctx).parameters = parameters();
				}
			}

			setState(892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(889);
				match(WS);
				}
				}
				setState(894);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(895);
			match(T__17);
			setState(899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(896);
				match(WS);
				}
				}
				setState(901);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(902);
			match(T__5);
			parser.makeFuncCall((((Function_callContext)_localctx).name!=null?_input.getText(((Function_callContext)_localctx).name.start,((Function_callContext)_localctx).name.stop):null), ((Function_callContext)_localctx).parameters.val);
			                                             ((Function_callContext)_localctx).val = (((Function_callContext)_localctx).name!=null?_input.getText(((Function_callContext)_localctx).name.start,((Function_callContext)_localctx).name.stop):null) + " (" +  ((Function_callContext)_localctx).parameters.val + ")";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public String val;
		public ParameterContext p1;
		public ParameterContext p2;
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(TestParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TestParser.WS, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
			((ParametersContext)_localctx).p1 = parameter();
			((ParametersContext)_localctx).val =  ((ParametersContext)_localctx).p1.val;
			setState(910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(907);
				match(WS);
				}
				}
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(913);
			match(T__34);
			setState(917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(914);
				match(WS);
				}
				}
				setState(919);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(920);
			((ParametersContext)_localctx).p2 = parameter();
			((ParametersContext)_localctx).val =  _localctx.val + ","+ ((ParametersContext)_localctx).p2.val;
			setState(925);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(922);
					match(WS);
					}
					} 
				}
				setState(927);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public String val;
		public TypeContext type;
		public NameContext name;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(TestParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TestParser.WS, i);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==T__7) {
				{
				{
				setState(928);
				((ParameterContext)_localctx).type = type();
				setState(932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(929);
					match(WS);
					}
					}
					setState(934);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((ParameterContext)_localctx).val =  (((ParameterContext)_localctx).type!=null?_input.getText(((ParameterContext)_localctx).type.start,((ParameterContext)_localctx).type.stop):null) + " ";
				}
				}
				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(942);
			((ParameterContext)_localctx).name = name();
			 if(_localctx.val ==null) {
			    	                                                                  ((ParameterContext)_localctx).val =  (((ParameterContext)_localctx).name!=null?_input.getText(((ParameterContext)_localctx).name.start,((ParameterContext)_localctx).name.stop):null);
			    	                                                                  } else ((ParameterContext)_localctx).val =  _localctx.val + (((ParameterContext)_localctx).name!=null?_input.getText(((ParameterContext)_localctx).name.start,((ParameterContext)_localctx).name.stop):null);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TestParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TestParser.WS, i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_print);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			match(T__35);
			setState(949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(946);
				match(WS);
				}
				}
				setState(951);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(952);
			match(T__16);
			setState(956);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(953);
					match(WS);
					}
					} 
				}
				setState(958);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			}
			setState(959);
			((PrintContext)_localctx).expression = expression();
			setState(963);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(960);
				match(WS);
				}
				}
				setState(965);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(966);
			match(T__17);
			parser.print(handler.scope, ((PrintContext)_localctx).expression.val);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u03cc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\7\2\61\n\2\f\2"+
		"\16\2\64\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2=\n\2\f\2\16\2@\13\2\3\2"+
		"\7\2C\n\2\f\2\16\2F\13\2\3\2\3\2\3\2\3\2\3\3\7\3M\n\3\f\3\16\3P\13\3\3"+
		"\3\3\3\6\3T\n\3\r\3\16\3U\3\3\3\3\3\3\5\3[\n\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3f\n\3\3\3\3\3\3\3\3\3\5\3l\n\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3w\n\3\7\3y\n\3\f\3\16\3|\13\3\3\3\7\3\177\n\3\f\3\16\3"+
		"\u0082\13\3\3\3\3\3\7\3\u0086\n\3\f\3\16\3\u0089\13\3\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\7\6\u0093\n\6\f\6\16\6\u0096\13\6\3\6\3\6\7\6\u009a\n"+
		"\6\f\6\16\6\u009d\13\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a5\n\6\3\7\7\7\u00a8"+
		"\n\7\f\7\16\7\u00ab\13\7\3\7\3\7\7\7\u00af\n\7\f\7\16\7\u00b2\13\7\3\7"+
		"\3\7\3\7\7\7\u00b7\n\7\f\7\16\7\u00ba\13\7\3\7\7\7\u00bd\n\7\f\7\16\7"+
		"\u00c0\13\7\3\7\7\7\u00c3\n\7\f\7\16\7\u00c6\13\7\3\7\7\7\u00c9\n\7\f"+
		"\7\16\7\u00cc\13\7\3\b\7\b\u00cf\n\b\f\b\16\b\u00d2\13\b\3\b\3\b\7\b\u00d6"+
		"\n\b\f\b\16\b\u00d9\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\b\u00e7\n\b\3\b\7\b\u00ea\n\b\f\b\16\b\u00ed\13\b\3\b\3\b\7\b\u00f1"+
		"\n\b\f\b\16\b\u00f4\13\b\3\b\3\b\7\b\u00f8\n\b\f\b\16\b\u00fb\13\b\3\t"+
		"\3\t\3\t\3\t\5\t\u0101\n\t\3\n\3\n\7\n\u0105\n\n\f\n\16\n\u0108\13\n\3"+
		"\n\3\n\7\n\u010c\n\n\f\n\16\n\u010f\13\n\3\n\3\n\3\n\7\n\u0114\n\n\f\n"+
		"\16\n\u0117\13\n\3\n\3\n\7\n\u011b\n\n\f\n\16\n\u011e\13\n\3\n\3\n\3\n"+
		"\7\n\u0123\n\n\f\n\16\n\u0126\13\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u012e\n"+
		"\n\f\n\16\n\u0131\13\n\3\n\7\n\u0134\n\n\f\n\16\n\u0137\13\n\3\n\3\n\7"+
		"\n\u013b\n\n\f\n\16\n\u013e\13\n\3\n\3\n\3\n\7\n\u0143\n\n\f\n\16\n\u0146"+
		"\13\n\3\n\3\n\3\n\3\n\7\n\u014c\n\n\f\n\16\n\u014f\13\n\3\n\3\n\3\n\7"+
		"\n\u0154\n\n\f\n\16\n\u0157\13\n\3\n\7\n\u015a\n\n\f\n\16\n\u015d\13\n"+
		"\3\n\3\n\7\n\u0161\n\n\f\n\16\n\u0164\13\n\3\13\3\13\7\13\u0168\n\13\f"+
		"\13\16\13\u016b\13\13\3\13\3\13\7\13\u016f\n\13\f\13\16\13\u0172\13\13"+
		"\3\13\3\13\7\13\u0176\n\13\f\13\16\13\u0179\13\13\3\13\3\13\3\13\7\13"+
		"\u017e\n\13\f\13\16\13\u0181\13\13\3\13\7\13\u0184\n\13\f\13\16\13\u0187"+
		"\13\13\3\13\3\13\3\13\7\13\u018c\n\13\f\13\16\13\u018f\13\13\3\13\3\13"+
		"\3\13\3\13\7\13\u0195\n\13\f\13\16\13\u0198\13\13\3\13\3\13\3\13\7\13"+
		"\u019d\n\13\f\13\16\13\u01a0\13\13\3\13\7\13\u01a3\n\13\f\13\16\13\u01a6"+
		"\13\13\3\13\3\13\7\13\u01aa\n\13\f\13\16\13\u01ad\13\13\3\13\3\13\3\f"+
		"\3\f\7\f\u01b3\n\f\f\f\16\f\u01b6\13\f\3\f\3\f\3\f\7\f\u01bb\n\f\f\f\16"+
		"\f\u01be\13\f\3\f\3\f\7\f\u01c2\n\f\f\f\16\f\u01c5\13\f\3\f\3\f\7\f\u01c9"+
		"\n\f\f\f\16\f\u01cc\13\f\3\f\3\f\7\f\u01d0\n\f\f\f\16\f\u01d3\13\f\3\f"+
		"\3\f\7\f\u01d7\n\f\f\f\16\f\u01da\13\f\3\f\3\f\7\f\u01de\n\f\f\f\16\f"+
		"\u01e1\13\f\3\f\3\f\7\f\u01e5\n\f\f\f\16\f\u01e8\13\f\3\f\3\f\7\f\u01ec"+
		"\n\f\f\f\16\f\u01ef\13\f\3\f\3\f\3\f\3\f\7\f\u01f5\n\f\f\f\16\f\u01f8"+
		"\13\f\3\f\3\f\3\f\3\f\7\f\u01fe\n\f\f\f\16\f\u0201\13\f\3\f\3\f\7\f\u0205"+
		"\n\f\f\f\16\f\u0208\13\f\3\f\7\f\u020b\n\f\f\f\16\f\u020e\13\f\3\f\3\f"+
		"\7\f\u0212\n\f\f\f\16\f\u0215\13\f\3\f\3\f\3\r\3\r\7\r\u021b\n\r\f\r\16"+
		"\r\u021e\13\r\3\r\3\r\7\r\u0222\n\r\f\r\16\r\u0225\13\r\3\r\3\r\3\r\7"+
		"\r\u022a\n\r\f\r\16\r\u022d\13\r\3\r\7\r\u0230\n\r\f\r\16\r\u0233\13\r"+
		"\3\r\3\r\7\r\u0237\n\r\f\r\16\r\u023a\13\r\3\r\3\r\7\r\u023e\n\r\f\r\16"+
		"\r\u0241\13\r\3\r\3\r\3\r\7\r\u0246\n\r\f\r\16\r\u0249\13\r\3\r\7\r\u024c"+
		"\n\r\f\r\16\r\u024f\13\r\3\r\3\r\3\r\7\r\u0254\n\r\f\r\16\r\u0257\13\r"+
		"\3\r\3\r\3\r\3\r\7\r\u025d\n\r\f\r\16\r\u0260\13\r\3\r\3\r\7\r\u0264\n"+
		"\r\f\r\16\r\u0267\13\r\3\r\7\r\u026a\n\r\f\r\16\r\u026d\13\r\3\r\3\r\3"+
		"\r\6\r\u0272\n\r\r\r\16\r\u0273\3\r\7\r\u0277\n\r\f\r\16\r\u027a\13\r"+
		"\3\r\7\r\u027d\n\r\f\r\16\r\u0280\13\r\3\r\3\r\7\r\u0284\n\r\f\r\16\r"+
		"\u0287\13\r\3\r\3\r\3\r\7\r\u028c\n\r\f\r\16\r\u028f\13\r\3\r\7\r\u0292"+
		"\n\r\f\r\16\r\u0295\13\r\3\r\3\r\3\r\7\r\u029a\n\r\f\r\16\r\u029d\13\r"+
		"\3\r\3\r\3\r\3\r\7\r\u02a3\n\r\f\r\16\r\u02a6\13\r\3\r\3\r\7\r\u02aa\n"+
		"\r\f\r\16\r\u02ad\13\r\3\r\7\r\u02b0\n\r\f\r\16\r\u02b3\13\r\3\r\3\r\5"+
		"\r\u02b7\n\r\3\r\7\r\u02ba\n\r\f\r\16\r\u02bd\13\r\3\r\3\r\7\r\u02c1\n"+
		"\r\f\r\16\r\u02c4\13\r\3\r\3\r\3\16\3\16\6\16\u02ca\n\16\r\16\16\16\u02cb"+
		"\3\16\3\16\3\16\7\16\u02d1\n\16\f\16\16\16\u02d4\13\16\3\16\3\16\7\16"+
		"\u02d8\n\16\f\16\16\16\u02db\13\16\3\16\5\16\u02de\n\16\3\16\7\16\u02e1"+
		"\n\16\f\16\16\16\u02e4\13\16\3\16\3\16\3\16\7\16\u02e9\n\16\f\16\16\16"+
		"\u02ec\13\16\3\16\3\16\3\16\7\16\u02f1\n\16\f\16\16\16\u02f4\13\16\3\16"+
		"\3\16\3\16\7\16\u02f9\n\16\f\16\16\16\u02fc\13\16\3\16\7\16\u02ff\n\16"+
		"\f\16\16\16\u0302\13\16\3\16\3\16\3\16\3\16\7\16\u0308\n\16\f\16\16\16"+
		"\u030b\13\16\3\17\3\17\6\17\u030f\n\17\r\17\16\17\u0310\3\17\3\17\6\17"+
		"\u0315\n\17\r\17\16\17\u0316\3\17\3\17\3\17\7\17\u031c\n\17\f\17\16\17"+
		"\u031f\13\17\3\17\3\17\7\17\u0323\n\17\f\17\16\17\u0326\13\17\3\17\5\17"+
		"\u0329\n\17\3\17\7\17\u032c\n\17\f\17\16\17\u032f\13\17\3\17\3\17\3\17"+
		"\7\17\u0334\n\17\f\17\16\17\u0337\13\17\3\17\3\17\3\17\7\17\u033c\n\17"+
		"\f\17\16\17\u033f\13\17\3\17\3\17\3\17\7\17\u0344\n\17\f\17\16\17\u0347"+
		"\13\17\3\17\7\17\u034a\n\17\f\17\16\17\u034d\13\17\3\17\3\17\6\17\u0351"+
		"\n\17\r\17\16\17\u0352\3\17\3\17\7\17\u0357\n\17\f\17\16\17\u035a\13\17"+
		"\3\17\3\17\3\17\3\17\7\17\u0360\n\17\f\17\16\17\u0363\13\17\3\20\7\20"+
		"\u0366\n\20\f\20\16\20\u0369\13\20\3\20\3\20\7\20\u036d\n\20\f\20\16\20"+
		"\u0370\13\20\3\20\3\20\7\20\u0374\n\20\f\20\16\20\u0377\13\20\3\20\5\20"+
		"\u037a\n\20\3\20\7\20\u037d\n\20\f\20\16\20\u0380\13\20\3\20\3\20\7\20"+
		"\u0384\n\20\f\20\16\20\u0387\13\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21"+
		"\u038f\n\21\f\21\16\21\u0392\13\21\3\21\3\21\7\21\u0396\n\21\f\21\16\21"+
		"\u0399\13\21\3\21\3\21\3\21\7\21\u039e\n\21\f\21\16\21\u03a1\13\21\3\22"+
		"\3\22\7\22\u03a5\n\22\f\22\16\22\u03a8\13\22\3\22\3\22\7\22\u03ac\n\22"+
		"\f\22\16\22\u03af\13\22\3\22\3\22\3\22\3\23\3\23\7\23\u03b6\n\23\f\23"+
		"\16\23\u03b9\13\23\3\23\3\23\7\23\u03bd\n\23\f\23\16\23\u03c0\13\23\3"+
		"\23\3\23\7\23\u03c4\n\23\f\23\16\23\u03c7\13\23\3\23\3\23\3\23\3\23\2"+
		"\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\3\3\2\t\n\2\u046a\2"+
		"&\3\2\2\2\4N\3\2\2\2\6\u008c\3\2\2\2\b\u008e\3\2\2\2\n\u00a4\3\2\2\2\f"+
		"\u00a9\3\2\2\2\16\u00d0\3\2\2\2\20\u0100\3\2\2\2\22\u0102\3\2\2\2\24\u0165"+
		"\3\2\2\2\26\u01b0\3\2\2\2\30\u0218\3\2\2\2\32\u02c7\3\2\2\2\34\u030c\3"+
		"\2\2\2\36\u0367\3\2\2\2 \u038b\3\2\2\2\"\u03ad\3\2\2\2$\u03b3\3\2\2\2"+
		"&\'\7\3\2\2\'+\b\2\1\2(*\7+\2\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2"+
		"\2,.\3\2\2\2-+\3\2\2\2.\62\7\4\2\2/\61\7+\2\2\60/\3\2\2\2\61\64\3\2\2"+
		"\2\62\60\3\2\2\2\62\63\3\2\2\2\63>\3\2\2\2\64\62\3\2\2\2\65=\5\4\3\2\66"+
		"=\5\f\7\2\67=\5\20\t\28=\5\34\17\29=\5\32\16\2:=\5\36\20\2;=\5$\23\2<"+
		"\65\3\2\2\2<\66\3\2\2\2<\67\3\2\2\2<8\3\2\2\2<9\3\2\2\2<:\3\2\2\2<;\3"+
		"\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?D\3\2\2\2@>\3\2\2\2AC\7+\2\2BA\3"+
		"\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\7\5\2\2HI\b"+
		"\2\1\2IJ\b\2\1\2J\3\3\2\2\2KM\7+\2\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3"+
		"\2\2\2OQ\3\2\2\2PN\3\2\2\2QS\5\6\4\2RT\7+\2\2SR\3\2\2\2TU\3\2\2\2US\3"+
		"\2\2\2UV\3\2\2\2VW\3\2\2\2WX\5\b\5\2XZ\b\3\1\2Y[\7\6\2\2ZY\3\2\2\2Z[\3"+
		"\2\2\2[e\3\2\2\2\\]\5\n\6\2]^\b\3\1\2^f\3\2\2\2_`\5\f\7\2`a\b\3\1\2af"+
		"\3\2\2\2bc\5\36\20\2cd\b\3\1\2df\3\2\2\2e\\\3\2\2\2e_\3\2\2\2eb\3\2\2"+
		"\2ef\3\2\2\2fz\3\2\2\2gh\7\7\2\2hi\5\b\5\2ik\b\3\1\2jl\7\6\2\2kj\3\2\2"+
		"\2kl\3\2\2\2lv\3\2\2\2mn\5\n\6\2no\b\3\1\2ow\3\2\2\2pq\5\f\7\2qr\b\3\1"+
		"\2rw\3\2\2\2st\5\36\20\2tu\b\3\1\2uw\3\2\2\2vm\3\2\2\2vp\3\2\2\2vs\3\2"+
		"\2\2vw\3\2\2\2wy\3\2\2\2xg\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\u0080"+
		"\3\2\2\2|z\3\2\2\2}\177\7+\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2"+
		"\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083"+
		"\u0087\7\b\2\2\u0084\u0086\7+\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008b\b\3\1\2\u008b\5\3\2\2\2\u008c\u008d\t\2\2\2"+
		"\u008d\7\3\2\2\2\u008e\u008f\7(\2\2\u008f\t\3\2\2\2\u0090\u0094\7\13\2"+
		"\2\u0091\u0093\7+\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092"+
		"\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097"+
		"\u009b\7(\2\2\u0098\u009a\7+\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2"+
		"\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009e\u009f\7\13\2\2\u009f\u00a5\b\6\1\2\u00a0\u00a1\7)\2\2\u00a1"+
		"\u00a5\b\6\1\2\u00a2\u00a3\7(\2\2\u00a3\u00a5\b\6\1\2\u00a4\u0090\3\2"+
		"\2\2\u00a4\u00a0\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\13\3\2\2\2\u00a6\u00a8"+
		"\7+\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00b0\5\n"+
		"\6\2\u00ad\u00af\7+\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2"+
		"\2\2\u00b3\u00ca\b\7\1\2\u00b4\u00b8\7\'\2\2\u00b5\u00b7\7+\2\2\u00b6"+
		"\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00be\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bd\5\n\6\2\u00bc"+
		"\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c4\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c3\7+\2\2\u00c2"+
		"\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c9\b\7\1\2\u00c8"+
		"\u00b4\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\r\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00cf\7+\2\2\u00ce\u00cd"+
		"\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d7\5\n\6\2\u00d4\u00d6\7+"+
		"\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00f9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7\f"+
		"\2\2\u00db\u00e7\b\b\1\2\u00dc\u00dd\7\r\2\2\u00dd\u00e7\b\b\1\2\u00de"+
		"\u00df\7\16\2\2\u00df\u00e7\b\b\1\2\u00e0\u00e1\7\17\2\2\u00e1\u00e7\b"+
		"\b\1\2\u00e2\u00e3\7\20\2\2\u00e3\u00e7\b\b\1\2\u00e4\u00e5\7\21\2\2\u00e5"+
		"\u00e7\b\b\1\2\u00e6\u00da\3\2\2\2\u00e6\u00dc\3\2\2\2\u00e6\u00de\3\2"+
		"\2\2\u00e6\u00e0\3\2\2\2\u00e6\u00e2\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7"+
		"\u00eb\3\2\2\2\u00e8\u00ea\7+\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2"+
		"\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ee\u00f2\5\n\6\2\u00ef\u00f1\7+\2\2\u00f0\u00ef\3\2"+
		"\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\b\b\1\2\u00f6\u00f8\3\2"+
		"\2\2\u00f7\u00e6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\17\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u0101\5\22\n"+
		"\2\u00fd\u0101\5\24\13\2\u00fe\u0101\5\26\f\2\u00ff\u0101\5\30\r\2\u0100"+
		"\u00fc\3\2\2\2\u0100\u00fd\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2"+
		"\2\2\u0101\21\3\2\2\2\u0102\u0106\7\22\2\2\u0103\u0105\7+\2\2\u0104\u0103"+
		"\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010d\7\23\2\2\u010a\u010c\7"+
		"+\2\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\5\16"+
		"\b\2\u0111\u0115\b\n\1\2\u0112\u0114\7+\2\2\u0113\u0112\3\2\2\2\u0114"+
		"\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2"+
		"\2\2\u0117\u0115\3\2\2\2\u0118\u011c\7\24\2\2\u0119\u011b\7+\2\2\u011a"+
		"\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d\u012f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u012e\5\4\3\2\u0120"+
		"\u0124\5\f\7\2\u0121\u0123\7+\2\2\u0122\u0121\3\2\2\2\u0123\u0126\3\2"+
		"\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u012e\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0127\u012e\5\36\20\2\u0128\u012e\5\20\t\2\u0129\u012a"+
		"\5$\23\2\u012a\u012b\7\b\2\2\u012b\u012c\b\n\1\2\u012c\u012e\3\2\2\2\u012d"+
		"\u011f\3\2\2\2\u012d\u0120\3\2\2\2\u012d\u0127\3\2\2\2\u012d\u0128\3\2"+
		"\2\2\u012d\u0129\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u0135\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0134\7+"+
		"\2\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u0155\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013c\7\25"+
		"\2\2\u0139\u013b\7+\2\2\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u013c\3\2"+
		"\2\2\u013f\u0154\5\4\3\2\u0140\u0144\5\f\7\2\u0141\u0143\7+\2\2\u0142"+
		"\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2"+
		"\2\2\u0145\u0154\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0154\5\36\20\2\u0148"+
		"\u0154\5\20\t\2\u0149\u014d\5$\23\2\u014a\u014c\7+\2\2\u014b\u014a\3\2"+
		"\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u0150\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0151\7\b\2\2\u0151\u0152\b\n"+
		"\1\2\u0152\u0154\3\2\2\2\u0153\u0138\3\2\2\2\u0153\u0140\3\2\2\2\u0153"+
		"\u0147\3\2\2\2\u0153\u0148\3\2\2\2\u0153\u0149\3\2\2\2\u0154\u0157\3\2"+
		"\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u015b\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0158\u015a\7+\2\2\u0159\u0158\3\2\2\2\u015a\u015d\3\2"+
		"\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015e\u0162\7\26\2\2\u015f\u0161\7+\2\2\u0160\u015f\3\2"+
		"\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\23\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0169\7\27\2\2\u0166\u0168\7+\2"+
		"\2\u0167\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a"+
		"\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u0170\7\23\2\2"+
		"\u016d\u016f\7+\2\2\u016e\u016d\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e"+
		"\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173\3\2\2\2\u0172\u0170\3\2\2\2\u0173"+
		"\u0177\5\16\b\2\u0174\u0176\7+\2\2\u0175\u0174\3\2\2\2\u0176\u0179\3\2"+
		"\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179"+
		"\u0177\3\2\2\2\u017a\u017b\b\13\1\2\u017b\u017f\7\24\2\2\u017c\u017e\7"+
		"+\2\2\u017d\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u0180\u019e\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0184\7+"+
		"\2\2\u0183\u0182\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185"+
		"\u0186\3\2\2\2\u0186\u0188\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u019d\5\4"+
		"\3\2\u0189\u018d\5\f\7\2\u018a\u018c\7+\2\2\u018b\u018a\3\2\2\2\u018c"+
		"\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u019d\3\2"+
		"\2\2\u018f\u018d\3\2\2\2\u0190\u019d\5\36\20\2\u0191\u019d\5\20\t\2\u0192"+
		"\u0196\5$\23\2\u0193\u0195\7+\2\2\u0194\u0193\3\2\2\2\u0195\u0198\3\2"+
		"\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0199\3\2\2\2\u0198"+
		"\u0196\3\2\2\2\u0199\u019a\7\b\2\2\u019a\u019b\b\13\1\2\u019b\u019d\3"+
		"\2\2\2\u019c\u0185\3\2\2\2\u019c\u0189\3\2\2\2\u019c\u0190\3\2\2\2\u019c"+
		"\u0191\3\2\2\2\u019c\u0192\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2"+
		"\2\2\u019e\u019f\3\2\2\2\u019f\u01a4\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1"+
		"\u01a3\7+\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2"+
		"\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7"+
		"\u01ab\7\30\2\2\u01a8\u01aa\7+\2\2\u01a9\u01a8\3\2\2\2\u01aa\u01ad\3\2"+
		"\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad"+
		"\u01ab\3\2\2\2\u01ae\u01af\b\13\1\2\u01af\25\3\2\2\2\u01b0\u01b4\7\31"+
		"\2\2\u01b1\u01b3\7+\2\2\u01b2\u01b1\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4"+
		"\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01b4\3\2"+
		"\2\2\u01b7\u01b8\7\23\2\2\u01b8\u01bc\b\f\1\2\u01b9\u01bb\7+\2\2\u01ba"+
		"\u01b9\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2"+
		"\2\2\u01bd\u01bf\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c3\5\4\3\2\u01c0"+
		"\u01c2\7+\2\2\u01c1\u01c0\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2"+
		"\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6"+
		"\u01ca\7\b\2\2\u01c7\u01c9\7+\2\2\u01c8\u01c7\3\2\2\2\u01c9\u01cc\3\2"+
		"\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc"+
		"\u01ca\3\2\2\2\u01cd\u01d1\5\16\b\2\u01ce\u01d0\7+\2\2\u01cf\u01ce\3\2"+
		"\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2"+
		"\u01d4\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d8\7\b\2\2\u01d5\u01d7\7+"+
		"\2\2\u01d6\u01d5\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8"+
		"\u01d9\3\2\2\2\u01d9\u01db\3\2\2\2\u01da\u01d8\3\2\2\2\u01db\u01df\5\f"+
		"\7\2\u01dc\u01de\7+\2\2\u01dd\u01dc\3\2\2\2\u01de\u01e1\3\2\2\2\u01df"+
		"\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01df\3\2"+
		"\2\2\u01e2\u01e6\7\24\2\2\u01e3\u01e5\7+\2\2\u01e4\u01e3\3\2\2\2\u01e5"+
		"\u01e8\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\3\2"+
		"\2\2\u01e8\u01e6\3\2\2\2\u01e9\u0206\b\f\1\2\u01ea\u01ec\7+\2\2\u01eb"+
		"\u01ea\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2"+
		"\2\2\u01ee\u01f0\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0\u0205\5\4\3\2\u01f1"+
		"\u01f2\5\f\7\2\u01f2\u01f6\b\f\1\2\u01f3\u01f5\7+\2\2\u01f4\u01f3\3\2"+
		"\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7"+
		"\u0205\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f9\u0205\5\36\20\2\u01fa\u0205\5"+
		"\20\t\2\u01fb\u01ff\5$\23\2\u01fc\u01fe\7+\2\2\u01fd\u01fc\3\2\2\2\u01fe"+
		"\u0201\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0202\3\2"+
		"\2\2\u0201\u01ff\3\2\2\2\u0202\u0203\7\b\2\2\u0203\u0205\3\2\2\2\u0204"+
		"\u01ed\3\2\2\2\u0204\u01f1\3\2\2\2\u0204\u01f9\3\2\2\2\u0204\u01fa\3\2"+
		"\2\2\u0204\u01fb\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0206"+
		"\u0207\3\2\2\2\u0207\u020c\3\2\2\2\u0208\u0206\3\2\2\2\u0209\u020b\7+"+
		"\2\2\u020a\u0209\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c"+
		"\u020d\3\2\2\2\u020d\u020f\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0213\7\32"+
		"\2\2\u0210\u0212\7+\2\2\u0211\u0210\3\2\2\2\u0212\u0215\3\2\2\2\u0213"+
		"\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0216\3\2\2\2\u0215\u0213\3\2"+
		"\2\2\u0216\u0217\b\f\1\2\u0217\27\3\2\2\2\u0218\u021c\7\33\2\2\u0219\u021b"+
		"\7+\2\2\u021a\u0219\3\2\2\2\u021b\u021e\3\2\2\2\u021c\u021a\3\2\2\2\u021c"+
		"\u021d\3\2\2\2\u021d\u021f\3\2\2\2\u021e\u021c\3\2\2\2\u021f\u0223\5\f"+
		"\7\2\u0220\u0222\7+\2\2\u0221\u0220\3\2\2\2\u0222\u0225\3\2\2\2\u0223"+
		"\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0226\3\2\2\2\u0225\u0223\3\2"+
		"\2\2\u0226\u0227\b\r\1\2\u0227\u022b\7\34\2\2\u0228\u022a\7+\2\2\u0229"+
		"\u0228\3\2\2\2\u022a\u022d\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2"+
		"\2\2\u022c\u0271\3\2\2\2\u022d\u022b\3\2\2\2\u022e\u0230\7+\2\2\u022f"+
		"\u022e\3\2\2\2\u0230\u0233\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2"+
		"\2\2\u0232\u0234\3\2\2\2\u0233\u0231\3\2\2\2\u0234\u0238\7\35\2\2\u0235"+
		"\u0237\7+\2\2\u0236\u0235\3\2\2\2\u0237\u023a\3\2\2\2\u0238\u0236\3\2"+
		"\2\2\u0238\u0239\3\2\2\2\u0239\u023b\3\2\2\2\u023a\u0238\3\2\2\2\u023b"+
		"\u023f\5\n\6\2\u023c\u023e\7+\2\2\u023d\u023c\3\2\2\2\u023e\u0241\3\2"+
		"\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0242\3\2\2\2\u0241"+
		"\u023f\3\2\2\2\u0242\u0243\b\r\1\2\u0243\u0247\7\34\2\2\u0244\u0246\7"+
		"+\2\2\u0245\u0244\3\2\2\2\u0246\u0249\3\2\2\2\u0247\u0245\3\2\2\2\u0247"+
		"\u0248\3\2\2\2\u0248\u0265\3\2\2\2\u0249\u0247\3\2\2\2\u024a\u024c\7+"+
		"\2\2\u024b\u024a\3\2\2\2\u024c\u024f\3\2\2\2\u024d\u024b\3\2\2\2\u024d"+
		"\u024e\3\2\2\2\u024e\u0250\3\2\2\2\u024f\u024d\3\2\2\2\u0250\u0264\5\4"+
		"\3\2\u0251\u0255\5\f\7\2\u0252\u0254\7+\2\2\u0253\u0252\3\2\2\2\u0254"+
		"\u0257\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0264\3\2"+
		"\2\2\u0257\u0255\3\2\2\2\u0258\u0264\5\36\20\2\u0259\u0264\5\20\t\2\u025a"+
		"\u025e\5$\23\2\u025b\u025d\7+\2\2\u025c\u025b\3\2\2\2\u025d\u0260\3\2"+
		"\2\2\u025e\u025c\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0261\3\2\2\2\u0260"+
		"\u025e\3\2\2\2\u0261\u0262\7\b\2\2\u0262\u0264\3\2\2\2\u0263\u024d\3\2"+
		"\2\2\u0263\u0251\3\2\2\2\u0263\u0258\3\2\2\2\u0263\u0259\3\2\2\2\u0263"+
		"\u025a\3\2\2\2\u0264\u0267\3\2\2\2\u0265\u0263\3\2\2\2\u0265\u0266\3\2"+
		"\2\2\u0266\u026b\3\2\2\2\u0267\u0265\3\2\2\2\u0268\u026a\7+\2\2\u0269"+
		"\u0268\3\2\2\2\u026a\u026d\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2"+
		"\2\2\u026c\u026e\3\2\2\2\u026d\u026b\3\2\2\2\u026e\u026f\7\36\2\2\u026f"+
		"\u0270\b\r\1\2\u0270\u0272\3\2\2\2\u0271\u0231\3\2\2\2\u0272\u0273\3\2"+
		"\2\2\u0273\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0278\3\2\2\2\u0275"+
		"\u0277\7+\2\2\u0276\u0275\3\2\2\2\u0277\u027a\3\2\2\2\u0278\u0276\3\2"+
		"\2\2\u0278\u0279\3\2\2\2\u0279\u02b6\3\2\2\2\u027a\u0278\3\2\2\2\u027b"+
		"\u027d\7+\2\2\u027c\u027b\3\2\2\2\u027d\u0280\3\2\2\2\u027e\u027c\3\2"+
		"\2\2\u027e\u027f\3\2\2\2\u027f\u0281\3\2\2\2\u0280\u027e\3\2\2\2\u0281"+
		"\u0285\7\37\2\2\u0282\u0284\7+\2\2\u0283\u0282\3\2\2\2\u0284\u0287\3\2"+
		"\2\2\u0285\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0288\3\2\2\2\u0287"+
		"\u0285\3\2\2\2\u0288\u0289\b\r\1\2\u0289\u028d\7\34\2\2\u028a\u028c\7"+
		"+\2\2\u028b\u028a\3\2\2\2\u028c\u028f\3\2\2\2\u028d\u028b\3\2\2\2\u028d"+
		"\u028e\3\2\2\2\u028e\u02ab\3\2\2\2\u028f\u028d\3\2\2\2\u0290\u0292\7+"+
		"\2\2\u0291\u0290\3\2\2\2\u0292\u0295\3\2\2\2\u0293\u0291\3\2\2\2\u0293"+
		"\u0294\3\2\2\2\u0294\u0296\3\2\2\2\u0295\u0293\3\2\2\2\u0296\u02aa\5\4"+
		"\3\2\u0297\u029b\5\f\7\2\u0298\u029a\7+\2\2\u0299\u0298\3\2\2\2\u029a"+
		"\u029d\3\2\2\2\u029b\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u02aa\3\2"+
		"\2\2\u029d\u029b\3\2\2\2\u029e\u02aa\5\36\20\2\u029f\u02aa\5\20\t\2\u02a0"+
		"\u02a4\5$\23\2\u02a1\u02a3\7+\2\2\u02a2\u02a1\3\2\2\2\u02a3\u02a6\3\2"+
		"\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a7\3\2\2\2\u02a6"+
		"\u02a4\3\2\2\2\u02a7\u02a8\7\b\2\2\u02a8\u02aa\3\2\2\2\u02a9\u0293\3\2"+
		"\2\2\u02a9\u0297\3\2\2\2\u02a9\u029e\3\2\2\2\u02a9\u029f\3\2\2\2\u02a9"+
		"\u02a0\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab\u02ac\3\2"+
		"\2\2\u02ac\u02b1\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae\u02b0\7+\2\2\u02af"+
		"\u02ae\3\2\2\2\u02b0\u02b3\3\2\2\2\u02b1\u02af\3\2\2\2\u02b1\u02b2\3\2"+
		"\2\2\u02b2\u02b4\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b4\u02b5\7\36\2\2\u02b5"+
		"\u02b7\b\r\1\2\u02b6\u027e\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02bb\3\2"+
		"\2\2\u02b8\u02ba\7+\2\2\u02b9\u02b8\3\2\2\2\u02ba\u02bd\3\2\2\2\u02bb"+
		"\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02be\3\2\2\2\u02bd\u02bb\3\2"+
		"\2\2\u02be\u02c2\7 \2\2\u02bf\u02c1\7+\2\2\u02c0\u02bf\3\2\2\2\u02c1\u02c4"+
		"\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c5\3\2\2\2\u02c4"+
		"\u02c2\3\2\2\2\u02c5\u02c6\b\r\1\2\u02c6\31\3\2\2\2\u02c7\u02c9\7!\2\2"+
		"\u02c8\u02ca\7+\2\2\u02c9\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02c9"+
		"\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02ce\5\b\5\2\u02ce"+
		"\u02d2\b\16\1\2\u02cf\u02d1\7+\2\2\u02d0\u02cf\3\2\2\2\u02d1\u02d4\3\2"+
		"\2\2\u02d2\u02d0\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d5\3\2\2\2\u02d4"+
		"\u02d2\3\2\2\2\u02d5\u02d9\7\23\2\2\u02d6\u02d8\7+\2\2\u02d7\u02d6\3\2"+
		"\2\2\u02d8\u02db\3\2\2\2\u02d9\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da"+
		"\u02dd\3\2\2\2\u02db\u02d9\3\2\2\2\u02dc\u02de\5 \21\2\u02dd\u02dc\3\2"+
		"\2\2\u02dd\u02de\3\2\2\2\u02de\u02e2\3\2\2\2\u02df\u02e1\7+\2\2\u02e0"+
		"\u02df\3\2\2\2\u02e1\u02e4\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2"+
		"\2\2\u02e3\u02e5\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e5\u02e6\7\24\2\2\u02e6"+
		"\u02ea\b\16\1\2\u02e7\u02e9\7+\2\2\u02e8\u02e7\3\2\2\2\u02e9\u02ec\3\2"+
		"\2\2\u02ea\u02e8\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02fa\3\2\2\2\u02ec"+
		"\u02ea\3\2\2\2\u02ed\u02f9\5\4\3\2\u02ee\u02f2\5\f\7\2\u02ef\u02f1\7+"+
		"\2\2\u02f0\u02ef\3\2\2\2\u02f1\u02f4\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f2"+
		"\u02f3\3\2\2\2\u02f3\u02f9\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f5\u02f9\5\36"+
		"\20\2\u02f6\u02f9\5\20\t\2\u02f7\u02f9\5$\23\2\u02f8\u02ed\3\2\2\2\u02f8"+
		"\u02ee\3\2\2\2\u02f8\u02f5\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f8\u02f7\3\2"+
		"\2\2\u02f9\u02fc\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb"+
		"\u0300\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fd\u02ff\7+\2\2\u02fe\u02fd\3\2"+
		"\2\2\u02ff\u0302\3\2\2\2\u0300\u02fe\3\2\2\2\u0300\u0301\3\2\2\2\u0301"+
		"\u0303\3\2\2\2\u0302\u0300\3\2\2\2\u0303\u0304\7\"\2\2\u0304\u0305\b\16"+
		"\1\2\u0305\u0309\b\16\1\2\u0306\u0308\7+\2\2\u0307\u0306\3\2\2\2\u0308"+
		"\u030b\3\2\2\2\u0309\u0307\3\2\2\2\u0309\u030a\3\2\2\2\u030a\33\3\2\2"+
		"\2\u030b\u0309\3\2\2\2\u030c\u030e\7#\2\2\u030d\u030f\7+\2\2\u030e\u030d"+
		"\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u030e\3\2\2\2\u0310\u0311\3\2\2\2\u0311"+
		"\u0312\3\2\2\2\u0312\u0314\5\6\4\2\u0313\u0315\7+\2\2\u0314\u0313\3\2"+
		"\2\2\u0315\u0316\3\2\2\2\u0316\u0314\3\2\2\2\u0316\u0317\3\2\2\2\u0317"+
		"\u0318\3\2\2\2\u0318\u0319\5\b\5\2\u0319\u031d\b\17\1\2\u031a\u031c\7"+
		"+\2\2\u031b\u031a\3\2\2\2\u031c\u031f\3\2\2\2\u031d\u031b\3\2\2\2\u031d"+
		"\u031e\3\2\2\2\u031e\u0320\3\2\2\2\u031f\u031d\3\2\2\2\u0320\u0324\7\23"+
		"\2\2\u0321\u0323\7+\2\2\u0322\u0321\3\2\2\2\u0323\u0326\3\2\2\2\u0324"+
		"\u0322\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0328\3\2\2\2\u0326\u0324\3\2"+
		"\2\2\u0327\u0329\5 \21\2\u0328\u0327\3\2\2\2\u0328\u0329\3\2\2\2\u0329"+
		"\u032d\3\2\2\2\u032a\u032c\7+\2\2\u032b\u032a\3\2\2\2\u032c\u032f\3\2"+
		"\2\2\u032d\u032b\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u0330\3\2\2\2\u032f"+
		"\u032d\3\2\2\2\u0330\u0331\7\24\2\2\u0331\u0335\b\17\1\2\u0332\u0334\7"+
		"+\2\2\u0333\u0332\3\2\2\2\u0334\u0337\3\2\2\2\u0335\u0333\3\2\2\2\u0335"+
		"\u0336\3\2\2\2\u0336\u0345\3\2\2\2\u0337\u0335\3\2\2\2\u0338\u0344\5\4"+
		"\3\2\u0339\u033d\5\f\7\2\u033a\u033c\7+\2\2\u033b\u033a\3\2\2\2\u033c"+
		"\u033f\3\2\2\2\u033d\u033b\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u0344\3\2"+
		"\2\2\u033f\u033d\3\2\2\2\u0340\u0344\5\36\20\2\u0341\u0344\5\20\t\2\u0342"+
		"\u0344\5$\23\2\u0343\u0338\3\2\2\2\u0343\u0339\3\2\2\2\u0343\u0340\3\2"+
		"\2\2\u0343\u0341\3\2\2\2\u0343\u0342\3\2\2\2\u0344\u0347\3\2\2\2\u0345"+
		"\u0343\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u034b\3\2\2\2\u0347\u0345\3\2"+
		"\2\2\u0348\u034a\7+\2\2\u0349\u0348\3\2\2\2\u034a\u034d\3\2\2\2\u034b"+
		"\u0349\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u034e\3\2\2\2\u034d\u034b\3\2"+
		"\2\2\u034e\u0350\7$\2\2\u034f\u0351\7+\2\2\u0350\u034f\3\2\2\2\u0351\u0352"+
		"\3\2\2\2\u0352\u0350\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0354\3\2\2\2\u0354"+
		"\u0358\5\f\7\2\u0355\u0357\7+\2\2\u0356\u0355\3\2\2\2\u0357\u035a\3\2"+
		"\2\2\u0358\u0356\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u035b\3\2\2\2\u035a"+
		"\u0358\3\2\2\2\u035b\u035c\7\b\2\2\u035c\u035d\b\17\1\2\u035d\u0361\b"+
		"\17\1\2\u035e\u0360\7+\2\2\u035f\u035e\3\2\2\2\u0360\u0363\3\2\2\2\u0361"+
		"\u035f\3\2\2\2\u0361\u0362\3\2\2\2\u0362\35\3\2\2\2\u0363\u0361\3\2\2"+
		"\2\u0364\u0366\7+\2\2\u0365\u0364\3\2\2\2\u0366\u0369\3\2\2\2\u0367\u0365"+
		"\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u036a\3\2\2\2\u0369\u0367\3\2\2\2\u036a"+
		"\u036e\5\b\5\2\u036b\u036d\7+\2\2\u036c\u036b\3\2\2\2\u036d\u0370\3\2"+
		"\2\2\u036e\u036c\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0371\3\2\2\2\u0370"+
		"\u036e\3\2\2\2\u0371\u0375\7\23\2\2\u0372\u0374\7+\2\2\u0373\u0372\3\2"+
		"\2\2\u0374\u0377\3\2\2\2\u0375\u0373\3\2\2\2\u0375\u0376\3\2\2\2\u0376"+
		"\u0379\3\2\2\2\u0377\u0375\3\2\2\2\u0378\u037a\5 \21\2\u0379\u0378\3\2"+
		"\2\2\u0379\u037a\3\2\2\2\u037a\u037e\3\2\2\2\u037b\u037d\7+\2\2\u037c"+
		"\u037b\3\2\2\2\u037d\u0380\3\2\2\2\u037e\u037c\3\2\2\2\u037e\u037f\3\2"+
		"\2\2\u037f\u0381\3\2\2\2\u0380\u037e\3\2\2\2\u0381\u0385\7\24\2\2\u0382"+
		"\u0384\7+\2\2\u0383\u0382\3\2\2\2\u0384\u0387\3\2\2\2\u0385\u0383\3\2"+
		"\2\2\u0385\u0386\3\2\2\2\u0386\u0388\3\2\2\2\u0387\u0385\3\2\2\2\u0388"+
		"\u0389\7\b\2\2\u0389\u038a\b\20\1\2\u038a\37\3\2\2\2\u038b\u038c\5\"\22"+
		"\2\u038c\u0390\b\21\1\2\u038d\u038f\7+\2\2\u038e\u038d\3\2\2\2\u038f\u0392"+
		"\3\2\2\2\u0390\u038e\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u0393\3\2\2\2\u0392"+
		"\u0390\3\2\2\2\u0393\u0397\7%\2\2\u0394\u0396\7+\2\2\u0395\u0394\3\2\2"+
		"\2\u0396\u0399\3\2\2\2\u0397\u0395\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u039a"+
		"\3\2\2\2\u0399\u0397\3\2\2\2\u039a\u039b\5\"\22\2\u039b\u039f\b\21\1\2"+
		"\u039c\u039e\7+\2\2\u039d\u039c\3\2\2\2\u039e\u03a1\3\2\2\2\u039f\u039d"+
		"\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0!\3\2\2\2\u03a1\u039f\3\2\2\2\u03a2"+
		"\u03a6\5\6\4\2\u03a3\u03a5\7+\2\2\u03a4\u03a3\3\2\2\2\u03a5\u03a8\3\2"+
		"\2\2\u03a6\u03a4\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a9\3\2\2\2\u03a8"+
		"\u03a6\3\2\2\2\u03a9\u03aa\b\22\1\2\u03aa\u03ac\3\2\2\2\u03ab\u03a2\3"+
		"\2\2\2\u03ac\u03af\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae"+
		"\u03b0\3\2\2\2\u03af\u03ad\3\2\2\2\u03b0\u03b1\5\b\5\2\u03b1\u03b2\b\22"+
		"\1\2\u03b2#\3\2\2\2\u03b3\u03b7\7&\2\2\u03b4\u03b6\7+\2\2\u03b5\u03b4"+
		"\3\2\2\2\u03b6\u03b9\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8"+
		"\u03ba\3\2\2\2\u03b9\u03b7\3\2\2\2\u03ba\u03be\7\23\2\2\u03bb\u03bd\7"+
		"+\2\2\u03bc\u03bb\3\2\2\2\u03bd\u03c0\3\2\2\2\u03be\u03bc\3\2\2\2\u03be"+
		"\u03bf\3\2\2\2\u03bf\u03c1\3\2\2\2\u03c0\u03be\3\2\2\2\u03c1\u03c5\5\f"+
		"\7\2\u03c2\u03c4\7+\2\2\u03c3\u03c2\3\2\2\2\u03c4\u03c7\3\2\2\2\u03c5"+
		"\u03c3\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03c8\3\2\2\2\u03c7\u03c5\3\2"+
		"\2\2\u03c8\u03c9\7\24\2\2\u03c9\u03ca\b\23\1\2\u03ca%\3\2\2\2\u008b+\62"+
		"<>DNUZekvz\u0080\u0087\u0094\u009b\u00a4\u00a9\u00b0\u00b8\u00be\u00c4"+
		"\u00ca\u00d0\u00d7\u00e6\u00eb\u00f2\u00f9\u0100\u0106\u010d\u0115\u011c"+
		"\u0124\u012d\u012f\u0135\u013c\u0144\u014d\u0153\u0155\u015b\u0162\u0169"+
		"\u0170\u0177\u017f\u0185\u018d\u0196\u019c\u019e\u01a4\u01ab\u01b4\u01bc"+
		"\u01c3\u01ca\u01d1\u01d8\u01df\u01e6\u01ed\u01f6\u01ff\u0204\u0206\u020c"+
		"\u0213\u021c\u0223\u022b\u0231\u0238\u023f\u0247\u024d\u0255\u025e\u0263"+
		"\u0265\u026b\u0273\u0278\u027e\u0285\u028d\u0293\u029b\u02a4\u02a9\u02ab"+
		"\u02b1\u02b6\u02bb\u02c2\u02cb\u02d2\u02d9\u02dd\u02e2\u02ea\u02f2\u02f8"+
		"\u02fa\u0300\u0309\u0310\u0316\u031d\u0324\u0328\u032d\u0335\u033d\u0343"+
		"\u0345\u034b\u0352\u0358\u0361\u0367\u036e\u0375\u0379\u037e\u0385\u0390"+
		"\u0397\u039f\u03a6\u03ad\u03b7\u03be\u03c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}