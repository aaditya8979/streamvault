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

/* JADX INFO: compiled from: DivActionArraySetValueTemplate.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivActionArraySetValueTemplate implements JSONSerializable, JsonTemplate<DivActionArraySetValue> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f54256d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionArraySetValueTemplate> f54257e = new sn.p<ParsingEnvironment, JSONObject, DivActionArraySetValueTemplate>() { // from class: com.yandex.div2.DivActionArraySetValueTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionArraySetValueTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivActionArraySetValueTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f54258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<DivTypedValueTemplate> f54259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f54260c;

    /* JADX INFO: compiled from: DivActionArraySetValueTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivActionArraySetValueTemplate(@NotNull Field<Expression<Long>> field, @NotNull Field<DivTypedValueTemplate> field2, @NotNull Field<Expression<String>> field3) {
        this.f54258a = field;
        this.f54259b = field2;
        this.f54260c = field3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivActionArraySetValueTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivActionArraySetValueTemplate divActionArraySetValueTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivActionArraySetValueTemplate(ParsingEnvironment parsingEnvironment, DivActionArraySetValueTemplate divActionArraySetValueTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divActionArraySetValueTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().X().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
