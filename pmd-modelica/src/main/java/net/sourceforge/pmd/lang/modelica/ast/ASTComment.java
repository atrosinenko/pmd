/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTComment extends AbstractModelicaNode {
    public ASTComment(int id) {
        super(id);
    }

    public ASTComment(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=d6a085b7bb994b758e0c37627d102afb (do not edit this line) */
