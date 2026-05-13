package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivAction;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58755a;

    public e(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58755a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivAction.MenuItem deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivAction.MenuItem((DivAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action", this.f58755a.u0()), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.f58755a.u0()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "text", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivAction.MenuItem menuItem) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "action", menuItem.f54189a, this.f58755a.u0());
        JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", menuItem.f54190b, this.f58755a.u0());
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text", menuItem.f54191c);
        return jSONObject;
    }
}
