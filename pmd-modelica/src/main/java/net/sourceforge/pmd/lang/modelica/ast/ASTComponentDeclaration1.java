/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTComponentDeclaration1 extends AbstractModelicaNode {
    public ASTComponentDeclaration1(int id) {
        super(id);
    }

    public ASTComponentDeclaration1(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=3145b171b1e54726d8de30a669f1e46a (do not edit this line) */
