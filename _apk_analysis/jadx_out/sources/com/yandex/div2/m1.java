package com.yandex.div2;

import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivFocusTemplate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFocusJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class m1 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58892a;

    public m1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58892a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivFocusTemplate.NextFocusIdsTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivFocusTemplate.NextFocusIdsTemplate nextFocusIdsTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new DivFocusTemplate.NextFocusIdsTemplate(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "down", typeHelper, allowPropertyOverride, nextFocusIdsTemplate != null ? nextFocusIdsTemplate.f55372a : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, ToolBar.FORWARD, typeHelper, allowPropertyOverride, nextFocusIdsTemplate != null ? nextFocusIdsTemplate.f55373b : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "left", typeHelper, allowPropertyOverride, nextFocusIdsTemplate != null ? nextFocusIdsTemplate.f55374c : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "right", typeHelper, allowPropertyOverride, nextFocusIdsTemplate != null ? nextFocusIdsTemplate.f55375d : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "up", typeHelper, allowPropertyOverride, nextFocusIdsTemplate != null ? nextFocusIdsTemplate.f55376e : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivFocusTemplate.NextFocusIdsTemplate nextFocusIdsTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "down", nextFocusIdsTemplate.f55372a);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, ToolBar.FORWARD, nextFocusIdsTemplate.f55373b);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "left", nextFocusIdsTemplate.f55374c);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "right", nextFocusIdsTemplate.f55375d);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "up", nextFocusIdsTemplate.f55376e);
        return jSONObject;
    }
}
