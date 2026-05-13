package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivNeighbourPageSize.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DivNeighbourPageSize implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f56213c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivNeighbourPageSize> f56214d = new sn.p<ParsingEnvironment, JSONObject, DivNeighbourPageSize>() { // from class: com.yandex.div2.DivNeighbourPageSize$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivNeighbourPageSize mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivNeighbourPageSize.f56213c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DivFixedSize f56215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f56216b;

    /* JADX INFO: compiled from: DivNeighbourPageSize.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivNeighbourPageSize a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().b5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivNeighbourPageSize(@NotNull DivFixedSize divFixedSize) {
        this.f56215a = divFixedSize;
    }

    public final boolean a(@Nullable DivNeighbourPageSize divNeighbourPageSize, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divNeighbourPageSize == null) {
            return false;
        }
        return this.f56215a.a(divNeighbourPageSize.f56215a, expressionResolver, expressionResolver2);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f56216b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivNeighbourPageSize.class).hashCode() + this.f56215a.hash();
        this.f56216b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().b5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
