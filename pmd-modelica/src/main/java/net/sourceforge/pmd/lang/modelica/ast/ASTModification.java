/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTModification extends AbstractModelicaNode {
    public ASTModification(int id) {
        super(id);
    }

    public ASTModification(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=27e09f299dd35ddb63b7993e24df464e (do not edit this line) */
