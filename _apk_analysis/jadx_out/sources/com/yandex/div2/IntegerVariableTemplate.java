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

/* JADX INFO: compiled from: IntegerVariableTemplate.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class IntegerVariableTemplate implements JSONSerializable, JsonTemplate<IntegerVariable> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f58303c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, IntegerVariableTemplate> f58304d = new sn.p<ParsingEnvironment, JSONObject, IntegerVariableTemplate>() { // from class: com.yandex.div2.IntegerVariableTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final IntegerVariableTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new IntegerVariableTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<String> f58305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f58306b;

    /* JADX INFO: compiled from: IntegerVariableTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public IntegerVariableTemplate(@NotNull Field<String> field, @NotNull Field<Expression<Long>> field2) {
        this.f58305a = field;
        this.f58306b = field2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IntegerVariableTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable IntegerVariableTemplate integerVariableTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ IntegerVariableTemplate(ParsingEnvironment parsingEnvironment, IntegerVariableTemplate integerVariableTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : integerVariableTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().M9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
