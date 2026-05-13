package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivSliderTemplate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSliderJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class u3 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f59021a;

    public u3(@NotNull JsonParserComponent jsonParserComponent) {
        this.f59021a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivSliderTemplate.RangeTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivSliderTemplate.RangeTemplate rangeTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Field<Expression<Long>> field = rangeTemplate != null ? rangeTemplate.f57117a : null;
        sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
        return new DivSliderTemplate.RangeTemplate(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "end", typeHelper, allowPropertyOverride, field, lVar), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f57118b : null, this.f59021a.Z2()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start", typeHelper, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f57119c : null, lVar), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "track_active_style", allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f57120d : null, this.f59021a.W2()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "track_inactive_style", allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f57121e : null, this.f59021a.W2()));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivSliderTemplate.RangeTemplate rangeTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "end", rangeTemplate.f57117a);
        JsonFieldParser.writeField(parsingContext, jSONObject, "margins", rangeTemplate.f57118b, this.f59021a.Z2());
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start", rangeTemplate.f57119c);
        JsonFieldParser.writeField(parsingContext, jSONObject, "track_active_style", rangeTemplate.f57120d, this.f59021a.W2());
        JsonFieldParser.writeField(parsingContext, jSONObject, "track_inactive_style", rangeTemplate.f57121e, this.f59021a.W2());
        return jSONObject;
    }
}
