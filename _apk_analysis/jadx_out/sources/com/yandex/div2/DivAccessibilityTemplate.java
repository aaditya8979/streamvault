package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivAccessibility;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivAccessibilityTemplate.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivAccessibilityTemplate implements JSONSerializable, JsonTemplate<DivAccessibility> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f54160h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Expression<DivAccessibility.Mode> f54161i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f54162j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final DivAccessibility.Type f54163k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivAccessibilityTemplate> f54164l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f54165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f54166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f54167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAccessibility.Mode>> f54168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f54169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f54170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Field<DivAccessibility.Type> f54171g;

    /* JADX INFO: compiled from: DivAccessibilityTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f54161i = Expression.Companion.constant$default(companion, DivAccessibility.Mode.DEFAULT, null, 2, null);
        f54162j = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f54163k = DivAccessibility.Type.AUTO;
        f54164l = new sn.p<ParsingEnvironment, JSONObject, DivAccessibilityTemplate>() { // from class: com.yandex.div2.DivAccessibilityTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivAccessibilityTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivAccessibilityTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivAccessibilityTemplate(@NotNull Field<Expression<String>> field, @NotNull Field<Expression<String>> field2, @NotNull Field<Expression<Boolean>> field3, @NotNull Field<Expression<DivAccessibility.Mode>> field4, @NotNull Field<Expression<Boolean>> field5, @NotNull Field<Expression<String>> field6, @NotNull Field<DivAccessibility.Type> field7) {
        this.f54165a = field;
        this.f54166b = field2;
        this.f54167c = field3;
        this.f54168d = field4;
        this.f54169e = field5;
        this.f54170f = field6;
        this.f54171g = field7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivAccessibilityTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivAccessibilityTemplate divAccessibilityTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivAccessibilityTemplate(ParsingEnvironment parsingEnvironment, DivAccessibilityTemplate divAccessibilityTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divAccessibilityTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().I().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
