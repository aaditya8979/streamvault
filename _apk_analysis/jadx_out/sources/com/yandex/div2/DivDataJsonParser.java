package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivData;
import com.yandex.div2.DivDataJsonParser;
import com.yandex.div2.DivDataTemplate;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivDataJsonParser.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivDataJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f55094a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivTransitionSelector> f55095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivTransitionSelector> f55096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ListValidator<DivData.State> f55097d;

    /* JADX INFO: compiled from: DivDataJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivDataJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f55098a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f55098a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivData deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            ParsingContext parsingContextCollectingErrors = ParsingContextKt.collectingErrors(parsingContext);
            List optionalList = JsonPropertyParser.readOptionalList(parsingContextCollectingErrors, jSONObject, "functions", this.f55098a.I3());
            String str = (String) JsonPropertyParser.read(parsingContextCollectingErrors, jSONObject, "log_id");
            List list = JsonPropertyParser.readList(parsingContextCollectingErrors, jSONObject, "states", this.f55098a.G2(), DivDataJsonParser.f55097d);
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContextCollectingErrors, jSONObject, "timers", this.f55098a.M8());
            TypeHelper<DivTransitionSelector> typeHelper = DivDataJsonParser.f55096c;
            sn.l<String, DivTransitionSelector> lVar = DivTransitionSelector.FROM_STRING;
            Expression<DivTransitionSelector> expression = DivDataJsonParser.f55095b;
            Expression<DivTransitionSelector> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContextCollectingErrors, jSONObject, "transition_animation_selector", typeHelper, lVar, expression);
            return new DivData(optionalList, str, list, optionalList2, optionalExpression == null ? expression : optionalExpression, JsonPropertyParser.readOptionalList(parsingContextCollectingErrors, jSONObject, "variable_triggers", this.f55098a.e9()), JsonPropertyParser.readOptionalList(parsingContextCollectingErrors, jSONObject, "variables", this.f55098a.k9()), ParsingContextKt.getCollectedErrors(parsingContextCollectingErrors));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivData divData) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divData.f55080a, this.f55098a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "log_id", divData.f55081b);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "states", divData.f55082c, this.f55098a.G2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "timers", divData.f55083d, this.f55098a.M8());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "transition_animation_selector", divData.f55084e, DivTransitionSelector.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divData.f55085f, this.f55098a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divData.f55086g, this.f55098a.k9());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivDataJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f55099a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f55099a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivDataTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivDataTemplate divDataTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divDataTemplate != null ? divDataTemplate.f55104a : null, this.f55099a.J3());
            Field field = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "log_id", allowPropertyOverride, divDataTemplate != null ? divDataTemplate.f55105b : null);
            Field<List<DivDataTemplate.StateTemplate>> field2 = divDataTemplate != null ? divDataTemplate.f55106c : null;
            bn.g<w0> gVarH2 = this.f55099a.H2();
            ListValidator<DivData.State> listValidator = DivDataJsonParser.f55097d;
            tn.p.i(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivDataTemplate(optionalListField, field, JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, "states", allowPropertyOverride, field2, gVarH2, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "timers", allowPropertyOverride, divDataTemplate != null ? divDataTemplate.f55107d : null, this.f55099a.N8()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "transition_animation_selector", DivDataJsonParser.f55096c, allowPropertyOverride, divDataTemplate != null ? divDataTemplate.f55108e : null, DivTransitionSelector.FROM_STRING), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divDataTemplate != null ? divDataTemplate.f55109f : null, this.f55099a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divDataTemplate != null ? divDataTemplate.f55110g : null, this.f55099a.l9()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivDataTemplate divDataTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divDataTemplate.f55104a, this.f55099a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "log_id", divDataTemplate.f55105b);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "states", divDataTemplate.f55106c, this.f55099a.H2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "timers", divDataTemplate.f55107d, this.f55099a.N8());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "transition_animation_selector", divDataTemplate.f55108e, DivTransitionSelector.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divDataTemplate.f55109f, this.f55099a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divDataTemplate.f55110g, this.f55099a.l9());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivDataJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivDataTemplate, DivData> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f55100a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f55100a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivData resolve(@NotNull ParsingContext parsingContext, @NotNull DivDataTemplate divDataTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divDataTemplate.f55104a, jSONObject, "functions", this.f55100a.K3(), this.f55100a.I3());
            String str = (String) JsonFieldResolver.resolve(parsingContext, divDataTemplate.f55105b, jSONObject, "log_id");
            List listResolveList = JsonFieldResolver.resolveList(parsingContext, divDataTemplate.f55106c, jSONObject, "states", this.f55100a.I2(), this.f55100a.G2(), DivDataJsonParser.f55097d);
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divDataTemplate.f55107d, jSONObject, "timers", this.f55100a.O8(), this.f55100a.M8());
            Field<Expression<DivTransitionSelector>> field = divDataTemplate.f55108e;
            TypeHelper<DivTransitionSelector> typeHelper = DivDataJsonParser.f55096c;
            sn.l<String, DivTransitionSelector> lVar = DivTransitionSelector.FROM_STRING;
            Expression<DivTransitionSelector> expression = DivDataJsonParser.f55095b;
            Expression<DivTransitionSelector> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "transition_animation_selector", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new DivData(listResolveOptionalList, str, listResolveList, listResolveOptionalList2, expression, JsonFieldResolver.resolveOptionalList(parsingContext, divDataTemplate.f55109f, jSONObject, "variable_triggers", this.f55100a.g9(), this.f55100a.e9()), JsonFieldResolver.resolveOptionalList(parsingContext, divDataTemplate.f55110g, jSONObject, "variables", this.f55100a.m9(), this.f55100a.k9()), null, 128, null);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivTransitionSelector divTransitionSelector = DivTransitionSelector.NONE;
        f55095b = Expression.Companion.constant$default(companion, divTransitionSelector, null, 2, null);
        f55096c = TypeHelper.Companion.from(divTransitionSelector, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivDataJsonParser$Companion$TYPE_HELPER_TRANSITION_ANIMATION_SELECTOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivTransitionSelector);
            }
        });
        f55097d = new ListValidator() { // from class: ah.f3
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivDataJsonParser.b(list);
            }
        };
    }

    public static final boolean b(List list) {
        return list.size() >= 1;
    }
}
