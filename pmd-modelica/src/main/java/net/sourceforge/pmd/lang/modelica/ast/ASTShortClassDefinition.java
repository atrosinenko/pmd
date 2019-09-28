/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTShortClassDefinition extends AbstractModelicaNode {
    public ASTShortClassDefinition(int id) {
        super(id);
    }

    public ASTShortClassDefinition(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=916ad8227ab69d3137c333cefd397f43 (do not edit this line) */
