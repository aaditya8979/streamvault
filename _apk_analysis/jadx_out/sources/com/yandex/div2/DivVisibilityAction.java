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

/* JADX INFO: compiled from: DivVisibilityAction.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivVisibilityAction implements JSONSerializable, Hashable, c9 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final a f58233m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f58234n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f58235o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f58236p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f58237q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivVisibilityAction> f58238r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final DivDownloadCallbacks f58239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f58240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Expression<String> f58241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f58242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final JSONObject f58243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Expression<Uri> f58244f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f58245g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final DivActionTyped f58246h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final Expression<Uri> f58247i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f58248j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f58249k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public Integer f58250l;

    /* JADX INFO: compiled from: DivVisibilityAction.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivVisibilityAction a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().w9().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f58234n = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f58235o = Expression.Companion.constant$default(companion, 1L, null, 2, null);
        f58236p = Expression.Companion.constant$default(companion, 800L, null, 2, null);
        f58237q = Expression.Companion.constant$default(companion, 50L, null, 2, null);
        f58238r = new sn.p<ParsingEnvironment, JSONObject, DivVisibilityAction>() { // from class: com.yandex.div2.DivVisibilityAction$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivVisibilityAction mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivVisibilityAction.f58233m.a(parsingEnvironment, jSONObject);
            }
        };
    }

    public DivVisibilityAction(@Nullable DivDownloadCallbacks divDownloadCallbacks, @NotNull Expression<Boolean> expression, @NotNull Expression<String> expression2, @NotNull Expression<Long> expression3, @Nullable JSONObject jSONObject, @Nullable Expression<Uri> expression4, @Nullable String str, @Nullable DivActionTyped divActionTyped, @Nullable Expression<Uri> expression5, @NotNull Expression<Long> expression6, @NotNull Expression<Long> expression7) {
        this.f58239a = divDownloadCallbacks;
        this.f58240b = expression;
        this.f58241c = expression2;
        this.f58242d = expression3;
        this.f58243e = jSONObject;
        this.f58244f = expression4;
        this.f58245g = str;
        this.f58246h = divActionTyped;
        this.f58247i = expression5;
        this.f58248j = expression6;
        this.f58249k = expression7;
    }

    @Override // ah.c9
    @Nullable
    public DivDownloadCallbacks a() {
        return this.f58239a;
    }

    @Override // ah.c9
    @NotNull
    public Expression<String> b() {
        return this.f58241c;
    }

    @Override // ah.c9
    @NotNull
    public Expression<Long> c() {
        return this.f58242d;
    }

    @Override // ah.c9
    @Nullable
    public DivActionTyped d() {
        return this.f58246h;
    }

    @Override // ah.c9
    @Nullable
    public String e() {
        return this.f58245g;
    }

    @Override // ah.c9
    @Nullable
    public Expression<Uri> f() {
        return this.f58244f;
    }

    public final boolean g(@Nullable DivVisibilityAction divVisibilityAction, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divVisibilityAction == null) {
            return false;
        }
        DivDownloadCallbacks divDownloadCallbacksA = a();
        if (!(divDownloadCallbacksA != null ? divDownloadCallbacksA.a(divVisibilityAction.a(), expressionResolver, expressionResolver2) : divVisibilityAction.a() == null) || isEnabled().evaluate(expressionResolver).booleanValue() != divVisibilityAction.isEnabled().evaluate(expressionResolver2).booleanValue() || !tn.p.f(b().evaluate(expressionResolver), divVisibilityAction.b().evaluate(expressionResolver2)) || c().evaluate(expressionResolver).longValue() != divVisibilityAction.c().evaluate(expressionResolver2).longValue() || !tn.p.f(getPayload(), divVisibilityAction.getPayload())) {
            return false;
        }
        Expression<Uri> expressionF = f();
        Uri uriEvaluate = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<Uri> expressionF2 = divVisibilityAction.f();
        if (!tn.p.f(uriEvaluate, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null) || !tn.p.f(e(), divVisibilityAction.e())) {
            return false;
        }
        DivActionTyped divActionTypedD = d();
        if (!(divActionTypedD != null ? divActionTypedD.a(divVisibilityAction.d(), expressionResolver, expressionResolver2) : divVisibilityAction.d() == null)) {
            return false;
        }
        Expression<Uri> url = getUrl();
        Uri uriEvaluate2 = url != null ? url.evaluate(expressionResolver) : null;
        Expression<Uri> url2 = divVisibilityAction.getUrl();
        return tn.p.f(uriEvaluate2, url2 != null ? url2.evaluate(expressionResolver2) : null) && this.f58248j.evaluate(expressionResolver).longValue() == divVisibilityAction.f58248j.evaluate(expressionResolver2).longValue() && this.f58249k.evaluate(expressionResolver).longValue() == divVisibilityAction.f58249k.evaluate(expressionResolver2).longValue();
    }

    @Override // ah.c9
    @Nullable
    public JSONObject getPayload() {
        return this.f58243e;
    }

    @Override // ah.c9
    @Nullable
    public Expression<Uri> getUrl() {
        return this.f58247i;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f58250l;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivVisibilityAction.class).hashCode();
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
        int iHashCode5 = iHash2 + (url != null ? url.hashCode() : 0) + this.f58248j.hashCode() + this.f58249k.hashCode();
        this.f58250l = Integer.valueOf(iHashCode5);
        return iHashCode5;
    }

    @Override // ah.c9
    @NotNull
    public Expression<Boolean> isEnabled() {
        return this.f58240b;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().w9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
