/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTEquation extends AbstractModelicaNode {
    public ASTEquation(int id) {
        super(id);
    }

    public ASTEquation(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=721a90d860df6b239186c39870f44658 (do not edit this line) */
