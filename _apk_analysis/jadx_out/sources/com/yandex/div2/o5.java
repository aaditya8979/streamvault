package com.yandex.div2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: OffsetDestinationJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class o5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f58953a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f58954b = new ValueValidator() { // from class: ah.xc
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.o5.b(((Long) obj).longValue());
        }
    };

    /* JADX INFO: compiled from: OffsetDestinationJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: OffsetDestinationJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58955a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58955a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OffsetDestination deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            return new OffsetDestination(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, o5.f58954b));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull OffsetDestination offsetDestination) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", TypedValues.CycleType.S_WAVE_OFFSET);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", offsetDestination.f58630a);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: OffsetDestinationJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58956a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58956a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OffsetDestinationTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable OffsetDestinationTemplate offsetDestinationTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            return new OffsetDestinationTemplate(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, parsingContext.getAllowPropertyOverride(), offsetDestinationTemplate != null ? offsetDestinationTemplate.f58634a : null, ParsingConvertersKt.NUMBER_TO_INT, o5.f58954b));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull OffsetDestinationTemplate offsetDestinationTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", TypedValues.CycleType.S_WAVE_OFFSET);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", offsetDestinationTemplate.f58634a);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: OffsetDestinationJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, OffsetDestinationTemplate, OffsetDestination> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58957a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58957a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OffsetDestination resolve(@NotNull ParsingContext parsingContext, @NotNull OffsetDestinationTemplate offsetDestinationTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            return new OffsetDestination(JsonFieldResolver.resolveExpression(parsingContext, offsetDestinationTemplate.f58634a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, o5.f58954b));
        }
    }

    public static final boolean b(long j10) {
        return j10 >= 0;
    }
}
