package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivFocus;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFocus.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivFocus implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f55347g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivFocus> f55348h = new sn.p<ParsingEnvironment, JSONObject, DivFocus>() { // from class: com.yandex.div2.DivFocus$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivFocus mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivFocus.f55347g.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final List<DivBackground> f55349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final DivBorder f55350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final NextFocusIds f55351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f55352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f55353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Integer f55354f;

    /* JADX INFO: compiled from: DivFocus.kt */
    public static final class NextFocusIds implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final a f55355g = new a(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, NextFocusIds> f55356h = new sn.p<ParsingEnvironment, JSONObject, NextFocusIds>() { // from class: com.yandex.div2.DivFocus$NextFocusIds$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivFocus.NextFocusIds mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivFocus.NextFocusIds.f55355g.a(parsingEnvironment, jSONObject);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Expression<String> f55357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Expression<String> f55358b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Expression<String> f55359c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final Expression<String> f55360d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final Expression<String> f55361e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public Integer f55362f;

        /* JADX INFO: compiled from: DivFocus.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @NotNull
            public final NextFocusIds a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().C3().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        public NextFocusIds() {
            this(null, null, null, null, null, 31, null);
        }

        public NextFocusIds(@Nullable Expression<String> expression, @Nullable Expression<String> expression2, @Nullable Expression<String> expression3, @Nullable Expression<String> expression4, @Nullable Expression<String> expression5) {
            this.f55357a = expression;
            this.f55358b = expression2;
            this.f55359c = expression3;
            this.f55360d = expression4;
            this.f55361e = expression5;
        }

        public /* synthetic */ NextFocusIds(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, int i10, tn.i iVar) {
            this((i10 & 1) != 0 ? null : expression, (i10 & 2) != 0 ? null : expression2, (i10 & 4) != 0 ? null : expression3, (i10 & 8) != 0 ? null : expression4, (i10 & 16) != 0 ? null : expression5);
        }

        public final boolean a(@Nullable NextFocusIds nextFocusIds, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
            if (nextFocusIds == null) {
                return false;
            }
            Expression<String> expression = this.f55357a;
            String strEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
            Expression<String> expression2 = nextFocusIds.f55357a;
            if (!tn.p.f(strEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<String> expression3 = this.f55358b;
            String strEvaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
            Expression<String> expression4 = nextFocusIds.f55358b;
            if (!tn.p.f(strEvaluate2, expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<String> expression5 = this.f55359c;
            String strEvaluate3 = expression5 != null ? expression5.evaluate(expressionResolver) : null;
            Expression<String> expression6 = nextFocusIds.f55359c;
            if (!tn.p.f(strEvaluate3, expression6 != null ? expression6.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<String> expression7 = this.f55360d;
            String strEvaluate4 = expression7 != null ? expression7.evaluate(expressionResolver) : null;
            Expression<String> expression8 = nextFocusIds.f55360d;
            if (!tn.p.f(strEvaluate4, expression8 != null ? expression8.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<String> expression9 = this.f55361e;
            String strEvaluate5 = expression9 != null ? expression9.evaluate(expressionResolver) : null;
            Expression<String> expression10 = nextFocusIds.f55361e;
            return tn.p.f(strEvaluate5, expression10 != null ? expression10.evaluate(expressionResolver2) : null);
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f55362f;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = tn.t.b(NextFocusIds.class).hashCode();
            Expression<String> expression = this.f55357a;
            int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
            Expression<String> expression2 = this.f55358b;
            int iHashCode3 = iHashCode2 + (expression2 != null ? expression2.hashCode() : 0);
            Expression<String> expression3 = this.f55359c;
            int iHashCode4 = iHashCode3 + (expression3 != null ? expression3.hashCode() : 0);
            Expression<String> expression4 = this.f55360d;
            int iHashCode5 = iHashCode4 + (expression4 != null ? expression4.hashCode() : 0);
            Expression<String> expression5 = this.f55361e;
            int iHashCode6 = iHashCode5 + (expression5 != null ? expression5.hashCode() : 0);
            this.f55362f = Integer.valueOf(iHashCode6);
            return iHashCode6;
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().C3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivFocus.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivFocus a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().z3().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivFocus() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivFocus(@Nullable List<? extends DivBackground> list, @Nullable DivBorder divBorder, @Nullable NextFocusIds nextFocusIds, @Nullable List<DivAction> list2, @Nullable List<DivAction> list3) {
        this.f55349a = list;
        this.f55350b = divBorder;
        this.f55351c = nextFocusIds;
        this.f55352d = list2;
        this.f55353e = list3;
    }

    public /* synthetic */ DivFocus(List list, DivBorder divBorder, NextFocusIds nextFocusIds, List list2, List list3, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : divBorder, (i10 & 4) != 0 ? null : nextFocusIds, (i10 & 8) != 0 ? null : list2, (i10 & 16) != 0 ? null : list3);
    }

    public final boolean a(@Nullable DivFocus divFocus, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (divFocus == null) {
            return false;
        }
        List<DivBackground> list = this.f55349a;
        if (list != null) {
            List<DivBackground> list2 = divFocus.f55349a;
            if (list2 != null) {
                if (list.size() == list2.size()) {
                    int i10 = 0;
                    for (Object obj : list) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            cn.w.w();
                        }
                        if (((DivBackground) obj).a(list2.get(i10), expressionResolver, expressionResolver2)) {
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
        if (divFocus.f55349a != null) {
            z10 = false;
            break;
        }
        z10 = true;
        if (!z10) {
            return false;
        }
        DivBorder divBorder = this.f55350b;
        if (!(divBorder != null ? divBorder.a(divFocus.f55350b, expressionResolver, expressionResolver2) : divFocus.f55350b == null)) {
            return false;
        }
        NextFocusIds nextFocusIds = this.f55351c;
        if (!(nextFocusIds != null ? nextFocusIds.a(divFocus.f55351c, expressionResolver, expressionResolver2) : divFocus.f55351c == null)) {
            return false;
        }
        List<DivAction> list3 = this.f55352d;
        if (list3 != null) {
            List<DivAction> list4 = divFocus.f55352d;
            if (list4 != null) {
                if (list3.size() == list4.size()) {
                    int i12 = 0;
                    for (Object obj2 : list3) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            cn.w.w();
                        }
                        if (((DivAction) obj2).a(list4.get(i12), expressionResolver, expressionResolver2)) {
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
        if (divFocus.f55352d != null) {
            z11 = false;
            break;
        }
        z11 = true;
        if (!z11) {
            return false;
        }
        List<DivAction> list5 = this.f55353e;
        List<DivAction> list6 = divFocus.f55353e;
        if (list5 != null) {
            if (list6 != null) {
                if (list5.size() == list6.size()) {
                    int i14 = 0;
                    for (Object obj3 : list5) {
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            cn.w.w();
                        }
                        if (((DivAction) obj3).a(list6.get(i14), expressionResolver, expressionResolver2)) {
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
        if (list6 != null) {
            z12 = false;
            break;
        }
        z12 = true;
        return z12;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        int iHash2;
        Integer num = this.f55354f;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivFocus.class).hashCode();
        List<DivBackground> list = this.f55349a;
        int iHash3 = 0;
        if (list != null) {
            Iterator<T> it = list.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((DivBackground) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int i10 = iHashCode + iHash;
        DivBorder divBorder = this.f55350b;
        int iHash4 = i10 + (divBorder != null ? divBorder.hash() : 0);
        NextFocusIds nextFocusIds = this.f55351c;
        int iHash5 = iHash4 + (nextFocusIds != null ? nextFocusIds.hash() : 0);
        List<DivAction> list2 = this.f55352d;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            iHash2 = 0;
            while (it2.hasNext()) {
                iHash2 += ((DivAction) it2.next()).hash();
            }
        } else {
            iHash2 = 0;
        }
        int i11 = iHash5 + iHash2;
        List<DivAction> list3 = this.f55353e;
        if (list3 != null) {
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                iHash3 += ((DivAction) it3.next()).hash();
            }
        }
        int i12 = i11 + iHash3;
        this.f55354f = Integer.valueOf(i12);
        return i12;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().z3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
