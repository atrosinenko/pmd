/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTEquationSection extends AbstractModelicaNode {
    public ASTEquationSection(int id) {
        super(id);
    }

    public ASTEquationSection(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=471c802f9a14e9e6f42bf48ab44ca58c (do not edit this line) */
