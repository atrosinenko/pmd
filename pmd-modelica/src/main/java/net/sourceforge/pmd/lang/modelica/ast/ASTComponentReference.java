/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTComponentReference extends AbstractModelicaNode {
    public ASTComponentReference(int id) {
        super(id);
    }

    public ASTComponentReference(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=289e53e1f4f1cd1e12372c8685cb9f8f (do not edit this line) */
