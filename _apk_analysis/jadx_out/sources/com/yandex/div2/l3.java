package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivSelect;
import com.yandex.div2.DivSelectTemplate;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSelectJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class l3 implements TemplateResolver<JSONObject, DivSelectTemplate.OptionTemplate, DivSelect.Option> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58878a;

    public l3(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58878a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivSelect.Option resolve(@NotNull ParsingContext parsingContext, @NotNull DivSelectTemplate.OptionTemplate optionTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        Field<Expression<String>> field = optionTemplate.f56815a;
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new DivSelect.Option(JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "text", typeHelper), JsonFieldResolver.resolveExpression(parsingContext, optionTemplate.f56816b, jSONObject, "value", typeHelper));
    }
}
