/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTShortClassSpecifier extends AbstractModelicaNode {
    public ASTShortClassSpecifier(int id) {
        super(id);
    }

    public ASTShortClassSpecifier(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=c0793fcbabccd57b033e6121e0b3b044 (do not edit this line) */
