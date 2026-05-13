package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPhoneInputMaskTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivPhoneInputMaskTemplate implements JSONSerializable, JsonTemplate<DivPhoneInputMask> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f56525b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivPhoneInputMaskTemplate> f56526c = new sn.p<ParsingEnvironment, JSONObject, DivPhoneInputMaskTemplate>() { // from class: com.yandex.div2.DivPhoneInputMaskTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPhoneInputMaskTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivPhoneInputMaskTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<String> f56527a;

    /* JADX INFO: compiled from: DivPhoneInputMaskTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivPhoneInputMaskTemplate(@NotNull Field<String> field) {
        this.f56527a = field;
    }

    public DivPhoneInputMaskTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivPhoneInputMaskTemplate divPhoneInputMaskTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivPhoneInputMaskTemplate(ParsingEnvironment parsingEnvironment, DivPhoneInputMaskTemplate divPhoneInputMaskTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divPhoneInputMaskTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().O5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
