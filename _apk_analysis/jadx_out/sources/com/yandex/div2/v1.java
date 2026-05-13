package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivInputMask;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputMaskJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class v1 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f59025a;

    public v1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f59025a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivInputMask deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        int iHashCode = string.hashCode();
        if (iHashCode != 106642798) {
            if (iHashCode != 393594385) {
                if (iHashCode == 575402001 && string.equals("currency")) {
                    return new DivInputMask.b(this.f59025a.y2().getValue().deserialize(parsingContext, jSONObject));
                }
            } else if (string.equals("fixed_length")) {
                return new DivInputMask.c(this.f59025a.q3().getValue().deserialize(parsingContext, jSONObject));
            }
        } else if (string.equals("phone")) {
            return new DivInputMask.d(this.f59025a.N5().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivInputMaskTemplate divInputMaskTemplate = orThrow instanceof DivInputMaskTemplate ? (DivInputMaskTemplate) orThrow : null;
        if (divInputMaskTemplate != null) {
            return this.f59025a.x4().getValue().resolve(parsingContext, divInputMaskTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivInputMask divInputMask) throws ParsingException {
        if (divInputMask instanceof DivInputMask.c) {
            return this.f59025a.q3().getValue().serialize(parsingContext, ((DivInputMask.c) divInputMask).c());
        }
        if (divInputMask instanceof DivInputMask.b) {
            return this.f59025a.y2().getValue().serialize(parsingContext, ((DivInputMask.b) divInputMask).c());
        }
        if (divInputMask instanceof DivInputMask.d) {
            return this.f59025a.N5().getValue().serialize(parsingContext, ((DivInputMask.d) divInputMask).c());
        }
        throw new NoWhenBranchMatchedException();
    }
}
