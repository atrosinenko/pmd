/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTElementReplaceable extends AbstractModelicaNode {
    public ASTElementReplaceable(int id) {
        super(id);
    }

    public ASTElementReplaceable(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=a53d8f25a7ee6a638cf454ffe9ee2dcc (do not edit this line) */
