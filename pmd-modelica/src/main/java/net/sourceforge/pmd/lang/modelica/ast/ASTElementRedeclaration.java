/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTElementRedeclaration extends AbstractModelicaNode {
    public ASTElementRedeclaration(int id) {
        super(id);
    }

    public ASTElementRedeclaration(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=17b721c1405e9e99632fd5f77f567122 (do not edit this line) */
