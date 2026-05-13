package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivExtension.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DivExtension implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f55238d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivExtension> f55239e = new sn.p<ParsingEnvironment, JSONObject, DivExtension>() { // from class: com.yandex.div2.DivExtension$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivExtension mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivExtension.f55238d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f55240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final JSONObject f55241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f55242c;

    /* JADX INFO: compiled from: DivExtension.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivExtension a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().b3().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivExtension(@NotNull String str, @Nullable JSONObject jSONObject) {
        this.f55240a = str;
        this.f55241b = jSONObject;
    }

    public final boolean a(@Nullable DivExtension divExtension, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return divExtension != null && tn.p.f(this.f55240a, divExtension.f55240a) && tn.p.f(this.f55241b, divExtension.f55241b);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f55242c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivExtension.class).hashCode() + this.f55240a.hashCode();
        JSONObject jSONObject = this.f55241b;
        int iHashCode2 = iHashCode + (jSONObject != null ? jSONObject.hashCode() : 0);
        this.f55242c = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().b3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
