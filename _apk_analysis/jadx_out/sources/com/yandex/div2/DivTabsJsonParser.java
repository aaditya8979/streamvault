package com.yandex.div2;

import androidx.compose.material.OutlinedTextFieldKt;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
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
import com.yandex.div2.DivSize;
import com.yandex.div2.DivTabs;
import com.yandex.div2.DivTabsJsonParser;
import com.yandex.div2.DivTabsTemplate;
import io.appmetrica.analytics.impl.A2;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTabsJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivTabsJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f57460a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f57461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f57462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f57463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivSize.d f57464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f57465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f57466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Integer> f57467h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivEdgeInsets f57468i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f57469j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivEdgeInsets f57470k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivVisibility> f57471l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivSize.c f57472m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f57473n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f57474o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivVisibility> f57475p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Double> f57476q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f57477r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ListValidator<DivTabs.Item> f57478s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f57479t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f57480u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f57481v;

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
        public final JsonParserComponent f57482a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f57482a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTabs deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f57482a.H());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", DivTabsJsonParser.f57473n, DivAlignmentHorizontal.FROM_STRING);
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", DivTabsJsonParser.f57474o, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivTabsJsonParser.f57476q;
            Expression<Double> expression = DivTabsJsonParser.f57461b;
            Expression<Double> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f57482a.t1());
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f64965g, this.f57482a.F1());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f57482a.L1());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, lVar2, DivTabsJsonParser.f57477r);
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f57482a.P2());
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = DivTabsJsonParser.f57462c;
            Expression<Boolean> optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "dynamic_height", typeHelper3, lVar3, expression2);
            if (optionalExpression5 != null) {
                expression2 = optionalExpression5;
            }
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f57482a.b3());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f57482a.z3());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f57482a.I3());
            Expression<Boolean> expression3 = DivTabsJsonParser.f57463d;
            Expression<Boolean> optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "has_separator", typeHelper3, lVar3, expression3);
            if (optionalExpression6 != null) {
                expression3 = optionalExpression6;
            }
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f57482a.Y6());
            if (divSize == null) {
                divSize = DivTabsJsonParser.f57464e;
            }
            DivSize divSize2 = divSize;
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            List list = JsonPropertyParser.readList(parsingContext, jSONObject, "items", this.f57482a.R7(), DivTabsJsonParser.f57478s);
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f57482a.P4());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f57482a.Y2());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f57482a.Y2());
            Expression<Boolean> expression4 = DivTabsJsonParser.f57465f;
            Expression<Boolean> optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "restrict_parent_scroll", typeHelper3, lVar3, expression4);
            if (optionalExpression7 != null) {
                expression4 = optionalExpression7;
            }
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, lVar2, DivTabsJsonParser.f57479t);
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f57482a.u0());
            ValueValidator<Long> valueValidator2 = DivTabsJsonParser.f57480u;
            Expression<Long> expression5 = DivTabsJsonParser.f57466g;
            Expression<Long> optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "selected_tab", typeHelper2, lVar2, valueValidator2, expression5);
            if (optionalExpression10 != null) {
                expression5 = optionalExpression10;
            }
            TypeHelper<Integer> typeHelper4 = TypeHelpersKt.TYPE_HELPER_COLOR;
            sn.l<Object, Integer> lVar4 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression6 = DivTabsJsonParser.f57467h;
            Expression<Integer> optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "separator_color", typeHelper4, lVar4, expression6);
            Expression<Integer> expression7 = optionalExpression11 == null ? expression6 : optionalExpression11;
            DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "separator_paddings", this.f57482a.Y2());
            if (divEdgeInsets3 == null) {
                divEdgeInsets3 = DivTabsJsonParser.f57468i;
            }
            DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
            Expression<Boolean> expression8 = DivTabsJsonParser.f57469j;
            Expression<Boolean> optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "switch_tabs_by_content_swipe_enabled", typeHelper3, lVar3, expression8);
            Expression<Boolean> expression9 = optionalExpression12 == null ? expression8 : optionalExpression12;
            DivTabs.TabTitleDelimiter tabTitleDelimiter = (DivTabs.TabTitleDelimiter) JsonPropertyParser.readOptional(parsingContext, jSONObject, "tab_title_delimiter", this.f57482a.X7());
            DivTabs.TabTitleStyle tabTitleStyle = (DivTabs.TabTitleStyle) JsonPropertyParser.readOptional(parsingContext, jSONObject, "tab_title_style", this.f57482a.a8());
            DivEdgeInsets divEdgeInsets5 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "title_paddings", this.f57482a.Y2());
            if (divEdgeInsets5 == null) {
                divEdgeInsets5 = DivTabsJsonParser.f57470k;
            }
            DivEdgeInsets divEdgeInsets6 = divEdgeInsets5;
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f57482a.P8());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f57482a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f57482a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f57482a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f57482a.z1());
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivTabsJsonParser.f57481v);
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f57482a.e9());
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f57482a.k9());
            TypeHelper<DivVisibility> typeHelper5 = DivTabsJsonParser.f57475p;
            sn.l<String, DivVisibility> lVar5 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression10 = DivTabsJsonParser.f57471l;
            Expression<DivVisibility> optionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper5, lVar5, expression10);
            Expression<DivVisibility> expression11 = optionalExpression13 == null ? expression10 : optionalExpression13;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f57482a.w9());
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f57482a.w9());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f57482a.Y6());
            if (divSize3 == null) {
                divSize3 = DivTabsJsonParser.f57472m;
            }
            return new DivTabs(divAccessibility, optionalExpression, optionalExpression2, expression, optionalList, optionalList2, divBorder, optionalExpression4, optionalList3, expression2, optionalList4, divFocus, optionalList5, expression3, divSize2, str, list, divLayoutProvider, divEdgeInsets, divEdgeInsets2, expression4, optionalExpression8, optionalExpression9, optionalList6, expression5, expression7, divEdgeInsets4, expression9, tabTitleDelimiter, tabTitleStyle, divEdgeInsets6, optionalList7, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, optionalList8, optionalList9, optionalList10, expression11, divVisibilityAction, optionalList11, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTabs divTabs) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divTabs.o(), this.f57482a.H());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divTabs.g(), DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divTabs.m(), DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divTabs.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divTabs.w(), this.f57482a.t1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, A2.f64965g, divTabs.getBackground(), this.f57482a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, divTabs.x(), this.f57482a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divTabs.b());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divTabs.k(), this.f57482a.P2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "dynamic_height", divTabs.f57402j);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divTabs.getExtensions(), this.f57482a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divTabs.n(), this.f57482a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divTabs.u(), this.f57482a.I3());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "has_separator", divTabs.f57406n);
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divTabs.getHeight(), this.f57482a.Y6());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divTabs.getId());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "items", divTabs.f57409q, this.f57482a.R7());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divTabs.r(), this.f57482a.P4());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divTabs.d(), this.f57482a.Y2());
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divTabs.p(), this.f57482a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "restrict_parent_scroll", divTabs.f57413u);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divTabs.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divTabs.e());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divTabs.q(), this.f57482a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "selected_tab", divTabs.f57417y);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "separator_color", divTabs.f57418z, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "separator_paddings", divTabs.A, this.f57482a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "switch_tabs_by_content_swipe_enabled", divTabs.B);
            JsonPropertyParser.write(parsingContext, jSONObject, "tab_title_delimiter", divTabs.C, this.f57482a.X7());
            JsonPropertyParser.write(parsingContext, jSONObject, "tab_title_style", divTabs.D, this.f57482a.a8());
            JsonPropertyParser.write(parsingContext, jSONObject, "title_paddings", divTabs.E, this.f57482a.Y2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divTabs.h(), this.f57482a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divTabs.getTransform(), this.f57482a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divTabs.j(), this.f57482a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divTabs.v(), this.f57482a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divTabs.i(), this.f57482a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divTabs.l(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "tabs");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divTabs.s(), this.f57482a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divTabs.c(), this.f57482a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divTabs.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divTabs.t(), this.f57482a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divTabs.a(), this.f57482a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divTabs.getWidth(), this.f57482a.Y6());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivTabsJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f57483a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f57483a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTabsTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivTabsTemplate divTabsTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f57515a : null, this.f57483a.I());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", DivTabsJsonParser.f57473n, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f57516b : null, DivAlignmentHorizontal.FROM_STRING);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", DivTabsJsonParser.f57474o, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f57517c : null, DivAlignmentVertical.FROM_STRING);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f57518d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivTabsJsonParser.f57476q);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f57519e : null, this.f57483a.u1());
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f64965g, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f57520f : null, this.f57483a.G1());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f57521g : null, this.f57483a.M1());
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divTabsTemplate != null ? divTabsTemplate.f57522h : null;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, field, lVar, DivTabsJsonParser.f57477r);
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f57523i : null, this.f57483a.Q2());
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field2 = divTabsTemplate != null ? divTabsTemplate.f57524j : null;
            sn.l<Object, Boolean> lVar2 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "dynamic_height", typeHelper2, allowPropertyOverride, field2, lVar2);
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f57525k : null, this.f57483a.c3());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f57526l : null, this.f57483a.A3());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f57527m : null, this.f57483a.J3());
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "has_separator", typeHelper2, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f57528n : null, lVar2);
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f57529o : null, this.f57483a.Z6());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f57530p : null);
            Field<List<DivTabsTemplate.ItemTemplate>> field3 = divTabsTemplate != null ? divTabsTemplate.f57531q : null;
            bn.g<e4> gVarS7 = this.f57483a.S7();
            ListValidator<DivTabs.Item> listValidator = DivTabsJsonParser.f57478s;
            tn.p.i(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field listField = JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, "items", allowPropertyOverride, field3, gVarS7, listValidator);
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f57532r : null, this.f57483a.Q4());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f57533s : null, this.f57483a.Z2());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f57534t : null, this.f57483a.Z2());
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "restrict_parent_scroll", typeHelper2, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f57535u : null, lVar2);
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f57536v : null);
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f57537w : null, lVar, DivTabsJsonParser.f57479t);
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f57538x : null, this.f57483a.v0());
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "selected_tab", typeHelper, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f57539y : null, lVar, DivTabsJsonParser.f57480u);
            Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "separator_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.f57540z : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "separator_paddings", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.A : null, this.f57483a.Z2());
            Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "switch_tabs_by_content_swipe_enabled", typeHelper2, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.B : null, lVar2);
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "tab_title_delimiter", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.C : null, this.f57483a.Y7());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "tab_title_style", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.D : null, this.f57483a.b8());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "title_paddings", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.E : null, this.f57483a.Z2());
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.F : null, this.f57483a.Q8());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.G : null, this.f57483a.c9());
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.H : null, this.f57483a.V1());
            Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.I : null, this.f57483a.A1());
            Field optionalField16 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.J : null, this.f57483a.A1());
            Field<List<DivTransitionTrigger>> field4 = divTabsTemplate != null ? divTabsTemplate.K : null;
            sn.l<String, DivTransitionTrigger> lVar3 = DivTransitionTrigger.FROM_STRING;
            ListValidator<DivTransitionTrigger> listValidator2 = DivTabsJsonParser.f57481v;
            tn.p.i(listValidator2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivTabsTemplate(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField, optionalListField2, optionalField2, optionalFieldWithExpression4, optionalListField3, optionalFieldWithExpression5, optionalListField4, optionalField3, optionalListField5, optionalFieldWithExpression6, optionalField4, optionalField5, listField, optionalField6, optionalField7, optionalField8, optionalFieldWithExpression7, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalListField6, optionalFieldWithExpression10, optionalFieldWithExpression11, optionalField9, optionalFieldWithExpression12, optionalField10, optionalField11, optionalField12, optionalListField7, optionalField13, optionalField14, optionalField15, optionalField16, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field4, lVar3, listValidator2), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.L : null, this.f57483a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.M : null, this.f57483a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", DivTabsJsonParser.f57475p, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.N : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.O : null, this.f57483a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.P : null, this.f57483a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.Q : null, this.f57483a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTabsTemplate divTabsTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divTabsTemplate.f57515a, this.f57483a.I());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", divTabsTemplate.f57516b, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", divTabsTemplate.f57517c, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divTabsTemplate.f57518d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divTabsTemplate.f57519e, this.f57483a.u1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, A2.f64965g, divTabsTemplate.f57520f, this.f57483a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, divTabsTemplate.f57521g, this.f57483a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divTabsTemplate.f57522h);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divTabsTemplate.f57523i, this.f57483a.Q2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "dynamic_height", divTabsTemplate.f57524j);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divTabsTemplate.f57525k, this.f57483a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divTabsTemplate.f57526l, this.f57483a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divTabsTemplate.f57527m, this.f57483a.J3());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "has_separator", divTabsTemplate.f57528n);
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divTabsTemplate.f57529o, this.f57483a.Z6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divTabsTemplate.f57530p);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "items", divTabsTemplate.f57531q, this.f57483a.S7());
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divTabsTemplate.f57532r, this.f57483a.Q4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divTabsTemplate.f57533s, this.f57483a.Z2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divTabsTemplate.f57534t, this.f57483a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "restrict_parent_scroll", divTabsTemplate.f57535u);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divTabsTemplate.f57536v);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divTabsTemplate.f57537w);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divTabsTemplate.f57538x, this.f57483a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "selected_tab", divTabsTemplate.f57539y);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "separator_color", divTabsTemplate.f57540z, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "separator_paddings", divTabsTemplate.A, this.f57483a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "switch_tabs_by_content_swipe_enabled", divTabsTemplate.B);
            JsonFieldParser.writeField(parsingContext, jSONObject, "tab_title_delimiter", divTabsTemplate.C, this.f57483a.Y7());
            JsonFieldParser.writeField(parsingContext, jSONObject, "tab_title_style", divTabsTemplate.D, this.f57483a.b8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "title_paddings", divTabsTemplate.E, this.f57483a.Z2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divTabsTemplate.F, this.f57483a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divTabsTemplate.G, this.f57483a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divTabsTemplate.H, this.f57483a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divTabsTemplate.I, this.f57483a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divTabsTemplate.J, this.f57483a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divTabsTemplate.K, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "tabs");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divTabsTemplate.L, this.f57483a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divTabsTemplate.M, this.f57483a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", divTabsTemplate.N, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divTabsTemplate.O, this.f57483a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divTabsTemplate.P, this.f57483a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divTabsTemplate.Q, this.f57483a.Z6());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivTabsJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivTabsTemplate, DivTabs> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f57484a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f57484a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTabs resolve(@NotNull ParsingContext parsingContext, @NotNull DivTabsTemplate divTabsTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.f57515a, jSONObject, "accessibility", this.f57484a.J(), this.f57484a.H());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTabsTemplate.f57516b, jSONObject, "alignment_horizontal", DivTabsJsonParser.f57473n, DivAlignmentHorizontal.FROM_STRING);
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTabsTemplate.f57517c, jSONObject, "alignment_vertical", DivTabsJsonParser.f57474o, DivAlignmentVertical.FROM_STRING);
            Field<Expression<Double>> field = divTabsTemplate.f57518d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivTabsJsonParser.f57476q;
            Expression<Double> expression = DivTabsJsonParser.f57461b;
            Expression<Double> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression3 != null) {
                expression = expressionResolveOptionalExpression3;
            }
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divTabsTemplate.f57519e, jSONObject, "animators", this.f57484a.v1(), this.f57484a.t1());
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divTabsTemplate.f57520f, jSONObject, A2.f64965g, this.f57484a.H1(), this.f57484a.F1());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.f57521g, jSONObject, OutlinedTextFieldKt.BorderId, this.f57484a.N1(), this.f57484a.L1());
            Field<Expression<Long>> field2 = divTabsTemplate.f57522h;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "column_span", typeHelper2, lVar2, DivTabsJsonParser.f57477r);
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divTabsTemplate.f57523i, jSONObject, "disappear_actions", this.f57484a.R2(), this.f57484a.P2());
            Field<Expression<Boolean>> field3 = divTabsTemplate.f57524j;
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = DivTabsJsonParser.f57462c;
            Expression<Boolean> expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "dynamic_height", typeHelper3, lVar3, expression2);
            if (expressionResolveOptionalExpression5 != null) {
                expression2 = expressionResolveOptionalExpression5;
            }
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divTabsTemplate.f57525k, jSONObject, "extensions", this.f57484a.d3(), this.f57484a.b3());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.f57526l, jSONObject, "focus", this.f57484a.B3(), this.f57484a.z3());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divTabsTemplate.f57527m, jSONObject, "functions", this.f57484a.K3(), this.f57484a.I3());
            Field<Expression<Boolean>> field4 = divTabsTemplate.f57528n;
            Expression<Boolean> expression3 = DivTabsJsonParser.f57463d;
            Expression<Boolean> expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "has_separator", typeHelper3, lVar3, expression3);
            if (expressionResolveOptionalExpression6 != null) {
                expression3 = expressionResolveOptionalExpression6;
            }
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.f57529o, jSONObject, "height", this.f57484a.a7(), this.f57484a.Y6());
            if (divSize == null) {
                divSize = DivTabsJsonParser.f57464e;
            }
            DivSize divSize2 = divSize;
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.f57530p, jSONObject, "id");
            List listResolveList = JsonFieldResolver.resolveList(parsingContext, divTabsTemplate.f57531q, jSONObject, "items", this.f57484a.T7(), this.f57484a.R7(), DivTabsJsonParser.f57478s);
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.f57532r, jSONObject, "layout_provider", this.f57484a.R4(), this.f57484a.P4());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.f57533s, jSONObject, "margins", this.f57484a.a3(), this.f57484a.Y2());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.f57534t, jSONObject, "paddings", this.f57484a.a3(), this.f57484a.Y2());
            Field<Expression<Boolean>> field5 = divTabsTemplate.f57535u;
            Expression<Boolean> expression4 = DivTabsJsonParser.f57465f;
            Expression<Boolean> expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "restrict_parent_scroll", typeHelper3, lVar3, expression4);
            if (expressionResolveOptionalExpression7 != null) {
                expression4 = expressionResolveOptionalExpression7;
            }
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTabsTemplate.f57536v, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTabsTemplate.f57537w, jSONObject, "row_span", typeHelper2, lVar2, DivTabsJsonParser.f57479t);
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divTabsTemplate.f57538x, jSONObject, "selected_actions", this.f57484a.w0(), this.f57484a.u0());
            Field<Expression<Long>> field6 = divTabsTemplate.f57539y;
            ValueValidator<Long> valueValidator2 = DivTabsJsonParser.f57480u;
            Expression<Long> expression5 = DivTabsJsonParser.f57466g;
            Expression<Long> expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "selected_tab", typeHelper2, lVar2, valueValidator2, expression5);
            if (expressionResolveOptionalExpression10 != null) {
                expression5 = expressionResolveOptionalExpression10;
            }
            Field<Expression<Integer>> field7 = divTabsTemplate.f57540z;
            TypeHelper<Integer> typeHelper4 = TypeHelpersKt.TYPE_HELPER_COLOR;
            sn.l<Object, Integer> lVar4 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression6 = DivTabsJsonParser.f57467h;
            Expression<Integer> expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "separator_color", typeHelper4, lVar4, expression6);
            Expression<Integer> expression7 = expressionResolveOptionalExpression11 == null ? expression6 : expressionResolveOptionalExpression11;
            DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.A, jSONObject, "separator_paddings", this.f57484a.a3(), this.f57484a.Y2());
            if (divEdgeInsets3 == null) {
                divEdgeInsets3 = DivTabsJsonParser.f57468i;
            }
            DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
            Field<Expression<Boolean>> field8 = divTabsTemplate.B;
            Expression<Boolean> expression8 = DivTabsJsonParser.f57469j;
            Expression<Boolean> expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "switch_tabs_by_content_swipe_enabled", typeHelper3, lVar3, expression8);
            Expression<Boolean> expression9 = expressionResolveOptionalExpression12 == null ? expression8 : expressionResolveOptionalExpression12;
            DivTabs.TabTitleDelimiter tabTitleDelimiter = (DivTabs.TabTitleDelimiter) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.C, jSONObject, "tab_title_delimiter", this.f57484a.Z7(), this.f57484a.X7());
            DivTabs.TabTitleStyle tabTitleStyle = (DivTabs.TabTitleStyle) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.D, jSONObject, "tab_title_style", this.f57484a.c8(), this.f57484a.a8());
            DivEdgeInsets divEdgeInsets5 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.E, jSONObject, "title_paddings", this.f57484a.a3(), this.f57484a.Y2());
            if (divEdgeInsets5 == null) {
                divEdgeInsets5 = DivTabsJsonParser.f57470k;
            }
            DivEdgeInsets divEdgeInsets6 = divEdgeInsets5;
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divTabsTemplate.F, jSONObject, "tooltips", this.f57484a.R8(), this.f57484a.P8());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.G, jSONObject, "transform", this.f57484a.d9(), this.f57484a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.H, jSONObject, "transition_change", this.f57484a.W1(), this.f57484a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.I, jSONObject, "transition_in", this.f57484a.B1(), this.f57484a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.J, jSONObject, "transition_out", this.f57484a.B1(), this.f57484a.z1());
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divTabsTemplate.K, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivTabsJsonParser.f57481v);
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divTabsTemplate.L, jSONObject, "variable_triggers", this.f57484a.g9(), this.f57484a.e9());
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divTabsTemplate.M, jSONObject, "variables", this.f57484a.m9(), this.f57484a.k9());
            Field<Expression<DivVisibility>> field9 = divTabsTemplate.N;
            TypeHelper<DivVisibility> typeHelper5 = DivTabsJsonParser.f57475p;
            sn.l<String, DivVisibility> lVar5 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression10 = DivTabsJsonParser.f57471l;
            Expression<DivVisibility> expressionResolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "visibility", typeHelper5, lVar5, expression10);
            Expression<DivVisibility> expression11 = expressionResolveOptionalExpression13 == null ? expression10 : expressionResolveOptionalExpression13;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.O, jSONObject, "visibility_action", this.f57484a.y9(), this.f57484a.w9());
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divTabsTemplate.P, jSONObject, "visibility_actions", this.f57484a.y9(), this.f57484a.w9());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.Q, jSONObject, "width", this.f57484a.a7(), this.f57484a.Y6());
            if (divSize3 == null) {
                divSize3 = DivTabsJsonParser.f57472m;
            }
            return new DivTabs(divAccessibility, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression, listResolveOptionalList, listResolveOptionalList2, divBorder, expressionResolveOptionalExpression4, listResolveOptionalList3, expression2, listResolveOptionalList4, divFocus, listResolveOptionalList5, expression3, divSize2, str, listResolveList, divLayoutProvider, divEdgeInsets, divEdgeInsets2, expression4, expressionResolveOptionalExpression8, expressionResolveOptionalExpression9, listResolveOptionalList6, expression5, expression7, divEdgeInsets4, expression9, tabTitleDelimiter, tabTitleStyle, divEdgeInsets6, listResolveOptionalList7, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, listResolveOptionalList8, listResolveOptionalList9, listResolveOptionalList10, expression11, divVisibilityAction, listResolveOptionalList11, divSize3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        f57461b = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Boolean bool = Boolean.FALSE;
        f57462c = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f57463d = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f57464e = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        f57465f = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f57466g = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f57467h = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        Expression expression = null;
        Expression expression2 = null;
        int i10 = 82;
        tn.i iVar = null;
        f57468i = new DivEdgeInsets(Expression.Companion.constant$default(companion, 0L, null, 2, null), expression, Expression.Companion.constant$default(companion, 12L, null, 2, null), Expression.Companion.constant$default(companion, 12L, null, 2, null), null == true ? 1 : 0, Expression.Companion.constant$default(companion, 0L, null, 2, null), expression2, i10, iVar);
        f57469j = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f57470k = new DivEdgeInsets(Expression.Companion.constant$default(companion, 8L, null, 2, null), expression, Expression.Companion.constant$default(companion, 12L, null, 2, null), Expression.Companion.constant$default(companion, 12L, null, 2, null), null == true ? 1 : 0, Expression.Companion.constant$default(companion, 0L, null, 2, null), expression2, i10, iVar);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        f57471l = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        f57472m = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f57473n = companion2.from(cn.r.W(DivAlignmentHorizontal.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivTabsJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f57474o = companion2.from(cn.r.W(DivAlignmentVertical.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivTabsJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f57475p = companion2.from(divVisibility, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivTabsJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        f57476q = new ValueValidator() { // from class: ah.ga
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTabsJsonParser.g(((Double) obj).doubleValue());
            }
        };
        f57477r = new ValueValidator() { // from class: ah.ha
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTabsJsonParser.h(((Long) obj).longValue());
            }
        };
        f57478s = new ListValidator() { // from class: ah.ia
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivTabsJsonParser.i(list);
            }
        };
        f57479t = new ValueValidator() { // from class: ah.ja
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTabsJsonParser.j(((Long) obj).longValue());
            }
        };
        f57480u = new ValueValidator() { // from class: ah.ka
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTabsJsonParser.k(((Long) obj).longValue());
            }
        };
        f57481v = new ListValidator() { // from class: ah.la
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivTabsJsonParser.l(list);
            }
        };
    }

    public static final boolean g(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }

    public static final boolean h(long j10) {
        return j10 >= 0;
    }

    public static final boolean i(List list) {
        return list.size() >= 1;
    }

    public static final boolean j(long j10) {
        return j10 >= 0;
    }

    public static final boolean k(long j10) {
        return j10 >= 0;
    }

    public static final boolean l(List list) {
        return list.size() >= 1;
    }
}
