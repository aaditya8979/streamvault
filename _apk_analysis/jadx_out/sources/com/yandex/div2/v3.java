package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivSlider;
import com.yandex.div2.DivSliderTemplate;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSliderJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class v3 implements TemplateResolver<JSONObject, DivSliderTemplate.RangeTemplate, DivSlider.Range> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f59027a;

    public v3(@NotNull JsonParserComponent jsonParserComponent) {
        this.f59027a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivSlider.Range resolve(@NotNull ParsingContext parsingContext, @NotNull DivSliderTemplate.RangeTemplate rangeTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        Field<Expression<Long>> field = rangeTemplate.f57117a;
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
        return new DivSlider.Range(JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "end", typeHelper, lVar), (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, rangeTemplate.f57118b, jSONObject, "margins", this.f59027a.a3(), this.f59027a.Y2()), JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.f57119c, jSONObject, "start", typeHelper, lVar), (DivDrawable) JsonFieldResolver.resolveOptional(parsingContext, rangeTemplate.f57120d, jSONObject, "track_active_style", this.f59027a.X2(), this.f59027a.V2()), (DivDrawable) JsonFieldResolver.resolveOptional(parsingContext, rangeTemplate.f57121e, jSONObject, "track_inactive_style", this.f59027a.X2(), this.f59027a.V2()));
    }
}
