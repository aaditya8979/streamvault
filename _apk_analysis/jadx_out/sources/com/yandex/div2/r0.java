package com.yandex.div2;

import com.ironsource.C3978d4;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivCornersRadiusJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f58981a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f58982b = new ValueValidator() { // from class: ah.u2
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.r0.e(((Long) obj).longValue());
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f58983c = new ValueValidator() { // from class: ah.v2
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.r0.f(((Long) obj).longValue());
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f58984d = new ValueValidator() { // from class: ah.w2
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.r0.g(((Long) obj).longValue());
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f58985e = new ValueValidator() { // from class: ah.x2
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return com.yandex.div2.r0.h(((Long) obj).longValue());
        }
    };

    /* JADX INFO: compiled from: DivCornersRadiusJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivCornersRadiusJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58986a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58986a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCornersRadius deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivCornersRadius(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, C3978d4.e.f31276e, typeHelper, lVar, r0.f58982b), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, C3978d4.e.f31275d, typeHelper, lVar, r0.f58983c), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, C3978d4.e.f31274c, typeHelper, lVar, r0.f58984d), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, C3978d4.e.f31273b, typeHelper, lVar, r0.f58985e));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivCornersRadius divCornersRadius) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, C3978d4.e.f31276e, divCornersRadius.f54981a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, C3978d4.e.f31275d, divCornersRadius.f54982b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, C3978d4.e.f31274c, divCornersRadius.f54983c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, C3978d4.e.f31273b, divCornersRadius.f54984d);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivCornersRadiusJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58987a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58987a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCornersRadiusTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivCornersRadiusTemplate divCornersRadiusTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divCornersRadiusTemplate != null ? divCornersRadiusTemplate.f54988a : null;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivCornersRadiusTemplate((Field<Expression<Long>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, C3978d4.e.f31276e, typeHelper, allowPropertyOverride, field, lVar, r0.f58982b), (Field<Expression<Long>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, C3978d4.e.f31275d, typeHelper, allowPropertyOverride, divCornersRadiusTemplate != null ? divCornersRadiusTemplate.f54989b : null, lVar, r0.f58983c), (Field<Expression<Long>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, C3978d4.e.f31274c, typeHelper, allowPropertyOverride, divCornersRadiusTemplate != null ? divCornersRadiusTemplate.f54990c : null, lVar, r0.f58984d), (Field<Expression<Long>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, C3978d4.e.f31273b, typeHelper, allowPropertyOverride, divCornersRadiusTemplate != null ? divCornersRadiusTemplate.f54991d : null, lVar, r0.f58985e));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivCornersRadiusTemplate divCornersRadiusTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, C3978d4.e.f31276e, divCornersRadiusTemplate.f54988a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, C3978d4.e.f31275d, divCornersRadiusTemplate.f54989b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, C3978d4.e.f31274c, divCornersRadiusTemplate.f54990c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, C3978d4.e.f31273b, divCornersRadiusTemplate.f54991d);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivCornersRadiusJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivCornersRadiusTemplate, DivCornersRadius> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58988a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58988a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCornersRadius resolve(@NotNull ParsingContext parsingContext, @NotNull DivCornersRadiusTemplate divCornersRadiusTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Field<Expression<Long>> field = divCornersRadiusTemplate.f54988a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivCornersRadius(JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, C3978d4.e.f31276e, typeHelper, lVar, r0.f58982b), JsonFieldResolver.resolveOptionalExpression(parsingContext, divCornersRadiusTemplate.f54989b, jSONObject, C3978d4.e.f31275d, typeHelper, lVar, r0.f58983c), JsonFieldResolver.resolveOptionalExpression(parsingContext, divCornersRadiusTemplate.f54990c, jSONObject, C3978d4.e.f31274c, typeHelper, lVar, r0.f58984d), JsonFieldResolver.resolveOptionalExpression(parsingContext, divCornersRadiusTemplate.f54991d, jSONObject, C3978d4.e.f31273b, typeHelper, lVar, r0.f58985e));
        }
    }

    public static final boolean e(long j10) {
        return j10 >= 0;
    }

    public static final boolean f(long j10) {
        return j10 >= 0;
    }

    public static final boolean g(long j10) {
        return j10 >= 0;
    }

    public static final boolean h(long j10) {
        return j10 >= 0;
    }
}
