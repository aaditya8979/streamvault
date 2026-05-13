package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivTextRangeBackground;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextRangeBackgroundJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class o4 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58952a;

    public o4(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58952a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTextRangeBackground deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (tn.p.f(string, "solid")) {
            return new DivTextRangeBackground.c(this.f58952a.q7().getValue().deserialize(parsingContext, jSONObject));
        }
        if (tn.p.f(string, "cloud")) {
            return new DivTextRangeBackground.a(this.f58952a.a2().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivTextRangeBackgroundTemplate divTextRangeBackgroundTemplate = orThrow instanceof DivTextRangeBackgroundTemplate ? (DivTextRangeBackgroundTemplate) orThrow : null;
        if (divTextRangeBackgroundTemplate != null) {
            return this.f58952a.u8().getValue().resolve(parsingContext, divTextRangeBackgroundTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTextRangeBackground divTextRangeBackground) throws ParsingException {
        if (divTextRangeBackground instanceof DivTextRangeBackground.c) {
            return this.f58952a.q7().getValue().serialize(parsingContext, ((DivTextRangeBackground.c) divTextRangeBackground).c());
        }
        if (divTextRangeBackground instanceof DivTextRangeBackground.a) {
            return this.f58952a.a2().getValue().serialize(parsingContext, ((DivTextRangeBackground.a) divTextRangeBackground).c());
        }
        throw new NoWhenBranchMatchedException();
    }
}
