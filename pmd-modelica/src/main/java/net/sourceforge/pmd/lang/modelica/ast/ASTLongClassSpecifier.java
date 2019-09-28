/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTLongClassSpecifier extends AbstractModelicaNode {
    public ASTLongClassSpecifier(int id) {
        super(id);
    }

    public ASTLongClassSpecifier(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=4a8c596a4ecd07a4bb650d1806171e3e (do not edit this line) */
