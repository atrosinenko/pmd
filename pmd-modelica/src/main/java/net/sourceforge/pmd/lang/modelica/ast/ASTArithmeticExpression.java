/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTArithmeticExpression extends AbstractModelicaNode {
    public ASTArithmeticExpression(int id) {
        super(id);
    }

    public ASTArithmeticExpression(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=be5eadfde3c4544a03f0438bcc4bc904 (do not edit this line) */
