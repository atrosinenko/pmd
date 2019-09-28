/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTLanguageSpecification extends AbstractModelicaNode {
    public ASTLanguageSpecification(int id) {
        super(id);
    }

    public ASTLanguageSpecification(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=15c35389cbea5df8d3be64985f3b31c7 (do not edit this line) */
