/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTIfStatement extends AbstractModelicaNode {
    public ASTIfStatement(int id) {
        super(id);
    }

    public ASTIfStatement(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=0496c3f48e7f3e755fcb512703b76ed1 (do not edit this line) */
