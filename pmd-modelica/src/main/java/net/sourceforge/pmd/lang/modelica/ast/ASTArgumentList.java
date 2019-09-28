/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTArgumentList extends AbstractModelicaNode {
    public ASTArgumentList(int id) {
        super(id);
    }

    public ASTArgumentList(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=d31bab670777cbea60975e9e0b4d9568 (do not edit this line) */
