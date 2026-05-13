package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivCurrencyInputMaskTemplate.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivCurrencyInputMaskTemplate implements JSONSerializable, JsonTemplate<DivCurrencyInputMask> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f55006c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivCurrencyInputMaskTemplate> f55007d = new sn.p<ParsingEnvironment, JSONObject, DivCurrencyInputMaskTemplate>() { // from class: com.yandex.div2.DivCurrencyInputMaskTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivCurrencyInputMaskTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivCurrencyInputMaskTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f55008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<String> f55009b;

    /* JADX INFO: compiled from: DivCurrencyInputMaskTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivCurrencyInputMaskTemplate(@NotNull Field<Expression<String>> field, @NotNull Field<String> field2) {
        this.f55008a = field;
        this.f55009b = field2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivCurrencyInputMaskTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivCurrencyInputMaskTemplate divCurrencyInputMaskTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivCurrencyInputMaskTemplate(ParsingEnvironment parsingEnvironment, DivCurrencyInputMaskTemplate divCurrencyInputMaskTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divCurrencyInputMaskTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().z2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
