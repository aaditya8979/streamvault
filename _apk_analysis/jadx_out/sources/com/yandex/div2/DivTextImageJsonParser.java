package com.yandex.div2;

import androidx.core.graphics.drawable.IconCompat;
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
import com.yandex.div2.DivText;
import com.yandex.div2.DivTextImageJsonParser;
import com.yandex.div2.DivTextTemplate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextJsonParser.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivTextImageJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f57721a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivTextAlignmentVertical> f57722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivFixedSize f57723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivText.Image.IndexingDirection> f57724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f57725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivBlendMode> f57726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivFixedSize f57727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivTextAlignmentVertical> f57728h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivText.Image.IndexingDirection> f57729i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivBlendMode> f57730j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f57731k;

    /* JADX INFO: compiled from: DivTextJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivTextJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f57732a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f57732a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivText.Image deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            DivText.Image.Accessibility accessibility = (DivText.Image.Accessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f57732a.j8());
            TypeHelper<DivTextAlignmentVertical> typeHelper = DivTextImageJsonParser.f57728h;
            sn.l<String, DivTextAlignmentVertical> lVar = DivTextAlignmentVertical.FROM_STRING;
            Expression<DivTextAlignmentVertical> expression = DivTextImageJsonParser.f57722b;
            Expression<DivTextAlignmentVertical> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", typeHelper, lVar, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            DivFixedSize divFixedSize = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f57732a.w3());
            if (divFixedSize == null) {
                divFixedSize = DivTextImageJsonParser.f57723c;
            }
            DivFixedSize divFixedSize2 = divFixedSize;
            TypeHelper<DivText.Image.IndexingDirection> typeHelper2 = DivTextImageJsonParser.f57729i;
            sn.l<String, DivText.Image.IndexingDirection> lVar2 = DivText.Image.IndexingDirection.FROM_STRING;
            Expression<DivText.Image.IndexingDirection> expression2 = DivTextImageJsonParser.f57724d;
            Expression<DivText.Image.IndexingDirection> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "indexing_direction", typeHelper2, lVar2, expression2);
            if (optionalExpression2 != null) {
                expression2 = optionalExpression2;
            }
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression3 = DivTextImageJsonParser.f57725e;
            Expression<Boolean> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preload_required", typeHelper3, lVar3, expression3);
            if (optionalExpression3 != null) {
                expression3 = optionalExpression3;
            }
            Expression expression4 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "start", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, DivTextImageJsonParser.f57731k);
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "tint_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            TypeHelper<DivBlendMode> typeHelper4 = DivTextImageJsonParser.f57730j;
            sn.l<String, DivBlendMode> lVar4 = DivBlendMode.FROM_STRING;
            Expression<DivBlendMode> expression5 = DivTextImageJsonParser.f57726f;
            Expression<DivBlendMode> optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, IconCompat.EXTRA_TINT_MODE, typeHelper4, lVar4, expression5);
            if (optionalExpression5 != null) {
                expression5 = optionalExpression5;
            }
            Expression expression6 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            DivFixedSize divFixedSize3 = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f57732a.w3());
            if (divFixedSize3 == null) {
                divFixedSize3 = DivTextImageJsonParser.f57727g;
            }
            return new DivText.Image(accessibility, expression, divFixedSize2, expression2, expression3, expression4, optionalExpression4, expression5, expression6, divFixedSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivText.Image image) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", image.f57665a, this.f57732a.j8());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", image.f57666b, DivTextAlignmentVertical.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "height", image.f57667c, this.f57732a.w3());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "indexing_direction", image.f57668d, DivText.Image.IndexingDirection.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preload_required", image.f57669e);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start", image.f57670f);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "tint_color", image.f57671g, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, IconCompat.EXTRA_TINT_MODE, image.f57672h, DivBlendMode.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "url", image.f57673i, ParsingConvertersKt.URI_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "width", image.f57674j, this.f57732a.w3());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivTextJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f57733a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f57733a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTextTemplate.ImageTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivTextTemplate.ImageTemplate imageTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivTextTemplate.ImageTemplate(JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, imageTemplate != null ? imageTemplate.f57918a : null, this.f57733a.k8()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", DivTextImageJsonParser.f57728h, allowPropertyOverride, imageTemplate != null ? imageTemplate.f57919b : null, DivTextAlignmentVertical.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, imageTemplate != null ? imageTemplate.f57920c : null, this.f57733a.x3()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "indexing_direction", DivTextImageJsonParser.f57729i, allowPropertyOverride, imageTemplate != null ? imageTemplate.f57921d : null, DivText.Image.IndexingDirection.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "preload_required", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, imageTemplate != null ? imageTemplate.f57922e : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, imageTemplate != null ? imageTemplate.f57923f : null, ParsingConvertersKt.NUMBER_TO_INT, DivTextImageJsonParser.f57731k), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "tint_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, imageTemplate != null ? imageTemplate.f57924g : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, IconCompat.EXTRA_TINT_MODE, DivTextImageJsonParser.f57730j, allowPropertyOverride, imageTemplate != null ? imageTemplate.f57925h : null, DivBlendMode.FROM_STRING), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, imageTemplate != null ? imageTemplate.f57926i : null, ParsingConvertersKt.ANY_TO_URI), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, imageTemplate != null ? imageTemplate.f57927j : null, this.f57733a.x3()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTextTemplate.ImageTemplate imageTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", imageTemplate.f57918a, this.f57733a.k8());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", imageTemplate.f57919b, DivTextAlignmentVertical.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", imageTemplate.f57920c, this.f57733a.x3());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "indexing_direction", imageTemplate.f57921d, DivText.Image.IndexingDirection.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preload_required", imageTemplate.f57922e);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start", imageTemplate.f57923f);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "tint_color", imageTemplate.f57924g, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, IconCompat.EXTRA_TINT_MODE, imageTemplate.f57925h, DivBlendMode.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "url", imageTemplate.f57926i, ParsingConvertersKt.URI_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", imageTemplate.f57927j, this.f57733a.x3());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivTextJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivTextTemplate.ImageTemplate, DivText.Image> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f57734a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f57734a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivText.Image resolve(@NotNull ParsingContext parsingContext, @NotNull DivTextTemplate.ImageTemplate imageTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            DivText.Image.Accessibility accessibility = (DivText.Image.Accessibility) JsonFieldResolver.resolveOptional(parsingContext, imageTemplate.f57918a, jSONObject, "accessibility", this.f57734a.l8(), this.f57734a.j8());
            Field<Expression<DivTextAlignmentVertical>> field = imageTemplate.f57919b;
            TypeHelper<DivTextAlignmentVertical> typeHelper = DivTextImageJsonParser.f57728h;
            sn.l<String, DivTextAlignmentVertical> lVar = DivTextAlignmentVertical.FROM_STRING;
            Expression<DivTextAlignmentVertical> expression = DivTextImageJsonParser.f57722b;
            Expression<DivTextAlignmentVertical> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alignment_vertical", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression == null) {
                expressionResolveOptionalExpression = expression;
            }
            DivFixedSize divFixedSize = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, imageTemplate.f57920c, jSONObject, "height", this.f57734a.y3(), this.f57734a.w3());
            if (divFixedSize == null) {
                divFixedSize = DivTextImageJsonParser.f57723c;
            }
            Field<Expression<DivText.Image.IndexingDirection>> field2 = imageTemplate.f57921d;
            TypeHelper<DivText.Image.IndexingDirection> typeHelper2 = DivTextImageJsonParser.f57729i;
            sn.l<String, DivText.Image.IndexingDirection> lVar2 = DivText.Image.IndexingDirection.FROM_STRING;
            Expression<DivText.Image.IndexingDirection> expression2 = DivTextImageJsonParser.f57724d;
            Expression<DivText.Image.IndexingDirection> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "indexing_direction", typeHelper2, lVar2, expression2);
            if (expressionResolveOptionalExpression2 == null) {
                expressionResolveOptionalExpression2 = expression2;
            }
            Field<Expression<Boolean>> field3 = imageTemplate.f57922e;
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression3 = DivTextImageJsonParser.f57725e;
            Expression<Boolean> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "preload_required", typeHelper3, lVar3, expression3);
            if (expressionResolveOptionalExpression3 != null) {
                expression3 = expressionResolveOptionalExpression3;
            }
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, imageTemplate.f57923f, jSONObject, "start", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, DivTextImageJsonParser.f57731k);
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, imageTemplate.f57924g, jSONObject, "tint_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Field<Expression<DivBlendMode>> field4 = imageTemplate.f57925h;
            TypeHelper<DivBlendMode> typeHelper4 = DivTextImageJsonParser.f57730j;
            sn.l<String, DivBlendMode> lVar4 = DivBlendMode.FROM_STRING;
            Expression<DivBlendMode> expression4 = DivTextImageJsonParser.f57726f;
            Expression<DivBlendMode> expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, IconCompat.EXTRA_TINT_MODE, typeHelper4, lVar4, expression4);
            if (expressionResolveOptionalExpression5 != null) {
                expression4 = expressionResolveOptionalExpression5;
            }
            Expression expressionResolveExpression2 = JsonFieldResolver.resolveExpression(parsingContext, imageTemplate.f57926i, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            DivFixedSize divFixedSize2 = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, imageTemplate.f57927j, jSONObject, "width", this.f57734a.y3(), this.f57734a.w3());
            if (divFixedSize2 == null) {
                divFixedSize2 = DivTextImageJsonParser.f57727g;
            }
            return new DivText.Image(accessibility, expressionResolveOptionalExpression, divFixedSize, expressionResolveOptionalExpression2, expression3, expressionResolveExpression, expressionResolveOptionalExpression4, expression4, expressionResolveExpression2, divFixedSize2);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivTextAlignmentVertical divTextAlignmentVertical = DivTextAlignmentVertical.CENTER;
        f57722b = Expression.Companion.constant$default(companion, divTextAlignmentVertical, null, 2, null);
        f57723c = new DivFixedSize(null, Expression.Companion.constant$default(companion, 20L, null, 2, null), 1, null);
        DivText.Image.IndexingDirection indexingDirection = DivText.Image.IndexingDirection.NORMAL;
        f57724d = Expression.Companion.constant$default(companion, indexingDirection, null, 2, null);
        f57725e = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        DivBlendMode divBlendMode = DivBlendMode.SOURCE_IN;
        f57726f = Expression.Companion.constant$default(companion, divBlendMode, null, 2, null);
        f57727g = new DivFixedSize(null, Expression.Companion.constant$default(companion, 20L, null, 2, null), 1, null);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f57728h = companion2.from(divTextAlignmentVertical, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextImageJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivTextAlignmentVertical);
            }
        });
        f57729i = companion2.from(indexingDirection, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextImageJsonParser$Companion$TYPE_HELPER_INDEXING_DIRECTION$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivText.Image.IndexingDirection);
            }
        });
        f57730j = companion2.from(divBlendMode, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextImageJsonParser$Companion$TYPE_HELPER_TINT_MODE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivBlendMode);
            }
        });
        f57731k = new ValueValidator() { // from class: ah.ra
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTextImageJsonParser.b(((Long) obj).longValue());
            }
        };
    }

    public static final boolean b(long j10) {
        return j10 >= 0;
    }
}
