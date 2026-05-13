package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivActionSubmit;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionSubmit.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivActionSubmit implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f54423f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionSubmit> f54424g = new sn.p<ParsingEnvironment, JSONObject, DivActionSubmit>() { // from class: com.yandex.div2.DivActionSubmit$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionSubmit mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionSubmit.f54423f.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<String> f54425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f54426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f54427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Request f54428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Integer f54429e;

    /* JADX INFO: compiled from: DivActionSubmit.kt */
    public static final class Request implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final a f54430e = new a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final Expression<Method> f54431f = Expression.Companion.constant$default(Expression.Companion, Method.POST, null, 2, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, Request> f54432g = new sn.p<ParsingEnvironment, JSONObject, Request>() { // from class: com.yandex.div2.DivActionSubmit$Request$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivActionSubmit.Request mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivActionSubmit.Request.f54430e.a(parsingEnvironment, jSONObject);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final List<Header> f54433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Expression<Method> f54434b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Expression<Uri> f54435c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Integer f54436d;

        /* JADX INFO: compiled from: DivActionSubmit.kt */
        public static final class Header implements JSONSerializable, Hashable {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @NotNull
            public static final a f54437d = new a(null);

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @NotNull
            public static final sn.p<ParsingEnvironment, JSONObject, Header> f54438e = new sn.p<ParsingEnvironment, JSONObject, Header>() { // from class: com.yandex.div2.DivActionSubmit$Request$Header$Companion$CREATOR$1
                @Override // sn.p
                @NotNull
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public final DivActionSubmit.Request.Header mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return DivActionSubmit.Request.Header.f54437d.a(parsingEnvironment, jSONObject);
                }
            };

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final Expression<String> f54439a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final Expression<String> f54440b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public Integer f54441c;

            /* JADX INFO: compiled from: DivActionSubmit.kt */
            public static final class a {
                public a() {
                }

                public /* synthetic */ a(tn.i iVar) {
                    this();
                }

                @NotNull
                public final Header a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return BuiltInParserKt.getBuiltInParserComponent().Y0().getValue().deserialize(parsingEnvironment, jSONObject);
                }
            }

            public Header(@NotNull Expression<String> expression, @NotNull Expression<String> expression2) {
                this.f54439a = expression;
                this.f54440b = expression2;
            }

            public final boolean a(@Nullable Header header, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
                return header != null && tn.p.f(this.f54439a.evaluate(expressionResolver), header.f54439a.evaluate(expressionResolver2)) && tn.p.f(this.f54440b.evaluate(expressionResolver), header.f54440b.evaluate(expressionResolver2));
            }

            @Override // com.yandex.div.data.Hashable
            public int hash() {
                Integer num = this.f54441c;
                if (num != null) {
                    return num.intValue();
                }
                int iHashCode = tn.t.b(Header.class).hashCode() + this.f54439a.hashCode() + this.f54440b.hashCode();
                this.f54441c = Integer.valueOf(iHashCode);
                return iHashCode;
            }

            @Override // com.yandex.div.json.JSONSerializable
            @NotNull
            public JSONObject writeToJSON() {
                return BuiltInParserKt.getBuiltInParserComponent().Y0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
            }
        }

        /* JADX INFO: compiled from: DivActionSubmit.kt */
        public enum Method {
            GET("get"),
            POST("post"),
            PUT("put"),
            PATCH("patch"),
            DELETE("delete"),
            HEAD("head"),
            OPTIONS("options");


            @NotNull
            private final String value;

            @NotNull
            public static final a Converter = new a(null);

            @NotNull
            public static final sn.l<Method, String> TO_STRING = new sn.l<Method, String>() { // from class: com.yandex.div2.DivActionSubmit$Request$Method$Converter$TO_STRING$1
                @Override // sn.l
                @NotNull
                public final String invoke(@NotNull DivActionSubmit.Request.Method method) {
                    return DivActionSubmit.Request.Method.Converter.b(method);
                }
            };

            @NotNull
            public static final sn.l<String, Method> FROM_STRING = new sn.l<String, Method>() { // from class: com.yandex.div2.DivActionSubmit$Request$Method$Converter$FROM_STRING$1
                @Override // sn.l
                @Nullable
                public final DivActionSubmit.Request.Method invoke(@NotNull String str) {
                    return DivActionSubmit.Request.Method.Converter.a(str);
                }
            };

            /* JADX INFO: compiled from: DivActionSubmit.kt */
            public static final class a {
                public a() {
                }

                public /* synthetic */ a(tn.i iVar) {
                    this();
                }

                @Nullable
                public final Method a(@NotNull String str) {
                    Method method = Method.GET;
                    if (tn.p.f(str, method.value)) {
                        return method;
                    }
                    Method method2 = Method.POST;
                    if (tn.p.f(str, method2.value)) {
                        return method2;
                    }
                    Method method3 = Method.PUT;
                    if (tn.p.f(str, method3.value)) {
                        return method3;
                    }
                    Method method4 = Method.PATCH;
                    if (tn.p.f(str, method4.value)) {
                        return method4;
                    }
                    Method method5 = Method.DELETE;
                    if (tn.p.f(str, method5.value)) {
                        return method5;
                    }
                    Method method6 = Method.HEAD;
                    if (tn.p.f(str, method6.value)) {
                        return method6;
                    }
                    Method method7 = Method.OPTIONS;
                    if (tn.p.f(str, method7.value)) {
                        return method7;
                    }
                    return null;
                }

                @NotNull
                public final String b(@NotNull Method method) {
                    return method.value;
                }
            }

            Method(String str) {
                this.value = str;
            }
        }

        /* JADX INFO: compiled from: DivActionSubmit.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @NotNull
            public final Request a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().b1().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        public Request(@Nullable List<Header> list, @NotNull Expression<Method> expression, @NotNull Expression<Uri> expression2) {
            this.f54433a = list;
            this.f54434b = expression;
            this.f54435c = expression2;
        }

        public final boolean a(@Nullable Request request, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
            boolean z10;
            if (request == null) {
                return false;
            }
            List<Header> list = this.f54433a;
            if (list != null) {
                List<Header> list2 = request.f54433a;
                if (list2 != null) {
                    if (list.size() == list2.size()) {
                        int i10 = 0;
                        for (Object obj : list) {
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                cn.w.w();
                            }
                            if (((Header) obj).a(list2.get(i10), expressionResolver, expressionResolver2)) {
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
            if (request.f54433a != null) {
                z10 = false;
                break;
            }
            z10 = true;
            return z10 && this.f54434b.evaluate(expressionResolver) == request.f54434b.evaluate(expressionResolver2) && tn.p.f(this.f54435c.evaluate(expressionResolver), request.f54435c.evaluate(expressionResolver2));
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f54436d;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = tn.t.b(Request.class).hashCode();
            List<Header> list = this.f54433a;
            int iHash = 0;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    iHash += ((Header) it.next()).hash();
                }
            }
            int iHashCode2 = iHashCode + iHash + this.f54434b.hashCode() + this.f54435c.hashCode();
            this.f54436d = Integer.valueOf(iHashCode2);
            return iHashCode2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().b1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivActionSubmit.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivActionSubmit a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().V0().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivActionSubmit(@NotNull Expression<String> expression, @Nullable List<DivAction> list, @Nullable List<DivAction> list2, @NotNull Request request) {
        this.f54425a = expression;
        this.f54426b = list;
        this.f54427c = list2;
        this.f54428d = request;
    }

    public final boolean a(@Nullable DivActionSubmit divActionSubmit, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        boolean z10;
        boolean z11;
        if (divActionSubmit == null || !tn.p.f(this.f54425a.evaluate(expressionResolver), divActionSubmit.f54425a.evaluate(expressionResolver2))) {
            return false;
        }
        List<DivAction> list = this.f54426b;
        if (list != null) {
            List<DivAction> list2 = divActionSubmit.f54426b;
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
        if (divActionSubmit.f54426b != null) {
            z10 = false;
            break;
        }
        z10 = true;
        if (!z10) {
            return false;
        }
        List<DivAction> list3 = this.f54427c;
        if (list3 != null) {
            List<DivAction> list4 = divActionSubmit.f54427c;
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
        if (divActionSubmit.f54427c != null) {
            z11 = false;
            break;
        }
        z11 = true;
        return z11 && this.f54428d.a(divActionSubmit.f54428d, expressionResolver, expressionResolver2);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f54429e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivActionSubmit.class).hashCode() + this.f54425a.hashCode();
        List<DivAction> list = this.f54426b;
        int iHash2 = 0;
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
        List<DivAction> list2 = this.f54427c;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                iHash2 += ((DivAction) it2.next()).hash();
            }
        }
        int iHash3 = i10 + iHash2 + this.f54428d.hash();
        this.f54429e = Integer.valueOf(iHash3);
        return iHash3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().V0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
