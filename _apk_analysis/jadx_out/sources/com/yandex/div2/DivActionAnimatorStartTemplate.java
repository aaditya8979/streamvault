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

/* JADX INFO: compiled from: DivActionAnimatorStartTemplate.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivActionAnimatorStartTemplate implements JSONSerializable, JsonTemplate<DivActionAnimatorStart> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final a f54213i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionAnimatorStartTemplate> f54214j = new sn.p<ParsingEnvironment, JSONObject, DivActionAnimatorStartTemplate>() { // from class: com.yandex.div2.DivActionAnimatorStartTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionAnimatorStartTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivActionAnimatorStartTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<String> f54215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAnimationDirection>> f54216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f54217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<DivTypedValueTemplate> f54218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivAnimationInterpolator>> f54219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Field<DivCountTemplate> f54220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f54221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Field<DivTypedValueTemplate> f54222h;

    /* JADX INFO: compiled from: DivActionAnimatorStartTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivActionAnimatorStartTemplate(@NotNull Field<String> field, @NotNull Field<Expression<DivAnimationDirection>> field2, @NotNull Field<Expression<Long>> field3, @NotNull Field<DivTypedValueTemplate> field4, @NotNull Field<Expression<DivAnimationInterpolator>> field5, @NotNull Field<DivCountTemplate> field6, @NotNull Field<Expression<Long>> field7, @NotNull Field<DivTypedValueTemplate> field8) {
        this.f54215a = field;
        this.f54216b = field2;
        this.f54217c = field3;
        this.f54218d = field4;
        this.f54219e = field5;
        this.f54220f = field6;
        this.f54221g = field7;
        this.f54222h = field8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivActionAnimatorStartTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivActionAnimatorStartTemplate divActionAnimatorStartTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivActionAnimatorStartTemplate(ParsingEnvironment parsingEnvironment, DivActionAnimatorStartTemplate divActionAnimatorStartTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divActionAnimatorStartTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().L().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
