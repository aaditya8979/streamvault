package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivSeparator;
import com.yandex.div2.DivSeparatorTemplate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSeparatorJsonParser.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivSeparatorDelimiterStyleJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f56851a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Integer> f56852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivSeparator.DelimiterStyle.Orientation> f56853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivSeparator.DelimiterStyle.Orientation> f56854d;

    /* JADX INFO: compiled from: DivSeparatorJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivSeparatorJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56855a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56855a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSeparator.DelimiterStyle deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            sn.l<Object, Integer> lVar = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression = DivSeparatorDelimiterStyleJsonParser.f56852b;
            Expression<Integer> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "color", typeHelper, lVar, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            TypeHelper<DivSeparator.DelimiterStyle.Orientation> typeHelper2 = DivSeparatorDelimiterStyleJsonParser.f56854d;
            sn.l<String, DivSeparator.DelimiterStyle.Orientation> lVar2 = DivSeparator.DelimiterStyle.Orientation.FROM_STRING;
            Expression<DivSeparator.DelimiterStyle.Orientation> expression2 = DivSeparatorDelimiterStyleJsonParser.f56853c;
            Expression<DivSeparator.DelimiterStyle.Orientation> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "orientation", typeHelper2, lVar2, expression2);
            if (optionalExpression2 != null) {
                expression2 = optionalExpression2;
            }
            return new DivSeparator.DelimiterStyle(expression, expression2);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivSeparator.DelimiterStyle delimiterStyle) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", delimiterStyle.f56847a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "orientation", delimiterStyle.f56848b, DivSeparator.DelimiterStyle.Orientation.TO_STRING);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivSeparatorJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56856a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56856a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSeparatorTemplate.DelimiterStyleTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivSeparatorTemplate.DelimiterStyleTemplate delimiterStyleTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivSeparatorTemplate.DelimiterStyleTemplate(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, delimiterStyleTemplate != null ? delimiterStyleTemplate.f56905a : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "orientation", DivSeparatorDelimiterStyleJsonParser.f56854d, allowPropertyOverride, delimiterStyleTemplate != null ? delimiterStyleTemplate.f56906b : null, DivSeparator.DelimiterStyle.Orientation.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivSeparatorTemplate.DelimiterStyleTemplate delimiterStyleTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", delimiterStyleTemplate.f56905a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "orientation", delimiterStyleTemplate.f56906b, DivSeparator.DelimiterStyle.Orientation.TO_STRING);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivSeparatorJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivSeparatorTemplate.DelimiterStyleTemplate, DivSeparator.DelimiterStyle> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56857a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56857a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSeparator.DelimiterStyle resolve(@NotNull ParsingContext parsingContext, @NotNull DivSeparatorTemplate.DelimiterStyleTemplate delimiterStyleTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Field<Expression<Integer>> field = delimiterStyleTemplate.f56905a;
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            sn.l<Object, Integer> lVar = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression = DivSeparatorDelimiterStyleJsonParser.f56852b;
            Expression<Integer> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "color", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Field<Expression<DivSeparator.DelimiterStyle.Orientation>> field2 = delimiterStyleTemplate.f56906b;
            TypeHelper<DivSeparator.DelimiterStyle.Orientation> typeHelper2 = DivSeparatorDelimiterStyleJsonParser.f56854d;
            sn.l<String, DivSeparator.DelimiterStyle.Orientation> lVar2 = DivSeparator.DelimiterStyle.Orientation.FROM_STRING;
            Expression<DivSeparator.DelimiterStyle.Orientation> expression2 = DivSeparatorDelimiterStyleJsonParser.f56853c;
            Expression<DivSeparator.DelimiterStyle.Orientation> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "orientation", typeHelper2, lVar2, expression2);
            if (expressionResolveOptionalExpression2 != null) {
                expression2 = expressionResolveOptionalExpression2;
            }
            return new DivSeparator.DelimiterStyle(expression, expression2);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f56852b = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        DivSeparator.DelimiterStyle.Orientation orientation = DivSeparator.DelimiterStyle.Orientation.HORIZONTAL;
        f56853c = Expression.Companion.constant$default(companion, orientation, null, 2, null);
        f56854d = TypeHelper.Companion.from(orientation, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivSeparatorDelimiterStyleJsonParser$Companion$TYPE_HELPER_ORIENTATION$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivSeparator.DelimiterStyle.Orientation);
            }
        });
    }
}
