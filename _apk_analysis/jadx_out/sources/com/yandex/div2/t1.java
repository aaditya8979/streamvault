package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivInputFilterTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputFilterJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class t1 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f59009a;

    public t1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f59009a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivInputFilterTemplate deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivInputFilterTemplate divInputFilterTemplate = entityTemplate instanceof DivInputFilterTemplate ? (DivInputFilterTemplate) entityTemplate : null;
        if (divInputFilterTemplate != null && (type = divInputFilterTemplate.getType()) != null) {
            string = type;
        }
        if (tn.p.f(string, "regex")) {
            return new DivInputFilterTemplate.c(this.f59009a.q4().getValue().deserialize(parsingContext, (DivInputFilterRegexTemplate) (divInputFilterTemplate != null ? divInputFilterTemplate.a() : null), jSONObject));
        }
        if (tn.p.f(string, "expression")) {
            return new DivInputFilterTemplate.b(this.f59009a.k4().getValue().deserialize(parsingContext, (DivInputFilterExpressionTemplate) (divInputFilterTemplate != null ? divInputFilterTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivInputFilterTemplate divInputFilterTemplate) throws ParsingException {
        if (divInputFilterTemplate instanceof DivInputFilterTemplate.c) {
            return this.f59009a.q4().getValue().serialize(parsingContext, ((DivInputFilterTemplate.c) divInputFilterTemplate).b());
        }
        if (divInputFilterTemplate instanceof DivInputFilterTemplate.b) {
            return this.f59009a.k4().getValue().serialize(parsingContext, ((DivInputFilterTemplate.b) divInputFilterTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }
}
