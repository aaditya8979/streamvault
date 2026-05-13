package com.yandex.div2;

import androidx.compose.material.OutlinedTextFieldKt;
import androidx.core.provider.FontsContractCompat;
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
import com.yandex.div2.DivTextRangeJsonParser;
import com.yandex.div2.DivTextTemplate;
import io.appmetrica.analytics.impl.A2;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivTextRangeJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f57782a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f57783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivSizeUnit> f57784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f57785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivTextAlignmentVertical> f57786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivSizeUnit> f57787f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivFontWeight> f57788g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivLineStyle> f57789h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivLineStyle> f57790i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f57791j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f57792k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f57793l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f57794m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f57795n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f57796o;

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
        public final JsonParserComponent f57797a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f57797a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivText.Range deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.f57797a.u0());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", DivTextRangeJsonParser.f57786e, DivTextAlignmentVertical.FROM_STRING);
            DivTextRangeBackground divTextRangeBackground = (DivTextRangeBackground) JsonPropertyParser.readOptional(parsingContext, jSONObject, A2.f64965g, this.f57797a.s8());
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression<Double> expression = DivTextRangeJsonParser.f57783b;
            Expression<Double> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "baseline_offset", typeHelper, lVar, expression);
            if (optionalExpression2 != null) {
                expression = optionalExpression2;
            }
            DivTextRangeBorder divTextRangeBorder = (DivTextRangeBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f57797a.v8());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "end", typeHelper2, lVar2, DivTextRangeJsonParser.f57791j);
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_family", typeHelper3);
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_feature_settings", typeHelper3);
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size", typeHelper2, lVar2, DivTextRangeJsonParser.f57792k);
            TypeHelper<DivSizeUnit> typeHelper4 = DivTextRangeJsonParser.f57787f;
            sn.l<String, DivSizeUnit> lVar3 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression2 = DivTextRangeJsonParser.f57784c;
            Expression<DivSizeUnit> optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size_unit", typeHelper4, lVar3, expression2);
            if (optionalExpression7 != null) {
                expression2 = optionalExpression7;
            }
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT);
            Expression optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, DivTextRangeJsonParser.f57788g, DivFontWeight.FROM_STRING);
            Expression optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight_value", typeHelper2, lVar2, DivTextRangeJsonParser.f57793l);
            Expression optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "letter_spacing", typeHelper, lVar);
            Expression optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "line_height", typeHelper2, lVar2, DivTextRangeJsonParser.f57794m);
            DivTextRangeMask divTextRangeMask = (DivTextRangeMask) JsonPropertyParser.readOptional(parsingContext, jSONObject, "mask", this.f57797a.D8());
            ValueValidator<Long> valueValidator = DivTextRangeJsonParser.f57795n;
            Expression<Long> expression3 = DivTextRangeJsonParser.f57785d;
            Expression<Long> optionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start", typeHelper2, lVar2, valueValidator, expression3);
            Expression<Long> expression4 = optionalExpression13 == null ? expression3 : optionalExpression13;
            TypeHelper<DivLineStyle> typeHelper5 = DivTextRangeJsonParser.f57789h;
            sn.l<String, DivLineStyle> lVar4 = DivLineStyle.FROM_STRING;
            return new DivText.Range(optionalList, optionalExpression, divTextRangeBackground, expression, divTextRangeBorder, optionalExpression3, optionalExpression4, optionalExpression5, optionalExpression6, expression2, optionalExpression8, optionalExpression9, optionalExpression10, optionalExpression11, optionalExpression12, divTextRangeMask, expression4, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "strike", typeHelper5, lVar4), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT), (DivShadow) JsonPropertyParser.readOptional(parsingContext, jSONObject, "text_shadow", this.f57797a.P6()), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "top_offset", typeHelper2, lVar2, DivTextRangeJsonParser.f57796o), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "underline", DivTextRangeJsonParser.f57790i, lVar4));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivText.Range range) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", range.f57687a, this.f57797a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", range.f57688b, DivTextAlignmentVertical.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, A2.f64965g, range.f57689c, this.f57797a.s8());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "baseline_offset", range.f57690d);
            JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, range.f57691e, this.f57797a.v8());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "end", range.f57692f);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_family", range.f57693g);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_feature_settings", range.f57694h);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size", range.f57695i);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size_unit", range.f57696j, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, range.f57697k);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, range.f57698l, DivFontWeight.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight_value", range.f57699m);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "letter_spacing", range.f57700n);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "line_height", range.f57701o);
            JsonPropertyParser.write(parsingContext, jSONObject, "mask", range.f57702p, this.f57797a.D8());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start", range.f57703q);
            Expression<DivLineStyle> expression = range.f57704r;
            sn.l<DivLineStyle, String> lVar = DivLineStyle.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "strike", expression, lVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_color", range.f57705s, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "text_shadow", range.f57706t, this.f57797a.P6());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "top_offset", range.f57707u);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "underline", range.f57708v, lVar);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivTextJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f57798a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f57798a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTextTemplate.RangeTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivTextTemplate.RangeTemplate rangeTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f57937a : null, this.f57798a.v0());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", DivTextRangeJsonParser.f57786e, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f57938b : null, DivTextAlignmentVertical.FROM_STRING);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, A2.f64965g, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f57939c : null, this.f57798a.t8());
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field<Expression<Double>> field = rangeTemplate != null ? rangeTemplate.f57940d : null;
            sn.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "baseline_offset", typeHelper, allowPropertyOverride, field, lVar);
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f57941e : null, this.f57798a.w8());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field2 = rangeTemplate != null ? rangeTemplate.f57942f : null;
            sn.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "end", typeHelper2, allowPropertyOverride, field2, lVar2, DivTextRangeJsonParser.f57791j);
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_family", typeHelper3, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f57943g : null);
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_feature_settings", typeHelper3, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f57944h : null);
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size", typeHelper2, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f57945i : null, lVar2, DivTextRangeJsonParser.f57792k);
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size_unit", DivTextRangeJsonParser.f57787f, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f57946j : null, DivSizeUnit.FROM_STRING);
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f57947k : null);
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FontsContractCompat.Columns.WEIGHT, DivTextRangeJsonParser.f57788g, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f57948l : null, DivFontWeight.FROM_STRING);
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_weight_value", typeHelper2, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f57949m : null, lVar2, DivTextRangeJsonParser.f57793l);
            Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "letter_spacing", typeHelper, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f57950n : null, lVar);
            Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "line_height", typeHelper2, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f57951o : null, lVar2, DivTextRangeJsonParser.f57794m);
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "mask", allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f57952p : null, this.f57798a.E8());
            Field optionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start", typeHelper2, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f57953q : null, lVar2, DivTextRangeJsonParser.f57795n);
            TypeHelper<DivLineStyle> typeHelper4 = DivTextRangeJsonParser.f57789h;
            Field<Expression<DivLineStyle>> field3 = rangeTemplate != null ? rangeTemplate.f57954r : null;
            sn.l<String, DivLineStyle> lVar3 = DivLineStyle.FROM_STRING;
            return new DivTextTemplate.RangeTemplate(optionalListField, optionalFieldWithExpression, optionalField, optionalFieldWithExpression2, optionalField2, optionalFieldWithExpression3, optionalFieldWithExpression4, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalFieldWithExpression7, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalFieldWithExpression10, optionalFieldWithExpression11, optionalFieldWithExpression12, optionalField3, optionalFieldWithExpression13, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "strike", typeHelper4, allowPropertyOverride, field3, lVar3), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f57955s : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "text_shadow", allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f57956t : null, this.f57798a.Q6()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "top_offset", typeHelper2, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f57957u : null, lVar2, DivTextRangeJsonParser.f57796o), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "underline", DivTextRangeJsonParser.f57790i, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f57958v : null, lVar3));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTextTemplate.RangeTemplate rangeTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", rangeTemplate.f57937a, this.f57798a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", rangeTemplate.f57938b, DivTextAlignmentVertical.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, A2.f64965g, rangeTemplate.f57939c, this.f57798a.t8());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "baseline_offset", rangeTemplate.f57940d);
            JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, rangeTemplate.f57941e, this.f57798a.w8());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "end", rangeTemplate.f57942f);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_family", rangeTemplate.f57943g);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_feature_settings", rangeTemplate.f57944h);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size", rangeTemplate.f57945i);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size_unit", rangeTemplate.f57946j, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, rangeTemplate.f57947k);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, rangeTemplate.f57948l, DivFontWeight.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight_value", rangeTemplate.f57949m);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "letter_spacing", rangeTemplate.f57950n);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "line_height", rangeTemplate.f57951o);
            JsonFieldParser.writeField(parsingContext, jSONObject, "mask", rangeTemplate.f57952p, this.f57798a.E8());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start", rangeTemplate.f57953q);
            Field<Expression<DivLineStyle>> field = rangeTemplate.f57954r;
            sn.l<DivLineStyle, String> lVar = DivLineStyle.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "strike", field, lVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_color", rangeTemplate.f57955s, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "text_shadow", rangeTemplate.f57956t, this.f57798a.Q6());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "top_offset", rangeTemplate.f57957u);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "underline", rangeTemplate.f57958v, lVar);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivTextJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivTextTemplate.RangeTemplate, DivText.Range> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f57799a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f57799a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivText.Range resolve(@NotNull ParsingContext parsingContext, @NotNull DivTextTemplate.RangeTemplate rangeTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, rangeTemplate.f57937a, jSONObject, "actions", this.f57799a.w0(), this.f57799a.u0());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.f57938b, jSONObject, "alignment_vertical", DivTextRangeJsonParser.f57786e, DivTextAlignmentVertical.FROM_STRING);
            DivTextRangeBackground divTextRangeBackground = (DivTextRangeBackground) JsonFieldResolver.resolveOptional(parsingContext, rangeTemplate.f57939c, jSONObject, A2.f64965g, this.f57799a.u8(), this.f57799a.s8());
            Field<Expression<Double>> field = rangeTemplate.f57940d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression<Double> expression = DivTextRangeJsonParser.f57783b;
            Expression<Double> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "baseline_offset", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression2 != null) {
                expression = expressionResolveOptionalExpression2;
            }
            DivTextRangeBorder divTextRangeBorder = (DivTextRangeBorder) JsonFieldResolver.resolveOptional(parsingContext, rangeTemplate.f57941e, jSONObject, OutlinedTextFieldKt.BorderId, this.f57799a.x8(), this.f57799a.v8());
            Field<Expression<Long>> field2 = rangeTemplate.f57942f;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "end", typeHelper2, lVar2, DivTextRangeJsonParser.f57791j);
            Field<Expression<String>> field3 = rangeTemplate.f57943g;
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "font_family", typeHelper3);
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.f57944h, jSONObject, "font_feature_settings", typeHelper3);
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.f57945i, jSONObject, "font_size", typeHelper2, lVar2, DivTextRangeJsonParser.f57792k);
            Field<Expression<DivSizeUnit>> field4 = rangeTemplate.f57946j;
            TypeHelper<DivSizeUnit> typeHelper4 = DivTextRangeJsonParser.f57787f;
            sn.l<String, DivSizeUnit> lVar3 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression2 = DivTextRangeJsonParser.f57784c;
            Expression<DivSizeUnit> expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "font_size_unit", typeHelper4, lVar3, expression2);
            if (expressionResolveOptionalExpression7 != null) {
                expression2 = expressionResolveOptionalExpression7;
            }
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.f57947k, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT);
            Expression expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.f57948l, jSONObject, FontsContractCompat.Columns.WEIGHT, DivTextRangeJsonParser.f57788g, DivFontWeight.FROM_STRING);
            Expression expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.f57949m, jSONObject, "font_weight_value", typeHelper2, lVar2, DivTextRangeJsonParser.f57793l);
            Expression expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.f57950n, jSONObject, "letter_spacing", typeHelper, lVar);
            Expression expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.f57951o, jSONObject, "line_height", typeHelper2, lVar2, DivTextRangeJsonParser.f57794m);
            DivTextRangeMask divTextRangeMask = (DivTextRangeMask) JsonFieldResolver.resolveOptional(parsingContext, rangeTemplate.f57952p, jSONObject, "mask", this.f57799a.F8(), this.f57799a.D8());
            Field<Expression<Long>> field5 = rangeTemplate.f57953q;
            ValueValidator<Long> valueValidator = DivTextRangeJsonParser.f57795n;
            Expression<Long> expression3 = DivTextRangeJsonParser.f57785d;
            Expression<Long> expressionResolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "start", typeHelper2, lVar2, valueValidator, expression3);
            Expression<Long> expression4 = expressionResolveOptionalExpression13 == null ? expression3 : expressionResolveOptionalExpression13;
            Field<Expression<DivLineStyle>> field6 = rangeTemplate.f57954r;
            TypeHelper<DivLineStyle> typeHelper5 = DivTextRangeJsonParser.f57789h;
            sn.l<String, DivLineStyle> lVar4 = DivLineStyle.FROM_STRING;
            return new DivText.Range(listResolveOptionalList, expressionResolveOptionalExpression, divTextRangeBackground, expression, divTextRangeBorder, expressionResolveOptionalExpression3, expressionResolveOptionalExpression4, expressionResolveOptionalExpression5, expressionResolveOptionalExpression6, expression2, expressionResolveOptionalExpression8, expressionResolveOptionalExpression9, expressionResolveOptionalExpression10, expressionResolveOptionalExpression11, expressionResolveOptionalExpression12, divTextRangeMask, expression4, JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "strike", typeHelper5, lVar4), JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.f57955s, jSONObject, "text_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT), (DivShadow) JsonFieldResolver.resolveOptional(parsingContext, rangeTemplate.f57956t, jSONObject, "text_shadow", this.f57799a.R6(), this.f57799a.P6()), JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.f57957u, jSONObject, "top_offset", typeHelper2, lVar2, DivTextRangeJsonParser.f57796o), JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.f57958v, jSONObject, "underline", DivTextRangeJsonParser.f57790i, lVar4));
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f57783b = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        DivSizeUnit divSizeUnit = DivSizeUnit.SP;
        f57784c = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        f57785d = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f57786e = companion2.from(cn.r.W(DivTextAlignmentVertical.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextRangeJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivTextAlignmentVertical);
            }
        });
        f57787f = companion2.from(divSizeUnit, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextRangeJsonParser$Companion$TYPE_HELPER_FONT_SIZE_UNIT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        });
        f57788g = companion2.from(cn.r.W(DivFontWeight.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextRangeJsonParser$Companion$TYPE_HELPER_FONT_WEIGHT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivFontWeight);
            }
        });
        f57789h = companion2.from(cn.r.W(DivLineStyle.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextRangeJsonParser$Companion$TYPE_HELPER_STRIKE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivLineStyle);
            }
        });
        f57790i = companion2.from(cn.r.W(DivLineStyle.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextRangeJsonParser$Companion$TYPE_HELPER_UNDERLINE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivLineStyle);
            }
        });
        f57791j = new ValueValidator() { // from class: ah.cb
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTextRangeJsonParser.g(((Long) obj).longValue());
            }
        };
        f57792k = new ValueValidator() { // from class: ah.db
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTextRangeJsonParser.h(((Long) obj).longValue());
            }
        };
        f57793l = new ValueValidator() { // from class: ah.eb
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTextRangeJsonParser.i(((Long) obj).longValue());
            }
        };
        f57794m = new ValueValidator() { // from class: ah.fb
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTextRangeJsonParser.j(((Long) obj).longValue());
            }
        };
        f57795n = new ValueValidator() { // from class: ah.gb
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTextRangeJsonParser.k(((Long) obj).longValue());
            }
        };
        f57796o = new ValueValidator() { // from class: ah.hb
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTextRangeJsonParser.l(((Long) obj).longValue());
            }
        };
    }

    public static final boolean g(long j10) {
        return j10 > 0;
    }

    public static final boolean h(long j10) {
        return j10 >= 0;
    }

    public static final boolean i(long j10) {
        return j10 > 0;
    }

    public static final boolean j(long j10) {
        return j10 >= 0;
    }

    public static final boolean k(long j10) {
        return j10 >= 0;
    }

    public static final boolean l(long j10) {
        return j10 >= 0;
    }
}
