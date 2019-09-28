/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTConditionAttribute extends AbstractModelicaNode {
    public ASTConditionAttribute(int id) {
        super(id);
    }

    public ASTConditionAttribute(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=07c0ce3bd350e5319b7acd59ee861ad3 (do not edit this line) */
