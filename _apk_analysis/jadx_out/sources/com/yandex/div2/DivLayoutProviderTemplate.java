package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivLayoutProviderTemplate.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DivLayoutProviderTemplate implements JSONSerializable, JsonTemplate<DivLayoutProvider> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f56175c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivLayoutProviderTemplate> f56176d = new sn.p<ParsingEnvironment, JSONObject, DivLayoutProviderTemplate>() { // from class: com.yandex.div2.DivLayoutProviderTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivLayoutProviderTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivLayoutProviderTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<String> f56177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<String> f56178b;

    /* JADX INFO: compiled from: DivLayoutProviderTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivLayoutProviderTemplate(@NotNull Field<String> field, @NotNull Field<String> field2) {
        this.f56177a = field;
        this.f56178b = field2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivLayoutProviderTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivLayoutProviderTemplate divLayoutProviderTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivLayoutProviderTemplate(ParsingEnvironment parsingEnvironment, DivLayoutProviderTemplate divLayoutProviderTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divLayoutProviderTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().Q4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
