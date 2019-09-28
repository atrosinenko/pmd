/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTTypeSpecifier extends AbstractModelicaNode {
    public ASTTypeSpecifier(int id) {
        super(id);
    }

    public ASTTypeSpecifier(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=265736f55a8b05d0c3a51ecc321b68d0 (do not edit this line) */
