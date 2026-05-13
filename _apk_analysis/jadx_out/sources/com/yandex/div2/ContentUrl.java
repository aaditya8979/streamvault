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

/* JADX INFO: compiled from: ContentUrl.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ContentUrl implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f54072c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, ContentUrl> f54073d = new sn.p<ParsingEnvironment, JSONObject, ContentUrl>() { // from class: com.yandex.div2.ContentUrl$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final ContentUrl mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return ContentUrl.f54072c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Uri> f54074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f54075b;

    /* JADX INFO: compiled from: ContentUrl.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final ContentUrl a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().v().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public ContentUrl(@NotNull Expression<Uri> expression) {
        this.f54074a = expression;
    }

    public final boolean a(@Nullable ContentUrl contentUrl, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (contentUrl == null) {
            return false;
        }
        return tn.p.f(this.f54074a.evaluate(expressionResolver), contentUrl.f54074a.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54075b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(ContentUrl.class).hashCode() + this.f54074a.hashCode();
        this.f54075b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().v().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
