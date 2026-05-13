package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivSlider;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSliderJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class t3 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f59011a;

    public t3(@NotNull JsonParserComponent jsonParserComponent) {
        this.f59011a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivSlider.Range deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
        return new DivSlider.Range(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "end", typeHelper, lVar), (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f59011a.Y2()), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start", typeHelper, lVar), (DivDrawable) JsonPropertyParser.readOptional(parsingContext, jSONObject, "track_active_style", this.f59011a.V2()), (DivDrawable) JsonPropertyParser.readOptional(parsingContext, jSONObject, "track_inactive_style", this.f59011a.V2()));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivSlider.Range range) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "end", range.f57045a);
        JsonPropertyParser.write(parsingContext, jSONObject, "margins", range.f57046b, this.f59011a.Y2());
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start", range.f57047c);
        JsonPropertyParser.write(parsingContext, jSONObject, "track_active_style", range.f57048d, this.f59011a.V2());
        JsonPropertyParser.write(parsingContext, jSONObject, "track_inactive_style", range.f57049e, this.f59011a.V2());
        return jSONObject;
    }
}
