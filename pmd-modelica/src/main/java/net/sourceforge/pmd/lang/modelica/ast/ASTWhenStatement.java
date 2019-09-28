/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTWhenStatement extends AbstractModelicaNode {
    public ASTWhenStatement(int id) {
        super(id);
    }

    public ASTWhenStatement(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=d8e6dd8c82334ebcc76d3fbe5a72c9fa (do not edit this line) */
