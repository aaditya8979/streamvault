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
import com.yandex.div2.DivActionShowTooltipTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionShowTooltipJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class v1 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3900a;

    public v1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3900a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionShowTooltipTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivActionShowTooltipTemplate divActionShowTooltipTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivActionShowTooltipTemplate(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divActionShowTooltipTemplate != null ? divActionShowTooltipTemplate.f54421a : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "multiple", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divActionShowTooltipTemplate != null ? divActionShowTooltipTemplate.f54422b : null, ParsingConvertersKt.ANY_TO_BOOLEAN));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivActionShowTooltipTemplate divActionShowTooltipTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "id", divActionShowTooltipTemplate.f54421a);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "multiple", divActionShowTooltipTemplate.f54422b);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "show_tooltip");
        return jSONObject;
    }
}
