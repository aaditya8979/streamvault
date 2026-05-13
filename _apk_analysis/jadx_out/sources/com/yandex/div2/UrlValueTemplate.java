package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: UrlValueTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class UrlValueTemplate implements JSONSerializable, JsonTemplate<UrlValue> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f58683b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, UrlValueTemplate> f58684c = new sn.p<ParsingEnvironment, JSONObject, UrlValueTemplate>() { // from class: com.yandex.div2.UrlValueTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final UrlValueTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new UrlValueTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Uri>> f58685a;

    /* JADX INFO: compiled from: UrlValueTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public UrlValueTemplate(@NotNull Field<Expression<Uri>> field) {
        this.f58685a = field;
    }

    public UrlValueTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable UrlValueTemplate urlValueTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ UrlValueTemplate(ParsingEnvironment parsingEnvironment, UrlValueTemplate urlValueTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : urlValueTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().ka().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
