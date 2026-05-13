package com.yandex.div2;

import com.ironsource.Ne;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRadialGradientFixedCenterJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivRadialGradientFixedCenterJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f56601a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivSizeUnit> f56602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivSizeUnit> f56603c;

    /* JADX INFO: compiled from: DivRadialGradientFixedCenterJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivRadialGradientFixedCenterJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56604a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56604a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivRadialGradientFixedCenter deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            TypeHelper<DivSizeUnit> typeHelper = DivRadialGradientFixedCenterJsonParser.f56603c;
            sn.l<String, DivSizeUnit> lVar = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression = DivRadialGradientFixedCenterJsonParser.f56602b;
            Expression<DivSizeUnit> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, Ne.f29954n1, typeHelper, lVar, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new DivRadialGradientFixedCenter(expression, JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivRadialGradientFixedCenter divRadialGradientFixedCenter) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "fixed");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, Ne.f29954n1, divRadialGradientFixedCenter.f56598a, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", divRadialGradientFixedCenter.f56599b);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivRadialGradientFixedCenterJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56605a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56605a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivRadialGradientFixedCenterTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivRadialGradientFixedCenterTemplate divRadialGradientFixedCenterTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivRadialGradientFixedCenterTemplate(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, Ne.f29954n1, DivRadialGradientFixedCenterJsonParser.f56603c, allowPropertyOverride, divRadialGradientFixedCenterTemplate != null ? divRadialGradientFixedCenterTemplate.f56610a : null, DivSizeUnit.FROM_STRING), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, divRadialGradientFixedCenterTemplate != null ? divRadialGradientFixedCenterTemplate.f56611b : null, ParsingConvertersKt.NUMBER_TO_INT));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivRadialGradientFixedCenterTemplate divRadialGradientFixedCenterTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "fixed");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, Ne.f29954n1, divRadialGradientFixedCenterTemplate.f56610a, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", divRadialGradientFixedCenterTemplate.f56611b);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivRadialGradientFixedCenterJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivRadialGradientFixedCenterTemplate, DivRadialGradientFixedCenter> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56606a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56606a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivRadialGradientFixedCenter resolve(@NotNull ParsingContext parsingContext, @NotNull DivRadialGradientFixedCenterTemplate divRadialGradientFixedCenterTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Field<Expression<DivSizeUnit>> field = divRadialGradientFixedCenterTemplate.f56610a;
            TypeHelper<DivSizeUnit> typeHelper = DivRadialGradientFixedCenterJsonParser.f56603c;
            sn.l<String, DivSizeUnit> lVar = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression = DivRadialGradientFixedCenterJsonParser.f56602b;
            Expression<DivSizeUnit> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, Ne.f29954n1, typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new DivRadialGradientFixedCenter(expression, JsonFieldResolver.resolveExpression(parsingContext, divRadialGradientFixedCenterTemplate.f56611b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT));
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivSizeUnit divSizeUnit = DivSizeUnit.DP;
        f56602b = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        f56603c = TypeHelper.Companion.from(divSizeUnit, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivRadialGradientFixedCenterJsonParser$Companion$TYPE_HELPER_UNIT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        });
    }
}
