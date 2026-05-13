package com.yandex.div2;

import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivFocusTemplate;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFocusJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class n1 implements TemplateResolver<JSONObject, DivFocusTemplate.NextFocusIdsTemplate, DivFocus.NextFocusIds> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58925a;

    public n1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58925a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivFocus.NextFocusIds resolve(@NotNull ParsingContext parsingContext, @NotNull DivFocusTemplate.NextFocusIdsTemplate nextFocusIdsTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        Field<Expression<String>> field = nextFocusIdsTemplate.f55372a;
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new DivFocus.NextFocusIds(JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "down", typeHelper), JsonFieldResolver.resolveOptionalExpression(parsingContext, nextFocusIdsTemplate.f55373b, jSONObject, ToolBar.FORWARD, typeHelper), JsonFieldResolver.resolveOptionalExpression(parsingContext, nextFocusIdsTemplate.f55374c, jSONObject, "left", typeHelper), JsonFieldResolver.resolveOptionalExpression(parsingContext, nextFocusIdsTemplate.f55375d, jSONObject, "right", typeHelper), JsonFieldResolver.resolveOptionalExpression(parsingContext, nextFocusIdsTemplate.f55376e, jSONObject, "up", typeHelper));
    }
}
