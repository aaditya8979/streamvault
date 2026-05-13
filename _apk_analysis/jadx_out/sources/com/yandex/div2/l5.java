package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivVideoSource;
import com.yandex.div2.DivVideoSourceTemplate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivVideoSourceJsonParser.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class l5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f58880a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f58881b = new ValueValidator() { // from class: ah.zb
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.l5.c(((Long) obj).longValue());
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f58882c = new ValueValidator() { // from class: ah.ac
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.l5.d(((Long) obj).longValue());
        }
    };

    /* JADX INFO: compiled from: DivVideoSourceJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivVideoSourceJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58883a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58883a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivVideoSource.Resolution deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivVideoSource.Resolution(JsonExpressionParser.readExpression(parsingContext, jSONObject, "height", typeHelper, lVar, l5.f58881b), JsonExpressionParser.readExpression(parsingContext, jSONObject, "width", typeHelper, lVar, l5.f58882c));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivVideoSource.Resolution resolution) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "height", resolution.f58187a);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "resolution");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "width", resolution.f58188b);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivVideoSourceJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58884a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58884a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivVideoSourceTemplate.ResolutionTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivVideoSourceTemplate.ResolutionTemplate resolutionTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = resolutionTemplate != null ? resolutionTemplate.f58198a : null;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivVideoSourceTemplate.ResolutionTemplate(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "height", typeHelper, allowPropertyOverride, field, lVar, l5.f58881b), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "width", typeHelper, allowPropertyOverride, resolutionTemplate != null ? resolutionTemplate.f58199b : null, lVar, l5.f58882c));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivVideoSourceTemplate.ResolutionTemplate resolutionTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "height", resolutionTemplate.f58198a);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "resolution");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "width", resolutionTemplate.f58199b);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivVideoSourceJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivVideoSourceTemplate.ResolutionTemplate, DivVideoSource.Resolution> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58885a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58885a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivVideoSource.Resolution resolve(@NotNull ParsingContext parsingContext, @NotNull DivVideoSourceTemplate.ResolutionTemplate resolutionTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Field<Expression<Long>> field = resolutionTemplate.f58198a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivVideoSource.Resolution(JsonFieldResolver.resolveExpression(parsingContext, field, jSONObject, "height", typeHelper, lVar, l5.f58881b), JsonFieldResolver.resolveExpression(parsingContext, resolutionTemplate.f58199b, jSONObject, "width", typeHelper, lVar, l5.f58882c));
        }
    }

    public static final boolean c(long j10) {
        return j10 > 0;
    }

    public static final boolean d(long j10) {
        return j10 > 0;
    }
}
