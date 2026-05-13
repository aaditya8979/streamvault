package com.yandex.div2;

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

/* JADX INFO: compiled from: DivPercentageSizeJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f59032a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Double> f59033b = new ValueValidator() { // from class: ah.q7
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.w2.b(((Double) obj).doubleValue());
        }
    };

    /* JADX INFO: compiled from: DivPercentageSizeJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivPercentageSizeJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f59034a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f59034a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivPercentageSize deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            return new DivPercentageSize(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, w2.f59033b));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivPercentageSize divPercentageSize) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "percentage");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", divPercentageSize.f56516a);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivPercentageSizeJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f59035a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f59035a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivPercentageSizeTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivPercentageSizeTemplate divPercentageSizeTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            return new DivPercentageSizeTemplate(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, parsingContext.getAllowPropertyOverride(), divPercentageSizeTemplate != null ? divPercentageSizeTemplate.f56520a : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, w2.f59033b));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivPercentageSizeTemplate divPercentageSizeTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "percentage");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", divPercentageSizeTemplate.f56520a);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivPercentageSizeJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivPercentageSizeTemplate, DivPercentageSize> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f59036a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f59036a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivPercentageSize resolve(@NotNull ParsingContext parsingContext, @NotNull DivPercentageSizeTemplate divPercentageSizeTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            return new DivPercentageSize(JsonFieldResolver.resolveExpression(parsingContext, divPercentageSizeTemplate.f56520a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, w2.f59033b));
        }
    }

    public static final boolean b(double d10) {
        return d10 > 0.0d;
    }
}
