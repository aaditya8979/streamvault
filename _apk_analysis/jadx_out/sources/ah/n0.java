package ah;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivActionArrayInsertValue;
import com.yandex.div2.DivTypedValue;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionArrayInsertValueJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class n0 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3838a;

    public n0(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3838a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionArrayInsertValue deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivActionArrayInsertValue(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "index", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), (DivTypedValue) JsonPropertyParser.read(parsingContext, jSONObject, "value", this.f3838a.h9()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivActionArrayInsertValue divActionArrayInsertValue) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "index", divActionArrayInsertValue.f54232a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "array_insert_value");
        JsonPropertyParser.write(parsingContext, jSONObject, "value", divActionArrayInsertValue.f54233b, this.f3838a.h9());
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "variable_name", divActionArrayInsertValue.f54234c);
        return jSONObject;
    }
}
