/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTConnectClause extends AbstractModelicaNode {
    public ASTConnectClause(int id) {
        super(id);
    }

    public ASTConnectClause(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=b0261ab4b49888afab75c71cf7f28120 (do not edit this line) */
