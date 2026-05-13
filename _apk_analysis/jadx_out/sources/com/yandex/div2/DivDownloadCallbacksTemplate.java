package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivDownloadCallbacksTemplate.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivDownloadCallbacksTemplate implements JSONSerializable, JsonTemplate<DivDownloadCallbacks> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f55181c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivDownloadCallbacksTemplate> f55182d = new sn.p<ParsingEnvironment, JSONObject, DivDownloadCallbacksTemplate>() { // from class: com.yandex.div2.DivDownloadCallbacksTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivDownloadCallbacksTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivDownloadCallbacksTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f55183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f55184b;

    /* JADX INFO: compiled from: DivDownloadCallbacksTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivDownloadCallbacksTemplate(@NotNull Field<List<DivActionTemplate>> field, @NotNull Field<List<DivActionTemplate>> field2) {
        this.f55183a = field;
        this.f55184b = field2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivDownloadCallbacksTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivDownloadCallbacksTemplate divDownloadCallbacksTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivDownloadCallbacksTemplate(ParsingEnvironment parsingEnvironment, DivDownloadCallbacksTemplate divDownloadCallbacksTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divDownloadCallbacksTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().T2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
