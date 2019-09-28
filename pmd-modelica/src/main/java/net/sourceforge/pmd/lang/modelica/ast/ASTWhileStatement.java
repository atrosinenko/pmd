/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTWhileStatement extends AbstractModelicaNode {
    public ASTWhileStatement(int id) {
        super(id);
    }

    public ASTWhileStatement(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=269895c11da190427012c8b6b43d3d2a (do not edit this line) */
