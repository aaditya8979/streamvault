package ah;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivNeighbourPageSizeTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivNeighbourPageSizeJsonParser.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class p6 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3857a;

    public p6(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3857a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivNeighbourPageSizeTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivNeighbourPageSizeTemplate divNeighbourPageSizeTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivNeighbourPageSizeTemplate(JsonFieldParser.readField(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "neighbour_page_width", parsingContext.getAllowPropertyOverride(), divNeighbourPageSizeTemplate != null ? divNeighbourPageSizeTemplate.f56219a : null, this.f3857a.x3()));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivNeighbourPageSizeTemplate divNeighbourPageSizeTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "neighbour_page_width", divNeighbourPageSizeTemplate.f56219a, this.f3857a.x3());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "fixed");
        return jSONObject;
    }
}
