/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTBasePrefix extends AbstractModelicaNode {
    public ASTBasePrefix(int id) {
        super(id);
    }

    public ASTBasePrefix(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=655f06224abce6c434ead8a4bc675b66 (do not edit this line) */
