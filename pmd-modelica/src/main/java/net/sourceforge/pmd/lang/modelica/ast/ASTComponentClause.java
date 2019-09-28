/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTComponentClause extends AbstractModelicaNode {
    public ASTComponentClause(int id) {
        super(id);
    }

    public ASTComponentClause(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=f93090e58d8aadc23fd18bdb7883b1ca (do not edit this line) */
