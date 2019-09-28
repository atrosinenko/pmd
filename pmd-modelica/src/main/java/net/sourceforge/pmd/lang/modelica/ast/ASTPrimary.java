/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTPrimary extends AbstractModelicaNode {
    public ASTPrimary(int id) {
        super(id);
    }

    public ASTPrimary(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=df45b8605e3aec5b579a0edfd5c64ff7 (do not edit this line) */
