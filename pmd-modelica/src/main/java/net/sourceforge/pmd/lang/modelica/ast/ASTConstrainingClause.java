/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTConstrainingClause extends AbstractModelicaNode {
    public ASTConstrainingClause(int id) {
        super(id);
    }

    public ASTConstrainingClause(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=c48dadcc5cc61ca2e6772694df3b4a9f (do not edit this line) */
