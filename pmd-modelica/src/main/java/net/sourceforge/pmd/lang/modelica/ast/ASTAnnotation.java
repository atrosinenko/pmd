/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTAnnotation extends AbstractModelicaNode {
    public ASTAnnotation(int id) {
        super(id);
    }

    public ASTAnnotation(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=59cb3aa8fd99c6d7f5edad4830ff11b6 (do not edit this line) */
