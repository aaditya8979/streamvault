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
import com.yandex.div2.DivImageBackgroundJsonParser;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivImageBackgroundJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivImageBackgroundJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f55739a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f55740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivAlignmentHorizontal> f55741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivAlignmentVertical> f55742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f55743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivImageScale> f55744f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f55745g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f55746h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivImageScale> f55747i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Double> f55748j;

    /* JADX INFO: compiled from: DivImageBackgroundJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivImageBackgroundJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f55749a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f55749a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivImageBackground deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivImageBackgroundJsonParser.f55748j;
            Expression<Double> expression = DivImageBackgroundJsonParser.f55740b;
            Expression<Double> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            TypeHelper<DivAlignmentHorizontal> typeHelper2 = DivImageBackgroundJsonParser.f55745g;
            sn.l<String, DivAlignmentHorizontal> lVar2 = DivAlignmentHorizontal.FROM_STRING;
            Expression<DivAlignmentHorizontal> expression2 = DivImageBackgroundJsonParser.f55741c;
            Expression<DivAlignmentHorizontal> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_horizontal", typeHelper2, lVar2, expression2);
            if (optionalExpression2 != null) {
                expression2 = optionalExpression2;
            }
            TypeHelper<DivAlignmentVertical> typeHelper3 = DivImageBackgroundJsonParser.f55746h;
            sn.l<String, DivAlignmentVertical> lVar3 = DivAlignmentVertical.FROM_STRING;
            Expression<DivAlignmentVertical> expression3 = DivImageBackgroundJsonParser.f55742d;
            Expression<DivAlignmentVertical> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_vertical", typeHelper3, lVar3, expression3);
            if (optionalExpression3 != null) {
                expression3 = optionalExpression3;
            }
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "filters", this.f55749a.h3());
            Expression expression4 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression5 = DivImageBackgroundJsonParser.f55743e;
            Expression<Boolean> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preload_required", typeHelper4, lVar4, expression5);
            if (optionalExpression4 != null) {
                expression5 = optionalExpression4;
            }
            TypeHelper<DivImageScale> typeHelper5 = DivImageBackgroundJsonParser.f55747i;
            sn.l<String, DivImageScale> lVar5 = DivImageScale.FROM_STRING;
            Expression<DivImageScale> expression6 = DivImageBackgroundJsonParser.f55744f;
            Expression<DivImageScale> optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scale", typeHelper5, lVar5, expression6);
            return new DivImageBackground(expression, expression2, expression3, optionalList, expression4, expression5, optionalExpression5 == null ? expression6 : optionalExpression5);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivImageBackground divImageBackground) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divImageBackground.f55731a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_horizontal", divImageBackground.f55732b, DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_vertical", divImageBackground.f55733c, DivAlignmentVertical.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "filters", divImageBackground.f55734d, this.f55749a.h3());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "image_url", divImageBackground.f55735e, ParsingConvertersKt.URI_TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preload_required", divImageBackground.f55736f);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scale", divImageBackground.f55737g, DivImageScale.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "image");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivImageBackgroundJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f55750a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f55750a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivImageBackgroundTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivImageBackgroundTemplate divImageBackgroundTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            c cVar;
            Field<List<DivFilterTemplate>> field;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divImageBackgroundTemplate != null ? divImageBackgroundTemplate.f55759a : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivImageBackgroundJsonParser.f55748j);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "content_alignment_horizontal", DivImageBackgroundJsonParser.f55745g, allowPropertyOverride, divImageBackgroundTemplate != null ? divImageBackgroundTemplate.f55760b : null, DivAlignmentHorizontal.FROM_STRING);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "content_alignment_vertical", DivImageBackgroundJsonParser.f55746h, allowPropertyOverride, divImageBackgroundTemplate != null ? divImageBackgroundTemplate.f55761c : null, DivAlignmentVertical.FROM_STRING);
            if (divImageBackgroundTemplate != null) {
                cVar = this;
                field = divImageBackgroundTemplate.f55762d;
            } else {
                cVar = this;
                field = null;
            }
            return new DivImageBackgroundTemplate(optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "filters", allowPropertyOverride, field, cVar.f55750a.i3()), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, divImageBackgroundTemplate != null ? divImageBackgroundTemplate.f55763e : null, ParsingConvertersKt.ANY_TO_URI), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "preload_required", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divImageBackgroundTemplate != null ? divImageBackgroundTemplate.f55764f : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "scale", DivImageBackgroundJsonParser.f55747i, allowPropertyOverride, divImageBackgroundTemplate != null ? divImageBackgroundTemplate.f55765g : null, DivImageScale.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivImageBackgroundTemplate divImageBackgroundTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divImageBackgroundTemplate.f55759a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_horizontal", divImageBackgroundTemplate.f55760b, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_vertical", divImageBackgroundTemplate.f55761c, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "filters", divImageBackgroundTemplate.f55762d, this.f55750a.i3());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "image_url", divImageBackgroundTemplate.f55763e, ParsingConvertersKt.URI_TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preload_required", divImageBackgroundTemplate.f55764f);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scale", divImageBackgroundTemplate.f55765g, DivImageScale.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "image");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivImageBackgroundJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivImageBackgroundTemplate, DivImageBackground> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f55751a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f55751a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivImageBackground resolve(@NotNull ParsingContext parsingContext, @NotNull DivImageBackgroundTemplate divImageBackgroundTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Field<Expression<Double>> field = divImageBackgroundTemplate.f55759a;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivImageBackgroundJsonParser.f55748j;
            Expression<Double> expression = DivImageBackgroundJsonParser.f55740b;
            Expression<Double> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Field<Expression<DivAlignmentHorizontal>> field2 = divImageBackgroundTemplate.f55760b;
            TypeHelper<DivAlignmentHorizontal> typeHelper2 = DivImageBackgroundJsonParser.f55745g;
            sn.l<String, DivAlignmentHorizontal> lVar2 = DivAlignmentHorizontal.FROM_STRING;
            Expression<DivAlignmentHorizontal> expression2 = DivImageBackgroundJsonParser.f55741c;
            Expression<DivAlignmentHorizontal> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "content_alignment_horizontal", typeHelper2, lVar2, expression2);
            if (expressionResolveOptionalExpression2 != null) {
                expression2 = expressionResolveOptionalExpression2;
            }
            Field<Expression<DivAlignmentVertical>> field3 = divImageBackgroundTemplate.f55761c;
            TypeHelper<DivAlignmentVertical> typeHelper3 = DivImageBackgroundJsonParser.f55746h;
            sn.l<String, DivAlignmentVertical> lVar3 = DivAlignmentVertical.FROM_STRING;
            Expression<DivAlignmentVertical> expression3 = DivImageBackgroundJsonParser.f55742d;
            Expression<DivAlignmentVertical> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "content_alignment_vertical", typeHelper3, lVar3, expression3);
            if (expressionResolveOptionalExpression3 != null) {
                expression3 = expressionResolveOptionalExpression3;
            }
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divImageBackgroundTemplate.f55762d, jSONObject, "filters", this.f55751a.j3(), this.f55751a.h3());
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divImageBackgroundTemplate.f55763e, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            Field<Expression<Boolean>> field4 = divImageBackgroundTemplate.f55764f;
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression4 = DivImageBackgroundJsonParser.f55743e;
            Expression<Boolean> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "preload_required", typeHelper4, lVar4, expression4);
            if (expressionResolveOptionalExpression4 != null) {
                expression4 = expressionResolveOptionalExpression4;
            }
            Field<Expression<DivImageScale>> field5 = divImageBackgroundTemplate.f55765g;
            TypeHelper<DivImageScale> typeHelper5 = DivImageBackgroundJsonParser.f55747i;
            sn.l<String, DivImageScale> lVar5 = DivImageScale.FROM_STRING;
            Expression<DivImageScale> expression5 = DivImageBackgroundJsonParser.f55744f;
            Expression<DivImageScale> expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "scale", typeHelper5, lVar5, expression5);
            if (expressionResolveOptionalExpression5 == null) {
                expressionResolveOptionalExpression5 = expression5;
            }
            return new DivImageBackground(expression, expression2, expression3, listResolveOptionalList, expressionResolveExpression, expression4, expressionResolveOptionalExpression5);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f55740b = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        DivAlignmentHorizontal divAlignmentHorizontal = DivAlignmentHorizontal.CENTER;
        f55741c = Expression.Companion.constant$default(companion, divAlignmentHorizontal, null, 2, null);
        DivAlignmentVertical divAlignmentVertical = DivAlignmentVertical.CENTER;
        f55742d = Expression.Companion.constant$default(companion, divAlignmentVertical, null, 2, null);
        f55743e = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        DivImageScale divImageScale = DivImageScale.FILL;
        f55744f = Expression.Companion.constant$default(companion, divImageScale, null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f55745g = companion2.from(divAlignmentHorizontal, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivImageBackgroundJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f55746h = companion2.from(divAlignmentVertical, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivImageBackgroundJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f55747i = companion2.from(divImageScale, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivImageBackgroundJsonParser$Companion$TYPE_HELPER_SCALE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivImageScale);
            }
        });
        f55748j = new ValueValidator() { // from class: ah.c5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivImageBackgroundJsonParser.b(((Double) obj).doubleValue());
            }
        };
    }

    public static final boolean b(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }
}
