package com.yandex.div2;

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
import com.yandex.div2.DivTabs;
import com.yandex.div2.DivTabsTabTitleStyleJsonParser;
import com.yandex.div2.DivTabsTemplate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTabsJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivTabsTabTitleStyleJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f57485a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Integer> f57486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Integer> f57487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f57488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivTabs.TabTitleStyle.AnimationType> f57489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f57490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivSizeUnit> f57491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivFontWeight> f57492h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Integer> f57493i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f57494j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f57495k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivEdgeInsets f57496l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivFontWeight> f57497m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivTabs.TabTitleStyle.AnimationType> f57498n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivSizeUnit> f57499o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivFontWeight> f57500p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivFontWeight> f57501q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f57502r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f57503s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f57504t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f57505u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f57506v;

    /* JADX INFO: compiled from: DivTabsJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivTabsJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f57507a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f57507a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTabs.TabTitleStyle deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            sn.l<Object, Integer> lVar = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression = DivTabsTabTitleStyleJsonParser.f57486b;
            Expression<Integer> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "active_background_color", typeHelper, lVar, expression);
            Expression<Integer> expression2 = optionalExpression == null ? expression : optionalExpression;
            TypeHelper<JSONObject> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DICT;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "active_font_variation_settings", typeHelper2);
            TypeHelper<DivFontWeight> typeHelper3 = DivTabsTabTitleStyleJsonParser.f57497m;
            sn.l<String, DivFontWeight> lVar2 = DivFontWeight.FROM_STRING;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "active_font_weight", typeHelper3, lVar2);
            Expression<Integer> expression3 = DivTabsTabTitleStyleJsonParser.f57487c;
            Expression<Integer> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "active_text_color", typeHelper, lVar, expression3);
            Expression<Integer> expression4 = optionalExpression4 == null ? expression3 : optionalExpression4;
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar3 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = DivTabsTabTitleStyleJsonParser.f57502r;
            Expression<Long> expression5 = DivTabsTabTitleStyleJsonParser.f57488d;
            Expression<Long> optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "animation_duration", typeHelper4, lVar3, valueValidator, expression5);
            if (optionalExpression5 != null) {
                expression5 = optionalExpression5;
            }
            TypeHelper<DivTabs.TabTitleStyle.AnimationType> typeHelper5 = DivTabsTabTitleStyleJsonParser.f57498n;
            sn.l<String, DivTabs.TabTitleStyle.AnimationType> lVar4 = DivTabs.TabTitleStyle.AnimationType.FROM_STRING;
            Expression<DivTabs.TabTitleStyle.AnimationType> expression6 = DivTabsTabTitleStyleJsonParser.f57489e;
            Expression<DivTabs.TabTitleStyle.AnimationType> optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "animation_type", typeHelper5, lVar4, expression6);
            Expression<DivTabs.TabTitleStyle.AnimationType> expression7 = optionalExpression6 == null ? expression6 : optionalExpression6;
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "corner_radius", typeHelper4, lVar3, DivTabsTabTitleStyleJsonParser.f57503s);
            DivCornersRadius divCornersRadius = (DivCornersRadius) JsonPropertyParser.readOptional(parsingContext, jSONObject, "corners_radius", this.f57507a.s2());
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_family", TypeHelpersKt.TYPE_HELPER_STRING);
            ValueValidator<Long> valueValidator2 = DivTabsTabTitleStyleJsonParser.f57504t;
            Expression<Long> expression8 = DivTabsTabTitleStyleJsonParser.f57490f;
            Expression<Long> optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size", typeHelper4, lVar3, valueValidator2, expression8);
            if (optionalExpression9 != null) {
                expression8 = optionalExpression9;
            }
            TypeHelper<DivSizeUnit> typeHelper6 = DivTabsTabTitleStyleJsonParser.f57499o;
            sn.l<String, DivSizeUnit> lVar5 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression9 = DivTabsTabTitleStyleJsonParser.f57491g;
            Expression<DivSizeUnit> optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size_unit", typeHelper6, lVar5, expression9);
            Expression<DivSizeUnit> expression10 = optionalExpression10 == null ? expression9 : optionalExpression10;
            TypeHelper<DivFontWeight> typeHelper7 = DivTabsTabTitleStyleJsonParser.f57500p;
            Expression<DivFontWeight> expression11 = DivTabsTabTitleStyleJsonParser.f57492h;
            Expression<DivFontWeight> optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, typeHelper7, lVar2, expression11);
            Expression<DivFontWeight> expression12 = optionalExpression11 == null ? expression11 : optionalExpression11;
            Expression optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "inactive_background_color", typeHelper, lVar);
            Expression optionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "inactive_font_variation_settings", typeHelper2);
            Expression optionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "inactive_font_weight", DivTabsTabTitleStyleJsonParser.f57501q, lVar2);
            Expression<Integer> expression13 = DivTabsTabTitleStyleJsonParser.f57493i;
            Expression<Integer> optionalExpression15 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "inactive_text_color", typeHelper, lVar, expression13);
            Expression<Integer> expression14 = optionalExpression15 == null ? expression13 : optionalExpression15;
            ValueValidator<Long> valueValidator3 = DivTabsTabTitleStyleJsonParser.f57505u;
            Expression<Long> expression15 = DivTabsTabTitleStyleJsonParser.f57494j;
            Expression<Long> optionalExpression16 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "item_spacing", typeHelper4, lVar3, valueValidator3, expression15);
            Expression<Long> expression16 = optionalExpression16 == null ? expression15 : optionalExpression16;
            TypeHelper<Double> typeHelper8 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar6 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression<Double> expression17 = DivTabsTabTitleStyleJsonParser.f57495k;
            Expression<Double> optionalExpression17 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "letter_spacing", typeHelper8, lVar6, expression17);
            Expression<Double> expression18 = optionalExpression17 == null ? expression17 : optionalExpression17;
            Expression optionalExpression18 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "line_height", typeHelper4, lVar3, DivTabsTabTitleStyleJsonParser.f57506v);
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f57507a.Y2());
            if (divEdgeInsets == null) {
                divEdgeInsets = DivTabsTabTitleStyleJsonParser.f57496l;
            }
            return new DivTabs.TabTitleStyle(expression2, optionalExpression2, optionalExpression3, expression4, expression5, expression7, optionalExpression7, divCornersRadius, optionalExpression8, expression8, expression10, expression12, optionalExpression12, optionalExpression13, optionalExpression14, expression14, expression16, expression18, optionalExpression18, divEdgeInsets);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTabs.TabTitleStyle tabTitleStyle) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Expression<Integer> expression = tabTitleStyle.f57438a;
            sn.l<Integer, String> lVar = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "active_background_color", expression, lVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "active_font_variation_settings", tabTitleStyle.f57439b);
            Expression<DivFontWeight> expression2 = tabTitleStyle.f57440c;
            sn.l<DivFontWeight, String> lVar2 = DivFontWeight.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "active_font_weight", expression2, lVar2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "active_text_color", tabTitleStyle.f57441d, lVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "animation_duration", tabTitleStyle.f57442e);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "animation_type", tabTitleStyle.f57443f, DivTabs.TabTitleStyle.AnimationType.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "corner_radius", tabTitleStyle.f57444g);
            JsonPropertyParser.write(parsingContext, jSONObject, "corners_radius", tabTitleStyle.f57445h, this.f57507a.s2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_family", tabTitleStyle.f57446i);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size", tabTitleStyle.f57447j);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size_unit", tabTitleStyle.f57448k, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, tabTitleStyle.f57449l, lVar2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "inactive_background_color", tabTitleStyle.f57450m, lVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "inactive_font_variation_settings", tabTitleStyle.f57451n);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "inactive_font_weight", tabTitleStyle.f57452o, lVar2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "inactive_text_color", tabTitleStyle.f57453p, lVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "item_spacing", tabTitleStyle.f57454q);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "letter_spacing", tabTitleStyle.f57455r);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "line_height", tabTitleStyle.f57456s);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", tabTitleStyle.f57457t, this.f57507a.Y2());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivTabsJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f57508a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f57508a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTabsTemplate.TabTitleStyleTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivTabsTemplate.TabTitleStyleTemplate tabTitleStyleTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field<Expression<Integer>> field = tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f57559a : null;
            sn.l<Object, Integer> lVar = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "active_background_color", typeHelper, allowPropertyOverride, field, lVar);
            TypeHelper<JSONObject> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DICT;
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "active_font_variation_settings", typeHelper2, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f57560b : null);
            TypeHelper<DivFontWeight> typeHelper3 = DivTabsTabTitleStyleJsonParser.f57497m;
            Field<Expression<DivFontWeight>> field2 = tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f57561c : null;
            sn.l<String, DivFontWeight> lVar2 = DivFontWeight.FROM_STRING;
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "active_font_weight", typeHelper3, allowPropertyOverride, field2, lVar2);
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "active_text_color", typeHelper, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f57562d : null, lVar);
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field3 = tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f57563e : null;
            sn.l<Number, Long> lVar3 = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivTabsTemplate.TabTitleStyleTemplate(optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalFieldWithExpression4, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "animation_duration", typeHelper4, allowPropertyOverride, field3, lVar3, DivTabsTabTitleStyleJsonParser.f57502r), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "animation_type", DivTabsTabTitleStyleJsonParser.f57498n, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f57564f : null, DivTabs.TabTitleStyle.AnimationType.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "corner_radius", typeHelper4, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f57565g : null, lVar3, DivTabsTabTitleStyleJsonParser.f57503s), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "corners_radius", allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f57566h : null, this.f57508a.t2()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_family", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f57567i : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size", typeHelper4, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f57568j : null, lVar3, DivTabsTabTitleStyleJsonParser.f57504t), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size_unit", DivTabsTabTitleStyleJsonParser.f57499o, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f57569k : null, DivSizeUnit.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FontsContractCompat.Columns.WEIGHT, DivTabsTabTitleStyleJsonParser.f57500p, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f57570l : null, lVar2), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "inactive_background_color", typeHelper, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f57571m : null, lVar), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "inactive_font_variation_settings", typeHelper2, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f57572n : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "inactive_font_weight", DivTabsTabTitleStyleJsonParser.f57501q, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f57573o : null, lVar2), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "inactive_text_color", typeHelper, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f57574p : null, lVar), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "item_spacing", typeHelper4, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f57575q : null, lVar3, DivTabsTabTitleStyleJsonParser.f57505u), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "letter_spacing", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f57576r : null, ParsingConvertersKt.NUMBER_TO_DOUBLE), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "line_height", typeHelper4, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f57577s : null, lVar3, DivTabsTabTitleStyleJsonParser.f57506v), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.f57578t : null, this.f57508a.Z2()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTabsTemplate.TabTitleStyleTemplate tabTitleStyleTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Field<Expression<Integer>> field = tabTitleStyleTemplate.f57559a;
            sn.l<Integer, String> lVar = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "active_background_color", field, lVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "active_font_variation_settings", tabTitleStyleTemplate.f57560b);
            Field<Expression<DivFontWeight>> field2 = tabTitleStyleTemplate.f57561c;
            sn.l<DivFontWeight, String> lVar2 = DivFontWeight.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "active_font_weight", field2, lVar2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "active_text_color", tabTitleStyleTemplate.f57562d, lVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "animation_duration", tabTitleStyleTemplate.f57563e);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "animation_type", tabTitleStyleTemplate.f57564f, DivTabs.TabTitleStyle.AnimationType.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "corner_radius", tabTitleStyleTemplate.f57565g);
            JsonFieldParser.writeField(parsingContext, jSONObject, "corners_radius", tabTitleStyleTemplate.f57566h, this.f57508a.t2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_family", tabTitleStyleTemplate.f57567i);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size", tabTitleStyleTemplate.f57568j);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size_unit", tabTitleStyleTemplate.f57569k, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, tabTitleStyleTemplate.f57570l, lVar2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "inactive_background_color", tabTitleStyleTemplate.f57571m, lVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "inactive_font_variation_settings", tabTitleStyleTemplate.f57572n);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "inactive_font_weight", tabTitleStyleTemplate.f57573o, lVar2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "inactive_text_color", tabTitleStyleTemplate.f57574p, lVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "item_spacing", tabTitleStyleTemplate.f57575q);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "letter_spacing", tabTitleStyleTemplate.f57576r);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "line_height", tabTitleStyleTemplate.f57577s);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", tabTitleStyleTemplate.f57578t, this.f57508a.Z2());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivTabsJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivTabsTemplate.TabTitleStyleTemplate, DivTabs.TabTitleStyle> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f57509a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f57509a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTabs.TabTitleStyle resolve(@NotNull ParsingContext parsingContext, @NotNull DivTabsTemplate.TabTitleStyleTemplate tabTitleStyleTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            Field<Expression<Integer>> field = tabTitleStyleTemplate.f57559a;
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            sn.l<Object, Integer> lVar = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression = DivTabsTabTitleStyleJsonParser.f57486b;
            Expression<Integer> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "active_background_color", typeHelper, lVar, expression);
            Expression<Integer> expression2 = expressionResolveOptionalExpression == null ? expression : expressionResolveOptionalExpression;
            Field<Expression<JSONObject>> field2 = tabTitleStyleTemplate.f57560b;
            TypeHelper<JSONObject> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DICT;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "active_font_variation_settings", typeHelper2);
            Field<Expression<DivFontWeight>> field3 = tabTitleStyleTemplate.f57561c;
            TypeHelper<DivFontWeight> typeHelper3 = DivTabsTabTitleStyleJsonParser.f57497m;
            sn.l<String, DivFontWeight> lVar2 = DivFontWeight.FROM_STRING;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "active_font_weight", typeHelper3, lVar2);
            Field<Expression<Integer>> field4 = tabTitleStyleTemplate.f57562d;
            Expression<Integer> expression3 = DivTabsTabTitleStyleJsonParser.f57487c;
            Expression<Integer> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "active_text_color", typeHelper, lVar, expression3);
            Expression<Integer> expression4 = expressionResolveOptionalExpression4 == null ? expression3 : expressionResolveOptionalExpression4;
            Field<Expression<Long>> field5 = tabTitleStyleTemplate.f57563e;
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar3 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator<Long> valueValidator = DivTabsTabTitleStyleJsonParser.f57502r;
            Expression<Long> expression5 = DivTabsTabTitleStyleJsonParser.f57488d;
            Expression<Long> expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "animation_duration", typeHelper4, lVar3, valueValidator, expression5);
            if (expressionResolveOptionalExpression5 != null) {
                expression5 = expressionResolveOptionalExpression5;
            }
            Field<Expression<DivTabs.TabTitleStyle.AnimationType>> field6 = tabTitleStyleTemplate.f57564f;
            TypeHelper<DivTabs.TabTitleStyle.AnimationType> typeHelper5 = DivTabsTabTitleStyleJsonParser.f57498n;
            sn.l<String, DivTabs.TabTitleStyle.AnimationType> lVar4 = DivTabs.TabTitleStyle.AnimationType.FROM_STRING;
            Expression<DivTabs.TabTitleStyle.AnimationType> expression6 = DivTabsTabTitleStyleJsonParser.f57489e;
            Expression<DivTabs.TabTitleStyle.AnimationType> expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "animation_type", typeHelper5, lVar4, expression6);
            Expression<DivTabs.TabTitleStyle.AnimationType> expression7 = expressionResolveOptionalExpression6 == null ? expression6 : expressionResolveOptionalExpression6;
            Expression expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, tabTitleStyleTemplate.f57565g, jSONObject, "corner_radius", typeHelper4, lVar3, DivTabsTabTitleStyleJsonParser.f57503s);
            DivCornersRadius divCornersRadius = (DivCornersRadius) JsonFieldResolver.resolveOptional(parsingContext, tabTitleStyleTemplate.f57566h, jSONObject, "corners_radius", this.f57509a.u2(), this.f57509a.s2());
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, tabTitleStyleTemplate.f57567i, jSONObject, "font_family", TypeHelpersKt.TYPE_HELPER_STRING);
            Field<Expression<Long>> field7 = tabTitleStyleTemplate.f57568j;
            ValueValidator<Long> valueValidator2 = DivTabsTabTitleStyleJsonParser.f57504t;
            Expression<Long> expression8 = DivTabsTabTitleStyleJsonParser.f57490f;
            Expression<Long> expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "font_size", typeHelper4, lVar3, valueValidator2, expression8);
            if (expressionResolveOptionalExpression9 != null) {
                expression8 = expressionResolveOptionalExpression9;
            }
            Field<Expression<DivSizeUnit>> field8 = tabTitleStyleTemplate.f57569k;
            TypeHelper<DivSizeUnit> typeHelper6 = DivTabsTabTitleStyleJsonParser.f57499o;
            sn.l<String, DivSizeUnit> lVar5 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression9 = DivTabsTabTitleStyleJsonParser.f57491g;
            Expression<DivSizeUnit> expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "font_size_unit", typeHelper6, lVar5, expression9);
            Expression<DivSizeUnit> expression10 = expressionResolveOptionalExpression10 == null ? expression9 : expressionResolveOptionalExpression10;
            Field<Expression<DivFontWeight>> field9 = tabTitleStyleTemplate.f57570l;
            TypeHelper<DivFontWeight> typeHelper7 = DivTabsTabTitleStyleJsonParser.f57500p;
            Expression<DivFontWeight> expression11 = DivTabsTabTitleStyleJsonParser.f57492h;
            Expression<DivFontWeight> expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, FontsContractCompat.Columns.WEIGHT, typeHelper7, lVar2, expression11);
            Expression<DivFontWeight> expression12 = expressionResolveOptionalExpression11 == null ? expression11 : expressionResolveOptionalExpression11;
            Expression expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, tabTitleStyleTemplate.f57571m, jSONObject, "inactive_background_color", typeHelper, lVar);
            Expression expressionResolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, tabTitleStyleTemplate.f57572n, jSONObject, "inactive_font_variation_settings", typeHelper2);
            Expression expressionResolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, tabTitleStyleTemplate.f57573o, jSONObject, "inactive_font_weight", DivTabsTabTitleStyleJsonParser.f57501q, lVar2);
            Field<Expression<Integer>> field10 = tabTitleStyleTemplate.f57574p;
            Expression<Integer> expression13 = DivTabsTabTitleStyleJsonParser.f57493i;
            Expression<Integer> expressionResolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, "inactive_text_color", typeHelper, lVar, expression13);
            Expression<Integer> expression14 = expressionResolveOptionalExpression15 == null ? expression13 : expressionResolveOptionalExpression15;
            Field<Expression<Long>> field11 = tabTitleStyleTemplate.f57575q;
            ValueValidator<Long> valueValidator3 = DivTabsTabTitleStyleJsonParser.f57505u;
            Expression<Long> expression15 = DivTabsTabTitleStyleJsonParser.f57494j;
            Expression<Long> expressionResolveOptionalExpression16 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field11, jSONObject, "item_spacing", typeHelper4, lVar3, valueValidator3, expression15);
            Expression<Long> expression16 = expressionResolveOptionalExpression16 == null ? expression15 : expressionResolveOptionalExpression16;
            Field<Expression<Double>> field12 = tabTitleStyleTemplate.f57576r;
            TypeHelper<Double> typeHelper8 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar6 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression<Double> expression17 = DivTabsTabTitleStyleJsonParser.f57495k;
            Expression<Double> expressionResolveOptionalExpression17 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field12, jSONObject, "letter_spacing", typeHelper8, lVar6, expression17);
            Expression<Double> expression18 = expressionResolveOptionalExpression17 == null ? expression17 : expressionResolveOptionalExpression17;
            Expression expressionResolveOptionalExpression18 = JsonFieldResolver.resolveOptionalExpression(parsingContext, tabTitleStyleTemplate.f57577s, jSONObject, "line_height", typeHelper4, lVar3, DivTabsTabTitleStyleJsonParser.f57506v);
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, tabTitleStyleTemplate.f57578t, jSONObject, "paddings", this.f57509a.a3(), this.f57509a.Y2());
            if (divEdgeInsets == null) {
                divEdgeInsets = DivTabsTabTitleStyleJsonParser.f57496l;
            }
            return new DivTabs.TabTitleStyle(expression2, expressionResolveOptionalExpression2, expressionResolveOptionalExpression3, expression4, expression5, expression7, expressionResolveOptionalExpression7, divCornersRadius, expressionResolveOptionalExpression8, expression8, expression10, expression12, expressionResolveOptionalExpression12, expressionResolveOptionalExpression13, expressionResolveOptionalExpression14, expression14, expression16, expression18, expressionResolveOptionalExpression18, divEdgeInsets);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f57486b = Expression.Companion.constant$default(companion, -9120, null, 2, null);
        f57487c = Expression.Companion.constant$default(companion, -872415232, null, 2, null);
        f57488d = Expression.Companion.constant$default(companion, 300L, null, 2, null);
        DivTabs.TabTitleStyle.AnimationType animationType = DivTabs.TabTitleStyle.AnimationType.SLIDE;
        f57489e = Expression.Companion.constant$default(companion, animationType, null, 2, null);
        f57490f = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        DivSizeUnit divSizeUnit = DivSizeUnit.SP;
        f57491g = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        DivFontWeight divFontWeight = DivFontWeight.REGULAR;
        f57492h = Expression.Companion.constant$default(companion, divFontWeight, null, 2, null);
        f57493i = Expression.Companion.constant$default(companion, Integer.MIN_VALUE, null, 2, null);
        f57494j = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f57495k = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f57496l = new DivEdgeInsets(Expression.Companion.constant$default(companion, 6L, null, 2, null), null, Expression.Companion.constant$default(companion, 8L, null, 2, null), Expression.Companion.constant$default(companion, 8L, null, 2, null), null, Expression.Companion.constant$default(companion, 6L, null, 2, null), null, 82, null);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f57497m = companion2.from(cn.r.W(DivFontWeight.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivTabsTabTitleStyleJsonParser$Companion$TYPE_HELPER_ACTIVE_FONT_WEIGHT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivFontWeight);
            }
        });
        f57498n = companion2.from(animationType, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivTabsTabTitleStyleJsonParser$Companion$TYPE_HELPER_ANIMATION_TYPE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivTabs.TabTitleStyle.AnimationType);
            }
        });
        f57499o = companion2.from(divSizeUnit, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivTabsTabTitleStyleJsonParser$Companion$TYPE_HELPER_FONT_SIZE_UNIT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        });
        f57500p = companion2.from(divFontWeight, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivTabsTabTitleStyleJsonParser$Companion$TYPE_HELPER_FONT_WEIGHT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivFontWeight);
            }
        });
        f57501q = companion2.from(cn.r.W(DivFontWeight.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivTabsTabTitleStyleJsonParser$Companion$TYPE_HELPER_INACTIVE_FONT_WEIGHT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivFontWeight);
            }
        });
        f57502r = new ValueValidator() { // from class: ah.ma
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTabsTabTitleStyleJsonParser.f(((Long) obj).longValue());
            }
        };
        f57503s = new ValueValidator() { // from class: ah.na
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTabsTabTitleStyleJsonParser.g(((Long) obj).longValue());
            }
        };
        f57504t = new ValueValidator() { // from class: ah.oa
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTabsTabTitleStyleJsonParser.h(((Long) obj).longValue());
            }
        };
        f57505u = new ValueValidator() { // from class: ah.pa
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTabsTabTitleStyleJsonParser.i(((Long) obj).longValue());
            }
        };
        f57506v = new ValueValidator() { // from class: ah.qa
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTabsTabTitleStyleJsonParser.j(((Long) obj).longValue());
            }
        };
    }

    public static final boolean f(long j10) {
        return j10 >= 0;
    }

    public static final boolean g(long j10) {
        return j10 >= 0;
    }

    public static final boolean h(long j10) {
        return j10 >= 0;
    }

    public static final boolean i(long j10) {
        return j10 >= 0;
    }

    public static final boolean j(long j10) {
        return j10 >= 0;
    }
}
