package com.yandex.div2;

import androidx.compose.material.OutlinedTextFieldKt;
import com.mbridge.msdk.foundation.entity.CampaignEx;
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
import com.yandex.div2.DivGifImageJsonParser;
import com.yandex.div2.DivSize;
import io.appmetrica.analytics.impl.A2;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivGifImageJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivGifImageJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f55533a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivAnimation f55534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Double> f55535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f55536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivAlignmentHorizontal> f55537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivAlignmentVertical> f55538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivSize.d f55539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Integer> f55540h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<Boolean> f55541i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivImageScale> f55542j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Expression<DivVisibility> f55543k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final DivSize.c f55544l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f55545m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f55546n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f55547o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f55548p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivImageScale> f55549q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final TypeHelper<DivVisibility> f55550r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Double> f55551s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f55552t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ValueValidator<Long> f55553u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f55554v;

    /* JADX INFO: compiled from: DivGifImageJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivGifImageJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f55555a;

        public b(@NotNull JsonParserComponent jsonParserComponent) {
            this.f55555a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivGifImage deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f55555a.H());
            DivAction divAction = (DivAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action", this.f55555a.u0());
            DivAnimation divAnimation = (DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action_animation", this.f55555a.q1());
            if (divAnimation == null) {
                divAnimation = DivGifImageJsonParser.f55534b;
            }
            DivAnimation divAnimation2 = divAnimation;
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.f55555a.u0());
            TypeHelper<DivAlignmentHorizontal> typeHelper = DivGifImageJsonParser.f55545m;
            sn.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.FROM_STRING;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", typeHelper, lVar);
            TypeHelper<DivAlignmentVertical> typeHelper2 = DivGifImageJsonParser.f55546n;
            sn.l<String, DivAlignmentVertical> lVar2 = DivAlignmentVertical.FROM_STRING;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", typeHelper2, lVar2);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivGifImageJsonParser.f55551s;
            Expression<Double> expression = DivGifImageJsonParser.f55535c;
            Expression<Double> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper3, lVar3, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f55555a.t1());
            DivAspect divAspect = (DivAspect) JsonPropertyParser.readOptional(parsingContext, jSONObject, "aspect", this.f55555a.C1());
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f64965g, this.f55555a.F1());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f55555a.L1());
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = DivGifImageJsonParser.f55536d;
            Expression<Boolean> optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper4, lVar4, expression2);
            if (optionalExpression4 != null) {
                expression2 = optionalExpression4;
            }
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar5 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper5, lVar5, DivGifImageJsonParser.f55552t);
            TypeHelper<DivAlignmentHorizontal> typeHelper6 = DivGifImageJsonParser.f55547o;
            Expression<DivAlignmentHorizontal> expression3 = DivGifImageJsonParser.f55537e;
            Expression<DivAlignmentHorizontal> optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_horizontal", typeHelper6, lVar, expression3);
            if (optionalExpression6 != null) {
                expression3 = optionalExpression6;
            }
            TypeHelper<DivAlignmentVertical> typeHelper7 = DivGifImageJsonParser.f55548p;
            Expression<DivAlignmentVertical> expression4 = DivGifImageJsonParser.f55538f;
            Expression<DivAlignmentVertical> optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_vertical", typeHelper7, lVar2, expression4);
            Expression<DivAlignmentVertical> expression5 = optionalExpression7 == null ? expression4 : optionalExpression7;
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f55555a.P2());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", this.f55555a.u0());
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f55555a.b3());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f55555a.z3());
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f55555a.I3());
            Expression expression6 = JsonExpressionParser.readExpression(parsingContext, jSONObject, CampaignEx.JSON_KEY_GIF_URL, TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f55555a.Y6());
            if (divSize == null) {
                divSize = DivGifImageJsonParser.f55539g;
            }
            DivSize divSize2 = divSize;
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", this.f55555a.u0());
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", this.f55555a.u0());
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f55555a.P4());
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", this.f55555a.u0());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f55555a.Y2());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f55555a.Y2());
            TypeHelper<Integer> typeHelper8 = TypeHelpersKt.TYPE_HELPER_COLOR;
            sn.l<Object, Integer> lVar6 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression7 = DivGifImageJsonParser.f55540h;
            Expression<Integer> optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "placeholder_color", typeHelper8, lVar6, expression7);
            Expression<Integer> expression8 = optionalExpression8 == null ? expression7 : optionalExpression8;
            Expression<Boolean> expression9 = DivGifImageJsonParser.f55541i;
            Expression<Boolean> optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preload_required", typeHelper4, lVar4, expression9);
            Expression<Boolean> expression10 = optionalExpression9 == null ? expression9 : optionalExpression9;
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", this.f55555a.u0());
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", this.f55555a.u0());
            TypeHelper<String> typeHelper9 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preview", typeHelper9);
            Expression optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper9);
            Expression optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper5, lVar5, DivGifImageJsonParser.f55553u);
            TypeHelper<DivImageScale> typeHelper10 = DivGifImageJsonParser.f55549q;
            sn.l<String, DivImageScale> lVar7 = DivImageScale.FROM_STRING;
            Expression<DivImageScale> expression11 = DivGifImageJsonParser.f55542j;
            Expression<DivImageScale> optionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scale", typeHelper10, lVar7, expression11);
            Expression<DivImageScale> expression12 = optionalExpression13 == null ? expression11 : optionalExpression13;
            List optionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f55555a.u0());
            List optionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f55555a.P8());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f55555a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f55555a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f55555a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f55555a.z1());
            List optionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivGifImageJsonParser.f55554v);
            List optionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f55555a.e9());
            List optionalList17 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f55555a.k9());
            TypeHelper<DivVisibility> typeHelper11 = DivGifImageJsonParser.f55550r;
            sn.l<String, DivVisibility> lVar8 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression13 = DivGifImageJsonParser.f55543k;
            Expression<DivVisibility> optionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper11, lVar8, expression13);
            Expression<DivVisibility> expression14 = optionalExpression14 == null ? expression13 : optionalExpression14;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f55555a.w9());
            List optionalList18 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f55555a.w9());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f55555a.Y6());
            if (divSize3 == null) {
                divSize3 = DivGifImageJsonParser.f55544l;
            }
            return new DivGifImage(divAccessibility, divAction, divAnimation2, optionalList, optionalExpression, optionalExpression2, expression, optionalList2, divAspect, optionalList3, divBorder, expression2, optionalExpression5, expression3, expression5, optionalList4, optionalList5, optionalList6, divFocus, optionalList7, expression6, divSize2, optionalList8, optionalList9, str, divLayoutProvider, optionalList10, divEdgeInsets, divEdgeInsets2, expression8, expression10, optionalList11, optionalList12, optionalExpression10, optionalExpression11, optionalExpression12, expression12, optionalList13, optionalList14, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, optionalList15, optionalList16, optionalList17, expression14, divVisibilityAction, optionalList18, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivGifImage divGifImage) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divGifImage.o(), this.f55555a.H());
            JsonPropertyParser.write(parsingContext, jSONObject, "action", divGifImage.f55508b, this.f55555a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "action_animation", divGifImage.f55509c, this.f55555a.q1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", divGifImage.f55510d, this.f55555a.u0());
            Expression<DivAlignmentHorizontal> expressionG = divGifImage.g();
            sn.l<DivAlignmentHorizontal, String> lVar = DivAlignmentHorizontal.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", expressionG, lVar);
            Expression<DivAlignmentVertical> expressionM = divGifImage.m();
            sn.l<DivAlignmentVertical, String> lVar2 = DivAlignmentVertical.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", expressionM, lVar2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divGifImage.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divGifImage.w(), this.f55555a.t1());
            JsonPropertyParser.write(parsingContext, jSONObject, "aspect", divGifImage.f55515i, this.f55555a.C1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, A2.f64965g, divGifImage.getBackground(), this.f55555a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, divGifImage.x(), this.f55555a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "capture_focus_on_action", divGifImage.f55518l);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divGifImage.b());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_horizontal", divGifImage.f55520n, lVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_vertical", divGifImage.f55521o, lVar2);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divGifImage.k(), this.f55555a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "doubletap_actions", divGifImage.f55523q, this.f55555a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divGifImage.getExtensions(), this.f55555a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divGifImage.n(), this.f55555a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divGifImage.u(), this.f55555a.I3());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, CampaignEx.JSON_KEY_GIF_URL, divGifImage.f55527u, ParsingConvertersKt.URI_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divGifImage.getHeight(), this.f55555a.Y6());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_end_actions", divGifImage.f55529w, this.f55555a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_start_actions", divGifImage.f55530x, this.f55555a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divGifImage.getId());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divGifImage.r(), this.f55555a.P4());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "longtap_actions", divGifImage.A, this.f55555a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divGifImage.d(), this.f55555a.Y2());
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divGifImage.p(), this.f55555a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "placeholder_color", divGifImage.D, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preload_required", divGifImage.E);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_end_actions", divGifImage.F, this.f55555a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_start_actions", divGifImage.G, this.f55555a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preview", divGifImage.H);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divGifImage.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divGifImage.e());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scale", divGifImage.K, DivImageScale.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divGifImage.q(), this.f55555a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divGifImage.h(), this.f55555a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divGifImage.getTransform(), this.f55555a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divGifImage.j(), this.f55555a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divGifImage.v(), this.f55555a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divGifImage.i(), this.f55555a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divGifImage.l(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "gif");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divGifImage.s(), this.f55555a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divGifImage.c(), this.f55555a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divGifImage.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divGifImage.t(), this.f55555a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divGifImage.a(), this.f55555a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divGifImage.getWidth(), this.f55555a.Y6());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivGifImageJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f55556a;

        public c(@NotNull JsonParserComponent jsonParserComponent) {
            this.f55556a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivGifImageTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivGifImageTemplate divGifImageTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f55569a : null, this.f55556a.I());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f55570b : null, this.f55556a.v0());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action_animation", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f55571c : null, this.f55556a.r1());
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f55572d : null, this.f55556a.v0());
            TypeHelper<DivAlignmentHorizontal> typeHelper = DivGifImageJsonParser.f55545m;
            Field<Expression<DivAlignmentHorizontal>> field = divGifImageTemplate != null ? divGifImageTemplate.f55573e : null;
            sn.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.FROM_STRING;
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", typeHelper, allowPropertyOverride, field, lVar);
            TypeHelper<DivAlignmentVertical> typeHelper2 = DivGifImageJsonParser.f55546n;
            Field<Expression<DivAlignmentVertical>> field2 = divGifImageTemplate != null ? divGifImageTemplate.f55574f : null;
            sn.l<String, DivAlignmentVertical> lVar2 = DivAlignmentVertical.FROM_STRING;
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", typeHelper2, allowPropertyOverride, field2, lVar2);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f55575g : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivGifImageJsonParser.f55551s);
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f55576h : null, this.f55556a.u1());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "aspect", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f55577i : null, this.f55556a.D1());
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f64965g, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f55578j : null, this.f55556a.G1());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f55579k : null, this.f55556a.M1());
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field3 = divGifImageTemplate != null ? divGifImageTemplate.f55580l : null;
            sn.l<Object, Boolean> lVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "capture_focus_on_action", typeHelper3, allowPropertyOverride, field3, lVar3);
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field4 = divGifImageTemplate != null ? divGifImageTemplate.f55581m : null;
            sn.l<Number, Long> lVar4 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper4, allowPropertyOverride, field4, lVar4, DivGifImageJsonParser.f55552t);
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "content_alignment_horizontal", DivGifImageJsonParser.f55547o, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f55582n : null, lVar);
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "content_alignment_vertical", DivGifImageJsonParser.f55548p, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f55583o : null, lVar2);
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f55584p : null, this.f55556a.Q2());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "doubletap_actions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f55585q : null, this.f55556a.v0());
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f55586r : null, this.f55556a.c3());
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f55587s : null, this.f55556a.A3());
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f55588t : null, this.f55556a.J3());
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, CampaignEx.JSON_KEY_GIF_URL, TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f55589u : null, ParsingConvertersKt.ANY_TO_URI);
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f55590v : null, this.f55556a.Z6());
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_end_actions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f55591w : null, this.f55556a.v0());
            Field optionalListField9 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_start_actions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f55592x : null, this.f55556a.v0());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f55593y : null);
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.f55594z : null, this.f55556a.Q4());
            Field optionalListField10 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "longtap_actions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.A : null, this.f55556a.v0());
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.B : null, this.f55556a.Z2());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.C : null, this.f55556a.Z2());
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "placeholder_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.D : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "preload_required", typeHelper3, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.E : null, lVar3);
            Field optionalListField11 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_end_actions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.F : null, this.f55556a.v0());
            Field optionalListField12 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_start_actions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.G : null, this.f55556a.v0());
            TypeHelper<String> typeHelper5 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "preview", typeHelper5, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.H : null);
            Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", typeHelper5, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.I : null);
            Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper4, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.J : null, lVar4, DivGifImageJsonParser.f55553u);
            Field optionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "scale", DivGifImageJsonParser.f55549q, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.K : null, DivImageScale.FROM_STRING);
            Field optionalListField13 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.L : null, this.f55556a.v0());
            Field optionalListField14 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.M : null, this.f55556a.Q8());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.N : null, this.f55556a.c9());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.O : null, this.f55556a.V1());
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.P : null, this.f55556a.A1());
            Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.Q : null, this.f55556a.A1());
            Field<List<DivTransitionTrigger>> field5 = divGifImageTemplate != null ? divGifImageTemplate.R : null;
            sn.l<String, DivTransitionTrigger> lVar5 = DivTransitionTrigger.FROM_STRING;
            ListValidator<DivTransitionTrigger> listValidator = DivGifImageJsonParser.f55554v;
            tn.p.i(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivGifImageTemplate(optionalField, optionalField2, optionalField3, optionalListField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField2, optionalField4, optionalListField3, optionalField5, optionalFieldWithExpression4, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalFieldWithExpression7, optionalListField4, optionalListField5, optionalListField6, optionalField6, optionalListField7, fieldWithExpression, optionalField7, optionalListField8, optionalListField9, optionalField8, optionalField9, optionalListField10, optionalField10, optionalField11, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalListField11, optionalListField12, optionalFieldWithExpression10, optionalFieldWithExpression11, optionalFieldWithExpression12, optionalFieldWithExpression13, optionalListField13, optionalListField14, optionalField12, optionalField13, optionalField14, optionalField15, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field5, lVar5, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.S : null, this.f55556a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.T : null, this.f55556a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", DivGifImageJsonParser.f55550r, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.U : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.V : null, this.f55556a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.W : null, this.f55556a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.X : null, this.f55556a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivGifImageTemplate divGifImageTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divGifImageTemplate.f55569a, this.f55556a.I());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action", divGifImageTemplate.f55570b, this.f55556a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action_animation", divGifImageTemplate.f55571c, this.f55556a.r1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", divGifImageTemplate.f55572d, this.f55556a.v0());
            Field<Expression<DivAlignmentHorizontal>> field = divGifImageTemplate.f55573e;
            sn.l<DivAlignmentHorizontal, String> lVar = DivAlignmentHorizontal.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", field, lVar);
            Field<Expression<DivAlignmentVertical>> field2 = divGifImageTemplate.f55574f;
            sn.l<DivAlignmentVertical, String> lVar2 = DivAlignmentVertical.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", field2, lVar2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divGifImageTemplate.f55575g);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divGifImageTemplate.f55576h, this.f55556a.u1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "aspect", divGifImageTemplate.f55577i, this.f55556a.D1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, A2.f64965g, divGifImageTemplate.f55578j, this.f55556a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, divGifImageTemplate.f55579k, this.f55556a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "capture_focus_on_action", divGifImageTemplate.f55580l);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divGifImageTemplate.f55581m);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_horizontal", divGifImageTemplate.f55582n, lVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_vertical", divGifImageTemplate.f55583o, lVar2);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divGifImageTemplate.f55584p, this.f55556a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "doubletap_actions", divGifImageTemplate.f55585q, this.f55556a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divGifImageTemplate.f55586r, this.f55556a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divGifImageTemplate.f55587s, this.f55556a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divGifImageTemplate.f55588t, this.f55556a.J3());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, CampaignEx.JSON_KEY_GIF_URL, divGifImageTemplate.f55589u, ParsingConvertersKt.URI_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divGifImageTemplate.f55590v, this.f55556a.Z6());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_end_actions", divGifImageTemplate.f55591w, this.f55556a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_start_actions", divGifImageTemplate.f55592x, this.f55556a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divGifImageTemplate.f55593y);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divGifImageTemplate.f55594z, this.f55556a.Q4());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "longtap_actions", divGifImageTemplate.A, this.f55556a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divGifImageTemplate.B, this.f55556a.Z2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divGifImageTemplate.C, this.f55556a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "placeholder_color", divGifImageTemplate.D, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preload_required", divGifImageTemplate.E);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_end_actions", divGifImageTemplate.F, this.f55556a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_start_actions", divGifImageTemplate.G, this.f55556a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preview", divGifImageTemplate.H);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divGifImageTemplate.I);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divGifImageTemplate.J);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scale", divGifImageTemplate.K, DivImageScale.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divGifImageTemplate.L, this.f55556a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divGifImageTemplate.M, this.f55556a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divGifImageTemplate.N, this.f55556a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divGifImageTemplate.O, this.f55556a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divGifImageTemplate.P, this.f55556a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divGifImageTemplate.Q, this.f55556a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divGifImageTemplate.R, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "gif");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divGifImageTemplate.S, this.f55556a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divGifImageTemplate.T, this.f55556a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", divGifImageTemplate.U, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divGifImageTemplate.V, this.f55556a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divGifImageTemplate.W, this.f55556a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divGifImageTemplate.X, this.f55556a.Z6());
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: DivGifImageJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivGifImageTemplate, DivGifImage> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsonParserComponent f55557a;

        public d(@NotNull JsonParserComponent jsonParserComponent) {
            this.f55557a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivGifImage resolve(@NotNull ParsingContext parsingContext, @NotNull DivGifImageTemplate divGifImageTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.f55569a, jSONObject, "accessibility", this.f55557a.J(), this.f55557a.H());
            DivAction divAction = (DivAction) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.f55570b, jSONObject, "action", this.f55557a.w0(), this.f55557a.u0());
            DivAnimation divAnimation = (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.f55571c, jSONObject, "action_animation", this.f55557a.s1(), this.f55557a.q1());
            if (divAnimation == null) {
                divAnimation = DivGifImageJsonParser.f55534b;
            }
            DivAnimation divAnimation2 = divAnimation;
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.f55572d, jSONObject, "actions", this.f55557a.w0(), this.f55557a.u0());
            Field<Expression<DivAlignmentHorizontal>> field = divGifImageTemplate.f55573e;
            TypeHelper<DivAlignmentHorizontal> typeHelper = DivGifImageJsonParser.f55545m;
            sn.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.FROM_STRING;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alignment_horizontal", typeHelper, lVar);
            Field<Expression<DivAlignmentVertical>> field2 = divGifImageTemplate.f55574f;
            TypeHelper<DivAlignmentVertical> typeHelper2 = DivGifImageJsonParser.f55546n;
            sn.l<String, DivAlignmentVertical> lVar2 = DivAlignmentVertical.FROM_STRING;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alignment_vertical", typeHelper2, lVar2);
            Field<Expression<Double>> field3 = divGifImageTemplate.f55575g;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            sn.l<Number, Double> lVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator<Double> valueValidator = DivGifImageJsonParser.f55551s;
            Expression<Double> expression = DivGifImageJsonParser.f55535c;
            Expression<Double> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "alpha", typeHelper3, lVar3, valueValidator, expression);
            Expression<Double> expression2 = expressionResolveOptionalExpression3 == null ? expression : expressionResolveOptionalExpression3;
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.f55576h, jSONObject, "animators", this.f55557a.v1(), this.f55557a.t1());
            DivAspect divAspect = (DivAspect) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.f55577i, jSONObject, "aspect", this.f55557a.E1(), this.f55557a.C1());
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.f55578j, jSONObject, A2.f64965g, this.f55557a.H1(), this.f55557a.F1());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.f55579k, jSONObject, OutlinedTextFieldKt.BorderId, this.f55557a.N1(), this.f55557a.L1());
            Field<Expression<Boolean>> field4 = divGifImageTemplate.f55580l;
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            sn.l<Object, Boolean> lVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression3 = DivGifImageJsonParser.f55536d;
            Expression<Boolean> expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "capture_focus_on_action", typeHelper4, lVar4, expression3);
            if (expressionResolveOptionalExpression4 != null) {
                expression3 = expressionResolveOptionalExpression4;
            }
            Field<Expression<Long>> field5 = divGifImageTemplate.f55581m;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            sn.l<Number, Long> lVar5 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "column_span", typeHelper5, lVar5, DivGifImageJsonParser.f55552t);
            Field<Expression<DivAlignmentHorizontal>> field6 = divGifImageTemplate.f55582n;
            TypeHelper<DivAlignmentHorizontal> typeHelper6 = DivGifImageJsonParser.f55547o;
            Expression<DivAlignmentHorizontal> expression4 = DivGifImageJsonParser.f55537e;
            Expression<DivAlignmentHorizontal> expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "content_alignment_horizontal", typeHelper6, lVar, expression4);
            if (expressionResolveOptionalExpression6 != null) {
                expression4 = expressionResolveOptionalExpression6;
            }
            Field<Expression<DivAlignmentVertical>> field7 = divGifImageTemplate.f55583o;
            TypeHelper<DivAlignmentVertical> typeHelper7 = DivGifImageJsonParser.f55548p;
            Expression<DivAlignmentVertical> expression5 = DivGifImageJsonParser.f55538f;
            Expression<DivAlignmentVertical> expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "content_alignment_vertical", typeHelper7, lVar2, expression5);
            if (expressionResolveOptionalExpression7 != null) {
                expression5 = expressionResolveOptionalExpression7;
            }
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.f55584p, jSONObject, "disappear_actions", this.f55557a.R2(), this.f55557a.P2());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.f55585q, jSONObject, "doubletap_actions", this.f55557a.w0(), this.f55557a.u0());
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.f55586r, jSONObject, "extensions", this.f55557a.d3(), this.f55557a.b3());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.f55587s, jSONObject, "focus", this.f55557a.B3(), this.f55557a.z3());
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.f55588t, jSONObject, "functions", this.f55557a.K3(), this.f55557a.I3());
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divGifImageTemplate.f55589u, jSONObject, CampaignEx.JSON_KEY_GIF_URL, TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.f55590v, jSONObject, "height", this.f55557a.a7(), this.f55557a.Y6());
            if (divSize == null) {
                divSize = DivGifImageJsonParser.f55539g;
            }
            DivSize divSize2 = divSize;
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.f55591w, jSONObject, "hover_end_actions", this.f55557a.w0(), this.f55557a.u0());
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.f55592x, jSONObject, "hover_start_actions", this.f55557a.w0(), this.f55557a.u0());
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.f55593y, jSONObject, "id");
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.f55594z, jSONObject, "layout_provider", this.f55557a.R4(), this.f55557a.P4());
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.A, jSONObject, "longtap_actions", this.f55557a.w0(), this.f55557a.u0());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.B, jSONObject, "margins", this.f55557a.a3(), this.f55557a.Y2());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.C, jSONObject, "paddings", this.f55557a.a3(), this.f55557a.Y2());
            Field<Expression<Integer>> field8 = divGifImageTemplate.D;
            TypeHelper<Integer> typeHelper8 = TypeHelpersKt.TYPE_HELPER_COLOR;
            sn.l<Object, Integer> lVar6 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression6 = DivGifImageJsonParser.f55540h;
            Expression<Integer> expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "placeholder_color", typeHelper8, lVar6, expression6);
            if (expressionResolveOptionalExpression8 != null) {
                expression6 = expressionResolveOptionalExpression8;
            }
            Field<Expression<Boolean>> field9 = divGifImageTemplate.E;
            Expression<Boolean> expression7 = DivGifImageJsonParser.f55541i;
            Expression<Boolean> expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "preload_required", typeHelper4, lVar4, expression7);
            if (expressionResolveOptionalExpression9 != null) {
                expression7 = expressionResolveOptionalExpression9;
            }
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.F, jSONObject, "press_end_actions", this.f55557a.w0(), this.f55557a.u0());
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.G, jSONObject, "press_start_actions", this.f55557a.w0(), this.f55557a.u0());
            Field<Expression<String>> field10 = divGifImageTemplate.H;
            TypeHelper<String> typeHelper9 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, "preview", typeHelper9);
            Expression expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divGifImageTemplate.I, jSONObject, "reuse_id", typeHelper9);
            Expression expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divGifImageTemplate.J, jSONObject, "row_span", typeHelper5, lVar5, DivGifImageJsonParser.f55553u);
            Field<Expression<DivImageScale>> field11 = divGifImageTemplate.K;
            TypeHelper<DivImageScale> typeHelper10 = DivGifImageJsonParser.f55549q;
            sn.l<String, DivImageScale> lVar7 = DivImageScale.FROM_STRING;
            Expression<DivImageScale> expression8 = DivGifImageJsonParser.f55542j;
            Expression<DivImageScale> expressionResolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field11, jSONObject, "scale", typeHelper10, lVar7, expression8);
            Expression<DivImageScale> expression9 = expressionResolveOptionalExpression13 == null ? expression8 : expressionResolveOptionalExpression13;
            List listResolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.L, jSONObject, "selected_actions", this.f55557a.w0(), this.f55557a.u0());
            List listResolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.M, jSONObject, "tooltips", this.f55557a.R8(), this.f55557a.P8());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.N, jSONObject, "transform", this.f55557a.d9(), this.f55557a.b9());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.O, jSONObject, "transition_change", this.f55557a.W1(), this.f55557a.U1());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.P, jSONObject, "transition_in", this.f55557a.B1(), this.f55557a.z1());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.Q, jSONObject, "transition_out", this.f55557a.B1(), this.f55557a.z1());
            List listResolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.R, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivGifImageJsonParser.f55554v);
            List listResolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.S, jSONObject, "variable_triggers", this.f55557a.g9(), this.f55557a.e9());
            List listResolveOptionalList17 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.T, jSONObject, "variables", this.f55557a.m9(), this.f55557a.k9());
            Field<Expression<DivVisibility>> field12 = divGifImageTemplate.U;
            TypeHelper<DivVisibility> typeHelper11 = DivGifImageJsonParser.f55550r;
            sn.l<String, DivVisibility> lVar8 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression10 = DivGifImageJsonParser.f55543k;
            Expression<DivVisibility> expressionResolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field12, jSONObject, "visibility", typeHelper11, lVar8, expression10);
            Expression<DivVisibility> expression11 = expressionResolveOptionalExpression14 == null ? expression10 : expressionResolveOptionalExpression14;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.V, jSONObject, "visibility_action", this.f55557a.y9(), this.f55557a.w9());
            List listResolveOptionalList18 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.W, jSONObject, "visibility_actions", this.f55557a.y9(), this.f55557a.w9());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.X, jSONObject, "width", this.f55557a.a7(), this.f55557a.Y6());
            if (divSize3 == null) {
                divSize3 = DivGifImageJsonParser.f55544l;
            }
            return new DivGifImage(divAccessibility, divAction, divAnimation2, listResolveOptionalList, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression2, listResolveOptionalList2, divAspect, listResolveOptionalList3, divBorder, expression3, expressionResolveOptionalExpression5, expression4, expression5, listResolveOptionalList4, listResolveOptionalList5, listResolveOptionalList6, divFocus, listResolveOptionalList7, expressionResolveExpression, divSize2, listResolveOptionalList8, listResolveOptionalList9, str, divLayoutProvider, listResolveOptionalList10, divEdgeInsets, divEdgeInsets2, expression6, expression7, listResolveOptionalList11, listResolveOptionalList12, expressionResolveOptionalExpression10, expressionResolveOptionalExpression11, expressionResolveOptionalExpression12, expression9, listResolveOptionalList13, listResolveOptionalList14, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, listResolveOptionalList15, listResolveOptionalList16, listResolveOptionalList17, expression11, divVisibilityAction, listResolveOptionalList18, divSize3);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f55534b = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f55535c = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f55536d = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        DivAlignmentHorizontal divAlignmentHorizontal = DivAlignmentHorizontal.CENTER;
        f55537e = Expression.Companion.constant$default(companion, divAlignmentHorizontal, null, 2, null);
        DivAlignmentVertical divAlignmentVertical = DivAlignmentVertical.CENTER;
        f55538f = Expression.Companion.constant$default(companion, divAlignmentVertical, null, 2, null);
        f55539g = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        f55540h = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        f55541i = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        DivImageScale divImageScale = DivImageScale.FILL;
        f55542j = Expression.Companion.constant$default(companion, divImageScale, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        f55543k = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        f55544l = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f55545m = companion2.from(cn.r.W(DivAlignmentHorizontal.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivGifImageJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f55546n = companion2.from(cn.r.W(DivAlignmentVertical.values()), new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivGifImageJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f55547o = companion2.from(divAlignmentHorizontal, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivGifImageJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        f55548p = companion2.from(divAlignmentVertical, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivGifImageJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        f55549q = companion2.from(divImageScale, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivGifImageJsonParser$Companion$TYPE_HELPER_SCALE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivImageScale);
            }
        });
        f55550r = companion2.from(divVisibility, new sn.l<Object, Boolean>() { // from class: com.yandex.div2.DivGifImageJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        f55551s = new ValueValidator() { // from class: ah.t4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivGifImageJsonParser.e(((Double) obj).doubleValue());
            }
        };
        f55552t = new ValueValidator() { // from class: ah.u4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivGifImageJsonParser.f(((Long) obj).longValue());
            }
        };
        f55553u = new ValueValidator() { // from class: ah.v4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivGifImageJsonParser.g(((Long) obj).longValue());
            }
        };
        f55554v = new ListValidator() { // from class: ah.w4
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivGifImageJsonParser.h(list);
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
