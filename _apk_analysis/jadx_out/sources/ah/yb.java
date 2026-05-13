package ah;

import android.net.Uri;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivVideoSourceTemplate;
import com.yandex.div2.JsonParserComponent;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivVideoSourceJsonParser.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class yb implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3924a;

    public yb(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3924a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivVideoSourceTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivVideoSourceTemplate divVideoSourceTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        yb ybVar;
        Field<DivVideoSourceTemplate.ResolutionTemplate> field;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, VastAttributes.BITRATE, TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, divVideoSourceTemplate != null ? divVideoSourceTemplate.f58192a : null, ParsingConvertersKt.NUMBER_TO_INT);
        Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "mime_type", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divVideoSourceTemplate != null ? divVideoSourceTemplate.f58193b : null);
        if (divVideoSourceTemplate != null) {
            ybVar = this;
            field = divVideoSourceTemplate.f58194c;
        } else {
            ybVar = this;
            field = null;
        }
        return new DivVideoSourceTemplate((Field<Expression<Long>>) optionalFieldWithExpression, (Field<Expression<String>>) fieldWithExpression, (Field<DivVideoSourceTemplate.ResolutionTemplate>) JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "resolution", allowPropertyOverride, field, ybVar.f3924a.u9()), (Field<Expression<Uri>>) JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, divVideoSourceTemplate != null ? divVideoSourceTemplate.f58195d : null, ParsingConvertersKt.ANY_TO_URI));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivVideoSourceTemplate divVideoSourceTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, VastAttributes.BITRATE, divVideoSourceTemplate.f58192a);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "mime_type", divVideoSourceTemplate.f58193b);
        JsonFieldParser.writeField(parsingContext, jSONObject, "resolution", divVideoSourceTemplate.f58194c, this.f3924a.u9());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "video_source");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "url", divVideoSourceTemplate.f58195d, ParsingConvertersKt.URI_TO_STRING);
        return jSONObject;
    }
}
