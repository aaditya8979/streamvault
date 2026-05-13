package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionDownloadTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivActionDownloadTemplate implements JSONSerializable, JsonTemplate<DivActionDownload> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f54299d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionDownloadTemplate> f54300e = new sn.p<ParsingEnvironment, JSONObject, DivActionDownloadTemplate>() { // from class: com.yandex.div2.DivActionDownloadTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionDownloadTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivActionDownloadTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f54301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f54302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Uri>> f54303c;

    /* JADX INFO: compiled from: DivActionDownloadTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivActionDownloadTemplate(@NotNull Field<List<DivActionTemplate>> field, @NotNull Field<List<DivActionTemplate>> field2, @NotNull Field<Expression<Uri>> field3) {
        this.f54301a = field;
        this.f54302b = field2;
        this.f54303c = field3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivActionDownloadTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivActionDownloadTemplate divActionDownloadTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivActionDownloadTemplate(ParsingEnvironment parsingEnvironment, DivActionDownloadTemplate divActionDownloadTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divActionDownloadTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().m0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
