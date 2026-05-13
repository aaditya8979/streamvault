package ah;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivPointTemplate;
import com.yandex.div2.JsonParserComponent;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPointJsonParser.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class y7 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3922a;

    public y7(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3922a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPointTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivPointTemplate divPointTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivPointTemplate(JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, VastAttributes.HORIZONTAL_POSITION, allowPropertyOverride, divPointTemplate != null ? divPointTemplate.f56568a : null, this.f3922a.N2()), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, VastAttributes.VERTICAL_POSITION, allowPropertyOverride, divPointTemplate != null ? divPointTemplate.f56569b : null, this.f3922a.N2()));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivPointTemplate divPointTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, VastAttributes.HORIZONTAL_POSITION, divPointTemplate.f56568a, this.f3922a.N2());
        JsonFieldParser.writeField(parsingContext, jSONObject, VastAttributes.VERTICAL_POSITION, divPointTemplate.f56569b, this.f3922a.N2());
        return jSONObject;
    }
}
