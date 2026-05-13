package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPageSizeTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivPageSizeTemplate implements JSONSerializable, JsonTemplate<DivPageSize> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f56285b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivPageSizeTemplate> f56286c = new sn.p<ParsingEnvironment, JSONObject, DivPageSizeTemplate>() { // from class: com.yandex.div2.DivPageSizeTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPageSizeTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivPageSizeTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<DivPercentageSizeTemplate> f56287a;

    /* JADX INFO: compiled from: DivPageSizeTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivPageSizeTemplate(@NotNull Field<DivPercentageSizeTemplate> field) {
        this.f56287a = field;
    }

    public DivPageSizeTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivPageSizeTemplate divPageSizeTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivPageSizeTemplate(ParsingEnvironment parsingEnvironment, DivPageSizeTemplate divPageSizeTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divPageSizeTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().o5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
