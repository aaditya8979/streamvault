package ah;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivDownloadCallbacks;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivDownloadCallbacksJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class j3 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3815a;

    public j3(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3815a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivDownloadCallbacks deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivDownloadCallbacks(JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_fail_actions", this.f3815a.u0()), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_success_actions", this.f3815a.u0()));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivDownloadCallbacks divDownloadCallbacks) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_fail_actions", divDownloadCallbacks.f55178a, this.f3815a.u0());
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_success_actions", divDownloadCallbacks.f55179b, this.f3815a.u0());
        return jSONObject;
    }
}
