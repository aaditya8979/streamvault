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
import com.yandex.div2.DivSizeUnitValueJsonParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSizeUnitValueJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivSizeUnitValueJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f56964a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivSizeUnit> f56965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivSizeUnit> f56966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f56967d;

    /* JADX INFO: compiled from: DivSizeUnitValueJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivSizeUnitValueJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56968a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56968a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSizeUnitValue deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            TypeHelper<DivSizeUnit> typeHelper = DivSizeUnitValueJsonParser.f56966c;
            sn.l<String, DivSizeUnit> lVar = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression = DivSizeUnitValueJsonParser.f56965b;
            Expression<DivSizeUnit> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, Ne.f29954n1, typeHelper, lVar, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new DivSizeUnitValue(expression, JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, DivSizeUnitValueJsonParser.f56967d));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivSizeUnitValue divSizeUnitValue) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, Ne.f29954n1, divSizeUnitValue.f56961a, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", divSizeUnitValue.f56962b);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivSizeUnitValueJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56969a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56969a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSizeUnitValueTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivSizeUnitValueTemplate divSizeUnitValueTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivSizeUnitValueTemplate(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, Ne.f29954n1, DivSizeUnitValueJsonParser.f56966c, allowPropertyOverride, divSizeUnitValueTemplate != null ? divSizeUnitValueTemplate.f56974a : null, DivSizeUnit.FROM_STRING), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, divSizeUnitValueTemplate != null ? divSizeUnitValueTemplate.f56975b : null, ParsingConvertersKt.NUMBER_TO_INT, DivSizeUnitValueJsonParser.f56967d));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivSizeUnitValueTemplate divSizeUnitValueTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, Ne.f29954n1, divSizeUnitValueTemplate.f56974a, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", divSizeUnitValueTemplate.f56975b);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivSizeUnitValueJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivSizeUnitValueTemplate, DivSizeUnitValue> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56970a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56970a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSizeUnitValue resolve(@NotNull ParsingContext parsingContext, @NotNull DivSizeUnitValueTemplate divSizeUnitValueTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Field<Expression<DivSizeUnit>> field = divSizeUnitValueTemplate.f56974a;
            TypeHelper<DivSizeUnit> typeHelper = DivSizeUnitValueJsonParser.f56966c;
            sn.l<String, DivSizeUnit> lVar = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression = DivSizeUnitValueJsonParser.f56965b;
            Expression<DivSizeUnit> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, Ne.f29954n1, typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new DivSizeUnitValue(expression, JsonFieldResolver.resolveExpression(parsingContext, divSizeUnitValueTemplate.f56975b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, DivSizeUnitValueJsonParser.f56967d));
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivSizeUnit divSizeUnit = DivSizeUnit.DP;
        f56965b = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        f56966c = TypeHelper.Companion.from(divSizeUnit, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivSizeUnitValueJsonParser$Companion$TYPE_HELPER_UNIT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        });
        f56967d = new ValueValidator() { // from class: ah.d9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivSizeUnitValueJsonParser.b(((Long) obj).longValue());
            }
        };
    }

    public static final boolean b(long j10) {
        return j10 >= 0;
    }
}
