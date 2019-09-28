/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTSubscript extends AbstractModelicaNode {
    public ASTSubscript(int id) {
        super(id);
    }

    public ASTSubscript(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=6508a9b36b32625b053de3b3a0911933 (do not edit this line) */
