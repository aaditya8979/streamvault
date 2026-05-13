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
import com.yandex.div2.DivWrapContentSizeTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivWrapContentSizeJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class fc implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3793a;

    public fc(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3793a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivWrapContentSizeTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivWrapContentSizeTemplate divWrapContentSizeTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivWrapContentSizeTemplate(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "constrained", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divWrapContentSizeTemplate != null ? divWrapContentSizeTemplate.f58276a : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "max_size", allowPropertyOverride, divWrapContentSizeTemplate != null ? divWrapContentSizeTemplate.f58277b : null, this.f3793a.c7()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "min_size", allowPropertyOverride, divWrapContentSizeTemplate != null ? divWrapContentSizeTemplate.f58278c : null, this.f3793a.c7()));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivWrapContentSizeTemplate divWrapContentSizeTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "constrained", divWrapContentSizeTemplate.f58276a);
        JsonFieldParser.writeField(parsingContext, jSONObject, "max_size", divWrapContentSizeTemplate.f58277b, this.f3793a.c7());
        JsonFieldParser.writeField(parsingContext, jSONObject, "min_size", divWrapContentSizeTemplate.f58278c, this.f3793a.c7());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "wrap_content");
        return jSONObject;
    }
}
