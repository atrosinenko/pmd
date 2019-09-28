/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTImportList extends AbstractModelicaNode {
    public ASTImportList(int id) {
        super(id);
    }

    public ASTImportList(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=792129adc2f279ed39a98c89b6384f66 (do not edit this line) */
