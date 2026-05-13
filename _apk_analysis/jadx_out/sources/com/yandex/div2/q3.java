package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivSize;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSizeJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class q3 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58978a;

    public q3(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58978a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivSize deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        int iHashCode = string.hashCode();
        if (iHashCode != 97445748) {
            if (iHashCode != 343327108) {
                if (iHashCode == 1386124388 && string.equals("match_parent")) {
                    return new DivSize.c(this.f58978a.Y4().getValue().deserialize(parsingContext, jSONObject));
                }
            } else if (string.equals("wrap_content")) {
                return new DivSize.d(this.f58978a.z9().getValue().deserialize(parsingContext, jSONObject));
            }
        } else if (string.equals("fixed")) {
            return new DivSize.b(this.f58978a.w3().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivSizeTemplate divSizeTemplate = orThrow instanceof DivSizeTemplate ? (DivSizeTemplate) orThrow : null;
        if (divSizeTemplate != null) {
            return this.f58978a.a7().getValue().resolve(parsingContext, divSizeTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivSize divSize) throws ParsingException {
        if (divSize instanceof DivSize.b) {
            return this.f58978a.w3().getValue().serialize(parsingContext, ((DivSize.b) divSize).c());
        }
        if (divSize instanceof DivSize.c) {
            return this.f58978a.Y4().getValue().serialize(parsingContext, ((DivSize.c) divSize).c());
        }
        if (divSize instanceof DivSize.d) {
            return this.f58978a.z9().getValue().serialize(parsingContext, ((DivSize.d) divSize).c());
        }
        throw new NoWhenBranchMatchedException();
    }
}
