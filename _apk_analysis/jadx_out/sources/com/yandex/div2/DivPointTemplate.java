package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPointTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivPointTemplate implements JSONSerializable, JsonTemplate<DivPoint> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f56566c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivPointTemplate> f56567d = new sn.p<ParsingEnvironment, JSONObject, DivPointTemplate>() { // from class: com.yandex.div2.DivPointTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPointTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivPointTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<DivDimensionTemplate> f56568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<DivDimensionTemplate> f56569b;

    /* JADX INFO: compiled from: DivPointTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivPointTemplate(@NotNull Field<DivDimensionTemplate> field, @NotNull Field<DivDimensionTemplate> field2) {
        this.f56568a = field;
        this.f56569b = field2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivPointTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivPointTemplate divPointTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivPointTemplate(ParsingEnvironment parsingEnvironment, DivPointTemplate divPointTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divPointTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().a6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
