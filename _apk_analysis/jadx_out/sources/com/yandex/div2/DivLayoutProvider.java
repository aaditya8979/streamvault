package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivLayoutProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivLayoutProvider implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f56170d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivLayoutProvider> f56171e = new sn.p<ParsingEnvironment, JSONObject, DivLayoutProvider>() { // from class: com.yandex.div2.DivLayoutProvider$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivLayoutProvider mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivLayoutProvider.f56170d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f56172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f56173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f56174c;

    /* JADX INFO: compiled from: DivLayoutProvider.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivLayoutProvider a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().P4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivLayoutProvider() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public DivLayoutProvider(@Nullable String str, @Nullable String str2) {
        this.f56172a = str;
        this.f56173b = str2;
    }

    public /* synthetic */ DivLayoutProvider(String str, String str2, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }

    public final boolean a(@Nullable DivLayoutProvider divLayoutProvider, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return divLayoutProvider != null && tn.p.f(this.f56172a, divLayoutProvider.f56172a) && tn.p.f(this.f56173b, divLayoutProvider.f56173b);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f56174c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivLayoutProvider.class).hashCode();
        String str = this.f56172a;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        String str2 = this.f56173b;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.f56174c = Integer.valueOf(iHashCode3);
        return iHashCode3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().P4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
