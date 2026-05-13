package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
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

/* JADX INFO: compiled from: DivAspectJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f58725a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Double> f58726b = new ValueValidator() { // from class: ah.d2
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.c0.b(((Double) obj).doubleValue());
        }
    };

    /* JADX INFO: compiled from: DivAspectJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivAspectJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58727a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58727a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivAspect deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            return new DivAspect(JsonExpressionParser.readExpression(parsingContext, jSONObject, "ratio", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, c0.f58726b));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivAspect divAspect) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "ratio", divAspect.f54651a);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivAspectJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58728a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58728a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivAspectTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivAspectTemplate divAspectTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            return new DivAspectTemplate(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "ratio", TypeHelpersKt.TYPE_HELPER_DOUBLE, parsingContext.getAllowPropertyOverride(), divAspectTemplate != null ? divAspectTemplate.f54655a : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, c0.f58726b));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivAspectTemplate divAspectTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "ratio", divAspectTemplate.f54655a);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivAspectJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivAspectTemplate, DivAspect> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58729a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58729a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivAspect resolve(@NotNull ParsingContext parsingContext, @NotNull DivAspectTemplate divAspectTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            return new DivAspect(JsonFieldResolver.resolveExpression(parsingContext, divAspectTemplate.f54655a, jSONObject, "ratio", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, c0.f58726b));
        }
    }

    public static final boolean b(double d10) {
        return d10 > 0.0d;
    }
}
