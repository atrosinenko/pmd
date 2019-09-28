/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTSimpleExpression extends AbstractModelicaNode {
    public ASTSimpleExpression(int id) {
        super(id);
    }

    public ASTSimpleExpression(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=cf835f6a15d129c2c81c18f86304c2b6 (do not edit this line) */
