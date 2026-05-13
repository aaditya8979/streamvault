package ah;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivLayoutProvider;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivLayoutProviderJsonParser.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class g6 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3798a;

    public g6(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3798a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivLayoutProvider deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivLayoutProvider((String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height_variable_name"), (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width_variable_name"));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivLayoutProvider divLayoutProvider) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "height_variable_name", divLayoutProvider.f56172a);
        JsonPropertyParser.write(parsingContext, jSONObject, "width_variable_name", divLayoutProvider.f56173b);
        return jSONObject;
    }
}
