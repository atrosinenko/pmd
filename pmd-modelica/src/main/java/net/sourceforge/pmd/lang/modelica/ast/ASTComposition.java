/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTComposition extends AbstractModelicaNode {
    public ASTComposition(int id) {
        super(id);
    }

    public ASTComposition(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=eeeb1ba0b1faa5c1ec04fd46463f7b63 (do not edit this line) */
