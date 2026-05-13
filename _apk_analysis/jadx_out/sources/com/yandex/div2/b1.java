package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivDrawableTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivDrawableJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class b1 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58715a;

    public b1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58715a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivDrawableTemplate deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivDrawableTemplate divDrawableTemplate = entityTemplate instanceof DivDrawableTemplate ? (DivDrawableTemplate) entityTemplate : null;
        if (divDrawableTemplate != null && (type = divDrawableTemplate.getType()) != null) {
            string = type;
        }
        if (tn.p.f(string, "shape_drawable")) {
            return new DivDrawableTemplate.b(this.f58715a.T6().getValue().deserialize(parsingContext, (DivShapeDrawableTemplate) (divDrawableTemplate != null ? divDrawableTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivDrawableTemplate divDrawableTemplate) throws ParsingException {
        if (divDrawableTemplate instanceof DivDrawableTemplate.b) {
            return this.f58715a.T6().getValue().serialize(parsingContext, ((DivDrawableTemplate.b) divDrawableTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }
}
