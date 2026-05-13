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
import com.yandex.div2.DivRadialGradientRelativeCenterTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRadialGradientRelativeCenterJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class e8 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3787a;

    public e8(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3787a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivRadialGradientRelativeCenterTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivRadialGradientRelativeCenterTemplate divRadialGradientRelativeCenterTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivRadialGradientRelativeCenterTemplate(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, parsingContext.getAllowPropertyOverride(), divRadialGradientRelativeCenterTemplate != null ? divRadialGradientRelativeCenterTemplate.f56627a : null, ParsingConvertersKt.NUMBER_TO_DOUBLE));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivRadialGradientRelativeCenterTemplate divRadialGradientRelativeCenterTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "relative");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", divRadialGradientRelativeCenterTemplate.f56627a);
        return jSONObject;
    }
}
