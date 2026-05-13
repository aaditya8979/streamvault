package com.yandex.div2;

import ah.c9;
import android.net.Uri;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivDisappearAction.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivDisappearAction implements JSONSerializable, Hashable, c9 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final a f55141m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f55142n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f55143o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f55144p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f55145q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivDisappearAction> f55146r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f55147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final DivDownloadCallbacks f55148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f55149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Expression<String> f55150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f55151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final JSONObject f55152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final Expression<Uri> f55153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final String f55154h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final DivActionTyped f55155i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final Expression<Uri> f55156j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f55157k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public Integer f55158l;

    /* JADX INFO: compiled from: DivDisappearAction.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivDisappearAction a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().P2().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f55142n = Expression.Companion.constant$default(companion, 800L, null, 2, null);
        f55143o = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f55144p = Expression.Companion.constant$default(companion, 1L, null, 2, null);
        f55145q = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f55146r = new sn.p<ParsingEnvironment, JSONObject, DivDisappearAction>() { // from class: com.yandex.div2.DivDisappearAction$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivDisappearAction mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivDisappearAction.f55141m.a(parsingEnvironment, jSONObject);
            }
        };
    }

    public DivDisappearAction(@NotNull Expression<Long> expression, @Nullable DivDownloadCallbacks divDownloadCallbacks, @NotNull Expression<Boolean> expression2, @NotNull Expression<String> expression3, @NotNull Expression<Long> expression4, @Nullable JSONObject jSONObject, @Nullable Expression<Uri> expression5, @Nullable String str, @Nullable DivActionTyped divActionTyped, @Nullable Expression<Uri> expression6, @NotNull Expression<Long> expression7) {
        this.f55147a = expression;
        this.f55148b = divDownloadCallbacks;
        this.f55149c = expression2;
        this.f55150d = expression3;
        this.f55151e = expression4;
        this.f55152f = jSONObject;
        this.f55153g = expression5;
        this.f55154h = str;
        this.f55155i = divActionTyped;
        this.f55156j = expression6;
        this.f55157k = expression7;
    }

    @Override // ah.c9
    @Nullable
    public DivDownloadCallbacks a() {
        return this.f55148b;
    }

    @Override // ah.c9
    @NotNull
    public Expression<String> b() {
        return this.f55150d;
    }

    @Override // ah.c9
    @NotNull
    public Expression<Long> c() {
        return this.f55151e;
    }

    @Override // ah.c9
    @Nullable
    public DivActionTyped d() {
        return this.f55155i;
    }

    @Override // ah.c9
    @Nullable
    public String e() {
        return this.f55154h;
    }

    @Override // ah.c9
    @Nullable
    public Expression<Uri> f() {
        return this.f55153g;
    }

    public final boolean g(@Nullable DivDisappearAction divDisappearAction, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divDisappearAction == null || this.f55147a.evaluate(expressionResolver).longValue() != divDisappearAction.f55147a.evaluate(expressionResolver2).longValue()) {
            return false;
        }
        DivDownloadCallbacks divDownloadCallbacksA = a();
        if (!(divDownloadCallbacksA != null ? divDownloadCallbacksA.a(divDisappearAction.a(), expressionResolver, expressionResolver2) : divDisappearAction.a() == null) || isEnabled().evaluate(expressionResolver).booleanValue() != divDisappearAction.isEnabled().evaluate(expressionResolver2).booleanValue() || !tn.p.f(b().evaluate(expressionResolver), divDisappearAction.b().evaluate(expressionResolver2)) || c().evaluate(expressionResolver).longValue() != divDisappearAction.c().evaluate(expressionResolver2).longValue() || !tn.p.f(getPayload(), divDisappearAction.getPayload())) {
            return false;
        }
        Expression<Uri> expressionF = f();
        Uri uriEvaluate = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<Uri> expressionF2 = divDisappearAction.f();
        if (!tn.p.f(uriEvaluate, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null) || !tn.p.f(e(), divDisappearAction.e())) {
            return false;
        }
        DivActionTyped divActionTypedD = d();
        if (!(divActionTypedD != null ? divActionTypedD.a(divDisappearAction.d(), expressionResolver, expressionResolver2) : divDisappearAction.d() == null)) {
            return false;
        }
        Expression<Uri> url = getUrl();
        Uri uriEvaluate2 = url != null ? url.evaluate(expressionResolver) : null;
        Expression<Uri> url2 = divDisappearAction.getUrl();
        return tn.p.f(uriEvaluate2, url2 != null ? url2.evaluate(expressionResolver2) : null) && this.f55157k.evaluate(expressionResolver).longValue() == divDisappearAction.f55157k.evaluate(expressionResolver2).longValue();
    }

    @Override // ah.c9
    @Nullable
    public JSONObject getPayload() {
        return this.f55152f;
    }

    @Override // ah.c9
    @Nullable
    public Expression<Uri> getUrl() {
        return this.f55156j;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f55158l;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivDisappearAction.class).hashCode() + this.f55147a.hashCode();
        DivDownloadCallbacks divDownloadCallbacksA = a();
        int iHash = iHashCode + (divDownloadCallbacksA != null ? divDownloadCallbacksA.hash() : 0) + isEnabled().hashCode() + b().hashCode() + c().hashCode();
        JSONObject payload = getPayload();
        int iHashCode2 = iHash + (payload != null ? payload.hashCode() : 0);
        Expression<Uri> expressionF = f();
        int iHashCode3 = iHashCode2 + (expressionF != null ? expressionF.hashCode() : 0);
        String strE = e();
        int iHashCode4 = iHashCode3 + (strE != null ? strE.hashCode() : 0);
        DivActionTyped divActionTypedD = d();
        int iHash2 = iHashCode4 + (divActionTypedD != null ? divActionTypedD.hash() : 0);
        Expression<Uri> url = getUrl();
        int iHashCode5 = iHash2 + (url != null ? url.hashCode() : 0) + this.f55157k.hashCode();
        this.f55158l = Integer.valueOf(iHashCode5);
        return iHashCode5;
    }

    @Override // ah.c9
    @NotNull
    public Expression<Boolean> isEnabled() {
        return this.f55149c;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().P2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
