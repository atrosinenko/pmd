/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTDerClassSpecifier extends AbstractModelicaNode {
    public ASTDerClassSpecifier(int id) {
        super(id);
    }

    public ASTDerClassSpecifier(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=91435de1098b3bca137a06194f9adef8 (do not edit this line) */
