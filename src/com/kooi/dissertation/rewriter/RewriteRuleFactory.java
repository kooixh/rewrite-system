package com.kooi.dissertation.rewriter;

import com.kooi.dissertation.parser.ASTParser;
import com.kooi.dissertation.parser.ParseException;
import com.kooi.dissertation.syntaxtree.Node;

/**
 * 
 * 
 * Factory class to generate a rewrite rule given a lhs, rhs and rule name
 * 
 * @author Kooi
 * @date 13 February 2019
 *
 */
public class RewriteRuleFactory {

	
	private ASTParser p;
	
	public RewriteRuleFactory(ASTParser p) {
		this.p = p;
		
	}
	
	/**
	 * 
	 * This methods generates a rewrite rule given infix string of lhs and rhs, rule also
	 * requires a name.
	 * 
	 * @param l expression of lhs of rule in infix.
	 * @param r expression of rhs of rule in infix.
	 * @param name name of the rule.
	 * @return a rewrite rule from l's AST ot r's AST
	 */
	public RewriteRule getRewriteRule(String l,String r,String name) {
		
		
		try {
			Node lhs = p.parseAST(l);
			Node rhs = p.parseAST(r);
			return new RewriteRule(lhs,rhs,name);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
		
		
		
	}
}
