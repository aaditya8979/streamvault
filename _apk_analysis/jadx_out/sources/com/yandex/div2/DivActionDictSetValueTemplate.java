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

/* JADX INFO: compiled from: DivActionDictSetValueTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivActionDictSetValueTemplate implements JSONSerializable, JsonTemplate<DivActionDictSetValue> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f54288d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionDictSetValueTemplate> f54289e = new sn.p<ParsingEnvironment, JSONObject, DivActionDictSetValueTemplate>() { // from class: com.yandex.div2.DivActionDictSetValueTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionDictSetValueTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivActionDictSetValueTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f54290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<DivTypedValueTemplate> f54291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f54292c;

    /* JADX INFO: compiled from: DivActionDictSetValueTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivActionDictSetValueTemplate(@NotNull Field<Expression<String>> field, @NotNull Field<DivTypedValueTemplate> field2, @NotNull Field<Expression<String>> field3) {
        this.f54290a = field;
        this.f54291b = field2;
        this.f54292c = field3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivActionDictSetValueTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivActionDictSetValueTemplate divActionDictSetValueTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivActionDictSetValueTemplate(ParsingEnvironment parsingEnvironment, DivActionDictSetValueTemplate divActionDictSetValueTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divActionDictSetValueTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().j0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
