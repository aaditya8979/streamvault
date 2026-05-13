package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPoint.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivPoint implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f56561d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivPoint> f56562e = new sn.p<ParsingEnvironment, JSONObject, DivPoint>() { // from class: com.yandex.div2.DivPoint$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPoint mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivPoint.f56561d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DivDimension f56563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DivDimension f56564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f56565c;

    /* JADX INFO: compiled from: DivPoint.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivPoint a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().Z5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivPoint(@NotNull DivDimension divDimension, @NotNull DivDimension divDimension2) {
        this.f56563a = divDimension;
        this.f56564b = divDimension2;
    }

    public final boolean a(@Nullable DivPoint divPoint, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return divPoint != null && this.f56563a.a(divPoint.f56563a, expressionResolver, expressionResolver2) && this.f56564b.a(divPoint.f56564b, expressionResolver, expressionResolver2);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f56565c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivPoint.class).hashCode() + this.f56563a.hash() + this.f56564b.hash();
        this.f56565c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().Z5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
