/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTNamedArgument extends AbstractModelicaNode {
    public ASTNamedArgument(int id) {
        super(id);
    }

    public ASTNamedArgument(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=7052f59d2f092e6b105dbb309315f4cd (do not edit this line) */
