/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTLogicalExpression extends AbstractModelicaNode {
    public ASTLogicalExpression(int id) {
        super(id);
    }

    public ASTLogicalExpression(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=c2be126232a59656048d95094de879f1 (do not edit this line) */
