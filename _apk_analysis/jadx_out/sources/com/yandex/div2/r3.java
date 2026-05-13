package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivSizeTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSizeJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class r3 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58991a;

    public r3(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58991a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivSizeTemplate deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivSizeTemplate divSizeTemplate = entityTemplate instanceof DivSizeTemplate ? (DivSizeTemplate) entityTemplate : null;
        if (divSizeTemplate != null && (type = divSizeTemplate.getType()) != null) {
            string = type;
        }
        int iHashCode = string.hashCode();
        if (iHashCode != 97445748) {
            if (iHashCode != 343327108) {
                if (iHashCode == 1386124388 && string.equals("match_parent")) {
                    return new DivSizeTemplate.c(this.f58991a.Z4().getValue().deserialize(parsingContext, (DivMatchParentSizeTemplate) (divSizeTemplate != null ? divSizeTemplate.a() : null), jSONObject));
                }
            } else if (string.equals("wrap_content")) {
                return new DivSizeTemplate.d(this.f58991a.A9().getValue().deserialize(parsingContext, (DivWrapContentSizeTemplate) (divSizeTemplate != null ? divSizeTemplate.a() : null), jSONObject));
            }
        } else if (string.equals("fixed")) {
            return new DivSizeTemplate.b(this.f58991a.x3().getValue().deserialize(parsingContext, (DivFixedSizeTemplate) (divSizeTemplate != null ? divSizeTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivSizeTemplate divSizeTemplate) throws ParsingException {
        if (divSizeTemplate instanceof DivSizeTemplate.b) {
            return this.f58991a.x3().getValue().serialize(parsingContext, ((DivSizeTemplate.b) divSizeTemplate).b());
        }
        if (divSizeTemplate instanceof DivSizeTemplate.c) {
            return this.f58991a.Z4().getValue().serialize(parsingContext, ((DivSizeTemplate.c) divSizeTemplate).b());
        }
        if (divSizeTemplate instanceof DivSizeTemplate.d) {
            return this.f58991a.A9().getValue().serialize(parsingContext, ((DivSizeTemplate.d) divSizeTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }
}
