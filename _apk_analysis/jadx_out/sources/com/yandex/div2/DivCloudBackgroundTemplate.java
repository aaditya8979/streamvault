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

/* JADX INFO: compiled from: DivCloudBackgroundTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivCloudBackgroundTemplate implements JSONSerializable, JsonTemplate<DivCloudBackground> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f54759d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivCloudBackgroundTemplate> f54760e = new sn.p<ParsingEnvironment, JSONObject, DivCloudBackgroundTemplate>() { // from class: com.yandex.div2.DivCloudBackgroundTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivCloudBackgroundTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivCloudBackgroundTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Integer>> f54761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f54762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f54763c;

    /* JADX INFO: compiled from: DivCloudBackgroundTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivCloudBackgroundTemplate(@NotNull Field<Expression<Integer>> field, @NotNull Field<Expression<Long>> field2, @NotNull Field<DivEdgeInsetsTemplate> field3) {
        this.f54761a = field;
        this.f54762b = field2;
        this.f54763c = field3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivCloudBackgroundTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivCloudBackgroundTemplate divCloudBackgroundTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivCloudBackgroundTemplate(ParsingEnvironment parsingEnvironment, DivCloudBackgroundTemplate divCloudBackgroundTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divCloudBackgroundTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().b2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
