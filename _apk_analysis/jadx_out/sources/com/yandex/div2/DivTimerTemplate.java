package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTimerTemplate.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivTimerTemplate implements JSONSerializable, JsonTemplate<DivTimer> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f57969g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f57970h = Expression.Companion.constant$default(Expression.Companion, 0L, null, 2, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivTimerTemplate> f57971i = new sn.p<ParsingEnvironment, JSONObject, DivTimerTemplate>() { // from class: com.yandex.div2.DivTimerTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTimerTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivTimerTemplate(parsingEnvironment, (DivTimerTemplate) null, false, jSONObject, 6, (tn.i) null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f57972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f57973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<String> f57974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f57975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f57976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Field<String> f57977f;

    /* JADX INFO: compiled from: DivTimerTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivTimerTemplate(@NotNull Field<Expression<Long>> field, @NotNull Field<List<DivActionTemplate>> field2, @NotNull Field<String> field3, @NotNull Field<List<DivActionTemplate>> field4, @NotNull Field<Expression<Long>> field5, @NotNull Field<String> field6) {
        this.f57972a = field;
        this.f57973b = field2;
        this.f57974c = field3;
        this.f57975d = field4;
        this.f57976e = field5;
        this.f57977f = field6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivTimerTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivTimerTemplate divTimerTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this((Field<Expression<Long>>) companion.nullField(false), (Field<List<DivActionTemplate>>) companion.nullField(false), (Field<String>) companion.nullField(false), (Field<List<DivActionTemplate>>) companion.nullField(false), (Field<Expression<Long>>) companion.nullField(false), (Field<String>) companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivTimerTemplate(ParsingEnvironment parsingEnvironment, DivTimerTemplate divTimerTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divTimerTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().N8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
