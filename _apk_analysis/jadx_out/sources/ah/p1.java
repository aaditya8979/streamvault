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
import com.yandex.div2.DivActionSetStoredValueTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionSetStoredValueJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class p1 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3855a;

    public p1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3855a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionSetStoredValueTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivActionSetStoredValueTemplate divActionSetStoredValueTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivActionSetStoredValueTemplate(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "lifetime", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, divActionSetStoredValueTemplate != null ? divActionSetStoredValueTemplate.f54402a : null, ParsingConvertersKt.NUMBER_TO_INT), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "name", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divActionSetStoredValueTemplate != null ? divActionSetStoredValueTemplate.f54403b : null), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "value", allowPropertyOverride, divActionSetStoredValueTemplate != null ? divActionSetStoredValueTemplate.f54404c : null, this.f3855a.i9()));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivActionSetStoredValueTemplate divActionSetStoredValueTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "lifetime", divActionSetStoredValueTemplate.f54402a);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "name", divActionSetStoredValueTemplate.f54403b);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "set_stored_value");
        JsonFieldParser.writeField(parsingContext, jSONObject, "value", divActionSetStoredValueTemplate.f54404c, this.f3855a.i9());
        return jSONObject;
    }
}
