package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivBackgroundTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivBackgroundJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class e0 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58756a;

    public e0(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58756a = jsonParserComponent;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivBackgroundTemplate deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivBackgroundTemplate divBackgroundTemplate = entityTemplate instanceof DivBackgroundTemplate ? (DivBackgroundTemplate) entityTemplate : null;
        if (divBackgroundTemplate != null && (type = divBackgroundTemplate.getType()) != null) {
            string = type;
        }
        switch (string.hashCode()) {
            case -30518633:
                if (string.equals("nine_patch_image")) {
                    return new DivBackgroundTemplate.d(this.f58756a.f5().getValue().deserialize(parsingContext, (DivNinePatchBackgroundTemplate) (divBackgroundTemplate != null ? divBackgroundTemplate.a() : null), jSONObject));
                }
                break;
            case 89650992:
                if (string.equals("gradient")) {
                    return new DivBackgroundTemplate.c(this.f58756a.W4().getValue().deserialize(parsingContext, (DivLinearGradientTemplate) (divBackgroundTemplate != null ? divBackgroundTemplate.a() : null), jSONObject));
                }
                break;
            case 100313435:
                if (string.equals("image")) {
                    return new DivBackgroundTemplate.b(this.f58756a.V3().getValue().deserialize(parsingContext, (DivImageBackgroundTemplate) (divBackgroundTemplate != null ? divBackgroundTemplate.a() : null), jSONObject));
                }
                break;
            case 109618859:
                if (string.equals("solid")) {
                    return new DivBackgroundTemplate.f(this.f58756a.r7().getValue().deserialize(parsingContext, (DivSolidBackgroundTemplate) (divBackgroundTemplate != null ? divBackgroundTemplate.a() : null), jSONObject));
                }
                break;
            case 1881846096:
                if (string.equals("radial_gradient")) {
                    return new DivBackgroundTemplate.e(this.f58756a.m6().getValue().deserialize(parsingContext, (DivRadialGradientTemplate) (divBackgroundTemplate != null ? divBackgroundTemplate.a() : null), jSONObject));
                }
                break;
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivBackgroundTemplate divBackgroundTemplate) throws ParsingException {
        if (divBackgroundTemplate instanceof DivBackgroundTemplate.c) {
            return this.f58756a.W4().getValue().serialize(parsingContext, ((DivBackgroundTemplate.c) divBackgroundTemplate).b());
        }
        if (divBackgroundTemplate instanceof DivBackgroundTemplate.e) {
            return this.f58756a.m6().getValue().serialize(parsingContext, ((DivBackgroundTemplate.e) divBackgroundTemplate).b());
        }
        if (divBackgroundTemplate instanceof DivBackgroundTemplate.b) {
            return this.f58756a.V3().getValue().serialize(parsingContext, ((DivBackgroundTemplate.b) divBackgroundTemplate).b());
        }
        if (divBackgroundTemplate instanceof DivBackgroundTemplate.f) {
            return this.f58756a.r7().getValue().serialize(parsingContext, ((DivBackgroundTemplate.f) divBackgroundTemplate).b());
        }
        if (divBackgroundTemplate instanceof DivBackgroundTemplate.d) {
            return this.f58756a.f5().getValue().serialize(parsingContext, ((DivBackgroundTemplate.d) divBackgroundTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }
}
