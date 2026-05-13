package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivCollectionItemBuilder;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivCollectionItemBuilder.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivCollectionItemBuilder implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f54764e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f54765f = "it";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivCollectionItemBuilder> f54766g = new sn.p<ParsingEnvironment, JSONObject, DivCollectionItemBuilder>() { // from class: com.yandex.div2.DivCollectionItemBuilder$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivCollectionItemBuilder mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivCollectionItemBuilder.f54764e.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<JSONArray> f54767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f54768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<Prototype> f54769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Integer f54770d;

    /* JADX INFO: compiled from: DivCollectionItemBuilder.kt */
    public static final class Prototype implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final a f54771e = new a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final Expression<Boolean> f54772f = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, Prototype> f54773g = new sn.p<ParsingEnvironment, JSONObject, Prototype>() { // from class: com.yandex.div2.DivCollectionItemBuilder$Prototype$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivCollectionItemBuilder.Prototype mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivCollectionItemBuilder.Prototype.f54771e.a(parsingEnvironment, jSONObject);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Div f54774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Expression<String> f54775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Expression<Boolean> f54776c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Integer f54777d;

        /* JADX INFO: compiled from: DivCollectionItemBuilder.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @NotNull
            public final Prototype a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().g2().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        public Prototype(@NotNull Div div, @Nullable Expression<String> expression, @NotNull Expression<Boolean> expression2) {
            this.f54774a = div;
            this.f54775b = expression;
            this.f54776c = expression2;
        }

        public final boolean a(@Nullable Prototype prototype, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
            if (prototype == null || !this.f54774a.a(prototype.f54774a, expressionResolver, expressionResolver2)) {
                return false;
            }
            Expression<String> expression = this.f54775b;
            String strEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
            Expression<String> expression2 = prototype.f54775b;
            return tn.p.f(strEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) && this.f54776c.evaluate(expressionResolver).booleanValue() == prototype.f54776c.evaluate(expressionResolver2).booleanValue();
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f54777d;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = tn.t.b(Prototype.class).hashCode() + this.f54774a.hash();
            Expression<String> expression = this.f54775b;
            int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0) + this.f54776c.hashCode();
            this.f54777d = Integer.valueOf(iHashCode2);
            return iHashCode2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().g2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivCollectionItemBuilder.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivCollectionItemBuilder a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().d2().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivCollectionItemBuilder(@NotNull Expression<JSONArray> expression, @NotNull String str, @NotNull List<Prototype> list) {
        this.f54767a = expression;
        this.f54768b = str;
        this.f54769c = list;
    }

    public final boolean a(@Nullable DivCollectionItemBuilder divCollectionItemBuilder, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        boolean z10;
        if (divCollectionItemBuilder == null || !tn.p.f(this.f54767a.evaluate(expressionResolver), divCollectionItemBuilder.f54767a.evaluate(expressionResolver2)) || !tn.p.f(this.f54768b, divCollectionItemBuilder.f54768b)) {
            return false;
        }
        List<Prototype> list = this.f54769c;
        List<Prototype> list2 = divCollectionItemBuilder.f54769c;
        if (list.size() != list2.size()) {
            z10 = false;
            break;
        }
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                cn.w.w();
            }
            if (!((Prototype) obj).a(list2.get(i10), expressionResolver, expressionResolver2)) {
                z10 = false;
                break;
            }
            i10 = i11;
        }
        z10 = true;
        return z10;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54770d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivCollectionItemBuilder.class).hashCode() + this.f54767a.hashCode() + this.f54768b.hashCode();
        int iHash = 0;
        Iterator<T> it = this.f54769c.iterator();
        while (it.hasNext()) {
            iHash += ((Prototype) it.next()).hash();
        }
        int i10 = iHashCode + iHash;
        this.f54770d = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().d2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
