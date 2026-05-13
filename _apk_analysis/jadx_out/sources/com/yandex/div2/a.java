package com.yandex.div2;

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

/* JADX INFO: compiled from: DivAbsoluteEdgeInsetsJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C0724a f58695a = new C0724a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f58696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f58697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f58698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f58699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f58700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f58701g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f58702h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f58703i;

    /* JADX INFO: renamed from: com.yandex.div2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DivAbsoluteEdgeInsetsJsonParser.kt */
    public static final class C0724a {
        public C0724a() {
        }

        public /* synthetic */ C0724a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivAbsoluteEdgeInsetsJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58704a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58704a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivAbsoluteEdgeInsets deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = a.f58700f;
            Expression<Long> expression = a.f58696b;
            Expression<Long> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "bottom", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            ValueValidator<Long> valueValidator2 = a.f58701g;
            Expression<Long> expression2 = a.f58697c;
            Expression<Long> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "left", typeHelper, lVar, valueValidator2, expression2);
            if (optionalExpression2 != null) {
                expression2 = optionalExpression2;
            }
            ValueValidator<Long> valueValidator3 = a.f58702h;
            Expression<Long> expression3 = a.f58698d;
            Expression<Long> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "right", typeHelper, lVar, valueValidator3, expression3);
            if (optionalExpression3 != null) {
                expression3 = optionalExpression3;
            }
            ValueValidator<Long> valueValidator4 = a.f58703i;
            Expression<Long> expression4 = a.f58699e;
            Expression<Long> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "top", typeHelper, lVar, valueValidator4, expression4);
            if (optionalExpression4 != null) {
                expression4 = optionalExpression4;
            }
            return new DivAbsoluteEdgeInsets(expression, expression2, expression3, expression4);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivAbsoluteEdgeInsets divAbsoluteEdgeInsets) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "bottom", divAbsoluteEdgeInsets.f54122a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "left", divAbsoluteEdgeInsets.f54123b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "right", divAbsoluteEdgeInsets.f54124c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "top", divAbsoluteEdgeInsets.f54125d);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivAbsoluteEdgeInsetsJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58705a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58705a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivAbsoluteEdgeInsetsTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivAbsoluteEdgeInsetsTemplate divAbsoluteEdgeInsetsTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divAbsoluteEdgeInsetsTemplate != null ? divAbsoluteEdgeInsetsTemplate.f54133a : null;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivAbsoluteEdgeInsetsTemplate((Field<Expression<Long>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "bottom", typeHelper, allowPropertyOverride, field, lVar, a.f58700f), (Field<Expression<Long>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "left", typeHelper, allowPropertyOverride, divAbsoluteEdgeInsetsTemplate != null ? divAbsoluteEdgeInsetsTemplate.f54134b : null, lVar, a.f58701g), (Field<Expression<Long>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "right", typeHelper, allowPropertyOverride, divAbsoluteEdgeInsetsTemplate != null ? divAbsoluteEdgeInsetsTemplate.f54135c : null, lVar, a.f58702h), (Field<Expression<Long>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "top", typeHelper, allowPropertyOverride, divAbsoluteEdgeInsetsTemplate != null ? divAbsoluteEdgeInsetsTemplate.f54136d : null, lVar, a.f58703i));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivAbsoluteEdgeInsetsTemplate divAbsoluteEdgeInsetsTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "bottom", divAbsoluteEdgeInsetsTemplate.f54133a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "left", divAbsoluteEdgeInsetsTemplate.f54134b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "right", divAbsoluteEdgeInsetsTemplate.f54135c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "top", divAbsoluteEdgeInsetsTemplate.f54136d);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivAbsoluteEdgeInsetsJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivAbsoluteEdgeInsetsTemplate, DivAbsoluteEdgeInsets> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58706a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58706a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivAbsoluteEdgeInsets resolve(@NotNull ParsingContext parsingContext, @NotNull DivAbsoluteEdgeInsetsTemplate divAbsoluteEdgeInsetsTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Field<Expression<Long>> field = divAbsoluteEdgeInsetsTemplate.f54133a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = a.f58700f;
            Expression<Long> expression = a.f58696b;
            Expression<Long> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "bottom", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression == null) {
                expressionResolveOptionalExpression = expression;
            }
            Field<Expression<Long>> field2 = divAbsoluteEdgeInsetsTemplate.f54134b;
            ValueValidator<Long> valueValidator2 = a.f58701g;
            Expression<Long> expression2 = a.f58697c;
            Expression<Long> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "left", typeHelper, lVar, valueValidator2, expression2);
            if (expressionResolveOptionalExpression2 != null) {
                expression2 = expressionResolveOptionalExpression2;
            }
            Field<Expression<Long>> field3 = divAbsoluteEdgeInsetsTemplate.f54135c;
            ValueValidator<Long> valueValidator3 = a.f58702h;
            Expression<Long> expression3 = a.f58698d;
            Expression<Long> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "right", typeHelper, lVar, valueValidator3, expression3);
            if (expressionResolveOptionalExpression3 != null) {
                expression3 = expressionResolveOptionalExpression3;
            }
            Field<Expression<Long>> field4 = divAbsoluteEdgeInsetsTemplate.f54136d;
            ValueValidator<Long> valueValidator4 = a.f58703i;
            Expression<Long> expression4 = a.f58699e;
            Expression<Long> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "top", typeHelper, lVar, valueValidator4, expression4);
            if (expressionResolveOptionalExpression4 != null) {
                expression4 = expressionResolveOptionalExpression4;
            }
            return new DivAbsoluteEdgeInsets(expressionResolveOptionalExpression, expression2, expression3, expression4);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f58696b = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f58697c = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f58698d = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f58699e = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f58700f = new ValueValidator() { // from class: ah.e0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return com.yandex.div2.a.e(((Long) obj).longValue());
            }
        };
        f58701g = new ValueValidator() { // from class: ah.f0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return com.yandex.div2.a.f(((Long) obj).longValue());
            }
        };
        f58702h = new ValueValidator() { // from class: ah.g0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return com.yandex.div2.a.g(((Long) obj).longValue());
            }
        };
        f58703i = new ValueValidator() { // from class: ah.h0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return com.yandex.div2.a.h(((Long) obj).longValue());
            }
        };
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
