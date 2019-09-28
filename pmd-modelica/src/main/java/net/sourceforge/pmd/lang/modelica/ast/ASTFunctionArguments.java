/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTFunctionArguments extends AbstractModelicaNode {
    public ASTFunctionArguments(int id) {
        super(id);
    }

    public ASTFunctionArguments(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=be07efd3a87b948d4685a3ea310d64ed (do not edit this line) */
