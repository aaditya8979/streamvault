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

/* JADX INFO: compiled from: ColorValue.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class ColorValue implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f54049c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, ColorValue> f54050d = new sn.p<ParsingEnvironment, JSONObject, ColorValue>() { // from class: com.yandex.div2.ColorValue$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final ColorValue mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return ColorValue.f54049c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Integer> f54051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f54052b;

    /* JADX INFO: compiled from: ColorValue.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final ColorValue a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().m().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public ColorValue(@NotNull Expression<Integer> expression) {
        this.f54051a = expression;
    }

    public final boolean a(@Nullable ColorValue colorValue, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return colorValue != null && this.f54051a.evaluate(expressionResolver).intValue() == colorValue.f54051a.evaluate(expressionResolver2).intValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54052b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(ColorValue.class).hashCode() + this.f54051a.hashCode();
        this.f54052b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().m().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
