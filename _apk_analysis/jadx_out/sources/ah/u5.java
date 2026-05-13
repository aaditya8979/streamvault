package ah;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivInputFilterRegexTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputFilterRegexJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class u5 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3895a;

    public u5(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3895a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivInputFilterRegexTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivInputFilterRegexTemplate divInputFilterRegexTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivInputFilterRegexTemplate(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "pattern", TypeHelpersKt.TYPE_HELPER_STRING, parsingContext.getAllowPropertyOverride(), divInputFilterRegexTemplate != null ? divInputFilterRegexTemplate.f56019a : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivInputFilterRegexTemplate divInputFilterRegexTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "pattern", divInputFilterRegexTemplate.f56019a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "regex");
        return jSONObject;
    }
}
