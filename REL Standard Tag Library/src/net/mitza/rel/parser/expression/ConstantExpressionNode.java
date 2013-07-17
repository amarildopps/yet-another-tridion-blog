/*
 * This software and all files contained in it are distrubted under the MIT license.
 * 
 * Copyright (c) 2013 Cogito Learning Ltd
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package net.mitza.rel.parser.expression;

import net.mitza.rel.parser.TokenTypes;

/**
 * An ExpressionNode that stores a constant value
 */
public class ConstantExpressionNode extends ExpressionNode {

	/** The value of the constant */
	private Object value;

	public ConstantExpressionNode(Object value) {
		this.value = value;
	}

	/**
	 * Returns the value of the constant
	 */
	public Object getValue() {
		return value;
	}

	/**
	 * Returns the type of the node, in this case ExpressionNode.CONSTANT
	 */
	public TokenTypes getType() {
		return TokenTypes.CONSTANT;
	}

	/**
	 * Implementation of the visitor design pattern.
	 * 
	 * Calls visit on the visitor.
	 * 
	 * @param visitor
	 *            the visitor
	 */
	public void accept(ExpressionNodeVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String toString() {
		return value == null ? null : value.toString();
	}
}
