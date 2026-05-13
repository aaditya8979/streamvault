package com.yandex.div2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivActionScrollDestinationTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionScrollDestinationJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58818a;

    public i(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58818a = jsonParserComponent;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionScrollDestinationTemplate deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivActionScrollDestinationTemplate divActionScrollDestinationTemplate = entityTemplate instanceof DivActionScrollDestinationTemplate ? (DivActionScrollDestinationTemplate) entityTemplate : null;
        if (divActionScrollDestinationTemplate != null && (type = divActionScrollDestinationTemplate.getType()) != null) {
            string = type;
        }
        switch (string.hashCode()) {
            case -1019779949:
                if (string.equals(TypedValues.CycleType.S_WAVE_OFFSET)) {
                    return new DivActionScrollDestinationTemplate.d(this.f58818a.V9().getValue().deserialize(parsingContext, (OffsetDestinationTemplate) (divActionScrollDestinationTemplate != null ? divActionScrollDestinationTemplate.a() : null), jSONObject));
                }
                break;
            case 100571:
                if (string.equals("end")) {
                    return new DivActionScrollDestinationTemplate.b(this.f58818a.D9().getValue().deserialize(parsingContext, (EndDestinationTemplate) (divActionScrollDestinationTemplate != null ? divActionScrollDestinationTemplate.a() : null), jSONObject));
                }
                break;
            case 100346066:
                if (string.equals("index")) {
                    return new DivActionScrollDestinationTemplate.c(this.f58818a.G9().getValue().deserialize(parsingContext, (IndexDestinationTemplate) (divActionScrollDestinationTemplate != null ? divActionScrollDestinationTemplate.a() : null), jSONObject));
                }
                break;
            case 109757538:
                if (string.equals("start")) {
                    return new DivActionScrollDestinationTemplate.e(this.f58818a.ba().getValue().deserialize(parsingContext, (StartDestinationTemplate) (divActionScrollDestinationTemplate != null ? divActionScrollDestinationTemplate.a() : null), jSONObject));
                }
                break;
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivActionScrollDestinationTemplate divActionScrollDestinationTemplate) throws ParsingException {
        if (divActionScrollDestinationTemplate instanceof DivActionScrollDestinationTemplate.d) {
            return this.f58818a.V9().getValue().serialize(parsingContext, ((DivActionScrollDestinationTemplate.d) divActionScrollDestinationTemplate).b());
        }
        if (divActionScrollDestinationTemplate instanceof DivActionScrollDestinationTemplate.c) {
            return this.f58818a.G9().getValue().serialize(parsingContext, ((DivActionScrollDestinationTemplate.c) divActionScrollDestinationTemplate).b());
        }
        if (divActionScrollDestinationTemplate instanceof DivActionScrollDestinationTemplate.e) {
            return this.f58818a.ba().getValue().serialize(parsingContext, ((DivActionScrollDestinationTemplate.e) divActionScrollDestinationTemplate).b());
        }
        if (divActionScrollDestinationTemplate instanceof DivActionScrollDestinationTemplate.b) {
            return this.f58818a.D9().getValue().serialize(parsingContext, ((DivActionScrollDestinationTemplate.b) divActionScrollDestinationTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }
}
