package ah;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivActionDictSetValueTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionDictSetValueJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class d1 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3782a;

    public d1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3782a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionDictSetValueTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivActionDictSetValueTemplate divActionDictSetValueTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new DivActionDictSetValueTemplate(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "key", typeHelper, allowPropertyOverride, divActionDictSetValueTemplate != null ? divActionDictSetValueTemplate.f54290a : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "value", allowPropertyOverride, divActionDictSetValueTemplate != null ? divActionDictSetValueTemplate.f54291b : null, this.f3782a.i9()), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "variable_name", typeHelper, allowPropertyOverride, divActionDictSetValueTemplate != null ? divActionDictSetValueTemplate.f54292c : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivActionDictSetValueTemplate divActionDictSetValueTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "key", divActionDictSetValueTemplate.f54290a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "dict_set_value");
        JsonFieldParser.writeField(parsingContext, jSONObject, "value", divActionDictSetValueTemplate.f54291b, this.f3782a.i9());
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "variable_name", divActionDictSetValueTemplate.f54292c);
        return jSONObject;
    }
}
