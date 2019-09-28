/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTLogicalFactor extends AbstractModelicaNode {
    public ASTLogicalFactor(int id) {
        super(id);
    }

    public ASTLogicalFactor(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=e8baa53f4ca80c10f8e1a294a83ecccb (do not edit this line) */
