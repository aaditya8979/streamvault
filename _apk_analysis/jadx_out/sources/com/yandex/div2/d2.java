package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivInputValidator;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputValidatorJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class d2 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58747a;

    public d2(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58747a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivInputValidator deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (tn.p.f(string, "regex")) {
            return new DivInputValidator.c(this.f58747a.J4().getValue().deserialize(parsingContext, jSONObject));
        }
        if (tn.p.f(string, "expression")) {
            return new DivInputValidator.b(this.f58747a.D4().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivInputValidatorTemplate divInputValidatorTemplate = orThrow instanceof DivInputValidatorTemplate ? (DivInputValidatorTemplate) orThrow : null;
        if (divInputValidatorTemplate != null) {
            return this.f58747a.I4().getValue().resolve(parsingContext, divInputValidatorTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivInputValidator divInputValidator) throws ParsingException {
        if (divInputValidator instanceof DivInputValidator.c) {
            return this.f58747a.J4().getValue().serialize(parsingContext, ((DivInputValidator.c) divInputValidator).c());
        }
        if (divInputValidator instanceof DivInputValidator.b) {
            return this.f58747a.D4().getValue().serialize(parsingContext, ((DivInputValidator.b) divInputValidator).c());
        }
        throw new NoWhenBranchMatchedException();
    }
}
