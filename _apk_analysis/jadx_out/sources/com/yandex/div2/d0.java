package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivBackground;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivBackgroundJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class d0 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58745a;

    public d0(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58745a = jsonParserComponent;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivBackground deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        switch (string.hashCode()) {
            case -30518633:
                if (string.equals("nine_patch_image")) {
                    return new DivBackground.d(this.f58745a.e5().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 89650992:
                if (string.equals("gradient")) {
                    return new DivBackground.c(this.f58745a.V4().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 100313435:
                if (string.equals("image")) {
                    return new DivBackground.b(this.f58745a.U3().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 109618859:
                if (string.equals("solid")) {
                    return new DivBackground.f(this.f58745a.q7().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 1881846096:
                if (string.equals("radial_gradient")) {
                    return new DivBackground.e(this.f58745a.l6().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivBackgroundTemplate divBackgroundTemplate = orThrow instanceof DivBackgroundTemplate ? (DivBackgroundTemplate) orThrow : null;
        if (divBackgroundTemplate != null) {
            return this.f58745a.H1().getValue().resolve(parsingContext, divBackgroundTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivBackground divBackground) throws ParsingException {
        if (divBackground instanceof DivBackground.c) {
            return this.f58745a.V4().getValue().serialize(parsingContext, ((DivBackground.c) divBackground).c());
        }
        if (divBackground instanceof DivBackground.e) {
            return this.f58745a.l6().getValue().serialize(parsingContext, ((DivBackground.e) divBackground).c());
        }
        if (divBackground instanceof DivBackground.b) {
            return this.f58745a.U3().getValue().serialize(parsingContext, ((DivBackground.b) divBackground).c());
        }
        if (divBackground instanceof DivBackground.f) {
            return this.f58745a.q7().getValue().serialize(parsingContext, ((DivBackground.f) divBackground).c());
        }
        if (divBackground instanceof DivBackground.d) {
            return this.f58745a.e5().getValue().serialize(parsingContext, ((DivBackground.d) divBackground).c());
        }
        throw new NoWhenBranchMatchedException();
    }
}
