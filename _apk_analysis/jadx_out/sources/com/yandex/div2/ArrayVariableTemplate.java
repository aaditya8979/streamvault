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

/* JADX INFO: compiled from: ArrayVariableTemplate.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ArrayVariableTemplate implements JSONSerializable, JsonTemplate<ArrayVariable> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f54029c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, ArrayVariableTemplate> f54030d = new sn.p<ParsingEnvironment, JSONObject, ArrayVariableTemplate>() { // from class: com.yandex.div2.ArrayVariableTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final ArrayVariableTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new ArrayVariableTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<String> f54031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<JSONArray>> f54032b;

    /* JADX INFO: compiled from: ArrayVariableTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public ArrayVariableTemplate(@NotNull Field<String> field, @NotNull Field<Expression<JSONArray>> field2) {
        this.f54031a = field;
        this.f54032b = field2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ArrayVariableTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable ArrayVariableTemplate arrayVariableTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ ArrayVariableTemplate(ParsingEnvironment parsingEnvironment, ArrayVariableTemplate arrayVariableTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : arrayVariableTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().e().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
