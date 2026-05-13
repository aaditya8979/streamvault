package ah;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivPhoneInputMaskTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPhoneInputMaskJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class s7 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3881a;

    public s7(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3881a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPhoneInputMaskTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivPhoneInputMaskTemplate divPhoneInputMaskTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivPhoneInputMaskTemplate(JsonFieldParser.readField(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "raw_text_variable", parsingContext.getAllowPropertyOverride(), divPhoneInputMaskTemplate != null ? divPhoneInputMaskTemplate.f56527a : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivPhoneInputMaskTemplate divPhoneInputMaskTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "raw_text_variable", divPhoneInputMaskTemplate.f56527a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "phone");
        return jSONObject;
    }
}
