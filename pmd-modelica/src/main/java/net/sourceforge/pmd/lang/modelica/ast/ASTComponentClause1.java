/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTComponentClause1 extends AbstractModelicaNode {
    public ASTComponentClause1(int id) {
        super(id);
    }

    public ASTComponentClause1(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=83e38ddf9d8ca4e68c9d9bb44f81afe0 (do not edit this line) */
