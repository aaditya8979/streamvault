package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInfinityCount.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivInfinityCount implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f55937b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivInfinityCount> f55938c = new sn.p<ParsingEnvironment, JSONObject, DivInfinityCount>() { // from class: com.yandex.div2.DivInfinityCount$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivInfinityCount mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivInfinityCount.f55937b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Integer f55939a;

    /* JADX INFO: compiled from: DivInfinityCount.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivInfinityCount a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().g4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(@Nullable DivInfinityCount divInfinityCount, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return divInfinityCount != null;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f55939a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivInfinityCount.class).hashCode();
        this.f55939a = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().g4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
