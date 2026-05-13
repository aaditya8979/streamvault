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

/* JADX INFO: compiled from: UrlValue.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class UrlValue implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f58679c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, UrlValue> f58680d = new sn.p<ParsingEnvironment, JSONObject, UrlValue>() { // from class: com.yandex.div2.UrlValue$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final UrlValue mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return UrlValue.f58679c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Uri> f58681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f58682b;

    /* JADX INFO: compiled from: UrlValue.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final UrlValue a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().ja().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public UrlValue(@NotNull Expression<Uri> expression) {
        this.f58681a = expression;
    }

    public final boolean a(@Nullable UrlValue urlValue, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (urlValue == null) {
            return false;
        }
        return tn.p.f(this.f58681a.evaluate(expressionResolver), urlValue.f58681a.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f58682b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(UrlValue.class).hashCode() + this.f58681a.hashCode();
        this.f58682b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().ja().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
