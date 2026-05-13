package ah;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivActionDictSetValue;
import com.yandex.div2.DivTypedValue;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionDictSetValueJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class c1 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3778a;

    public c1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3778a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionDictSetValue deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new DivActionDictSetValue(JsonExpressionParser.readExpression(parsingContext, jSONObject, "key", typeHelper), (DivTypedValue) JsonPropertyParser.readOptional(parsingContext, jSONObject, "value", this.f3778a.h9()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "variable_name", typeHelper));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivActionDictSetValue divActionDictSetValue) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "key", divActionDictSetValue.f54284a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "dict_set_value");
        JsonPropertyParser.write(parsingContext, jSONObject, "value", divActionDictSetValue.f54285b, this.f3778a.h9());
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "variable_name", divActionDictSetValue.f54286c);
        return jSONObject;
    }
}
