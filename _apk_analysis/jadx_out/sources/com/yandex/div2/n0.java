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

/* JADX INFO: compiled from: DivCloudBackgroundJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f58920a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f58921b = new ValueValidator() { // from class: ah.k2
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.n0.b(((Long) obj).longValue());
        }
    };

    /* JADX INFO: compiled from: DivCloudBackgroundJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivCloudBackgroundJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58922a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58922a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCloudBackground deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            return new DivCloudBackground(JsonExpressionParser.readExpression(parsingContext, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonExpressionParser.readExpression(parsingContext, jSONObject, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, n0.f58921b), (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f58922a.Y2()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivCloudBackground divCloudBackground) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", divCloudBackground.f54755a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "corner_radius", divCloudBackground.f54756b);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divCloudBackground.f54757c, this.f58922a.Y2());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "cloud");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivCloudBackgroundJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58923a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58923a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCloudBackgroundTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivCloudBackgroundTemplate divCloudBackgroundTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivCloudBackgroundTemplate(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, divCloudBackgroundTemplate != null ? divCloudBackgroundTemplate.f54761a : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, divCloudBackgroundTemplate != null ? divCloudBackgroundTemplate.f54762b : null, ParsingConvertersKt.NUMBER_TO_INT, n0.f58921b), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divCloudBackgroundTemplate != null ? divCloudBackgroundTemplate.f54763c : null, this.f58923a.Z2()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivCloudBackgroundTemplate divCloudBackgroundTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", divCloudBackgroundTemplate.f54761a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "corner_radius", divCloudBackgroundTemplate.f54762b);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divCloudBackgroundTemplate.f54763c, this.f58923a.Z2());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "cloud");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivCloudBackgroundJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivCloudBackgroundTemplate, DivCloudBackground> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58924a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58924a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCloudBackground resolve(@NotNull ParsingContext parsingContext, @NotNull DivCloudBackgroundTemplate divCloudBackgroundTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            return new DivCloudBackground(JsonFieldResolver.resolveExpression(parsingContext, divCloudBackgroundTemplate.f54761a, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldResolver.resolveExpression(parsingContext, divCloudBackgroundTemplate.f54762b, jSONObject, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, n0.f58921b), (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divCloudBackgroundTemplate.f54763c, jSONObject, "paddings", this.f58924a.a3(), this.f58924a.Y2()));
        }
    }

    public static final boolean b(long j10) {
        return j10 >= 0;
    }
}
