/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTLogicalTerm extends AbstractModelicaNode {
    public ASTLogicalTerm(int id) {
        super(id);
    }

    public ASTLogicalTerm(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=fc97f693371847a5daa55dadbfd00855 (do not edit this line) */
