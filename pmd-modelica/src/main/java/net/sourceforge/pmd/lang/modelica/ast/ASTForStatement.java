/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTForStatement extends AbstractModelicaNode {
    public ASTForStatement(int id) {
        super(id);
    }

    public ASTForStatement(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=7f8a180cca73c4b22f6e966dc30496d9 (do not edit this line) */
