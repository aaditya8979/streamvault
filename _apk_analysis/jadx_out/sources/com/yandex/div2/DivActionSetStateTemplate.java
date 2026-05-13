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

/* JADX INFO: compiled from: DivActionSetStateTemplate.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DivActionSetStateTemplate implements JSONSerializable, JsonTemplate<DivActionSetState> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f54389c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f54390d = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionSetStateTemplate> f54391e = new sn.p<ParsingEnvironment, JSONObject, DivActionSetStateTemplate>() { // from class: com.yandex.div2.DivActionSetStateTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionSetStateTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivActionSetStateTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f54392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f54393b;

    /* JADX INFO: compiled from: DivActionSetStateTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivActionSetStateTemplate(@NotNull Field<Expression<String>> field, @NotNull Field<Expression<Boolean>> field2) {
        this.f54392a = field;
        this.f54393b = field2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivActionSetStateTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivActionSetStateTemplate divActionSetStateTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivActionSetStateTemplate(ParsingEnvironment parsingEnvironment, DivActionSetStateTemplate divActionSetStateTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divActionSetStateTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().K0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
