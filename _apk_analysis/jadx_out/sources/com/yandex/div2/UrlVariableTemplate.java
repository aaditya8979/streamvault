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

/* JADX INFO: compiled from: UrlVariableTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class UrlVariableTemplate implements JSONSerializable, JsonTemplate<UrlVariable> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f58691c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, UrlVariableTemplate> f58692d = new sn.p<ParsingEnvironment, JSONObject, UrlVariableTemplate>() { // from class: com.yandex.div2.UrlVariableTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final UrlVariableTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new UrlVariableTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<String> f58693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Uri>> f58694b;

    /* JADX INFO: compiled from: UrlVariableTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public UrlVariableTemplate(@NotNull Field<String> field, @NotNull Field<Expression<Uri>> field2) {
        this.f58693a = field;
        this.f58694b = field2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UrlVariableTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable UrlVariableTemplate urlVariableTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ UrlVariableTemplate(ParsingEnvironment parsingEnvironment, UrlVariableTemplate urlVariableTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : urlVariableTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().na().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
