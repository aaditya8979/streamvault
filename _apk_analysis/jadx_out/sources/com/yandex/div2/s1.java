package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivInputFilter;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputFilterJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class s1 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58999a;

    public s1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58999a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivInputFilter deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (tn.p.f(string, "regex")) {
            return new DivInputFilter.c(this.f58999a.p4().getValue().deserialize(parsingContext, jSONObject));
        }
        if (tn.p.f(string, "expression")) {
            return new DivInputFilter.b(this.f58999a.j4().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivInputFilterTemplate divInputFilterTemplate = orThrow instanceof DivInputFilterTemplate ? (DivInputFilterTemplate) orThrow : null;
        if (divInputFilterTemplate != null) {
            return this.f58999a.o4().getValue().resolve(parsingContext, divInputFilterTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivInputFilter divInputFilter) throws ParsingException {
        if (divInputFilter instanceof DivInputFilter.c) {
            return this.f58999a.p4().getValue().serialize(parsingContext, ((DivInputFilter.c) divInputFilter).c());
        }
        if (divInputFilter instanceof DivInputFilter.b) {
            return this.f58999a.j4().getValue().serialize(parsingContext, ((DivInputFilter.b) divInputFilter).c());
        }
        throw new NoWhenBranchMatchedException();
    }
}
