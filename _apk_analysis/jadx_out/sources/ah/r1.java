package ah;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivActionSetVariable;
import com.yandex.div2.DivTypedValue;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionSetVariableJsonParser.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class r1 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3869a;

    public r1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3869a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionSetVariable deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivActionSetVariable((DivTypedValue) JsonPropertyParser.read(parsingContext, jSONObject, "value", this.f3869a.h9()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivActionSetVariable divActionSetVariable) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "set_variable");
        JsonPropertyParser.write(parsingContext, jSONObject, "value", divActionSetVariable.f54407a, this.f3869a.h9());
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "variable_name", divActionSetVariable.f54408b);
        return jSONObject;
    }
}
