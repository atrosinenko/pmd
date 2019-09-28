/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTNamedArguments extends AbstractModelicaNode {
    public ASTNamedArguments(int id) {
        super(id);
    }

    public ASTNamedArguments(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=b7927ceedfb5a6b90103757242057385 (do not edit this line) */
