package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivTrigger;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTriggerTemplate.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DivTriggerTemplate implements JSONSerializable, JsonTemplate<DivTrigger> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f58072d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Expression<DivTrigger.Mode> f58073e = Expression.Companion.constant$default(Expression.Companion, DivTrigger.Mode.ON_CONDITION, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivTriggerTemplate> f58074f = new sn.p<ParsingEnvironment, JSONObject, DivTriggerTemplate>() { // from class: com.yandex.div2.DivTriggerTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTriggerTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivTriggerTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f58075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f58076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivTrigger.Mode>> f58077c;

    /* JADX INFO: compiled from: DivTriggerTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivTriggerTemplate(@NotNull Field<List<DivActionTemplate>> field, @NotNull Field<Expression<Boolean>> field2, @NotNull Field<Expression<DivTrigger.Mode>> field3) {
        this.f58075a = field;
        this.f58076b = field2;
        this.f58077c = field3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivTriggerTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivTriggerTemplate divTriggerTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivTriggerTemplate(ParsingEnvironment parsingEnvironment, DivTriggerTemplate divTriggerTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divTriggerTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().f9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
