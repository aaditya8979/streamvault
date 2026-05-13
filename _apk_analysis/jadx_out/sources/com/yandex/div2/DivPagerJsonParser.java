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
import com.yandex.div2.DivPager;
import com.yandex.div2.DivPagerJsonParser;
import com.yandex.div2.DivSize;
import io.appmetrica.analytics.impl.A2;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPagerJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivPagerJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f56414a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f56415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivPager.ItemAlignment> f56416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f56417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivSize.d f56418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f56419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivFixedSize f56420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivPager.Orientation> f56421h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f56422i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivPager.ItemAlignment> f56423j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivVisibility> f56424k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivSize.c f56425l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f56426m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f56427n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivPager.ItemAlignment> f56428o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivPager.Orientation> f56429p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivPager.ItemAlignment> f56430q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivVisibility> f56431r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Double> f56432s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f56433t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f56434u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f56435v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f56436w;

    /* JADX INFO: compiled from: DivPagerJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivPagerJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56437a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56437a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivPager deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f56437a.H());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", DivPagerJsonParser.f56426m, DivAlignmentHorizontal.FROM_STRING);
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", DivPagerJsonParser.f56427n, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivPagerJsonParser.f56432s;
            Expression<Double> expression = DivPagerJsonParser.f56415b;
            Expression<Double> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f56437a.t1());
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f64965g, this.f56437a.F1());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f56437a.L1());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, lVar2, DivPagerJsonParser.f56433t);
            TypeHelper<DivPager.ItemAlignment> typeHelper3 = DivPagerJsonParser.f56428o;
            sn.l<String, DivPager.ItemAlignment> lVar3 = DivPager.ItemAlignment.FROM_STRING;
            Expression<DivPager.ItemAlignment> expression2 = DivPagerJsonParser.f56416c;
            Expression<DivPager.ItemAlignment> optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "cross_axis_alignment", typeHelper3, lVar3, expression2);
            Expression<DivPager.ItemAlignment> expression3 = optionalExpression5 == null ? expression2 : optionalExpression5;
            ValueValidator<Long> valueValidator2 = DivPagerJsonParser.f56434u;
            Expression<Long> expression4 = DivPagerJsonParser.f56417d;
            Expression<Long> optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "default_item", typeHelper2, lVar2, valueValidator2, expression4);
            if (optionalExpression6 != null) {
                expression4 = optionalExpression6;
            }
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f56437a.P2());
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f56437a.b3());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f56437a.z3());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f56437a.I3());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f56437a.Y6());
            if (divSize == null) {
                divSize = DivPagerJsonParser.f56418e;
            }
            DivSize divSize2 = divSize;
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression5 = DivPagerJsonParser.f56419f;
            Expression<Boolean> optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "infinite_scroll", typeHelper4, lVar4, expression5);
            if (optionalExpression7 != null) {
                expression5 = optionalExpression7;
            }
            DivCollectionItemBuilder divCollectionItemBuilder = (DivCollectionItemBuilder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_builder", this.f56437a.d2());
            DivFixedSize divFixedSize = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_spacing", this.f56437a.w3());
            if (divFixedSize == null) {
                divFixedSize = DivPagerJsonParser.f56420g;
            }
            DivFixedSize divFixedSize2 = divFixedSize;
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "items", this.f56437a.M4());
            DivPagerLayoutMode divPagerLayoutMode = (DivPagerLayoutMode) JsonPropertyParser.read(parsingContext, jSONObject, "layout_mode", this.f56437a.C5());
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f56437a.P4());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f56437a.Y2());
            TypeHelper<DivPager.Orientation> typeHelper5 = DivPagerJsonParser.f56429p;
            sn.l<String, DivPager.Orientation> lVar5 = DivPager.Orientation.FROM_STRING;
            Expression<DivPager.Orientation> expression6 = DivPagerJsonParser.f56421h;
            Expression<DivPager.Orientation> optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "orientation", typeHelper5, lVar5, expression6);
            if (optionalExpression8 != null) {
                expression6 = optionalExpression8;
            }
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f56437a.Y2());
            DivPageTransformation divPageTransformation = (DivPageTransformation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "page_transformation", this.f56437a.q5());
            Expression<Boolean> expression7 = DivPagerJsonParser.f56422i;
            Expression<Boolean> optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "restrict_parent_scroll", typeHelper4, lVar4, expression7);
            if (optionalExpression9 != null) {
                expression7 = optionalExpression9;
            }
            Expression optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, lVar2, DivPagerJsonParser.f56435v);
            TypeHelper<DivPager.ItemAlignment> typeHelper6 = DivPagerJsonParser.f56430q;
            Expression<DivPager.ItemAlignment> expression8 = DivPagerJsonParser.f56423j;
            Expression<DivPager.ItemAlignment> optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scroll_axis_alignment", typeHelper6, lVar3, expression8);
            Expression<DivPager.ItemAlignment> expression9 = optionalExpression12 == null ? expression8 : optionalExpression12;
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f56437a.u0());
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f56437a.P8());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f56437a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f56437a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f56437a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f56437a.z1());
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivPagerJsonParser.f56436w);
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f56437a.e9());
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f56437a.k9());
            TypeHelper<DivVisibility> typeHelper7 = DivPagerJsonParser.f56431r;
            sn.l<String, DivVisibility> lVar6 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression10 = DivPagerJsonParser.f56424k;
            Expression<DivVisibility> optionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper7, lVar6, expression10);
            Expression<DivVisibility> expression11 = optionalExpression13 == null ? expression10 : optionalExpression13;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f56437a.w9());
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f56437a.w9());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f56437a.Y6());
            if (divSize3 == null) {
                divSize3 = DivPagerJsonParser.f56425l;
            }
            return new DivPager(divAccessibility, optionalExpression, optionalExpression2, expression, optionalList, optionalList2, divBorder, optionalExpression4, expression3, expression4, optionalList3, optionalList4, divFocus, optionalList5, divSize2, str, expression5, divCollectionItemBuilder, divFixedSize2, optionalList6, divPagerLayoutMode, divLayoutProvider, divEdgeInsets, expression6, divEdgeInsets2, divPageTransformation, expression7, optionalExpression10, optionalExpression11, expression9, optionalList7, optionalList8, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, optionalList9, optionalList10, optionalList11, expression11, divVisibilityAction, optionalList12, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivPager divPager) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divPager.o(), this.f56437a.H());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divPager.g(), DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divPager.m(), DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divPager.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divPager.w(), this.f56437a.t1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, A2.f64965g, divPager.getBackground(), this.f56437a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, divPager.x(), this.f56437a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divPager.b());
            Expression<DivPager.ItemAlignment> expression = divPager.f56394i;
            sn.l<DivPager.ItemAlignment, String> lVar = DivPager.ItemAlignment.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "cross_axis_alignment", expression, lVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "default_item", divPager.f56395j);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divPager.k(), this.f56437a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divPager.getExtensions(), this.f56437a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divPager.n(), this.f56437a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divPager.u(), this.f56437a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divPager.getHeight(), this.f56437a.Y6());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divPager.getId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "infinite_scroll", divPager.f56402q);
            JsonPropertyParser.write(parsingContext, jSONObject, "item_builder", divPager.f56403r, this.f56437a.d2());
            JsonPropertyParser.write(parsingContext, jSONObject, "item_spacing", divPager.f56404s, this.f56437a.w3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "items", divPager.f56405t, this.f56437a.M4());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_mode", divPager.f56406u, this.f56437a.C5());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divPager.r(), this.f56437a.P4());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divPager.d(), this.f56437a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "orientation", divPager.f56409x, DivPager.Orientation.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divPager.p(), this.f56437a.Y2());
            JsonPropertyParser.write(parsingContext, jSONObject, "page_transformation", divPager.f56411z, this.f56437a.q5());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "restrict_parent_scroll", divPager.A);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divPager.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divPager.e());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scroll_axis_alignment", divPager.D, lVar);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divPager.q(), this.f56437a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divPager.h(), this.f56437a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divPager.getTransform(), this.f56437a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divPager.j(), this.f56437a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divPager.v(), this.f56437a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divPager.i(), this.f56437a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divPager.l(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "pager");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divPager.s(), this.f56437a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divPager.c(), this.f56437a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divPager.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divPager.t(), this.f56437a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divPager.a(), this.f56437a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divPager.getWidth(), this.f56437a.Y6());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivPagerJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56438a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56438a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivPagerTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivPagerTemplate divPagerTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f56455a : null, this.f56438a.I());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", DivPagerJsonParser.f56426m, allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f56456b : null, DivAlignmentHorizontal.FROM_STRING);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", DivPagerJsonParser.f56427n, allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f56457c : null, DivAlignmentVertical.FROM_STRING);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f56458d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivPagerJsonParser.f56432s);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f56459e : null, this.f56438a.u1());
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f64965g, allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f56460f : null, this.f56438a.G1());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f56461g : null, this.f56438a.M1());
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = divPagerTemplate != null ? divPagerTemplate.f56462h : null;
            sn.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, field, lVar, DivPagerJsonParser.f56433t);
            TypeHelper<DivPager.ItemAlignment> typeHelper2 = DivPagerJsonParser.f56428o;
            Field<Expression<DivPager.ItemAlignment>> field2 = divPagerTemplate != null ? divPagerTemplate.f56463i : null;
            sn.l<String, DivPager.ItemAlignment> lVar2 = DivPager.ItemAlignment.FROM_STRING;
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "cross_axis_alignment", typeHelper2, allowPropertyOverride, field2, lVar2);
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "default_item", typeHelper, allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f56464j : null, lVar, DivPagerJsonParser.f56434u);
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f56465k : null, this.f56438a.Q2());
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f56466l : null, this.f56438a.c3());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f56467m : null, this.f56438a.A3());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f56468n : null, this.f56438a.J3());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f56469o : null, this.f56438a.Z6());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f56470p : null);
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field3 = divPagerTemplate != null ? divPagerTemplate.f56471q : null;
            sn.l<Object, Boolean> lVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "infinite_scroll", typeHelper3, allowPropertyOverride, field3, lVar3);
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "item_builder", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f56472r : null, this.f56438a.e2());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "item_spacing", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f56473s : null, this.f56438a.x3());
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "items", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f56474t : null, this.f56438a.N4());
            Field field4 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "layout_mode", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f56475u : null, this.f56438a.D5());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f56476v : null, this.f56438a.Q4());
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f56477w : null, this.f56438a.Z2());
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "orientation", DivPagerJsonParser.f56429p, allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f56478x : null, DivPager.Orientation.FROM_STRING);
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f56479y : null, this.f56438a.Z2());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "page_transformation", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.f56480z : null, this.f56438a.r5());
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "restrict_parent_scroll", typeHelper3, allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.A : null, lVar3);
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.B : null);
            Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.C : null, lVar, DivPagerJsonParser.f56435v);
            Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "scroll_axis_alignment", DivPagerJsonParser.f56430q, allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.D : null, lVar2);
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.E : null, this.f56438a.v0());
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.F : null, this.f56438a.Q8());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.G : null, this.f56438a.c9());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.H : null, this.f56438a.V1());
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.I : null, this.f56438a.A1());
            Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.J : null, this.f56438a.A1());
            Field<List<DivTransitionTrigger>> field5 = divPagerTemplate != null ? divPagerTemplate.K : null;
            sn.l<String, DivTransitionTrigger> lVar4 = DivTransitionTrigger.FROM_STRING;
            ListValidator<DivTransitionTrigger> listValidator = DivPagerJsonParser.f56436w;
            tn.p.i(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivPagerTemplate(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField, optionalListField2, optionalField2, optionalFieldWithExpression4, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalListField3, optionalListField4, optionalField3, optionalListField5, optionalField4, optionalField5, optionalFieldWithExpression7, optionalField6, optionalField7, optionalListField6, field4, optionalField8, optionalField9, optionalFieldWithExpression8, optionalField10, optionalField11, optionalFieldWithExpression9, optionalFieldWithExpression10, optionalFieldWithExpression11, optionalFieldWithExpression12, optionalListField7, optionalListField8, optionalField12, optionalField13, optionalField14, optionalField15, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field5, lVar4, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.L : null, this.f56438a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.M : null, this.f56438a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", DivPagerJsonParser.f56431r, allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.N : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.O : null, this.f56438a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.P : null, this.f56438a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.Q : null, this.f56438a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivPagerTemplate divPagerTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divPagerTemplate.f56455a, this.f56438a.I());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", divPagerTemplate.f56456b, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", divPagerTemplate.f56457c, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divPagerTemplate.f56458d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divPagerTemplate.f56459e, this.f56438a.u1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, A2.f64965g, divPagerTemplate.f56460f, this.f56438a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, divPagerTemplate.f56461g, this.f56438a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divPagerTemplate.f56462h);
            Field<Expression<DivPager.ItemAlignment>> field = divPagerTemplate.f56463i;
            sn.l<DivPager.ItemAlignment, String> lVar = DivPager.ItemAlignment.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "cross_axis_alignment", field, lVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "default_item", divPagerTemplate.f56464j);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divPagerTemplate.f56465k, this.f56438a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divPagerTemplate.f56466l, this.f56438a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divPagerTemplate.f56467m, this.f56438a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divPagerTemplate.f56468n, this.f56438a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divPagerTemplate.f56469o, this.f56438a.Z6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divPagerTemplate.f56470p);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "infinite_scroll", divPagerTemplate.f56471q);
            JsonFieldParser.writeField(parsingContext, jSONObject, "item_builder", divPagerTemplate.f56472r, this.f56438a.e2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "item_spacing", divPagerTemplate.f56473s, this.f56438a.x3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "items", divPagerTemplate.f56474t, this.f56438a.N4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_mode", divPagerTemplate.f56475u, this.f56438a.D5());
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divPagerTemplate.f56476v, this.f56438a.Q4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divPagerTemplate.f56477w, this.f56438a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "orientation", divPagerTemplate.f56478x, DivPager.Orientation.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divPagerTemplate.f56479y, this.f56438a.Z2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "page_transformation", divPagerTemplate.f56480z, this.f56438a.r5());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "restrict_parent_scroll", divPagerTemplate.A);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divPagerTemplate.B);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divPagerTemplate.C);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scroll_axis_alignment", divPagerTemplate.D, lVar);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divPagerTemplate.E, this.f56438a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divPagerTemplate.F, this.f56438a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divPagerTemplate.G, this.f56438a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divPagerTemplate.H, this.f56438a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divPagerTemplate.I, this.f56438a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divPagerTemplate.J, this.f56438a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divPagerTemplate.K, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "pager");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divPagerTemplate.L, this.f56438a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divPagerTemplate.M, this.f56438a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", divPagerTemplate.N, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divPagerTemplate.O, this.f56438a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divPagerTemplate.P, this.f56438a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divPagerTemplate.Q, this.f56438a.Z6());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivPagerJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivPagerTemplate, DivPager> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f56439a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f56439a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivPager resolve(@NotNull ParsingContext parsingContext, @NotNull DivPagerTemplate divPagerTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.f56455a, jSONObject, "accessibility", this.f56439a.J(), this.f56439a.H());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divPagerTemplate.f56456b, jSONObject, "alignment_horizontal", DivPagerJsonParser.f56426m, DivAlignmentHorizontal.FROM_STRING);
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divPagerTemplate.f56457c, jSONObject, "alignment_vertical", DivPagerJsonParser.f56427n, DivAlignmentVertical.FROM_STRING);
            Field<Expression<Double>> field = divPagerTemplate.f56458d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivPagerJsonParser.f56432s;
            Expression<Double> expression = DivPagerJsonParser.f56415b;
            Expression<Double> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression3 != null) {
                expression = expressionResolveOptionalExpression3;
            }
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.f56459e, jSONObject, "animators", this.f56439a.v1(), this.f56439a.t1());
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.f56460f, jSONObject, A2.f64965g, this.f56439a.H1(), this.f56439a.F1());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.f56461g, jSONObject, OutlinedTextFieldKt.BorderId, this.f56439a.N1(), this.f56439a.L1());
            Field<Expression<Long>> field2 = divPagerTemplate.f56462h;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "column_span", typeHelper2, lVar2, DivPagerJsonParser.f56433t);
            Field<Expression<DivPager.ItemAlignment>> field3 = divPagerTemplate.f56463i;
            TypeHelper<DivPager.ItemAlignment> typeHelper3 = DivPagerJsonParser.f56428o;
            sn.l<String, DivPager.ItemAlignment> lVar3 = DivPager.ItemAlignment.FROM_STRING;
            Expression<DivPager.ItemAlignment> expression2 = DivPagerJsonParser.f56416c;
            Expression<DivPager.ItemAlignment> expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "cross_axis_alignment", typeHelper3, lVar3, expression2);
            Expression<DivPager.ItemAlignment> expression3 = expressionResolveOptionalExpression5 == null ? expression2 : expressionResolveOptionalExpression5;
            Field<Expression<Long>> field4 = divPagerTemplate.f56464j;
            ValueValidator<Long> valueValidator2 = DivPagerJsonParser.f56434u;
            Expression<Long> expression4 = DivPagerJsonParser.f56417d;
            Expression<Long> expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "default_item", typeHelper2, lVar2, valueValidator2, expression4);
            if (expressionResolveOptionalExpression6 != null) {
                expression4 = expressionResolveOptionalExpression6;
            }
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.f56465k, jSONObject, "disappear_actions", this.f56439a.R2(), this.f56439a.P2());
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.f56466l, jSONObject, "extensions", this.f56439a.d3(), this.f56439a.b3());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.f56467m, jSONObject, "focus", this.f56439a.B3(), this.f56439a.z3());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.f56468n, jSONObject, "functions", this.f56439a.K3(), this.f56439a.I3());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.f56469o, jSONObject, "height", this.f56439a.a7(), this.f56439a.Y6());
            if (divSize == null) {
                divSize = DivPagerJsonParser.f56418e;
            }
            DivSize divSize2 = divSize;
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.f56470p, jSONObject, "id");
            Field<Expression<Boolean>> field5 = divPagerTemplate.f56471q;
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression5 = DivPagerJsonParser.f56419f;
            Expression<Boolean> expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "infinite_scroll", typeHelper4, lVar4, expression5);
            if (expressionResolveOptionalExpression7 != null) {
                expression5 = expressionResolveOptionalExpression7;
            }
            DivCollectionItemBuilder divCollectionItemBuilder = (DivCollectionItemBuilder) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.f56472r, jSONObject, "item_builder", this.f56439a.f2(), this.f56439a.d2());
            DivFixedSize divFixedSize = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.f56473s, jSONObject, "item_spacing", this.f56439a.y3(), this.f56439a.w3());
            if (divFixedSize == null) {
                divFixedSize = DivPagerJsonParser.f56420g;
            }
            DivFixedSize divFixedSize2 = divFixedSize;
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.f56474t, jSONObject, "items", this.f56439a.O4(), this.f56439a.M4());
            DivPagerLayoutMode divPagerLayoutMode = (DivPagerLayoutMode) JsonFieldResolver.resolve(parsingContext, divPagerTemplate.f56475u, jSONObject, "layout_mode", this.f56439a.E5(), this.f56439a.C5());
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.f56476v, jSONObject, "layout_provider", this.f56439a.R4(), this.f56439a.P4());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.f56477w, jSONObject, "margins", this.f56439a.a3(), this.f56439a.Y2());
            Field<Expression<DivPager.Orientation>> field6 = divPagerTemplate.f56478x;
            TypeHelper<DivPager.Orientation> typeHelper5 = DivPagerJsonParser.f56429p;
            sn.l<String, DivPager.Orientation> lVar5 = DivPager.Orientation.FROM_STRING;
            Expression<DivPager.Orientation> expression6 = DivPagerJsonParser.f56421h;
            Expression<DivPager.Orientation> expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "orientation", typeHelper5, lVar5, expression6);
            if (expressionResolveOptionalExpression8 != null) {
                expression6 = expressionResolveOptionalExpression8;
            }
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.f56479y, jSONObject, "paddings", this.f56439a.a3(), this.f56439a.Y2());
            DivPageTransformation divPageTransformation = (DivPageTransformation) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.f56480z, jSONObject, "page_transformation", this.f56439a.s5(), this.f56439a.q5());
            Field<Expression<Boolean>> field7 = divPagerTemplate.A;
            Expression<Boolean> expression7 = DivPagerJsonParser.f56422i;
            Expression<Boolean> expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "restrict_parent_scroll", typeHelper4, lVar4, expression7);
            if (expressionResolveOptionalExpression9 != null) {
                expression7 = expressionResolveOptionalExpression9;
            }
            Expression expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divPagerTemplate.B, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divPagerTemplate.C, jSONObject, "row_span", typeHelper2, lVar2, DivPagerJsonParser.f56435v);
            Field<Expression<DivPager.ItemAlignment>> field8 = divPagerTemplate.D;
            TypeHelper<DivPager.ItemAlignment> typeHelper6 = DivPagerJsonParser.f56430q;
            Expression<DivPager.ItemAlignment> expression8 = DivPagerJsonParser.f56423j;
            Expression<DivPager.ItemAlignment> expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "scroll_axis_alignment", typeHelper6, lVar3, expression8);
            Expression<DivPager.ItemAlignment> expression9 = expressionResolveOptionalExpression12 == null ? expression8 : expressionResolveOptionalExpression12;
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.E, jSONObject, "selected_actions", this.f56439a.w0(), this.f56439a.u0());
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.F, jSONObject, "tooltips", this.f56439a.R8(), this.f56439a.P8());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.G, jSONObject, "transform", this.f56439a.d9(), this.f56439a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.H, jSONObject, "transition_change", this.f56439a.W1(), this.f56439a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.I, jSONObject, "transition_in", this.f56439a.B1(), this.f56439a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.J, jSONObject, "transition_out", this.f56439a.B1(), this.f56439a.z1());
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.K, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivPagerJsonParser.f56436w);
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.L, jSONObject, "variable_triggers", this.f56439a.g9(), this.f56439a.e9());
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.M, jSONObject, "variables", this.f56439a.m9(), this.f56439a.k9());
            Field<Expression<DivVisibility>> field9 = divPagerTemplate.N;
            TypeHelper<DivVisibility> typeHelper7 = DivPagerJsonParser.f56431r;
            sn.l<String, DivVisibility> lVar6 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression10 = DivPagerJsonParser.f56424k;
            Expression<DivVisibility> expressionResolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "visibility", typeHelper7, lVar6, expression10);
            Expression<DivVisibility> expression11 = expressionResolveOptionalExpression13 == null ? expression10 : expressionResolveOptionalExpression13;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.O, jSONObject, "visibility_action", this.f56439a.y9(), this.f56439a.w9());
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.P, jSONObject, "visibility_actions", this.f56439a.y9(), this.f56439a.w9());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.Q, jSONObject, "width", this.f56439a.a7(), this.f56439a.Y6());
            if (divSize3 == null) {
                divSize3 = DivPagerJsonParser.f56425l;
            }
            return new DivPager(divAccessibility, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression, listResolveOptionalList, listResolveOptionalList2, divBorder, expressionResolveOptionalExpression4, expression3, expression4, listResolveOptionalList3, listResolveOptionalList4, divFocus, listResolveOptionalList5, divSize2, str, expression5, divCollectionItemBuilder, divFixedSize2, listResolveOptionalList6, divPagerLayoutMode, divLayoutProvider, divEdgeInsets, expression6, divEdgeInsets2, divPageTransformation, expression7, expressionResolveOptionalExpression10, expressionResolveOptionalExpression11, expression9, listResolveOptionalList7, listResolveOptionalList8, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, listResolveOptionalList9, listResolveOptionalList10, listResolveOptionalList11, expression11, divVisibilityAction, listResolveOptionalList12, divSize3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        f56415b = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        DivPager.ItemAlignment itemAlignment = DivPager.ItemAlignment.START;
        f56416c = Expression.Companion.constant$default(companion, itemAlignment, null, 2, null);
        f56417d = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        DivSizeUnitValue divSizeUnitValue = null;
        DivSizeUnitValue divSizeUnitValue2 = null;
        f56418e = new DivSize.d(new DivWrapContentSize(null, divSizeUnitValue, divSizeUnitValue2, 7, null));
        Boolean bool = Boolean.FALSE;
        f56419f = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f56420g = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 0L, null, 2, null), 1, null == true ? 1 : 0);
        DivPager.Orientation orientation = DivPager.Orientation.HORIZONTAL;
        f56421h = Expression.Companion.constant$default(companion, orientation, null, 2, null);
        f56422i = Expression.Companion.constant$default(companion, bool, null, 2, null);
        DivPager.ItemAlignment itemAlignment2 = DivPager.ItemAlignment.CENTER;
        f56423j = Expression.Companion.constant$default(companion, itemAlignment2, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        f56424k = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        f56425l = new DivSize.c(new DivMatchParentSize(divSizeUnitValue, divSizeUnitValue2, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f56426m = companion2.from(cn.r.W(DivAlignmentHorizontal.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivPagerJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f56427n = companion2.from(cn.r.W(DivAlignmentVertical.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivPagerJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f56428o = companion2.from(itemAlignment, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivPagerJsonParser$Companion$TYPE_HELPER_CROSS_AXIS_ALIGNMENT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivPager.ItemAlignment);
            }
        });
        f56429p = companion2.from(orientation, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivPagerJsonParser$Companion$TYPE_HELPER_ORIENTATION$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivPager.Orientation);
            }
        });
        f56430q = companion2.from(itemAlignment2, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivPagerJsonParser$Companion$TYPE_HELPER_SCROLL_AXIS_ALIGNMENT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivPager.ItemAlignment);
            }
        });
        f56431r = companion2.from(divVisibility, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivPagerJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        f56432s = new ValueValidator() { // from class: ah.k7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivPagerJsonParser.f(((Double) obj).doubleValue());
            }
        };
        f56433t = new ValueValidator() { // from class: ah.l7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivPagerJsonParser.g(((Long) obj).longValue());
            }
        };
        f56434u = new ValueValidator() { // from class: ah.m7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivPagerJsonParser.h(((Long) obj).longValue());
            }
        };
        f56435v = new ValueValidator() { // from class: ah.n7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivPagerJsonParser.i(((Long) obj).longValue());
            }
        };
        f56436w = new ListValidator() { // from class: ah.o7
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivPagerJsonParser.j(list);
            }
        };
    }

    public static final boolean f(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
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

    public static final boolean j(List list) {
        return list.size() >= 1;
    }
}
