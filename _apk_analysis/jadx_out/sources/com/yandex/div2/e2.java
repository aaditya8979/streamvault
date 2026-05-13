package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivInputValidatorTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputValidatorJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class e2 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58758a;

    public e2(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58758a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivInputValidatorTemplate deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivInputValidatorTemplate divInputValidatorTemplate = entityTemplate instanceof DivInputValidatorTemplate ? (DivInputValidatorTemplate) entityTemplate : null;
        if (divInputValidatorTemplate != null && (type = divInputValidatorTemplate.getType()) != null) {
            string = type;
        }
        if (tn.p.f(string, "regex")) {
            return new DivInputValidatorTemplate.c(this.f58758a.K4().getValue().deserialize(parsingContext, (DivInputValidatorRegexTemplate) (divInputValidatorTemplate != null ? divInputValidatorTemplate.a() : null), jSONObject));
        }
        if (tn.p.f(string, "expression")) {
            return new DivInputValidatorTemplate.b(this.f58758a.E4().getValue().deserialize(parsingContext, (DivInputValidatorExpressionTemplate) (divInputValidatorTemplate != null ? divInputValidatorTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivInputValidatorTemplate divInputValidatorTemplate) throws ParsingException {
        if (divInputValidatorTemplate instanceof DivInputValidatorTemplate.c) {
            return this.f58758a.K4().getValue().serialize(parsingContext, ((DivInputValidatorTemplate.c) divInputValidatorTemplate).b());
        }
        if (divInputValidatorTemplate instanceof DivInputValidatorTemplate.b) {
            return this.f58758a.E4().getValue().serialize(parsingContext, ((DivInputValidatorTemplate.b) divInputValidatorTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }
}
