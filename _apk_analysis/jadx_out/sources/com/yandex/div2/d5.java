package com.yandex.div2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivTypedValue;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTypedValueJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class d5 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58754a;

    public d5(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58754a = jsonParserComponent;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTypedValue deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        switch (string.hashCode()) {
            case -1034364087:
                if (string.equals("number")) {
                    return new DivTypedValue.g(this.f58754a.O9().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case -891985903:
                if (string.equals(TypedValues.Custom.S_STRING)) {
                    return new DivTypedValue.h(this.f58754a.da().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 116079:
                if (string.equals("url")) {
                    return new DivTypedValue.i(this.f58754a.ja().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 3083190:
                if (string.equals("dict")) {
                    return new DivTypedValue.e(this.f58754a.y().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 64711720:
                if (string.equals(TypedValues.Custom.S_BOOLEAN)) {
                    return new DivTypedValue.b(this.f58754a.g().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 93090393:
                if (string.equals("array")) {
                    return new DivTypedValue.a(this.f58754a.a().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 94842723:
                if (string.equals("color")) {
                    return new DivTypedValue.c(this.f58754a.m().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 1958052158:
                if (string.equals(TypedValues.Custom.S_INT)) {
                    return new DivTypedValue.f(this.f58754a.I9().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivTypedValueTemplate divTypedValueTemplate = orThrow instanceof DivTypedValueTemplate ? (DivTypedValueTemplate) orThrow : null;
        if (divTypedValueTemplate != null) {
            return this.f58754a.j9().getValue().resolve(parsingContext, divTypedValueTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTypedValue divTypedValue) throws ParsingException {
        if (divTypedValue instanceof DivTypedValue.h) {
            return this.f58754a.da().getValue().serialize(parsingContext, ((DivTypedValue.h) divTypedValue).c());
        }
        if (divTypedValue instanceof DivTypedValue.f) {
            return this.f58754a.I9().getValue().serialize(parsingContext, ((DivTypedValue.f) divTypedValue).c());
        }
        if (divTypedValue instanceof DivTypedValue.g) {
            return this.f58754a.O9().getValue().serialize(parsingContext, ((DivTypedValue.g) divTypedValue).c());
        }
        if (divTypedValue instanceof DivTypedValue.c) {
            return this.f58754a.m().getValue().serialize(parsingContext, ((DivTypedValue.c) divTypedValue).c());
        }
        if (divTypedValue instanceof DivTypedValue.b) {
            return this.f58754a.g().getValue().serialize(parsingContext, ((DivTypedValue.b) divTypedValue).c());
        }
        if (divTypedValue instanceof DivTypedValue.i) {
            return this.f58754a.ja().getValue().serialize(parsingContext, ((DivTypedValue.i) divTypedValue).c());
        }
        if (divTypedValue instanceof DivTypedValue.e) {
            return this.f58754a.y().getValue().serialize(parsingContext, ((DivTypedValue.e) divTypedValue).c());
        }
        if (divTypedValue instanceof DivTypedValue.a) {
            return this.f58754a.a().getValue().serialize(parsingContext, ((DivTypedValue.a) divTypedValue).c());
        }
        throw new NoWhenBranchMatchedException();
    }
}
