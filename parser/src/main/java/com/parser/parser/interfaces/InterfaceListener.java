package com.parser.parser.interfaces;

import com.parser.domain.InterfaceEntity;
import com.parser.grammar.JavaLanguageGrammarBaseListener;
import com.parser.grammar.JavaLanguageGrammarParser;
import com.parser.helpers.MyFilter;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.LinkedList;
import java.util.List;

public class InterfaceListener  extends JavaLanguageGrammarBaseListener {
    private InterfaceEntity entity = new InterfaceEntity();
    private final MyFilter filter = new MyFilter();
    private List<ParserRuleContext> bodyDeclarations = new LinkedList<>();


    @Override
    public void enterClassOrInterfaceModifier(JavaLanguageGrammarParser.ClassOrInterfaceModifierContext ctx) {
        if (entity.getName() == null)
            entity.addModifier(ctx.getText());
        super.enterClassOrInterfaceModifier(ctx);
    }

    @Override
    public void enterInterfaceDeclaration(JavaLanguageGrammarParser.InterfaceDeclarationContext ctx) {
        entity.setName(ctx.IDENTIFIER().getText());
        ctx.typeList().children.stream().filter(x -> filter.isLiteral(x.getText())).forEach(x -> entity.addImplementing(x.getText()));
        super.enterInterfaceDeclaration(ctx);
    }

    @Override
    public void enterInterfaceBody(JavaLanguageGrammarParser.InterfaceBodyContext ctx) {
        bodyDeclarations.addAll(ctx.interfaceBodyDeclaration());
        super.enterInterfaceBody(ctx);
    }

    public List<ParserRuleContext> getInterfaceBody() {
        return bodyDeclarations;
    }


    public InterfaceEntity getEntity(){
        if (entity.isComplete()){
            return entity;
        } else {
            return null;
        }
    }
}
