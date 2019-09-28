/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.modelica.ast;

public class ModelicaParserVisitorAdapter implements ModelicaParserVisitor {
    @Override
    public Object visit(AbstractModelicaNode node, Object data) {
        return node.childrenAccept(this, data);
    }

    @Override
    public Object visit(ASTStoredDefinition node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTClassDefinition node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTClassSpecifier node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTClassPrefixes node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTLongClassSpecifier node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTShortClassSpecifier node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTDerClassSpecifier node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTBasePrefix node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTEnumList node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTEnumerationLiteral node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTComposition node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTLanguageSpecification node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTExternalFunctionCall node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTElementList node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTElement node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTImportClause node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTImportList node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTExtendsClause node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTConstrainingClause node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTComponentClause node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTTypePrefix node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTTypeSpecifier node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTComponentList node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTComponentDeclaration node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTConditionAttribute node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTDeclaration node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTModification node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTClassModification node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTArgumentList node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTArgument node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTElementModificationOrReplaceable node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTElementModification node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTElementRedeclaration node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTElementReplaceable node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTComponentClause1 node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTComponentDeclaration1 node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTShortClassDefinition node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTEquationSection node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTAlgorithmSection node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTEquation node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTStatement node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTIfEquation node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTIfStatement node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTForEquation node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTForStatement node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTForIndices node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTForIndex node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTWhileStatement node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTWhenEquation node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTWhenStatement node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTConnectClause node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTExpression node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTSimpleExpression node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTLogicalExpression node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTLogicalTerm node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTLogicalFactor node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTRelation node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTRelOp node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTArithmeticExpression node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTAddOp node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTTerm node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTMulOp node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTFactor node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTPrimary node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTName node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTComponentReference node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTFunctionCallArgs node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTFunctionArguments node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTNamedArguments node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTNamedArgument node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTFunctionArgument node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTOutputExpressionList node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTExpressionList node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTArraySubscripts node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTSubscript node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTComment node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTStringComment node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }

    @Override
    public Object visit(ASTAnnotation node, Object data) {
        return visit((AbstractModelicaNode) node, data);
    }
}
