/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

import net.sourceforge.pmd.lang.ast.AbstractNode;
import net.sourceforge.pmd.lang.ast.Node;

public abstract class AbstractModelicaNode extends AbstractNode implements Node {
    protected ModelicaParser parser;

    public AbstractModelicaNode(int id) {
        super(id);
    }

    public AbstractModelicaNode(ModelicaParser parser, int id) {
        super(id);
        this.parser = parser;
    }

    public abstract Object jjtAccept(ModelicaParserVisitor visitor, Object data);

    public Object childrenAccept(final ModelicaParserVisitor visitor, final Object data) {
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                ((AbstractModelicaNode) children[i]).jjtAccept(visitor, data);
            }
        }
        return data;
    }
}
