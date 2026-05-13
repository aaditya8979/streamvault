package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivState;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStateJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class w3 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f59037a;

    public w3(@NotNull JsonParserComponent jsonParserComponent) {
        this.f59037a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivState.State deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivState.State((DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "animation_in", this.f59037a.q1()), (DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "animation_out", this.f59037a.q1()), (Div) JsonPropertyParser.readOptional(parsingContext, jSONObject, "div", this.f59037a.M4()), (String) JsonPropertyParser.read(parsingContext, jSONObject, "state_id"), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "swipe_out_actions", this.f59037a.u0()));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivState.State state) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "animation_in", state.f57192a, this.f59037a.q1());
        JsonPropertyParser.write(parsingContext, jSONObject, "animation_out", state.f57193b, this.f59037a.q1());
        JsonPropertyParser.write(parsingContext, jSONObject, "div", state.f57194c, this.f59037a.M4());
        JsonPropertyParser.write(parsingContext, jSONObject, "state_id", state.f57195d);
        JsonPropertyParser.writeList(parsingContext, jSONObject, "swipe_out_actions", state.f57196e, this.f59037a.u0());
        return jSONObject;
    }
}
