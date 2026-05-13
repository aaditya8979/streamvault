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

/* JADX INFO: compiled from: DivColorAnimator.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivColorAnimator implements JSONSerializable, Hashable, ah.b2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final a f54790m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAnimationDirection> f54791n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAnimationInterpolator> f54792o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final DivCount.b f54793p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f54794q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivColorAnimator> f54795r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f54796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<DivAnimationDirection> f54797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f54798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f54799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Expression<Integer> f54800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f54801f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Expression<DivAnimationInterpolator> f54802g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final DivCount f54803h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f54804i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final Expression<Integer> f54805j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f54806k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public Integer f54807l;

    /* JADX INFO: compiled from: DivColorAnimator.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivColorAnimator a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().j2().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f54791n = Expression.Companion.constant$default(companion, DivAnimationDirection.NORMAL, null, 2, null);
        f54792o = Expression.Companion.constant$default(companion, DivAnimationInterpolator.LINEAR, null, 2, null);
        f54793p = new DivCount.b(new DivFixedCount(Expression.Companion.constant$default(companion, 1L, null, 2, null)));
        f54794q = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f54795r = new sn.p<ParsingEnvironment, JSONObject, DivColorAnimator>() { // from class: com.yandex.div2.DivColorAnimator$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivColorAnimator mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivColorAnimator.f54790m.a(parsingEnvironment, jSONObject);
            }
        };
    }

    public DivColorAnimator(@Nullable List<DivAction> list, @NotNull Expression<DivAnimationDirection> expression, @NotNull Expression<Long> expression2, @Nullable List<DivAction> list2, @NotNull Expression<Integer> expression3, @NotNull String str, @NotNull Expression<DivAnimationInterpolator> expression4, @NotNull DivCount divCount, @NotNull Expression<Long> expression5, @Nullable Expression<Integer> expression6, @NotNull String str2) {
        this.f54796a = list;
        this.f54797b = expression;
        this.f54798c = expression2;
        this.f54799d = list2;
        this.f54800e = expression3;
        this.f54801f = str;
        this.f54802g = expression4;
        this.f54803h = divCount;
        this.f54804i = expression5;
        this.f54805j = expression6;
        this.f54806k = str2;
    }

    @Override // ah.b2
    @Nullable
    public List<DivAction> a() {
        return this.f54796a;
    }

    @Override // ah.b2
    @NotNull
    public DivCount b() {
        return this.f54803h;
    }

    @Override // ah.b2
    @NotNull
    public Expression<DivAnimationInterpolator> c() {
        return this.f54802g;
    }

    @Override // ah.b2
    @Nullable
    public List<DivAction> d() {
        return this.f54799d;
    }

    @Override // ah.b2
    @NotNull
    public Expression<Long> e() {
        return this.f54804i;
    }

    public final boolean f(@Nullable DivColorAnimator divColorAnimator, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        boolean z10;
        boolean z11;
        if (divColorAnimator == null) {
            return false;
        }
        List<DivAction> listA = a();
        if (listA != null) {
            List<DivAction> listA2 = divColorAnimator.a();
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
        if (divColorAnimator.a() != null) {
            z10 = false;
            break;
        }
        z10 = true;
        if (!z10 || getDirection().evaluate(expressionResolver) != divColorAnimator.getDirection().evaluate(expressionResolver2) || getDuration().evaluate(expressionResolver).longValue() != divColorAnimator.getDuration().evaluate(expressionResolver2).longValue()) {
            return false;
        }
        List<DivAction> listD = d();
        if (listD != null) {
            List<DivAction> listD2 = divColorAnimator.d();
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
        if (divColorAnimator.d() != null) {
            z11 = false;
            break;
        }
        z11 = true;
        if (!z11 || this.f54800e.evaluate(expressionResolver).intValue() != divColorAnimator.f54800e.evaluate(expressionResolver2).intValue() || !tn.p.f(getId(), divColorAnimator.getId()) || c().evaluate(expressionResolver) != divColorAnimator.c().evaluate(expressionResolver2) || !b().a(divColorAnimator.b(), expressionResolver, expressionResolver2) || e().evaluate(expressionResolver).longValue() != divColorAnimator.e().evaluate(expressionResolver2).longValue()) {
            return false;
        }
        Expression<Integer> expression = this.f54805j;
        Integer numEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Integer> expression2 = divColorAnimator.f54805j;
        return tn.p.f(numEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) && tn.p.f(g(), divColorAnimator.g());
    }

    @NotNull
    public String g() {
        return this.f54806k;
    }

    @Override // ah.b2
    @NotNull
    public Expression<DivAnimationDirection> getDirection() {
        return this.f54797b;
    }

    @Override // ah.b2
    @NotNull
    public Expression<Long> getDuration() {
        return this.f54798c;
    }

    @Override // ah.b2
    @NotNull
    public String getId() {
        return this.f54801f;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        int iHash2;
        Integer num = this.f54807l;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivColorAnimator.class).hashCode();
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
        int iHashCode3 = iHashCode2 + iHash2 + this.f54800e.hashCode() + getId().hashCode() + c().hashCode() + b().hash() + e().hashCode();
        Expression<Integer> expression = this.f54805j;
        int iHashCode4 = iHashCode3 + (expression != null ? expression.hashCode() : 0) + g().hashCode();
        this.f54807l = Integer.valueOf(iHashCode4);
        return iHashCode4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().j2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
