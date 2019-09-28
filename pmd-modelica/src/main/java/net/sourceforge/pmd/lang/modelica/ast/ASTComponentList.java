/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTComponentList extends AbstractModelicaNode {
    public ASTComponentList(int id) {
        super(id);
    }

    public ASTComponentList(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=c355e441357da3ce527dfaa590d8f1cc (do not edit this line) */
