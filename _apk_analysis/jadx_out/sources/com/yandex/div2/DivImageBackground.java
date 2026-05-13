package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivImageBackground.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivImageBackground implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final a f55724i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final Expression<Double> f55725j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAlignmentHorizontal> f55726k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAlignmentVertical> f55727l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f55728m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final Expression<DivImageScale> f55729n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivImageBackground> f55730o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Double> f55731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<DivAlignmentHorizontal> f55732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Expression<DivAlignmentVertical> f55733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final List<DivFilter> f55734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Expression<Uri> f55735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f55736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Expression<DivImageScale> f55737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public Integer f55738h;

    /* JADX INFO: compiled from: DivImageBackground.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivImageBackground a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().U3().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f55725j = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        f55726k = Expression.Companion.constant$default(companion, DivAlignmentHorizontal.CENTER, null, 2, null);
        f55727l = Expression.Companion.constant$default(companion, DivAlignmentVertical.CENTER, null, 2, null);
        f55728m = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f55729n = Expression.Companion.constant$default(companion, DivImageScale.FILL, null, 2, null);
        f55730o = new sn.p<ParsingEnvironment, JSONObject, DivImageBackground>() { // from class: com.yandex.div2.DivImageBackground$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivImageBackground mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivImageBackground.f55724i.a(parsingEnvironment, jSONObject);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivImageBackground(@NotNull Expression<Double> expression, @NotNull Expression<DivAlignmentHorizontal> expression2, @NotNull Expression<DivAlignmentVertical> expression3, @Nullable List<? extends DivFilter> list, @NotNull Expression<Uri> expression4, @NotNull Expression<Boolean> expression5, @NotNull Expression<DivImageScale> expression6) {
        this.f55731a = expression;
        this.f55732b = expression2;
        this.f55733c = expression3;
        this.f55734d = list;
        this.f55735e = expression4;
        this.f55736f = expression5;
        this.f55737g = expression6;
    }

    public final boolean a(@Nullable DivImageBackground divImageBackground, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        boolean z10;
        if (divImageBackground == null) {
            return false;
        }
        if (!(this.f55731a.evaluate(expressionResolver).doubleValue() == divImageBackground.f55731a.evaluate(expressionResolver2).doubleValue()) || this.f55732b.evaluate(expressionResolver) != divImageBackground.f55732b.evaluate(expressionResolver2) || this.f55733c.evaluate(expressionResolver) != divImageBackground.f55733c.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivFilter> list = this.f55734d;
        if (list != null) {
            List<DivFilter> list2 = divImageBackground.f55734d;
            if (list2 != null) {
                if (list.size() == list2.size()) {
                    int i10 = 0;
                    for (Object obj : list) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            cn.w.w();
                        }
                        if (((DivFilter) obj).a(list2.get(i10), expressionResolver, expressionResolver2)) {
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
        if (divImageBackground.f55734d != null) {
            z10 = false;
            break;
        }
        z10 = true;
        return z10 && tn.p.f(this.f55735e.evaluate(expressionResolver), divImageBackground.f55735e.evaluate(expressionResolver2)) && this.f55736f.evaluate(expressionResolver).booleanValue() == divImageBackground.f55736f.evaluate(expressionResolver2).booleanValue() && this.f55737g.evaluate(expressionResolver) == divImageBackground.f55737g.evaluate(expressionResolver2);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f55738h;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivImageBackground.class).hashCode() + this.f55731a.hashCode() + this.f55732b.hashCode() + this.f55733c.hashCode();
        List<DivFilter> list = this.f55734d;
        int iHash = 0;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                iHash += ((DivFilter) it.next()).hash();
            }
        }
        int iHashCode2 = iHashCode + iHash + this.f55735e.hashCode() + this.f55736f.hashCode() + this.f55737g.hashCode();
        this.f55738h = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().U3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
