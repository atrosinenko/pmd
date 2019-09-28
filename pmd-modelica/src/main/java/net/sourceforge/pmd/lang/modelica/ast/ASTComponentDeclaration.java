/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTComponentDeclaration extends AbstractModelicaNode {
    public ASTComponentDeclaration(int id) {
        super(id);
    }

    public ASTComponentDeclaration(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=1885e314dd6a9d3e2f9b3382b713eeed (do not edit this line) */
