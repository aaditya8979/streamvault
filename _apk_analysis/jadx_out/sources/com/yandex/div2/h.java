package com.yandex.div2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivActionScrollDestination;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionScrollDestinationJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58801a;

    public h(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58801a = jsonParserComponent;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionScrollDestination deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        switch (string.hashCode()) {
            case -1019779949:
                if (string.equals(TypedValues.CycleType.S_WAVE_OFFSET)) {
                    return new DivActionScrollDestination.d(this.f58801a.U9().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 100571:
                if (string.equals("end")) {
                    return new DivActionScrollDestination.b(this.f58801a.C9().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 100346066:
                if (string.equals("index")) {
                    return new DivActionScrollDestination.c(this.f58801a.F9().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 109757538:
                if (string.equals("start")) {
                    return new DivActionScrollDestination.e(this.f58801a.aa().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivActionScrollDestinationTemplate divActionScrollDestinationTemplate = orThrow instanceof DivActionScrollDestinationTemplate ? (DivActionScrollDestinationTemplate) orThrow : null;
        if (divActionScrollDestinationTemplate != null) {
            return this.f58801a.F0().getValue().resolve(parsingContext, divActionScrollDestinationTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivActionScrollDestination divActionScrollDestination) throws ParsingException {
        if (divActionScrollDestination instanceof DivActionScrollDestination.d) {
            return this.f58801a.U9().getValue().serialize(parsingContext, ((DivActionScrollDestination.d) divActionScrollDestination).c());
        }
        if (divActionScrollDestination instanceof DivActionScrollDestination.c) {
            return this.f58801a.F9().getValue().serialize(parsingContext, ((DivActionScrollDestination.c) divActionScrollDestination).c());
        }
        if (divActionScrollDestination instanceof DivActionScrollDestination.e) {
            return this.f58801a.aa().getValue().serialize(parsingContext, ((DivActionScrollDestination.e) divActionScrollDestination).c());
        }
        if (divActionScrollDestination instanceof DivActionScrollDestination.b) {
            return this.f58801a.C9().getValue().serialize(parsingContext, ((DivActionScrollDestination.b) divActionScrollDestination).c());
        }
        throw new NoWhenBranchMatchedException();
    }
}
