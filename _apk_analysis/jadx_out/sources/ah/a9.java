package ah;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivShapeDrawableTemplate;
import com.yandex.div2.JsonParserComponent;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivShapeDrawableJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class a9 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3766a;

    public a9(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3766a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivShapeDrawableTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivShapeDrawableTemplate divShapeDrawableTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivShapeDrawableTemplate(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, divShapeDrawableTemplate != null ? divShapeDrawableTemplate.f56939a : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "shape", allowPropertyOverride, divShapeDrawableTemplate != null ? divShapeDrawableTemplate.f56940b : null, this.f3766a.W6()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, VastAttributes.STROKE_COLOR, allowPropertyOverride, divShapeDrawableTemplate != null ? divShapeDrawableTemplate.f56941c : null, this.f3766a.D7()));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivShapeDrawableTemplate divShapeDrawableTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", divShapeDrawableTemplate.f56939a, ParsingConvertersKt.COLOR_INT_TO_STRING);
        JsonFieldParser.writeField(parsingContext, jSONObject, "shape", divShapeDrawableTemplate.f56940b, this.f3766a.W6());
        JsonFieldParser.writeField(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, divShapeDrawableTemplate.f56941c, this.f3766a.D7());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "shape_drawable");
        return jSONObject;
    }
}
