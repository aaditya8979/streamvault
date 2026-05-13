package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRadialGradientRelativeRadius.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivRadialGradientRelativeRadius implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f56628c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivRadialGradientRelativeRadius> f56629d = new sn.p<ParsingEnvironment, JSONObject, DivRadialGradientRelativeRadius>() { // from class: com.yandex.div2.DivRadialGradientRelativeRadius$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivRadialGradientRelativeRadius mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivRadialGradientRelativeRadius.f56628c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Value> f56630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f56631b;

    /* JADX INFO: compiled from: DivRadialGradientRelativeRadius.kt */
    public enum Value {
        NEAREST_CORNER("nearest_corner"),
        FARTHEST_CORNER("farthest_corner"),
        NEAREST_SIDE("nearest_side"),
        FARTHEST_SIDE("farthest_side");


        @NotNull
        private final String value;

        @NotNull
        public static final a Converter = new a(null);

        @NotNull
        public static final sn.l<Value, String> TO_STRING = new sn.l<Value, String>() { // from class: com.yandex.div2.DivRadialGradientRelativeRadius$Value$Converter$TO_STRING$1
            @Override // sn.l
            @NotNull
            public final String invoke(@NotNull DivRadialGradientRelativeRadius.Value value) {
                return DivRadialGradientRelativeRadius.Value.Converter.b(value);
            }
        };

        @NotNull
        public static final sn.l<String, Value> FROM_STRING = new sn.l<String, Value>() { // from class: com.yandex.div2.DivRadialGradientRelativeRadius$Value$Converter$FROM_STRING$1
            @Override // sn.l
            @Nullable
            public final DivRadialGradientRelativeRadius.Value invoke(@NotNull String str) {
                return DivRadialGradientRelativeRadius.Value.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivRadialGradientRelativeRadius.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @Nullable
            public final Value a(@NotNull String str) {
                Value value = Value.NEAREST_CORNER;
                if (tn.p.f(str, value.value)) {
                    return value;
                }
                Value value2 = Value.FARTHEST_CORNER;
                if (tn.p.f(str, value2.value)) {
                    return value2;
                }
                Value value3 = Value.NEAREST_SIDE;
                if (tn.p.f(str, value3.value)) {
                    return value3;
                }
                Value value4 = Value.FARTHEST_SIDE;
                if (tn.p.f(str, value4.value)) {
                    return value4;
                }
                return null;
            }

            @NotNull
            public final String b(@NotNull Value value) {
                return value.value;
            }
        }

        Value(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: DivRadialGradientRelativeRadius.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivRadialGradientRelativeRadius a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().u6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivRadialGradientRelativeRadius(@NotNull Expression<Value> expression) {
        this.f56630a = expression;
    }

    public final boolean a(@Nullable DivRadialGradientRelativeRadius divRadialGradientRelativeRadius, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return divRadialGradientRelativeRadius != null && this.f56630a.evaluate(expressionResolver) == divRadialGradientRelativeRadius.f56630a.evaluate(expressionResolver2);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f56631b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivRadialGradientRelativeRadius.class).hashCode() + this.f56630a.hashCode();
        this.f56631b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().u6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
