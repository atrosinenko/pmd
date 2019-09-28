/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.rule;

import java.util.List;

import net.sourceforge.pmd.Rule;
import net.sourceforge.pmd.RuleContext;
import net.sourceforge.pmd.lang.ast.Node;
import net.sourceforge.pmd.lang.modelica.ast.ASTStoredDefinition;
import net.sourceforge.pmd.lang.modelica.ast.AbstractModelicaNode;
import net.sourceforge.pmd.lang.modelica.ast.ModelicaParserVisitor;
import net.sourceforge.pmd.lang.modelica.ast.ModelicaParserVisitorAdapter;
import net.sourceforge.pmd.lang.rule.AbstractRuleChainVisitor;
import net.sourceforge.pmd.lang.rule.XPathRule;


public class ModelicaRuleChainVisitor extends AbstractRuleChainVisitor {
    @Override
    protected void visit(Rule rule, Node node, RuleContext ctx) {
        if (rule instanceof ModelicaParserVisitor) {
            ((AbstractModelicaNode) node).jjtAccept((ModelicaParserVisitor) rule, ctx);
        } else {
            ((XPathRule) rule).evaluate(node, ctx);
        }
    }

    @Override
    protected void indexNodes(List<Node> nodes, RuleContext ctx) {
        ModelicaParserVisitorAdapter modelicaParserVisitor = new ModelicaParserVisitorAdapter() {
            @Override
            public Object visit(AbstractModelicaNode node, Object data) {
                indexNode(node);
                return super.visit(node, data);
            }
        };
        for (int i = 0; i < nodes.size(); ++i) {
            modelicaParserVisitor.visit((ASTStoredDefinition) nodes.get(i), ctx);
        }
    }
}
