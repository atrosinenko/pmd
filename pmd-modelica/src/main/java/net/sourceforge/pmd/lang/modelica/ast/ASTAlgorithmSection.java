/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTAlgorithmSection extends AbstractModelicaNode {
    public ASTAlgorithmSection(int id) {
        super(id);
    }

    public ASTAlgorithmSection(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=518d25d190763ce599dad019514fe5a8 (do not edit this line) */
