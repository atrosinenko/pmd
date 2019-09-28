/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTRelation extends AbstractModelicaNode {
    public ASTRelation(int id) {
        super(id);
    }

    public ASTRelation(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=9967feb2315103d09962797185d93872 (do not edit this line) */
