package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivRadialGradient;
import com.yandex.div2.DivRadialGradientCenter;
import com.yandex.div2.DivRadialGradientRadius;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRadialGradient.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivRadialGradient implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f56570g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final DivRadialGradientCenter.c f56571h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final DivRadialGradientCenter.c f56572i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final DivRadialGradientRadius.c f56573j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivRadialGradient> f56574k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DivRadialGradientCenter f56575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DivRadialGradientCenter f56576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final List<ColorPoint> f56577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final ExpressionList<Integer> f56578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final DivRadialGradientRadius f56579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Integer f56580f;

    /* JADX INFO: compiled from: DivRadialGradient.kt */
    public static final class ColorPoint implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final a f56581d = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, ColorPoint> f56582e = new sn.p<ParsingEnvironment, JSONObject, ColorPoint>() { // from class: com.yandex.div2.DivRadialGradient$ColorPoint$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivRadialGradient.ColorPoint mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivRadialGradient.ColorPoint.f56581d.a(parsingEnvironment, jSONObject);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Expression<Integer> f56583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Expression<Double> f56584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Integer f56585c;

        /* JADX INFO: compiled from: DivRadialGradient.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @NotNull
            public final ColorPoint a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().f6().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        public ColorPoint(@NotNull Expression<Integer> expression, @NotNull Expression<Double> expression2) {
            this.f56583a = expression;
            this.f56584b = expression2;
        }

        public final boolean a(@Nullable ColorPoint colorPoint, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
            if (colorPoint != null && this.f56583a.evaluate(expressionResolver).intValue() == colorPoint.f56583a.evaluate(expressionResolver2).intValue()) {
                return (this.f56584b.evaluate(expressionResolver).doubleValue() > colorPoint.f56584b.evaluate(expressionResolver2).doubleValue() ? 1 : (this.f56584b.evaluate(expressionResolver).doubleValue() == colorPoint.f56584b.evaluate(expressionResolver2).doubleValue() ? 0 : -1)) == 0;
            }
            return false;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f56585c;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = tn.t.b(ColorPoint.class).hashCode() + this.f56583a.hashCode() + this.f56584b.hashCode();
            this.f56585c = Integer.valueOf(iHashCode);
            return iHashCode;
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().f6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivRadialGradient.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivRadialGradient a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().l6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Double dValueOf = Double.valueOf(0.5d);
        f56571h = new DivRadialGradientCenter.c(new DivRadialGradientRelativeCenter(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
        f56572i = new DivRadialGradientCenter.c(new DivRadialGradientRelativeCenter(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
        f56573j = new DivRadialGradientRadius.c(new DivRadialGradientRelativeRadius(Expression.Companion.constant$default(companion, DivRadialGradientRelativeRadius.Value.FARTHEST_CORNER, null, 2, null)));
        f56574k = new sn.p<ParsingEnvironment, JSONObject, DivRadialGradient>() { // from class: com.yandex.div2.DivRadialGradient$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivRadialGradient mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivRadialGradient.f56570g.a(parsingEnvironment, jSONObject);
            }
        };
    }

    public DivRadialGradient() {
        this(null, null, null, null, null, 31, null);
    }

    public DivRadialGradient(@NotNull DivRadialGradientCenter divRadialGradientCenter, @NotNull DivRadialGradientCenter divRadialGradientCenter2, @Nullable List<ColorPoint> list, @Nullable ExpressionList<Integer> expressionList, @NotNull DivRadialGradientRadius divRadialGradientRadius) {
        this.f56575a = divRadialGradientCenter;
        this.f56576b = divRadialGradientCenter2;
        this.f56577c = list;
        this.f56578d = expressionList;
        this.f56579e = divRadialGradientRadius;
    }

    public /* synthetic */ DivRadialGradient(DivRadialGradientCenter divRadialGradientCenter, DivRadialGradientCenter divRadialGradientCenter2, List list, ExpressionList expressionList, DivRadialGradientRadius divRadialGradientRadius, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? f56571h : divRadialGradientCenter, (i10 & 2) != 0 ? f56572i : divRadialGradientCenter2, (i10 & 4) != 0 ? null : list, (i10 & 8) == 0 ? expressionList : null, (i10 & 16) != 0 ? f56573j : divRadialGradientRadius);
    }

    public final boolean a(@Nullable DivRadialGradient divRadialGradient, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        boolean z10;
        boolean z11;
        List<Integer> listEvaluate;
        List<Integer> listEvaluate2;
        if (divRadialGradient == null || !this.f56575a.a(divRadialGradient.f56575a, expressionResolver, expressionResolver2) || !this.f56576b.a(divRadialGradient.f56576b, expressionResolver, expressionResolver2)) {
            return false;
        }
        List<ColorPoint> list = this.f56577c;
        if (list != null) {
            List<ColorPoint> list2 = divRadialGradient.f56577c;
            if (list2 != null) {
                if (list.size() == list2.size()) {
                    int i10 = 0;
                    for (Object obj : list) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            cn.w.w();
                        }
                        if (((ColorPoint) obj).a(list2.get(i10), expressionResolver, expressionResolver2)) {
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
        if (divRadialGradient.f56577c != null) {
            z10 = false;
            break;
        }
        z10 = true;
        if (!z10) {
            return false;
        }
        ExpressionList<Integer> expressionList = this.f56578d;
        if (expressionList != null && (listEvaluate = expressionList.evaluate(expressionResolver)) != null) {
            ExpressionList<Integer> expressionList2 = divRadialGradient.f56578d;
            if (expressionList2 != null && (listEvaluate2 = expressionList2.evaluate(expressionResolver2)) != null) {
                if (listEvaluate.size() == listEvaluate2.size()) {
                    int i12 = 0;
                    for (Object obj2 : listEvaluate) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            cn.w.w();
                        }
                        if (((Number) obj2).intValue() == listEvaluate2.get(i12).intValue()) {
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
        if (divRadialGradient.f56578d != null) {
            z11 = false;
            break;
        }
        z11 = true;
        return z11 && this.f56579e.a(divRadialGradient.f56579e, expressionResolver, expressionResolver2);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f56580f;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivRadialGradient.class).hashCode() + this.f56575a.hash() + this.f56576b.hash();
        List<ColorPoint> list = this.f56577c;
        if (list != null) {
            Iterator<T> it = list.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((ColorPoint) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int i10 = iHashCode + iHash;
        ExpressionList<Integer> expressionList = this.f56578d;
        int iHashCode2 = i10 + (expressionList != null ? expressionList.hashCode() : 0) + this.f56579e.hash();
        this.f56580f = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().l6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
