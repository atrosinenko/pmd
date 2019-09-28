/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTWhenEquation extends AbstractModelicaNode {
    public ASTWhenEquation(int id) {
        super(id);
    }

    public ASTWhenEquation(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=b86ab9eda471380ade53a8ce835ffc46 (do not edit this line) */
