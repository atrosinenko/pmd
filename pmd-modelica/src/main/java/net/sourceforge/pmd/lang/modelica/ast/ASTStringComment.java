/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTStringComment extends AbstractModelicaNode {
    public ASTStringComment(int id) {
        super(id);
    }

    public ASTStringComment(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=fe7a0baabdf986115e96ee230f34f886 (do not edit this line) */
