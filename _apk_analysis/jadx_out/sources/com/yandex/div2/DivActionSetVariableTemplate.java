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

/* JADX INFO: compiled from: DivActionSetVariableTemplate.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivActionSetVariableTemplate implements JSONSerializable, JsonTemplate<DivActionSetVariable> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f54410c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionSetVariableTemplate> f54411d = new sn.p<ParsingEnvironment, JSONObject, DivActionSetVariableTemplate>() { // from class: com.yandex.div2.DivActionSetVariableTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionSetVariableTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivActionSetVariableTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<DivTypedValueTemplate> f54412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f54413b;

    /* JADX INFO: compiled from: DivActionSetVariableTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivActionSetVariableTemplate(@NotNull Field<DivTypedValueTemplate> field, @NotNull Field<Expression<String>> field2) {
        this.f54412a = field;
        this.f54413b = field2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivActionSetVariableTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivActionSetVariableTemplate divActionSetVariableTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivActionSetVariableTemplate(ParsingEnvironment parsingEnvironment, DivActionSetVariableTemplate divActionSetVariableTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divActionSetVariableTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().Q0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
