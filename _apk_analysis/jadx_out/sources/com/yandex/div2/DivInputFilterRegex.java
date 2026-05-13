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

/* JADX INFO: compiled from: DivInputFilterRegex.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivInputFilterRegex implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f56013c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivInputFilterRegex> f56014d = new sn.p<ParsingEnvironment, JSONObject, DivInputFilterRegex>() { // from class: com.yandex.div2.DivInputFilterRegex$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivInputFilterRegex mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivInputFilterRegex.f56013c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<String> f56015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f56016b;

    /* JADX INFO: compiled from: DivInputFilterRegex.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivInputFilterRegex a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().p4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivInputFilterRegex(@NotNull Expression<String> expression) {
        this.f56015a = expression;
    }

    public final boolean a(@Nullable DivInputFilterRegex divInputFilterRegex, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divInputFilterRegex == null) {
            return false;
        }
        return tn.p.f(this.f56015a.evaluate(expressionResolver), divInputFilterRegex.f56015a.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f56016b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivInputFilterRegex.class).hashCode() + this.f56015a.hashCode();
        this.f56016b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().p4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
