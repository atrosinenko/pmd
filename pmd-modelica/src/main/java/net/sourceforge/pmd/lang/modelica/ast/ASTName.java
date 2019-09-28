/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTName extends AbstractModelicaNode {
    public ASTName(int id) {
        super(id);
    }

    public ASTName(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=3fa9905b270ffcab5531dc77cb125638 (do not edit this line) */
