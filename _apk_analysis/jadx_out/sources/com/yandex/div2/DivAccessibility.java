package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivAccessibility;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivAccessibility.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivAccessibility implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final a f54137i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final Expression<Mode> f54138j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f54139k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final Type f54140l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivAccessibility> f54141m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Expression<String> f54142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Expression<String> f54143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Expression<Boolean> f54144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Expression<Mode> f54145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f54146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Expression<String> f54147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Type f54148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public Integer f54149h;

    /* JADX INFO: compiled from: DivAccessibility.kt */
    public enum Mode {
        DEFAULT("default"),
        MERGE("merge"),
        EXCLUDE("exclude");


        @NotNull
        private final String value;

        @NotNull
        public static final a Converter = new a(null);

        @NotNull
        public static final sn.l<Mode, String> TO_STRING = new sn.l<Mode, String>() { // from class: com.yandex.div2.DivAccessibility$Mode$Converter$TO_STRING$1
            @Override // sn.l
            @NotNull
            public final String invoke(@NotNull DivAccessibility.Mode mode) {
                return DivAccessibility.Mode.Converter.b(mode);
            }
        };

        @NotNull
        public static final sn.l<String, Mode> FROM_STRING = new sn.l<String, Mode>() { // from class: com.yandex.div2.DivAccessibility$Mode$Converter$FROM_STRING$1
            @Override // sn.l
            @Nullable
            public final DivAccessibility.Mode invoke(@NotNull String str) {
                return DivAccessibility.Mode.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivAccessibility.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @Nullable
            public final Mode a(@NotNull String str) {
                Mode mode = Mode.DEFAULT;
                if (tn.p.f(str, mode.value)) {
                    return mode;
                }
                Mode mode2 = Mode.MERGE;
                if (tn.p.f(str, mode2.value)) {
                    return mode2;
                }
                Mode mode3 = Mode.EXCLUDE;
                if (tn.p.f(str, mode3.value)) {
                    return mode3;
                }
                return null;
            }

            @NotNull
            public final String b(@NotNull Mode mode) {
                return mode.value;
            }
        }

        Mode(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: DivAccessibility.kt */
    public enum Type {
        NONE("none"),
        BUTTON("button"),
        IMAGE("image"),
        TEXT("text"),
        EDIT_TEXT("edit_text"),
        HEADER("header"),
        TAB_BAR("tab_bar"),
        LIST("list"),
        SELECT("select"),
        CHECKBOX("checkbox"),
        RADIO("radio"),
        AUTO("auto");


        @NotNull
        private final String value;

        @NotNull
        public static final a Converter = new a(null);

        @NotNull
        public static final sn.l<Type, String> TO_STRING = new sn.l<Type, String>() { // from class: com.yandex.div2.DivAccessibility$Type$Converter$TO_STRING$1
            @Override // sn.l
            @NotNull
            public final String invoke(@NotNull DivAccessibility.Type type) {
                return DivAccessibility.Type.Converter.b(type);
            }
        };

        @NotNull
        public static final sn.l<String, Type> FROM_STRING = new sn.l<String, Type>() { // from class: com.yandex.div2.DivAccessibility$Type$Converter$FROM_STRING$1
            @Override // sn.l
            @Nullable
            public final DivAccessibility.Type invoke(@NotNull String str) {
                return DivAccessibility.Type.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivAccessibility.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @Nullable
            public final Type a(@NotNull String str) {
                Type type = Type.NONE;
                if (tn.p.f(str, type.value)) {
                    return type;
                }
                Type type2 = Type.BUTTON;
                if (tn.p.f(str, type2.value)) {
                    return type2;
                }
                Type type3 = Type.IMAGE;
                if (tn.p.f(str, type3.value)) {
                    return type3;
                }
                Type type4 = Type.TEXT;
                if (tn.p.f(str, type4.value)) {
                    return type4;
                }
                Type type5 = Type.EDIT_TEXT;
                if (tn.p.f(str, type5.value)) {
                    return type5;
                }
                Type type6 = Type.HEADER;
                if (tn.p.f(str, type6.value)) {
                    return type6;
                }
                Type type7 = Type.TAB_BAR;
                if (tn.p.f(str, type7.value)) {
                    return type7;
                }
                Type type8 = Type.LIST;
                if (tn.p.f(str, type8.value)) {
                    return type8;
                }
                Type type9 = Type.SELECT;
                if (tn.p.f(str, type9.value)) {
                    return type9;
                }
                Type type10 = Type.CHECKBOX;
                if (tn.p.f(str, type10.value)) {
                    return type10;
                }
                Type type11 = Type.RADIO;
                if (tn.p.f(str, type11.value)) {
                    return type11;
                }
                Type type12 = Type.AUTO;
                if (tn.p.f(str, type12.value)) {
                    return type12;
                }
                return null;
            }

            @NotNull
            public final String b(@NotNull Type type) {
                return type.value;
            }
        }

        Type(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: DivAccessibility.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivAccessibility a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().H().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f54138j = Expression.Companion.constant$default(companion, Mode.DEFAULT, null, 2, null);
        f54139k = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f54140l = Type.AUTO;
        f54141m = new sn.p<ParsingEnvironment, JSONObject, DivAccessibility>() { // from class: com.yandex.div2.DivAccessibility$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivAccessibility mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivAccessibility.f54137i.a(parsingEnvironment, jSONObject);
            }
        };
    }

    public DivAccessibility() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public DivAccessibility(@Nullable Expression<String> expression, @Nullable Expression<String> expression2, @Nullable Expression<Boolean> expression3, @NotNull Expression<Mode> expression4, @NotNull Expression<Boolean> expression5, @Nullable Expression<String> expression6, @NotNull Type type) {
        this.f54142a = expression;
        this.f54143b = expression2;
        this.f54144c = expression3;
        this.f54145d = expression4;
        this.f54146e = expression5;
        this.f54147f = expression6;
        this.f54148g = type;
    }

    public /* synthetic */ DivAccessibility(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Type type, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : expression, (i10 & 2) != 0 ? null : expression2, (i10 & 4) != 0 ? null : expression3, (i10 & 8) != 0 ? f54138j : expression4, (i10 & 16) != 0 ? f54139k : expression5, (i10 & 32) == 0 ? expression6 : null, (i10 & 64) != 0 ? f54140l : type);
    }

    public final boolean a(@Nullable DivAccessibility divAccessibility, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divAccessibility == null) {
            return false;
        }
        Expression<String> expression = this.f54142a;
        String strEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<String> expression2 = divAccessibility.f54142a;
        if (!tn.p.f(strEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<String> expression3 = this.f54143b;
        String strEvaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        Expression<String> expression4 = divAccessibility.f54143b;
        if (!tn.p.f(strEvaluate2, expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Boolean> expression5 = this.f54144c;
        Boolean boolEvaluate = expression5 != null ? expression5.evaluate(expressionResolver) : null;
        Expression<Boolean> expression6 = divAccessibility.f54144c;
        if (!tn.p.f(boolEvaluate, expression6 != null ? expression6.evaluate(expressionResolver2) : null) || this.f54145d.evaluate(expressionResolver) != divAccessibility.f54145d.evaluate(expressionResolver2) || this.f54146e.evaluate(expressionResolver).booleanValue() != divAccessibility.f54146e.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        Expression<String> expression7 = this.f54147f;
        String strEvaluate3 = expression7 != null ? expression7.evaluate(expressionResolver) : null;
        Expression<String> expression8 = divAccessibility.f54147f;
        return tn.p.f(strEvaluate3, expression8 != null ? expression8.evaluate(expressionResolver2) : null) && this.f54148g == divAccessibility.f54148g;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54149h;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivAccessibility.class).hashCode();
        Expression<String> expression = this.f54142a;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
        Expression<String> expression2 = this.f54143b;
        int iHashCode3 = iHashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        Expression<Boolean> expression3 = this.f54144c;
        int iHashCode4 = iHashCode3 + (expression3 != null ? expression3.hashCode() : 0) + this.f54145d.hashCode() + this.f54146e.hashCode();
        Expression<String> expression4 = this.f54147f;
        int iHashCode5 = iHashCode4 + (expression4 != null ? expression4.hashCode() : 0) + this.f54148g.hashCode();
        this.f54149h = Integer.valueOf(iHashCode5);
        return iHashCode5;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().H().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
