/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTMulOp extends AbstractModelicaNode {
    public ASTMulOp(int id) {
        super(id);
    }

    public ASTMulOp(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=082585c35edf101b9e61baea281e2e2e (do not edit this line) */
