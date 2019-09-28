/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTStatement extends AbstractModelicaNode {
    public ASTStatement(int id) {
        super(id);
    }

    public ASTStatement(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=b7c500bd3700fca1a06dc93c224e0665 (do not edit this line) */
