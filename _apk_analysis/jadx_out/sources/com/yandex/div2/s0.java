package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivCount;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivCountJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class s0 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58998a;

    public s0(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58998a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivCount deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (tn.p.f(string, "infinity")) {
            return new DivCount.c(this.f58998a.g4().getValue().deserialize(parsingContext, jSONObject));
        }
        if (tn.p.f(string, "fixed")) {
            return new DivCount.b(this.f58998a.n3().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivCountTemplate divCountTemplate = orThrow instanceof DivCountTemplate ? (DivCountTemplate) orThrow : null;
        if (divCountTemplate != null) {
            return this.f58998a.x2().getValue().resolve(parsingContext, divCountTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivCount divCount) throws ParsingException {
        if (divCount instanceof DivCount.c) {
            return this.f58998a.g4().getValue().serialize(parsingContext, ((DivCount.c) divCount).c());
        }
        if (divCount instanceof DivCount.b) {
            return this.f58998a.n3().getValue().serialize(parsingContext, ((DivCount.b) divCount).c());
        }
        throw new NoWhenBranchMatchedException();
    }
}
