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

/* JADX INFO: compiled from: IndexDestination.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class IndexDestination implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f58284c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, IndexDestination> f58285d = new sn.p<ParsingEnvironment, JSONObject, IndexDestination>() { // from class: com.yandex.div2.IndexDestination$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final IndexDestination mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return IndexDestination.f58284c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f58286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f58287b;

    /* JADX INFO: compiled from: IndexDestination.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final IndexDestination a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().F9().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public IndexDestination(@NotNull Expression<Long> expression) {
        this.f58286a = expression;
    }

    public final boolean a(@Nullable IndexDestination indexDestination, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return indexDestination != null && this.f58286a.evaluate(expressionResolver).longValue() == indexDestination.f58286a.evaluate(expressionResolver2).longValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f58287b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(IndexDestination.class).hashCode() + this.f58286a.hashCode();
        this.f58287b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().F9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
