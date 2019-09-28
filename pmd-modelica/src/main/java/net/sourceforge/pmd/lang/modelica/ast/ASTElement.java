/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTElement extends AbstractModelicaNode {
    public ASTElement(int id) {
        super(id);
    }

    public ASTElement(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=ecfaefdd622528c1de00137c9dfe5b9c (do not edit this line) */
