package com.yandex.div2;

import com.ironsource.C3978d4;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivTooltip;
import com.yandex.div2.DivTooltipMode;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTooltip.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivTooltip implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final a f57978m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f57979n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f57980o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final DivTooltipMode.b f57981p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivTooltip> f57982q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final DivAnimation f57983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final DivAnimation f57984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Expression<String> f57985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f57986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Div f57987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f57988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f57989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final DivTooltipMode f57990h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final DivPoint f57991i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Expression<Position> f57992j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f57993k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public Integer f57994l;

    /* JADX INFO: compiled from: DivTooltip.kt */
    public enum Position {
        LEFT("left"),
        TOP_LEFT(C3978d4.e.f31274c),
        TOP("top"),
        TOP_RIGHT(C3978d4.e.f31273b),
        RIGHT("right"),
        BOTTOM_RIGHT(C3978d4.e.f31275d),
        BOTTOM("bottom"),
        BOTTOM_LEFT(C3978d4.e.f31276e),
        CENTER("center");


        @NotNull
        private final String value;

        @NotNull
        public static final a Converter = new a(null);

        @NotNull
        public static final sn.l<Position, String> TO_STRING = new sn.l<Position, String>() { // from class: com.yandex.div2.DivTooltip$Position$Converter$TO_STRING$1
            @Override // sn.l
            @NotNull
            public final String invoke(@NotNull DivTooltip.Position position) {
                return DivTooltip.Position.Converter.b(position);
            }
        };

        @NotNull
        public static final sn.l<String, Position> FROM_STRING = new sn.l<String, Position>() { // from class: com.yandex.div2.DivTooltip$Position$Converter$FROM_STRING$1
            @Override // sn.l
            @Nullable
            public final DivTooltip.Position invoke(@NotNull String str) {
                return DivTooltip.Position.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivTooltip.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @Nullable
            public final Position a(@NotNull String str) {
                Position position = Position.LEFT;
                if (tn.p.f(str, position.value)) {
                    return position;
                }
                Position position2 = Position.TOP_LEFT;
                if (tn.p.f(str, position2.value)) {
                    return position2;
                }
                Position position3 = Position.TOP;
                if (tn.p.f(str, position3.value)) {
                    return position3;
                }
                Position position4 = Position.TOP_RIGHT;
                if (tn.p.f(str, position4.value)) {
                    return position4;
                }
                Position position5 = Position.RIGHT;
                if (tn.p.f(str, position5.value)) {
                    return position5;
                }
                Position position6 = Position.BOTTOM_RIGHT;
                if (tn.p.f(str, position6.value)) {
                    return position6;
                }
                Position position7 = Position.BOTTOM;
                if (tn.p.f(str, position7.value)) {
                    return position7;
                }
                Position position8 = Position.BOTTOM_LEFT;
                if (tn.p.f(str, position8.value)) {
                    return position8;
                }
                Position position9 = Position.CENTER;
                if (tn.p.f(str, position9.value)) {
                    return position9;
                }
                return null;
            }

            @NotNull
            public final String b(@NotNull Position position) {
                return position.value;
            }
        }

        Position(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: DivTooltip.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivTooltip a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().P8().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f57979n = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f57980o = Expression.Companion.constant$default(companion, 5000L, null, 2, null);
        f57981p = new DivTooltipMode.b(new DivTooltipModeModal());
        f57982q = new sn.p<ParsingEnvironment, JSONObject, DivTooltip>() { // from class: com.yandex.div2.DivTooltip$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivTooltip mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivTooltip.f57978m.a(parsingEnvironment, jSONObject);
            }
        };
    }

    public DivTooltip(@Nullable DivAnimation divAnimation, @Nullable DivAnimation divAnimation2, @Nullable Expression<String> expression, @NotNull Expression<Boolean> expression2, @NotNull Div div, @NotNull Expression<Long> expression3, @NotNull String str, @NotNull DivTooltipMode divTooltipMode, @Nullable DivPoint divPoint, @NotNull Expression<Position> expression4, @Nullable List<DivAction> list) {
        this.f57983a = divAnimation;
        this.f57984b = divAnimation2;
        this.f57985c = expression;
        this.f57986d = expression2;
        this.f57987e = div;
        this.f57988f = expression3;
        this.f57989g = str;
        this.f57990h = divTooltipMode;
        this.f57991i = divPoint;
        this.f57992j = expression4;
        this.f57993k = list;
    }

    public final boolean a(@Nullable DivTooltip divTooltip, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        boolean z10;
        if (divTooltip == null) {
            return false;
        }
        DivAnimation divAnimation = this.f57983a;
        if (!(divAnimation != null ? divAnimation.a(divTooltip.f57983a, expressionResolver, expressionResolver2) : divTooltip.f57983a == null)) {
            return false;
        }
        DivAnimation divAnimation2 = this.f57984b;
        if (!(divAnimation2 != null ? divAnimation2.a(divTooltip.f57984b, expressionResolver, expressionResolver2) : divTooltip.f57984b == null)) {
            return false;
        }
        Expression<String> expression = this.f57985c;
        String strEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<String> expression2 = divTooltip.f57985c;
        if (!tn.p.f(strEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) || this.f57986d.evaluate(expressionResolver).booleanValue() != divTooltip.f57986d.evaluate(expressionResolver2).booleanValue() || !this.f57987e.a(divTooltip.f57987e, expressionResolver, expressionResolver2) || this.f57988f.evaluate(expressionResolver).longValue() != divTooltip.f57988f.evaluate(expressionResolver2).longValue() || !tn.p.f(this.f57989g, divTooltip.f57989g) || !this.f57990h.a(divTooltip.f57990h, expressionResolver, expressionResolver2)) {
            return false;
        }
        DivPoint divPoint = this.f57991i;
        if (!(divPoint != null ? divPoint.a(divTooltip.f57991i, expressionResolver, expressionResolver2) : divTooltip.f57991i == null) || this.f57992j.evaluate(expressionResolver) != divTooltip.f57992j.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivAction> list = this.f57993k;
        List<DivAction> list2 = divTooltip.f57993k;
        if (list != null) {
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
        if (list2 != null) {
            z10 = false;
            break;
        }
        z10 = true;
        return z10;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f57994l;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivTooltip.class).hashCode();
        DivAnimation divAnimation = this.f57983a;
        int iHash = 0;
        int iHash2 = iHashCode + (divAnimation != null ? divAnimation.hash() : 0);
        DivAnimation divAnimation2 = this.f57984b;
        int iHash3 = iHash2 + (divAnimation2 != null ? divAnimation2.hash() : 0);
        Expression<String> expression = this.f57985c;
        int iHashCode2 = iHash3 + (expression != null ? expression.hashCode() : 0) + this.f57986d.hashCode() + this.f57987e.hash() + this.f57988f.hashCode() + this.f57989g.hashCode() + this.f57990h.hash();
        DivPoint divPoint = this.f57991i;
        int iHash4 = iHashCode2 + (divPoint != null ? divPoint.hash() : 0) + this.f57992j.hashCode();
        List<DivAction> list = this.f57993k;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                iHash += ((DivAction) it.next()).hash();
            }
        }
        int i10 = iHash4 + iHash;
        this.f57994l = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().P8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
