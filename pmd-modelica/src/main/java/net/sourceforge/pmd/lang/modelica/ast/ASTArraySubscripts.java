/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTArraySubscripts extends AbstractModelicaNode {
    public ASTArraySubscripts(int id) {
        super(id);
    }

    public ASTArraySubscripts(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=32a1c29b98b667f57f44941716a98415 (do not edit this line) */
