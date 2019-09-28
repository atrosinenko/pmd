/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTElementList extends AbstractModelicaNode {
    public ASTElementList(int id) {
        super(id);
    }

    public ASTElementList(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=533c32468c9d570baae9cd9b08deb623 (do not edit this line) */
