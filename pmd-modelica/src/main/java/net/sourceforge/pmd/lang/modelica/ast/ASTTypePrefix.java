/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTTypePrefix extends AbstractModelicaNode {
    public ASTTypePrefix(int id) {
        super(id);
    }

    public ASTTypePrefix(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=524856cf500184adabd0f9e6859baa12 (do not edit this line) */
