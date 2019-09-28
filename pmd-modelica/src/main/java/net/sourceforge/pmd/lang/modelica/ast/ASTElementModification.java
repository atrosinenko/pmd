/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTElementModification extends AbstractModelicaNode {
    public ASTElementModification(int id) {
        super(id);
    }

    public ASTElementModification(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=33357cd562f86e4b86929fe901672fa9 (do not edit this line) */
