/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTTerm extends AbstractModelicaNode {
    public ASTTerm(int id) {
        super(id);
    }

    public ASTTerm(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=0f49aea0dd4864077754f22226afaff9 (do not edit this line) */
