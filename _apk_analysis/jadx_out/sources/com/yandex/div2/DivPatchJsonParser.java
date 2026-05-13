package com.yandex.div2;

import com.ironsource.C3978d4;
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
import com.yandex.div2.DivPatch;
import com.yandex.div2.DivPatchJsonParser;
import com.yandex.div2.DivPatchTemplate;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPatchJsonParser.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DivPatchJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f56496a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivPatch.Mode> f56497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivPatch.Mode> f56498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ListValidator<DivPatch.Change> f56499d;

    /* JADX INFO: compiled from: DivPatchJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivPatchJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56500a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56500a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivPatch deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            List list = JsonPropertyParser.readList(parsingContext, jSONObject, "changes", this.f56500a.F5(), DivPatchJsonParser.f56499d);
            TypeHelper<DivPatch.Mode> typeHelper = DivPatchJsonParser.f56498c;
            sn.l<String, DivPatch.Mode> lVar = DivPatch.Mode.FROM_STRING;
            Expression<DivPatch.Mode> expression = DivPatchJsonParser.f56497b;
            Expression<DivPatch.Mode> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, C3978d4.a.f31224t, typeHelper, lVar, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new DivPatch(list, expression, JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_applied_actions", this.f56500a.u0()), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_failed_actions", this.f56500a.u0()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivPatch divPatch) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "changes", divPatch.f56484a, this.f56500a.F5());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, C3978d4.a.f31224t, divPatch.f56485b, DivPatch.Mode.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "on_applied_actions", divPatch.f56486c, this.f56500a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "on_failed_actions", divPatch.f56487d, this.f56500a.u0());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivPatchJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56501a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56501a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivPatchTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivPatchTemplate divPatchTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field<List<DivPatchTemplate.ChangeTemplate>> field = divPatchTemplate != null ? divPatchTemplate.f56506a : null;
            bn.g<u2> gVarG5 = this.f56501a.G5();
            ListValidator<DivPatch.Change> listValidator = DivPatchJsonParser.f56499d;
            tn.p.i(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivPatchTemplate((Field<List<DivPatchTemplate.ChangeTemplate>>) JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, "changes", allowPropertyOverride, field, gVarG5, listValidator), (Field<Expression<DivPatch.Mode>>) JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, C3978d4.a.f31224t, DivPatchJsonParser.f56498c, allowPropertyOverride, divPatchTemplate != null ? divPatchTemplate.f56507b : null, DivPatch.Mode.FROM_STRING), (Field<List<DivActionTemplate>>) JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "on_applied_actions", allowPropertyOverride, divPatchTemplate != null ? divPatchTemplate.f56508c : null, this.f56501a.v0()), (Field<List<DivActionTemplate>>) JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "on_failed_actions", allowPropertyOverride, divPatchTemplate != null ? divPatchTemplate.f56509d : null, this.f56501a.v0()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivPatchTemplate divPatchTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "changes", divPatchTemplate.f56506a, this.f56501a.G5());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, C3978d4.a.f31224t, divPatchTemplate.f56507b, DivPatch.Mode.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "on_applied_actions", divPatchTemplate.f56508c, this.f56501a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "on_failed_actions", divPatchTemplate.f56509d, this.f56501a.v0());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivPatchJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivPatchTemplate, DivPatch> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56502a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56502a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivPatch resolve(@NotNull ParsingContext parsingContext, @NotNull DivPatchTemplate divPatchTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            List listResolveList = JsonFieldResolver.resolveList(parsingContext, divPatchTemplate.f56506a, jSONObject, "changes", this.f56502a.H5(), this.f56502a.F5(), DivPatchJsonParser.f56499d);
            Field<Expression<DivPatch.Mode>> field = divPatchTemplate.f56507b;
            TypeHelper<DivPatch.Mode> typeHelper = DivPatchJsonParser.f56498c;
            sn.l<String, DivPatch.Mode> lVar = DivPatch.Mode.FROM_STRING;
            Expression<DivPatch.Mode> expression = DivPatchJsonParser.f56497b;
            Expression<DivPatch.Mode> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, C3978d4.a.f31224t, typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new DivPatch(listResolveList, expression, JsonFieldResolver.resolveOptionalList(parsingContext, divPatchTemplate.f56508c, jSONObject, "on_applied_actions", this.f56502a.w0(), this.f56502a.u0()), JsonFieldResolver.resolveOptionalList(parsingContext, divPatchTemplate.f56509d, jSONObject, "on_failed_actions", this.f56502a.w0(), this.f56502a.u0()));
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivPatch.Mode mode = DivPatch.Mode.PARTIAL;
        f56497b = Expression.Companion.constant$default(companion, mode, null, 2, null);
        f56498c = TypeHelper.Companion.from(mode, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivPatchJsonParser$Companion$TYPE_HELPER_MODE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivPatch.Mode);
            }
        });
        f56499d = new ListValidator() { // from class: ah.p7
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivPatchJsonParser.b(list);
            }
        };
    }

    public static final boolean b(List list) {
        return list.size() >= 1;
    }
}
