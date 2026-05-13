package com.yandex.div2;

import androidx.compose.material.OutlinedTextFieldKt;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivFocus;
import io.appmetrica.analytics.impl.A2;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFocusJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class j1 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58843a;

    public j1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58843a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivFocus deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivFocus(JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f64965g, this.f58843a.F1()), (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f58843a.L1()), (DivFocus.NextFocusIds) JsonPropertyParser.readOptional(parsingContext, jSONObject, "next_focus_ids", this.f58843a.C3()), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_blur", this.f58843a.u0()), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_focus", this.f58843a.u0()));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivFocus divFocus) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.writeList(parsingContext, jSONObject, A2.f64965g, divFocus.f55349a, this.f58843a.F1());
        JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, divFocus.f55350b, this.f58843a.L1());
        JsonPropertyParser.write(parsingContext, jSONObject, "next_focus_ids", divFocus.f55351c, this.f58843a.C3());
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_blur", divFocus.f55352d, this.f58843a.u0());
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_focus", divFocus.f55353e, this.f58843a.u0());
        return jSONObject;
    }
}
