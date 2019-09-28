/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTFunctionCallArgs extends AbstractModelicaNode {
    public ASTFunctionCallArgs(int id) {
        super(id);
    }

    public ASTFunctionCallArgs(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=6a4f943f17187af525b1d192ff9eff54 (do not edit this line) */
