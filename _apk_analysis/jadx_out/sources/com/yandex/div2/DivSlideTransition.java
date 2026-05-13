package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivSlideTransition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSlideTransition.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivSlideTransition implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f56976g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f56977h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Expression<Edge> f56978i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAnimationInterpolator> f56979j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f56980k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivSlideTransition> f56981l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final DivDimension f56982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f56983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Expression<Edge> f56984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Expression<DivAnimationInterpolator> f56985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f56986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Integer f56987f;

    /* JADX INFO: compiled from: DivSlideTransition.kt */
    public enum Edge {
        LEFT("left"),
        TOP("top"),
        RIGHT("right"),
        BOTTOM("bottom");


        @NotNull
        private final String value;

        @NotNull
        public static final a Converter = new a(null);

        @NotNull
        public static final sn.l<Edge, String> TO_STRING = new sn.l<Edge, String>() { // from class: com.yandex.div2.DivSlideTransition$Edge$Converter$TO_STRING$1
            @Override // sn.l
            @NotNull
            public final String invoke(@NotNull DivSlideTransition.Edge edge) {
                return DivSlideTransition.Edge.Converter.b(edge);
            }
        };

        @NotNull
        public static final sn.l<String, Edge> FROM_STRING = new sn.l<String, Edge>() { // from class: com.yandex.div2.DivSlideTransition$Edge$Converter$FROM_STRING$1
            @Override // sn.l
            @Nullable
            public final DivSlideTransition.Edge invoke(@NotNull String str) {
                return DivSlideTransition.Edge.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivSlideTransition.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @Nullable
            public final Edge a(@NotNull String str) {
                Edge edge = Edge.LEFT;
                if (tn.p.f(str, edge.value)) {
                    return edge;
                }
                Edge edge2 = Edge.TOP;
                if (tn.p.f(str, edge2.value)) {
                    return edge2;
                }
                Edge edge3 = Edge.RIGHT;
                if (tn.p.f(str, edge3.value)) {
                    return edge3;
                }
                Edge edge4 = Edge.BOTTOM;
                if (tn.p.f(str, edge4.value)) {
                    return edge4;
                }
                return null;
            }

            @NotNull
            public final String b(@NotNull Edge edge) {
                return edge.value;
            }
        }

        Edge(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: DivSlideTransition.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivSlideTransition a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().e7().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f56977h = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        f56978i = Expression.Companion.constant$default(companion, Edge.BOTTOM, null, 2, null);
        f56979j = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        f56980k = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f56981l = new sn.p<ParsingEnvironment, JSONObject, DivSlideTransition>() { // from class: com.yandex.div2.DivSlideTransition$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivSlideTransition mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivSlideTransition.f56976g.a(parsingEnvironment, jSONObject);
            }
        };
    }

    public DivSlideTransition() {
        this(null, null, null, null, null, 31, null);
    }

    public DivSlideTransition(@Nullable DivDimension divDimension, @NotNull Expression<Long> expression, @NotNull Expression<Edge> expression2, @NotNull Expression<DivAnimationInterpolator> expression3, @NotNull Expression<Long> expression4) {
        this.f56982a = divDimension;
        this.f56983b = expression;
        this.f56984c = expression2;
        this.f56985d = expression3;
        this.f56986e = expression4;
    }

    public /* synthetic */ DivSlideTransition(DivDimension divDimension, Expression expression, Expression expression2, Expression expression3, Expression expression4, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : divDimension, (i10 & 2) != 0 ? f56977h : expression, (i10 & 4) != 0 ? f56978i : expression2, (i10 & 8) != 0 ? f56979j : expression3, (i10 & 16) != 0 ? f56980k : expression4);
    }

    public final boolean a(@Nullable DivSlideTransition divSlideTransition, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divSlideTransition == null) {
            return false;
        }
        DivDimension divDimension = this.f56982a;
        return (divDimension != null ? divDimension.a(divSlideTransition.f56982a, expressionResolver, expressionResolver2) : divSlideTransition.f56982a == null) && b().evaluate(expressionResolver).longValue() == divSlideTransition.b().evaluate(expressionResolver2).longValue() && this.f56984c.evaluate(expressionResolver) == divSlideTransition.f56984c.evaluate(expressionResolver2) && c().evaluate(expressionResolver) == divSlideTransition.c().evaluate(expressionResolver2) && d().evaluate(expressionResolver).longValue() == divSlideTransition.d().evaluate(expressionResolver2).longValue();
    }

    @NotNull
    public Expression<Long> b() {
        return this.f56983b;
    }

    @NotNull
    public Expression<DivAnimationInterpolator> c() {
        return this.f56985d;
    }

    @NotNull
    public Expression<Long> d() {
        return this.f56986e;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f56987f;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivSlideTransition.class).hashCode();
        DivDimension divDimension = this.f56982a;
        int iHash = iHashCode + (divDimension != null ? divDimension.hash() : 0) + b().hashCode() + this.f56984c.hashCode() + c().hashCode() + d().hashCode();
        this.f56987f = Integer.valueOf(iHash);
        return iHash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().e7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
