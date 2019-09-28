/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTStoredDefinition extends AbstractModelicaNode {
    public ASTStoredDefinition(int id) {
        super(id);
    }

    public ASTStoredDefinition(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=bc380cd9b4e60f9dcdcbc3e092f0832c (do not edit this line) */
