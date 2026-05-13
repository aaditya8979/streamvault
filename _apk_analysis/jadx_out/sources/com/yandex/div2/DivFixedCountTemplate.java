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

/* JADX INFO: compiled from: DivFixedCountTemplate.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivFixedCountTemplate implements JSONSerializable, JsonTemplate<DivFixedCount> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f55298b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivFixedCountTemplate> f55299c = new sn.p<ParsingEnvironment, JSONObject, DivFixedCountTemplate>() { // from class: com.yandex.div2.DivFixedCountTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivFixedCountTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivFixedCountTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f55300a;

    /* JADX INFO: compiled from: DivFixedCountTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivFixedCountTemplate(@NotNull Field<Expression<Long>> field) {
        this.f55300a = field;
    }

    public DivFixedCountTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivFixedCountTemplate divFixedCountTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivFixedCountTemplate(ParsingEnvironment parsingEnvironment, DivFixedCountTemplate divFixedCountTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divFixedCountTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().o3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
