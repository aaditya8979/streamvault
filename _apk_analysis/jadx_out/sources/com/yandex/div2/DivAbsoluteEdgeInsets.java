package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivAbsoluteEdgeInsets.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DivAbsoluteEdgeInsets implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f54116f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f54117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f54118h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f54119i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f54120j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivAbsoluteEdgeInsets> f54121k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f54122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f54123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f54124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f54125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Integer f54126e;

    /* JADX INFO: compiled from: DivAbsoluteEdgeInsets.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivAbsoluteEdgeInsets a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().E().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f54117g = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f54118h = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f54119i = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f54120j = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f54121k = new sn.p<ParsingEnvironment, JSONObject, DivAbsoluteEdgeInsets>() { // from class: com.yandex.div2.DivAbsoluteEdgeInsets$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivAbsoluteEdgeInsets mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivAbsoluteEdgeInsets.f54116f.a(parsingEnvironment, jSONObject);
            }
        };
    }

    public DivAbsoluteEdgeInsets() {
        this(null, null, null, null, 15, null);
    }

    public DivAbsoluteEdgeInsets(@NotNull Expression<Long> expression, @NotNull Expression<Long> expression2, @NotNull Expression<Long> expression3, @NotNull Expression<Long> expression4) {
        this.f54122a = expression;
        this.f54123b = expression2;
        this.f54124c = expression3;
        this.f54125d = expression4;
    }

    public /* synthetic */ DivAbsoluteEdgeInsets(Expression expression, Expression expression2, Expression expression3, Expression expression4, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? f54117g : expression, (i10 & 2) != 0 ? f54118h : expression2, (i10 & 4) != 0 ? f54119i : expression3, (i10 & 8) != 0 ? f54120j : expression4);
    }

    public final boolean a(@Nullable DivAbsoluteEdgeInsets divAbsoluteEdgeInsets, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return divAbsoluteEdgeInsets != null && this.f54122a.evaluate(expressionResolver).longValue() == divAbsoluteEdgeInsets.f54122a.evaluate(expressionResolver2).longValue() && this.f54123b.evaluate(expressionResolver).longValue() == divAbsoluteEdgeInsets.f54123b.evaluate(expressionResolver2).longValue() && this.f54124c.evaluate(expressionResolver).longValue() == divAbsoluteEdgeInsets.f54124c.evaluate(expressionResolver2).longValue() && this.f54125d.evaluate(expressionResolver).longValue() == divAbsoluteEdgeInsets.f54125d.evaluate(expressionResolver2).longValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54126e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivAbsoluteEdgeInsets.class).hashCode() + this.f54122a.hashCode() + this.f54123b.hashCode() + this.f54124c.hashCode() + this.f54125d.hashCode();
        this.f54126e = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().E().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
