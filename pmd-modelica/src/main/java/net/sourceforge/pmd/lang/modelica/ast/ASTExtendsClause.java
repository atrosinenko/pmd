/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTExtendsClause extends AbstractModelicaNode {
    public ASTExtendsClause(int id) {
        super(id);
    }

    public ASTExtendsClause(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=fde0b92879441f4c4169876101e0a124 (do not edit this line) */
