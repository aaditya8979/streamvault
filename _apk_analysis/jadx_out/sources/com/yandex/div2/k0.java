package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivChangeTransitionTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivChangeTransitionJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class k0 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58853a;

    public k0(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58853a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivChangeTransitionTemplate deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivChangeTransitionTemplate divChangeTransitionTemplate = entityTemplate instanceof DivChangeTransitionTemplate ? (DivChangeTransitionTemplate) entityTemplate : null;
        if (divChangeTransitionTemplate != null && (type = divChangeTransitionTemplate.getType()) != null) {
            string = type;
        }
        if (tn.p.f(string, "set")) {
            return new DivChangeTransitionTemplate.c(this.f58853a.S1().getValue().deserialize(parsingContext, (DivChangeSetTransitionTemplate) (divChangeTransitionTemplate != null ? divChangeTransitionTemplate.a() : null), jSONObject));
        }
        if (tn.p.f(string, "change_bounds")) {
            return new DivChangeTransitionTemplate.a(this.f58853a.P1().getValue().deserialize(parsingContext, (DivChangeBoundsTransitionTemplate) (divChangeTransitionTemplate != null ? divChangeTransitionTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivChangeTransitionTemplate divChangeTransitionTemplate) throws ParsingException {
        if (divChangeTransitionTemplate instanceof DivChangeTransitionTemplate.c) {
            return this.f58853a.S1().getValue().serialize(parsingContext, ((DivChangeTransitionTemplate.c) divChangeTransitionTemplate).b());
        }
        if (divChangeTransitionTemplate instanceof DivChangeTransitionTemplate.a) {
            return this.f58853a.P1().getValue().serialize(parsingContext, ((DivChangeTransitionTemplate.a) divChangeTransitionTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }
}
