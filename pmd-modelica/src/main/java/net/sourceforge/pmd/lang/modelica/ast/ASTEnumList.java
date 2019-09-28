/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTEnumList extends AbstractModelicaNode {
    public ASTEnumList(int id) {
        super(id);
    }

    public ASTEnumList(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=d047634b61cc6eebcea744f40489deb4 (do not edit this line) */
