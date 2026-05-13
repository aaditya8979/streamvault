package com.yandex.div2;

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
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivRadialGradient;
import com.yandex.div2.DivRadialGradientCenter;
import com.yandex.div2.DivRadialGradientRadius;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import com.yandex.div2.DivRadialGradientTemplate;
import com.yandex.div2.d3;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRadialGradientJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f58759a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivRadialGradientCenter.c f58760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivRadialGradientCenter.c f58761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivRadialGradientRadius.c f58762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ListValidator<Integer> f58763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ListValidator<DivRadialGradient.ColorPoint> f58764f;

    /* JADX INFO: compiled from: DivRadialGradientJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivRadialGradientJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58765a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58765a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivRadialGradient deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            DivRadialGradientCenter divRadialGradientCenter = (DivRadialGradientCenter) JsonPropertyParser.readOptional(parsingContext, jSONObject, "center_x", this.f58765a.c6());
            if (divRadialGradientCenter == null) {
                divRadialGradientCenter = e3.f58760b;
            }
            DivRadialGradientCenter divRadialGradientCenter2 = divRadialGradientCenter;
            DivRadialGradientCenter divRadialGradientCenter3 = (DivRadialGradientCenter) JsonPropertyParser.readOptional(parsingContext, jSONObject, "center_y", this.f58765a.c6());
            if (divRadialGradientCenter3 == null) {
                divRadialGradientCenter3 = e3.f58761c;
            }
            DivRadialGradientCenter divRadialGradientCenter4 = divRadialGradientCenter3;
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "color_map", this.f58765a.f6(), e3.f58764f);
            ExpressionList optionalExpressionList = JsonExpressionParser.readOptionalExpressionList(parsingContext, jSONObject, "colors", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, e3.f58763e);
            DivRadialGradientRadius divRadialGradientRadius = (DivRadialGradientRadius) JsonPropertyParser.readOptional(parsingContext, jSONObject, "radius", this.f58765a.o6());
            if (divRadialGradientRadius == null) {
                divRadialGradientRadius = e3.f58762d;
            }
            return new DivRadialGradient(divRadialGradientCenter2, divRadialGradientCenter4, optionalList, optionalExpressionList, divRadialGradientRadius);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivRadialGradient divRadialGradient) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "center_x", divRadialGradient.f56575a, this.f58765a.c6());
            JsonPropertyParser.write(parsingContext, jSONObject, "center_y", divRadialGradient.f56576b, this.f58765a.c6());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "color_map", divRadialGradient.f56577c, this.f58765a.f6());
            JsonExpressionParser.writeExpressionList(parsingContext, jSONObject, "colors", divRadialGradient.f56578d, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "radius", divRadialGradient.f56579e, this.f58765a.o6());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "radial_gradient");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivRadialGradientJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58766a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58766a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivRadialGradientTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivRadialGradientTemplate divRadialGradientTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "center_x", allowPropertyOverride, divRadialGradientTemplate != null ? divRadialGradientTemplate.f56646a : null, this.f58766a.d6());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "center_y", allowPropertyOverride, divRadialGradientTemplate != null ? divRadialGradientTemplate.f56647b : null, this.f58766a.d6());
            Field<List<DivRadialGradientTemplate.ColorPointTemplate>> field = divRadialGradientTemplate != null ? divRadialGradientTemplate.f56648c : null;
            bn.g<d3.c> gVarG6 = this.f58766a.g6();
            ListValidator<DivRadialGradient.ColorPoint> listValidator = e3.f58764f;
            tn.p.i(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "color_map", allowPropertyOverride, field, gVarG6, listValidator);
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field<ExpressionList<Integer>> field2 = divRadialGradientTemplate != null ? divRadialGradientTemplate.f56649d : null;
            sn.l<Object, Integer> lVar = ParsingConvertersKt.STRING_TO_COLOR_INT;
            ListValidator<Integer> listValidator2 = e3.f58763e;
            tn.p.i(listValidator2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivRadialGradientTemplate(optionalField, optionalField2, optionalListField, JsonFieldParser.readOptionalExpressionListField(parsingContextRestrictPropertyOverride, jSONObject, "colors", typeHelper, allowPropertyOverride, field2, lVar, listValidator2), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "radius", allowPropertyOverride, divRadialGradientTemplate != null ? divRadialGradientTemplate.f56650e : null, this.f58766a.p6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivRadialGradientTemplate divRadialGradientTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "center_x", divRadialGradientTemplate.f56646a, this.f58766a.d6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "center_y", divRadialGradientTemplate.f56647b, this.f58766a.d6());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "color_map", divRadialGradientTemplate.f56648c, this.f58766a.g6());
            JsonFieldParser.writeExpressionListField(parsingContext, jSONObject, "colors", divRadialGradientTemplate.f56649d, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "radius", divRadialGradientTemplate.f56650e, this.f58766a.p6());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "radial_gradient");
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivRadialGradientJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivRadialGradientTemplate, DivRadialGradient> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f58767a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f58767a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivRadialGradient resolve(@NotNull ParsingContext parsingContext, @NotNull DivRadialGradientTemplate divRadialGradientTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            DivRadialGradientCenter divRadialGradientCenter = (DivRadialGradientCenter) JsonFieldResolver.resolveOptional(parsingContext, divRadialGradientTemplate.f56646a, jSONObject, "center_x", this.f58767a.e6(), this.f58767a.c6());
            if (divRadialGradientCenter == null) {
                divRadialGradientCenter = e3.f58760b;
            }
            DivRadialGradientCenter divRadialGradientCenter2 = (DivRadialGradientCenter) JsonFieldResolver.resolveOptional(parsingContext, divRadialGradientTemplate.f56647b, jSONObject, "center_y", this.f58767a.e6(), this.f58767a.c6());
            if (divRadialGradientCenter2 == null) {
                divRadialGradientCenter2 = e3.f58761c;
            }
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divRadialGradientTemplate.f56648c, jSONObject, "color_map", this.f58767a.h6(), this.f58767a.f6(), e3.f58764f);
            ExpressionList expressionListResolveOptionalExpressionList = JsonFieldResolver.resolveOptionalExpressionList(parsingContext, divRadialGradientTemplate.f56649d, jSONObject, "colors", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, e3.f58763e);
            DivRadialGradientRadius divRadialGradientRadius = (DivRadialGradientRadius) JsonFieldResolver.resolveOptional(parsingContext, divRadialGradientTemplate.f56650e, jSONObject, "radius", this.f58767a.q6(), this.f58767a.o6());
            if (divRadialGradientRadius == null) {
                divRadialGradientRadius = e3.f58762d;
            }
            return new DivRadialGradient(divRadialGradientCenter, divRadialGradientCenter2, listResolveOptionalList, expressionListResolveOptionalExpressionList, divRadialGradientRadius);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Double dValueOf = Double.valueOf(0.5d);
        f58760b = new DivRadialGradientCenter.c(new DivRadialGradientRelativeCenter(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
        f58761c = new DivRadialGradientCenter.c(new DivRadialGradientRelativeCenter(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
        f58762d = new DivRadialGradientRadius.c(new DivRadialGradientRelativeRadius(Expression.Companion.constant$default(companion, DivRadialGradientRelativeRadius.Value.FARTHEST_CORNER, null, 2, null)));
        f58763e = new ListValidator() { // from class: ah.b8
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return com.yandex.div2.e3.c(list);
            }
        };
        f58764f = new ListValidator() { // from class: ah.c8
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return com.yandex.div2.e3.d(list);
            }
        };
    }

    public static final boolean c(List list) {
        return list.size() >= 2;
    }

    public static final boolean d(List list) {
        return list.size() >= 2;
    }
}
