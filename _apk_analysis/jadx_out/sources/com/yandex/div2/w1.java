package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivInputMaskTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputMaskJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class w1 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f59031a;

    public w1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f59031a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivInputMaskTemplate deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivInputMaskTemplate divInputMaskTemplate = entityTemplate instanceof DivInputMaskTemplate ? (DivInputMaskTemplate) entityTemplate : null;
        if (divInputMaskTemplate != null && (type = divInputMaskTemplate.getType()) != null) {
            string = type;
        }
        int iHashCode = string.hashCode();
        if (iHashCode != 106642798) {
            if (iHashCode != 393594385) {
                if (iHashCode == 575402001 && string.equals("currency")) {
                    return new DivInputMaskTemplate.b(this.f59031a.z2().getValue().deserialize(parsingContext, (DivCurrencyInputMaskTemplate) (divInputMaskTemplate != null ? divInputMaskTemplate.a() : null), jSONObject));
                }
            } else if (string.equals("fixed_length")) {
                return new DivInputMaskTemplate.c(this.f59031a.r3().getValue().deserialize(parsingContext, (DivFixedLengthInputMaskTemplate) (divInputMaskTemplate != null ? divInputMaskTemplate.a() : null), jSONObject));
            }
        } else if (string.equals("phone")) {
            return new DivInputMaskTemplate.d(this.f59031a.O5().getValue().deserialize(parsingContext, (DivPhoneInputMaskTemplate) (divInputMaskTemplate != null ? divInputMaskTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivInputMaskTemplate divInputMaskTemplate) throws ParsingException {
        if (divInputMaskTemplate instanceof DivInputMaskTemplate.c) {
            return this.f59031a.r3().getValue().serialize(parsingContext, ((DivInputMaskTemplate.c) divInputMaskTemplate).b());
        }
        if (divInputMaskTemplate instanceof DivInputMaskTemplate.b) {
            return this.f59031a.z2().getValue().serialize(parsingContext, ((DivInputMaskTemplate.b) divInputMaskTemplate).b());
        }
        if (divInputMaskTemplate instanceof DivInputMaskTemplate.d) {
            return this.f59031a.O5().getValue().serialize(parsingContext, ((DivInputMaskTemplate.d) divInputMaskTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }
}
