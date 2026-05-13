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
import com.yandex.div2.DivNinePatchBackgroundTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivNinePatchBackgroundJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class s6 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3880a;

    public s6(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3880a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivNinePatchBackgroundTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivNinePatchBackgroundTemplate divNinePatchBackgroundTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivNinePatchBackgroundTemplate(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, divNinePatchBackgroundTemplate != null ? divNinePatchBackgroundTemplate.f56227a : null, ParsingConvertersKt.ANY_TO_URI), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "insets", allowPropertyOverride, divNinePatchBackgroundTemplate != null ? divNinePatchBackgroundTemplate.f56228b : null, this.f3880a.F()));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivNinePatchBackgroundTemplate divNinePatchBackgroundTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "image_url", divNinePatchBackgroundTemplate.f56227a, ParsingConvertersKt.URI_TO_STRING);
        JsonFieldParser.writeField(parsingContext, jSONObject, "insets", divNinePatchBackgroundTemplate.f56228b, this.f3880a.F());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "nine_patch_image");
        return jSONObject;
    }
}
