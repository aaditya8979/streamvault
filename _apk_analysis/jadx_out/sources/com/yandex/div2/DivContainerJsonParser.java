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
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivContainerJsonParser;
import com.yandex.div2.DivSize;
import io.appmetrica.analytics.impl.A2;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivContainerJsonParser.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivContainerJsonParser {

    @Deprecated
    @NotNull
    public static final ListValidator<DivTransitionTrigger> A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f54895a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivAnimation f54896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f54897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f54898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f54899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivContentAlignmentHorizontal> f54900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivContentAlignmentVertical> f54901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivSize.d f54902h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f54903i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivContainer.LayoutMode> f54904j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Long> f54905k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivContainer.Orientation> f54906l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivVisibility> f54907m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivSize.c f54908n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f54909o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f54910p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivContentAlignmentHorizontal> f54911q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivContentAlignmentVertical> f54912r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivContainer.LayoutMode> f54913s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivContainer.Orientation> f54914t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivVisibility> f54915u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Double> f54916v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f54917w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f54918x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f54919y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f54920z;

    /* JADX INFO: compiled from: DivContainerJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivContainerJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f54921a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f54921a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivContainer deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f54921a.H());
            DivAction divAction = (DivAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action", this.f54921a.u0());
            DivAnimation divAnimation = (DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action_animation", this.f54921a.q1());
            if (divAnimation == null) {
                divAnimation = DivContainerJsonParser.f54896b;
            }
            DivAnimation divAnimation2 = divAnimation;
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.f54921a.u0());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", DivContainerJsonParser.f54909o, DivAlignmentHorizontal.FROM_STRING);
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", DivContainerJsonParser.f54910p, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivContainerJsonParser.f54916v;
            Expression<Double> expression = DivContainerJsonParser.f54897c;
            Expression<Double> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f54921a.t1());
            DivAspect divAspect = (DivAspect) JsonPropertyParser.readOptional(parsingContext, jSONObject, "aspect", this.f54921a.C1());
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f64965g, this.f54921a.F1());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f54921a.L1());
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar2 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = DivContainerJsonParser.f54898d;
            Expression<Boolean> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper2, lVar2, expression2);
            if (optionalExpression4 != null) {
                expression2 = optionalExpression4;
            }
            Expression<Boolean> expression3 = DivContainerJsonParser.f54899e;
            Expression<Boolean> optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "clip_to_bounds", typeHelper2, lVar2, expression3);
            if (optionalExpression5 != null) {
                expression3 = optionalExpression5;
            }
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar3 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper3, lVar3, DivContainerJsonParser.f54917w);
            TypeHelper<DivContentAlignmentHorizontal> typeHelper4 = DivContainerJsonParser.f54911q;
            sn.l<String, DivContentAlignmentHorizontal> lVar4 = DivContentAlignmentHorizontal.FROM_STRING;
            Expression<DivContentAlignmentHorizontal> expression4 = DivContainerJsonParser.f54900f;
            Expression<DivContentAlignmentHorizontal> optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_horizontal", typeHelper4, lVar4, expression4);
            Expression<DivContentAlignmentHorizontal> expression5 = optionalExpression7 == null ? expression4 : optionalExpression7;
            TypeHelper<DivContentAlignmentVertical> typeHelper5 = DivContainerJsonParser.f54912r;
            sn.l<String, DivContentAlignmentVertical> lVar5 = DivContentAlignmentVertical.FROM_STRING;
            Expression<DivContentAlignmentVertical> expression6 = DivContainerJsonParser.f54901g;
            Expression<DivContentAlignmentVertical> optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_vertical", typeHelper5, lVar5, expression6);
            Expression<DivContentAlignmentVertical> expression7 = optionalExpression8 == null ? expression6 : optionalExpression8;
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f54921a.P2());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", this.f54921a.u0());
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f54921a.b3());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f54921a.z3());
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f54921a.I3());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f54921a.Y6());
            if (divSize == null) {
                divSize = DivContainerJsonParser.f54902h;
            }
            DivSize divSize2 = divSize;
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", this.f54921a.u0());
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", this.f54921a.u0());
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            DivCollectionItemBuilder divCollectionItemBuilder = (DivCollectionItemBuilder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_builder", this.f54921a.d2());
            ValueValidator<Long> valueValidator2 = DivContainerJsonParser.f54918x;
            Expression<Long> expression8 = DivContainerJsonParser.f54903i;
            Expression<Long> optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "item_spacing", typeHelper3, lVar3, valueValidator2, expression8);
            if (optionalExpression9 != null) {
                expression8 = optionalExpression9;
            }
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "items", this.f54921a.M4());
            TypeHelper<DivContainer.LayoutMode> typeHelper6 = DivContainerJsonParser.f54913s;
            sn.l<String, DivContainer.LayoutMode> lVar6 = DivContainer.LayoutMode.FROM_STRING;
            Expression<DivContainer.LayoutMode> expression9 = DivContainerJsonParser.f54904j;
            Expression<DivContainer.LayoutMode> optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "layout_mode", typeHelper6, lVar6, expression9);
            Expression<DivContainer.LayoutMode> expression10 = optionalExpression10 == null ? expression9 : optionalExpression10;
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f54921a.P4());
            DivContainer.Separator separator = (DivContainer.Separator) JsonPropertyParser.readOptional(parsingContext, jSONObject, "line_separator", this.f54921a.p2());
            ValueValidator<Long> valueValidator3 = DivContainerJsonParser.f54919y;
            Expression<Long> expression11 = DivContainerJsonParser.f54905k;
            Expression<Long> optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "line_spacing", typeHelper3, lVar3, valueValidator3, expression11);
            if (optionalExpression11 != null) {
                expression11 = optionalExpression11;
            }
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", this.f54921a.u0());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f54921a.Y2());
            TypeHelper<DivContainer.Orientation> typeHelper7 = DivContainerJsonParser.f54914t;
            sn.l<String, DivContainer.Orientation> lVar7 = DivContainer.Orientation.FROM_STRING;
            Expression<DivContainer.Orientation> expression12 = DivContainerJsonParser.f54906l;
            Expression<DivContainer.Orientation> optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "orientation", typeHelper7, lVar7, expression12);
            Expression<DivContainer.Orientation> expression13 = optionalExpression12 == null ? expression12 : optionalExpression12;
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f54921a.Y2());
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", this.f54921a.u0());
            List optionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", this.f54921a.u0());
            Expression optionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression optionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper3, lVar3, DivContainerJsonParser.f54920z);
            List optionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f54921a.u0());
            DivContainer.Separator separator2 = (DivContainer.Separator) JsonPropertyParser.readOptional(parsingContext, jSONObject, "separator", this.f54921a.p2());
            List optionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f54921a.P8());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f54921a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f54921a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f54921a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f54921a.z1());
            List optionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivContainerJsonParser.A);
            List optionalList17 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f54921a.e9());
            List optionalList18 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f54921a.k9());
            TypeHelper<DivVisibility> typeHelper8 = DivContainerJsonParser.f54915u;
            sn.l<String, DivVisibility> lVar8 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression14 = DivContainerJsonParser.f54907m;
            Expression<DivVisibility> optionalExpression15 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper8, lVar8, expression14);
            Expression<DivVisibility> expression15 = optionalExpression15 == null ? expression14 : optionalExpression15;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f54921a.w9());
            List optionalList19 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f54921a.w9());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f54921a.Y6());
            if (divSize3 == null) {
                divSize3 = DivContainerJsonParser.f54908n;
            }
            return new DivContainer(divAccessibility, divAction, divAnimation2, optionalList, optionalExpression, optionalExpression2, expression, optionalList2, divAspect, optionalList3, divBorder, expression2, expression3, optionalExpression6, expression5, expression7, optionalList4, optionalList5, optionalList6, divFocus, optionalList7, divSize2, optionalList8, optionalList9, str, divCollectionItemBuilder, expression8, optionalList10, expression10, divLayoutProvider, separator, expression11, optionalList11, divEdgeInsets, expression13, divEdgeInsets2, optionalList12, optionalList13, optionalExpression13, optionalExpression14, optionalList14, separator2, optionalList15, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, optionalList16, optionalList17, optionalList18, expression15, divVisibilityAction, optionalList19, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivContainer divContainer) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divContainer.o(), this.f54921a.H());
            JsonPropertyParser.write(parsingContext, jSONObject, "action", divContainer.f54854b, this.f54921a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "action_animation", divContainer.f54856c, this.f54921a.q1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", divContainer.f54858d, this.f54921a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divContainer.g(), DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divContainer.m(), DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divContainer.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divContainer.w(), this.f54921a.t1());
            JsonPropertyParser.write(parsingContext, jSONObject, "aspect", divContainer.f54864i, this.f54921a.C1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, A2.f64965g, divContainer.getBackground(), this.f54921a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, divContainer.x(), this.f54921a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "capture_focus_on_action", divContainer.f54867l);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "clip_to_bounds", divContainer.f54868m);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divContainer.b());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_horizontal", divContainer.f54870o, DivContentAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_vertical", divContainer.f54871p, DivContentAlignmentVertical.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divContainer.k(), this.f54921a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "doubletap_actions", divContainer.f54873r, this.f54921a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divContainer.getExtensions(), this.f54921a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divContainer.n(), this.f54921a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divContainer.u(), this.f54921a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divContainer.getHeight(), this.f54921a.Y6());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_end_actions", divContainer.f54878w, this.f54921a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_start_actions", divContainer.f54879x, this.f54921a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divContainer.getId());
            JsonPropertyParser.write(parsingContext, jSONObject, "item_builder", divContainer.f54881z, this.f54921a.d2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "item_spacing", divContainer.A);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "items", divContainer.B, this.f54921a.M4());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "layout_mode", divContainer.C, DivContainer.LayoutMode.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divContainer.r(), this.f54921a.P4());
            JsonPropertyParser.write(parsingContext, jSONObject, "line_separator", divContainer.E, this.f54921a.p2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "line_spacing", divContainer.F);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "longtap_actions", divContainer.G, this.f54921a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divContainer.d(), this.f54921a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "orientation", divContainer.I, DivContainer.Orientation.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divContainer.p(), this.f54921a.Y2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_end_actions", divContainer.K, this.f54921a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_start_actions", divContainer.L, this.f54921a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divContainer.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divContainer.e());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divContainer.q(), this.f54921a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "separator", divContainer.P, this.f54921a.p2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divContainer.h(), this.f54921a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divContainer.getTransform(), this.f54921a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divContainer.j(), this.f54921a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divContainer.v(), this.f54921a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divContainer.i(), this.f54921a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divContainer.l(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "container");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divContainer.s(), this.f54921a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divContainer.c(), this.f54921a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divContainer.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divContainer.t(), this.f54921a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divContainer.a(), this.f54921a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divContainer.getWidth(), this.f54921a.Y6());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivContainerJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f54922a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f54922a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivContainerTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivContainerTemplate divContainerTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.f54939a : null, this.f54922a.I());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.f54941b : null, this.f54922a.v0());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action_animation", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.f54943c : null, this.f54922a.r1());
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.f54944d : null, this.f54922a.v0());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", DivContainerJsonParser.f54909o, allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.f54945e : null, DivAlignmentHorizontal.FROM_STRING);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", DivContainerJsonParser.f54910p, allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.f54946f : null, DivAlignmentVertical.FROM_STRING);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.f54947g : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivContainerJsonParser.f54916v);
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.f54948h : null, this.f54922a.u1());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "aspect", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.f54949i : null, this.f54922a.D1());
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f64965g, allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.f54950j : null, this.f54922a.G1());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.f54951k : null, this.f54922a.M1());
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field = divContainerTemplate != null ? divContainerTemplate.f54952l : null;
            sn.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "capture_focus_on_action", typeHelper, allowPropertyOverride, field, lVar);
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "clip_to_bounds", typeHelper, allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.f54953m : null, lVar);
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field2 = divContainerTemplate != null ? divContainerTemplate.f54954n : null;
            sn.l<Number, Long> lVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper2, allowPropertyOverride, field2, lVar2, DivContainerJsonParser.f54917w);
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "content_alignment_horizontal", DivContainerJsonParser.f54911q, allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.f54955o : null, DivContentAlignmentHorizontal.FROM_STRING);
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "content_alignment_vertical", DivContainerJsonParser.f54912r, allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.f54956p : null, DivContentAlignmentVertical.FROM_STRING);
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.f54957q : null, this.f54922a.Q2());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "doubletap_actions", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.f54958r : null, this.f54922a.v0());
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.f54959s : null, this.f54922a.c3());
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.f54960t : null, this.f54922a.A3());
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.f54961u : null, this.f54922a.J3());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.f54962v : null, this.f54922a.Z6());
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_end_actions", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.f54963w : null, this.f54922a.v0());
            Field optionalListField9 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_start_actions", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.f54964x : null, this.f54922a.v0());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.f54965y : null);
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "item_builder", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.f54966z : null, this.f54922a.e2());
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "item_spacing", typeHelper2, allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.A : null, lVar2, DivContainerJsonParser.f54918x);
            Field optionalListField10 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "items", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.B : null, this.f54922a.N4());
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "layout_mode", DivContainerJsonParser.f54913s, allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.C : null, DivContainer.LayoutMode.FROM_STRING);
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.D : null, this.f54922a.Q4());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "line_separator", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.E : null, this.f54922a.q2());
            Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "line_spacing", typeHelper2, allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.F : null, lVar2, DivContainerJsonParser.f54919y);
            Field optionalListField11 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "longtap_actions", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.G : null, this.f54922a.v0());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.H : null, this.f54922a.Z2());
            Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "orientation", DivContainerJsonParser.f54914t, allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.I : null, DivContainer.Orientation.FROM_STRING);
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.J : null, this.f54922a.Z2());
            Field optionalListField12 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_end_actions", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.K : null, this.f54922a.v0());
            Field optionalListField13 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_start_actions", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.L : null, this.f54922a.v0());
            Field optionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.M : null);
            Field optionalFieldWithExpression14 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper2, allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.N : null, lVar2, DivContainerJsonParser.f54920z);
            Field optionalListField14 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.O : null, this.f54922a.v0());
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "separator", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.P : null, this.f54922a.q2());
            Field optionalListField15 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.Q : null, this.f54922a.Q8());
            Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.R : null, this.f54922a.c9());
            Field optionalField16 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.S : null, this.f54922a.V1());
            Field optionalField17 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.T : null, this.f54922a.A1());
            Field optionalField18 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.U : null, this.f54922a.A1());
            Field<List<DivTransitionTrigger>> field3 = divContainerTemplate != null ? divContainerTemplate.V : null;
            sn.l<String, DivTransitionTrigger> lVar3 = DivTransitionTrigger.FROM_STRING;
            ListValidator<DivTransitionTrigger> listValidator = DivContainerJsonParser.A;
            tn.p.i(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivContainerTemplate(optionalField, optionalField2, optionalField3, optionalListField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField2, optionalField4, optionalListField3, optionalField5, optionalFieldWithExpression4, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalFieldWithExpression7, optionalFieldWithExpression8, optionalListField4, optionalListField5, optionalListField6, optionalField6, optionalListField7, optionalField7, optionalListField8, optionalListField9, optionalField8, optionalField9, optionalFieldWithExpression9, optionalListField10, optionalFieldWithExpression10, optionalField10, optionalField11, optionalFieldWithExpression11, optionalListField11, optionalField12, optionalFieldWithExpression12, optionalField13, optionalListField12, optionalListField13, optionalFieldWithExpression13, optionalFieldWithExpression14, optionalListField14, optionalField14, optionalListField15, optionalField15, optionalField16, optionalField17, optionalField18, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field3, lVar3, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.W : null, this.f54922a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.X : null, this.f54922a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", DivContainerJsonParser.f54915u, allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.Y : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.Z : null, this.f54922a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.f54940a0 : null, this.f54922a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.f54942b0 : null, this.f54922a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivContainerTemplate divContainerTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divContainerTemplate.f54939a, this.f54922a.I());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action", divContainerTemplate.f54941b, this.f54922a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action_animation", divContainerTemplate.f54943c, this.f54922a.r1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", divContainerTemplate.f54944d, this.f54922a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", divContainerTemplate.f54945e, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", divContainerTemplate.f54946f, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divContainerTemplate.f54947g);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divContainerTemplate.f54948h, this.f54922a.u1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "aspect", divContainerTemplate.f54949i, this.f54922a.D1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, A2.f64965g, divContainerTemplate.f54950j, this.f54922a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, divContainerTemplate.f54951k, this.f54922a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "capture_focus_on_action", divContainerTemplate.f54952l);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "clip_to_bounds", divContainerTemplate.f54953m);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divContainerTemplate.f54954n);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_horizontal", divContainerTemplate.f54955o, DivContentAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_vertical", divContainerTemplate.f54956p, DivContentAlignmentVertical.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divContainerTemplate.f54957q, this.f54922a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "doubletap_actions", divContainerTemplate.f54958r, this.f54922a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divContainerTemplate.f54959s, this.f54922a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divContainerTemplate.f54960t, this.f54922a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divContainerTemplate.f54961u, this.f54922a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divContainerTemplate.f54962v, this.f54922a.Z6());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_end_actions", divContainerTemplate.f54963w, this.f54922a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_start_actions", divContainerTemplate.f54964x, this.f54922a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divContainerTemplate.f54965y);
            JsonFieldParser.writeField(parsingContext, jSONObject, "item_builder", divContainerTemplate.f54966z, this.f54922a.e2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "item_spacing", divContainerTemplate.A);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "items", divContainerTemplate.B, this.f54922a.N4());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "layout_mode", divContainerTemplate.C, DivContainer.LayoutMode.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divContainerTemplate.D, this.f54922a.Q4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "line_separator", divContainerTemplate.E, this.f54922a.q2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "line_spacing", divContainerTemplate.F);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "longtap_actions", divContainerTemplate.G, this.f54922a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divContainerTemplate.H, this.f54922a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "orientation", divContainerTemplate.I, DivContainer.Orientation.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divContainerTemplate.J, this.f54922a.Z2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_end_actions", divContainerTemplate.K, this.f54922a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_start_actions", divContainerTemplate.L, this.f54922a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divContainerTemplate.M);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divContainerTemplate.N);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divContainerTemplate.O, this.f54922a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "separator", divContainerTemplate.P, this.f54922a.q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divContainerTemplate.Q, this.f54922a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divContainerTemplate.R, this.f54922a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divContainerTemplate.S, this.f54922a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divContainerTemplate.T, this.f54922a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divContainerTemplate.U, this.f54922a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divContainerTemplate.V, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "container");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divContainerTemplate.W, this.f54922a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divContainerTemplate.X, this.f54922a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", divContainerTemplate.Y, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divContainerTemplate.Z, this.f54922a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divContainerTemplate.f54940a0, this.f54922a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divContainerTemplate.f54942b0, this.f54922a.Z6());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivContainerJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivContainerTemplate, DivContainer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f54923a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f54923a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivContainer resolve(@NotNull ParsingContext parsingContext, @NotNull DivContainerTemplate divContainerTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.f54939a, jSONObject, "accessibility", this.f54923a.J(), this.f54923a.H());
            DivAction divAction = (DivAction) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.f54941b, jSONObject, "action", this.f54923a.w0(), this.f54923a.u0());
            DivAnimation divAnimation = (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.f54943c, jSONObject, "action_animation", this.f54923a.s1(), this.f54923a.q1());
            if (divAnimation == null) {
                divAnimation = DivContainerJsonParser.f54896b;
            }
            DivAnimation divAnimation2 = divAnimation;
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.f54944d, jSONObject, "actions", this.f54923a.w0(), this.f54923a.u0());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divContainerTemplate.f54945e, jSONObject, "alignment_horizontal", DivContainerJsonParser.f54909o, DivAlignmentHorizontal.FROM_STRING);
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divContainerTemplate.f54946f, jSONObject, "alignment_vertical", DivContainerJsonParser.f54910p, DivAlignmentVertical.FROM_STRING);
            Field<Expression<Double>> field = divContainerTemplate.f54947g;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivContainerJsonParser.f54916v;
            Expression<Double> expression = DivContainerJsonParser.f54897c;
            Expression<Double> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, lVar, valueValidator, expression);
            if (expressionResolveOptionalExpression3 != null) {
                expression = expressionResolveOptionalExpression3;
            }
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.f54948h, jSONObject, "animators", this.f54923a.v1(), this.f54923a.t1());
            DivAspect divAspect = (DivAspect) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.f54949i, jSONObject, "aspect", this.f54923a.E1(), this.f54923a.C1());
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.f54950j, jSONObject, A2.f64965g, this.f54923a.H1(), this.f54923a.F1());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.f54951k, jSONObject, OutlinedTextFieldKt.BorderId, this.f54923a.N1(), this.f54923a.L1());
            Field<Expression<Boolean>> field2 = divContainerTemplate.f54952l;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar2 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = DivContainerJsonParser.f54898d;
            Expression<Boolean> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "capture_focus_on_action", typeHelper2, lVar2, expression2);
            if (expressionResolveOptionalExpression4 != null) {
                expression2 = expressionResolveOptionalExpression4;
            }
            Field<Expression<Boolean>> field3 = divContainerTemplate.f54953m;
            Expression<Boolean> expression3 = DivContainerJsonParser.f54899e;
            Expression<Boolean> expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "clip_to_bounds", typeHelper2, lVar2, expression3);
            if (expressionResolveOptionalExpression5 != null) {
                expression3 = expressionResolveOptionalExpression5;
            }
            Field<Expression<Long>> field4 = divContainerTemplate.f54954n;
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar3 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "column_span", typeHelper3, lVar3, DivContainerJsonParser.f54917w);
            Field<Expression<DivContentAlignmentHorizontal>> field5 = divContainerTemplate.f54955o;
            TypeHelper<DivContentAlignmentHorizontal> typeHelper4 = DivContainerJsonParser.f54911q;
            sn.l<String, DivContentAlignmentHorizontal> lVar4 = DivContentAlignmentHorizontal.FROM_STRING;
            Expression<DivContentAlignmentHorizontal> expression4 = DivContainerJsonParser.f54900f;
            Expression<DivContentAlignmentHorizontal> expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "content_alignment_horizontal", typeHelper4, lVar4, expression4);
            Expression<DivContentAlignmentHorizontal> expression5 = expressionResolveOptionalExpression7 == null ? expression4 : expressionResolveOptionalExpression7;
            Field<Expression<DivContentAlignmentVertical>> field6 = divContainerTemplate.f54956p;
            TypeHelper<DivContentAlignmentVertical> typeHelper5 = DivContainerJsonParser.f54912r;
            sn.l<String, DivContentAlignmentVertical> lVar5 = DivContentAlignmentVertical.FROM_STRING;
            Expression<DivContentAlignmentVertical> expression6 = DivContainerJsonParser.f54901g;
            Expression<DivContentAlignmentVertical> expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "content_alignment_vertical", typeHelper5, lVar5, expression6);
            Expression<DivContentAlignmentVertical> expression7 = expressionResolveOptionalExpression8 == null ? expression6 : expressionResolveOptionalExpression8;
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.f54957q, jSONObject, "disappear_actions", this.f54923a.R2(), this.f54923a.P2());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.f54958r, jSONObject, "doubletap_actions", this.f54923a.w0(), this.f54923a.u0());
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.f54959s, jSONObject, "extensions", this.f54923a.d3(), this.f54923a.b3());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.f54960t, jSONObject, "focus", this.f54923a.B3(), this.f54923a.z3());
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.f54961u, jSONObject, "functions", this.f54923a.K3(), this.f54923a.I3());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.f54962v, jSONObject, "height", this.f54923a.a7(), this.f54923a.Y6());
            if (divSize == null) {
                divSize = DivContainerJsonParser.f54902h;
            }
            DivSize divSize2 = divSize;
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.f54963w, jSONObject, "hover_end_actions", this.f54923a.w0(), this.f54923a.u0());
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.f54964x, jSONObject, "hover_start_actions", this.f54923a.w0(), this.f54923a.u0());
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.f54965y, jSONObject, "id");
            DivCollectionItemBuilder divCollectionItemBuilder = (DivCollectionItemBuilder) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.f54966z, jSONObject, "item_builder", this.f54923a.f2(), this.f54923a.d2());
            Field<Expression<Long>> field7 = divContainerTemplate.A;
            ValueValidator<Long> valueValidator2 = DivContainerJsonParser.f54918x;
            Expression<Long> expression8 = DivContainerJsonParser.f54903i;
            Expression<Long> expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "item_spacing", typeHelper3, lVar3, valueValidator2, expression8);
            if (expressionResolveOptionalExpression9 != null) {
                expression8 = expressionResolveOptionalExpression9;
            }
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.B, jSONObject, "items", this.f54923a.O4(), this.f54923a.M4());
            Field<Expression<DivContainer.LayoutMode>> field8 = divContainerTemplate.C;
            TypeHelper<DivContainer.LayoutMode> typeHelper6 = DivContainerJsonParser.f54913s;
            sn.l<String, DivContainer.LayoutMode> lVar6 = DivContainer.LayoutMode.FROM_STRING;
            Expression<DivContainer.LayoutMode> expression9 = DivContainerJsonParser.f54904j;
            Expression<DivContainer.LayoutMode> expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "layout_mode", typeHelper6, lVar6, expression9);
            Expression<DivContainer.LayoutMode> expression10 = expressionResolveOptionalExpression10 == null ? expression9 : expressionResolveOptionalExpression10;
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.D, jSONObject, "layout_provider", this.f54923a.R4(), this.f54923a.P4());
            DivContainer.Separator separator = (DivContainer.Separator) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.E, jSONObject, "line_separator", this.f54923a.r2(), this.f54923a.p2());
            Field<Expression<Long>> field9 = divContainerTemplate.F;
            ValueValidator<Long> valueValidator3 = DivContainerJsonParser.f54919y;
            Expression<Long> expression11 = DivContainerJsonParser.f54905k;
            Expression<Long> expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "line_spacing", typeHelper3, lVar3, valueValidator3, expression11);
            if (expressionResolveOptionalExpression11 != null) {
                expression11 = expressionResolveOptionalExpression11;
            }
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.G, jSONObject, "longtap_actions", this.f54923a.w0(), this.f54923a.u0());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.H, jSONObject, "margins", this.f54923a.a3(), this.f54923a.Y2());
            Field<Expression<DivContainer.Orientation>> field10 = divContainerTemplate.I;
            TypeHelper<DivContainer.Orientation> typeHelper7 = DivContainerJsonParser.f54914t;
            sn.l<String, DivContainer.Orientation> lVar7 = DivContainer.Orientation.FROM_STRING;
            Expression<DivContainer.Orientation> expression12 = DivContainerJsonParser.f54906l;
            Expression<DivContainer.Orientation> expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, "orientation", typeHelper7, lVar7, expression12);
            Expression<DivContainer.Orientation> expression13 = expressionResolveOptionalExpression12 == null ? expression12 : expressionResolveOptionalExpression12;
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.J, jSONObject, "paddings", this.f54923a.a3(), this.f54923a.Y2());
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.K, jSONObject, "press_end_actions", this.f54923a.w0(), this.f54923a.u0());
            List listResolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.L, jSONObject, "press_start_actions", this.f54923a.w0(), this.f54923a.u0());
            Expression expressionResolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divContainerTemplate.M, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression expressionResolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divContainerTemplate.N, jSONObject, "row_span", typeHelper3, lVar3, DivContainerJsonParser.f54920z);
            List listResolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.O, jSONObject, "selected_actions", this.f54923a.w0(), this.f54923a.u0());
            DivContainer.Separator separator2 = (DivContainer.Separator) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.P, jSONObject, "separator", this.f54923a.r2(), this.f54923a.p2());
            List listResolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.Q, jSONObject, "tooltips", this.f54923a.R8(), this.f54923a.P8());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.R, jSONObject, "transform", this.f54923a.d9(), this.f54923a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.S, jSONObject, "transition_change", this.f54923a.W1(), this.f54923a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.T, jSONObject, "transition_in", this.f54923a.B1(), this.f54923a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.U, jSONObject, "transition_out", this.f54923a.B1(), this.f54923a.z1());
            List listResolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.V, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivContainerJsonParser.A);
            List listResolveOptionalList17 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.W, jSONObject, "variable_triggers", this.f54923a.g9(), this.f54923a.e9());
            List listResolveOptionalList18 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.X, jSONObject, "variables", this.f54923a.m9(), this.f54923a.k9());
            Field<Expression<DivVisibility>> field11 = divContainerTemplate.Y;
            TypeHelper<DivVisibility> typeHelper8 = DivContainerJsonParser.f54915u;
            sn.l<String, DivVisibility> lVar8 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression14 = DivContainerJsonParser.f54907m;
            Expression<DivVisibility> expressionResolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field11, jSONObject, "visibility", typeHelper8, lVar8, expression14);
            Expression<DivVisibility> expression15 = expressionResolveOptionalExpression15 == null ? expression14 : expressionResolveOptionalExpression15;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.Z, jSONObject, "visibility_action", this.f54923a.y9(), this.f54923a.w9());
            List listResolveOptionalList19 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.f54940a0, jSONObject, "visibility_actions", this.f54923a.y9(), this.f54923a.w9());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.f54942b0, jSONObject, "width", this.f54923a.a7(), this.f54923a.Y6());
            if (divSize3 == null) {
                divSize3 = DivContainerJsonParser.f54908n;
            }
            return new DivContainer(divAccessibility, divAction, divAnimation2, listResolveOptionalList, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression, listResolveOptionalList2, divAspect, listResolveOptionalList3, divBorder, expression2, expression3, expressionResolveOptionalExpression6, expression5, expression7, listResolveOptionalList4, listResolveOptionalList5, listResolveOptionalList6, divFocus, listResolveOptionalList7, divSize2, listResolveOptionalList8, listResolveOptionalList9, str, divCollectionItemBuilder, expression8, listResolveOptionalList10, expression10, divLayoutProvider, separator, expression11, listResolveOptionalList11, divEdgeInsets, expression13, divEdgeInsets2, listResolveOptionalList12, listResolveOptionalList13, expressionResolveOptionalExpression13, expressionResolveOptionalExpression14, listResolveOptionalList14, separator2, listResolveOptionalList15, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, listResolveOptionalList16, listResolveOptionalList17, listResolveOptionalList18, expression15, divVisibilityAction, listResolveOptionalList19, divSize3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f54896b = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f54897c = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        Boolean bool = Boolean.TRUE;
        f54898d = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f54899e = Expression.Companion.constant$default(companion, bool, null, 2, null);
        DivContentAlignmentHorizontal divContentAlignmentHorizontal = DivContentAlignmentHorizontal.START;
        f54900f = Expression.Companion.constant$default(companion, divContentAlignmentHorizontal, null, 2, null);
        DivContentAlignmentVertical divContentAlignmentVertical = DivContentAlignmentVertical.TOP;
        f54901g = Expression.Companion.constant$default(companion, divContentAlignmentVertical, null, 2, null);
        DivSizeUnitValue divSizeUnitValue = null;
        f54902h = new DivSize.d(new DivWrapContentSize(null, null, divSizeUnitValue, 7, null));
        f54903i = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        DivContainer.LayoutMode layoutMode = DivContainer.LayoutMode.NO_WRAP;
        f54904j = Expression.Companion.constant$default(companion, layoutMode, null, 2, null);
        f54905k = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        DivContainer.Orientation orientation = DivContainer.Orientation.VERTICAL;
        f54906l = Expression.Companion.constant$default(companion, orientation, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        f54907m = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        f54908n = new DivSize.c(new DivMatchParentSize(divSizeUnitValue, null, null == true ? 1 : 0, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f54909o = companion2.from(cn.r.W(DivAlignmentHorizontal.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivContainerJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f54910p = companion2.from(cn.r.W(DivAlignmentVertical.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivContainerJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f54911q = companion2.from(divContentAlignmentHorizontal, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivContainerJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivContentAlignmentHorizontal);
            }
        });
        f54912r = companion2.from(divContentAlignmentVertical, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivContainerJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivContentAlignmentVertical);
            }
        });
        f54913s = companion2.from(layoutMode, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivContainerJsonParser$Companion$TYPE_HELPER_LAYOUT_MODE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivContainer.LayoutMode);
            }
        });
        f54914t = companion2.from(orientation, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivContainerJsonParser$Companion$TYPE_HELPER_ORIENTATION$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivContainer.Orientation);
            }
        });
        f54915u = companion2.from(divVisibility, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivContainerJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        f54916v = new ValueValidator() { // from class: ah.o2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivContainerJsonParser.g(((Double) obj).doubleValue());
            }
        };
        f54917w = new ValueValidator() { // from class: ah.p2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivContainerJsonParser.h(((Long) obj).longValue());
            }
        };
        f54918x = new ValueValidator() { // from class: ah.q2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivContainerJsonParser.i(((Long) obj).longValue());
            }
        };
        f54919y = new ValueValidator() { // from class: ah.r2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivContainerJsonParser.j(((Long) obj).longValue());
            }
        };
        f54920z = new ValueValidator() { // from class: ah.s2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivContainerJsonParser.k(((Long) obj).longValue());
            }
        };
        A = new ListValidator() { // from class: ah.t2
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivContainerJsonParser.l(list);
            }
        };
    }

    public static final boolean g(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
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

    public static final boolean k(long j10) {
        return j10 >= 0;
    }

    public static final boolean l(List list) {
        return list.size() >= 1;
    }
}
