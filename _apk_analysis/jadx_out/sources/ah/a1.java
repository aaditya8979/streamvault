package ah;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivActionCopyToClipboardTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionCopyToClipboardJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class a1 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3762a;

    public a1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3762a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionCopyToClipboardTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivActionCopyToClipboardTemplate divActionCopyToClipboardTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivActionCopyToClipboardTemplate(JsonFieldParser.readField(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "content", parsingContext.getAllowPropertyOverride(), divActionCopyToClipboardTemplate != null ? divActionCopyToClipboardTemplate.f54281a : null, this.f3762a.d0()));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivActionCopyToClipboardTemplate divActionCopyToClipboardTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "content", divActionCopyToClipboardTemplate.f54281a, this.f3762a.d0());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "copy_to_clipboard");
        return jSONObject;
    }
}
