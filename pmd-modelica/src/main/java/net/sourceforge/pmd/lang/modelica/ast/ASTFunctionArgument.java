/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTFunctionArgument extends AbstractModelicaNode {
    public ASTFunctionArgument(int id) {
        super(id);
    }

    public ASTFunctionArgument(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=03eba7a55277078cacd466756c9036c5 (do not edit this line) */
