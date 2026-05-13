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

/* JADX INFO: compiled from: DivBorderTemplate.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivBorderTemplate implements JSONSerializable, JsonTemplate<DivBorder> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f54688f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f54689g = Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivBorderTemplate> f54690h = new sn.p<ParsingEnvironment, JSONObject, DivBorderTemplate>() { // from class: com.yandex.div2.DivBorderTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivBorderTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivBorderTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f54691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<DivCornersRadiusTemplate> f54692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f54693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<DivShadowTemplate> f54694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<DivStrokeTemplate> f54695e;

    /* JADX INFO: compiled from: DivBorderTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivBorderTemplate(@NotNull Field<Expression<Long>> field, @NotNull Field<DivCornersRadiusTemplate> field2, @NotNull Field<Expression<Boolean>> field3, @NotNull Field<DivShadowTemplate> field4, @NotNull Field<DivStrokeTemplate> field5) {
        this.f54691a = field;
        this.f54692b = field2;
        this.f54693c = field3;
        this.f54694d = field4;
        this.f54695e = field5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivBorderTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivBorderTemplate divBorderTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivBorderTemplate(ParsingEnvironment parsingEnvironment, DivBorderTemplate divBorderTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divBorderTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().M1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
