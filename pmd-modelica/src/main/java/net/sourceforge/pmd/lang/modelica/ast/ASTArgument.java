/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTArgument extends AbstractModelicaNode {
    public ASTArgument(int id) {
        super(id);
    }

    public ASTArgument(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=63ff20f6395ef5acbbdf82dcd5943589 (do not edit this line) */
