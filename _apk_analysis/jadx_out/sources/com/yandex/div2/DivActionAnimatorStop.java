package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionAnimatorStop.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivActionAnimatorStop implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f54223c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionAnimatorStop> f54224d = new sn.p<ParsingEnvironment, JSONObject, DivActionAnimatorStop>() { // from class: com.yandex.div2.DivActionAnimatorStop$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionAnimatorStop mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionAnimatorStop.f54223c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f54225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f54226b;

    /* JADX INFO: compiled from: DivActionAnimatorStop.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivActionAnimatorStop a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().N().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivActionAnimatorStop(@NotNull String str) {
        this.f54225a = str;
    }

    public final boolean a(@Nullable DivActionAnimatorStop divActionAnimatorStop, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divActionAnimatorStop == null) {
            return false;
        }
        return tn.p.f(this.f54225a, divActionAnimatorStop.f54225a);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54226b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivActionAnimatorStop.class).hashCode() + this.f54225a.hashCode();
        this.f54226b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().N().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
