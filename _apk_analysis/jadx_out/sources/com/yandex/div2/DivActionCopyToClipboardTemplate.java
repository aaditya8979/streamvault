package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionCopyToClipboardTemplate.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivActionCopyToClipboardTemplate implements JSONSerializable, JsonTemplate<DivActionCopyToClipboard> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f54279b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionCopyToClipboardTemplate> f54280c = new sn.p<ParsingEnvironment, JSONObject, DivActionCopyToClipboardTemplate>() { // from class: com.yandex.div2.DivActionCopyToClipboardTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionCopyToClipboardTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivActionCopyToClipboardTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<DivActionCopyToClipboardContentTemplate> f54281a;

    /* JADX INFO: compiled from: DivActionCopyToClipboardTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivActionCopyToClipboardTemplate(@NotNull Field<DivActionCopyToClipboardContentTemplate> field) {
        this.f54281a = field;
    }

    public DivActionCopyToClipboardTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivActionCopyToClipboardTemplate divActionCopyToClipboardTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivActionCopyToClipboardTemplate(ParsingEnvironment parsingEnvironment, DivActionCopyToClipboardTemplate divActionCopyToClipboardTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divActionCopyToClipboardTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().g0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
