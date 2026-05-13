package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: EndDestination.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class EndDestination implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f58279b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, EndDestination> f58280c = new sn.p<ParsingEnvironment, JSONObject, EndDestination>() { // from class: com.yandex.div2.EndDestination$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final EndDestination mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return EndDestination.f58279b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Integer f58281a;

    /* JADX INFO: compiled from: EndDestination.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final EndDestination a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().C9().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(@Nullable EndDestination endDestination, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return endDestination != null;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f58281a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(EndDestination.class).hashCode();
        this.f58281a = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().C9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
