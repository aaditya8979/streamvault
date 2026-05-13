package com.yandex.div2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivTypedValueTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTypedValueJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class e5 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58769a;

    public e5(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58769a = jsonParserComponent;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTypedValueTemplate deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivTypedValueTemplate divTypedValueTemplate = entityTemplate instanceof DivTypedValueTemplate ? (DivTypedValueTemplate) entityTemplate : null;
        if (divTypedValueTemplate != null && (type = divTypedValueTemplate.getType()) != null) {
            string = type;
        }
        switch (string.hashCode()) {
            case -1034364087:
                if (string.equals("number")) {
                    return new DivTypedValueTemplate.g(this.f58769a.P9().getValue().deserialize(parsingContext, (NumberValueTemplate) (divTypedValueTemplate != null ? divTypedValueTemplate.a() : null), jSONObject));
                }
                break;
            case -891985903:
                if (string.equals(TypedValues.Custom.S_STRING)) {
                    return new DivTypedValueTemplate.h(this.f58769a.ea().getValue().deserialize(parsingContext, (StrValueTemplate) (divTypedValueTemplate != null ? divTypedValueTemplate.a() : null), jSONObject));
                }
                break;
            case 116079:
                if (string.equals("url")) {
                    return new DivTypedValueTemplate.i(this.f58769a.ka().getValue().deserialize(parsingContext, (UrlValueTemplate) (divTypedValueTemplate != null ? divTypedValueTemplate.a() : null), jSONObject));
                }
                break;
            case 3083190:
                if (string.equals("dict")) {
                    return new DivTypedValueTemplate.e(this.f58769a.z().getValue().deserialize(parsingContext, (DictValueTemplate) (divTypedValueTemplate != null ? divTypedValueTemplate.a() : null), jSONObject));
                }
                break;
            case 64711720:
                if (string.equals(TypedValues.Custom.S_BOOLEAN)) {
                    return new DivTypedValueTemplate.b(this.f58769a.h().getValue().deserialize(parsingContext, (BoolValueTemplate) (divTypedValueTemplate != null ? divTypedValueTemplate.a() : null), jSONObject));
                }
                break;
            case 93090393:
                if (string.equals("array")) {
                    return new DivTypedValueTemplate.a(this.f58769a.b().getValue().deserialize(parsingContext, (ArrayValueTemplate) (divTypedValueTemplate != null ? divTypedValueTemplate.a() : null), jSONObject));
                }
                break;
            case 94842723:
                if (string.equals("color")) {
                    return new DivTypedValueTemplate.c(this.f58769a.n().getValue().deserialize(parsingContext, (ColorValueTemplate) (divTypedValueTemplate != null ? divTypedValueTemplate.a() : null), jSONObject));
                }
                break;
            case 1958052158:
                if (string.equals(TypedValues.Custom.S_INT)) {
                    return new DivTypedValueTemplate.f(this.f58769a.J9().getValue().deserialize(parsingContext, (IntegerValueTemplate) (divTypedValueTemplate != null ? divTypedValueTemplate.a() : null), jSONObject));
                }
                break;
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTypedValueTemplate divTypedValueTemplate) throws ParsingException {
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.h) {
            return this.f58769a.ea().getValue().serialize(parsingContext, ((DivTypedValueTemplate.h) divTypedValueTemplate).b());
        }
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.f) {
            return this.f58769a.J9().getValue().serialize(parsingContext, ((DivTypedValueTemplate.f) divTypedValueTemplate).b());
        }
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.g) {
            return this.f58769a.P9().getValue().serialize(parsingContext, ((DivTypedValueTemplate.g) divTypedValueTemplate).b());
        }
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.c) {
            return this.f58769a.n().getValue().serialize(parsingContext, ((DivTypedValueTemplate.c) divTypedValueTemplate).b());
        }
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.b) {
            return this.f58769a.h().getValue().serialize(parsingContext, ((DivTypedValueTemplate.b) divTypedValueTemplate).b());
        }
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.i) {
            return this.f58769a.ka().getValue().serialize(parsingContext, ((DivTypedValueTemplate.i) divTypedValueTemplate).b());
        }
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.e) {
            return this.f58769a.z().getValue().serialize(parsingContext, ((DivTypedValueTemplate.e) divTypedValueTemplate).b());
        }
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.a) {
            return this.f58769a.b().getValue().serialize(parsingContext, ((DivTypedValueTemplate.a) divTypedValueTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }
}
