package ah;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivEvaluableType;
import com.yandex.div2.DivFunctionArgument;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFunctionArgumentJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class h4 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3803a;

    public h4(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3803a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivFunctionArgument deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivFunctionArgument((String) JsonPropertyParser.read(parsingContext, jSONObject, "name"), (DivEvaluableType) JsonPropertyParser.read(parsingContext, jSONObject, "type", DivEvaluableType.FROM_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivFunctionArgument divFunctionArgument) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "name", divFunctionArgument.f55387a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", divFunctionArgument.f55388b, (sn.l<DivEvaluableType, R>) DivEvaluableType.TO_STRING);
        return jSONObject;
    }
}
