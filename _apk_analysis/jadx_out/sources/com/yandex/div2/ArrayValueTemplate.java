package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: ArrayValueTemplate.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ArrayValueTemplate implements JSONSerializable, JsonTemplate<ArrayValue> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f54021b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, ArrayValueTemplate> f54022c = new sn.p<ParsingEnvironment, JSONObject, ArrayValueTemplate>() { // from class: com.yandex.div2.ArrayValueTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final ArrayValueTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new ArrayValueTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<JSONArray>> f54023a;

    /* JADX INFO: compiled from: ArrayValueTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public ArrayValueTemplate(@NotNull Field<Expression<JSONArray>> field) {
        this.f54023a = field;
    }

    public ArrayValueTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable ArrayValueTemplate arrayValueTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ ArrayValueTemplate(ParsingEnvironment parsingEnvironment, ArrayValueTemplate arrayValueTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : arrayValueTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().b().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
