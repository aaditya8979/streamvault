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

/* JADX INFO: compiled from: DivActionUpdateStructureTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivActionUpdateStructureTemplate implements JSONSerializable, JsonTemplate<DivActionUpdateStructure> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f54552d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionUpdateStructureTemplate> f54553e = new sn.p<ParsingEnvironment, JSONObject, DivActionUpdateStructureTemplate>() { // from class: com.yandex.div2.DivActionUpdateStructureTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionUpdateStructureTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivActionUpdateStructureTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f54554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<DivTypedValueTemplate> f54555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f54556c;

    /* JADX INFO: compiled from: DivActionUpdateStructureTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivActionUpdateStructureTemplate(@NotNull Field<Expression<String>> field, @NotNull Field<DivTypedValueTemplate> field2, @NotNull Field<Expression<String>> field3) {
        this.f54554a = field;
        this.f54555b = field2;
        this.f54556c = field3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivActionUpdateStructureTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivActionUpdateStructureTemplate divActionUpdateStructureTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivActionUpdateStructureTemplate(ParsingEnvironment parsingEnvironment, DivActionUpdateStructureTemplate divActionUpdateStructureTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divActionUpdateStructureTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().l1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
