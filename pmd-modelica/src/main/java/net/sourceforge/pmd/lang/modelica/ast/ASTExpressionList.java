/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTExpressionList extends AbstractModelicaNode {
    public ASTExpressionList(int id) {
        super(id);
    }

    public ASTExpressionList(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=bf71ba1688082f199a6ce63b53369c3c (do not edit this line) */
