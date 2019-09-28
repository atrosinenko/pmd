/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTElementModificationOrReplaceable extends AbstractModelicaNode {
    public ASTElementModificationOrReplaceable(int id) {
        super(id);
    }

    public ASTElementModificationOrReplaceable(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=ca856fae061d1d36892bf2aaaab2be50 (do not edit this line) */
