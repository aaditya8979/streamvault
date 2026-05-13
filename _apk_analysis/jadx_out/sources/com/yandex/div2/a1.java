package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivDrawable;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivDrawableJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class a1 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58708a;

    public a1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58708a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivDrawable deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (tn.p.f(string, "shape_drawable")) {
            return new DivDrawable.b(this.f58708a.S6().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivDrawableTemplate divDrawableTemplate = orThrow instanceof DivDrawableTemplate ? (DivDrawableTemplate) orThrow : null;
        if (divDrawableTemplate != null) {
            return this.f58708a.X2().getValue().resolve(parsingContext, divDrawableTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivDrawable divDrawable) throws ParsingException {
        if (divDrawable instanceof DivDrawable.b) {
            return this.f58708a.S6().getValue().serialize(parsingContext, ((DivDrawable.b) divDrawable).c());
        }
        throw new NoWhenBranchMatchedException();
    }
}
