package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivActionScrollBy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionScrollBy.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivActionScrollBy implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f54324g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f54325h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f54326i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f54327j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final Expression<Overflow> f54328k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionScrollBy> f54329l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f54330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<String> f54331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f54332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f54333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Expression<Overflow> f54334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Integer f54335f;

    /* JADX INFO: compiled from: DivActionScrollBy.kt */
    public enum Overflow {
        CLAMP("clamp"),
        RING("ring");


        @NotNull
        private final String value;

        @NotNull
        public static final a Converter = new a(null);

        @NotNull
        public static final sn.l<Overflow, String> TO_STRING = new sn.l<Overflow, String>() { // from class: com.yandex.div2.DivActionScrollBy$Overflow$Converter$TO_STRING$1
            @Override // sn.l
            @NotNull
            public final String invoke(@NotNull DivActionScrollBy.Overflow overflow) {
                return DivActionScrollBy.Overflow.Converter.b(overflow);
            }
        };

        @NotNull
        public static final sn.l<String, Overflow> FROM_STRING = new sn.l<String, Overflow>() { // from class: com.yandex.div2.DivActionScrollBy$Overflow$Converter$FROM_STRING$1
            @Override // sn.l
            @Nullable
            public final DivActionScrollBy.Overflow invoke(@NotNull String str) {
                return DivActionScrollBy.Overflow.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivActionScrollBy.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @Nullable
            public final Overflow a(@NotNull String str) {
                Overflow overflow = Overflow.CLAMP;
                if (tn.p.f(str, overflow.value)) {
                    return overflow;
                }
                Overflow overflow2 = Overflow.RING;
                if (tn.p.f(str, overflow2.value)) {
                    return overflow2;
                }
                return null;
            }

            @NotNull
            public final String b(@NotNull Overflow overflow) {
                return overflow.value;
            }
        }

        Overflow(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: DivActionScrollBy.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivActionScrollBy a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().A0().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f54325h = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f54326i = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f54327j = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f54328k = Expression.Companion.constant$default(companion, Overflow.CLAMP, null, 2, null);
        f54329l = new sn.p<ParsingEnvironment, JSONObject, DivActionScrollBy>() { // from class: com.yandex.div2.DivActionScrollBy$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivActionScrollBy mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivActionScrollBy.f54324g.a(parsingEnvironment, jSONObject);
            }
        };
    }

    public DivActionScrollBy(@NotNull Expression<Boolean> expression, @NotNull Expression<String> expression2, @NotNull Expression<Long> expression3, @NotNull Expression<Long> expression4, @NotNull Expression<Overflow> expression5) {
        this.f54330a = expression;
        this.f54331b = expression2;
        this.f54332c = expression3;
        this.f54333d = expression4;
        this.f54334e = expression5;
    }

    public final boolean a(@Nullable DivActionScrollBy divActionScrollBy, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return divActionScrollBy != null && this.f54330a.evaluate(expressionResolver).booleanValue() == divActionScrollBy.f54330a.evaluate(expressionResolver2).booleanValue() && tn.p.f(this.f54331b.evaluate(expressionResolver), divActionScrollBy.f54331b.evaluate(expressionResolver2)) && this.f54332c.evaluate(expressionResolver).longValue() == divActionScrollBy.f54332c.evaluate(expressionResolver2).longValue() && this.f54333d.evaluate(expressionResolver).longValue() == divActionScrollBy.f54333d.evaluate(expressionResolver2).longValue() && this.f54334e.evaluate(expressionResolver) == divActionScrollBy.f54334e.evaluate(expressionResolver2);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54335f;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivActionScrollBy.class).hashCode() + this.f54330a.hashCode() + this.f54331b.hashCode() + this.f54332c.hashCode() + this.f54333d.hashCode() + this.f54334e.hashCode();
        this.f54335f = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().A0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
