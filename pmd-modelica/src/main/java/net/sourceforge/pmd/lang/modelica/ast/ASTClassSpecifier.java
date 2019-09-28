/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTClassSpecifier extends AbstractModelicaNode {
    public ASTClassSpecifier(int id) {
        super(id);
    }

    public ASTClassSpecifier(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=3bb10a7de45e216392d6d264a53f0dc0 (do not edit this line) */
