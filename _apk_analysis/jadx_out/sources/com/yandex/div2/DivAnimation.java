package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivCount;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivAnimation.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivAnimation implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final a f54574k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f54575l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAnimationInterpolator> f54576m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final DivCount.c f54577n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f54578o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivAnimation> f54579p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f54580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Expression<Double> f54581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Expression<DivAnimationInterpolator> f54582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final List<DivAnimation> f54583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Expression<Name> f54584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final DivCount f54585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f54586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final Expression<Double> f54587h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Integer f54588i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Integer f54589j;

    /* JADX INFO: compiled from: DivAnimation.kt */
    public enum Name {
        FADE("fade"),
        TRANSLATE("translate"),
        SCALE("scale"),
        NATIVE("native"),
        SET("set"),
        NO_ANIMATION("no_animation");


        @NotNull
        private final String value;

        @NotNull
        public static final a Converter = new a(null);

        @NotNull
        public static final sn.l<Name, String> TO_STRING = new sn.l<Name, String>() { // from class: com.yandex.div2.DivAnimation$Name$Converter$TO_STRING$1
            @Override // sn.l
            @NotNull
            public final String invoke(@NotNull DivAnimation.Name name) {
                return DivAnimation.Name.Converter.b(name);
            }
        };

        @NotNull
        public static final sn.l<String, Name> FROM_STRING = new sn.l<String, Name>() { // from class: com.yandex.div2.DivAnimation$Name$Converter$FROM_STRING$1
            @Override // sn.l
            @Nullable
            public final DivAnimation.Name invoke(@NotNull String str) {
                return DivAnimation.Name.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivAnimation.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @Nullable
            public final Name a(@NotNull String str) {
                Name name = Name.FADE;
                if (tn.p.f(str, name.value)) {
                    return name;
                }
                Name name2 = Name.TRANSLATE;
                if (tn.p.f(str, name2.value)) {
                    return name2;
                }
                Name name3 = Name.SCALE;
                if (tn.p.f(str, name3.value)) {
                    return name3;
                }
                Name name4 = Name.NATIVE;
                if (tn.p.f(str, name4.value)) {
                    return name4;
                }
                Name name5 = Name.SET;
                if (tn.p.f(str, name5.value)) {
                    return name5;
                }
                Name name6 = Name.NO_ANIMATION;
                if (tn.p.f(str, name6.value)) {
                    return name6;
                }
                return null;
            }

            @NotNull
            public final String b(@NotNull Name name) {
                return name.value;
            }
        }

        Name(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: DivAnimation.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivAnimation a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().q1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f54575l = Expression.Companion.constant$default(companion, 300L, null, 2, null);
        f54576m = Expression.Companion.constant$default(companion, DivAnimationInterpolator.SPRING, null, 2, null);
        f54577n = new DivCount.c(new DivInfinityCount());
        f54578o = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f54579p = new sn.p<ParsingEnvironment, JSONObject, DivAnimation>() { // from class: com.yandex.div2.DivAnimation$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivAnimation mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivAnimation.f54574k.a(parsingEnvironment, jSONObject);
            }
        };
    }

    public DivAnimation(@NotNull Expression<Long> expression, @Nullable Expression<Double> expression2, @NotNull Expression<DivAnimationInterpolator> expression3, @Nullable List<DivAnimation> list, @NotNull Expression<Name> expression4, @NotNull DivCount divCount, @NotNull Expression<Long> expression5, @Nullable Expression<Double> expression6) {
        this.f54580a = expression;
        this.f54581b = expression2;
        this.f54582c = expression3;
        this.f54583d = list;
        this.f54584e = expression4;
        this.f54585f = divCount;
        this.f54586g = expression5;
        this.f54587h = expression6;
    }

    public /* synthetic */ DivAnimation(Expression expression, Expression expression2, Expression expression3, List list, Expression expression4, DivCount divCount, Expression expression5, Expression expression6, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? f54575l : expression, (i10 & 2) != 0 ? null : expression2, (i10 & 4) != 0 ? f54576m : expression3, (i10 & 8) != 0 ? null : list, expression4, (i10 & 32) != 0 ? f54577n : divCount, (i10 & 64) != 0 ? f54578o : expression5, (i10 & 128) != 0 ? null : expression6);
    }

    public final boolean a(@Nullable DivAnimation divAnimation, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        boolean z10;
        if (divAnimation == null || this.f54580a.evaluate(expressionResolver).longValue() != divAnimation.f54580a.evaluate(expressionResolver2).longValue()) {
            return false;
        }
        Expression<Double> expression = this.f54581b;
        Double dEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Double> expression2 = divAnimation.f54581b;
        if (!tn.p.c(dEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) || this.f54582c.evaluate(expressionResolver) != divAnimation.f54582c.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivAnimation> list = this.f54583d;
        if (list != null) {
            List<DivAnimation> list2 = divAnimation.f54583d;
            if (list2 != null) {
                if (list.size() == list2.size()) {
                    int i10 = 0;
                    for (Object obj : list) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            cn.w.w();
                        }
                        if (((DivAnimation) obj).a(list2.get(i10), expressionResolver, expressionResolver2)) {
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
        if (divAnimation.f54583d != null) {
            z10 = false;
            break;
        }
        z10 = true;
        if (!z10 || this.f54584e.evaluate(expressionResolver) != divAnimation.f54584e.evaluate(expressionResolver2) || !this.f54585f.a(divAnimation.f54585f, expressionResolver, expressionResolver2) || this.f54586g.evaluate(expressionResolver).longValue() != divAnimation.f54586g.evaluate(expressionResolver2).longValue()) {
            return false;
        }
        Expression<Double> expression3 = this.f54587h;
        Double dEvaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        Expression<Double> expression4 = divAnimation.f54587h;
        return tn.p.c(dEvaluate2, expression4 != null ? expression4.evaluate(expressionResolver2) : null);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54589j;
        if (num != null) {
            return num.intValue();
        }
        int iPropertiesHash = propertiesHash();
        List<DivAnimation> list = this.f54583d;
        int iHash = 0;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                iHash += ((DivAnimation) it.next()).hash();
            }
        }
        int i10 = iPropertiesHash + iHash;
        this.f54589j = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.data.Hashable
    public int propertiesHash() {
        Integer num = this.f54588i;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivAnimation.class).hashCode() + this.f54580a.hashCode();
        Expression<Double> expression = this.f54581b;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0) + this.f54582c.hashCode() + this.f54584e.hashCode() + this.f54585f.hash() + this.f54586g.hashCode();
        Expression<Double> expression2 = this.f54587h;
        int iHashCode3 = iHashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        this.f54588i = Integer.valueOf(iHashCode3);
        return iHashCode3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().q1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
