/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTExternalFunctionCall extends AbstractModelicaNode {
    public ASTExternalFunctionCall(int id) {
        super(id);
    }

    public ASTExternalFunctionCall(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=a6103217413501c2e97f9acb700420e9 (do not edit this line) */
