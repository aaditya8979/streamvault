package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: UrlVariable.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class UrlVariable implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f58686d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, UrlVariable> f58687e = new sn.p<ParsingEnvironment, JSONObject, UrlVariable>() { // from class: com.yandex.div2.UrlVariable$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final UrlVariable mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return UrlVariable.f58686d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f58688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<Uri> f58689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f58690c;

    /* JADX INFO: compiled from: UrlVariable.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final UrlVariable a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().ma().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public UrlVariable(@NotNull String str, @NotNull Expression<Uri> expression) {
        this.f58688a = str;
        this.f58689b = expression;
    }

    public final boolean a(@Nullable UrlVariable urlVariable, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return urlVariable != null && tn.p.f(this.f58688a, urlVariable.f58688a) && tn.p.f(this.f58689b.evaluate(expressionResolver), urlVariable.f58689b.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f58690c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(UrlVariable.class).hashCode() + this.f58688a.hashCode() + this.f58689b.hashCode();
        this.f58690c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().ma().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
