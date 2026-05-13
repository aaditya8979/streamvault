package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivFilter;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFilterJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class d1 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58746a;

    public d1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58746a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivFilter deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (tn.p.f(string, "blur")) {
            return new DivFilter.a(this.f58746a.I1().getValue().deserialize(parsingContext, jSONObject));
        }
        if (tn.p.f(string, "rtl_mirror")) {
            return new DivFilter.c(this.f58746a.k3().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivFilterTemplate divFilterTemplate = orThrow instanceof DivFilterTemplate ? (DivFilterTemplate) orThrow : null;
        if (divFilterTemplate != null) {
            return this.f58746a.j3().getValue().resolve(parsingContext, divFilterTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivFilter divFilter) throws ParsingException {
        if (divFilter instanceof DivFilter.a) {
            return this.f58746a.I1().getValue().serialize(parsingContext, ((DivFilter.a) divFilter).c());
        }
        if (divFilter instanceof DivFilter.c) {
            return this.f58746a.k3().getValue().serialize(parsingContext, ((DivFilter.c) divFilter).c());
        }
        throw new NoWhenBranchMatchedException();
    }
}
