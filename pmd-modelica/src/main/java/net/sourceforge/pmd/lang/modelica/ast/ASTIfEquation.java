/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTIfEquation extends AbstractModelicaNode {
    public ASTIfEquation(int id) {
        super(id);
    }

    public ASTIfEquation(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=1e7c613fdc08cc0d763ff84b6d3679ad (do not edit this line) */
