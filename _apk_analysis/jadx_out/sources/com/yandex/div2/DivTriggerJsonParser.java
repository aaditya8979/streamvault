package com.yandex.div2;

import com.ironsource.C3978d4;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
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
import com.yandex.div2.DivActionJsonParser;
import com.yandex.div2.DivTrigger;
import com.yandex.div2.DivTriggerJsonParser;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTriggerJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivTriggerJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f58065a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivTrigger.Mode> f58066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivTrigger.Mode> f58067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ListValidator<DivAction> f58068d;

    /* JADX INFO: compiled from: DivTriggerJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivTriggerJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58069a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58069a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTrigger deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            List list = JsonPropertyParser.readList(parsingContext, jSONObject, "actions", this.f58069a.u0(), DivTriggerJsonParser.f58068d);
            Expression expression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "condition", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN);
            TypeHelper<DivTrigger.Mode> typeHelper = DivTriggerJsonParser.f58067c;
            sn.l<String, DivTrigger.Mode> lVar = DivTrigger.Mode.FROM_STRING;
            Expression<DivTrigger.Mode> expression2 = DivTriggerJsonParser.f58066b;
            Expression<DivTrigger.Mode> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, C3978d4.a.f31224t, typeHelper, lVar, expression2);
            if (optionalExpression != null) {
                expression2 = optionalExpression;
            }
            return new DivTrigger(list, expression, expression2);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTrigger divTrigger) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", divTrigger.f58060a, this.f58069a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "condition", divTrigger.f58061b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, C3978d4.a.f31224t, divTrigger.f58062c, DivTrigger.Mode.TO_STRING);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivTriggerJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58070a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58070a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTriggerTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivTriggerTemplate divTriggerTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field<List<DivActionTemplate>> field = divTriggerTemplate != null ? divTriggerTemplate.f58075a : null;
            bn.g<DivActionJsonParser.c> gVarV0 = this.f58070a.v0();
            ListValidator<DivAction> listValidator = DivTriggerJsonParser.f58068d;
            tn.p.i(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivTriggerTemplate(JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, field, gVarV0, listValidator), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "condition", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divTriggerTemplate != null ? divTriggerTemplate.f58076b : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, C3978d4.a.f31224t, DivTriggerJsonParser.f58067c, allowPropertyOverride, divTriggerTemplate != null ? divTriggerTemplate.f58077c : null, DivTrigger.Mode.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTriggerTemplate divTriggerTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", divTriggerTemplate.f58075a, this.f58070a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "condition", divTriggerTemplate.f58076b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, C3978d4.a.f31224t, divTriggerTemplate.f58077c, DivTrigger.Mode.TO_STRING);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivTriggerJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivTriggerTemplate, DivTrigger> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58071a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58071a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTrigger resolve(@NotNull ParsingContext parsingContext, @NotNull DivTriggerTemplate divTriggerTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            List listResolveList = JsonFieldResolver.resolveList(parsingContext, divTriggerTemplate.f58075a, jSONObject, "actions", this.f58071a.w0(), this.f58071a.u0(), DivTriggerJsonParser.f58068d);
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divTriggerTemplate.f58076b, jSONObject, "condition", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Field<Expression<DivTrigger.Mode>> field = divTriggerTemplate.f58077c;
            TypeHelper<DivTrigger.Mode> typeHelper = DivTriggerJsonParser.f58067c;
            sn.l<String, DivTrigger.Mode> lVar = DivTrigger.Mode.FROM_STRING;
            Expression<DivTrigger.Mode> expression = DivTriggerJsonParser.f58066b;
            Expression<DivTrigger.Mode> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, C3978d4.a.f31224t, typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new DivTrigger(listResolveList, expressionResolveExpression, expression);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivTrigger.Mode mode = DivTrigger.Mode.ON_CONDITION;
        f58066b = Expression.Companion.constant$default(companion, mode, null, 2, null);
        f58067c = TypeHelper.Companion.from(mode, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivTriggerJsonParser$Companion$TYPE_HELPER_MODE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivTrigger.Mode);
            }
        });
        f58068d = new ListValidator() { // from class: ah.sb
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivTriggerJsonParser.b(list);
            }
        };
    }

    public static final boolean b(List list) {
        return list.size() >= 1;
    }
}
