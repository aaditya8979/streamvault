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

/* JADX INFO: compiled from: DivTextRangeMaskBaseTemplate.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DivTextRangeMaskBaseTemplate implements JSONSerializable, JsonTemplate<DivTextRangeMaskBase> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f57810b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f57811c = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivTextRangeMaskBaseTemplate> f57812d = new sn.p<ParsingEnvironment, JSONObject, DivTextRangeMaskBaseTemplate>() { // from class: com.yandex.div2.DivTextRangeMaskBaseTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTextRangeMaskBaseTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivTextRangeMaskBaseTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f57813a;

    /* JADX INFO: compiled from: DivTextRangeMaskBaseTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivTextRangeMaskBaseTemplate(@NotNull Field<Expression<Boolean>> field) {
        this.f57813a = field;
    }

    public DivTextRangeMaskBaseTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivTextRangeMaskBaseTemplate divTextRangeMaskBaseTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivTextRangeMaskBaseTemplate(ParsingEnvironment parsingEnvironment, DivTextRangeMaskBaseTemplate divTextRangeMaskBaseTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divTextRangeMaskBaseTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().C8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
