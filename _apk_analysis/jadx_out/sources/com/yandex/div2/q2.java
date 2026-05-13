package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivPagerLayoutMode;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPagerLayoutModeJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class q2 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58977a;

    public q2(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58977a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPagerLayoutMode deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        int iHashCode = string.hashCode();
        if (iHashCode != -921832806) {
            if (iHashCode != 97445748) {
                if (iHashCode == 343327108 && string.equals("wrap_content")) {
                    return new DivPagerLayoutMode.c(this.f58977a.k5().getValue().deserialize(parsingContext, jSONObject));
                }
            } else if (string.equals("fixed")) {
                return new DivPagerLayoutMode.b(this.f58977a.b5().getValue().deserialize(parsingContext, jSONObject));
            }
        } else if (string.equals("percentage")) {
            return new DivPagerLayoutMode.d(this.f58977a.n5().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivPagerLayoutModeTemplate divPagerLayoutModeTemplate = orThrow instanceof DivPagerLayoutModeTemplate ? (DivPagerLayoutModeTemplate) orThrow : null;
        if (divPagerLayoutModeTemplate != null) {
            return this.f58977a.E5().getValue().resolve(parsingContext, divPagerLayoutModeTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivPagerLayoutMode divPagerLayoutMode) throws ParsingException {
        if (divPagerLayoutMode instanceof DivPagerLayoutMode.d) {
            return this.f58977a.n5().getValue().serialize(parsingContext, ((DivPagerLayoutMode.d) divPagerLayoutMode).c());
        }
        if (divPagerLayoutMode instanceof DivPagerLayoutMode.b) {
            return this.f58977a.b5().getValue().serialize(parsingContext, ((DivPagerLayoutMode.b) divPagerLayoutMode).c());
        }
        if (divPagerLayoutMode instanceof DivPagerLayoutMode.c) {
            return this.f58977a.k5().getValue().serialize(parsingContext, ((DivPagerLayoutMode.c) divPagerLayoutMode).c());
        }
        throw new NoWhenBranchMatchedException();
    }
}
