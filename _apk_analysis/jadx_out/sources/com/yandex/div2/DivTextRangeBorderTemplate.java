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

/* JADX INFO: compiled from: DivTextRangeBorderTemplate.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivTextRangeBorderTemplate implements JSONSerializable, JsonTemplate<DivTextRangeBorder> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f57778c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivTextRangeBorderTemplate> f57779d = new sn.p<ParsingEnvironment, JSONObject, DivTextRangeBorderTemplate>() { // from class: com.yandex.div2.DivTextRangeBorderTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTextRangeBorderTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivTextRangeBorderTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f57780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<DivStrokeTemplate> f57781b;

    /* JADX INFO: compiled from: DivTextRangeBorderTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivTextRangeBorderTemplate(@NotNull Field<Expression<Long>> field, @NotNull Field<DivStrokeTemplate> field2) {
        this.f57780a = field;
        this.f57781b = field2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivTextRangeBorderTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivTextRangeBorderTemplate divTextRangeBorderTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivTextRangeBorderTemplate(ParsingEnvironment parsingEnvironment, DivTextRangeBorderTemplate divTextRangeBorderTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divTextRangeBorderTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().w8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
