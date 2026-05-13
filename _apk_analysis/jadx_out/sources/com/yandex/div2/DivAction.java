package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivAction;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivAction.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivAction implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final a f54172m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f54173n = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivAction> f54174o = new sn.p<ParsingEnvironment, JSONObject, DivAction>() { // from class: com.yandex.div2.DivAction$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivAction mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivAction.f54172m.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final DivDownloadCallbacks f54175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f54176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Expression<String> f54177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Expression<Uri> f54178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final List<MenuItem> f54179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final JSONObject f54180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final Expression<Uri> f54181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final String f54182h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final Expression<Target> f54183i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final DivActionTyped f54184j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final Expression<Uri> f54185k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public Integer f54186l;

    /* JADX INFO: compiled from: DivAction.kt */
    public static final class MenuItem implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final a f54187e = new a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, MenuItem> f54188f = new sn.p<ParsingEnvironment, JSONObject, MenuItem>() { // from class: com.yandex.div2.DivAction$MenuItem$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivAction.MenuItem mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivAction.MenuItem.f54187e.a(parsingEnvironment, jSONObject);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final DivAction f54189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final List<DivAction> f54190b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Expression<String> f54191c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Integer f54192d;

        /* JADX INFO: compiled from: DivAction.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @NotNull
            public final MenuItem a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().x0().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        public MenuItem(@Nullable DivAction divAction, @Nullable List<DivAction> list, @NotNull Expression<String> expression) {
            this.f54189a = divAction;
            this.f54190b = list;
            this.f54191c = expression;
        }

        public final boolean a(@Nullable MenuItem menuItem, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
            boolean z10;
            if (menuItem == null) {
                return false;
            }
            DivAction divAction = this.f54189a;
            if (!(divAction != null ? divAction.a(menuItem.f54189a, expressionResolver, expressionResolver2) : menuItem.f54189a == null)) {
                return false;
            }
            List<DivAction> list = this.f54190b;
            if (list != null) {
                List<DivAction> list2 = menuItem.f54190b;
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
            if (menuItem.f54190b != null) {
                z10 = false;
                break;
            }
            z10 = true;
            return z10 && tn.p.f(this.f54191c.evaluate(expressionResolver), menuItem.f54191c.evaluate(expressionResolver2));
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f54192d;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = tn.t.b(MenuItem.class).hashCode();
            DivAction divAction = this.f54189a;
            int iHash = 0;
            int iHash2 = iHashCode + (divAction != null ? divAction.hash() : 0);
            List<DivAction> list = this.f54190b;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    iHash += ((DivAction) it.next()).hash();
                }
            }
            int iHashCode2 = iHash2 + iHash + this.f54191c.hashCode();
            this.f54192d = Integer.valueOf(iHashCode2);
            return iHashCode2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().x0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivAction.kt */
    public enum Target {
        SELF("_self"),
        BLANK("_blank");


        @NotNull
        private final String value;

        @NotNull
        public static final a Converter = new a(null);

        @NotNull
        public static final sn.l<Target, String> TO_STRING = new sn.l<Target, String>() { // from class: com.yandex.div2.DivAction$Target$Converter$TO_STRING$1
            @Override // sn.l
            @NotNull
            public final String invoke(@NotNull DivAction.Target target) {
                return DivAction.Target.Converter.b(target);
            }
        };

        @NotNull
        public static final sn.l<String, Target> FROM_STRING = new sn.l<String, Target>() { // from class: com.yandex.div2.DivAction$Target$Converter$FROM_STRING$1
            @Override // sn.l
            @Nullable
            public final DivAction.Target invoke(@NotNull String str) {
                return DivAction.Target.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivAction.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @Nullable
            public final Target a(@NotNull String str) {
                Target target = Target.SELF;
                if (tn.p.f(str, target.value)) {
                    return target;
                }
                Target target2 = Target.BLANK;
                if (tn.p.f(str, target2.value)) {
                    return target2;
                }
                return null;
            }

            @NotNull
            public final String b(@NotNull Target target) {
                return target.value;
            }
        }

        Target(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: DivAction.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivAction a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().u0().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivAction(@Nullable DivDownloadCallbacks divDownloadCallbacks, @NotNull Expression<Boolean> expression, @NotNull Expression<String> expression2, @Nullable Expression<Uri> expression3, @Nullable List<MenuItem> list, @Nullable JSONObject jSONObject, @Nullable Expression<Uri> expression4, @Nullable String str, @Nullable Expression<Target> expression5, @Nullable DivActionTyped divActionTyped, @Nullable Expression<Uri> expression6) {
        this.f54175a = divDownloadCallbacks;
        this.f54176b = expression;
        this.f54177c = expression2;
        this.f54178d = expression3;
        this.f54179e = list;
        this.f54180f = jSONObject;
        this.f54181g = expression4;
        this.f54182h = str;
        this.f54183i = expression5;
        this.f54184j = divActionTyped;
        this.f54185k = expression6;
    }

    public final boolean a(@Nullable DivAction divAction, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        boolean z10;
        if (divAction == null) {
            return false;
        }
        DivDownloadCallbacks divDownloadCallbacks = this.f54175a;
        if (!(divDownloadCallbacks != null ? divDownloadCallbacks.a(divAction.f54175a, expressionResolver, expressionResolver2) : divAction.f54175a == null) || this.f54176b.evaluate(expressionResolver).booleanValue() != divAction.f54176b.evaluate(expressionResolver2).booleanValue() || !tn.p.f(this.f54177c.evaluate(expressionResolver), divAction.f54177c.evaluate(expressionResolver2))) {
            return false;
        }
        Expression<Uri> expression = this.f54178d;
        Uri uriEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Uri> expression2 = divAction.f54178d;
        if (!tn.p.f(uriEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<MenuItem> list = this.f54179e;
        if (list != null) {
            List<MenuItem> list2 = divAction.f54179e;
            if (list2 != null) {
                if (list.size() == list2.size()) {
                    int i10 = 0;
                    for (Object obj : list) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            cn.w.w();
                        }
                        if (((MenuItem) obj).a(list2.get(i10), expressionResolver, expressionResolver2)) {
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
        if (divAction.f54179e != null) {
            z10 = false;
            break;
        }
        z10 = true;
        if (!z10 || !tn.p.f(this.f54180f, divAction.f54180f)) {
            return false;
        }
        Expression<Uri> expression3 = this.f54181g;
        Uri uriEvaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        Expression<Uri> expression4 = divAction.f54181g;
        if (!tn.p.f(uriEvaluate2, expression4 != null ? expression4.evaluate(expressionResolver2) : null) || !tn.p.f(this.f54182h, divAction.f54182h)) {
            return false;
        }
        Expression<Target> expression5 = this.f54183i;
        Target targetEvaluate = expression5 != null ? expression5.evaluate(expressionResolver) : null;
        Expression<Target> expression6 = divAction.f54183i;
        if (targetEvaluate != (expression6 != null ? expression6.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivActionTyped divActionTyped = this.f54184j;
        if (!(divActionTyped != null ? divActionTyped.a(divAction.f54184j, expressionResolver, expressionResolver2) : divAction.f54184j == null)) {
            return false;
        }
        Expression<Uri> expression7 = this.f54185k;
        Uri uriEvaluate3 = expression7 != null ? expression7.evaluate(expressionResolver) : null;
        Expression<Uri> expression8 = divAction.f54185k;
        return tn.p.f(uriEvaluate3, expression8 != null ? expression8.evaluate(expressionResolver2) : null);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f54186l;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivAction.class).hashCode();
        DivDownloadCallbacks divDownloadCallbacks = this.f54175a;
        int iHash2 = iHashCode + (divDownloadCallbacks != null ? divDownloadCallbacks.hash() : 0) + this.f54176b.hashCode() + this.f54177c.hashCode();
        Expression<Uri> expression = this.f54178d;
        int iHashCode2 = iHash2 + (expression != null ? expression.hashCode() : 0);
        List<MenuItem> list = this.f54179e;
        if (list != null) {
            Iterator<T> it = list.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((MenuItem) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int i10 = iHashCode2 + iHash;
        JSONObject jSONObject = this.f54180f;
        int iHashCode3 = i10 + (jSONObject != null ? jSONObject.hashCode() : 0);
        Expression<Uri> expression2 = this.f54181g;
        int iHashCode4 = iHashCode3 + (expression2 != null ? expression2.hashCode() : 0);
        String str = this.f54182h;
        int iHashCode5 = iHashCode4 + (str != null ? str.hashCode() : 0);
        Expression<Target> expression3 = this.f54183i;
        int iHashCode6 = iHashCode5 + (expression3 != null ? expression3.hashCode() : 0);
        DivActionTyped divActionTyped = this.f54184j;
        int iHash3 = iHashCode6 + (divActionTyped != null ? divActionTyped.hash() : 0);
        Expression<Uri> expression4 = this.f54185k;
        int iHashCode7 = iHash3 + (expression4 != null ? expression4.hashCode() : 0);
        this.f54186l = Integer.valueOf(iHashCode7);
        return iHashCode7;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().u0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
