/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTClassPrefixes extends AbstractModelicaNode {
    public ASTClassPrefixes(int id) {
        super(id);
    }

    public ASTClassPrefixes(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=44646765dff5c6c68ad62eb5c3ea7f7d (do not edit this line) */
