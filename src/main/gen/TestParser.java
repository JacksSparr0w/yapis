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

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TestParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, MATH_SYMB=31, 
		STRING=32, INT=33, WORD=34, WS=35, SYMB=36;
	public static final int
		RULE_program = 0, RULE_variable = 1, RULE_type = 2, RULE_name = 3, RULE_value = 4, 
		RULE_expression = 5, RULE_relation = 6, RULE_statement = 7, RULE_ifstatement = 8, 
		RULE_whilestatement = 9, RULE_forstatement = 10, RULE_procedure = 11, 
		RULE_function = 12, RULE_function_call = 13, RULE_parameters = 14, RULE_parameter = 15, 
		RULE_print = 16;
	public static final String[] ruleNames = {
		"program", "variable", "type", "name", "value", "expression", "relation", 
		"statement", "ifstatement", "whilestatement", "forstatement", "procedure", 
		"function", "function_call", "parameters", "parameter", "print"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'program'", "'start'", "'finish'", "' = '", "', '", "';'", "'int'", 
		"'String'", "'\"'", "'=='", "'!='", "'<'", "'<='", "'>='", "'>'", "'if'", 
		"'('", "')'", "'else'", "'endif'", "'while'", "'endwhile'", "'for'", "'endfor'", 
		"'procedure'", "'end'", "'function'", "'return'", "','", "'print'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "MATH_SYMB", "STRING", "INT", 
		"WORD", "WS", "SYMB"
	};
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
	@NotNull
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
			setState(34); 
			match(T__0);
			parser.prepareFiles();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(36); 
				match(WS);
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42); 
			match(T__1);
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(43); 
					match(WS);
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(56);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(49); 
						variable();
						}
						break;
					case 2:
						{
						setState(50); 
						expression();
						}
						break;
					case 3:
						{
						setState(51); 
						statement();
						}
						break;
					case 4:
						{
						setState(52); 
						function();
						}
						break;
					case 5:
						{
						setState(53); 
						procedure();
						}
						break;
					case 6:
						{
						setState(54); 
						function_call();
						}
						break;
					case 7:
						{
						setState(55); 
						print();
						}
						break;
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(61); 
				match(WS);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67); 
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
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(71); 
				match(WS);
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77); 
			((VariableContext)_localctx).type = type();
			setState(79); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(78); 
				match(WS);
				}
				}
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(83); 
			((VariableContext)_localctx).name = name();
			handler.addVar(new Variable((((VariableContext)_localctx).name!=null?_input.getText(((VariableContext)_localctx).name.start,((VariableContext)_localctx).name.stop):null), (((VariableContext)_localctx).type!=null?_input.getText(((VariableContext)_localctx).type.start,((VariableContext)_localctx).type.stop):null), handler.scope));
			setState(86);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(85); 
				match(T__3);
				}
			}

			setState(97);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(88); 
				((VariableContext)_localctx).value = value();
				handler.getVarByName((((VariableContext)_localctx).name!=null?_input.getText(((VariableContext)_localctx).name.start,((VariableContext)_localctx).name.stop):null)).setValue(((VariableContext)_localctx).value.val);
				}
				break;
			case 2:
				{
				setState(91); 
				((VariableContext)_localctx).expression = expression();
				handler.getVarByName((((VariableContext)_localctx).name!=null?_input.getText(((VariableContext)_localctx).name.start,((VariableContext)_localctx).name.stop):null)).setValue(((VariableContext)_localctx).expression.val);
				}
				break;
			case 3:
				{
				setState(94); 
				((VariableContext)_localctx).function_call = function_call();
				handler.getVarByName((((VariableContext)_localctx).name!=null?_input.getText(((VariableContext)_localctx).name.start,((VariableContext)_localctx).name.stop):null)).setValue(((VariableContext)_localctx).function_call.val);
				}
				break;
			}
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(99); 
				match(T__4);
				setState(100); 
				((VariableContext)_localctx).name = name();
				handler.addVar(new Variable((((VariableContext)_localctx).name!=null?_input.getText(((VariableContext)_localctx).name.start,((VariableContext)_localctx).name.stop):null), (((VariableContext)_localctx).type!=null?_input.getText(((VariableContext)_localctx).type.start,((VariableContext)_localctx).type.stop):null), handler.scope));
				setState(103);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(102); 
					match(T__3);
					}
				}

				setState(114);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(105); 
					((VariableContext)_localctx).value = value();
					handler.getVarByName((((VariableContext)_localctx).name!=null?_input.getText(((VariableContext)_localctx).name.start,((VariableContext)_localctx).name.stop):null)).setValue(((VariableContext)_localctx).value.val);
					}
					break;
				case 2:
					{
					setState(108); 
					((VariableContext)_localctx).expression = expression();
					handler.getVarByName((((VariableContext)_localctx).name!=null?_input.getText(((VariableContext)_localctx).name.start,((VariableContext)_localctx).name.stop):null)).setValue(((VariableContext)_localctx).expression.val);
					}
					break;
				case 3:
					{
					setState(111); 
					((VariableContext)_localctx).function_call = function_call();
					handler.getVarByName((((VariableContext)_localctx).name!=null?_input.getText(((VariableContext)_localctx).name.start,((VariableContext)_localctx).name.stop):null)).setValue(((VariableContext)_localctx).function_call.val);
					}
					break;
				}
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(121); 
				match(WS);
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127); 
			match(T__5);
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(128); 
					match(WS);
					}
					} 
				}
				setState(133);
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
			setState(136);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
			setState(138); 
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
			setState(160);
			switch (_input.LA(1)) {
			case T__8:
				{
				setState(140); 
				match(T__8);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(141); 
					match(WS);
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(147); 
				((ValueContext)_localctx).STRING = match(STRING);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(148); 
					match(WS);
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(154); 
				match(T__8);
				((ValueContext)_localctx).val =  "\"" + (((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null) + "\""; ((ValueContext)_localctx).typeOfVal =  "String";
				}
				break;
			case INT:
				{
				setState(156); 
				((ValueContext)_localctx).INT = match(INT);
				((ValueContext)_localctx).val =  (((ValueContext)_localctx).INT!=null?((ValueContext)_localctx).INT.getText():null); ((ValueContext)_localctx).typeOfVal =  "Int";
				}
				break;
			case STRING:
				{
				setState(158); 
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
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(162); 
				match(WS);
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168); 
			((ExpressionContext)_localctx).s1 = value();
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(169); 
					match(WS);
					}
					} 
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			((ExpressionContext)_localctx).val =  (((ExpressionContext)_localctx).s1!=null?_input.getText(((ExpressionContext)_localctx).s1.start,((ExpressionContext)_localctx).s1.stop):null);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MATH_SYMB) {
				{
				{
				setState(176); 
				((ExpressionContext)_localctx).MATH_SYMB = match(MATH_SYMB);
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(177); 
						match(WS);
						}
						} 
					}
					setState(182);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(183); 
						((ExpressionContext)_localctx).s2 = value();
						}
						} 
					}
					setState(188);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(189); 
						match(WS);
						}
						} 
					}
					setState(194);
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
				setState(200);
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
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(201); 
				match(WS);
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207); 
			((RelationContext)_localctx).v1 = value();
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(208); 
					match(WS);
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) {
				{
				{
				setState(226);
				switch (_input.LA(1)) {
				case T__9:
					{
					setState(214); 
					match(T__9);
					((RelationContext)_localctx).sign = "==";
					}
					break;
				case T__10:
					{
					setState(216); 
					match(T__10);
					((RelationContext)_localctx).sign = "!=";
					}
					break;
				case T__11:
					{
					setState(218); 
					match(T__11);
					((RelationContext)_localctx).sign = "<";
					}
					break;
				case T__12:
					{
					setState(220); 
					match(T__12);
					((RelationContext)_localctx).sign = "<=";
					}
					break;
				case T__13:
					{
					setState(222); 
					match(T__13);
					((RelationContext)_localctx).sign = ">=";
					}
					break;
				case T__14:
					{
					setState(224); 
					match(T__14);
					((RelationContext)_localctx).sign = ">";
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(228); 
					match(WS);
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(234); 
				((RelationContext)_localctx).v2 = value();
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(235); 
						match(WS);
						}
						} 
					}
					setState(240);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				((RelationContext)_localctx).strValF =  ((RelationContext)_localctx).v1.val; ((RelationContext)_localctx).strValS =  ((RelationContext)_localctx).v2.val;
				}
				}
				setState(247);
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
			setState(251);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(248); 
				ifstatement();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(249); 
				whilestatement();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(250); 
				forstatement();
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
			setState(253); 
			match(T__15);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(254); 
				match(WS);
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260); 
			match(T__16);
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(261); 
					match(WS);
					}
					} 
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(267); 
			((IfstatementContext)_localctx).relation = relation();
			parser.makeRelationHeader(((IfstatementContext)_localctx).relation.strValF, ((IfstatementContext)_localctx).relation.strValS, "if", handler.scope);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(269); 
				match(WS);
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(275); 
			match(T__17);
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(276); 
					match(WS);
					}
					} 
				}
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(296);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						setState(282); 
						variable();
						}
						break;
					case 2:
						{
						setState(283); 
						((IfstatementContext)_localctx).expression = expression();
						setState(287);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(284); 
								match(WS);
								}
								} 
							}
							setState(289);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
						}
						}
						break;
					case 3:
						{
						setState(290); 
						function_call();
						}
						break;
					case 4:
						{
						setState(291); 
						statement();
						}
						break;
					case 5:
						{
						setState(292); 
						print();
						setState(293); 
						match(T__5);
						parser.makeRelationBody(((IfstatementContext)_localctx).expression.val, handler.scope);
						}
						break;
					}
					} 
				}
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(301); 
					match(WS);
					}
					} 
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(334);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						setState(307); 
						match(T__18);
						setState(311);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(308); 
								match(WS);
								}
								} 
							}
							setState(313);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
						}
						setState(314); 
						variable();
						}
						break;
					case 2:
						{
						setState(315); 
						((IfstatementContext)_localctx).expression = expression();
						setState(319);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(316); 
								match(WS);
								}
								} 
							}
							setState(321);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
						}
						}
						break;
					case 3:
						{
						setState(322); 
						function_call();
						}
						break;
					case 4:
						{
						setState(323); 
						statement();
						}
						break;
					case 5:
						{
						setState(324); 
						print();
						setState(328);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(325); 
							match(WS);
							}
							}
							setState(330);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(331); 
						match(T__5);
						parser.makeRelationBody(" } else {" + ((IfstatementContext)_localctx).expression.val + " }", handler.scope);
						}
						break;
					}
					} 
				}
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(339); 
				match(WS);
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(345); 
			match(T__19);
			setState(349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(346); 
					match(WS);
					}
					} 
				}
				setState(351);
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
			setState(352); 
			match(T__20);
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(353); 
				match(WS);
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(359); 
			match(T__16);
			setState(363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(360); 
					match(WS);
					}
					} 
				}
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(366); 
			((WhilestatementContext)_localctx).relation = relation();
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(367); 
				match(WS);
				}
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			parser.makeRelationHeader(((WhilestatementContext)_localctx).relation.strValF, ((WhilestatementContext)_localctx).relation.strValS, "while", handler.scope);
			setState(374); 
			match(T__17);
			setState(378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(375); 
					match(WS);
					}
					} 
				}
				setState(380);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			setState(409);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(407);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						setState(384);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(381); 
								match(WS);
								}
								} 
							}
							setState(386);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
						}
						setState(387); 
						variable();
						}
						break;
					case 2:
						{
						setState(388); 
						((WhilestatementContext)_localctx).expression = expression();
						setState(392);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(389); 
								match(WS);
								}
								} 
							}
							setState(394);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
						}
						}
						break;
					case 3:
						{
						setState(395); 
						function_call();
						}
						break;
					case 4:
						{
						setState(396); 
						statement();
						}
						break;
					case 5:
						{
						setState(397); 
						print();
						setState(401);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(398); 
							match(WS);
							}
							}
							setState(403);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(404); 
						match(T__5);
						parser.makeRelationBody(((WhilestatementContext)_localctx).expression.val, handler.scope);
						}
						break;
					}
					} 
				}
				setState(411);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(412); 
				match(WS);
				}
				}
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(418); 
			match(T__21);
			setState(422);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(419); 
					match(WS);
					}
					} 
				}
				setState(424);
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
			setState(427); 
			match(T__22);
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(428); 
				match(WS);
				}
				}
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(434); 
			match(T__16);
			parser.makeLoopHeader(handler.scope);
			setState(439);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(436); 
					match(WS);
					}
					} 
				}
				setState(441);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(442); 
			variable();
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(443); 
				match(WS);
				}
				}
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(449); 
			match(T__5);
			setState(453);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(450); 
					match(WS);
					}
					} 
				}
				setState(455);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			setState(456); 
			((ForstatementContext)_localctx).relation = relation();
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(457); 
				match(WS);
				}
				}
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(463); 
			match(T__5);
			setState(467);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(464); 
					match(WS);
					}
					} 
				}
				setState(469);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			setState(470); 
			((ForstatementContext)_localctx).expression = expression();
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(471); 
				match(WS);
				}
				}
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(477); 
			match(T__17);
			setState(481);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(478); 
					match(WS);
					}
					} 
				}
				setState(483);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			parser.makeLoopHeaderParams(((ForstatementContext)_localctx).relation.strValF, ((ForstatementContext)_localctx).relation.sign, ((ForstatementContext)_localctx).relation.strValS, ((ForstatementContext)_localctx).expression.val, handler.scope);
			setState(513);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(511);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						setState(488);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(485); 
								match(WS);
								}
								} 
							}
							setState(490);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
						}
						setState(491); 
						variable();
						}
						break;
					case 2:
						{
						setState(492); 
						((ForstatementContext)_localctx).expression = expression();
						parser.makeRelationBody(((ForstatementContext)_localctx).expression.val, handler.scope);
						setState(497);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(494); 
								match(WS);
								}
								} 
							}
							setState(499);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
						}
						}
						break;
					case 3:
						{
						setState(500); 
						function_call();
						}
						break;
					case 4:
						{
						setState(501); 
						statement();
						}
						break;
					case 5:
						{
						setState(502); 
						print();
						setState(506);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(503); 
							match(WS);
							}
							}
							setState(508);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(509); 
						match(T__5);
						}
						break;
					}
					} 
				}
				setState(515);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(516); 
				match(WS);
				}
				}
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(522); 
			match(T__23);
			setState(526);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(523); 
					match(WS);
					}
					} 
				}
				setState(528);
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
		enterRule(_localctx, 22, RULE_procedure);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(531); 
			match(T__24);
			setState(533); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(532); 
				match(WS);
				}
				}
				setState(535); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(537); 
			((ProcedureContext)_localctx).name = name();
			handler.scope = (((ProcedureContext)_localctx).name!=null?_input.getText(((ProcedureContext)_localctx).name.start,((ProcedureContext)_localctx).name.stop):null);
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(539); 
				match(WS);
				}
				}
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(545); 
			match(T__16);
			setState(549);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(546); 
					match(WS);
					}
					} 
				}
				setState(551);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			setState(553);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << STRING))) != 0)) {
				{
				setState(552); 
				((ProcedureContext)_localctx).parameters = parameters();
				}
			}

			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(555); 
				match(WS);
				}
				}
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(561); 
			match(T__17);
			parser.makeProcedureHeader((((ProcedureContext)_localctx).name!=null?_input.getText(((ProcedureContext)_localctx).name.start,((ProcedureContext)_localctx).name.stop):null), ((ProcedureContext)_localctx).parameters.val);
			setState(566);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(563); 
					match(WS);
					}
					} 
				}
				setState(568);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			setState(582);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(580);
					switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
					case 1:
						{
						setState(569); 
						variable();
						}
						break;
					case 2:
						{
						setState(570); 
						expression();
						setState(574);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(571); 
								match(WS);
								}
								} 
							}
							setState(576);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
						}
						}
						break;
					case 3:
						{
						setState(577); 
						function_call();
						}
						break;
					case 4:
						{
						setState(578); 
						statement();
						}
						break;
					case 5:
						{
						setState(579); 
						print();
						}
						break;
					}
					} 
				}
				setState(584);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(585); 
				match(WS);
				}
				}
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(591); 
			match(T__25);
			parser.closeProcedure();
			handler.scope = "global";
			setState(597);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(594); 
					match(WS);
					}
					} 
				}
				setState(599);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
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
		enterRule(_localctx, 24, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(600); 
			match(T__26);
			setState(602); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(601); 
				match(WS);
				}
				}
				setState(604); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(606); 
			((FunctionContext)_localctx).type = type();
			setState(608); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(607); 
				match(WS);
				}
				}
				setState(610); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(612); 
			((FunctionContext)_localctx).name = name();
			handler.scope = (((FunctionContext)_localctx).name!=null?_input.getText(((FunctionContext)_localctx).name.start,((FunctionContext)_localctx).name.stop):null);
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
			match(T__16);
			setState(624);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(621); 
					match(WS);
					}
					} 
				}
				setState(626);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			}
			setState(628);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << STRING))) != 0)) {
				{
				setState(627); 
				((FunctionContext)_localctx).parameters = parameters();
				}
			}

			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(630); 
				match(WS);
				}
				}
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(636); 
			match(T__17);
			parser.makeFuncHeader((((FunctionContext)_localctx).type!=null?_input.getText(((FunctionContext)_localctx).type.start,((FunctionContext)_localctx).type.stop):null) + " " + (((FunctionContext)_localctx).name!=null?_input.getText(((FunctionContext)_localctx).name.start,((FunctionContext)_localctx).name.stop):null), ((FunctionContext)_localctx).parameters.val);
			setState(641);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(638); 
					match(WS);
					}
					} 
				}
				setState(643);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			}
			setState(657);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(655);
					switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
					case 1:
						{
						setState(644); 
						variable();
						}
						break;
					case 2:
						{
						setState(645); 
						((FunctionContext)_localctx).expression = expression();
						setState(649);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(646); 
								match(WS);
								}
								} 
							}
							setState(651);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
						}
						}
						break;
					case 3:
						{
						setState(652); 
						function_call();
						}
						break;
					case 4:
						{
						setState(653); 
						statement();
						}
						break;
					case 5:
						{
						setState(654); 
						print();
						}
						break;
					}
					} 
				}
				setState(659);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			}
			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(660); 
				match(WS);
				}
				}
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(666); 
			match(T__27);
			setState(668); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(667); 
					match(WS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(670); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(672); 
			((FunctionContext)_localctx).expression = expression();
			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(673); 
				match(WS);
				}
				}
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(679); 
			match(T__5);
			parser.closeFunc(((FunctionContext)_localctx).expression.val);
			handler.scope = "global";
			setState(685);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(682); 
					match(WS);
					}
					} 
				}
				setState(687);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
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
		enterRule(_localctx, 26, RULE_function_call);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(688); 
				match(WS);
				}
				}
				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(694); 
			((Function_callContext)_localctx).name = name();
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(695); 
				match(WS);
				}
				}
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(701); 
			match(T__16);
			setState(705);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(702); 
					match(WS);
					}
					} 
				}
				setState(707);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			}
			setState(709);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << STRING))) != 0)) {
				{
				setState(708); 
				((Function_callContext)_localctx).parameters = parameters();
				}
			}

			setState(714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(711); 
				match(WS);
				}
				}
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(717); 
			match(T__17);
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(718); 
				match(WS);
				}
				}
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(724); 
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
		enterRule(_localctx, 28, RULE_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(727); 
			((ParametersContext)_localctx).p1 = parameter();
			((ParametersContext)_localctx).val =  ((ParametersContext)_localctx).p1.val;
			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(729); 
				match(WS);
				}
				}
				setState(734);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(735); 
			match(T__28);
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(736); 
				match(WS);
				}
				}
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(742); 
			((ParametersContext)_localctx).p2 = parameter();
			((ParametersContext)_localctx).val =  _localctx.val + ","+ ((ParametersContext)_localctx).p2.val;
			setState(747);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(744); 
					match(WS);
					}
					} 
				}
				setState(749);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
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
		enterRule(_localctx, 30, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==T__7) {
				{
				{
				setState(750); 
				((ParameterContext)_localctx).type = type();
				setState(754);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(751); 
					match(WS);
					}
					}
					setState(756);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((ParameterContext)_localctx).val =  (((ParameterContext)_localctx).type!=null?_input.getText(((ParameterContext)_localctx).type.start,((ParameterContext)_localctx).type.stop):null) + " ";
				}
				}
				setState(763);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(764); 
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
		enterRule(_localctx, 32, RULE_print);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(767); 
			match(T__29);
			setState(771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(768); 
				match(WS);
				}
				}
				setState(773);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(774); 
			match(T__16);
			setState(778);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(775); 
					match(WS);
					}
					} 
				}
				setState(780);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			}
			setState(781); 
			((PrintContext)_localctx).expression = expression();
			setState(785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(782); 
				match(WS);
				}
				}
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(788); 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u031a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\7\2/\n\2\f\2\16\2\62\13\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\2\7\2A\n\2\f\2"+
		"\16\2D\13\2\3\2\3\2\3\2\3\2\3\3\7\3K\n\3\f\3\16\3N\13\3\3\3\3\3\6\3R\n"+
		"\3\r\3\16\3S\3\3\3\3\3\3\5\3Y\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3d\n\3\3\3\3\3\3\3\3\3\5\3j\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3u\n\3\7\3w\n\3\f\3\16\3z\13\3\3\3\7\3}\n\3\f\3\16\3\u0080\13\3\3\3"+
		"\3\3\7\3\u0084\n\3\f\3\16\3\u0087\13\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\7\6\u0091\n\6\f\6\16\6\u0094\13\6\3\6\3\6\7\6\u0098\n\6\f\6\16\6\u009b"+
		"\13\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a3\n\6\3\7\7\7\u00a6\n\7\f\7\16\7"+
		"\u00a9\13\7\3\7\3\7\7\7\u00ad\n\7\f\7\16\7\u00b0\13\7\3\7\3\7\3\7\7\7"+
		"\u00b5\n\7\f\7\16\7\u00b8\13\7\3\7\7\7\u00bb\n\7\f\7\16\7\u00be\13\7\3"+
		"\7\7\7\u00c1\n\7\f\7\16\7\u00c4\13\7\3\7\7\7\u00c7\n\7\f\7\16\7\u00ca"+
		"\13\7\3\b\7\b\u00cd\n\b\f\b\16\b\u00d0\13\b\3\b\3\b\7\b\u00d4\n\b\f\b"+
		"\16\b\u00d7\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00e5"+
		"\n\b\3\b\7\b\u00e8\n\b\f\b\16\b\u00eb\13\b\3\b\3\b\7\b\u00ef\n\b\f\b\16"+
		"\b\u00f2\13\b\3\b\3\b\7\b\u00f6\n\b\f\b\16\b\u00f9\13\b\3\t\3\t\3\t\5"+
		"\t\u00fe\n\t\3\n\3\n\7\n\u0102\n\n\f\n\16\n\u0105\13\n\3\n\3\n\7\n\u0109"+
		"\n\n\f\n\16\n\u010c\13\n\3\n\3\n\3\n\7\n\u0111\n\n\f\n\16\n\u0114\13\n"+
		"\3\n\3\n\7\n\u0118\n\n\f\n\16\n\u011b\13\n\3\n\3\n\3\n\7\n\u0120\n\n\f"+
		"\n\16\n\u0123\13\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u012b\n\n\f\n\16\n\u012e"+
		"\13\n\3\n\7\n\u0131\n\n\f\n\16\n\u0134\13\n\3\n\3\n\7\n\u0138\n\n\f\n"+
		"\16\n\u013b\13\n\3\n\3\n\3\n\7\n\u0140\n\n\f\n\16\n\u0143\13\n\3\n\3\n"+
		"\3\n\3\n\7\n\u0149\n\n\f\n\16\n\u014c\13\n\3\n\3\n\3\n\7\n\u0151\n\n\f"+
		"\n\16\n\u0154\13\n\3\n\7\n\u0157\n\n\f\n\16\n\u015a\13\n\3\n\3\n\7\n\u015e"+
		"\n\n\f\n\16\n\u0161\13\n\3\13\3\13\7\13\u0165\n\13\f\13\16\13\u0168\13"+
		"\13\3\13\3\13\7\13\u016c\n\13\f\13\16\13\u016f\13\13\3\13\3\13\7\13\u0173"+
		"\n\13\f\13\16\13\u0176\13\13\3\13\3\13\3\13\7\13\u017b\n\13\f\13\16\13"+
		"\u017e\13\13\3\13\7\13\u0181\n\13\f\13\16\13\u0184\13\13\3\13\3\13\3\13"+
		"\7\13\u0189\n\13\f\13\16\13\u018c\13\13\3\13\3\13\3\13\3\13\7\13\u0192"+
		"\n\13\f\13\16\13\u0195\13\13\3\13\3\13\3\13\7\13\u019a\n\13\f\13\16\13"+
		"\u019d\13\13\3\13\7\13\u01a0\n\13\f\13\16\13\u01a3\13\13\3\13\3\13\7\13"+
		"\u01a7\n\13\f\13\16\13\u01aa\13\13\3\13\3\13\3\f\3\f\7\f\u01b0\n\f\f\f"+
		"\16\f\u01b3\13\f\3\f\3\f\3\f\7\f\u01b8\n\f\f\f\16\f\u01bb\13\f\3\f\3\f"+
		"\7\f\u01bf\n\f\f\f\16\f\u01c2\13\f\3\f\3\f\7\f\u01c6\n\f\f\f\16\f\u01c9"+
		"\13\f\3\f\3\f\7\f\u01cd\n\f\f\f\16\f\u01d0\13\f\3\f\3\f\7\f\u01d4\n\f"+
		"\f\f\16\f\u01d7\13\f\3\f\3\f\7\f\u01db\n\f\f\f\16\f\u01de\13\f\3\f\3\f"+
		"\7\f\u01e2\n\f\f\f\16\f\u01e5\13\f\3\f\3\f\7\f\u01e9\n\f\f\f\16\f\u01ec"+
		"\13\f\3\f\3\f\3\f\3\f\7\f\u01f2\n\f\f\f\16\f\u01f5\13\f\3\f\3\f\3\f\3"+
		"\f\7\f\u01fb\n\f\f\f\16\f\u01fe\13\f\3\f\3\f\7\f\u0202\n\f\f\f\16\f\u0205"+
		"\13\f\3\f\7\f\u0208\n\f\f\f\16\f\u020b\13\f\3\f\3\f\7\f\u020f\n\f\f\f"+
		"\16\f\u0212\13\f\3\f\3\f\3\r\3\r\6\r\u0218\n\r\r\r\16\r\u0219\3\r\3\r"+
		"\3\r\7\r\u021f\n\r\f\r\16\r\u0222\13\r\3\r\3\r\7\r\u0226\n\r\f\r\16\r"+
		"\u0229\13\r\3\r\5\r\u022c\n\r\3\r\7\r\u022f\n\r\f\r\16\r\u0232\13\r\3"+
		"\r\3\r\3\r\7\r\u0237\n\r\f\r\16\r\u023a\13\r\3\r\3\r\3\r\7\r\u023f\n\r"+
		"\f\r\16\r\u0242\13\r\3\r\3\r\3\r\7\r\u0247\n\r\f\r\16\r\u024a\13\r\3\r"+
		"\7\r\u024d\n\r\f\r\16\r\u0250\13\r\3\r\3\r\3\r\3\r\7\r\u0256\n\r\f\r\16"+
		"\r\u0259\13\r\3\16\3\16\6\16\u025d\n\16\r\16\16\16\u025e\3\16\3\16\6\16"+
		"\u0263\n\16\r\16\16\16\u0264\3\16\3\16\3\16\7\16\u026a\n\16\f\16\16\16"+
		"\u026d\13\16\3\16\3\16\7\16\u0271\n\16\f\16\16\16\u0274\13\16\3\16\5\16"+
		"\u0277\n\16\3\16\7\16\u027a\n\16\f\16\16\16\u027d\13\16\3\16\3\16\3\16"+
		"\7\16\u0282\n\16\f\16\16\16\u0285\13\16\3\16\3\16\3\16\7\16\u028a\n\16"+
		"\f\16\16\16\u028d\13\16\3\16\3\16\3\16\7\16\u0292\n\16\f\16\16\16\u0295"+
		"\13\16\3\16\7\16\u0298\n\16\f\16\16\16\u029b\13\16\3\16\3\16\6\16\u029f"+
		"\n\16\r\16\16\16\u02a0\3\16\3\16\7\16\u02a5\n\16\f\16\16\16\u02a8\13\16"+
		"\3\16\3\16\3\16\3\16\7\16\u02ae\n\16\f\16\16\16\u02b1\13\16\3\17\7\17"+
		"\u02b4\n\17\f\17\16\17\u02b7\13\17\3\17\3\17\7\17\u02bb\n\17\f\17\16\17"+
		"\u02be\13\17\3\17\3\17\7\17\u02c2\n\17\f\17\16\17\u02c5\13\17\3\17\5\17"+
		"\u02c8\n\17\3\17\7\17\u02cb\n\17\f\17\16\17\u02ce\13\17\3\17\3\17\7\17"+
		"\u02d2\n\17\f\17\16\17\u02d5\13\17\3\17\3\17\3\17\3\20\3\20\3\20\7\20"+
		"\u02dd\n\20\f\20\16\20\u02e0\13\20\3\20\3\20\7\20\u02e4\n\20\f\20\16\20"+
		"\u02e7\13\20\3\20\3\20\3\20\7\20\u02ec\n\20\f\20\16\20\u02ef\13\20\3\21"+
		"\3\21\7\21\u02f3\n\21\f\21\16\21\u02f6\13\21\3\21\3\21\7\21\u02fa\n\21"+
		"\f\21\16\21\u02fd\13\21\3\21\3\21\3\21\3\22\3\22\7\22\u0304\n\22\f\22"+
		"\16\22\u0307\13\22\3\22\3\22\7\22\u030b\n\22\f\22\16\22\u030e\13\22\3"+
		"\22\3\22\7\22\u0312\n\22\f\22\16\22\u0315\13\22\3\22\3\22\3\22\3\22\2"+
		"\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\3\3\2\t\n\u0397\2$\3"+
		"\2\2\2\4L\3\2\2\2\6\u008a\3\2\2\2\b\u008c\3\2\2\2\n\u00a2\3\2\2\2\f\u00a7"+
		"\3\2\2\2\16\u00ce\3\2\2\2\20\u00fd\3\2\2\2\22\u00ff\3\2\2\2\24\u0162\3"+
		"\2\2\2\26\u01ad\3\2\2\2\30\u0215\3\2\2\2\32\u025a\3\2\2\2\34\u02b5\3\2"+
		"\2\2\36\u02d9\3\2\2\2 \u02fb\3\2\2\2\"\u0301\3\2\2\2$%\7\3\2\2%)\b\2\1"+
		"\2&(\7%\2\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2"+
		"\2\2,\60\7\4\2\2-/\7%\2\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2"+
		"\2\2\61<\3\2\2\2\62\60\3\2\2\2\63;\5\4\3\2\64;\5\f\7\2\65;\5\20\t\2\66"+
		";\5\32\16\2\67;\5\30\r\28;\5\34\17\29;\5\"\22\2:\63\3\2\2\2:\64\3\2\2"+
		"\2:\65\3\2\2\2:\66\3\2\2\2:\67\3\2\2\2:8\3\2\2\2:9\3\2\2\2;>\3\2\2\2<"+
		":\3\2\2\2<=\3\2\2\2=B\3\2\2\2><\3\2\2\2?A\7%\2\2@?\3\2\2\2AD\3\2\2\2B"+
		"@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7\5\2\2FG\b\2\1\2GH\b\2\1\2"+
		"H\3\3\2\2\2IK\7%\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2"+
		"NL\3\2\2\2OQ\5\6\4\2PR\7%\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2"+
		"TU\3\2\2\2UV\5\b\5\2VX\b\3\1\2WY\7\6\2\2XW\3\2\2\2XY\3\2\2\2Yc\3\2\2\2"+
		"Z[\5\n\6\2[\\\b\3\1\2\\d\3\2\2\2]^\5\f\7\2^_\b\3\1\2_d\3\2\2\2`a\5\34"+
		"\17\2ab\b\3\1\2bd\3\2\2\2cZ\3\2\2\2c]\3\2\2\2c`\3\2\2\2cd\3\2\2\2dx\3"+
		"\2\2\2ef\7\7\2\2fg\5\b\5\2gi\b\3\1\2hj\7\6\2\2ih\3\2\2\2ij\3\2\2\2jt\3"+
		"\2\2\2kl\5\n\6\2lm\b\3\1\2mu\3\2\2\2no\5\f\7\2op\b\3\1\2pu\3\2\2\2qr\5"+
		"\34\17\2rs\b\3\1\2su\3\2\2\2tk\3\2\2\2tn\3\2\2\2tq\3\2\2\2tu\3\2\2\2u"+
		"w\3\2\2\2ve\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y~\3\2\2\2zx\3\2\2\2"+
		"{}\7%\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3"+
		"\2\2\2\u0080~\3\2\2\2\u0081\u0085\7\b\2\2\u0082\u0084\7%\2\2\u0083\u0082"+
		"\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\b\3\1\2\u0089\5\3\2\2\2"+
		"\u008a\u008b\t\2\2\2\u008b\7\3\2\2\2\u008c\u008d\7\"\2\2\u008d\t\3\2\2"+
		"\2\u008e\u0092\7\13\2\2\u008f\u0091\7%\2\2\u0090\u008f\3\2\2\2\u0091\u0094"+
		"\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0095\u0099\7\"\2\2\u0096\u0098\7%\2\2\u0097\u0096\3\2"+
		"\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7\13\2\2\u009d\u00a3\b"+
		"\6\1\2\u009e\u009f\7#\2\2\u009f\u00a3\b\6\1\2\u00a0\u00a1\7\"\2\2\u00a1"+
		"\u00a3\b\6\1\2\u00a2\u008e\3\2\2\2\u00a2\u009e\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a3\13\3\2\2\2\u00a4\u00a6\7%\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9"+
		"\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa\u00ae\5\n\6\2\u00ab\u00ad\7%\2\2\u00ac\u00ab\3\2"+
		"\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00c8\b\7\1\2\u00b2\u00b6\7!"+
		"\2\2\u00b3\u00b5\7%\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00bc\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b9\u00bb\5\n\6\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c2\3\2\2\2\u00be\u00bc\3\2"+
		"\2\2\u00bf\u00c1\7%\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c5\u00c7\b\7\1\2\u00c6\u00b2\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\r\3\2\2\2\u00ca\u00c8\3\2\2\2"+
		"\u00cb\u00cd\7%\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1"+
		"\u00d5\5\n\6\2\u00d2\u00d4\7%\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2"+
		"\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00f7\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d8\u00d9\7\f\2\2\u00d9\u00e5\b\b\1\2\u00da\u00db\7\r"+
		"\2\2\u00db\u00e5\b\b\1\2\u00dc\u00dd\7\16\2\2\u00dd\u00e5\b\b\1\2\u00de"+
		"\u00df\7\17\2\2\u00df\u00e5\b\b\1\2\u00e0\u00e1\7\20\2\2\u00e1\u00e5\b"+
		"\b\1\2\u00e2\u00e3\7\21\2\2\u00e3\u00e5\b\b\1\2\u00e4\u00d8\3\2\2\2\u00e4"+
		"\u00da\3\2\2\2\u00e4\u00dc\3\2\2\2\u00e4\u00de\3\2\2\2\u00e4\u00e0\3\2"+
		"\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e9\3\2\2\2\u00e6\u00e8\7%\2\2\u00e7"+
		"\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00f0\5\n\6\2\u00ed"+
		"\u00ef\7%\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"\u00f4\b\b\1\2\u00f4\u00f6\3\2\2\2\u00f5\u00e4\3\2\2\2\u00f6\u00f9\3\2"+
		"\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\17\3\2\2\2\u00f9\u00f7"+
		"\3\2\2\2\u00fa\u00fe\5\22\n\2\u00fb\u00fe\5\24\13\2\u00fc\u00fe\5\26\f"+
		"\2\u00fd\u00fa\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\21"+
		"\3\2\2\2\u00ff\u0103\7\22\2\2\u0100\u0102\7%\2\2\u0101\u0100\3\2\2\2\u0102"+
		"\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2"+
		"\2\2\u0105\u0103\3\2\2\2\u0106\u010a\7\23\2\2\u0107\u0109\7%\2\2\u0108"+
		"\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2"+
		"\2\2\u010b\u010d\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\5\16\b\2\u010e"+
		"\u0112\b\n\1\2\u010f\u0111\7%\2\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2"+
		"\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0115\u0119\7\24\2\2\u0116\u0118\7%\2\2\u0117\u0116\3\2"+
		"\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u012c\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u012b\5\4\3\2\u011d\u0121\5\f"+
		"\7\2\u011e\u0120\7%\2\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u012b\3\2\2\2\u0123\u0121\3\2"+
		"\2\2\u0124\u012b\5\34\17\2\u0125\u012b\5\20\t\2\u0126\u0127\5\"\22\2\u0127"+
		"\u0128\7\b\2\2\u0128\u0129\b\n\1\2\u0129\u012b\3\2\2\2\u012a\u011c\3\2"+
		"\2\2\u012a\u011d\3\2\2\2\u012a\u0124\3\2\2\2\u012a\u0125\3\2\2\2\u012a"+
		"\u0126\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2"+
		"\2\2\u012d\u0132\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0131\7%\2\2\u0130"+
		"\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133\u0152\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0139\7\25\2\2\u0136"+
		"\u0138\7%\2\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2"+
		"\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c"+
		"\u0151\5\4\3\2\u013d\u0141\5\f\7\2\u013e\u0140\7%\2\2\u013f\u013e\3\2"+
		"\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0151\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0151\5\34\17\2\u0145\u0151\5"+
		"\20\t\2\u0146\u014a\5\"\22\2\u0147\u0149\7%\2\2\u0148\u0147\3\2\2\2\u0149"+
		"\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2"+
		"\2\2\u014c\u014a\3\2\2\2\u014d\u014e\7\b\2\2\u014e\u014f\b\n\1\2\u014f"+
		"\u0151\3\2\2\2\u0150\u0135\3\2\2\2\u0150\u013d\3\2\2\2\u0150\u0144\3\2"+
		"\2\2\u0150\u0145\3\2\2\2\u0150\u0146\3\2\2\2\u0151\u0154\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0158\3\2\2\2\u0154\u0152\3\2"+
		"\2\2\u0155\u0157\7%\2\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158"+
		"\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u0158\3\2"+
		"\2\2\u015b\u015f\7\26\2\2\u015c\u015e\7%\2\2\u015d\u015c\3\2\2\2\u015e"+
		"\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\23\3\2\2"+
		"\2\u0161\u015f\3\2\2\2\u0162\u0166\7\27\2\2\u0163\u0165\7%\2\2\u0164\u0163"+
		"\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u0169\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016d\7\23\2\2\u016a\u016c\7"+
		"%\2\2\u016b\u016a\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0174\5\16"+
		"\b\2\u0171\u0173\7%\2\2\u0172\u0171\3\2\2\2\u0173\u0176\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0174\3\2"+
		"\2\2\u0177\u0178\b\13\1\2\u0178\u017c\7\24\2\2\u0179\u017b\7%\2\2\u017a"+
		"\u0179\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2"+
		"\2\2\u017d\u019b\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0181\7%\2\2\u0180"+
		"\u017f\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2"+
		"\2\2\u0183\u0185\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u019a\5\4\3\2\u0186"+
		"\u018a\5\f\7\2\u0187\u0189\7%\2\2\u0188\u0187\3\2\2\2\u0189\u018c\3\2"+
		"\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u019a\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018d\u019a\5\34\17\2\u018e\u019a\5\20\t\2\u018f\u0193"+
		"\5\"\22\2\u0190\u0192\7%\2\2\u0191\u0190\3\2\2\2\u0192\u0195\3\2\2\2\u0193"+
		"\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0193\3\2"+
		"\2\2\u0196\u0197\7\b\2\2\u0197\u0198\b\13\1\2\u0198\u019a\3\2\2\2\u0199"+
		"\u0182\3\2\2\2\u0199\u0186\3\2\2\2\u0199\u018d\3\2\2\2\u0199\u018e\3\2"+
		"\2\2\u0199\u018f\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\u01a1\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u01a0\7%"+
		"\2\2\u019f\u019e\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a8\7\30"+
		"\2\2\u01a5\u01a7\7%\2\2\u01a6\u01a5\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8"+
		"\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01a8\3\2"+
		"\2\2\u01ab\u01ac\b\13\1\2\u01ac\25\3\2\2\2\u01ad\u01b1\7\31\2\2\u01ae"+
		"\u01b0\7%\2\2\u01af\u01ae\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2"+
		"\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4"+
		"\u01b5\7\23\2\2\u01b5\u01b9\b\f\1\2\u01b6\u01b8\7%\2\2\u01b7\u01b6\3\2"+
		"\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"\u01bc\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01c0\5\4\3\2\u01bd\u01bf\7%"+
		"\2\2\u01be\u01bd\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c7\7\b"+
		"\2\2\u01c4\u01c6\7%\2\2\u01c5\u01c4\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7"+
		"\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01c7\3\2"+
		"\2\2\u01ca\u01ce\5\16\b\2\u01cb\u01cd\7%\2\2\u01cc\u01cb\3\2\2\2\u01cd"+
		"\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d1\3\2"+
		"\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d5\7\b\2\2\u01d2\u01d4\7%\2\2\u01d3"+
		"\u01d2\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2"+
		"\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01dc\5\f\7\2\u01d9"+
		"\u01db\7%\2\2\u01da\u01d9\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2"+
		"\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01df\3\2\2\2\u01de\u01dc\3\2\2\2\u01df"+
		"\u01e3\7\24\2\2\u01e0\u01e2\7%\2\2\u01e1\u01e0\3\2\2\2\u01e2\u01e5\3\2"+
		"\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\3\2\2\2\u01e5"+
		"\u01e3\3\2\2\2\u01e6\u0203\b\f\1\2\u01e7\u01e9\7%\2\2\u01e8\u01e7\3\2"+
		"\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb"+
		"\u01ed\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u0202\5\4\3\2\u01ee\u01ef\5\f"+
		"\7\2\u01ef\u01f3\b\f\1\2\u01f0\u01f2\7%\2\2\u01f1\u01f0\3\2\2\2\u01f2"+
		"\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u0202\3\2"+
		"\2\2\u01f5\u01f3\3\2\2\2\u01f6\u0202\5\34\17\2\u01f7\u0202\5\20\t\2\u01f8"+
		"\u01fc\5\"\22\2\u01f9\u01fb\7%\2\2\u01fa\u01f9\3\2\2\2\u01fb\u01fe\3\2"+
		"\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01ff\3\2\2\2\u01fe"+
		"\u01fc\3\2\2\2\u01ff\u0200\7\b\2\2\u0200\u0202\3\2\2\2\u0201\u01ea\3\2"+
		"\2\2\u0201\u01ee\3\2\2\2\u0201\u01f6\3\2\2\2\u0201\u01f7\3\2\2\2\u0201"+
		"\u01f8\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2"+
		"\2\2\u0204\u0209\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u0208\7%\2\2\u0207"+
		"\u0206\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2"+
		"\2\2\u020a\u020c\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u0210\7\32\2\2\u020d"+
		"\u020f\7%\2\2\u020e\u020d\3\2\2\2\u020f\u0212\3\2\2\2\u0210\u020e\3\2"+
		"\2\2\u0210\u0211\3\2\2\2\u0211\u0213\3\2\2\2\u0212\u0210\3\2\2\2\u0213"+
		"\u0214\b\f\1\2\u0214\27\3\2\2\2\u0215\u0217\7\33\2\2\u0216\u0218\7%\2"+
		"\2\u0217\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a"+
		"\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c\5\b\5\2\u021c\u0220\b\r\1\2\u021d"+
		"\u021f\7%\2\2\u021e\u021d\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2"+
		"\2\2\u0220\u0221\3\2\2\2\u0221\u0223\3\2\2\2\u0222\u0220\3\2\2\2\u0223"+
		"\u0227\7\23\2\2\u0224\u0226\7%\2\2\u0225\u0224\3\2\2\2\u0226\u0229\3\2"+
		"\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u022b\3\2\2\2\u0229"+
		"\u0227\3\2\2\2\u022a\u022c\5\36\20\2\u022b\u022a\3\2\2\2\u022b\u022c\3"+
		"\2\2\2\u022c\u0230\3\2\2\2\u022d\u022f\7%\2\2\u022e\u022d\3\2\2\2\u022f"+
		"\u0232\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0233\3\2"+
		"\2\2\u0232\u0230\3\2\2\2\u0233\u0234\7\24\2\2\u0234\u0238\b\r\1\2\u0235"+
		"\u0237\7%\2\2\u0236\u0235\3\2\2\2\u0237\u023a\3\2\2\2\u0238\u0236\3\2"+
		"\2\2\u0238\u0239\3\2\2\2\u0239\u0248\3\2\2\2\u023a\u0238\3\2\2\2\u023b"+
		"\u0247\5\4\3\2\u023c\u0240\5\f\7\2\u023d\u023f\7%\2\2\u023e\u023d\3\2"+
		"\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"\u0247\3\2\2\2\u0242\u0240\3\2\2\2\u0243\u0247\5\34\17\2\u0244\u0247\5"+
		"\20\t\2\u0245\u0247\5\"\22\2\u0246\u023b\3\2\2\2\u0246\u023c\3\2\2\2\u0246"+
		"\u0243\3\2\2\2\u0246\u0244\3\2\2\2\u0246\u0245\3\2\2\2\u0247\u024a\3\2"+
		"\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024e\3\2\2\2\u024a"+
		"\u0248\3\2\2\2\u024b\u024d\7%\2\2\u024c\u024b\3\2\2\2\u024d\u0250\3\2"+
		"\2\2\u024e\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0251\3\2\2\2\u0250"+
		"\u024e\3\2\2\2\u0251\u0252\7\34\2\2\u0252\u0253\b\r\1\2\u0253\u0257\b"+
		"\r\1\2\u0254\u0256\7%\2\2\u0255\u0254\3\2\2\2\u0256\u0259\3\2\2\2\u0257"+
		"\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258\31\3\2\2\2\u0259\u0257\3\2\2"+
		"\2\u025a\u025c\7\35\2\2\u025b\u025d\7%\2\2\u025c\u025b\3\2\2\2\u025d\u025e"+
		"\3\2\2\2\u025e\u025c\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0260\3\2\2\2\u0260"+
		"\u0262\5\6\4\2\u0261\u0263\7%\2\2\u0262\u0261\3\2\2\2\u0263\u0264\3\2"+
		"\2\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0266\3\2\2\2\u0266"+
		"\u0267\5\b\5\2\u0267\u026b\b\16\1\2\u0268\u026a\7%\2\2\u0269\u0268\3\2"+
		"\2\2\u026a\u026d\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026c"+
		"\u026e\3\2\2\2\u026d\u026b\3\2\2\2\u026e\u0272\7\23\2\2\u026f\u0271\7"+
		"%\2\2\u0270\u026f\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0272"+
		"\u0273\3\2\2\2\u0273\u0276\3\2\2\2\u0274\u0272\3\2\2\2\u0275\u0277\5\36"+
		"\20\2\u0276\u0275\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u027b\3\2\2\2\u0278"+
		"\u027a\7%\2\2\u0279\u0278\3\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2"+
		"\2\2\u027b\u027c\3\2\2\2\u027c\u027e\3\2\2\2\u027d\u027b\3\2\2\2\u027e"+
		"\u027f\7\24\2\2\u027f\u0283\b\16\1\2\u0280\u0282\7%\2\2\u0281\u0280\3"+
		"\2\2\2\u0282\u0285\3\2\2\2\u0283\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284"+
		"\u0293\3\2\2\2\u0285\u0283\3\2\2\2\u0286\u0292\5\4\3\2\u0287\u028b\5\f"+
		"\7\2\u0288\u028a\7%\2\2\u0289\u0288\3\2\2\2\u028a\u028d\3\2\2\2\u028b"+
		"\u0289\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u0292\3\2\2\2\u028d\u028b\3\2"+
		"\2\2\u028e\u0292\5\34\17\2\u028f\u0292\5\20\t\2\u0290\u0292\5\"\22\2\u0291"+
		"\u0286\3\2\2\2\u0291\u0287\3\2\2\2\u0291\u028e\3\2\2\2\u0291\u028f\3\2"+
		"\2\2\u0291\u0290\3\2\2\2\u0292\u0295\3\2\2\2\u0293\u0291\3\2\2\2\u0293"+
		"\u0294\3\2\2\2\u0294\u0299\3\2\2\2\u0295\u0293\3\2\2\2\u0296\u0298\7%"+
		"\2\2\u0297\u0296\3\2\2\2\u0298\u029b\3\2\2\2\u0299\u0297\3\2\2\2\u0299"+
		"\u029a\3\2\2\2\u029a\u029c\3\2\2\2\u029b\u0299\3\2\2\2\u029c\u029e\7\36"+
		"\2\2\u029d\u029f\7%\2\2\u029e\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0"+
		"\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a6\5\f"+
		"\7\2\u02a3\u02a5\7%\2\2\u02a4\u02a3\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6"+
		"\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a9\3\2\2\2\u02a8\u02a6\3\2"+
		"\2\2\u02a9\u02aa\7\b\2\2\u02aa\u02ab\b\16\1\2\u02ab\u02af\b\16\1\2\u02ac"+
		"\u02ae\7%\2\2\u02ad\u02ac\3\2\2\2\u02ae\u02b1\3\2\2\2\u02af\u02ad\3\2"+
		"\2\2\u02af\u02b0\3\2\2\2\u02b0\33\3\2\2\2\u02b1\u02af\3\2\2\2\u02b2\u02b4"+
		"\7%\2\2\u02b3\u02b2\3\2\2\2\u02b4\u02b7\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b5"+
		"\u02b6\3\2\2\2\u02b6\u02b8\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b8\u02bc\5\b"+
		"\5\2\u02b9\u02bb\7%\2\2\u02ba\u02b9\3\2\2\2\u02bb\u02be\3\2\2\2\u02bc"+
		"\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02bf\3\2\2\2\u02be\u02bc\3\2"+
		"\2\2\u02bf\u02c3\7\23\2\2\u02c0\u02c2\7%\2\2\u02c1\u02c0\3\2\2\2\u02c2"+
		"\u02c5\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c7\3\2"+
		"\2\2\u02c5\u02c3\3\2\2\2\u02c6\u02c8\5\36\20\2\u02c7\u02c6\3\2\2\2\u02c7"+
		"\u02c8\3\2\2\2\u02c8\u02cc\3\2\2\2\u02c9\u02cb\7%\2\2\u02ca\u02c9\3\2"+
		"\2\2\u02cb\u02ce\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd"+
		"\u02cf\3\2\2\2\u02ce\u02cc\3\2\2\2\u02cf\u02d3\7\24\2\2\u02d0\u02d2\7"+
		"%\2\2\u02d1\u02d0\3\2\2\2\u02d2\u02d5\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3"+
		"\u02d4\3\2\2\2\u02d4\u02d6\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d6\u02d7\7\b"+
		"\2\2\u02d7\u02d8\b\17\1\2\u02d8\35\3\2\2\2\u02d9\u02da\5 \21\2\u02da\u02de"+
		"\b\20\1\2\u02db\u02dd\7%\2\2\u02dc\u02db\3\2\2\2\u02dd\u02e0\3\2\2\2\u02de"+
		"\u02dc\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e1\3\2\2\2\u02e0\u02de\3\2"+
		"\2\2\u02e1\u02e5\7\37\2\2\u02e2\u02e4\7%\2\2\u02e3\u02e2\3\2\2\2\u02e4"+
		"\u02e7\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e8\3\2"+
		"\2\2\u02e7\u02e5\3\2\2\2\u02e8\u02e9\5 \21\2\u02e9\u02ed\b\20\1\2\u02ea"+
		"\u02ec\7%\2\2\u02eb\u02ea\3\2\2\2\u02ec\u02ef\3\2\2\2\u02ed\u02eb\3\2"+
		"\2\2\u02ed\u02ee\3\2\2\2\u02ee\37\3\2\2\2\u02ef\u02ed\3\2\2\2\u02f0\u02f4"+
		"\5\6\4\2\u02f1\u02f3\7%\2\2\u02f2\u02f1\3\2\2\2\u02f3\u02f6\3\2\2\2\u02f4"+
		"\u02f2\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f7\3\2\2\2\u02f6\u02f4\3\2"+
		"\2\2\u02f7\u02f8\b\21\1\2\u02f8\u02fa\3\2\2\2\u02f9\u02f0\3\2\2\2\u02fa"+
		"\u02fd\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fe\3\2"+
		"\2\2\u02fd\u02fb\3\2\2\2\u02fe\u02ff\5\b\5\2\u02ff\u0300\b\21\1\2\u0300"+
		"!\3\2\2\2\u0301\u0305\7 \2\2\u0302\u0304\7%\2\2\u0303\u0302\3\2\2\2\u0304"+
		"\u0307\3\2\2\2\u0305\u0303\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0308\3\2"+
		"\2\2\u0307\u0305\3\2\2\2\u0308\u030c\7\23\2\2\u0309\u030b\7%\2\2\u030a"+
		"\u0309\3\2\2\2\u030b\u030e\3\2\2\2\u030c\u030a\3\2\2\2\u030c\u030d\3\2"+
		"\2\2\u030d\u030f\3\2\2\2\u030e\u030c\3\2\2\2\u030f\u0313\5\f\7\2\u0310"+
		"\u0312\7%\2\2\u0311\u0310\3\2\2\2\u0312\u0315\3\2\2\2\u0313\u0311\3\2"+
		"\2\2\u0313\u0314\3\2\2\2\u0314\u0316\3\2\2\2\u0315\u0313\3\2\2\2\u0316"+
		"\u0317\7\24\2\2\u0317\u0318\b\22\1\2\u0318#\3\2\2\2p)\60:<BLSXcitx~\u0085"+
		"\u0092\u0099\u00a2\u00a7\u00ae\u00b6\u00bc\u00c2\u00c8\u00ce\u00d5\u00e4"+
		"\u00e9\u00f0\u00f7\u00fd\u0103\u010a\u0112\u0119\u0121\u012a\u012c\u0132"+
		"\u0139\u0141\u014a\u0150\u0152\u0158\u015f\u0166\u016d\u0174\u017c\u0182"+
		"\u018a\u0193\u0199\u019b\u01a1\u01a8\u01b1\u01b9\u01c0\u01c7\u01ce\u01d5"+
		"\u01dc\u01e3\u01ea\u01f3\u01fc\u0201\u0203\u0209\u0210\u0219\u0220\u0227"+
		"\u022b\u0230\u0238\u0240\u0246\u0248\u024e\u0257\u025e\u0264\u026b\u0272"+
		"\u0276\u027b\u0283\u028b\u0291\u0293\u0299\u02a0\u02a6\u02af\u02b5\u02bc"+
		"\u02c3\u02c7\u02cc\u02d3\u02de\u02e5\u02ed\u02f4\u02fb\u0305\u030c\u0313";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}