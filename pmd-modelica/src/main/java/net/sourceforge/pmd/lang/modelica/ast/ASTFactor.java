/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTFactor extends AbstractModelicaNode {
    public ASTFactor(int id) {
        super(id);
    }

    public ASTFactor(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=cb2d36b579d05c10e9d1137a23c1569b (do not edit this line) */
