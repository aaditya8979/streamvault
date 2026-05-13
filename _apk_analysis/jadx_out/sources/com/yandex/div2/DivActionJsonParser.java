package com.yandex.div2;

import android.net.Uri;
import androidx.constraintlayout.core.motion.utils.TypedValues;
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
import com.yandex.div2.DivAction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DivActionJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f54318a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f54319b = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAction.Target> f54320c = TypeHelper.Companion.from(cn.r.W(DivAction.Target.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivActionJsonParser$Companion$TYPE_HELPER_TARGET$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sn.l
        @NotNull
        public final Boolean invoke(@NotNull Object obj) {
            return Boolean.valueOf(obj instanceof DivAction.Target);
        }
    });

    /* JADX INFO: compiled from: DivActionJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivActionJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f54321a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f54321a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivAction deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            DivDownloadCallbacks divDownloadCallbacks = (DivDownloadCallbacks) JsonPropertyParser.readOptional(parsingContext, jSONObject, "download_callbacks", this.f54321a.S2());
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = DivActionJsonParser.f54319b;
            Expression<Boolean> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper, lVar, expression);
            Expression<Boolean> expression2 = optionalExpression == null ? expression : optionalExpression;
            Expression expression3 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING);
            TypeHelper<Uri> typeHelper2 = TypeHelpersKt.TYPE_HELPER_URI;
            sn.l<Object, Uri> lVar2 = ParsingConvertersKt.ANY_TO_URI;
            return new DivAction(divDownloadCallbacks, expression2, expression3, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "log_url", typeHelper2, lVar2), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "menu_items", this.f54321a.x0()), (JSONObject) JsonPropertyParser.readOptional(parsingContext, jSONObject, "payload"), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "referer", typeHelper2, lVar2), (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "scope_id"), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, TypedValues.AttributesType.S_TARGET, DivActionJsonParser.f54320c, DivAction.Target.FROM_STRING), (DivActionTyped) JsonPropertyParser.readOptional(parsingContext, jSONObject, "typed", this.f54321a.h1()), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "url", typeHelper2, lVar2));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivAction divAction) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "download_callbacks", divAction.f54175a, this.f54321a.S2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", divAction.f54176b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "log_id", divAction.f54177c);
            Expression<Uri> expression = divAction.f54178d;
            sn.l<Uri, String> lVar = ParsingConvertersKt.URI_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "log_url", expression, lVar);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "menu_items", divAction.f54179e, this.f54321a.x0());
            JsonPropertyParser.write(parsingContext, jSONObject, "payload", divAction.f54180f);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "referer", divAction.f54181g, lVar);
            JsonPropertyParser.write(parsingContext, jSONObject, "scope_id", divAction.f54182h);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, TypedValues.AttributesType.S_TARGET, divAction.f54183i, DivAction.Target.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "typed", divAction.f54184j, this.f54321a.h1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "url", divAction.f54185k, lVar);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivActionJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f54322a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f54322a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivActionTemplate divActionTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "download_callbacks", allowPropertyOverride, divActionTemplate != null ? divActionTemplate.f54468a : null, this.f54322a.T2());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divActionTemplate != null ? divActionTemplate.f54469b : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divActionTemplate != null ? divActionTemplate.f54470c : null);
            TypeHelper<Uri> typeHelper = TypeHelpersKt.TYPE_HELPER_URI;
            Field<Expression<Uri>> field = divActionTemplate != null ? divActionTemplate.f54471d : null;
            sn.l<Object, Uri> lVar = ParsingConvertersKt.ANY_TO_URI;
            return new DivActionTemplate(optionalField, optionalFieldWithExpression, fieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "log_url", typeHelper, allowPropertyOverride, field, lVar), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "menu_items", allowPropertyOverride, divActionTemplate != null ? divActionTemplate.f54472e : null, this.f54322a.y0()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "payload", allowPropertyOverride, divActionTemplate != null ? divActionTemplate.f54473f : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "referer", typeHelper, allowPropertyOverride, divActionTemplate != null ? divActionTemplate.f54474g : null, lVar), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "scope_id", allowPropertyOverride, divActionTemplate != null ? divActionTemplate.f54475h : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, TypedValues.AttributesType.S_TARGET, DivActionJsonParser.f54320c, allowPropertyOverride, divActionTemplate != null ? divActionTemplate.f54476i : null, DivAction.Target.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "typed", allowPropertyOverride, divActionTemplate != null ? divActionTemplate.f54477j : null, this.f54322a.i1()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "url", typeHelper, allowPropertyOverride, divActionTemplate != null ? divActionTemplate.f54478k : null, lVar));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivActionTemplate divActionTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "download_callbacks", divActionTemplate.f54468a, this.f54322a.T2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", divActionTemplate.f54469b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "log_id", divActionTemplate.f54470c);
            Field<Expression<Uri>> field = divActionTemplate.f54471d;
            sn.l<Uri, String> lVar = ParsingConvertersKt.URI_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "log_url", field, lVar);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "menu_items", divActionTemplate.f54472e, this.f54322a.y0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "payload", divActionTemplate.f54473f);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "referer", divActionTemplate.f54474g, lVar);
            JsonFieldParser.writeField(parsingContext, jSONObject, "scope_id", divActionTemplate.f54475h);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, TypedValues.AttributesType.S_TARGET, divActionTemplate.f54476i, DivAction.Target.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "typed", divActionTemplate.f54477j, this.f54322a.i1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "url", divActionTemplate.f54478k, lVar);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivActionJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivActionTemplate, DivAction> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f54323a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f54323a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivAction resolve(@NotNull ParsingContext parsingContext, @NotNull DivActionTemplate divActionTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            DivDownloadCallbacks divDownloadCallbacks = (DivDownloadCallbacks) JsonFieldResolver.resolveOptional(parsingContext, divActionTemplate.f54468a, jSONObject, "download_callbacks", this.f54323a.U2(), this.f54323a.S2());
            Field<Expression<Boolean>> field = divActionTemplate.f54469b;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = DivActionJsonParser.f54319b;
            Expression<Boolean> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "is_enabled", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divActionTemplate.f54470c, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Field<Expression<Uri>> field2 = divActionTemplate.f54471d;
            TypeHelper<Uri> typeHelper2 = TypeHelpersKt.TYPE_HELPER_URI;
            sn.l<Object, Uri> lVar2 = ParsingConvertersKt.ANY_TO_URI;
            return new DivAction(divDownloadCallbacks, expression, expressionResolveExpression, JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "log_url", typeHelper2, lVar2), JsonFieldResolver.resolveOptionalList(parsingContext, divActionTemplate.f54472e, jSONObject, "menu_items", this.f54323a.z0(), this.f54323a.x0()), (JSONObject) JsonFieldResolver.resolveOptional(parsingContext, divActionTemplate.f54473f, jSONObject, "payload"), JsonFieldResolver.resolveOptionalExpression(parsingContext, divActionTemplate.f54474g, jSONObject, "referer", typeHelper2, lVar2), (String) JsonFieldResolver.resolveOptional(parsingContext, divActionTemplate.f54475h, jSONObject, "scope_id"), JsonFieldResolver.resolveOptionalExpression(parsingContext, divActionTemplate.f54476i, jSONObject, TypedValues.AttributesType.S_TARGET, DivActionJsonParser.f54320c, DivAction.Target.FROM_STRING), (DivActionTyped) JsonFieldResolver.resolveOptional(parsingContext, divActionTemplate.f54477j, jSONObject, "typed", this.f54323a.j1(), this.f54323a.h1()), JsonFieldResolver.resolveOptionalExpression(parsingContext, divActionTemplate.f54478k, jSONObject, "url", typeHelper2, lVar2));
        }
    }
}
