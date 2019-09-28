/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTAddOp extends AbstractModelicaNode {
    public ASTAddOp(int id) {
        super(id);
    }

    public ASTAddOp(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=e43e150513adbb2812a47ce236fd21be (do not edit this line) */
