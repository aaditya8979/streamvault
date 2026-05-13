package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFilterRtlMirror.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivFilterRtlMirror implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f55285b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivFilterRtlMirror> f55286c = new sn.p<ParsingEnvironment, JSONObject, DivFilterRtlMirror>() { // from class: com.yandex.div2.DivFilterRtlMirror$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivFilterRtlMirror mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivFilterRtlMirror.f55285b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Integer f55287a;

    /* JADX INFO: compiled from: DivFilterRtlMirror.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivFilterRtlMirror a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().k3().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(@Nullable DivFilterRtlMirror divFilterRtlMirror, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return divFilterRtlMirror != null;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f55287a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivFilterRtlMirror.class).hashCode();
        this.f55287a = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().k3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
