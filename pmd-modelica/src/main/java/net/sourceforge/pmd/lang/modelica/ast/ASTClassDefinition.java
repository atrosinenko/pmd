/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTClassDefinition extends AbstractModelicaNode {
    public ASTClassDefinition(int id) {
        super(id);
    }

    public ASTClassDefinition(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=166008493a3f8784933fb051af5414f7 (do not edit this line) */
