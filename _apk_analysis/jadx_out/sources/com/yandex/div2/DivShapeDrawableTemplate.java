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

/* JADX INFO: compiled from: DivShapeDrawableTemplate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivShapeDrawableTemplate implements JSONSerializable, JsonTemplate<DivShapeDrawable> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f56937d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivShapeDrawableTemplate> f56938e = new sn.p<ParsingEnvironment, JSONObject, DivShapeDrawableTemplate>() { // from class: com.yandex.div2.DivShapeDrawableTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivShapeDrawableTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivShapeDrawableTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Integer>> f56939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<DivShapeTemplate> f56940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<DivStrokeTemplate> f56941c;

    /* JADX INFO: compiled from: DivShapeDrawableTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivShapeDrawableTemplate(@NotNull Field<Expression<Integer>> field, @NotNull Field<DivShapeTemplate> field2, @NotNull Field<DivStrokeTemplate> field3) {
        this.f56939a = field;
        this.f56940b = field2;
        this.f56941c = field3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivShapeDrawableTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivShapeDrawableTemplate divShapeDrawableTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivShapeDrawableTemplate(ParsingEnvironment parsingEnvironment, DivShapeDrawableTemplate divShapeDrawableTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divShapeDrawableTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().T6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
