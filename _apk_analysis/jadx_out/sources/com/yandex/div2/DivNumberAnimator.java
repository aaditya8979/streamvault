package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivCount;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivNumberAnimator.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivNumberAnimator implements JSONSerializable, Hashable, ah.b2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final a f56229m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAnimationDirection> f56230n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAnimationInterpolator> f56231o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final DivCount.b f56232p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f56233q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivNumberAnimator> f56234r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f56235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<DivAnimationDirection> f56236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f56237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f56238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f56239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f56240f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Expression<DivAnimationInterpolator> f56241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final DivCount f56242h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f56243i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final Expression<Double> f56244j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f56245k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public Integer f56246l;

    /* JADX INFO: compiled from: DivNumberAnimator.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivNumberAnimator a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().h5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f56230n = Expression.Companion.constant$default(companion, DivAnimationDirection.NORMAL, null, 2, null);
        f56231o = Expression.Companion.constant$default(companion, DivAnimationInterpolator.LINEAR, null, 2, null);
        f56232p = new DivCount.b(new DivFixedCount(Expression.Companion.constant$default(companion, 1L, null, 2, null)));
        f56233q = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f56234r = new sn.p<ParsingEnvironment, JSONObject, DivNumberAnimator>() { // from class: com.yandex.div2.DivNumberAnimator$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivNumberAnimator mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivNumberAnimator.f56229m.a(parsingEnvironment, jSONObject);
            }
        };
    }

    public DivNumberAnimator(@Nullable List<DivAction> list, @NotNull Expression<DivAnimationDirection> expression, @NotNull Expression<Long> expression2, @Nullable List<DivAction> list2, @NotNull Expression<Double> expression3, @NotNull String str, @NotNull Expression<DivAnimationInterpolator> expression4, @NotNull DivCount divCount, @NotNull Expression<Long> expression5, @Nullable Expression<Double> expression6, @NotNull String str2) {
        this.f56235a = list;
        this.f56236b = expression;
        this.f56237c = expression2;
        this.f56238d = list2;
        this.f56239e = expression3;
        this.f56240f = str;
        this.f56241g = expression4;
        this.f56242h = divCount;
        this.f56243i = expression5;
        this.f56244j = expression6;
        this.f56245k = str2;
    }

    @Override // ah.b2
    @Nullable
    public List<DivAction> a() {
        return this.f56235a;
    }

    @Override // ah.b2
    @NotNull
    public DivCount b() {
        return this.f56242h;
    }

    @Override // ah.b2
    @NotNull
    public Expression<DivAnimationInterpolator> c() {
        return this.f56241g;
    }

    @Override // ah.b2
    @Nullable
    public List<DivAction> d() {
        return this.f56238d;
    }

    @Override // ah.b2
    @NotNull
    public Expression<Long> e() {
        return this.f56243i;
    }

    public final boolean f(@Nullable DivNumberAnimator divNumberAnimator, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        boolean z10;
        boolean z11;
        if (divNumberAnimator == null) {
            return false;
        }
        List<DivAction> listA = a();
        if (listA != null) {
            List<DivAction> listA2 = divNumberAnimator.a();
            if (listA2 != null) {
                if (listA.size() == listA2.size()) {
                    int i10 = 0;
                    for (Object obj : listA) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            cn.w.w();
                        }
                        if (((DivAction) obj).a(listA2.get(i10), expressionResolver, expressionResolver2)) {
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
        if (divNumberAnimator.a() != null) {
            z10 = false;
            break;
        }
        z10 = true;
        if (!z10 || getDirection().evaluate(expressionResolver) != divNumberAnimator.getDirection().evaluate(expressionResolver2) || getDuration().evaluate(expressionResolver).longValue() != divNumberAnimator.getDuration().evaluate(expressionResolver2).longValue()) {
            return false;
        }
        List<DivAction> listD = d();
        if (listD != null) {
            List<DivAction> listD2 = divNumberAnimator.d();
            if (listD2 != null) {
                if (listD.size() == listD2.size()) {
                    int i12 = 0;
                    for (Object obj2 : listD) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            cn.w.w();
                        }
                        if (((DivAction) obj2).a(listD2.get(i12), expressionResolver, expressionResolver2)) {
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
        if (divNumberAnimator.d() != null) {
            z11 = false;
            break;
        }
        z11 = true;
        if (!z11) {
            return false;
        }
        if (!(this.f56239e.evaluate(expressionResolver).doubleValue() == divNumberAnimator.f56239e.evaluate(expressionResolver2).doubleValue()) || !tn.p.f(getId(), divNumberAnimator.getId()) || c().evaluate(expressionResolver) != divNumberAnimator.c().evaluate(expressionResolver2) || !b().a(divNumberAnimator.b(), expressionResolver, expressionResolver2) || e().evaluate(expressionResolver).longValue() != divNumberAnimator.e().evaluate(expressionResolver2).longValue()) {
            return false;
        }
        Expression<Double> expression = this.f56244j;
        Double dEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Double> expression2 = divNumberAnimator.f56244j;
        return tn.p.c(dEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) && tn.p.f(g(), divNumberAnimator.g());
    }

    @NotNull
    public String g() {
        return this.f56245k;
    }

    @Override // ah.b2
    @NotNull
    public Expression<DivAnimationDirection> getDirection() {
        return this.f56236b;
    }

    @Override // ah.b2
    @NotNull
    public Expression<Long> getDuration() {
        return this.f56237c;
    }

    @Override // ah.b2
    @NotNull
    public String getId() {
        return this.f56240f;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        int iHash2;
        Integer num = this.f56246l;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivNumberAnimator.class).hashCode();
        List<DivAction> listA = a();
        if (listA != null) {
            Iterator<T> it = listA.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((DivAction) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int iHashCode2 = iHashCode + iHash + getDirection().hashCode() + getDuration().hashCode();
        List<DivAction> listD = d();
        if (listD != null) {
            Iterator<T> it2 = listD.iterator();
            iHash2 = 0;
            while (it2.hasNext()) {
                iHash2 += ((DivAction) it2.next()).hash();
            }
        } else {
            iHash2 = 0;
        }
        int iHashCode3 = iHashCode2 + iHash2 + this.f56239e.hashCode() + getId().hashCode() + c().hashCode() + b().hash() + e().hashCode();
        Expression<Double> expression = this.f56244j;
        int iHashCode4 = iHashCode3 + (expression != null ? expression.hashCode() : 0) + g().hashCode();
        this.f56246l = Integer.valueOf(iHashCode4);
        return iHashCode4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().h5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
