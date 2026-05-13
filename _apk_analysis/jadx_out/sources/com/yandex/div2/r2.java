package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivPagerLayoutModeTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPagerLayoutModeJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class r2 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58990a;

    public r2(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58990a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPagerLayoutModeTemplate deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivPagerLayoutModeTemplate divPagerLayoutModeTemplate = entityTemplate instanceof DivPagerLayoutModeTemplate ? (DivPagerLayoutModeTemplate) entityTemplate : null;
        if (divPagerLayoutModeTemplate != null && (type = divPagerLayoutModeTemplate.getType()) != null) {
            string = type;
        }
        int iHashCode = string.hashCode();
        if (iHashCode != -921832806) {
            if (iHashCode != 97445748) {
                if (iHashCode == 343327108 && string.equals("wrap_content")) {
                    return new DivPagerLayoutModeTemplate.c(this.f58990a.l5().getValue().deserialize(parsingContext, (DivPageContentSizeTemplate) (divPagerLayoutModeTemplate != null ? divPagerLayoutModeTemplate.a() : null), jSONObject));
                }
            } else if (string.equals("fixed")) {
                return new DivPagerLayoutModeTemplate.b(this.f58990a.c5().getValue().deserialize(parsingContext, (DivNeighbourPageSizeTemplate) (divPagerLayoutModeTemplate != null ? divPagerLayoutModeTemplate.a() : null), jSONObject));
            }
        } else if (string.equals("percentage")) {
            return new DivPagerLayoutModeTemplate.d(this.f58990a.o5().getValue().deserialize(parsingContext, (DivPageSizeTemplate) (divPagerLayoutModeTemplate != null ? divPagerLayoutModeTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivPagerLayoutModeTemplate divPagerLayoutModeTemplate) throws ParsingException {
        if (divPagerLayoutModeTemplate instanceof DivPagerLayoutModeTemplate.d) {
            return this.f58990a.o5().getValue().serialize(parsingContext, ((DivPagerLayoutModeTemplate.d) divPagerLayoutModeTemplate).b());
        }
        if (divPagerLayoutModeTemplate instanceof DivPagerLayoutModeTemplate.b) {
            return this.f58990a.c5().getValue().serialize(parsingContext, ((DivPagerLayoutModeTemplate.b) divPagerLayoutModeTemplate).b());
        }
        if (divPagerLayoutModeTemplate instanceof DivPagerLayoutModeTemplate.c) {
            return this.f58990a.l5().getValue().serialize(parsingContext, ((DivPagerLayoutModeTemplate.c) divPagerLayoutModeTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }
}
