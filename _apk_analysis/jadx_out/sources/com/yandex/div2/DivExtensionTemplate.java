package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivExtensionTemplate.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivExtensionTemplate implements JSONSerializable, JsonTemplate<DivExtension> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f55243c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivExtensionTemplate> f55244d = new sn.p<ParsingEnvironment, JSONObject, DivExtensionTemplate>() { // from class: com.yandex.div2.DivExtensionTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivExtensionTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivExtensionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<String> f55245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<JSONObject> f55246b;

    /* JADX INFO: compiled from: DivExtensionTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivExtensionTemplate(@NotNull Field<String> field, @NotNull Field<JSONObject> field2) {
        this.f55245a = field;
        this.f55246b = field2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivExtensionTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivExtensionTemplate divExtensionTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivExtensionTemplate(ParsingEnvironment parsingEnvironment, DivExtensionTemplate divExtensionTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divExtensionTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().c3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
