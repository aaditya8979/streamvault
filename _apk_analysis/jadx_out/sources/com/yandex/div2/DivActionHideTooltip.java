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

/* JADX INFO: compiled from: DivActionHideTooltip.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivActionHideTooltip implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f54311c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionHideTooltip> f54312d = new sn.p<ParsingEnvironment, JSONObject, DivActionHideTooltip>() { // from class: com.yandex.div2.DivActionHideTooltip$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionHideTooltip mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionHideTooltip.f54311c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<String> f54313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f54314b;

    /* JADX INFO: compiled from: DivActionHideTooltip.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivActionHideTooltip a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().r0().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivActionHideTooltip(@NotNull Expression<String> expression) {
        this.f54313a = expression;
    }

    public final boolean a(@Nullable DivActionHideTooltip divActionHideTooltip, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divActionHideTooltip == null) {
            return false;
        }
        return tn.p.f(this.f54313a.evaluate(expressionResolver), divActionHideTooltip.f54313a.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54314b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivActionHideTooltip.class).hashCode() + this.f54313a.hashCode();
        this.f54314b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().r0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
