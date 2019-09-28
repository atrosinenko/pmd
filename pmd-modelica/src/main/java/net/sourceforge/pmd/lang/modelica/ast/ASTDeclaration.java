/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTDeclaration extends AbstractModelicaNode {
    public ASTDeclaration(int id) {
        super(id);
    }

    public ASTDeclaration(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=2a81f2b2a390c706bab3194a2c3828bc (do not edit this line) */
