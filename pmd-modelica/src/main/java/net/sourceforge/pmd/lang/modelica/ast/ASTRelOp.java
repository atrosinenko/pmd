/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTRelOp extends AbstractModelicaNode {
    public ASTRelOp(int id) {
        super(id);
    }

    public ASTRelOp(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=7189121db18c8a9a3fcc34d34cf81e23 (do not edit this line) */
