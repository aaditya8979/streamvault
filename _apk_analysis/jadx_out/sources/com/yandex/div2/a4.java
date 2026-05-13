package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivStrokeStyle;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStrokeStyleJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class a4 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58711a;

    public a4(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58711a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivStrokeStyle deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (tn.p.f(string, "solid")) {
            return new DivStrokeStyle.c(this.f58711a.L7().getValue().deserialize(parsingContext, jSONObject));
        }
        if (tn.p.f(string, "dashed")) {
            return new DivStrokeStyle.b(this.f58711a.F7().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivStrokeStyleTemplate divStrokeStyleTemplate = orThrow instanceof DivStrokeStyleTemplate ? (DivStrokeStyleTemplate) orThrow : null;
        if (divStrokeStyleTemplate != null) {
            return this.f58711a.K7().getValue().resolve(parsingContext, divStrokeStyleTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivStrokeStyle divStrokeStyle) throws ParsingException {
        if (divStrokeStyle instanceof DivStrokeStyle.c) {
            return this.f58711a.L7().getValue().serialize(parsingContext, ((DivStrokeStyle.c) divStrokeStyle).c());
        }
        if (divStrokeStyle instanceof DivStrokeStyle.b) {
            return this.f58711a.F7().getValue().serialize(parsingContext, ((DivStrokeStyle.b) divStrokeStyle).c());
        }
        throw new NoWhenBranchMatchedException();
    }
}
