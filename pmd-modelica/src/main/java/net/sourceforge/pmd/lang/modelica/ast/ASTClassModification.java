/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTClassModification extends AbstractModelicaNode {
    public ASTClassModification(int id) {
        super(id);
    }

    public ASTClassModification(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=3a9615942585f447d4ee7d4523536b1f (do not edit this line) */
