/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ASTImportClause extends AbstractModelicaNode {
    public ASTImportClause(int id) {
        super(id);
    }

    public ASTImportClause(ModelicaParser p, int id) {
        super(p, id);
    }


    @Override
    public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=0ba774486203aba93f4244f1b3d9faa4 (do not edit this line) */
