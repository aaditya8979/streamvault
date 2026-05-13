package com.yandex.div2;

import ah.f6;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPhoneInputMask.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivPhoneInputMask implements JSONSerializable, Hashable, f6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f56521c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivPhoneInputMask> f56522d = new sn.p<ParsingEnvironment, JSONObject, DivPhoneInputMask>() { // from class: com.yandex.div2.DivPhoneInputMask$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPhoneInputMask mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivPhoneInputMask.f56521c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f56523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f56524b;

    /* JADX INFO: compiled from: DivPhoneInputMask.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivPhoneInputMask a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().N5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivPhoneInputMask(@NotNull String str) {
        this.f56523a = str;
    }

    @Override // ah.f6
    @NotNull
    public String a() {
        return this.f56523a;
    }

    public final boolean b(@Nullable DivPhoneInputMask divPhoneInputMask, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divPhoneInputMask == null) {
            return false;
        }
        return tn.p.f(a(), divPhoneInputMask.a());
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f56524b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivPhoneInputMask.class).hashCode() + a().hashCode();
        this.f56524b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().N5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
