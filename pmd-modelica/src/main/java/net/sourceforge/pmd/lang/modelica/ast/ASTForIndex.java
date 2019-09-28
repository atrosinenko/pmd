/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTForIndex extends AbstractModelicaNode {
    public ASTForIndex(int id) {
        super(id);
    }

    public ASTForIndex(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=921a58cdc08ebd50e6dddc1c1c39b926 (do not edit this line) */
