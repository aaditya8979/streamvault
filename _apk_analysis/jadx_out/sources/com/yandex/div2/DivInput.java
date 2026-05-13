package com.yandex.div2;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.applovin.sdk.AppLovinEventTypes;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivInput;
import com.yandex.div2.DivSize;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInput.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivInput implements JSONSerializable, Hashable, ah.e2 {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    @NotNull
    public static final a f55942i0 = new a(null);

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f55943j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    @NotNull
    public static final Expression<Autocapitalization> f55944k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    @NotNull
    public static final Expression<EnterKeyType> f55945l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f55946m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivSizeUnit> f55947n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    @NotNull
    public static final DivSize.d f55948o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public static final Expression<Integer> f55949p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f55950q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public static final Expression<KeyboardType> f55951r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f55952s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f55953t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAlignmentHorizontal> f55954u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAlignmentVertical> f55955v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public static final Expression<Integer> f55956w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivVisibility> f55957x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public static final DivSize.c f55958y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivInput> f55959z0;

    @Nullable
    public final String A;

    @NotNull
    public final Expression<Boolean> B;

    @NotNull
    public final Expression<KeyboardType> C;

    @Nullable
    public final DivLayoutProvider D;

    @NotNull
    public final Expression<Double> E;

    @Nullable
    public final Expression<Long> F;

    @Nullable
    public final DivEdgeInsets G;

    @Nullable
    public final DivInputMask H;

    @Nullable
    public final Expression<Long> I;

    @Nullable
    public final Expression<Long> J;

    @Nullable
    public final NativeInterface K;

    @Nullable
    public final DivEdgeInsets L;

    @Nullable
    public final Expression<String> M;

    @Nullable
    public final Expression<Long> N;

    @NotNull
    public final Expression<Boolean> O;

    @Nullable
    public final List<DivAction> P;

    @NotNull
    public final Expression<DivAlignmentHorizontal> Q;

    @NotNull
    public final Expression<DivAlignmentVertical> R;

    @NotNull
    public final Expression<Integer> S;

    @NotNull
    public final String T;

    @Nullable
    public final List<DivTooltip> U;

    @Nullable
    public final DivTransform V;

    @Nullable
    public final DivChangeTransition W;

    @Nullable
    public final DivAppearanceTransition X;

    @Nullable
    public final DivAppearanceTransition Y;

    @Nullable
    public final List<DivTransitionTrigger> Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final DivAccessibility f55960a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @Nullable
    public final List<DivInputValidator> f55961a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Expression<DivAlignmentHorizontal> f55962b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @Nullable
    public final List<DivTrigger> f55963b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Expression<DivAlignmentVertical> f55964c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @Nullable
    public final List<DivVariable> f55965c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f55966d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @NotNull
    public final Expression<DivVisibility> f55967d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final List<DivAnimator> f55968e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @Nullable
    public final DivVisibilityAction f55969e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Expression<Autocapitalization> f55970f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @Nullable
    public final List<DivVisibilityAction> f55971f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final List<DivBackground> f55972g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    @NotNull
    public final DivSize f55973g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final DivBorder f55974h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    @Nullable
    public Integer f55975h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f55976i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final List<DivDisappearAction> f55977j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f55978k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Expression<EnterKeyType> f55979l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final List<DivExtension> f55980m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final List<DivInputFilter> f55981n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final DivFocus f55982o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final Expression<String> f55983p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f55984q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Expression<DivSizeUnit> f55985r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final Expression<JSONObject> f55986s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public final Expression<DivFontWeight> f55987t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f55988u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final List<DivFunction> f55989v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final DivSize f55990w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public final Expression<Integer> f55991x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final Expression<Integer> f55992y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public final Expression<String> f55993z;

    /* JADX INFO: compiled from: DivInput.kt */
    public enum Autocapitalization {
        AUTO("auto"),
        NONE("none"),
        WORDS("words"),
        SENTENCES("sentences"),
        ALL_CHARACTERS("all_characters");


        @NotNull
        private final String value;

        @NotNull
        public static final a Converter = new a(null);

        @NotNull
        public static final sn.l<Autocapitalization, String> TO_STRING = new sn.l<Autocapitalization, String>() { // from class: com.yandex.div2.DivInput$Autocapitalization$Converter$TO_STRING$1
            @Override // sn.l
            @NotNull
            public final String invoke(@NotNull DivInput.Autocapitalization autocapitalization) {
                return DivInput.Autocapitalization.Converter.b(autocapitalization);
            }
        };

        @NotNull
        public static final sn.l<String, Autocapitalization> FROM_STRING = new sn.l<String, Autocapitalization>() { // from class: com.yandex.div2.DivInput$Autocapitalization$Converter$FROM_STRING$1
            @Override // sn.l
            @Nullable
            public final DivInput.Autocapitalization invoke(@NotNull String str) {
                return DivInput.Autocapitalization.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivInput.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @Nullable
            public final Autocapitalization a(@NotNull String str) {
                Autocapitalization autocapitalization = Autocapitalization.AUTO;
                if (tn.p.f(str, autocapitalization.value)) {
                    return autocapitalization;
                }
                Autocapitalization autocapitalization2 = Autocapitalization.NONE;
                if (tn.p.f(str, autocapitalization2.value)) {
                    return autocapitalization2;
                }
                Autocapitalization autocapitalization3 = Autocapitalization.WORDS;
                if (tn.p.f(str, autocapitalization3.value)) {
                    return autocapitalization3;
                }
                Autocapitalization autocapitalization4 = Autocapitalization.SENTENCES;
                if (tn.p.f(str, autocapitalization4.value)) {
                    return autocapitalization4;
                }
                Autocapitalization autocapitalization5 = Autocapitalization.ALL_CHARACTERS;
                if (tn.p.f(str, autocapitalization5.value)) {
                    return autocapitalization5;
                }
                return null;
            }

            @NotNull
            public final String b(@NotNull Autocapitalization autocapitalization) {
                return autocapitalization.value;
            }
        }

        Autocapitalization(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: DivInput.kt */
    public enum EnterKeyType {
        DEFAULT("default"),
        GO("go"),
        SEARCH(AppLovinEventTypes.USER_EXECUTED_SEARCH),
        SEND("send"),
        DONE("done");


        @NotNull
        private final String value;

        @NotNull
        public static final a Converter = new a(null);

        @NotNull
        public static final sn.l<EnterKeyType, String> TO_STRING = new sn.l<EnterKeyType, String>() { // from class: com.yandex.div2.DivInput$EnterKeyType$Converter$TO_STRING$1
            @Override // sn.l
            @NotNull
            public final String invoke(@NotNull DivInput.EnterKeyType enterKeyType) {
                return DivInput.EnterKeyType.Converter.b(enterKeyType);
            }
        };

        @NotNull
        public static final sn.l<String, EnterKeyType> FROM_STRING = new sn.l<String, EnterKeyType>() { // from class: com.yandex.div2.DivInput$EnterKeyType$Converter$FROM_STRING$1
            @Override // sn.l
            @Nullable
            public final DivInput.EnterKeyType invoke(@NotNull String str) {
                return DivInput.EnterKeyType.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivInput.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @Nullable
            public final EnterKeyType a(@NotNull String str) {
                EnterKeyType enterKeyType = EnterKeyType.DEFAULT;
                if (tn.p.f(str, enterKeyType.value)) {
                    return enterKeyType;
                }
                EnterKeyType enterKeyType2 = EnterKeyType.GO;
                if (tn.p.f(str, enterKeyType2.value)) {
                    return enterKeyType2;
                }
                EnterKeyType enterKeyType3 = EnterKeyType.SEARCH;
                if (tn.p.f(str, enterKeyType3.value)) {
                    return enterKeyType3;
                }
                EnterKeyType enterKeyType4 = EnterKeyType.SEND;
                if (tn.p.f(str, enterKeyType4.value)) {
                    return enterKeyType4;
                }
                EnterKeyType enterKeyType5 = EnterKeyType.DONE;
                if (tn.p.f(str, enterKeyType5.value)) {
                    return enterKeyType5;
                }
                return null;
            }

            @NotNull
            public final String b(@NotNull EnterKeyType enterKeyType) {
                return enterKeyType.value;
            }
        }

        EnterKeyType(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: DivInput.kt */
    public enum KeyboardType {
        SINGLE_LINE_TEXT("single_line_text"),
        MULTI_LINE_TEXT("multi_line_text"),
        PHONE("phone"),
        NUMBER("number"),
        EMAIL("email"),
        URI(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI),
        PASSWORD(HintConstants.AUTOFILL_HINT_PASSWORD);


        @NotNull
        private final String value;

        @NotNull
        public static final a Converter = new a(null);

        @NotNull
        public static final sn.l<KeyboardType, String> TO_STRING = new sn.l<KeyboardType, String>() { // from class: com.yandex.div2.DivInput$KeyboardType$Converter$TO_STRING$1
            @Override // sn.l
            @NotNull
            public final String invoke(@NotNull DivInput.KeyboardType keyboardType) {
                return DivInput.KeyboardType.Converter.b(keyboardType);
            }
        };

        @NotNull
        public static final sn.l<String, KeyboardType> FROM_STRING = new sn.l<String, KeyboardType>() { // from class: com.yandex.div2.DivInput$KeyboardType$Converter$FROM_STRING$1
            @Override // sn.l
            @Nullable
            public final DivInput.KeyboardType invoke(@NotNull String str) {
                return DivInput.KeyboardType.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivInput.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @Nullable
            public final KeyboardType a(@NotNull String str) {
                KeyboardType keyboardType = KeyboardType.SINGLE_LINE_TEXT;
                if (tn.p.f(str, keyboardType.value)) {
                    return keyboardType;
                }
                KeyboardType keyboardType2 = KeyboardType.MULTI_LINE_TEXT;
                if (tn.p.f(str, keyboardType2.value)) {
                    return keyboardType2;
                }
                KeyboardType keyboardType3 = KeyboardType.PHONE;
                if (tn.p.f(str, keyboardType3.value)) {
                    return keyboardType3;
                }
                KeyboardType keyboardType4 = KeyboardType.NUMBER;
                if (tn.p.f(str, keyboardType4.value)) {
                    return keyboardType4;
                }
                KeyboardType keyboardType5 = KeyboardType.EMAIL;
                if (tn.p.f(str, keyboardType5.value)) {
                    return keyboardType5;
                }
                KeyboardType keyboardType6 = KeyboardType.URI;
                if (tn.p.f(str, keyboardType6.value)) {
                    return keyboardType6;
                }
                KeyboardType keyboardType7 = KeyboardType.PASSWORD;
                if (tn.p.f(str, keyboardType7.value)) {
                    return keyboardType7;
                }
                return null;
            }

            @NotNull
            public final String b(@NotNull KeyboardType keyboardType) {
                return keyboardType.value;
            }
        }

        KeyboardType(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: DivInput.kt */
    public static final class NativeInterface implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final a f55997c = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, NativeInterface> f55998d = new sn.p<ParsingEnvironment, JSONObject, NativeInterface>() { // from class: com.yandex.div2.DivInput$NativeInterface$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivInput.NativeInterface mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivInput.NativeInterface.f55997c.a(parsingEnvironment, jSONObject);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Expression<Integer> f55999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Integer f56000b;

        /* JADX INFO: compiled from: DivInput.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @NotNull
            public final NativeInterface a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().y4().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        public NativeInterface(@NotNull Expression<Integer> expression) {
            this.f55999a = expression;
        }

        public final boolean a(@Nullable NativeInterface nativeInterface, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
            return nativeInterface != null && this.f55999a.evaluate(expressionResolver).intValue() == nativeInterface.f55999a.evaluate(expressionResolver2).intValue();
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f56000b;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = tn.t.b(NativeInterface.class).hashCode() + this.f55999a.hashCode();
            this.f56000b = Integer.valueOf(iHashCode);
            return iHashCode;
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().y4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivInput.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivInput a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().s4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        f55943j0 = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        f55944k0 = Expression.Companion.constant$default(companion, Autocapitalization.AUTO, null, 2, null);
        f55945l0 = Expression.Companion.constant$default(companion, EnterKeyType.DEFAULT, null, 2, null);
        f55946m0 = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        f55947n0 = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
        f55948o0 = new DivSize.d(new DivWrapContentSize(null, null, null, 7, null));
        f55949p0 = Expression.Companion.constant$default(companion, 1929379840, null, 2, null);
        f55950q0 = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f55951r0 = Expression.Companion.constant$default(companion, KeyboardType.MULTI_LINE_TEXT, null, 2, null);
        f55952s0 = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f55953t0 = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f55954u0 = Expression.Companion.constant$default(companion, DivAlignmentHorizontal.START, null, 2, null);
        f55955v0 = Expression.Companion.constant$default(companion, DivAlignmentVertical.CENTER, null, 2, null);
        f55956w0 = Expression.Companion.constant$default(companion, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), null, 2, null);
        f55957x0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        f55958y0 = new DivSize.c(new DivMatchParentSize(null, null, null, 7, null == true ? 1 : 0));
        f55959z0 = new sn.p<ParsingEnvironment, JSONObject, DivInput>() { // from class: com.yandex.div2.DivInput$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivInput mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivInput.f55942i0.a(parsingEnvironment, jSONObject);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivInput(@Nullable DivAccessibility divAccessibility, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> expression3, @Nullable List<? extends DivAnimator> list, @NotNull Expression<Autocapitalization> expression4, @Nullable List<? extends DivBackground> list2, @Nullable DivBorder divBorder, @Nullable Expression<Long> expression5, @Nullable List<DivDisappearAction> list3, @Nullable List<DivAction> list4, @NotNull Expression<EnterKeyType> expression6, @Nullable List<DivExtension> list5, @Nullable List<? extends DivInputFilter> list6, @Nullable DivFocus divFocus, @Nullable Expression<String> expression7, @NotNull Expression<Long> expression8, @NotNull Expression<DivSizeUnit> expression9, @Nullable Expression<JSONObject> expression10, @Nullable Expression<DivFontWeight> expression11, @Nullable Expression<Long> expression12, @Nullable List<DivFunction> list7, @NotNull DivSize divSize, @Nullable Expression<Integer> expression13, @NotNull Expression<Integer> expression14, @Nullable Expression<String> expression15, @Nullable String str, @NotNull Expression<Boolean> expression16, @NotNull Expression<KeyboardType> expression17, @Nullable DivLayoutProvider divLayoutProvider, @NotNull Expression<Double> expression18, @Nullable Expression<Long> expression19, @Nullable DivEdgeInsets divEdgeInsets, @Nullable DivInputMask divInputMask, @Nullable Expression<Long> expression20, @Nullable Expression<Long> expression21, @Nullable NativeInterface nativeInterface, @Nullable DivEdgeInsets divEdgeInsets2, @Nullable Expression<String> expression22, @Nullable Expression<Long> expression23, @NotNull Expression<Boolean> expression24, @Nullable List<DivAction> list8, @NotNull Expression<DivAlignmentHorizontal> expression25, @NotNull Expression<DivAlignmentVertical> expression26, @NotNull Expression<Integer> expression27, @NotNull String str2, @Nullable List<DivTooltip> list9, @Nullable DivTransform divTransform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list10, @Nullable List<? extends DivInputValidator> list11, @Nullable List<DivTrigger> list12, @Nullable List<? extends DivVariable> list13, @NotNull Expression<DivVisibility> expression28, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<DivVisibilityAction> list14, @NotNull DivSize divSize2) {
        this.f55960a = divAccessibility;
        this.f55962b = expression;
        this.f55964c = expression2;
        this.f55966d = expression3;
        this.f55968e = list;
        this.f55970f = expression4;
        this.f55972g = list2;
        this.f55974h = divBorder;
        this.f55976i = expression5;
        this.f55977j = list3;
        this.f55978k = list4;
        this.f55979l = expression6;
        this.f55980m = list5;
        this.f55981n = list6;
        this.f55982o = divFocus;
        this.f55983p = expression7;
        this.f55984q = expression8;
        this.f55985r = expression9;
        this.f55986s = expression10;
        this.f55987t = expression11;
        this.f55988u = expression12;
        this.f55989v = list7;
        this.f55990w = divSize;
        this.f55991x = expression13;
        this.f55992y = expression14;
        this.f55993z = expression15;
        this.A = str;
        this.B = expression16;
        this.C = expression17;
        this.D = divLayoutProvider;
        this.E = expression18;
        this.F = expression19;
        this.G = divEdgeInsets;
        this.H = divInputMask;
        this.I = expression20;
        this.J = expression21;
        this.K = nativeInterface;
        this.L = divEdgeInsets2;
        this.M = expression22;
        this.N = expression23;
        this.O = expression24;
        this.P = list8;
        this.Q = expression25;
        this.R = expression26;
        this.S = expression27;
        this.T = str2;
        this.U = list9;
        this.V = divTransform;
        this.W = divChangeTransition;
        this.X = divAppearanceTransition;
        this.Y = divAppearanceTransition2;
        this.Z = list10;
        this.f55961a0 = list11;
        this.f55963b0 = list12;
        this.f55965c0 = list13;
        this.f55967d0 = expression28;
        this.f55969e0 = divVisibilityAction;
        this.f55971f0 = list14;
        this.f55973g0 = divSize2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivInput z(DivInput divInput, DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, Expression expression4, List list2, DivBorder divBorder, Expression expression5, List list3, List list4, Expression expression6, List list5, List list6, DivFocus divFocus, Expression expression7, Expression expression8, Expression expression9, Expression expression10, Expression expression11, Expression expression12, List list7, DivSize divSize, Expression expression13, Expression expression14, Expression expression15, String str, Expression expression16, Expression expression17, DivLayoutProvider divLayoutProvider, Expression expression18, Expression expression19, DivEdgeInsets divEdgeInsets, DivInputMask divInputMask, Expression expression20, Expression expression21, NativeInterface nativeInterface, DivEdgeInsets divEdgeInsets2, Expression expression22, Expression expression23, Expression expression24, List list8, Expression expression25, Expression expression26, Expression expression27, String str2, List list9, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list10, List list11, List list12, List list13, Expression expression28, DivVisibilityAction divVisibilityAction, List list14, DivSize divSize2, int i10, int i11, Object obj) {
        DivAccessibility divAccessibilityO = (i10 & 1) != 0 ? divInput.o() : divAccessibility;
        Expression expressionG = (i10 & 2) != 0 ? divInput.g() : expression;
        Expression expressionM = (i10 & 4) != 0 ? divInput.m() : expression2;
        Expression alpha = (i10 & 8) != 0 ? divInput.getAlpha() : expression3;
        List listW = (i10 & 16) != 0 ? divInput.w() : list;
        Expression expression29 = (i10 & 32) != 0 ? divInput.f55970f : expression4;
        List background = (i10 & 64) != 0 ? divInput.getBackground() : list2;
        DivBorder divBorderX = (i10 & 128) != 0 ? divInput.x() : divBorder;
        Expression expressionB = (i10 & 256) != 0 ? divInput.b() : expression5;
        List listK = (i10 & 512) != 0 ? divInput.k() : list3;
        List list15 = (i10 & 1024) != 0 ? divInput.f55978k : list4;
        Expression expression30 = (i10 & 2048) != 0 ? divInput.f55979l : expression6;
        List extensions = (i10 & 4096) != 0 ? divInput.getExtensions() : list5;
        List list16 = (i10 & 8192) != 0 ? divInput.f55981n : list6;
        DivFocus divFocusN = (i10 & 16384) != 0 ? divInput.n() : divFocus;
        Expression expression31 = (i10 & 32768) != 0 ? divInput.f55983p : expression7;
        Expression expression32 = (i10 & 65536) != 0 ? divInput.f55984q : expression8;
        Expression expression33 = (i10 & 131072) != 0 ? divInput.f55985r : expression9;
        Expression expression34 = (i10 & 262144) != 0 ? divInput.f55986s : expression10;
        Expression expression35 = (i10 & 524288) != 0 ? divInput.f55987t : expression11;
        Expression expression36 = (i10 & 1048576) != 0 ? divInput.f55988u : expression12;
        List listU = (i10 & 2097152) != 0 ? divInput.u() : list7;
        DivSize height = (i10 & 4194304) != 0 ? divInput.getHeight() : divSize;
        Expression expression37 = expression36;
        Expression expression38 = (i10 & 8388608) != 0 ? divInput.f55991x : expression13;
        Expression expression39 = (i10 & 16777216) != 0 ? divInput.f55992y : expression14;
        Expression expression40 = (i10 & 33554432) != 0 ? divInput.f55993z : expression15;
        String id2 = (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divInput.getId() : str;
        Expression expression41 = expression40;
        Expression expression42 = (i10 & 134217728) != 0 ? divInput.B : expression16;
        Expression expression43 = (i10 & 268435456) != 0 ? divInput.C : expression17;
        DivLayoutProvider divLayoutProviderR = (i10 & 536870912) != 0 ? divInput.r() : divLayoutProvider;
        Expression expression44 = expression43;
        Expression expression45 = (i10 & 1073741824) != 0 ? divInput.E : expression18;
        Expression expression46 = (i10 & Integer.MIN_VALUE) != 0 ? divInput.F : expression19;
        DivEdgeInsets divEdgeInsetsD = (i11 & 1) != 0 ? divInput.d() : divEdgeInsets;
        Expression expression47 = expression46;
        DivInputMask divInputMask2 = (i11 & 2) != 0 ? divInput.H : divInputMask;
        Expression expression48 = (i11 & 4) != 0 ? divInput.I : expression20;
        Expression expression49 = (i11 & 8) != 0 ? divInput.J : expression21;
        NativeInterface nativeInterface2 = (i11 & 16) != 0 ? divInput.K : nativeInterface;
        return divInput.y(divAccessibilityO, expressionG, expressionM, alpha, listW, expression29, background, divBorderX, expressionB, listK, list15, expression30, extensions, list16, divFocusN, expression31, expression32, expression33, expression34, expression35, expression37, listU, height, expression38, expression39, expression41, id2, expression42, expression44, divLayoutProviderR, expression45, expression47, divEdgeInsetsD, divInputMask2, expression48, expression49, nativeInterface2, (i11 & 32) != 0 ? divInput.p() : divEdgeInsets2, (i11 & 64) != 0 ? divInput.f() : expression22, (i11 & 128) != 0 ? divInput.e() : expression23, (i11 & 256) != 0 ? divInput.O : expression24, (i11 & 512) != 0 ? divInput.q() : list8, (i11 & 1024) != 0 ? divInput.Q : expression25, (i11 & 2048) != 0 ? divInput.R : expression26, (i11 & 4096) != 0 ? divInput.S : expression27, (i11 & 8192) != 0 ? divInput.T : str2, (i11 & 16384) != 0 ? divInput.h() : list9, (i11 & 32768) != 0 ? divInput.getTransform() : divTransform, (i11 & 65536) != 0 ? divInput.j() : divChangeTransition, (i11 & 131072) != 0 ? divInput.v() : divAppearanceTransition, (i11 & 262144) != 0 ? divInput.i() : divAppearanceTransition2, (i11 & 524288) != 0 ? divInput.l() : list10, (i11 & 1048576) != 0 ? divInput.f55961a0 : list11, (i11 & 2097152) != 0 ? divInput.s() : list12, (i11 & 4194304) != 0 ? divInput.c() : list13, (i11 & 8388608) != 0 ? divInput.getVisibility() : expression28, (i11 & 16777216) != 0 ? divInput.t() : divVisibilityAction, (i11 & 33554432) != 0 ? divInput.a() : list14, (i11 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divInput.getWidth() : divSize2);
    }

    public final boolean A(@Nullable DivInput divInput, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        if (divInput == null) {
            return false;
        }
        DivAccessibility divAccessibilityO = o();
        if (!(divAccessibilityO != null ? divAccessibilityO.a(divInput.o(), expressionResolver, expressionResolver2) : divInput.o() == null)) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expressionG = g();
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate = expressionG != null ? expressionG.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expressionG2 = divInput.g();
        if (divAlignmentHorizontalEvaluate != (expressionG2 != null ? expressionG2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expressionM = m();
        DivAlignmentVertical divAlignmentVerticalEvaluate = expressionM != null ? expressionM.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expressionM2 = divInput.m();
        if (divAlignmentVerticalEvaluate != (expressionM2 != null ? expressionM2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(getAlpha().evaluate(expressionResolver).doubleValue() == divInput.getAlpha().evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<DivAnimator> listW = w();
        if (listW != null) {
            List<DivAnimator> listW2 = divInput.w();
            if (listW2 != null) {
                if (listW.size() == listW2.size()) {
                    int i10 = 0;
                    for (Object obj : listW) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            cn.w.w();
                        }
                        if (((DivAnimator) obj).a(listW2.get(i10), expressionResolver, expressionResolver2)) {
                            i10 = i11;
                        }
                    }
                    z10 = true;
                }
                z10 = false;
                break;
            }
            return false;
        }
        if (divInput.w() != null) {
            z10 = false;
            break;
        }
        z10 = true;
        if (!z10 || this.f55970f.evaluate(expressionResolver) != divInput.f55970f.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivBackground> background = getBackground();
        if (background != null) {
            List<DivBackground> background2 = divInput.getBackground();
            if (background2 != null) {
                if (background.size() == background2.size()) {
                    int i12 = 0;
                    for (Object obj2 : background) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            cn.w.w();
                        }
                        if (((DivBackground) obj2).a(background2.get(i12), expressionResolver, expressionResolver2)) {
                            i12 = i13;
                        }
                    }
                    z11 = true;
                }
                z11 = false;
                break;
            }
            return false;
        }
        if (divInput.getBackground() != null) {
            z11 = false;
            break;
        }
        z11 = true;
        if (!z11) {
            return false;
        }
        DivBorder divBorderX = x();
        if (!(divBorderX != null ? divBorderX.a(divInput.x(), expressionResolver, expressionResolver2) : divInput.x() == null)) {
            return false;
        }
        Expression<Long> expressionB = b();
        Long lEvaluate = expressionB != null ? expressionB.evaluate(expressionResolver) : null;
        Expression<Long> expressionB2 = divInput.b();
        if (!tn.p.f(lEvaluate, expressionB2 != null ? expressionB2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            List<DivDisappearAction> listK2 = divInput.k();
            if (listK2 != null) {
                if (listK.size() == listK2.size()) {
                    int i14 = 0;
                    for (Object obj3 : listK) {
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            cn.w.w();
                        }
                        if (((DivDisappearAction) obj3).g(listK2.get(i14), expressionResolver, expressionResolver2)) {
                            i14 = i15;
                        }
                    }
                    z12 = true;
                }
                z12 = false;
                break;
            }
            return false;
        }
        if (divInput.k() != null) {
            z12 = false;
            break;
        }
        z12 = true;
        if (!z12) {
            return false;
        }
        List<DivAction> list = this.f55978k;
        if (list != null) {
            List<DivAction> list2 = divInput.f55978k;
            if (list2 != null) {
                if (list.size() == list2.size()) {
                    int i16 = 0;
                    for (Object obj4 : list) {
                        int i17 = i16 + 1;
                        if (i16 < 0) {
                            cn.w.w();
                        }
                        if (((DivAction) obj4).a(list2.get(i16), expressionResolver, expressionResolver2)) {
                            i16 = i17;
                        }
                    }
                    z13 = true;
                }
                z13 = false;
                break;
            }
            return false;
        }
        if (divInput.f55978k != null) {
            z13 = false;
            break;
        }
        z13 = true;
        if (!z13 || this.f55979l.evaluate(expressionResolver) != divInput.f55979l.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            List<DivExtension> extensions2 = divInput.getExtensions();
            if (extensions2 != null) {
                if (extensions.size() == extensions2.size()) {
                    int i18 = 0;
                    for (Object obj5 : extensions) {
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            cn.w.w();
                        }
                        if (((DivExtension) obj5).a(extensions2.get(i18), expressionResolver, expressionResolver2)) {
                            i18 = i19;
                        }
                    }
                    z14 = true;
                }
                z14 = false;
                break;
            }
            return false;
        }
        if (divInput.getExtensions() != null) {
            z14 = false;
            break;
        }
        z14 = true;
        if (!z14) {
            return false;
        }
        List<DivInputFilter> list3 = this.f55981n;
        if (list3 != null) {
            List<DivInputFilter> list4 = divInput.f55981n;
            if (list4 != null) {
                if (list3.size() == list4.size()) {
                    int i20 = 0;
                    for (Object obj6 : list3) {
                        int i21 = i20 + 1;
                        if (i20 < 0) {
                            cn.w.w();
                        }
                        if (((DivInputFilter) obj6).a(list4.get(i20), expressionResolver, expressionResolver2)) {
                            i20 = i21;
                        }
                    }
                    z15 = true;
                }
                z15 = false;
                break;
            }
            return false;
        }
        if (divInput.f55981n != null) {
            z15 = false;
            break;
        }
        z15 = true;
        if (!z15) {
            return false;
        }
        DivFocus divFocusN = n();
        if (!(divFocusN != null ? divFocusN.a(divInput.n(), expressionResolver, expressionResolver2) : divInput.n() == null)) {
            return false;
        }
        Expression<String> expression = this.f55983p;
        String strEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<String> expression2 = divInput.f55983p;
        if (!tn.p.f(strEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) || this.f55984q.evaluate(expressionResolver).longValue() != divInput.f55984q.evaluate(expressionResolver2).longValue() || this.f55985r.evaluate(expressionResolver) != divInput.f55985r.evaluate(expressionResolver2)) {
            return false;
        }
        Expression<JSONObject> expression3 = this.f55986s;
        JSONObject jSONObjectEvaluate = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        Expression<JSONObject> expression4 = divInput.f55986s;
        if (!tn.p.f(jSONObjectEvaluate, expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivFontWeight> expression5 = this.f55987t;
        DivFontWeight divFontWeightEvaluate = expression5 != null ? expression5.evaluate(expressionResolver) : null;
        Expression<DivFontWeight> expression6 = divInput.f55987t;
        if (divFontWeightEvaluate != (expression6 != null ? expression6.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expression7 = this.f55988u;
        Long lEvaluate2 = expression7 != null ? expression7.evaluate(expressionResolver) : null;
        Expression<Long> expression8 = divInput.f55988u;
        if (!tn.p.f(lEvaluate2, expression8 != null ? expression8.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivFunction> listU = u();
        if (listU != null) {
            List<DivFunction> listU2 = divInput.u();
            if (listU2 != null) {
                if (listU.size() == listU2.size()) {
                    int i22 = 0;
                    for (Object obj7 : listU) {
                        int i23 = i22 + 1;
                        if (i22 < 0) {
                            cn.w.w();
                        }
                        if (((DivFunction) obj7).a(listU2.get(i22), expressionResolver, expressionResolver2)) {
                            i22 = i23;
                        }
                    }
                    z16 = true;
                }
                z16 = false;
                break;
            }
            return false;
        }
        if (divInput.u() != null) {
            z16 = false;
            break;
        }
        z16 = true;
        if (!z16 || !getHeight().a(divInput.getHeight(), expressionResolver, expressionResolver2)) {
            return false;
        }
        Expression<Integer> expression9 = this.f55991x;
        Integer numEvaluate = expression9 != null ? expression9.evaluate(expressionResolver) : null;
        Expression<Integer> expression10 = divInput.f55991x;
        if (!tn.p.f(numEvaluate, expression10 != null ? expression10.evaluate(expressionResolver2) : null) || this.f55992y.evaluate(expressionResolver).intValue() != divInput.f55992y.evaluate(expressionResolver2).intValue()) {
            return false;
        }
        Expression<String> expression11 = this.f55993z;
        String strEvaluate2 = expression11 != null ? expression11.evaluate(expressionResolver) : null;
        Expression<String> expression12 = divInput.f55993z;
        if (!tn.p.f(strEvaluate2, expression12 != null ? expression12.evaluate(expressionResolver2) : null) || !tn.p.f(getId(), divInput.getId()) || this.B.evaluate(expressionResolver).booleanValue() != divInput.B.evaluate(expressionResolver2).booleanValue() || this.C.evaluate(expressionResolver) != divInput.C.evaluate(expressionResolver2)) {
            return false;
        }
        DivLayoutProvider divLayoutProviderR = r();
        if (!(divLayoutProviderR != null ? divLayoutProviderR.a(divInput.r(), expressionResolver, expressionResolver2) : divInput.r() == null)) {
            return false;
        }
        if (!(this.E.evaluate(expressionResolver).doubleValue() == divInput.E.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        Expression<Long> expression13 = this.F;
        Long lEvaluate3 = expression13 != null ? expression13.evaluate(expressionResolver) : null;
        Expression<Long> expression14 = divInput.F;
        if (!tn.p.f(lEvaluate3, expression14 != null ? expression14.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsD = d();
        if (!(divEdgeInsetsD != null ? divEdgeInsetsD.a(divInput.d(), expressionResolver, expressionResolver2) : divInput.d() == null)) {
            return false;
        }
        DivInputMask divInputMask = this.H;
        if (!(divInputMask != null ? divInputMask.a(divInput.H, expressionResolver, expressionResolver2) : divInput.H == null)) {
            return false;
        }
        Expression<Long> expression15 = this.I;
        Long lEvaluate4 = expression15 != null ? expression15.evaluate(expressionResolver) : null;
        Expression<Long> expression16 = divInput.I;
        if (!tn.p.f(lEvaluate4, expression16 != null ? expression16.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expression17 = this.J;
        Long lEvaluate5 = expression17 != null ? expression17.evaluate(expressionResolver) : null;
        Expression<Long> expression18 = divInput.J;
        if (!tn.p.f(lEvaluate5, expression18 != null ? expression18.evaluate(expressionResolver2) : null)) {
            return false;
        }
        NativeInterface nativeInterface = this.K;
        if (!(nativeInterface != null ? nativeInterface.a(divInput.K, expressionResolver, expressionResolver2) : divInput.K == null)) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsP = p();
        if (!(divEdgeInsetsP != null ? divEdgeInsetsP.a(divInput.p(), expressionResolver, expressionResolver2) : divInput.p() == null)) {
            return false;
        }
        Expression<String> expressionF = f();
        String strEvaluate3 = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<String> expressionF2 = divInput.f();
        if (!tn.p.f(strEvaluate3, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expressionE = e();
        Long lEvaluate6 = expressionE != null ? expressionE.evaluate(expressionResolver) : null;
        Expression<Long> expressionE2 = divInput.e();
        if (!tn.p.f(lEvaluate6, expressionE2 != null ? expressionE2.evaluate(expressionResolver2) : null) || this.O.evaluate(expressionResolver).booleanValue() != divInput.O.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        List<DivAction> listQ = q();
        if (listQ != null) {
            List<DivAction> listQ2 = divInput.q();
            if (listQ2 != null) {
                if (listQ.size() == listQ2.size()) {
                    int i24 = 0;
                    for (Object obj8 : listQ) {
                        int i25 = i24 + 1;
                        if (i24 < 0) {
                            cn.w.w();
                        }
                        if (((DivAction) obj8).a(listQ2.get(i24), expressionResolver, expressionResolver2)) {
                            i24 = i25;
                        }
                    }
                    z17 = true;
                }
                z17 = false;
                break;
            }
            return false;
        }
        if (divInput.q() != null) {
            z17 = false;
            break;
        }
        z17 = true;
        if (!z17 || this.Q.evaluate(expressionResolver) != divInput.Q.evaluate(expressionResolver2) || this.R.evaluate(expressionResolver) != divInput.R.evaluate(expressionResolver2) || this.S.evaluate(expressionResolver).intValue() != divInput.S.evaluate(expressionResolver2).intValue() || !tn.p.f(this.T, divInput.T)) {
            return false;
        }
        List<DivTooltip> listH = h();
        if (listH != null) {
            List<DivTooltip> listH2 = divInput.h();
            if (listH2 != null) {
                if (listH.size() == listH2.size()) {
                    int i26 = 0;
                    for (Object obj9 : listH) {
                        int i27 = i26 + 1;
                        if (i26 < 0) {
                            cn.w.w();
                        }
                        if (((DivTooltip) obj9).a(listH2.get(i26), expressionResolver, expressionResolver2)) {
                            i26 = i27;
                        }
                    }
                    z18 = true;
                }
                z18 = false;
                break;
            }
            return false;
        }
        if (divInput.h() != null) {
            z18 = false;
            break;
        }
        z18 = true;
        if (!z18) {
            return false;
        }
        DivTransform transform = getTransform();
        if (!(transform != null ? transform.a(divInput.getTransform(), expressionResolver, expressionResolver2) : divInput.getTransform() == null)) {
            return false;
        }
        DivChangeTransition divChangeTransitionJ = j();
        if (!(divChangeTransitionJ != null ? divChangeTransitionJ.a(divInput.j(), expressionResolver, expressionResolver2) : divInput.j() == null)) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionV = v();
        if (!(divAppearanceTransitionV != null ? divAppearanceTransitionV.a(divInput.v(), expressionResolver, expressionResolver2) : divInput.v() == null)) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionI = i();
        if (!(divAppearanceTransitionI != null ? divAppearanceTransitionI.a(divInput.i(), expressionResolver, expressionResolver2) : divInput.i() == null)) {
            return false;
        }
        List<DivTransitionTrigger> listL = l();
        if (listL != null) {
            List<DivTransitionTrigger> listL2 = divInput.l();
            if (listL2 != null) {
                if (listL.size() == listL2.size()) {
                    int i28 = 0;
                    for (Object obj10 : listL) {
                        int i29 = i28 + 1;
                        if (i28 < 0) {
                            cn.w.w();
                        }
                        if (((DivTransitionTrigger) obj10) == listL2.get(i28)) {
                            i28 = i29;
                        }
                    }
                    z19 = true;
                }
                z19 = false;
                break;
            }
            return false;
        }
        if (divInput.l() != null) {
            z19 = false;
            break;
        }
        z19 = true;
        if (!z19) {
            return false;
        }
        List<DivInputValidator> list5 = this.f55961a0;
        if (list5 != null) {
            List<DivInputValidator> list6 = divInput.f55961a0;
            if (list6 != null) {
                if (list5.size() == list6.size()) {
                    int i30 = 0;
                    for (Object obj11 : list5) {
                        int i31 = i30 + 1;
                        if (i30 < 0) {
                            cn.w.w();
                        }
                        if (((DivInputValidator) obj11).a(list6.get(i30), expressionResolver, expressionResolver2)) {
                            i30 = i31;
                        }
                    }
                    z20 = true;
                }
                z20 = false;
                break;
            }
            return false;
        }
        if (divInput.f55961a0 != null) {
            z20 = false;
            break;
        }
        z20 = true;
        if (!z20) {
            return false;
        }
        List<DivTrigger> listS = s();
        if (listS != null) {
            List<DivTrigger> listS2 = divInput.s();
            if (listS2 != null) {
                if (listS.size() == listS2.size()) {
                    int i32 = 0;
                    for (Object obj12 : listS) {
                        int i33 = i32 + 1;
                        if (i32 < 0) {
                            cn.w.w();
                        }
                        if (((DivTrigger) obj12).a(listS2.get(i32), expressionResolver, expressionResolver2)) {
                            i32 = i33;
                        }
                    }
                    z21 = true;
                }
                z21 = false;
                break;
            }
            return false;
        }
        if (divInput.s() != null) {
            z21 = false;
            break;
        }
        z21 = true;
        if (!z21) {
            return false;
        }
        List<DivVariable> listC = c();
        if (listC != null) {
            List<DivVariable> listC2 = divInput.c();
            if (listC2 != null) {
                if (listC.size() == listC2.size()) {
                    int i34 = 0;
                    for (Object obj13 : listC) {
                        int i35 = i34 + 1;
                        if (i34 < 0) {
                            cn.w.w();
                        }
                        if (((DivVariable) obj13).a(listC2.get(i34), expressionResolver, expressionResolver2)) {
                            i34 = i35;
                        }
                    }
                    z22 = true;
                }
                z22 = false;
                break;
            }
            return false;
        }
        if (divInput.c() != null) {
            z22 = false;
            break;
        }
        z22 = true;
        if (!z22 || getVisibility().evaluate(expressionResolver) != divInput.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction divVisibilityActionT = t();
        if (!(divVisibilityActionT != null ? divVisibilityActionT.g(divInput.t(), expressionResolver, expressionResolver2) : divInput.t() == null)) {
            return false;
        }
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            List<DivVisibilityAction> listA2 = divInput.a();
            if (listA2 != null) {
                if (listA.size() == listA2.size()) {
                    int i36 = 0;
                    for (Object obj14 : listA) {
                        int i37 = i36 + 1;
                        if (i36 < 0) {
                            cn.w.w();
                        }
                        if (((DivVisibilityAction) obj14).g(listA2.get(i36), expressionResolver, expressionResolver2)) {
                            i36 = i37;
                        }
                    }
                    z23 = true;
                }
                z23 = false;
                break;
            }
            return false;
        }
        if (divInput.a() != null) {
            z23 = false;
            break;
        }
        z23 = true;
        return z23 && getWidth().a(divInput.getWidth(), expressionResolver, expressionResolver2);
    }

    @Override // ah.e2
    @Nullable
    public List<DivVisibilityAction> a() {
        return this.f55971f0;
    }

    @Override // ah.e2
    @Nullable
    public Expression<Long> b() {
        return this.f55976i;
    }

    @Override // ah.e2
    @Nullable
    public List<DivVariable> c() {
        return this.f55965c0;
    }

    @Override // ah.e2
    @Nullable
    public DivEdgeInsets d() {
        return this.G;
    }

    @Override // ah.e2
    @Nullable
    public Expression<Long> e() {
        return this.N;
    }

    @Override // ah.e2
    @Nullable
    public Expression<String> f() {
        return this.M;
    }

    @Override // ah.e2
    @Nullable
    public Expression<DivAlignmentHorizontal> g() {
        return this.f55962b;
    }

    @Override // ah.e2
    @NotNull
    public Expression<Double> getAlpha() {
        return this.f55966d;
    }

    @Override // ah.e2
    @Nullable
    public List<DivBackground> getBackground() {
        return this.f55972g;
    }

    @Override // ah.e2
    @Nullable
    public List<DivExtension> getExtensions() {
        return this.f55980m;
    }

    @Override // ah.e2
    @NotNull
    public DivSize getHeight() {
        return this.f55990w;
    }

    @Override // ah.e2
    @Nullable
    public String getId() {
        return this.A;
    }

    @Override // ah.e2
    @Nullable
    public DivTransform getTransform() {
        return this.V;
    }

    @Override // ah.e2
    @NotNull
    public Expression<DivVisibility> getVisibility() {
        return this.f55967d0;
    }

    @Override // ah.e2
    @NotNull
    public DivSize getWidth() {
        return this.f55973g0;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTooltip> h() {
        return this.U;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        int iHash2;
        int iHash3;
        int iHash4;
        int iHash5;
        int iHash6;
        int iHash7;
        int iHash8;
        int iHash9;
        int iHash10;
        int iHash11;
        int iHash12;
        Integer num = this.f55975h0;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivInput.class).hashCode();
        DivAccessibility divAccessibilityO = o();
        int iHash13 = 0;
        int iHash14 = iHashCode + (divAccessibilityO != null ? divAccessibilityO.hash() : 0);
        Expression<DivAlignmentHorizontal> expressionG = g();
        int iHashCode2 = iHash14 + (expressionG != null ? expressionG.hashCode() : 0);
        Expression<DivAlignmentVertical> expressionM = m();
        int iHashCode3 = iHashCode2 + (expressionM != null ? expressionM.hashCode() : 0) + getAlpha().hashCode();
        List<DivAnimator> listW = w();
        if (listW != null) {
            Iterator<T> it = listW.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((DivAnimator) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int iHashCode4 = iHashCode3 + iHash + this.f55970f.hashCode();
        List<DivBackground> background = getBackground();
        if (background != null) {
            Iterator<T> it2 = background.iterator();
            iHash2 = 0;
            while (it2.hasNext()) {
                iHash2 += ((DivBackground) it2.next()).hash();
            }
        } else {
            iHash2 = 0;
        }
        int i10 = iHashCode4 + iHash2;
        DivBorder divBorderX = x();
        int iHash15 = i10 + (divBorderX != null ? divBorderX.hash() : 0);
        Expression<Long> expressionB = b();
        int iHashCode5 = iHash15 + (expressionB != null ? expressionB.hashCode() : 0);
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            Iterator<T> it3 = listK.iterator();
            iHash3 = 0;
            while (it3.hasNext()) {
                iHash3 += ((DivDisappearAction) it3.next()).hash();
            }
        } else {
            iHash3 = 0;
        }
        int i11 = iHashCode5 + iHash3;
        List<DivAction> list = this.f55978k;
        if (list != null) {
            Iterator<T> it4 = list.iterator();
            iHash4 = 0;
            while (it4.hasNext()) {
                iHash4 += ((DivAction) it4.next()).hash();
            }
        } else {
            iHash4 = 0;
        }
        int iHashCode6 = i11 + iHash4 + this.f55979l.hashCode();
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            Iterator<T> it5 = extensions.iterator();
            iHash5 = 0;
            while (it5.hasNext()) {
                iHash5 += ((DivExtension) it5.next()).hash();
            }
        } else {
            iHash5 = 0;
        }
        int i12 = iHashCode6 + iHash5;
        List<DivInputFilter> list2 = this.f55981n;
        if (list2 != null) {
            Iterator<T> it6 = list2.iterator();
            iHash6 = 0;
            while (it6.hasNext()) {
                iHash6 += ((DivInputFilter) it6.next()).hash();
            }
        } else {
            iHash6 = 0;
        }
        int i13 = i12 + iHash6;
        DivFocus divFocusN = n();
        int iHash16 = i13 + (divFocusN != null ? divFocusN.hash() : 0);
        Expression<String> expression = this.f55983p;
        int iHashCode7 = iHash16 + (expression != null ? expression.hashCode() : 0) + this.f55984q.hashCode() + this.f55985r.hashCode();
        Expression<JSONObject> expression2 = this.f55986s;
        int iHashCode8 = iHashCode7 + (expression2 != null ? expression2.hashCode() : 0);
        Expression<DivFontWeight> expression3 = this.f55987t;
        int iHashCode9 = iHashCode8 + (expression3 != null ? expression3.hashCode() : 0);
        Expression<Long> expression4 = this.f55988u;
        int iHashCode10 = iHashCode9 + (expression4 != null ? expression4.hashCode() : 0);
        List<DivFunction> listU = u();
        if (listU != null) {
            Iterator<T> it7 = listU.iterator();
            iHash7 = 0;
            while (it7.hasNext()) {
                iHash7 += ((DivFunction) it7.next()).hash();
            }
        } else {
            iHash7 = 0;
        }
        int iHash17 = iHashCode10 + iHash7 + getHeight().hash();
        Expression<Integer> expression5 = this.f55991x;
        int iHashCode11 = iHash17 + (expression5 != null ? expression5.hashCode() : 0) + this.f55992y.hashCode();
        Expression<String> expression6 = this.f55993z;
        int iHashCode12 = iHashCode11 + (expression6 != null ? expression6.hashCode() : 0);
        String id2 = getId();
        int iHashCode13 = iHashCode12 + (id2 != null ? id2.hashCode() : 0) + this.B.hashCode() + this.C.hashCode();
        DivLayoutProvider divLayoutProviderR = r();
        int iHash18 = iHashCode13 + (divLayoutProviderR != null ? divLayoutProviderR.hash() : 0) + this.E.hashCode();
        Expression<Long> expression7 = this.F;
        int iHashCode14 = iHash18 + (expression7 != null ? expression7.hashCode() : 0);
        DivEdgeInsets divEdgeInsetsD = d();
        int iHash19 = iHashCode14 + (divEdgeInsetsD != null ? divEdgeInsetsD.hash() : 0);
        DivInputMask divInputMask = this.H;
        int iHash20 = iHash19 + (divInputMask != null ? divInputMask.hash() : 0);
        Expression<Long> expression8 = this.I;
        int iHashCode15 = iHash20 + (expression8 != null ? expression8.hashCode() : 0);
        Expression<Long> expression9 = this.J;
        int iHashCode16 = iHashCode15 + (expression9 != null ? expression9.hashCode() : 0);
        NativeInterface nativeInterface = this.K;
        int iHash21 = iHashCode16 + (nativeInterface != null ? nativeInterface.hash() : 0);
        DivEdgeInsets divEdgeInsetsP = p();
        int iHash22 = iHash21 + (divEdgeInsetsP != null ? divEdgeInsetsP.hash() : 0);
        Expression<String> expressionF = f();
        int iHashCode17 = iHash22 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression<Long> expressionE = e();
        int iHashCode18 = iHashCode17 + (expressionE != null ? expressionE.hashCode() : 0) + this.O.hashCode();
        List<DivAction> listQ = q();
        if (listQ != null) {
            Iterator<T> it8 = listQ.iterator();
            iHash8 = 0;
            while (it8.hasNext()) {
                iHash8 += ((DivAction) it8.next()).hash();
            }
        } else {
            iHash8 = 0;
        }
        int iHashCode19 = iHashCode18 + iHash8 + this.Q.hashCode() + this.R.hashCode() + this.S.hashCode() + this.T.hashCode();
        List<DivTooltip> listH = h();
        if (listH != null) {
            Iterator<T> it9 = listH.iterator();
            iHash9 = 0;
            while (it9.hasNext()) {
                iHash9 += ((DivTooltip) it9.next()).hash();
            }
        } else {
            iHash9 = 0;
        }
        int i14 = iHashCode19 + iHash9;
        DivTransform transform = getTransform();
        int iHash23 = i14 + (transform != null ? transform.hash() : 0);
        DivChangeTransition divChangeTransitionJ = j();
        int iHash24 = iHash23 + (divChangeTransitionJ != null ? divChangeTransitionJ.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionV = v();
        int iHash25 = iHash24 + (divAppearanceTransitionV != null ? divAppearanceTransitionV.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionI = i();
        int iHash26 = iHash25 + (divAppearanceTransitionI != null ? divAppearanceTransitionI.hash() : 0);
        List<DivTransitionTrigger> listL = l();
        int iHashCode20 = iHash26 + (listL != null ? listL.hashCode() : 0);
        List<DivInputValidator> list3 = this.f55961a0;
        if (list3 != null) {
            Iterator<T> it10 = list3.iterator();
            iHash10 = 0;
            while (it10.hasNext()) {
                iHash10 += ((DivInputValidator) it10.next()).hash();
            }
        } else {
            iHash10 = 0;
        }
        int i15 = iHashCode20 + iHash10;
        List<DivTrigger> listS = s();
        if (listS != null) {
            Iterator<T> it11 = listS.iterator();
            iHash11 = 0;
            while (it11.hasNext()) {
                iHash11 += ((DivTrigger) it11.next()).hash();
            }
        } else {
            iHash11 = 0;
        }
        int i16 = i15 + iHash11;
        List<DivVariable> listC = c();
        if (listC != null) {
            Iterator<T> it12 = listC.iterator();
            iHash12 = 0;
            while (it12.hasNext()) {
                iHash12 += ((DivVariable) it12.next()).hash();
            }
        } else {
            iHash12 = 0;
        }
        int iHashCode21 = i16 + iHash12 + getVisibility().hashCode();
        DivVisibilityAction divVisibilityActionT = t();
        int iHash27 = iHashCode21 + (divVisibilityActionT != null ? divVisibilityActionT.hash() : 0);
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            Iterator<T> it13 = listA.iterator();
            while (it13.hasNext()) {
                iHash13 += ((DivVisibilityAction) it13.next()).hash();
            }
        }
        int iHash28 = iHash27 + iHash13 + getWidth().hash();
        this.f55975h0 = Integer.valueOf(iHash28);
        return iHash28;
    }

    @Override // ah.e2
    @Nullable
    public DivAppearanceTransition i() {
        return this.Y;
    }

    @Override // ah.e2
    @Nullable
    public DivChangeTransition j() {
        return this.W;
    }

    @Override // ah.e2
    @Nullable
    public List<DivDisappearAction> k() {
        return this.f55977j;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTransitionTrigger> l() {
        return this.Z;
    }

    @Override // ah.e2
    @Nullable
    public Expression<DivAlignmentVertical> m() {
        return this.f55964c;
    }

    @Override // ah.e2
    @Nullable
    public DivFocus n() {
        return this.f55982o;
    }

    @Override // ah.e2
    @Nullable
    public DivAccessibility o() {
        return this.f55960a;
    }

    @Override // ah.e2
    @Nullable
    public DivEdgeInsets p() {
        return this.L;
    }

    @Override // ah.e2
    @Nullable
    public List<DivAction> q() {
        return this.P;
    }

    @Override // ah.e2
    @Nullable
    public DivLayoutProvider r() {
        return this.D;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTrigger> s() {
        return this.f55963b0;
    }

    @Override // ah.e2
    @Nullable
    public DivVisibilityAction t() {
        return this.f55969e0;
    }

    @Override // ah.e2
    @Nullable
    public List<DivFunction> u() {
        return this.f55989v;
    }

    @Override // ah.e2
    @Nullable
    public DivAppearanceTransition v() {
        return this.X;
    }

    @Override // ah.e2
    @Nullable
    public List<DivAnimator> w() {
        return this.f55968e;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().s4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // ah.e2
    @Nullable
    public DivBorder x() {
        return this.f55974h;
    }

    @NotNull
    public final DivInput y(@Nullable DivAccessibility divAccessibility, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> expression3, @Nullable List<? extends DivAnimator> list, @NotNull Expression<Autocapitalization> expression4, @Nullable List<? extends DivBackground> list2, @Nullable DivBorder divBorder, @Nullable Expression<Long> expression5, @Nullable List<DivDisappearAction> list3, @Nullable List<DivAction> list4, @NotNull Expression<EnterKeyType> expression6, @Nullable List<DivExtension> list5, @Nullable List<? extends DivInputFilter> list6, @Nullable DivFocus divFocus, @Nullable Expression<String> expression7, @NotNull Expression<Long> expression8, @NotNull Expression<DivSizeUnit> expression9, @Nullable Expression<JSONObject> expression10, @Nullable Expression<DivFontWeight> expression11, @Nullable Expression<Long> expression12, @Nullable List<DivFunction> list7, @NotNull DivSize divSize, @Nullable Expression<Integer> expression13, @NotNull Expression<Integer> expression14, @Nullable Expression<String> expression15, @Nullable String str, @NotNull Expression<Boolean> expression16, @NotNull Expression<KeyboardType> expression17, @Nullable DivLayoutProvider divLayoutProvider, @NotNull Expression<Double> expression18, @Nullable Expression<Long> expression19, @Nullable DivEdgeInsets divEdgeInsets, @Nullable DivInputMask divInputMask, @Nullable Expression<Long> expression20, @Nullable Expression<Long> expression21, @Nullable NativeInterface nativeInterface, @Nullable DivEdgeInsets divEdgeInsets2, @Nullable Expression<String> expression22, @Nullable Expression<Long> expression23, @NotNull Expression<Boolean> expression24, @Nullable List<DivAction> list8, @NotNull Expression<DivAlignmentHorizontal> expression25, @NotNull Expression<DivAlignmentVertical> expression26, @NotNull Expression<Integer> expression27, @NotNull String str2, @Nullable List<DivTooltip> list9, @Nullable DivTransform divTransform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list10, @Nullable List<? extends DivInputValidator> list11, @Nullable List<DivTrigger> list12, @Nullable List<? extends DivVariable> list13, @NotNull Expression<DivVisibility> expression28, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<DivVisibilityAction> list14, @NotNull DivSize divSize2) {
        return new DivInput(divAccessibility, expression, expression2, expression3, list, expression4, list2, divBorder, expression5, list3, list4, expression6, list5, list6, divFocus, expression7, expression8, expression9, expression10, expression11, expression12, list7, divSize, expression13, expression14, expression15, str, expression16, expression17, divLayoutProvider, expression18, expression19, divEdgeInsets, divInputMask, expression20, expression21, nativeInterface, divEdgeInsets2, expression22, expression23, expression24, list8, expression25, expression26, expression27, str2, list9, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list10, list11, list12, list13, expression28, divVisibilityAction, list14, divSize2);
    }
}
