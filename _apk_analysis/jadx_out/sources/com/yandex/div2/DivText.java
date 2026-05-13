package com.yandex.div2;

import android.net.Uri;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivText;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivText.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivText implements JSONSerializable, Hashable, ah.e2 {

    @NotNull
    public static final Expression<Boolean> A0;

    @NotNull
    public static final Expression<DivLineStyle> B0;

    @NotNull
    public static final Expression<DivAlignmentHorizontal> C0;

    @NotNull
    public static final Expression<DivAlignmentVertical> D0;

    @NotNull
    public static final Expression<Integer> E0;

    @NotNull
    public static final Expression<Boolean> F0;

    @NotNull
    public static final Expression<Truncate> G0;

    @NotNull
    public static final Expression<DivLineStyle> H0;

    @NotNull
    public static final Expression<DivVisibility> I0;

    @NotNull
    public static final DivSize.c J0;

    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivText> K0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public static final a f57598s0 = new a(null);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public static final DivAnimation f57599t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f57600u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f57601v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f57602w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public static final Expression<DivSizeUnit> f57603x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public static final DivSize.d f57604y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f57605z0;

    @Nullable
    public final List<DivFunction> A;

    @NotNull
    public final DivSize B;

    @Nullable
    public final List<DivAction> C;

    @Nullable
    public final List<DivAction> D;

    @Nullable
    public final String E;

    @Nullable
    public final List<Image> F;

    @Nullable
    public final DivLayoutProvider G;

    @NotNull
    public final Expression<Double> H;

    @Nullable
    public final Expression<Long> I;

    @Nullable
    public final List<DivAction> J;

    @Nullable
    public final DivEdgeInsets K;

    @Nullable
    public final Expression<Long> L;

    @Nullable
    public final Expression<Long> M;

    @Nullable
    public final DivEdgeInsets N;

    @Nullable
    public final List<DivAction> O;

    @Nullable
    public final List<DivAction> P;

    @Nullable
    public final List<Range> Q;

    @Nullable
    public final Expression<String> R;

    @Nullable
    public final Expression<Long> S;

    @NotNull
    public final Expression<Boolean> T;

    @Nullable
    public final List<DivAction> U;

    @NotNull
    public final Expression<DivLineStyle> V;

    @NotNull
    public final Expression<String> W;

    @NotNull
    public final Expression<DivAlignmentHorizontal> X;

    @NotNull
    public final Expression<DivAlignmentVertical> Y;

    @NotNull
    public final Expression<Integer> Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final DivAccessibility f57606a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @Nullable
    public final DivTextGradient f57607a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final DivAction f57608b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @Nullable
    public final DivShadow f57609b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final DivAnimation f57610c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f57611c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f57612d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @Nullable
    public final List<DivTooltip> f57613d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Expression<DivAlignmentHorizontal> f57614e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @Nullable
    public final DivTransform f57615e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Expression<DivAlignmentVertical> f57616f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @Nullable
    public final DivChangeTransition f57617f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f57618g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    @Nullable
    public final DivAppearanceTransition f57619g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final List<DivAnimator> f57620h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    @Nullable
    public final DivAppearanceTransition f57621h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final Expression<Boolean> f57622i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    @Nullable
    public final List<DivTransitionTrigger> f57623i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final List<DivBackground> f57624j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    @NotNull
    public final Expression<Truncate> f57625j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final DivBorder f57626k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    @NotNull
    public final Expression<DivLineStyle> f57627k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f57628l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    @Nullable
    public final List<DivTrigger> f57629l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f57630m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    @Nullable
    public final List<DivVariable> f57631m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final List<DivDisappearAction> f57632n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    @NotNull
    public final Expression<DivVisibility> f57633n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f57634o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    @Nullable
    public final DivVisibilityAction f57635o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final Ellipsis f57636p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public final List<DivVisibilityAction> f57637p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public final List<DivExtension> f57638q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final DivSize f57639q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public final DivFocus f57640r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public Integer f57641r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final Expression<Integer> f57642s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public final Expression<String> f57643t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public final Expression<String> f57644u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f57645v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Expression<DivSizeUnit> f57646w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public final Expression<JSONObject> f57647x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public final Expression<DivFontWeight> f57648y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f57649z;

    /* JADX INFO: compiled from: DivText.kt */
    public static final class Ellipsis implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final a f57650f = new a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, Ellipsis> f57651g = new sn.p<ParsingEnvironment, JSONObject, Ellipsis>() { // from class: com.yandex.div2.DivText$Ellipsis$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivText.Ellipsis mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivText.Ellipsis.f57650f.a(parsingEnvironment, jSONObject);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final List<DivAction> f57652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final List<Image> f57653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final List<Range> f57654c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Expression<String> f57655d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public Integer f57656e;

        /* JADX INFO: compiled from: DivText.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @NotNull
            public final Ellipsis a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().d8().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        public Ellipsis(@Nullable List<DivAction> list, @Nullable List<Image> list2, @Nullable List<Range> list3, @NotNull Expression<String> expression) {
            this.f57652a = list;
            this.f57653b = list2;
            this.f57654c = list3;
            this.f57655d = expression;
        }

        public final boolean a(@Nullable Ellipsis ellipsis, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
            boolean z10;
            boolean z11;
            boolean z12;
            if (ellipsis == null) {
                return false;
            }
            List<DivAction> list = this.f57652a;
            if (list != null) {
                List<DivAction> list2 = ellipsis.f57652a;
                if (list2 != null) {
                    if (list.size() == list2.size()) {
                        int i10 = 0;
                        for (Object obj : list) {
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                cn.w.w();
                            }
                            if (((DivAction) obj).a(list2.get(i10), expressionResolver, expressionResolver2)) {
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
            if (ellipsis.f57652a != null) {
                z10 = false;
                break;
            }
            z10 = true;
            if (!z10) {
                return false;
            }
            List<Image> list3 = this.f57653b;
            if (list3 != null) {
                List<Image> list4 = ellipsis.f57653b;
                if (list4 != null) {
                    if (list3.size() == list4.size()) {
                        int i12 = 0;
                        for (Object obj2 : list3) {
                            int i13 = i12 + 1;
                            if (i12 < 0) {
                                cn.w.w();
                            }
                            if (((Image) obj2).a(list4.get(i12), expressionResolver, expressionResolver2)) {
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
            if (ellipsis.f57653b != null) {
                z11 = false;
                break;
            }
            z11 = true;
            if (!z11) {
                return false;
            }
            List<Range> list5 = this.f57654c;
            if (list5 != null) {
                List<Range> list6 = ellipsis.f57654c;
                if (list6 != null) {
                    if (list5.size() == list6.size()) {
                        int i14 = 0;
                        for (Object obj3 : list5) {
                            int i15 = i14 + 1;
                            if (i14 < 0) {
                                cn.w.w();
                            }
                            if (((Range) obj3).a(list6.get(i14), expressionResolver, expressionResolver2)) {
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
            if (ellipsis.f57654c != null) {
                z12 = false;
                break;
            }
            z12 = true;
            return z12 && tn.p.f(this.f57655d.evaluate(expressionResolver), ellipsis.f57655d.evaluate(expressionResolver2));
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            int iHash;
            int iHash2;
            Integer num = this.f57656e;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = tn.t.b(Ellipsis.class).hashCode();
            List<DivAction> list = this.f57652a;
            int iHash3 = 0;
            if (list != null) {
                Iterator<T> it = list.iterator();
                iHash = 0;
                while (it.hasNext()) {
                    iHash += ((DivAction) it.next()).hash();
                }
            } else {
                iHash = 0;
            }
            int i10 = iHashCode + iHash;
            List<Image> list2 = this.f57653b;
            if (list2 != null) {
                Iterator<T> it2 = list2.iterator();
                iHash2 = 0;
                while (it2.hasNext()) {
                    iHash2 += ((Image) it2.next()).hash();
                }
            } else {
                iHash2 = 0;
            }
            int i11 = i10 + iHash2;
            List<Range> list3 = this.f57654c;
            if (list3 != null) {
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    iHash3 += ((Range) it3.next()).hash();
                }
            }
            int iHashCode2 = i11 + iHash3 + this.f57655d.hashCode();
            this.f57656e = Integer.valueOf(iHashCode2);
            return iHashCode2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().d8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivText.kt */
    public static final class Image implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        public static final a f57657l = new a(null);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        public static final Expression<DivTextAlignmentVertical> f57658m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NotNull
        public static final DivFixedSize f57659n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @NotNull
        public static final Expression<IndexingDirection> f57660o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @NotNull
        public static final Expression<Boolean> f57661p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @NotNull
        public static final Expression<DivBlendMode> f57662q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @NotNull
        public static final DivFixedSize f57663r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, Image> f57664s;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Accessibility f57665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Expression<DivTextAlignmentVertical> f57666b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivFixedSize f57667c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Expression<IndexingDirection> f57668d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final Expression<Boolean> f57669e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final Expression<Long> f57670f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final Expression<Integer> f57671g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public final Expression<DivBlendMode> f57672h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final Expression<Uri> f57673i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public final DivFixedSize f57674j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public Integer f57675k;

        /* JADX INFO: compiled from: DivText.kt */
        public static final class Accessibility implements JSONSerializable, Hashable {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @NotNull
            public static final a f57676d = new a(null);

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @NotNull
            public static final Type f57677e = Type.AUTO;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @NotNull
            public static final sn.p<ParsingEnvironment, JSONObject, Accessibility> f57678f = new sn.p<ParsingEnvironment, JSONObject, Accessibility>() { // from class: com.yandex.div2.DivText$Image$Accessibility$Companion$CREATOR$1
                @Override // sn.p
                @NotNull
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivText.Image.Accessibility mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return DivText.Image.Accessibility.f57676d.a(parsingEnvironment, jSONObject);
                }
            };

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public final Expression<String> f57679a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final Type f57680b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public Integer f57681c;

            /* JADX INFO: compiled from: DivText.kt */
            public enum Type {
                NONE("none"),
                BUTTON("button"),
                IMAGE("image"),
                TEXT("text"),
                AUTO("auto");


                @NotNull
                private final String value;

                @NotNull
                public static final a Converter = new a(null);

                @NotNull
                public static final sn.l<Type, String> TO_STRING = new sn.l<Type, String>() { // from class: com.yandex.div2.DivText$Image$Accessibility$Type$Converter$TO_STRING$1
                    @Override // sn.l
                    @NotNull
                    public final String invoke(@NotNull DivText.Image.Accessibility.Type type) {
                        return DivText.Image.Accessibility.Type.Converter.b(type);
                    }
                };

                @NotNull
                public static final sn.l<String, Type> FROM_STRING = new sn.l<String, Type>() { // from class: com.yandex.div2.DivText$Image$Accessibility$Type$Converter$FROM_STRING$1
                    @Override // sn.l
                    @Nullable
                    public final DivText.Image.Accessibility.Type invoke(@NotNull String str) {
                        return DivText.Image.Accessibility.Type.Converter.a(str);
                    }
                };

                /* JADX INFO: compiled from: DivText.kt */
                public static final class a {
                    public a() {
                    }

                    public /* synthetic */ a(tn.i iVar) {
                        this();
                    }

                    @Nullable
                    public final Type a(@NotNull String str) {
                        Type type = Type.NONE;
                        if (tn.p.f(str, type.value)) {
                            return type;
                        }
                        Type type2 = Type.BUTTON;
                        if (tn.p.f(str, type2.value)) {
                            return type2;
                        }
                        Type type3 = Type.IMAGE;
                        if (tn.p.f(str, type3.value)) {
                            return type3;
                        }
                        Type type4 = Type.TEXT;
                        if (tn.p.f(str, type4.value)) {
                            return type4;
                        }
                        Type type5 = Type.AUTO;
                        if (tn.p.f(str, type5.value)) {
                            return type5;
                        }
                        return null;
                    }

                    @NotNull
                    public final String b(@NotNull Type type) {
                        return type.value;
                    }
                }

                Type(String str) {
                    this.value = str;
                }
            }

            /* JADX INFO: compiled from: DivText.kt */
            public static final class a {
                public a() {
                }

                public /* synthetic */ a(tn.i iVar) {
                    this();
                }

                @NotNull
                public final Accessibility a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return BuiltInParserKt.getBuiltInParserComponent().j8().getValue().deserialize(parsingEnvironment, jSONObject);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Accessibility() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public Accessibility(@Nullable Expression<String> expression, @NotNull Type type) {
                this.f57679a = expression;
                this.f57680b = type;
            }

            public /* synthetic */ Accessibility(Expression expression, Type type, int i10, tn.i iVar) {
                this((i10 & 1) != 0 ? null : expression, (i10 & 2) != 0 ? f57677e : type);
            }

            public final boolean a(@Nullable Accessibility accessibility, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
                if (accessibility == null) {
                    return false;
                }
                Expression<String> expression = this.f57679a;
                String strEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
                Expression<String> expression2 = accessibility.f57679a;
                return tn.p.f(strEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) && this.f57680b == accessibility.f57680b;
            }

            @Override // com.yandex.div.data.Hashable
            public int hash() {
                Integer num = this.f57681c;
                if (num != null) {
                    return num.intValue();
                }
                int iHashCode = tn.t.b(Accessibility.class).hashCode();
                Expression<String> expression = this.f57679a;
                int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0) + this.f57680b.hashCode();
                this.f57681c = Integer.valueOf(iHashCode2);
                return iHashCode2;
            }

            @Override // com.yandex.div.json.JSONSerializable
            @NotNull
            public JSONObject writeToJSON() {
                return BuiltInParserKt.getBuiltInParserComponent().j8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
            }
        }

        /* JADX INFO: compiled from: DivText.kt */
        public enum IndexingDirection {
            NORMAL("normal"),
            REVERSED("reversed");


            @NotNull
            private final String value;

            @NotNull
            public static final a Converter = new a(null);

            @NotNull
            public static final sn.l<IndexingDirection, String> TO_STRING = new sn.l<IndexingDirection, String>() { // from class: com.yandex.div2.DivText$Image$IndexingDirection$Converter$TO_STRING$1
                @Override // sn.l
                @NotNull
                public final String invoke(@NotNull DivText.Image.IndexingDirection indexingDirection) {
                    return DivText.Image.IndexingDirection.Converter.b(indexingDirection);
                }
            };

            @NotNull
            public static final sn.l<String, IndexingDirection> FROM_STRING = new sn.l<String, IndexingDirection>() { // from class: com.yandex.div2.DivText$Image$IndexingDirection$Converter$FROM_STRING$1
                @Override // sn.l
                @Nullable
                public final DivText.Image.IndexingDirection invoke(@NotNull String str) {
                    return DivText.Image.IndexingDirection.Converter.a(str);
                }
            };

            /* JADX INFO: compiled from: DivText.kt */
            public static final class a {
                public a() {
                }

                public /* synthetic */ a(tn.i iVar) {
                    this();
                }

                @Nullable
                public final IndexingDirection a(@NotNull String str) {
                    IndexingDirection indexingDirection = IndexingDirection.NORMAL;
                    if (tn.p.f(str, indexingDirection.value)) {
                        return indexingDirection;
                    }
                    IndexingDirection indexingDirection2 = IndexingDirection.REVERSED;
                    if (tn.p.f(str, indexingDirection2.value)) {
                        return indexingDirection2;
                    }
                    return null;
                }

                @NotNull
                public final String b(@NotNull IndexingDirection indexingDirection) {
                    return indexingDirection.value;
                }
            }

            IndexingDirection(String str) {
                this.value = str;
            }
        }

        /* JADX INFO: compiled from: DivText.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @NotNull
            public final Image a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().m8().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Expression.Companion companion = Expression.Companion;
            f57658m = Expression.Companion.constant$default(companion, DivTextAlignmentVertical.CENTER, null, 2, null);
            int i10 = 1;
            f57659n = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 20L, null, 2, null), i10, null == true ? 1 : 0);
            f57660o = Expression.Companion.constant$default(companion, IndexingDirection.NORMAL, null, 2, null);
            f57661p = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
            f57662q = Expression.Companion.constant$default(companion, DivBlendMode.SOURCE_IN, null, 2, null);
            f57663r = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 20L, null, 2, null), i10, null == true ? 1 : 0);
            f57664s = new sn.p<ParsingEnvironment, JSONObject, Image>() { // from class: com.yandex.div2.DivText$Image$Companion$CREATOR$1
                @Override // sn.p
                @NotNull
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivText.Image mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return DivText.Image.f57657l.a(parsingEnvironment, jSONObject);
                }
            };
        }

        public Image(@Nullable Accessibility accessibility, @NotNull Expression<DivTextAlignmentVertical> expression, @NotNull DivFixedSize divFixedSize, @NotNull Expression<IndexingDirection> expression2, @NotNull Expression<Boolean> expression3, @NotNull Expression<Long> expression4, @Nullable Expression<Integer> expression5, @NotNull Expression<DivBlendMode> expression6, @NotNull Expression<Uri> expression7, @NotNull DivFixedSize divFixedSize2) {
            this.f57665a = accessibility;
            this.f57666b = expression;
            this.f57667c = divFixedSize;
            this.f57668d = expression2;
            this.f57669e = expression3;
            this.f57670f = expression4;
            this.f57671g = expression5;
            this.f57672h = expression6;
            this.f57673i = expression7;
            this.f57674j = divFixedSize2;
        }

        public final boolean a(@Nullable Image image, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
            if (image == null) {
                return false;
            }
            Accessibility accessibility = this.f57665a;
            if (!(accessibility != null ? accessibility.a(image.f57665a, expressionResolver, expressionResolver2) : image.f57665a == null) || this.f57666b.evaluate(expressionResolver) != image.f57666b.evaluate(expressionResolver2) || !this.f57667c.a(image.f57667c, expressionResolver, expressionResolver2) || this.f57668d.evaluate(expressionResolver) != image.f57668d.evaluate(expressionResolver2) || this.f57669e.evaluate(expressionResolver).booleanValue() != image.f57669e.evaluate(expressionResolver2).booleanValue() || this.f57670f.evaluate(expressionResolver).longValue() != image.f57670f.evaluate(expressionResolver2).longValue()) {
                return false;
            }
            Expression<Integer> expression = this.f57671g;
            Integer numEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
            Expression<Integer> expression2 = image.f57671g;
            return tn.p.f(numEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) && this.f57672h.evaluate(expressionResolver) == image.f57672h.evaluate(expressionResolver2) && tn.p.f(this.f57673i.evaluate(expressionResolver), image.f57673i.evaluate(expressionResolver2)) && this.f57674j.a(image.f57674j, expressionResolver, expressionResolver2);
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f57675k;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = tn.t.b(Image.class).hashCode();
            Accessibility accessibility = this.f57665a;
            int iHash = iHashCode + (accessibility != null ? accessibility.hash() : 0) + this.f57666b.hashCode() + this.f57667c.hash() + this.f57668d.hashCode() + this.f57669e.hashCode() + this.f57670f.hashCode();
            Expression<Integer> expression = this.f57671g;
            int iHashCode2 = iHash + (expression != null ? expression.hashCode() : 0) + this.f57672h.hashCode() + this.f57673i.hashCode() + this.f57674j.hash();
            this.f57675k = Integer.valueOf(iHashCode2);
            return iHashCode2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().m8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivText.kt */
    public static final class Range implements JSONSerializable, Hashable {

        @NotNull
        public static final Expression<Long> A;

        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, Range> B;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        @NotNull
        public static final a f57684x = new a(null);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        @NotNull
        public static final Expression<Double> f57685y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        @NotNull
        public static final Expression<DivSizeUnit> f57686z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final List<DivAction> f57687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Expression<DivTextAlignmentVertical> f57688b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final DivTextRangeBackground f57689c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Expression<Double> f57690d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final DivTextRangeBorder f57691e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final Expression<Long> f57692f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final Expression<String> f57693g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public final Expression<String> f57694h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public final Expression<Long> f57695i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public final Expression<DivSizeUnit> f57696j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public final Expression<JSONObject> f57697k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Nullable
        public final Expression<DivFontWeight> f57698l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @Nullable
        public final Expression<Long> f57699m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @Nullable
        public final Expression<Double> f57700n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @Nullable
        public final Expression<Long> f57701o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @Nullable
        public final DivTextRangeMask f57702p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @NotNull
        public final Expression<Long> f57703q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @Nullable
        public final Expression<DivLineStyle> f57704r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @Nullable
        public final Expression<Integer> f57705s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @Nullable
        public final DivShadow f57706t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @Nullable
        public final Expression<Long> f57707u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @Nullable
        public final Expression<DivLineStyle> f57708v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @Nullable
        public Integer f57709w;

        /* JADX INFO: compiled from: DivText.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @NotNull
            public final Range a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().y8().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        static {
            Expression.Companion companion = Expression.Companion;
            f57685y = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
            f57686z = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
            A = Expression.Companion.constant$default(companion, 0L, null, 2, null);
            B = new sn.p<ParsingEnvironment, JSONObject, Range>() { // from class: com.yandex.div2.DivText$Range$Companion$CREATOR$1
                @Override // sn.p
                @NotNull
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivText.Range mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return DivText.Range.f57684x.a(parsingEnvironment, jSONObject);
                }
            };
        }

        public Range() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null);
        }

        public Range(@Nullable List<DivAction> list, @Nullable Expression<DivTextAlignmentVertical> expression, @Nullable DivTextRangeBackground divTextRangeBackground, @NotNull Expression<Double> expression2, @Nullable DivTextRangeBorder divTextRangeBorder, @Nullable Expression<Long> expression3, @Nullable Expression<String> expression4, @Nullable Expression<String> expression5, @Nullable Expression<Long> expression6, @NotNull Expression<DivSizeUnit> expression7, @Nullable Expression<JSONObject> expression8, @Nullable Expression<DivFontWeight> expression9, @Nullable Expression<Long> expression10, @Nullable Expression<Double> expression11, @Nullable Expression<Long> expression12, @Nullable DivTextRangeMask divTextRangeMask, @NotNull Expression<Long> expression13, @Nullable Expression<DivLineStyle> expression14, @Nullable Expression<Integer> expression15, @Nullable DivShadow divShadow, @Nullable Expression<Long> expression16, @Nullable Expression<DivLineStyle> expression17) {
            this.f57687a = list;
            this.f57688b = expression;
            this.f57689c = divTextRangeBackground;
            this.f57690d = expression2;
            this.f57691e = divTextRangeBorder;
            this.f57692f = expression3;
            this.f57693g = expression4;
            this.f57694h = expression5;
            this.f57695i = expression6;
            this.f57696j = expression7;
            this.f57697k = expression8;
            this.f57698l = expression9;
            this.f57699m = expression10;
            this.f57700n = expression11;
            this.f57701o = expression12;
            this.f57702p = divTextRangeMask;
            this.f57703q = expression13;
            this.f57704r = expression14;
            this.f57705s = expression15;
            this.f57706t = divShadow;
            this.f57707u = expression16;
            this.f57708v = expression17;
        }

        public /* synthetic */ Range(List list, Expression expression, DivTextRangeBackground divTextRangeBackground, Expression expression2, DivTextRangeBorder divTextRangeBorder, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, Expression expression9, Expression expression10, Expression expression11, Expression expression12, DivTextRangeMask divTextRangeMask, Expression expression13, Expression expression14, Expression expression15, DivShadow divShadow, Expression expression16, Expression expression17, int i10, tn.i iVar) {
            this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : expression, (i10 & 4) != 0 ? null : divTextRangeBackground, (i10 & 8) != 0 ? f57685y : expression2, (i10 & 16) != 0 ? null : divTextRangeBorder, (i10 & 32) != 0 ? null : expression3, (i10 & 64) != 0 ? null : expression4, (i10 & 128) != 0 ? null : expression5, (i10 & 256) != 0 ? null : expression6, (i10 & 512) != 0 ? f57686z : expression7, (i10 & 1024) != 0 ? null : expression8, (i10 & 2048) != 0 ? null : expression9, (i10 & 4096) != 0 ? null : expression10, (i10 & 8192) != 0 ? null : expression11, (i10 & 16384) != 0 ? null : expression12, (i10 & 32768) != 0 ? null : divTextRangeMask, (i10 & 65536) != 0 ? A : expression13, (i10 & 131072) != 0 ? null : expression14, (i10 & 262144) != 0 ? null : expression15, (i10 & 524288) != 0 ? null : divShadow, (i10 & 1048576) != 0 ? null : expression16, (i10 & 2097152) != 0 ? null : expression17);
        }

        public final boolean a(@Nullable Range range, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
            boolean z10;
            if (range == null) {
                return false;
            }
            List<DivAction> list = this.f57687a;
            if (list != null) {
                List<DivAction> list2 = range.f57687a;
                if (list2 != null) {
                    if (list.size() == list2.size()) {
                        int i10 = 0;
                        for (Object obj : list) {
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                cn.w.w();
                            }
                            if (((DivAction) obj).a(list2.get(i10), expressionResolver, expressionResolver2)) {
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
            if (range.f57687a != null) {
                z10 = false;
                break;
            }
            z10 = true;
            if (!z10) {
                return false;
            }
            Expression<DivTextAlignmentVertical> expression = this.f57688b;
            DivTextAlignmentVertical divTextAlignmentVerticalEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
            Expression<DivTextAlignmentVertical> expression2 = range.f57688b;
            if (divTextAlignmentVerticalEvaluate != (expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
                return false;
            }
            DivTextRangeBackground divTextRangeBackground = this.f57689c;
            if (!(divTextRangeBackground != null ? divTextRangeBackground.a(range.f57689c, expressionResolver, expressionResolver2) : range.f57689c == null)) {
                return false;
            }
            if (!(this.f57690d.evaluate(expressionResolver).doubleValue() == range.f57690d.evaluate(expressionResolver2).doubleValue())) {
                return false;
            }
            DivTextRangeBorder divTextRangeBorder = this.f57691e;
            if (!(divTextRangeBorder != null ? divTextRangeBorder.a(range.f57691e, expressionResolver, expressionResolver2) : range.f57691e == null)) {
                return false;
            }
            Expression<Long> expression3 = this.f57692f;
            Long lEvaluate = expression3 != null ? expression3.evaluate(expressionResolver) : null;
            Expression<Long> expression4 = range.f57692f;
            if (!tn.p.f(lEvaluate, expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<String> expression5 = this.f57693g;
            String strEvaluate = expression5 != null ? expression5.evaluate(expressionResolver) : null;
            Expression<String> expression6 = range.f57693g;
            if (!tn.p.f(strEvaluate, expression6 != null ? expression6.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<String> expression7 = this.f57694h;
            String strEvaluate2 = expression7 != null ? expression7.evaluate(expressionResolver) : null;
            Expression<String> expression8 = range.f57694h;
            if (!tn.p.f(strEvaluate2, expression8 != null ? expression8.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<Long> expression9 = this.f57695i;
            Long lEvaluate2 = expression9 != null ? expression9.evaluate(expressionResolver) : null;
            Expression<Long> expression10 = range.f57695i;
            if (!tn.p.f(lEvaluate2, expression10 != null ? expression10.evaluate(expressionResolver2) : null) || this.f57696j.evaluate(expressionResolver) != range.f57696j.evaluate(expressionResolver2)) {
                return false;
            }
            Expression<JSONObject> expression11 = this.f57697k;
            JSONObject jSONObjectEvaluate = expression11 != null ? expression11.evaluate(expressionResolver) : null;
            Expression<JSONObject> expression12 = range.f57697k;
            if (!tn.p.f(jSONObjectEvaluate, expression12 != null ? expression12.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<DivFontWeight> expression13 = this.f57698l;
            DivFontWeight divFontWeightEvaluate = expression13 != null ? expression13.evaluate(expressionResolver) : null;
            Expression<DivFontWeight> expression14 = range.f57698l;
            if (divFontWeightEvaluate != (expression14 != null ? expression14.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<Long> expression15 = this.f57699m;
            Long lEvaluate3 = expression15 != null ? expression15.evaluate(expressionResolver) : null;
            Expression<Long> expression16 = range.f57699m;
            if (!tn.p.f(lEvaluate3, expression16 != null ? expression16.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<Double> expression17 = this.f57700n;
            Double dEvaluate = expression17 != null ? expression17.evaluate(expressionResolver) : null;
            Expression<Double> expression18 = range.f57700n;
            if (!tn.p.c(dEvaluate, expression18 != null ? expression18.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<Long> expression19 = this.f57701o;
            Long lEvaluate4 = expression19 != null ? expression19.evaluate(expressionResolver) : null;
            Expression<Long> expression20 = range.f57701o;
            if (!tn.p.f(lEvaluate4, expression20 != null ? expression20.evaluate(expressionResolver2) : null)) {
                return false;
            }
            DivTextRangeMask divTextRangeMask = this.f57702p;
            if (!(divTextRangeMask != null ? divTextRangeMask.a(range.f57702p, expressionResolver, expressionResolver2) : range.f57702p == null) || this.f57703q.evaluate(expressionResolver).longValue() != range.f57703q.evaluate(expressionResolver2).longValue()) {
                return false;
            }
            Expression<DivLineStyle> expression21 = this.f57704r;
            DivLineStyle divLineStyleEvaluate = expression21 != null ? expression21.evaluate(expressionResolver) : null;
            Expression<DivLineStyle> expression22 = range.f57704r;
            if (divLineStyleEvaluate != (expression22 != null ? expression22.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<Integer> expression23 = this.f57705s;
            Integer numEvaluate = expression23 != null ? expression23.evaluate(expressionResolver) : null;
            Expression<Integer> expression24 = range.f57705s;
            if (!tn.p.f(numEvaluate, expression24 != null ? expression24.evaluate(expressionResolver2) : null)) {
                return false;
            }
            DivShadow divShadow = this.f57706t;
            if (!(divShadow != null ? divShadow.a(range.f57706t, expressionResolver, expressionResolver2) : range.f57706t == null)) {
                return false;
            }
            Expression<Long> expression25 = this.f57707u;
            Long lEvaluate5 = expression25 != null ? expression25.evaluate(expressionResolver) : null;
            Expression<Long> expression26 = range.f57707u;
            if (!tn.p.f(lEvaluate5, expression26 != null ? expression26.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<DivLineStyle> expression27 = this.f57708v;
            DivLineStyle divLineStyleEvaluate2 = expression27 != null ? expression27.evaluate(expressionResolver) : null;
            Expression<DivLineStyle> expression28 = range.f57708v;
            return divLineStyleEvaluate2 == (expression28 != null ? expression28.evaluate(expressionResolver2) : null);
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            int iHash;
            Integer num = this.f57709w;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = tn.t.b(Range.class).hashCode();
            List<DivAction> list = this.f57687a;
            if (list != null) {
                Iterator<T> it = list.iterator();
                iHash = 0;
                while (it.hasNext()) {
                    iHash += ((DivAction) it.next()).hash();
                }
            } else {
                iHash = 0;
            }
            int i10 = iHashCode + iHash;
            Expression<DivTextAlignmentVertical> expression = this.f57688b;
            int iHashCode2 = i10 + (expression != null ? expression.hashCode() : 0);
            DivTextRangeBackground divTextRangeBackground = this.f57689c;
            int iHash2 = iHashCode2 + (divTextRangeBackground != null ? divTextRangeBackground.hash() : 0) + this.f57690d.hashCode();
            DivTextRangeBorder divTextRangeBorder = this.f57691e;
            int iHash3 = iHash2 + (divTextRangeBorder != null ? divTextRangeBorder.hash() : 0);
            Expression<Long> expression2 = this.f57692f;
            int iHashCode3 = iHash3 + (expression2 != null ? expression2.hashCode() : 0);
            Expression<String> expression3 = this.f57693g;
            int iHashCode4 = iHashCode3 + (expression3 != null ? expression3.hashCode() : 0);
            Expression<String> expression4 = this.f57694h;
            int iHashCode5 = iHashCode4 + (expression4 != null ? expression4.hashCode() : 0);
            Expression<Long> expression5 = this.f57695i;
            int iHashCode6 = iHashCode5 + (expression5 != null ? expression5.hashCode() : 0) + this.f57696j.hashCode();
            Expression<JSONObject> expression6 = this.f57697k;
            int iHashCode7 = iHashCode6 + (expression6 != null ? expression6.hashCode() : 0);
            Expression<DivFontWeight> expression7 = this.f57698l;
            int iHashCode8 = iHashCode7 + (expression7 != null ? expression7.hashCode() : 0);
            Expression<Long> expression8 = this.f57699m;
            int iHashCode9 = iHashCode8 + (expression8 != null ? expression8.hashCode() : 0);
            Expression<Double> expression9 = this.f57700n;
            int iHashCode10 = iHashCode9 + (expression9 != null ? expression9.hashCode() : 0);
            Expression<Long> expression10 = this.f57701o;
            int iHashCode11 = iHashCode10 + (expression10 != null ? expression10.hashCode() : 0);
            DivTextRangeMask divTextRangeMask = this.f57702p;
            int iHash4 = iHashCode11 + (divTextRangeMask != null ? divTextRangeMask.hash() : 0) + this.f57703q.hashCode();
            Expression<DivLineStyle> expression11 = this.f57704r;
            int iHashCode12 = iHash4 + (expression11 != null ? expression11.hashCode() : 0);
            Expression<Integer> expression12 = this.f57705s;
            int iHashCode13 = iHashCode12 + (expression12 != null ? expression12.hashCode() : 0);
            DivShadow divShadow = this.f57706t;
            int iHash5 = iHashCode13 + (divShadow != null ? divShadow.hash() : 0);
            Expression<Long> expression13 = this.f57707u;
            int iHashCode14 = iHash5 + (expression13 != null ? expression13.hashCode() : 0);
            Expression<DivLineStyle> expression14 = this.f57708v;
            int iHashCode15 = iHashCode14 + (expression14 != null ? expression14.hashCode() : 0);
            this.f57709w = Integer.valueOf(iHashCode15);
            return iHashCode15;
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().y8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivText.kt */
    public enum Truncate {
        NONE("none"),
        START("start"),
        END("end"),
        MIDDLE("middle");


        @NotNull
        private final String value;

        @NotNull
        public static final a Converter = new a(null);

        @NotNull
        public static final sn.l<Truncate, String> TO_STRING = new sn.l<Truncate, String>() { // from class: com.yandex.div2.DivText$Truncate$Converter$TO_STRING$1
            @Override // sn.l
            @NotNull
            public final String invoke(@NotNull DivText.Truncate truncate) {
                return DivText.Truncate.Converter.b(truncate);
            }
        };

        @NotNull
        public static final sn.l<String, Truncate> FROM_STRING = new sn.l<String, Truncate>() { // from class: com.yandex.div2.DivText$Truncate$Converter$FROM_STRING$1
            @Override // sn.l
            @Nullable
            public final DivText.Truncate invoke(@NotNull String str) {
                return DivText.Truncate.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivText.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @Nullable
            public final Truncate a(@NotNull String str) {
                Truncate truncate = Truncate.NONE;
                if (tn.p.f(str, truncate.value)) {
                    return truncate;
                }
                Truncate truncate2 = Truncate.START;
                if (tn.p.f(str, truncate2.value)) {
                    return truncate2;
                }
                Truncate truncate3 = Truncate.END;
                if (tn.p.f(str, truncate3.value)) {
                    return truncate3;
                }
                Truncate truncate4 = Truncate.MIDDLE;
                if (tn.p.f(str, truncate4.value)) {
                    return truncate4;
                }
                return null;
            }

            @NotNull
            public final String b(@NotNull Truncate truncate) {
                return truncate.value;
            }
        }

        Truncate(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: DivText.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivText a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().p8().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.Companion;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f57599t0 = new DivAnimation(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f57600u0 = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f57601v0 = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f57602w0 = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        f57603x0 = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
        f57604y0 = new DivSize.d(new DivWrapContentSize(null, null, null == true ? 1 : 0, 7, null));
        f57605z0 = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        Boolean bool = Boolean.FALSE;
        A0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        DivLineStyle divLineStyle = DivLineStyle.NONE;
        B0 = Expression.Companion.constant$default(companion, divLineStyle, null, 2, null);
        C0 = Expression.Companion.constant$default(companion, DivAlignmentHorizontal.START, null, 2, null);
        D0 = Expression.Companion.constant$default(companion, DivAlignmentVertical.TOP, null, 2, null);
        E0 = Expression.Companion.constant$default(companion, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), null, 2, null);
        F0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        G0 = Expression.Companion.constant$default(companion, Truncate.END, null, 2, null);
        H0 = Expression.Companion.constant$default(companion, divLineStyle, null, 2, null);
        I0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        J0 = new DivSize.c(new DivMatchParentSize(null, null, null == true ? 1 : 0, 7, null));
        K0 = new sn.p<ParsingEnvironment, JSONObject, DivText>() { // from class: com.yandex.div2.DivText$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivText mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivText.f57598s0.a(parsingEnvironment, jSONObject);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivText(@Nullable DivAccessibility divAccessibility, @Nullable DivAction divAction, @NotNull DivAnimation divAnimation, @Nullable List<DivAction> list, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> expression3, @Nullable List<? extends DivAnimator> list2, @Nullable Expression<Boolean> expression4, @Nullable List<? extends DivBackground> list3, @Nullable DivBorder divBorder, @NotNull Expression<Boolean> expression5, @Nullable Expression<Long> expression6, @Nullable List<DivDisappearAction> list4, @Nullable List<DivAction> list5, @Nullable Ellipsis ellipsis, @Nullable List<DivExtension> list6, @Nullable DivFocus divFocus, @Nullable Expression<Integer> expression7, @Nullable Expression<String> expression8, @Nullable Expression<String> expression9, @NotNull Expression<Long> expression10, @NotNull Expression<DivSizeUnit> expression11, @Nullable Expression<JSONObject> expression12, @Nullable Expression<DivFontWeight> expression13, @Nullable Expression<Long> expression14, @Nullable List<DivFunction> list7, @NotNull DivSize divSize, @Nullable List<DivAction> list8, @Nullable List<DivAction> list9, @Nullable String str, @Nullable List<Image> list10, @Nullable DivLayoutProvider divLayoutProvider, @NotNull Expression<Double> expression15, @Nullable Expression<Long> expression16, @Nullable List<DivAction> list11, @Nullable DivEdgeInsets divEdgeInsets, @Nullable Expression<Long> expression17, @Nullable Expression<Long> expression18, @Nullable DivEdgeInsets divEdgeInsets2, @Nullable List<DivAction> list12, @Nullable List<DivAction> list13, @Nullable List<Range> list14, @Nullable Expression<String> expression19, @Nullable Expression<Long> expression20, @NotNull Expression<Boolean> expression21, @Nullable List<DivAction> list15, @NotNull Expression<DivLineStyle> expression22, @NotNull Expression<String> expression23, @NotNull Expression<DivAlignmentHorizontal> expression24, @NotNull Expression<DivAlignmentVertical> expression25, @NotNull Expression<Integer> expression26, @Nullable DivTextGradient divTextGradient, @Nullable DivShadow divShadow, @NotNull Expression<Boolean> expression27, @Nullable List<DivTooltip> list16, @Nullable DivTransform divTransform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list17, @NotNull Expression<Truncate> expression28, @NotNull Expression<DivLineStyle> expression29, @Nullable List<DivTrigger> list18, @Nullable List<? extends DivVariable> list19, @NotNull Expression<DivVisibility> expression30, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<DivVisibilityAction> list20, @NotNull DivSize divSize2) {
        this.f57606a = divAccessibility;
        this.f57608b = divAction;
        this.f57610c = divAnimation;
        this.f57612d = list;
        this.f57614e = expression;
        this.f57616f = expression2;
        this.f57618g = expression3;
        this.f57620h = list2;
        this.f57622i = expression4;
        this.f57624j = list3;
        this.f57626k = divBorder;
        this.f57628l = expression5;
        this.f57630m = expression6;
        this.f57632n = list4;
        this.f57634o = list5;
        this.f57636p = ellipsis;
        this.f57638q = list6;
        this.f57640r = divFocus;
        this.f57642s = expression7;
        this.f57643t = expression8;
        this.f57644u = expression9;
        this.f57645v = expression10;
        this.f57646w = expression11;
        this.f57647x = expression12;
        this.f57648y = expression13;
        this.f57649z = expression14;
        this.A = list7;
        this.B = divSize;
        this.C = list8;
        this.D = list9;
        this.E = str;
        this.F = list10;
        this.G = divLayoutProvider;
        this.H = expression15;
        this.I = expression16;
        this.J = list11;
        this.K = divEdgeInsets;
        this.L = expression17;
        this.M = expression18;
        this.N = divEdgeInsets2;
        this.O = list12;
        this.P = list13;
        this.Q = list14;
        this.R = expression19;
        this.S = expression20;
        this.T = expression21;
        this.U = list15;
        this.V = expression22;
        this.W = expression23;
        this.X = expression24;
        this.Y = expression25;
        this.Z = expression26;
        this.f57607a0 = divTextGradient;
        this.f57609b0 = divShadow;
        this.f57611c0 = expression27;
        this.f57613d0 = list16;
        this.f57615e0 = divTransform;
        this.f57617f0 = divChangeTransition;
        this.f57619g0 = divAppearanceTransition;
        this.f57621h0 = divAppearanceTransition2;
        this.f57623i0 = list17;
        this.f57625j0 = expression28;
        this.f57627k0 = expression29;
        this.f57629l0 = list18;
        this.f57631m0 = list19;
        this.f57633n0 = expression30;
        this.f57635o0 = divVisibilityAction;
        this.f57637p0 = list20;
        this.f57639q0 = divSize2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivText z(DivText divText, DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List list, Expression expression, Expression expression2, Expression expression3, List list2, Expression expression4, List list3, DivBorder divBorder, Expression expression5, Expression expression6, List list4, List list5, Ellipsis ellipsis, List list6, DivFocus divFocus, Expression expression7, Expression expression8, Expression expression9, Expression expression10, Expression expression11, Expression expression12, Expression expression13, Expression expression14, List list7, DivSize divSize, List list8, List list9, String str, List list10, DivLayoutProvider divLayoutProvider, Expression expression15, Expression expression16, List list11, DivEdgeInsets divEdgeInsets, Expression expression17, Expression expression18, DivEdgeInsets divEdgeInsets2, List list12, List list13, List list14, Expression expression19, Expression expression20, Expression expression21, List list15, Expression expression22, Expression expression23, Expression expression24, Expression expression25, Expression expression26, DivTextGradient divTextGradient, DivShadow divShadow, Expression expression27, List list16, DivTransform divTransform, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list17, Expression expression28, Expression expression29, List list18, List list19, Expression expression30, DivVisibilityAction divVisibilityAction, List list20, DivSize divSize2, int i10, int i11, int i12, Object obj) {
        DivAccessibility divAccessibilityO = (i10 & 1) != 0 ? divText.o() : divAccessibility;
        DivAction divAction2 = (i10 & 2) != 0 ? divText.f57608b : divAction;
        DivAnimation divAnimation2 = (i10 & 4) != 0 ? divText.f57610c : divAnimation;
        List list21 = (i10 & 8) != 0 ? divText.f57612d : list;
        Expression expressionG = (i10 & 16) != 0 ? divText.g() : expression;
        Expression expressionM = (i10 & 32) != 0 ? divText.m() : expression2;
        Expression alpha = (i10 & 64) != 0 ? divText.getAlpha() : expression3;
        List listW = (i10 & 128) != 0 ? divText.w() : list2;
        Expression expression31 = (i10 & 256) != 0 ? divText.f57622i : expression4;
        List background = (i10 & 512) != 0 ? divText.getBackground() : list3;
        DivBorder divBorderX = (i10 & 1024) != 0 ? divText.x() : divBorder;
        Expression expression32 = (i10 & 2048) != 0 ? divText.f57628l : expression5;
        Expression expressionB = (i10 & 4096) != 0 ? divText.b() : expression6;
        List listK = (i10 & 8192) != 0 ? divText.k() : list4;
        List list22 = (i10 & 16384) != 0 ? divText.f57634o : list5;
        Ellipsis ellipsis2 = (i10 & 32768) != 0 ? divText.f57636p : ellipsis;
        List extensions = (i10 & 65536) != 0 ? divText.getExtensions() : list6;
        DivFocus divFocusN = (i10 & 131072) != 0 ? divText.n() : divFocus;
        Ellipsis ellipsis3 = ellipsis2;
        Expression expression33 = (i10 & 262144) != 0 ? divText.f57642s : expression7;
        Expression expression34 = (i10 & 524288) != 0 ? divText.f57643t : expression8;
        Expression expression35 = (i10 & 1048576) != 0 ? divText.f57644u : expression9;
        Expression expression36 = (i10 & 2097152) != 0 ? divText.f57645v : expression10;
        Expression expression37 = (i10 & 4194304) != 0 ? divText.f57646w : expression11;
        Expression expression38 = (i10 & 8388608) != 0 ? divText.f57647x : expression12;
        Expression expression39 = (i10 & 16777216) != 0 ? divText.f57648y : expression13;
        Expression expression40 = (i10 & 33554432) != 0 ? divText.f57649z : expression14;
        List listU = (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divText.u() : list7;
        DivSize height = (i10 & 134217728) != 0 ? divText.getHeight() : divSize;
        Expression expression41 = expression40;
        List list23 = (i10 & 268435456) != 0 ? divText.C : list8;
        List list24 = (i10 & 536870912) != 0 ? divText.D : list9;
        String id2 = (i10 & 1073741824) != 0 ? divText.getId() : str;
        List list25 = (i10 & Integer.MIN_VALUE) != 0 ? divText.F : list10;
        DivLayoutProvider divLayoutProviderR = (i11 & 1) != 0 ? divText.r() : divLayoutProvider;
        List list26 = list25;
        Expression expression42 = (i11 & 2) != 0 ? divText.H : expression15;
        Expression expression43 = (i11 & 4) != 0 ? divText.I : expression16;
        List list27 = (i11 & 8) != 0 ? divText.J : list11;
        return divText.y(divAccessibilityO, divAction2, divAnimation2, list21, expressionG, expressionM, alpha, listW, expression31, background, divBorderX, expression32, expressionB, listK, list22, ellipsis3, extensions, divFocusN, expression33, expression34, expression35, expression36, expression37, expression38, expression39, expression41, listU, height, list23, list24, id2, list26, divLayoutProviderR, expression42, expression43, list27, (i11 & 16) != 0 ? divText.d() : divEdgeInsets, (i11 & 32) != 0 ? divText.L : expression17, (i11 & 64) != 0 ? divText.M : expression18, (i11 & 128) != 0 ? divText.p() : divEdgeInsets2, (i11 & 256) != 0 ? divText.O : list12, (i11 & 512) != 0 ? divText.P : list13, (i11 & 1024) != 0 ? divText.Q : list14, (i11 & 2048) != 0 ? divText.f() : expression19, (i11 & 4096) != 0 ? divText.e() : expression20, (i11 & 8192) != 0 ? divText.T : expression21, (i11 & 16384) != 0 ? divText.q() : list15, (i11 & 32768) != 0 ? divText.V : expression22, (i11 & 65536) != 0 ? divText.W : expression23, (i11 & 131072) != 0 ? divText.X : expression24, (i11 & 262144) != 0 ? divText.Y : expression25, (i11 & 524288) != 0 ? divText.Z : expression26, (i11 & 1048576) != 0 ? divText.f57607a0 : divTextGradient, (i11 & 2097152) != 0 ? divText.f57609b0 : divShadow, (i11 & 4194304) != 0 ? divText.f57611c0 : expression27, (i11 & 8388608) != 0 ? divText.h() : list16, (i11 & 16777216) != 0 ? divText.getTransform() : divTransform, (i11 & 33554432) != 0 ? divText.j() : divChangeTransition, (i11 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divText.v() : divAppearanceTransition, (i11 & 134217728) != 0 ? divText.i() : divAppearanceTransition2, (i11 & 268435456) != 0 ? divText.l() : list17, (i11 & 536870912) != 0 ? divText.f57625j0 : expression28, (i11 & 1073741824) != 0 ? divText.f57627k0 : expression29, (i11 & Integer.MIN_VALUE) != 0 ? divText.s() : list18, (i12 & 1) != 0 ? divText.c() : list19, (i12 & 2) != 0 ? divText.getVisibility() : expression30, (i12 & 4) != 0 ? divText.t() : divVisibilityAction, (i12 & 8) != 0 ? divText.a() : list20, (i12 & 16) != 0 ? divText.getWidth() : divSize2);
    }

    public final boolean A(@Nullable DivText divText, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
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
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        if (divText == null) {
            return false;
        }
        DivAccessibility divAccessibilityO = o();
        if (!(divAccessibilityO != null ? divAccessibilityO.a(divText.o(), expressionResolver, expressionResolver2) : divText.o() == null)) {
            return false;
        }
        DivAction divAction = this.f57608b;
        if (!(divAction != null ? divAction.a(divText.f57608b, expressionResolver, expressionResolver2) : divText.f57608b == null) || !this.f57610c.a(divText.f57610c, expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivAction> list = this.f57612d;
        if (list != null) {
            List<DivAction> list2 = divText.f57612d;
            if (list2 != null) {
                if (list.size() == list2.size()) {
                    int i10 = 0;
                    for (Object obj : list) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            cn.w.w();
                        }
                        if (((DivAction) obj).a(list2.get(i10), expressionResolver, expressionResolver2)) {
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
        if (divText.f57612d != null) {
            z10 = false;
            break;
        }
        z10 = true;
        if (!z10) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expressionG = g();
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate = expressionG != null ? expressionG.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expressionG2 = divText.g();
        if (divAlignmentHorizontalEvaluate != (expressionG2 != null ? expressionG2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expressionM = m();
        DivAlignmentVertical divAlignmentVerticalEvaluate = expressionM != null ? expressionM.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expressionM2 = divText.m();
        if (divAlignmentVerticalEvaluate != (expressionM2 != null ? expressionM2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(getAlpha().evaluate(expressionResolver).doubleValue() == divText.getAlpha().evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<DivAnimator> listW = w();
        if (listW != null) {
            List<DivAnimator> listW2 = divText.w();
            if (listW2 != null) {
                if (listW.size() == listW2.size()) {
                    int i12 = 0;
                    for (Object obj2 : listW) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            cn.w.w();
                        }
                        if (((DivAnimator) obj2).a(listW2.get(i12), expressionResolver, expressionResolver2)) {
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
        if (divText.w() != null) {
            z11 = false;
            break;
        }
        z11 = true;
        if (!z11) {
            return false;
        }
        Expression<Boolean> expression = this.f57622i;
        Boolean boolEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Boolean> expression2 = divText.f57622i;
        if (!tn.p.f(boolEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivBackground> background = getBackground();
        if (background != null) {
            List<DivBackground> background2 = divText.getBackground();
            if (background2 != null) {
                if (background.size() == background2.size()) {
                    int i14 = 0;
                    for (Object obj3 : background) {
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            cn.w.w();
                        }
                        if (((DivBackground) obj3).a(background2.get(i14), expressionResolver, expressionResolver2)) {
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
        if (divText.getBackground() != null) {
            z12 = false;
            break;
        }
        z12 = true;
        if (!z12) {
            return false;
        }
        DivBorder divBorderX = x();
        if (!(divBorderX != null ? divBorderX.a(divText.x(), expressionResolver, expressionResolver2) : divText.x() == null) || this.f57628l.evaluate(expressionResolver).booleanValue() != divText.f57628l.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        Expression<Long> expressionB = b();
        Long lEvaluate = expressionB != null ? expressionB.evaluate(expressionResolver) : null;
        Expression<Long> expressionB2 = divText.b();
        if (!tn.p.f(lEvaluate, expressionB2 != null ? expressionB2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            List<DivDisappearAction> listK2 = divText.k();
            if (listK2 != null) {
                if (listK.size() == listK2.size()) {
                    int i16 = 0;
                    for (Object obj4 : listK) {
                        int i17 = i16 + 1;
                        if (i16 < 0) {
                            cn.w.w();
                        }
                        if (((DivDisappearAction) obj4).g(listK2.get(i16), expressionResolver, expressionResolver2)) {
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
        if (divText.k() != null) {
            z13 = false;
            break;
        }
        z13 = true;
        if (!z13) {
            return false;
        }
        List<DivAction> list3 = this.f57634o;
        if (list3 != null) {
            List<DivAction> list4 = divText.f57634o;
            if (list4 != null) {
                if (list3.size() == list4.size()) {
                    int i18 = 0;
                    for (Object obj5 : list3) {
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            cn.w.w();
                        }
                        if (((DivAction) obj5).a(list4.get(i18), expressionResolver, expressionResolver2)) {
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
        if (divText.f57634o != null) {
            z14 = false;
            break;
        }
        z14 = true;
        if (!z14) {
            return false;
        }
        Ellipsis ellipsis = this.f57636p;
        if (!(ellipsis != null ? ellipsis.a(divText.f57636p, expressionResolver, expressionResolver2) : divText.f57636p == null)) {
            return false;
        }
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            List<DivExtension> extensions2 = divText.getExtensions();
            if (extensions2 != null) {
                if (extensions.size() == extensions2.size()) {
                    int i20 = 0;
                    for (Object obj6 : extensions) {
                        int i21 = i20 + 1;
                        if (i20 < 0) {
                            cn.w.w();
                        }
                        if (((DivExtension) obj6).a(extensions2.get(i20), expressionResolver, expressionResolver2)) {
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
        if (divText.getExtensions() != null) {
            z15 = false;
            break;
        }
        z15 = true;
        if (!z15) {
            return false;
        }
        DivFocus divFocusN = n();
        if (!(divFocusN != null ? divFocusN.a(divText.n(), expressionResolver, expressionResolver2) : divText.n() == null)) {
            return false;
        }
        Expression<Integer> expression3 = this.f57642s;
        Integer numEvaluate = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        Expression<Integer> expression4 = divText.f57642s;
        if (!tn.p.f(numEvaluate, expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<String> expression5 = this.f57643t;
        String strEvaluate = expression5 != null ? expression5.evaluate(expressionResolver) : null;
        Expression<String> expression6 = divText.f57643t;
        if (!tn.p.f(strEvaluate, expression6 != null ? expression6.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<String> expression7 = this.f57644u;
        String strEvaluate2 = expression7 != null ? expression7.evaluate(expressionResolver) : null;
        Expression<String> expression8 = divText.f57644u;
        if (!tn.p.f(strEvaluate2, expression8 != null ? expression8.evaluate(expressionResolver2) : null) || this.f57645v.evaluate(expressionResolver).longValue() != divText.f57645v.evaluate(expressionResolver2).longValue() || this.f57646w.evaluate(expressionResolver) != divText.f57646w.evaluate(expressionResolver2)) {
            return false;
        }
        Expression<JSONObject> expression9 = this.f57647x;
        JSONObject jSONObjectEvaluate = expression9 != null ? expression9.evaluate(expressionResolver) : null;
        Expression<JSONObject> expression10 = divText.f57647x;
        if (!tn.p.f(jSONObjectEvaluate, expression10 != null ? expression10.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivFontWeight> expression11 = this.f57648y;
        DivFontWeight divFontWeightEvaluate = expression11 != null ? expression11.evaluate(expressionResolver) : null;
        Expression<DivFontWeight> expression12 = divText.f57648y;
        if (divFontWeightEvaluate != (expression12 != null ? expression12.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expression13 = this.f57649z;
        Long lEvaluate2 = expression13 != null ? expression13.evaluate(expressionResolver) : null;
        Expression<Long> expression14 = divText.f57649z;
        if (!tn.p.f(lEvaluate2, expression14 != null ? expression14.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivFunction> listU = u();
        if (listU != null) {
            List<DivFunction> listU2 = divText.u();
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
        if (divText.u() != null) {
            z16 = false;
            break;
        }
        z16 = true;
        if (!z16 || !getHeight().a(divText.getHeight(), expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivAction> list5 = this.C;
        if (list5 != null) {
            List<DivAction> list6 = divText.C;
            if (list6 != null) {
                if (list5.size() == list6.size()) {
                    int i24 = 0;
                    for (Object obj8 : list5) {
                        int i25 = i24 + 1;
                        if (i24 < 0) {
                            cn.w.w();
                        }
                        if (((DivAction) obj8).a(list6.get(i24), expressionResolver, expressionResolver2)) {
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
        if (divText.C != null) {
            z17 = false;
            break;
        }
        z17 = true;
        if (!z17) {
            return false;
        }
        List<DivAction> list7 = this.D;
        if (list7 != null) {
            List<DivAction> list8 = divText.D;
            if (list8 != null) {
                if (list7.size() == list8.size()) {
                    int i26 = 0;
                    for (Object obj9 : list7) {
                        int i27 = i26 + 1;
                        if (i26 < 0) {
                            cn.w.w();
                        }
                        if (((DivAction) obj9).a(list8.get(i26), expressionResolver, expressionResolver2)) {
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
        if (divText.D != null) {
            z18 = false;
            break;
        }
        z18 = true;
        if (!z18 || !tn.p.f(getId(), divText.getId())) {
            return false;
        }
        List<Image> list9 = this.F;
        if (list9 != null) {
            List<Image> list10 = divText.F;
            if (list10 != null) {
                if (list9.size() == list10.size()) {
                    int i28 = 0;
                    for (Object obj10 : list9) {
                        int i29 = i28 + 1;
                        if (i28 < 0) {
                            cn.w.w();
                        }
                        if (((Image) obj10).a(list10.get(i28), expressionResolver, expressionResolver2)) {
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
        if (divText.F != null) {
            z19 = false;
            break;
        }
        z19 = true;
        if (!z19) {
            return false;
        }
        DivLayoutProvider divLayoutProviderR = r();
        if (!(divLayoutProviderR != null ? divLayoutProviderR.a(divText.r(), expressionResolver, expressionResolver2) : divText.r() == null)) {
            return false;
        }
        if (!(this.H.evaluate(expressionResolver).doubleValue() == divText.H.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        Expression<Long> expression15 = this.I;
        Long lEvaluate3 = expression15 != null ? expression15.evaluate(expressionResolver) : null;
        Expression<Long> expression16 = divText.I;
        if (!tn.p.f(lEvaluate3, expression16 != null ? expression16.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivAction> list11 = this.J;
        if (list11 != null) {
            List<DivAction> list12 = divText.J;
            if (list12 != null) {
                if (list11.size() == list12.size()) {
                    int i30 = 0;
                    for (Object obj11 : list11) {
                        int i31 = i30 + 1;
                        if (i30 < 0) {
                            cn.w.w();
                        }
                        if (((DivAction) obj11).a(list12.get(i30), expressionResolver, expressionResolver2)) {
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
        if (divText.J != null) {
            z20 = false;
            break;
        }
        z20 = true;
        if (!z20) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsD = d();
        if (!(divEdgeInsetsD != null ? divEdgeInsetsD.a(divText.d(), expressionResolver, expressionResolver2) : divText.d() == null)) {
            return false;
        }
        Expression<Long> expression17 = this.L;
        Long lEvaluate4 = expression17 != null ? expression17.evaluate(expressionResolver) : null;
        Expression<Long> expression18 = divText.L;
        if (!tn.p.f(lEvaluate4, expression18 != null ? expression18.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expression19 = this.M;
        Long lEvaluate5 = expression19 != null ? expression19.evaluate(expressionResolver) : null;
        Expression<Long> expression20 = divText.M;
        if (!tn.p.f(lEvaluate5, expression20 != null ? expression20.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivEdgeInsets divEdgeInsetsP = p();
        if (!(divEdgeInsetsP != null ? divEdgeInsetsP.a(divText.p(), expressionResolver, expressionResolver2) : divText.p() == null)) {
            return false;
        }
        List<DivAction> list13 = this.O;
        if (list13 != null) {
            List<DivAction> list14 = divText.O;
            if (list14 != null) {
                if (list13.size() == list14.size()) {
                    int i32 = 0;
                    for (Object obj12 : list13) {
                        int i33 = i32 + 1;
                        if (i32 < 0) {
                            cn.w.w();
                        }
                        if (((DivAction) obj12).a(list14.get(i32), expressionResolver, expressionResolver2)) {
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
        if (divText.O != null) {
            z21 = false;
            break;
        }
        z21 = true;
        if (!z21) {
            return false;
        }
        List<DivAction> list15 = this.P;
        if (list15 != null) {
            List<DivAction> list16 = divText.P;
            if (list16 != null) {
                if (list15.size() == list16.size()) {
                    int i34 = 0;
                    for (Object obj13 : list15) {
                        int i35 = i34 + 1;
                        if (i34 < 0) {
                            cn.w.w();
                        }
                        if (((DivAction) obj13).a(list16.get(i34), expressionResolver, expressionResolver2)) {
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
        if (divText.P != null) {
            z22 = false;
            break;
        }
        z22 = true;
        if (!z22) {
            return false;
        }
        List<Range> list17 = this.Q;
        if (list17 != null) {
            List<Range> list18 = divText.Q;
            if (list18 != null) {
                if (list17.size() == list18.size()) {
                    int i36 = 0;
                    for (Object obj14 : list17) {
                        int i37 = i36 + 1;
                        if (i36 < 0) {
                            cn.w.w();
                        }
                        if (((Range) obj14).a(list18.get(i36), expressionResolver, expressionResolver2)) {
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
        if (divText.Q != null) {
            z23 = false;
            break;
        }
        z23 = true;
        if (!z23) {
            return false;
        }
        Expression<String> expressionF = f();
        String strEvaluate3 = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<String> expressionF2 = divText.f();
        if (!tn.p.f(strEvaluate3, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expressionE = e();
        Long lEvaluate6 = expressionE != null ? expressionE.evaluate(expressionResolver) : null;
        Expression<Long> expressionE2 = divText.e();
        if (!tn.p.f(lEvaluate6, expressionE2 != null ? expressionE2.evaluate(expressionResolver2) : null) || this.T.evaluate(expressionResolver).booleanValue() != divText.T.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        List<DivAction> listQ = q();
        if (listQ != null) {
            List<DivAction> listQ2 = divText.q();
            if (listQ2 != null) {
                if (listQ.size() == listQ2.size()) {
                    int i38 = 0;
                    for (Object obj15 : listQ) {
                        int i39 = i38 + 1;
                        if (i38 < 0) {
                            cn.w.w();
                        }
                        if (((DivAction) obj15).a(listQ2.get(i38), expressionResolver, expressionResolver2)) {
                            i38 = i39;
                        }
                    }
                    z24 = true;
                }
                z24 = false;
                break;
            }
            return false;
        }
        if (divText.q() != null) {
            z24 = false;
            break;
        }
        z24 = true;
        if (!z24 || this.V.evaluate(expressionResolver) != divText.V.evaluate(expressionResolver2) || !tn.p.f(this.W.evaluate(expressionResolver), divText.W.evaluate(expressionResolver2)) || this.X.evaluate(expressionResolver) != divText.X.evaluate(expressionResolver2) || this.Y.evaluate(expressionResolver) != divText.Y.evaluate(expressionResolver2) || this.Z.evaluate(expressionResolver).intValue() != divText.Z.evaluate(expressionResolver2).intValue()) {
            return false;
        }
        DivTextGradient divTextGradient = this.f57607a0;
        if (!(divTextGradient != null ? divTextGradient.a(divText.f57607a0, expressionResolver, expressionResolver2) : divText.f57607a0 == null)) {
            return false;
        }
        DivShadow divShadow = this.f57609b0;
        if (!(divShadow != null ? divShadow.a(divText.f57609b0, expressionResolver, expressionResolver2) : divText.f57609b0 == null) || this.f57611c0.evaluate(expressionResolver).booleanValue() != divText.f57611c0.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        List<DivTooltip> listH = h();
        if (listH != null) {
            List<DivTooltip> listH2 = divText.h();
            if (listH2 != null) {
                if (listH.size() == listH2.size()) {
                    int i40 = 0;
                    for (Object obj16 : listH) {
                        int i41 = i40 + 1;
                        if (i40 < 0) {
                            cn.w.w();
                        }
                        if (((DivTooltip) obj16).a(listH2.get(i40), expressionResolver, expressionResolver2)) {
                            i40 = i41;
                        }
                    }
                    z25 = true;
                }
                z25 = false;
                break;
            }
            return false;
        }
        if (divText.h() != null) {
            z25 = false;
            break;
        }
        z25 = true;
        if (!z25) {
            return false;
        }
        DivTransform transform = getTransform();
        if (!(transform != null ? transform.a(divText.getTransform(), expressionResolver, expressionResolver2) : divText.getTransform() == null)) {
            return false;
        }
        DivChangeTransition divChangeTransitionJ = j();
        if (!(divChangeTransitionJ != null ? divChangeTransitionJ.a(divText.j(), expressionResolver, expressionResolver2) : divText.j() == null)) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionV = v();
        if (!(divAppearanceTransitionV != null ? divAppearanceTransitionV.a(divText.v(), expressionResolver, expressionResolver2) : divText.v() == null)) {
            return false;
        }
        DivAppearanceTransition divAppearanceTransitionI = i();
        if (!(divAppearanceTransitionI != null ? divAppearanceTransitionI.a(divText.i(), expressionResolver, expressionResolver2) : divText.i() == null)) {
            return false;
        }
        List<DivTransitionTrigger> listL = l();
        if (listL != null) {
            List<DivTransitionTrigger> listL2 = divText.l();
            if (listL2 != null) {
                if (listL.size() == listL2.size()) {
                    int i42 = 0;
                    for (Object obj17 : listL) {
                        int i43 = i42 + 1;
                        if (i42 < 0) {
                            cn.w.w();
                        }
                        if (((DivTransitionTrigger) obj17) == listL2.get(i42)) {
                            i42 = i43;
                        }
                    }
                    z26 = true;
                }
                z26 = false;
                break;
            }
            return false;
        }
        if (divText.l() != null) {
            z26 = false;
            break;
        }
        z26 = true;
        if (!z26 || this.f57625j0.evaluate(expressionResolver) != divText.f57625j0.evaluate(expressionResolver2) || this.f57627k0.evaluate(expressionResolver) != divText.f57627k0.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivTrigger> listS = s();
        if (listS != null) {
            List<DivTrigger> listS2 = divText.s();
            if (listS2 != null) {
                if (listS.size() == listS2.size()) {
                    int i44 = 0;
                    for (Object obj18 : listS) {
                        int i45 = i44 + 1;
                        if (i44 < 0) {
                            cn.w.w();
                        }
                        if (((DivTrigger) obj18).a(listS2.get(i44), expressionResolver, expressionResolver2)) {
                            i44 = i45;
                        }
                    }
                    z27 = true;
                }
                z27 = false;
                break;
            }
            return false;
        }
        if (divText.s() != null) {
            z27 = false;
            break;
        }
        z27 = true;
        if (!z27) {
            return false;
        }
        List<DivVariable> listC = c();
        if (listC != null) {
            List<DivVariable> listC2 = divText.c();
            if (listC2 != null) {
                if (listC.size() == listC2.size()) {
                    int i46 = 0;
                    for (Object obj19 : listC) {
                        int i47 = i46 + 1;
                        if (i46 < 0) {
                            cn.w.w();
                        }
                        if (((DivVariable) obj19).a(listC2.get(i46), expressionResolver, expressionResolver2)) {
                            i46 = i47;
                        }
                    }
                    z28 = true;
                }
                z28 = false;
                break;
            }
            return false;
        }
        if (divText.c() != null) {
            z28 = false;
            break;
        }
        z28 = true;
        if (!z28 || getVisibility().evaluate(expressionResolver) != divText.getVisibility().evaluate(expressionResolver2)) {
            return false;
        }
        DivVisibilityAction divVisibilityActionT = t();
        if (!(divVisibilityActionT != null ? divVisibilityActionT.g(divText.t(), expressionResolver, expressionResolver2) : divText.t() == null)) {
            return false;
        }
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            List<DivVisibilityAction> listA2 = divText.a();
            if (listA2 != null) {
                if (listA.size() == listA2.size()) {
                    int i48 = 0;
                    for (Object obj20 : listA) {
                        int i49 = i48 + 1;
                        if (i48 < 0) {
                            cn.w.w();
                        }
                        if (((DivVisibilityAction) obj20).g(listA2.get(i48), expressionResolver, expressionResolver2)) {
                            i48 = i49;
                        }
                    }
                    z29 = true;
                }
                z29 = false;
                break;
            }
            return false;
        }
        if (divText.a() != null) {
            z29 = false;
            break;
        }
        z29 = true;
        return z29 && getWidth().a(divText.getWidth(), expressionResolver, expressionResolver2);
    }

    @Override // ah.e2
    @Nullable
    public List<DivVisibilityAction> a() {
        return this.f57637p0;
    }

    @Override // ah.e2
    @Nullable
    public Expression<Long> b() {
        return this.f57630m;
    }

    @Override // ah.e2
    @Nullable
    public List<DivVariable> c() {
        return this.f57631m0;
    }

    @Override // ah.e2
    @Nullable
    public DivEdgeInsets d() {
        return this.K;
    }

    @Override // ah.e2
    @Nullable
    public Expression<Long> e() {
        return this.S;
    }

    @Override // ah.e2
    @Nullable
    public Expression<String> f() {
        return this.R;
    }

    @Override // ah.e2
    @Nullable
    public Expression<DivAlignmentHorizontal> g() {
        return this.f57614e;
    }

    @Override // ah.e2
    @NotNull
    public Expression<Double> getAlpha() {
        return this.f57618g;
    }

    @Override // ah.e2
    @Nullable
    public List<DivBackground> getBackground() {
        return this.f57624j;
    }

    @Override // ah.e2
    @Nullable
    public List<DivExtension> getExtensions() {
        return this.f57638q;
    }

    @Override // ah.e2
    @NotNull
    public DivSize getHeight() {
        return this.B;
    }

    @Override // ah.e2
    @Nullable
    public String getId() {
        return this.E;
    }

    @Override // ah.e2
    @Nullable
    public DivTransform getTransform() {
        return this.f57615e0;
    }

    @Override // ah.e2
    @NotNull
    public Expression<DivVisibility> getVisibility() {
        return this.f57633n0;
    }

    @Override // ah.e2
    @NotNull
    public DivSize getWidth() {
        return this.f57639q0;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTooltip> h() {
        return this.f57613d0;
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
        int iHash13;
        int iHash14;
        int iHash15;
        int iHash16;
        int iHash17;
        int iHash18;
        Integer num = this.f57641r0;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivText.class).hashCode();
        DivAccessibility divAccessibilityO = o();
        int iHash19 = 0;
        int iHash20 = iHashCode + (divAccessibilityO != null ? divAccessibilityO.hash() : 0);
        DivAction divAction = this.f57608b;
        int iHash21 = iHash20 + (divAction != null ? divAction.hash() : 0) + this.f57610c.hash();
        List<DivAction> list = this.f57612d;
        if (list != null) {
            Iterator<T> it = list.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((DivAction) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int i10 = iHash21 + iHash;
        Expression<DivAlignmentHorizontal> expressionG = g();
        int iHashCode2 = i10 + (expressionG != null ? expressionG.hashCode() : 0);
        Expression<DivAlignmentVertical> expressionM = m();
        int iHashCode3 = iHashCode2 + (expressionM != null ? expressionM.hashCode() : 0) + getAlpha().hashCode();
        List<DivAnimator> listW = w();
        if (listW != null) {
            Iterator<T> it2 = listW.iterator();
            iHash2 = 0;
            while (it2.hasNext()) {
                iHash2 += ((DivAnimator) it2.next()).hash();
            }
        } else {
            iHash2 = 0;
        }
        int i11 = iHashCode3 + iHash2;
        Expression<Boolean> expression = this.f57622i;
        int iHashCode4 = i11 + (expression != null ? expression.hashCode() : 0);
        List<DivBackground> background = getBackground();
        if (background != null) {
            Iterator<T> it3 = background.iterator();
            iHash3 = 0;
            while (it3.hasNext()) {
                iHash3 += ((DivBackground) it3.next()).hash();
            }
        } else {
            iHash3 = 0;
        }
        int i12 = iHashCode4 + iHash3;
        DivBorder divBorderX = x();
        int iHash22 = i12 + (divBorderX != null ? divBorderX.hash() : 0) + this.f57628l.hashCode();
        Expression<Long> expressionB = b();
        int iHashCode5 = iHash22 + (expressionB != null ? expressionB.hashCode() : 0);
        List<DivDisappearAction> listK = k();
        if (listK != null) {
            Iterator<T> it4 = listK.iterator();
            iHash4 = 0;
            while (it4.hasNext()) {
                iHash4 += ((DivDisappearAction) it4.next()).hash();
            }
        } else {
            iHash4 = 0;
        }
        int i13 = iHashCode5 + iHash4;
        List<DivAction> list2 = this.f57634o;
        if (list2 != null) {
            Iterator<T> it5 = list2.iterator();
            iHash5 = 0;
            while (it5.hasNext()) {
                iHash5 += ((DivAction) it5.next()).hash();
            }
        } else {
            iHash5 = 0;
        }
        int i14 = i13 + iHash5;
        Ellipsis ellipsis = this.f57636p;
        int iHash23 = i14 + (ellipsis != null ? ellipsis.hash() : 0);
        List<DivExtension> extensions = getExtensions();
        if (extensions != null) {
            Iterator<T> it6 = extensions.iterator();
            iHash6 = 0;
            while (it6.hasNext()) {
                iHash6 += ((DivExtension) it6.next()).hash();
            }
        } else {
            iHash6 = 0;
        }
        int i15 = iHash23 + iHash6;
        DivFocus divFocusN = n();
        int iHash24 = i15 + (divFocusN != null ? divFocusN.hash() : 0);
        Expression<Integer> expression2 = this.f57642s;
        int iHashCode6 = iHash24 + (expression2 != null ? expression2.hashCode() : 0);
        Expression<String> expression3 = this.f57643t;
        int iHashCode7 = iHashCode6 + (expression3 != null ? expression3.hashCode() : 0);
        Expression<String> expression4 = this.f57644u;
        int iHashCode8 = iHashCode7 + (expression4 != null ? expression4.hashCode() : 0) + this.f57645v.hashCode() + this.f57646w.hashCode();
        Expression<JSONObject> expression5 = this.f57647x;
        int iHashCode9 = iHashCode8 + (expression5 != null ? expression5.hashCode() : 0);
        Expression<DivFontWeight> expression6 = this.f57648y;
        int iHashCode10 = iHashCode9 + (expression6 != null ? expression6.hashCode() : 0);
        Expression<Long> expression7 = this.f57649z;
        int iHashCode11 = iHashCode10 + (expression7 != null ? expression7.hashCode() : 0);
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
        int iHash25 = iHashCode11 + iHash7 + getHeight().hash();
        List<DivAction> list3 = this.C;
        if (list3 != null) {
            Iterator<T> it8 = list3.iterator();
            iHash8 = 0;
            while (it8.hasNext()) {
                iHash8 += ((DivAction) it8.next()).hash();
            }
        } else {
            iHash8 = 0;
        }
        int i16 = iHash25 + iHash8;
        List<DivAction> list4 = this.D;
        if (list4 != null) {
            Iterator<T> it9 = list4.iterator();
            iHash9 = 0;
            while (it9.hasNext()) {
                iHash9 += ((DivAction) it9.next()).hash();
            }
        } else {
            iHash9 = 0;
        }
        int i17 = i16 + iHash9;
        String id2 = getId();
        int iHashCode12 = i17 + (id2 != null ? id2.hashCode() : 0);
        List<Image> list5 = this.F;
        if (list5 != null) {
            Iterator<T> it10 = list5.iterator();
            iHash10 = 0;
            while (it10.hasNext()) {
                iHash10 += ((Image) it10.next()).hash();
            }
        } else {
            iHash10 = 0;
        }
        int i18 = iHashCode12 + iHash10;
        DivLayoutProvider divLayoutProviderR = r();
        int iHash26 = i18 + (divLayoutProviderR != null ? divLayoutProviderR.hash() : 0) + this.H.hashCode();
        Expression<Long> expression8 = this.I;
        int iHashCode13 = iHash26 + (expression8 != null ? expression8.hashCode() : 0);
        List<DivAction> list6 = this.J;
        if (list6 != null) {
            Iterator<T> it11 = list6.iterator();
            iHash11 = 0;
            while (it11.hasNext()) {
                iHash11 += ((DivAction) it11.next()).hash();
            }
        } else {
            iHash11 = 0;
        }
        int i19 = iHashCode13 + iHash11;
        DivEdgeInsets divEdgeInsetsD = d();
        int iHash27 = i19 + (divEdgeInsetsD != null ? divEdgeInsetsD.hash() : 0);
        Expression<Long> expression9 = this.L;
        int iHashCode14 = iHash27 + (expression9 != null ? expression9.hashCode() : 0);
        Expression<Long> expression10 = this.M;
        int iHashCode15 = iHashCode14 + (expression10 != null ? expression10.hashCode() : 0);
        DivEdgeInsets divEdgeInsetsP = p();
        int iHash28 = iHashCode15 + (divEdgeInsetsP != null ? divEdgeInsetsP.hash() : 0);
        List<DivAction> list7 = this.O;
        if (list7 != null) {
            Iterator<T> it12 = list7.iterator();
            iHash12 = 0;
            while (it12.hasNext()) {
                iHash12 += ((DivAction) it12.next()).hash();
            }
        } else {
            iHash12 = 0;
        }
        int i20 = iHash28 + iHash12;
        List<DivAction> list8 = this.P;
        if (list8 != null) {
            Iterator<T> it13 = list8.iterator();
            iHash13 = 0;
            while (it13.hasNext()) {
                iHash13 += ((DivAction) it13.next()).hash();
            }
        } else {
            iHash13 = 0;
        }
        int i21 = i20 + iHash13;
        List<Range> list9 = this.Q;
        if (list9 != null) {
            Iterator<T> it14 = list9.iterator();
            iHash14 = 0;
            while (it14.hasNext()) {
                iHash14 += ((Range) it14.next()).hash();
            }
        } else {
            iHash14 = 0;
        }
        int i22 = i21 + iHash14;
        Expression<String> expressionF = f();
        int iHashCode16 = i22 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression<Long> expressionE = e();
        int iHashCode17 = iHashCode16 + (expressionE != null ? expressionE.hashCode() : 0) + this.T.hashCode();
        List<DivAction> listQ = q();
        if (listQ != null) {
            Iterator<T> it15 = listQ.iterator();
            iHash15 = 0;
            while (it15.hasNext()) {
                iHash15 += ((DivAction) it15.next()).hash();
            }
        } else {
            iHash15 = 0;
        }
        int iHashCode18 = iHashCode17 + iHash15 + this.V.hashCode() + this.W.hashCode() + this.X.hashCode() + this.Y.hashCode() + this.Z.hashCode();
        DivTextGradient divTextGradient = this.f57607a0;
        int iHash29 = iHashCode18 + (divTextGradient != null ? divTextGradient.hash() : 0);
        DivShadow divShadow = this.f57609b0;
        int iHash30 = iHash29 + (divShadow != null ? divShadow.hash() : 0) + this.f57611c0.hashCode();
        List<DivTooltip> listH = h();
        if (listH != null) {
            Iterator<T> it16 = listH.iterator();
            iHash16 = 0;
            while (it16.hasNext()) {
                iHash16 += ((DivTooltip) it16.next()).hash();
            }
        } else {
            iHash16 = 0;
        }
        int i23 = iHash30 + iHash16;
        DivTransform transform = getTransform();
        int iHash31 = i23 + (transform != null ? transform.hash() : 0);
        DivChangeTransition divChangeTransitionJ = j();
        int iHash32 = iHash31 + (divChangeTransitionJ != null ? divChangeTransitionJ.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionV = v();
        int iHash33 = iHash32 + (divAppearanceTransitionV != null ? divAppearanceTransitionV.hash() : 0);
        DivAppearanceTransition divAppearanceTransitionI = i();
        int iHash34 = iHash33 + (divAppearanceTransitionI != null ? divAppearanceTransitionI.hash() : 0);
        List<DivTransitionTrigger> listL = l();
        int iHashCode19 = iHash34 + (listL != null ? listL.hashCode() : 0) + this.f57625j0.hashCode() + this.f57627k0.hashCode();
        List<DivTrigger> listS = s();
        if (listS != null) {
            Iterator<T> it17 = listS.iterator();
            iHash17 = 0;
            while (it17.hasNext()) {
                iHash17 += ((DivTrigger) it17.next()).hash();
            }
        } else {
            iHash17 = 0;
        }
        int i24 = iHashCode19 + iHash17;
        List<DivVariable> listC = c();
        if (listC != null) {
            Iterator<T> it18 = listC.iterator();
            iHash18 = 0;
            while (it18.hasNext()) {
                iHash18 += ((DivVariable) it18.next()).hash();
            }
        } else {
            iHash18 = 0;
        }
        int iHashCode20 = i24 + iHash18 + getVisibility().hashCode();
        DivVisibilityAction divVisibilityActionT = t();
        int iHash35 = iHashCode20 + (divVisibilityActionT != null ? divVisibilityActionT.hash() : 0);
        List<DivVisibilityAction> listA = a();
        if (listA != null) {
            Iterator<T> it19 = listA.iterator();
            while (it19.hasNext()) {
                iHash19 += ((DivVisibilityAction) it19.next()).hash();
            }
        }
        int iHash36 = iHash35 + iHash19 + getWidth().hash();
        this.f57641r0 = Integer.valueOf(iHash36);
        return iHash36;
    }

    @Override // ah.e2
    @Nullable
    public DivAppearanceTransition i() {
        return this.f57621h0;
    }

    @Override // ah.e2
    @Nullable
    public DivChangeTransition j() {
        return this.f57617f0;
    }

    @Override // ah.e2
    @Nullable
    public List<DivDisappearAction> k() {
        return this.f57632n;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTransitionTrigger> l() {
        return this.f57623i0;
    }

    @Override // ah.e2
    @Nullable
    public Expression<DivAlignmentVertical> m() {
        return this.f57616f;
    }

    @Override // ah.e2
    @Nullable
    public DivFocus n() {
        return this.f57640r;
    }

    @Override // ah.e2
    @Nullable
    public DivAccessibility o() {
        return this.f57606a;
    }

    @Override // ah.e2
    @Nullable
    public DivEdgeInsets p() {
        return this.N;
    }

    @Override // ah.e2
    @Nullable
    public List<DivAction> q() {
        return this.U;
    }

    @Override // ah.e2
    @Nullable
    public DivLayoutProvider r() {
        return this.G;
    }

    @Override // ah.e2
    @Nullable
    public List<DivTrigger> s() {
        return this.f57629l0;
    }

    @Override // ah.e2
    @Nullable
    public DivVisibilityAction t() {
        return this.f57635o0;
    }

    @Override // ah.e2
    @Nullable
    public List<DivFunction> u() {
        return this.A;
    }

    @Override // ah.e2
    @Nullable
    public DivAppearanceTransition v() {
        return this.f57619g0;
    }

    @Override // ah.e2
    @Nullable
    public List<DivAnimator> w() {
        return this.f57620h;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().p8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // ah.e2
    @Nullable
    public DivBorder x() {
        return this.f57626k;
    }

    @NotNull
    public final DivText y(@Nullable DivAccessibility divAccessibility, @Nullable DivAction divAction, @NotNull DivAnimation divAnimation, @Nullable List<DivAction> list, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> expression3, @Nullable List<? extends DivAnimator> list2, @Nullable Expression<Boolean> expression4, @Nullable List<? extends DivBackground> list3, @Nullable DivBorder divBorder, @NotNull Expression<Boolean> expression5, @Nullable Expression<Long> expression6, @Nullable List<DivDisappearAction> list4, @Nullable List<DivAction> list5, @Nullable Ellipsis ellipsis, @Nullable List<DivExtension> list6, @Nullable DivFocus divFocus, @Nullable Expression<Integer> expression7, @Nullable Expression<String> expression8, @Nullable Expression<String> expression9, @NotNull Expression<Long> expression10, @NotNull Expression<DivSizeUnit> expression11, @Nullable Expression<JSONObject> expression12, @Nullable Expression<DivFontWeight> expression13, @Nullable Expression<Long> expression14, @Nullable List<DivFunction> list7, @NotNull DivSize divSize, @Nullable List<DivAction> list8, @Nullable List<DivAction> list9, @Nullable String str, @Nullable List<Image> list10, @Nullable DivLayoutProvider divLayoutProvider, @NotNull Expression<Double> expression15, @Nullable Expression<Long> expression16, @Nullable List<DivAction> list11, @Nullable DivEdgeInsets divEdgeInsets, @Nullable Expression<Long> expression17, @Nullable Expression<Long> expression18, @Nullable DivEdgeInsets divEdgeInsets2, @Nullable List<DivAction> list12, @Nullable List<DivAction> list13, @Nullable List<Range> list14, @Nullable Expression<String> expression19, @Nullable Expression<Long> expression20, @NotNull Expression<Boolean> expression21, @Nullable List<DivAction> list15, @NotNull Expression<DivLineStyle> expression22, @NotNull Expression<String> expression23, @NotNull Expression<DivAlignmentHorizontal> expression24, @NotNull Expression<DivAlignmentVertical> expression25, @NotNull Expression<Integer> expression26, @Nullable DivTextGradient divTextGradient, @Nullable DivShadow divShadow, @NotNull Expression<Boolean> expression27, @Nullable List<DivTooltip> list16, @Nullable DivTransform divTransform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list17, @NotNull Expression<Truncate> expression28, @NotNull Expression<DivLineStyle> expression29, @Nullable List<DivTrigger> list18, @Nullable List<? extends DivVariable> list19, @NotNull Expression<DivVisibility> expression30, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<DivVisibilityAction> list20, @NotNull DivSize divSize2) {
        return new DivText(divAccessibility, divAction, divAnimation, list, expression, expression2, expression3, list2, expression4, list3, divBorder, expression5, expression6, list4, list5, ellipsis, list6, divFocus, expression7, expression8, expression9, expression10, expression11, expression12, expression13, expression14, list7, divSize, list8, list9, str, list10, divLayoutProvider, expression15, expression16, list11, divEdgeInsets, expression17, expression18, divEdgeInsets2, list12, list13, list14, expression19, expression20, expression21, list15, expression22, expression23, expression24, expression25, expression26, divTextGradient, divShadow, expression27, list16, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list17, expression28, expression29, list18, list19, expression30, divVisibilityAction, list20, divSize2);
    }
}
