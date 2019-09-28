/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTForIndices extends AbstractModelicaNode {
    public ASTForIndices(int id) {
        super(id);
    }

    public ASTForIndices(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=37df52373f55f8b7ebff02687bfe4c06 (do not edit this line) */
