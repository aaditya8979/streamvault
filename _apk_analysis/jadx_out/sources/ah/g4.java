package ah;

import androidx.compose.material.OutlinedTextFieldKt;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivFocusTemplate;
import com.yandex.div2.JsonParserComponent;
import io.appmetrica.analytics.impl.A2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFocusJsonParser.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class g4 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3797a;

    public g4(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3797a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivFocusTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivFocusTemplate divFocusTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivFocusTemplate(JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f64965g, allowPropertyOverride, divFocusTemplate != null ? divFocusTemplate.f55365a : null, this.f3797a.G1()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, divFocusTemplate != null ? divFocusTemplate.f55366b : null, this.f3797a.M1()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "next_focus_ids", allowPropertyOverride, divFocusTemplate != null ? divFocusTemplate.f55367c : null, this.f3797a.D3()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "on_blur", allowPropertyOverride, divFocusTemplate != null ? divFocusTemplate.f55368d : null, this.f3797a.v0()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "on_focus", allowPropertyOverride, divFocusTemplate != null ? divFocusTemplate.f55369e : null, this.f3797a.v0()));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivFocusTemplate divFocusTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeListField(parsingContext, jSONObject, A2.f64965g, divFocusTemplate.f55365a, this.f3797a.G1());
        JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, divFocusTemplate.f55366b, this.f3797a.M1());
        JsonFieldParser.writeField(parsingContext, jSONObject, "next_focus_ids", divFocusTemplate.f55367c, this.f3797a.D3());
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_blur", divFocusTemplate.f55368d, this.f3797a.v0());
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_focus", divFocusTemplate.f55369e, this.f3797a.v0());
        return jSONObject;
    }
}
