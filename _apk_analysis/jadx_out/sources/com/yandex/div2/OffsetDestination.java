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

/* JADX INFO: compiled from: OffsetDestination.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class OffsetDestination implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f58628c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, OffsetDestination> f58629d = new sn.p<ParsingEnvironment, JSONObject, OffsetDestination>() { // from class: com.yandex.div2.OffsetDestination$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final OffsetDestination mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return OffsetDestination.f58628c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f58630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f58631b;

    /* JADX INFO: compiled from: OffsetDestination.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final OffsetDestination a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().U9().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public OffsetDestination(@NotNull Expression<Long> expression) {
        this.f58630a = expression;
    }

    public final boolean a(@Nullable OffsetDestination offsetDestination, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return offsetDestination != null && this.f58630a.evaluate(expressionResolver).longValue() == offsetDestination.f58630a.evaluate(expressionResolver2).longValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f58631b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(OffsetDestination.class).hashCode() + this.f58630a.hashCode();
        this.f58631b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().U9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
