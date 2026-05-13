package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivTooltip;
import com.yandex.div2.DivTooltipMode;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTooltipTemplate.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivTooltipTemplate implements JSONSerializable, JsonTemplate<DivTooltip> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final a f58024l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f58025m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final Expression<Long> f58026n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final DivTooltipMode.b f58027o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivTooltipTemplate> f58028p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<DivAnimationTemplate> f58029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<DivAnimationTemplate> f58030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f58031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f58032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<DivTemplate> f58033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f58034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Field<String> f58035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Field<DivTooltipModeTemplate> f58036h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Field<DivPointTemplate> f58037i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivTooltip.Position>> f58038j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f58039k;

    /* JADX INFO: compiled from: DivTooltipTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f58025m = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f58026n = Expression.Companion.constant$default(companion, 5000L, null, 2, null);
        f58027o = new DivTooltipMode.b(new DivTooltipModeModal());
        f58028p = new sn.p<ParsingEnvironment, JSONObject, DivTooltipTemplate>() { // from class: com.yandex.div2.DivTooltipTemplate$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivTooltipTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivTooltipTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    public DivTooltipTemplate(@NotNull Field<DivAnimationTemplate> field, @NotNull Field<DivAnimationTemplate> field2, @NotNull Field<Expression<String>> field3, @NotNull Field<Expression<Boolean>> field4, @NotNull Field<DivTemplate> field5, @NotNull Field<Expression<Long>> field6, @NotNull Field<String> field7, @NotNull Field<DivTooltipModeTemplate> field8, @NotNull Field<DivPointTemplate> field9, @NotNull Field<Expression<DivTooltip.Position>> field10, @NotNull Field<List<DivActionTemplate>> field11) {
        this.f58029a = field;
        this.f58030b = field2;
        this.f58031c = field3;
        this.f58032d = field4;
        this.f58033e = field5;
        this.f58034f = field6;
        this.f58035g = field7;
        this.f58036h = field8;
        this.f58037i = field9;
        this.f58038j = field10;
        this.f58039k = field11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivTooltipTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivTooltipTemplate divTooltipTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivTooltipTemplate(ParsingEnvironment parsingEnvironment, DivTooltipTemplate divTooltipTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divTooltipTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().Q8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
