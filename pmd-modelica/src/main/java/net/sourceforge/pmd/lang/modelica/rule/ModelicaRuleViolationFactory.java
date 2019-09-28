/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.rule;

import net.sourceforge.pmd.Rule;
import net.sourceforge.pmd.RuleContext;
import net.sourceforge.pmd.RuleViolation;
import net.sourceforge.pmd.lang.ast.Node;
import net.sourceforge.pmd.lang.modelica.ast.AbstractModelicaNode;
import net.sourceforge.pmd.lang.rule.AbstractRuleViolationFactory;
import net.sourceforge.pmd.lang.rule.ParametricRuleViolation;

public final class ModelicaRuleViolationFactory extends AbstractRuleViolationFactory {
    public static final ModelicaRuleViolationFactory INSTANCE = new ModelicaRuleViolationFactory();

    private ModelicaRuleViolationFactory() {
    }

    @Override
    protected RuleViolation createRuleViolation(Rule rule, RuleContext ruleContext, Node node, String message) {
        return new ParametricRuleViolation<>(rule, ruleContext, (AbstractModelicaNode) node, message);
    }

    @Override
    protected RuleViolation createRuleViolation(Rule rule, RuleContext ruleContext, Node node, String message, int beginLine, int endLine) {
        final ParametricRuleViolation<AbstractModelicaNode> violation = new ParametricRuleViolation<>(rule, ruleContext,
                (AbstractModelicaNode) node, message);
        violation.setLines(beginLine, endLine);
        return violation;
    }
}
