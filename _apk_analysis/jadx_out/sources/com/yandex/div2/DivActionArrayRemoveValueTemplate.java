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

/* JADX INFO: compiled from: DivActionArrayRemoveValueTemplate.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DivActionArrayRemoveValueTemplate implements JSONSerializable, JsonTemplate<DivActionArrayRemoveValue> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f54246c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionArrayRemoveValueTemplate> f54247d = new sn.p<ParsingEnvironment, JSONObject, DivActionArrayRemoveValueTemplate>() { // from class: com.yandex.div2.DivActionArrayRemoveValueTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionArrayRemoveValueTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivActionArrayRemoveValueTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f54248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f54249b;

    /* JADX INFO: compiled from: DivActionArrayRemoveValueTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivActionArrayRemoveValueTemplate(@NotNull Field<Expression<Long>> field, @NotNull Field<Expression<String>> field2) {
        this.f54248a = field;
        this.f54249b = field2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivActionArrayRemoveValueTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivActionArrayRemoveValueTemplate divActionArrayRemoveValueTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivActionArrayRemoveValueTemplate(ParsingEnvironment parsingEnvironment, DivActionArrayRemoveValueTemplate divActionArrayRemoveValueTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divActionArrayRemoveValueTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().U().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
