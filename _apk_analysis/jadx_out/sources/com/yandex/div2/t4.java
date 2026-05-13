package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivTextRangeMask;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextRangeMaskJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class t4 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f59012a;

    public t4(@NotNull JsonParserComponent jsonParserComponent) {
        this.f59012a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTextRangeMask deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (tn.p.f(string, "particles")) {
            return new DivTextRangeMask.b(this.f59012a.G8().getValue().deserialize(parsingContext, jSONObject));
        }
        if (tn.p.f(string, "solid")) {
            return new DivTextRangeMask.c(this.f59012a.J8().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivTextRangeMaskTemplate divTextRangeMaskTemplate = orThrow instanceof DivTextRangeMaskTemplate ? (DivTextRangeMaskTemplate) orThrow : null;
        if (divTextRangeMaskTemplate != null) {
            return this.f59012a.F8().getValue().resolve(parsingContext, divTextRangeMaskTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTextRangeMask divTextRangeMask) throws ParsingException {
        if (divTextRangeMask instanceof DivTextRangeMask.b) {
            return this.f59012a.G8().getValue().serialize(parsingContext, ((DivTextRangeMask.b) divTextRangeMask).c());
        }
        if (divTextRangeMask instanceof DivTextRangeMask.c) {
            return this.f59012a.J8().getValue().serialize(parsingContext, ((DivTextRangeMask.c) divTextRangeMask).c());
        }
        throw new NoWhenBranchMatchedException();
    }
}
