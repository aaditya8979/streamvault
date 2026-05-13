package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivActionTimer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionTimerTemplate.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DivActionTimerTemplate implements JSONSerializable, JsonTemplate<DivActionTimer> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f54495c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionTimerTemplate> f54496d = new sn.p<ParsingEnvironment, JSONObject, DivActionTimerTemplate>() { // from class: com.yandex.div2.DivActionTimerTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionTimerTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivActionTimerTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivActionTimer.Action>> f54497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f54498b;

    /* JADX INFO: compiled from: DivActionTimerTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivActionTimerTemplate(@NotNull Field<Expression<DivActionTimer.Action>> field, @NotNull Field<Expression<String>> field2) {
        this.f54497a = field;
        this.f54498b = field2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivActionTimerTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivActionTimerTemplate divActionTimerTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivActionTimerTemplate(ParsingEnvironment parsingEnvironment, DivActionTimerTemplate divActionTimerTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divActionTimerTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().f1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
