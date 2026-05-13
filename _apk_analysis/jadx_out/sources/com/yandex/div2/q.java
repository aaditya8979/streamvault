package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionSubmit;
import com.yandex.div2.DivActionSubmitTemplate;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionSubmitJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class q implements TemplateResolver<JSONObject, DivActionSubmitTemplate.RequestTemplate.HeaderTemplate, DivActionSubmit.Request.Header> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58968a;

    public q(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58968a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionSubmit.Request.Header resolve(@NotNull ParsingContext parsingContext, @NotNull DivActionSubmitTemplate.RequestTemplate.HeaderTemplate headerTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        Field<Expression<String>> field = headerTemplate.f54463a;
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new DivActionSubmit.Request.Header(JsonFieldResolver.resolveExpression(parsingContext, field, jSONObject, "name", typeHelper), JsonFieldResolver.resolveExpression(parsingContext, headerTemplate.f54464b, jSONObject, "value", typeHelper));
    }
}
