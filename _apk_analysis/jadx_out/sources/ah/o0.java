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
import com.yandex.div2.DivActionArrayInsertValueTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionArrayInsertValueJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class o0 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3846a;

    public o0(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3846a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionArrayInsertValueTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivActionArrayInsertValueTemplate divActionArrayInsertValueTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivActionArrayInsertValueTemplate(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "index", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, divActionArrayInsertValueTemplate != null ? divActionArrayInsertValueTemplate.f54238a : null, ParsingConvertersKt.NUMBER_TO_INT), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "value", allowPropertyOverride, divActionArrayInsertValueTemplate != null ? divActionArrayInsertValueTemplate.f54239b : null, this.f3846a.i9()), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divActionArrayInsertValueTemplate != null ? divActionArrayInsertValueTemplate.f54240c : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivActionArrayInsertValueTemplate divActionArrayInsertValueTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "index", divActionArrayInsertValueTemplate.f54238a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "array_insert_value");
        JsonFieldParser.writeField(parsingContext, jSONObject, "value", divActionArrayInsertValueTemplate.f54239b, this.f3846a.i9());
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "variable_name", divActionArrayInsertValueTemplate.f54240c);
        return jSONObject;
    }
}
