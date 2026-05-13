package com.yandex.div2;

import com.vungle.ads.internal.ui.AdActivity;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivActionSubmit;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionSubmitJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class m implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58886a;

    public m(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58886a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionSubmit deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivActionSubmit(JsonExpressionParser.readExpression(parsingContext, jSONObject, "container_id", TypeHelpersKt.TYPE_HELPER_STRING), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_fail_actions", this.f58886a.u0()), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_success_actions", this.f58886a.u0()), (DivActionSubmit.Request) JsonPropertyParser.read(parsingContext, jSONObject, AdActivity.REQUEST_KEY_EXTRA, this.f58886a.b1()));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivActionSubmit divActionSubmit) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "container_id", divActionSubmit.f54425a);
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_fail_actions", divActionSubmit.f54426b, this.f58886a.u0());
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_success_actions", divActionSubmit.f54427c, this.f58886a.u0());
        JsonPropertyParser.write(parsingContext, jSONObject, AdActivity.REQUEST_KEY_EXTRA, divActionSubmit.f54428d, this.f58886a.b1());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "submit");
        return jSONObject;
    }
}
