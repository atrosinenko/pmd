/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTEnumerationLiteral extends AbstractModelicaNode {
    public ASTEnumerationLiteral(int id) {
        super(id);
    }

    public ASTEnumerationLiteral(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=c44e3251277eceb584b89ebe896e14d5 (do not edit this line) */
