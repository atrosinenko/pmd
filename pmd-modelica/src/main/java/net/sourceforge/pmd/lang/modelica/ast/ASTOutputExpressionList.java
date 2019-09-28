/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTOutputExpressionList extends AbstractModelicaNode {
    public ASTOutputExpressionList(int id) {
        super(id);
    }

    public ASTOutputExpressionList(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=2c39c5483fb626de5b2ebfd379c23238 (do not edit this line) */
