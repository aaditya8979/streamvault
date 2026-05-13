package com.yandex.div2;

import androidx.compose.material.OutlinedTextFieldKt;
import androidx.core.graphics.drawable.IconCompat;
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
import com.yandex.div2.DivImageJsonParser;
import com.yandex.div2.DivSize;
import io.appmetrica.analytics.impl.A2;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivImageJsonParser.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivImageJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f55766a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivAnimation f55767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f55768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f55769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivAlignmentHorizontal> f55770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivAlignmentVertical> f55771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivSize.d f55772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f55773h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Integer> f55774i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f55775j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivImageScale> f55776k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivBlendMode> f55777l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivVisibility> f55778m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivSize.c f55779n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f55780o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f55781p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f55782q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f55783r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivImageScale> f55784s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivBlendMode> f55785t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivVisibility> f55786u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Double> f55787v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f55788w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f55789x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f55790y;

    /* JADX INFO: compiled from: DivImageJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivImageJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f55791a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f55791a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivImage deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f55791a.H());
            DivAction divAction = (DivAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action", this.f55791a.u0());
            DivAnimation divAnimation = (DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action_animation", this.f55791a.q1());
            if (divAnimation == null) {
                divAnimation = DivImageJsonParser.f55767b;
            }
            DivAnimation divAnimation2 = divAnimation;
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.f55791a.u0());
            TypeHelper<DivAlignmentHorizontal> typeHelper = DivImageJsonParser.f55780o;
            sn.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.FROM_STRING;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", typeHelper, lVar);
            TypeHelper<DivAlignmentVertical> typeHelper2 = DivImageJsonParser.f55781p;
            sn.l<String, DivAlignmentVertical> lVar2 = DivAlignmentVertical.FROM_STRING;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", typeHelper2, lVar2);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivImageJsonParser.f55787v;
            Expression<Double> expression = DivImageJsonParser.f55768c;
            Expression<Double> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper3, lVar3, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f55791a.t1());
            DivFadeTransition divFadeTransition = (DivFadeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "appearance_animation", this.f55791a.e3());
            DivAspect divAspect = (DivAspect) JsonPropertyParser.readOptional(parsingContext, jSONObject, "aspect", this.f55791a.C1());
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f64965g, this.f55791a.F1());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f55791a.L1());
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = DivImageJsonParser.f55769d;
            Expression<Boolean> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper4, lVar4, expression2);
            if (optionalExpression4 != null) {
                expression2 = optionalExpression4;
            }
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar5 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper5, lVar5, DivImageJsonParser.f55788w);
            TypeHelper<DivAlignmentHorizontal> typeHelper6 = DivImageJsonParser.f55782q;
            Expression<DivAlignmentHorizontal> expression3 = DivImageJsonParser.f55770e;
            Expression<DivAlignmentHorizontal> optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_horizontal", typeHelper6, lVar, expression3);
            if (optionalExpression6 != null) {
                expression3 = optionalExpression6;
            }
            TypeHelper<DivAlignmentVertical> typeHelper7 = DivImageJsonParser.f55783r;
            Expression<DivAlignmentVertical> expression4 = DivImageJsonParser.f55771f;
            Expression<DivAlignmentVertical> optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_vertical", typeHelper7, lVar2, expression4);
            Expression<DivAlignmentVertical> expression5 = optionalExpression7 == null ? expression4 : optionalExpression7;
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f55791a.P2());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", this.f55791a.u0());
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f55791a.b3());
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "filters", this.f55791a.h3());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f55791a.z3());
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f55791a.I3());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f55791a.Y6());
            if (divSize == null) {
                divSize = DivImageJsonParser.f55772g;
            }
            DivSize divSize2 = divSize;
            Expression<Boolean> expression6 = DivImageJsonParser.f55773h;
            Expression<Boolean> optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "high_priority_preview_show", typeHelper4, lVar4, expression6);
            Expression<Boolean> expression7 = optionalExpression8 == null ? expression6 : optionalExpression8;
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", this.f55791a.u0());
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", this.f55791a.u0());
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            Expression expression8 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f55791a.P4());
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", this.f55791a.u0());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f55791a.Y2());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f55791a.Y2());
            TypeHelper<Integer> typeHelper8 = TypeHelpersKt.TYPE_HELPER_COLOR;
            sn.l<Object, Integer> lVar6 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression9 = DivImageJsonParser.f55774i;
            Expression<Integer> optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "placeholder_color", typeHelper8, lVar6, expression9);
            if (optionalExpression9 != null) {
                expression9 = optionalExpression9;
            }
            Expression<Boolean> expression10 = DivImageJsonParser.f55775j;
            Expression<Boolean> optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preload_required", typeHelper4, lVar4, expression10);
            if (optionalExpression10 != null) {
                expression10 = optionalExpression10;
            }
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", this.f55791a.u0());
            List optionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", this.f55791a.u0());
            TypeHelper<String> typeHelper9 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preview", typeHelper9);
            Expression optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper9);
            Expression optionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper5, lVar5, DivImageJsonParser.f55789x);
            TypeHelper<DivImageScale> typeHelper10 = DivImageJsonParser.f55784s;
            sn.l<String, DivImageScale> lVar7 = DivImageScale.FROM_STRING;
            Expression<DivImageScale> expression11 = DivImageJsonParser.f55776k;
            Expression<DivImageScale> optionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scale", typeHelper10, lVar7, expression11);
            Expression<DivImageScale> expression12 = optionalExpression14 == null ? expression11 : optionalExpression14;
            List optionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f55791a.u0());
            Expression optionalExpression15 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "tint_color", typeHelper8, lVar6);
            TypeHelper<DivBlendMode> typeHelper11 = DivImageJsonParser.f55785t;
            sn.l<String, DivBlendMode> lVar8 = DivBlendMode.FROM_STRING;
            Expression<DivBlendMode> expression13 = DivImageJsonParser.f55777l;
            Expression<DivBlendMode> optionalExpression16 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, IconCompat.EXTRA_TINT_MODE, typeHelper11, lVar8, expression13);
            Expression<DivBlendMode> expression14 = optionalExpression16 == null ? expression13 : optionalExpression16;
            List optionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f55791a.P8());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f55791a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f55791a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f55791a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f55791a.z1());
            List optionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivImageJsonParser.f55790y);
            List optionalList17 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f55791a.e9());
            List optionalList18 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f55791a.k9());
            TypeHelper<DivVisibility> typeHelper12 = DivImageJsonParser.f55786u;
            sn.l<String, DivVisibility> lVar9 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression15 = DivImageJsonParser.f55778m;
            Expression<DivVisibility> optionalExpression17 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper12, lVar9, expression15);
            Expression<DivVisibility> expression16 = optionalExpression17 == null ? expression15 : optionalExpression17;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f55791a.w9());
            List optionalList19 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f55791a.w9());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f55791a.Y6());
            if (divSize3 == null) {
                divSize3 = DivImageJsonParser.f55779n;
            }
            return new DivImage(divAccessibility, divAction, divAnimation2, optionalList, optionalExpression, optionalExpression2, expression, optionalList2, divFadeTransition, divAspect, optionalList3, divBorder, expression2, optionalExpression5, expression3, expression5, optionalList4, optionalList5, optionalList6, optionalList7, divFocus, optionalList8, divSize2, expression7, optionalList9, optionalList10, str, expression8, divLayoutProvider, optionalList11, divEdgeInsets, divEdgeInsets2, expression9, expression10, optionalList12, optionalList13, optionalExpression11, optionalExpression12, optionalExpression13, expression12, optionalList14, optionalExpression15, expression14, optionalList15, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, optionalList16, optionalList17, optionalList18, expression16, divVisibilityAction, optionalList19, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivImage divImage) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divImage.o(), this.f55791a.H());
            JsonPropertyParser.write(parsingContext, jSONObject, "action", divImage.f55696b, this.f55791a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "action_animation", divImage.f55698c, this.f55791a.q1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", divImage.f55700d, this.f55791a.u0());
            Expression<DivAlignmentHorizontal> expressionG = divImage.g();
            sn.l<DivAlignmentHorizontal, String> lVar = DivAlignmentHorizontal.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", expressionG, lVar);
            Expression<DivAlignmentVertical> expressionM = divImage.m();
            sn.l<DivAlignmentVertical, String> lVar2 = DivAlignmentVertical.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", expressionM, lVar2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divImage.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divImage.w(), this.f55791a.t1());
            JsonPropertyParser.write(parsingContext, jSONObject, "appearance_animation", divImage.f55706i, this.f55791a.e3());
            JsonPropertyParser.write(parsingContext, jSONObject, "aspect", divImage.f55707j, this.f55791a.C1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, A2.f64965g, divImage.getBackground(), this.f55791a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, divImage.x(), this.f55791a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "capture_focus_on_action", divImage.f55710m);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divImage.b());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_horizontal", divImage.f55712o, lVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_vertical", divImage.f55713p, lVar2);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divImage.k(), this.f55791a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "doubletap_actions", divImage.f55715r, this.f55791a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divImage.getExtensions(), this.f55791a.b3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "filters", divImage.f55717t, this.f55791a.h3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divImage.n(), this.f55791a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divImage.u(), this.f55791a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divImage.getHeight(), this.f55791a.Y6());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "high_priority_preview_show", divImage.f55721x);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_end_actions", divImage.f55722y, this.f55791a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_start_actions", divImage.f55723z, this.f55791a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divImage.getId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "image_url", divImage.B, ParsingConvertersKt.URI_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divImage.r(), this.f55791a.P4());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "longtap_actions", divImage.D, this.f55791a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divImage.d(), this.f55791a.Y2());
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divImage.p(), this.f55791a.Y2());
            Expression<Integer> expression = divImage.G;
            sn.l<Integer, String> lVar3 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "placeholder_color", expression, lVar3);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preload_required", divImage.H);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_end_actions", divImage.I, this.f55791a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_start_actions", divImage.J, this.f55791a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preview", divImage.K);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divImage.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divImage.e());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scale", divImage.N, DivImageScale.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divImage.q(), this.f55791a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "tint_color", divImage.P, lVar3);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, IconCompat.EXTRA_TINT_MODE, divImage.Q, DivBlendMode.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divImage.h(), this.f55791a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divImage.getTransform(), this.f55791a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divImage.j(), this.f55791a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divImage.v(), this.f55791a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divImage.i(), this.f55791a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divImage.l(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "image");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divImage.s(), this.f55791a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divImage.c(), this.f55791a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divImage.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divImage.t(), this.f55791a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divImage.a(), this.f55791a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divImage.getWidth(), this.f55791a.Y6());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivImageJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f55792a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f55792a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivImageTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivImageTemplate divImageTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f55810a : null, this.f55792a.I());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f55812b : null, this.f55792a.v0());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action_animation", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f55814c : null, this.f55792a.r1());
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f55816d : null, this.f55792a.v0());
            TypeHelper<DivAlignmentHorizontal> typeHelper = DivImageJsonParser.f55780o;
            Field<Expression<DivAlignmentHorizontal>> field = divImageTemplate != null ? divImageTemplate.f55817e : null;
            sn.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.FROM_STRING;
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", typeHelper, allowPropertyOverride, field, lVar);
            TypeHelper<DivAlignmentVertical> typeHelper2 = DivImageJsonParser.f55781p;
            Field<Expression<DivAlignmentVertical>> field2 = divImageTemplate != null ? divImageTemplate.f55818f : null;
            sn.l<String, DivAlignmentVertical> lVar2 = DivAlignmentVertical.FROM_STRING;
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", typeHelper2, allowPropertyOverride, field2, lVar2);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f55819g : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivImageJsonParser.f55787v);
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f55820h : null, this.f55792a.u1());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "appearance_animation", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f55821i : null, this.f55792a.f3());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "aspect", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f55822j : null, this.f55792a.D1());
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f64965g, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f55823k : null, this.f55792a.G1());
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f55824l : null, this.f55792a.M1());
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field3 = divImageTemplate != null ? divImageTemplate.f55825m : null;
            sn.l<Object, Boolean> lVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "capture_focus_on_action", typeHelper3, allowPropertyOverride, field3, lVar3);
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field4 = divImageTemplate != null ? divImageTemplate.f55826n : null;
            sn.l<Number, Long> lVar4 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper4, allowPropertyOverride, field4, lVar4, DivImageJsonParser.f55788w);
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "content_alignment_horizontal", DivImageJsonParser.f55782q, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f55827o : null, lVar);
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "content_alignment_vertical", DivImageJsonParser.f55783r, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f55828p : null, lVar2);
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f55829q : null, this.f55792a.Q2());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "doubletap_actions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f55830r : null, this.f55792a.v0());
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f55831s : null, this.f55792a.c3());
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "filters", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f55832t : null, this.f55792a.i3());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f55833u : null, this.f55792a.A3());
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f55834v : null, this.f55792a.J3());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f55835w : null, this.f55792a.Z6());
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "high_priority_preview_show", typeHelper3, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f55836x : null, lVar3);
            Field optionalListField9 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_end_actions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f55837y : null, this.f55792a.v0());
            Field optionalListField10 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_start_actions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f55838z : null, this.f55792a.v0());
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.A : null);
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.B : null, ParsingConvertersKt.ANY_TO_URI);
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.C : null, this.f55792a.Q4());
            Field optionalListField11 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "longtap_actions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.D : null, this.f55792a.v0());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.E : null, this.f55792a.Z2());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.F : null, this.f55792a.Z2());
            TypeHelper<Integer> typeHelper5 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field<Expression<Integer>> field5 = divImageTemplate != null ? divImageTemplate.G : null;
            sn.l<Object, Integer> lVar5 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "placeholder_color", typeHelper5, allowPropertyOverride, field5, lVar5);
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "preload_required", typeHelper3, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.H : null, lVar3);
            Field optionalListField12 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_end_actions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.I : null, this.f55792a.v0());
            Field optionalListField13 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_start_actions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.J : null, this.f55792a.v0());
            TypeHelper<String> typeHelper6 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "preview", typeHelper6, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.K : null);
            Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", typeHelper6, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.L : null);
            Field optionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper4, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.M : null, lVar4, DivImageJsonParser.f55789x);
            Field optionalFieldWithExpression14 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "scale", DivImageJsonParser.f55784s, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.N : null, DivImageScale.FROM_STRING);
            Field optionalListField14 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.O : null, this.f55792a.v0());
            Field optionalFieldWithExpression15 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "tint_color", typeHelper5, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.P : null, lVar5);
            Field optionalFieldWithExpression16 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, IconCompat.EXTRA_TINT_MODE, DivImageJsonParser.f55785t, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.Q : null, DivBlendMode.FROM_STRING);
            Field optionalListField15 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.R : null, this.f55792a.Q8());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.S : null, this.f55792a.c9());
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.T : null, this.f55792a.V1());
            Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.U : null, this.f55792a.A1());
            Field optionalField16 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.V : null, this.f55792a.A1());
            Field<List<DivTransitionTrigger>> field6 = divImageTemplate != null ? divImageTemplate.W : null;
            sn.l<String, DivTransitionTrigger> lVar6 = DivTransitionTrigger.FROM_STRING;
            ListValidator<DivTransitionTrigger> listValidator = DivImageJsonParser.f55790y;
            tn.p.i(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivImageTemplate(optionalField, optionalField2, optionalField3, optionalListField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField2, optionalField4, optionalField5, optionalListField3, optionalField6, optionalFieldWithExpression4, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalFieldWithExpression7, optionalListField4, optionalListField5, optionalListField6, optionalListField7, optionalField7, optionalListField8, optionalField8, optionalFieldWithExpression8, optionalListField9, optionalListField10, optionalField9, fieldWithExpression, optionalField10, optionalListField11, optionalField11, optionalField12, optionalFieldWithExpression9, optionalFieldWithExpression10, optionalListField12, optionalListField13, optionalFieldWithExpression11, optionalFieldWithExpression12, optionalFieldWithExpression13, optionalFieldWithExpression14, optionalListField14, optionalFieldWithExpression15, optionalFieldWithExpression16, optionalListField15, optionalField13, optionalField14, optionalField15, optionalField16, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field6, lVar6, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.X : null, this.f55792a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.Y : null, this.f55792a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", DivImageJsonParser.f55786u, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.Z : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f55811a0 : null, this.f55792a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f55813b0 : null, this.f55792a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.f55815c0 : null, this.f55792a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivImageTemplate divImageTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divImageTemplate.f55810a, this.f55792a.I());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action", divImageTemplate.f55812b, this.f55792a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action_animation", divImageTemplate.f55814c, this.f55792a.r1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", divImageTemplate.f55816d, this.f55792a.v0());
            Field<Expression<DivAlignmentHorizontal>> field = divImageTemplate.f55817e;
            sn.l<DivAlignmentHorizontal, String> lVar = DivAlignmentHorizontal.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", field, lVar);
            Field<Expression<DivAlignmentVertical>> field2 = divImageTemplate.f55818f;
            sn.l<DivAlignmentVertical, String> lVar2 = DivAlignmentVertical.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", field2, lVar2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divImageTemplate.f55819g);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divImageTemplate.f55820h, this.f55792a.u1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "appearance_animation", divImageTemplate.f55821i, this.f55792a.f3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "aspect", divImageTemplate.f55822j, this.f55792a.D1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, A2.f64965g, divImageTemplate.f55823k, this.f55792a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, divImageTemplate.f55824l, this.f55792a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "capture_focus_on_action", divImageTemplate.f55825m);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divImageTemplate.f55826n);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_horizontal", divImageTemplate.f55827o, lVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_vertical", divImageTemplate.f55828p, lVar2);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divImageTemplate.f55829q, this.f55792a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "doubletap_actions", divImageTemplate.f55830r, this.f55792a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divImageTemplate.f55831s, this.f55792a.c3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "filters", divImageTemplate.f55832t, this.f55792a.i3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divImageTemplate.f55833u, this.f55792a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divImageTemplate.f55834v, this.f55792a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divImageTemplate.f55835w, this.f55792a.Z6());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "high_priority_preview_show", divImageTemplate.f55836x);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_end_actions", divImageTemplate.f55837y, this.f55792a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_start_actions", divImageTemplate.f55838z, this.f55792a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divImageTemplate.A);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "image_url", divImageTemplate.B, ParsingConvertersKt.URI_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divImageTemplate.C, this.f55792a.Q4());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "longtap_actions", divImageTemplate.D, this.f55792a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divImageTemplate.E, this.f55792a.Z2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divImageTemplate.F, this.f55792a.Z2());
            Field<Expression<Integer>> field3 = divImageTemplate.G;
            sn.l<Integer, String> lVar3 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "placeholder_color", field3, lVar3);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preload_required", divImageTemplate.H);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_end_actions", divImageTemplate.I, this.f55792a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_start_actions", divImageTemplate.J, this.f55792a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preview", divImageTemplate.K);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divImageTemplate.L);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divImageTemplate.M);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scale", divImageTemplate.N, DivImageScale.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divImageTemplate.O, this.f55792a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "tint_color", divImageTemplate.P, lVar3);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, IconCompat.EXTRA_TINT_MODE, divImageTemplate.Q, DivBlendMode.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divImageTemplate.R, this.f55792a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divImageTemplate.S, this.f55792a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divImageTemplate.T, this.f55792a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divImageTemplate.U, this.f55792a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divImageTemplate.V, this.f55792a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divImageTemplate.W, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "image");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divImageTemplate.X, this.f55792a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divImageTemplate.Y, this.f55792a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", divImageTemplate.Z, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divImageTemplate.f55811a0, this.f55792a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divImageTemplate.f55813b0, this.f55792a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divImageTemplate.f55815c0, this.f55792a.Z6());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivImageJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivImageTemplate, DivImage> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f55793a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f55793a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivImage resolve(@NotNull ParsingContext parsingContext, @NotNull DivImageTemplate divImageTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.f55810a, jSONObject, "accessibility", this.f55793a.J(), this.f55793a.H());
            DivAction divAction = (DivAction) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.f55812b, jSONObject, "action", this.f55793a.w0(), this.f55793a.u0());
            DivAnimation divAnimation = (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.f55814c, jSONObject, "action_animation", this.f55793a.s1(), this.f55793a.q1());
            if (divAnimation == null) {
                divAnimation = DivImageJsonParser.f55767b;
            }
            DivAnimation divAnimation2 = divAnimation;
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.f55816d, jSONObject, "actions", this.f55793a.w0(), this.f55793a.u0());
            Field<Expression<DivAlignmentHorizontal>> field = divImageTemplate.f55817e;
            TypeHelper<DivAlignmentHorizontal> typeHelper = DivImageJsonParser.f55780o;
            sn.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.FROM_STRING;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alignment_horizontal", typeHelper, lVar);
            Field<Expression<DivAlignmentVertical>> field2 = divImageTemplate.f55818f;
            TypeHelper<DivAlignmentVertical> typeHelper2 = DivImageJsonParser.f55781p;
            sn.l<String, DivAlignmentVertical> lVar2 = DivAlignmentVertical.FROM_STRING;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alignment_vertical", typeHelper2, lVar2);
            Field<Expression<Double>> field3 = divImageTemplate.f55819g;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivImageJsonParser.f55787v;
            Expression<Double> expression = DivImageJsonParser.f55768c;
            Expression<Double> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "alpha", typeHelper3, lVar3, valueValidator, expression);
            Expression<Double> expression2 = expressionResolveOptionalExpression3 == null ? expression : expressionResolveOptionalExpression3;
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.f55820h, jSONObject, "animators", this.f55793a.v1(), this.f55793a.t1());
            DivFadeTransition divFadeTransition = (DivFadeTransition) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.f55821i, jSONObject, "appearance_animation", this.f55793a.g3(), this.f55793a.e3());
            DivAspect divAspect = (DivAspect) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.f55822j, jSONObject, "aspect", this.f55793a.E1(), this.f55793a.C1());
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.f55823k, jSONObject, A2.f64965g, this.f55793a.H1(), this.f55793a.F1());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.f55824l, jSONObject, OutlinedTextFieldKt.BorderId, this.f55793a.N1(), this.f55793a.L1());
            Field<Expression<Boolean>> field4 = divImageTemplate.f55825m;
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression3 = DivImageJsonParser.f55769d;
            Expression<Boolean> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "capture_focus_on_action", typeHelper4, lVar4, expression3);
            if (expressionResolveOptionalExpression4 != null) {
                expression3 = expressionResolveOptionalExpression4;
            }
            Field<Expression<Long>> field5 = divImageTemplate.f55826n;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar5 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "column_span", typeHelper5, lVar5, DivImageJsonParser.f55788w);
            Field<Expression<DivAlignmentHorizontal>> field6 = divImageTemplate.f55827o;
            TypeHelper<DivAlignmentHorizontal> typeHelper6 = DivImageJsonParser.f55782q;
            Expression<DivAlignmentHorizontal> expression4 = DivImageJsonParser.f55770e;
            Expression<DivAlignmentHorizontal> expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "content_alignment_horizontal", typeHelper6, lVar, expression4);
            Expression<DivAlignmentHorizontal> expression5 = expressionResolveOptionalExpression6 == null ? expression4 : expressionResolveOptionalExpression6;
            Field<Expression<DivAlignmentVertical>> field7 = divImageTemplate.f55828p;
            TypeHelper<DivAlignmentVertical> typeHelper7 = DivImageJsonParser.f55783r;
            Expression<DivAlignmentVertical> expression6 = DivImageJsonParser.f55771f;
            Expression<DivAlignmentVertical> expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "content_alignment_vertical", typeHelper7, lVar2, expression6);
            if (expressionResolveOptionalExpression7 != null) {
                expression6 = expressionResolveOptionalExpression7;
            }
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.f55829q, jSONObject, "disappear_actions", this.f55793a.R2(), this.f55793a.P2());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.f55830r, jSONObject, "doubletap_actions", this.f55793a.w0(), this.f55793a.u0());
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.f55831s, jSONObject, "extensions", this.f55793a.d3(), this.f55793a.b3());
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.f55832t, jSONObject, "filters", this.f55793a.j3(), this.f55793a.h3());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.f55833u, jSONObject, "focus", this.f55793a.B3(), this.f55793a.z3());
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.f55834v, jSONObject, "functions", this.f55793a.K3(), this.f55793a.I3());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.f55835w, jSONObject, "height", this.f55793a.a7(), this.f55793a.Y6());
            if (divSize == null) {
                divSize = DivImageJsonParser.f55772g;
            }
            DivSize divSize2 = divSize;
            Field<Expression<Boolean>> field8 = divImageTemplate.f55836x;
            Expression<Boolean> expression7 = DivImageJsonParser.f55773h;
            Expression<Boolean> expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "high_priority_preview_show", typeHelper4, lVar4, expression7);
            if (expressionResolveOptionalExpression8 != null) {
                expression7 = expressionResolveOptionalExpression8;
            }
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.f55837y, jSONObject, "hover_end_actions", this.f55793a.w0(), this.f55793a.u0());
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.f55838z, jSONObject, "hover_start_actions", this.f55793a.w0(), this.f55793a.u0());
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.A, jSONObject, "id");
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divImageTemplate.B, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.C, jSONObject, "layout_provider", this.f55793a.R4(), this.f55793a.P4());
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.D, jSONObject, "longtap_actions", this.f55793a.w0(), this.f55793a.u0());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.E, jSONObject, "margins", this.f55793a.a3(), this.f55793a.Y2());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.F, jSONObject, "paddings", this.f55793a.a3(), this.f55793a.Y2());
            Field<Expression<Integer>> field9 = divImageTemplate.G;
            TypeHelper<Integer> typeHelper8 = TypeHelpersKt.TYPE_HELPER_COLOR;
            sn.l<Object, Integer> lVar6 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression8 = DivImageJsonParser.f55774i;
            Expression<Integer> expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "placeholder_color", typeHelper8, lVar6, expression8);
            if (expressionResolveOptionalExpression9 != null) {
                expression8 = expressionResolveOptionalExpression9;
            }
            Field<Expression<Boolean>> field10 = divImageTemplate.H;
            Expression<Boolean> expression9 = DivImageJsonParser.f55775j;
            Expression<Boolean> expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, "preload_required", typeHelper4, lVar4, expression9);
            if (expressionResolveOptionalExpression10 != null) {
                expression9 = expressionResolveOptionalExpression10;
            }
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.I, jSONObject, "press_end_actions", this.f55793a.w0(), this.f55793a.u0());
            List listResolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.J, jSONObject, "press_start_actions", this.f55793a.w0(), this.f55793a.u0());
            Field<Expression<String>> field11 = divImageTemplate.K;
            TypeHelper<String> typeHelper9 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field11, jSONObject, "preview", typeHelper9);
            Expression expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divImageTemplate.L, jSONObject, "reuse_id", typeHelper9);
            Expression expressionResolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divImageTemplate.M, jSONObject, "row_span", typeHelper5, lVar5, DivImageJsonParser.f55789x);
            Field<Expression<DivImageScale>> field12 = divImageTemplate.N;
            TypeHelper<DivImageScale> typeHelper10 = DivImageJsonParser.f55784s;
            sn.l<String, DivImageScale> lVar7 = DivImageScale.FROM_STRING;
            Expression<DivImageScale> expression10 = DivImageJsonParser.f55776k;
            Expression<DivImageScale> expressionResolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field12, jSONObject, "scale", typeHelper10, lVar7, expression10);
            Expression<DivImageScale> expression11 = expressionResolveOptionalExpression14 == null ? expression10 : expressionResolveOptionalExpression14;
            List listResolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.O, jSONObject, "selected_actions", this.f55793a.w0(), this.f55793a.u0());
            Expression expressionResolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divImageTemplate.P, jSONObject, "tint_color", typeHelper8, lVar6);
            Field<Expression<DivBlendMode>> field13 = divImageTemplate.Q;
            TypeHelper<DivBlendMode> typeHelper11 = DivImageJsonParser.f55785t;
            sn.l<String, DivBlendMode> lVar8 = DivBlendMode.FROM_STRING;
            Expression<DivBlendMode> expression12 = DivImageJsonParser.f55777l;
            Expression<DivBlendMode> expressionResolveOptionalExpression16 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field13, jSONObject, IconCompat.EXTRA_TINT_MODE, typeHelper11, lVar8, expression12);
            Expression<DivBlendMode> expression13 = expressionResolveOptionalExpression16 == null ? expression12 : expressionResolveOptionalExpression16;
            List listResolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.R, jSONObject, "tooltips", this.f55793a.R8(), this.f55793a.P8());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.S, jSONObject, "transform", this.f55793a.d9(), this.f55793a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.T, jSONObject, "transition_change", this.f55793a.W1(), this.f55793a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.U, jSONObject, "transition_in", this.f55793a.B1(), this.f55793a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.V, jSONObject, "transition_out", this.f55793a.B1(), this.f55793a.z1());
            List listResolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.W, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivImageJsonParser.f55790y);
            List listResolveOptionalList17 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.X, jSONObject, "variable_triggers", this.f55793a.g9(), this.f55793a.e9());
            List listResolveOptionalList18 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.Y, jSONObject, "variables", this.f55793a.m9(), this.f55793a.k9());
            Field<Expression<DivVisibility>> field14 = divImageTemplate.Z;
            TypeHelper<DivVisibility> typeHelper12 = DivImageJsonParser.f55786u;
            sn.l<String, DivVisibility> lVar9 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression14 = DivImageJsonParser.f55778m;
            Expression<DivVisibility> expressionResolveOptionalExpression17 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field14, jSONObject, "visibility", typeHelper12, lVar9, expression14);
            Expression<DivVisibility> expression15 = expressionResolveOptionalExpression17 == null ? expression14 : expressionResolveOptionalExpression17;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.f55811a0, jSONObject, "visibility_action", this.f55793a.y9(), this.f55793a.w9());
            List listResolveOptionalList19 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.f55813b0, jSONObject, "visibility_actions", this.f55793a.y9(), this.f55793a.w9());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.f55815c0, jSONObject, "width", this.f55793a.a7(), this.f55793a.Y6());
            if (divSize3 == null) {
                divSize3 = DivImageJsonParser.f55779n;
            }
            return new DivImage(divAccessibility, divAction, divAnimation2, listResolveOptionalList, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression2, listResolveOptionalList2, divFadeTransition, divAspect, listResolveOptionalList3, divBorder, expression3, expressionResolveOptionalExpression5, expression5, expression6, listResolveOptionalList4, listResolveOptionalList5, listResolveOptionalList6, listResolveOptionalList7, divFocus, listResolveOptionalList8, divSize2, expression7, listResolveOptionalList9, listResolveOptionalList10, str, expressionResolveExpression, divLayoutProvider, listResolveOptionalList11, divEdgeInsets, divEdgeInsets2, expression8, expression9, listResolveOptionalList12, listResolveOptionalList13, expressionResolveOptionalExpression11, expressionResolveOptionalExpression12, expressionResolveOptionalExpression13, expression11, listResolveOptionalList14, expressionResolveOptionalExpression15, expression13, listResolveOptionalList15, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, listResolveOptionalList16, listResolveOptionalList17, listResolveOptionalList18, expression15, divVisibilityAction, listResolveOptionalList19, divSize3);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f55767b = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f55768c = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f55769d = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        DivAlignmentHorizontal divAlignmentHorizontal = DivAlignmentHorizontal.CENTER;
        f55770e = Expression.Companion.constant$default(companion, divAlignmentHorizontal, null, 2, null);
        DivAlignmentVertical divAlignmentVertical = DivAlignmentVertical.CENTER;
        f55771f = Expression.Companion.constant$default(companion, divAlignmentVertical, null, 2, null);
        f55772g = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        Boolean bool = Boolean.FALSE;
        f55773h = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f55774i = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        f55775j = Expression.Companion.constant$default(companion, bool, null, 2, null);
        DivImageScale divImageScale = DivImageScale.FILL;
        f55776k = Expression.Companion.constant$default(companion, divImageScale, null, 2, null);
        DivBlendMode divBlendMode = DivBlendMode.SOURCE_IN;
        f55777l = Expression.Companion.constant$default(companion, divBlendMode, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        f55778m = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        f55779n = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f55780o = companion2.from(cn.r.W(DivAlignmentHorizontal.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivImageJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f55781p = companion2.from(cn.r.W(DivAlignmentVertical.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivImageJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f55782q = companion2.from(divAlignmentHorizontal, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivImageJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f55783r = companion2.from(divAlignmentVertical, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivImageJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f55784s = companion2.from(divImageScale, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivImageJsonParser$Companion$TYPE_HELPER_SCALE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivImageScale);
            }
        });
        f55785t = companion2.from(divBlendMode, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivImageJsonParser$Companion$TYPE_HELPER_TINT_MODE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivBlendMode);
            }
        });
        f55786u = companion2.from(divVisibility, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivImageJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        f55787v = new ValueValidator() { // from class: ah.d5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivImageJsonParser.e(((Double) obj).doubleValue());
            }
        };
        f55788w = new ValueValidator() { // from class: ah.e5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivImageJsonParser.f(((Long) obj).longValue());
            }
        };
        f55789x = new ValueValidator() { // from class: ah.f5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivImageJsonParser.g(((Long) obj).longValue());
            }
        };
        f55790y = new ListValidator() { // from class: ah.g5
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivImageJsonParser.h(list);
            }
        };
    }

    public static final boolean e(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }

    public static final boolean f(long j10) {
        return j10 >= 0;
    }

    public static final boolean g(long j10) {
        return j10 >= 0;
    }

    public static final boolean h(List list) {
        return list.size() >= 1;
    }
}
