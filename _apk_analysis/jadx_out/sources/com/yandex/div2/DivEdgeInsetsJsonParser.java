package com.yandex.div2;

import com.ironsource.Ne;
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
import com.yandex.div2.DivEdgeInsetsJsonParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivEdgeInsetsJsonParser.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivEdgeInsetsJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f55207a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f55208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f55209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f55210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f55211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivSizeUnit> f55212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivSizeUnit> f55213g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f55214h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f55215i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f55216j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f55217k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f55218l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f55219m;

    /* JADX INFO: compiled from: DivEdgeInsetsJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivEdgeInsetsJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f55220a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f55220a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivEdgeInsets deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = DivEdgeInsetsJsonParser.f55214h;
            Expression<Long> expression = DivEdgeInsetsJsonParser.f55208b;
            Expression<Long> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "bottom", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "end", typeHelper, lVar, DivEdgeInsetsJsonParser.f55215i);
            ValueValidator<Long> valueValidator2 = DivEdgeInsetsJsonParser.f55216j;
            Expression<Long> expression2 = DivEdgeInsetsJsonParser.f55209c;
            Expression<Long> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "left", typeHelper, lVar, valueValidator2, expression2);
            if (optionalExpression3 != null) {
                expression2 = optionalExpression3;
            }
            ValueValidator<Long> valueValidator3 = DivEdgeInsetsJsonParser.f55217k;
            Expression<Long> expression3 = DivEdgeInsetsJsonParser.f55210d;
            Expression<Long> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "right", typeHelper, lVar, valueValidator3, expression3);
            if (optionalExpression4 != null) {
                expression3 = optionalExpression4;
            }
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start", typeHelper, lVar, DivEdgeInsetsJsonParser.f55218l);
            ValueValidator<Long> valueValidator4 = DivEdgeInsetsJsonParser.f55219m;
            Expression<Long> expression4 = DivEdgeInsetsJsonParser.f55211e;
            Expression<Long> optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "top", typeHelper, lVar, valueValidator4, expression4);
            Expression<Long> expression5 = optionalExpression6 == null ? expression4 : optionalExpression6;
            TypeHelper<DivSizeUnit> typeHelper2 = DivEdgeInsetsJsonParser.f55213g;
            sn.l<String, DivSizeUnit> lVar2 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression6 = DivEdgeInsetsJsonParser.f55212f;
            Expression<DivSizeUnit> optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, Ne.f29954n1, typeHelper2, lVar2, expression6);
            if (optionalExpression7 != null) {
                expression6 = optionalExpression7;
            }
            return new DivEdgeInsets(expression, optionalExpression2, expression2, expression3, optionalExpression5, expression5, expression6);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivEdgeInsets divEdgeInsets) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "bottom", divEdgeInsets.f55199a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "end", divEdgeInsets.f55200b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "left", divEdgeInsets.f55201c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "right", divEdgeInsets.f55202d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start", divEdgeInsets.f55203e);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "top", divEdgeInsets.f55204f);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, Ne.f29954n1, divEdgeInsets.f55205g, DivSizeUnit.TO_STRING);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivEdgeInsetsJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f55221a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f55221a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivEdgeInsetsTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivEdgeInsetsTemplate divEdgeInsetsTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divEdgeInsetsTemplate != null ? divEdgeInsetsTemplate.f55230a : null;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivEdgeInsetsTemplate(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "bottom", typeHelper, allowPropertyOverride, field, lVar, DivEdgeInsetsJsonParser.f55214h), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "end", typeHelper, allowPropertyOverride, divEdgeInsetsTemplate != null ? divEdgeInsetsTemplate.f55231b : null, lVar, DivEdgeInsetsJsonParser.f55215i), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "left", typeHelper, allowPropertyOverride, divEdgeInsetsTemplate != null ? divEdgeInsetsTemplate.f55232c : null, lVar, DivEdgeInsetsJsonParser.f55216j), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "right", typeHelper, allowPropertyOverride, divEdgeInsetsTemplate != null ? divEdgeInsetsTemplate.f55233d : null, lVar, DivEdgeInsetsJsonParser.f55217k), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start", typeHelper, allowPropertyOverride, divEdgeInsetsTemplate != null ? divEdgeInsetsTemplate.f55234e : null, lVar, DivEdgeInsetsJsonParser.f55218l), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "top", typeHelper, allowPropertyOverride, divEdgeInsetsTemplate != null ? divEdgeInsetsTemplate.f55235f : null, lVar, DivEdgeInsetsJsonParser.f55219m), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, Ne.f29954n1, DivEdgeInsetsJsonParser.f55213g, allowPropertyOverride, divEdgeInsetsTemplate != null ? divEdgeInsetsTemplate.f55236g : null, DivSizeUnit.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivEdgeInsetsTemplate divEdgeInsetsTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "bottom", divEdgeInsetsTemplate.f55230a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "end", divEdgeInsetsTemplate.f55231b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "left", divEdgeInsetsTemplate.f55232c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "right", divEdgeInsetsTemplate.f55233d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start", divEdgeInsetsTemplate.f55234e);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "top", divEdgeInsetsTemplate.f55235f);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, Ne.f29954n1, divEdgeInsetsTemplate.f55236g, DivSizeUnit.TO_STRING);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivEdgeInsetsJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivEdgeInsetsTemplate, DivEdgeInsets> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f55222a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f55222a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivEdgeInsets resolve(@NotNull ParsingContext parsingContext, @NotNull DivEdgeInsetsTemplate divEdgeInsetsTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Field<Expression<Long>> field = divEdgeInsetsTemplate.f55230a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = DivEdgeInsetsJsonParser.f55214h;
            Expression<Long> expression = DivEdgeInsetsJsonParser.f55208b;
            Expression<Long> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "bottom", typeHelper, lVar, valueValidator, expression);
            Expression<Long> expression2 = expressionResolveOptionalExpression == null ? expression : expressionResolveOptionalExpression;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divEdgeInsetsTemplate.f55231b, jSONObject, "end", typeHelper, lVar, DivEdgeInsetsJsonParser.f55215i);
            Field<Expression<Long>> field2 = divEdgeInsetsTemplate.f55232c;
            ValueValidator<Long> valueValidator2 = DivEdgeInsetsJsonParser.f55216j;
            Expression<Long> expression3 = DivEdgeInsetsJsonParser.f55209c;
            Expression<Long> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "left", typeHelper, lVar, valueValidator2, expression3);
            Expression<Long> expression4 = expressionResolveOptionalExpression3 == null ? expression3 : expressionResolveOptionalExpression3;
            Field<Expression<Long>> field3 = divEdgeInsetsTemplate.f55233d;
            ValueValidator<Long> valueValidator3 = DivEdgeInsetsJsonParser.f55217k;
            Expression<Long> expression5 = DivEdgeInsetsJsonParser.f55210d;
            Expression<Long> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "right", typeHelper, lVar, valueValidator3, expression5);
            Expression<Long> expression6 = expressionResolveOptionalExpression4 == null ? expression5 : expressionResolveOptionalExpression4;
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divEdgeInsetsTemplate.f55234e, jSONObject, "start", typeHelper, lVar, DivEdgeInsetsJsonParser.f55218l);
            Field<Expression<Long>> field4 = divEdgeInsetsTemplate.f55235f;
            ValueValidator<Long> valueValidator4 = DivEdgeInsetsJsonParser.f55219m;
            Expression<Long> expression7 = DivEdgeInsetsJsonParser.f55211e;
            Expression<Long> expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "top", typeHelper, lVar, valueValidator4, expression7);
            Expression<Long> expression8 = expressionResolveOptionalExpression6 == null ? expression7 : expressionResolveOptionalExpression6;
            Field<Expression<DivSizeUnit>> field5 = divEdgeInsetsTemplate.f55236g;
            TypeHelper<DivSizeUnit> typeHelper2 = DivEdgeInsetsJsonParser.f55213g;
            sn.l<String, DivSizeUnit> lVar2 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression9 = DivEdgeInsetsJsonParser.f55212f;
            Expression<DivSizeUnit> expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, Ne.f29954n1, typeHelper2, lVar2, expression9);
            return new DivEdgeInsets(expression2, expressionResolveOptionalExpression2, expression4, expression6, expressionResolveOptionalExpression5, expression8, expressionResolveOptionalExpression7 == null ? expression9 : expressionResolveOptionalExpression7);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f55208b = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f55209c = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f55210d = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f55211e = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        DivSizeUnit divSizeUnit = DivSizeUnit.DP;
        f55212f = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        f55213g = TypeHelper.Companion.from(divSizeUnit, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivEdgeInsetsJsonParser$Companion$TYPE_HELPER_UNIT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        });
        f55214h = new ValueValidator() { // from class: ah.m3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivEdgeInsetsJsonParser.g(((Long) obj).longValue());
            }
        };
        f55215i = new ValueValidator() { // from class: ah.n3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivEdgeInsetsJsonParser.h(((Long) obj).longValue());
            }
        };
        f55216j = new ValueValidator() { // from class: ah.o3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivEdgeInsetsJsonParser.i(((Long) obj).longValue());
            }
        };
        f55217k = new ValueValidator() { // from class: ah.p3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivEdgeInsetsJsonParser.j(((Long) obj).longValue());
            }
        };
        f55218l = new ValueValidator() { // from class: ah.q3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivEdgeInsetsJsonParser.k(((Long) obj).longValue());
            }
        };
        f55219m = new ValueValidator() { // from class: ah.r3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivEdgeInsetsJsonParser.l(((Long) obj).longValue());
            }
        };
    }

    public static final boolean g(long j10) {
        return j10 >= 0;
    }

    public static final boolean h(long j10) {
        return j10 >= 0;
    }

    public static final boolean i(long j10) {
        return j10 >= 0;
    }

    public static final boolean j(long j10) {
        return j10 >= 0;
    }

    public static final boolean k(long j10) {
        return j10 >= 0;
    }

    public static final boolean l(long j10) {
        return j10 >= 0;
    }
}
