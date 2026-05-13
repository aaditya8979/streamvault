package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivChangeTransition;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivChangeTransitionJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class j0 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58842a;

    public j0(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58842a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivChangeTransition deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (tn.p.f(string, "set")) {
            return new DivChangeTransition.c(this.f58842a.R1().getValue().deserialize(parsingContext, jSONObject));
        }
        if (tn.p.f(string, "change_bounds")) {
            return new DivChangeTransition.a(this.f58842a.O1().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivChangeTransitionTemplate divChangeTransitionTemplate = orThrow instanceof DivChangeTransitionTemplate ? (DivChangeTransitionTemplate) orThrow : null;
        if (divChangeTransitionTemplate != null) {
            return this.f58842a.W1().getValue().resolve(parsingContext, divChangeTransitionTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivChangeTransition divChangeTransition) throws ParsingException {
        if (divChangeTransition instanceof DivChangeTransition.c) {
            return this.f58842a.R1().getValue().serialize(parsingContext, ((DivChangeTransition.c) divChangeTransition).c());
        }
        if (divChangeTransition instanceof DivChangeTransition.a) {
            return this.f58842a.O1().getValue().serialize(parsingContext, ((DivChangeTransition.a) divChangeTransition).c());
        }
        throw new NoWhenBranchMatchedException();
    }
}
