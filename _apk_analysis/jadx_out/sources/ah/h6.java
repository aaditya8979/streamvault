package ah;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivLayoutProviderTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivLayoutProviderJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class h6 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3804a;

    public h6(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3804a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivLayoutProviderTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivLayoutProviderTemplate divLayoutProviderTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivLayoutProviderTemplate(JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height_variable_name", allowPropertyOverride, divLayoutProviderTemplate != null ? divLayoutProviderTemplate.f56177a : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width_variable_name", allowPropertyOverride, divLayoutProviderTemplate != null ? divLayoutProviderTemplate.f56178b : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivLayoutProviderTemplate divLayoutProviderTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "height_variable_name", divLayoutProviderTemplate.f56177a);
        JsonFieldParser.writeField(parsingContext, jSONObject, "width_variable_name", divLayoutProviderTemplate.f56178b);
        return jSONObject;
    }
}
