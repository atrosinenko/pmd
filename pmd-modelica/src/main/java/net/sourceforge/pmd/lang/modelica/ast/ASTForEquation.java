/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTForEquation extends AbstractModelicaNode {
    public ASTForEquation(int id) {
        super(id);
    }

    public ASTForEquation(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=d4fab06f34dc839eff73bb93393abd4a (do not edit this line) */
