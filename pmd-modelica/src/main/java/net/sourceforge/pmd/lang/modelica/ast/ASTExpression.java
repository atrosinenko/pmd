/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTExpression extends AbstractModelicaNode {
    public ASTExpression(int id) {
        super(id);
    }

    public ASTExpression(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=65fb4383b7ae9e16425803389b1eb6c8 (do not edit this line) */
