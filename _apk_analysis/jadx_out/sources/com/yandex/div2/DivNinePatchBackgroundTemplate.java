package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivNinePatchBackgroundTemplate.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DivNinePatchBackgroundTemplate implements JSONSerializable, JsonTemplate<DivNinePatchBackground> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f56225c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivNinePatchBackgroundTemplate> f56226d = new sn.p<ParsingEnvironment, JSONObject, DivNinePatchBackgroundTemplate>() { // from class: com.yandex.div2.DivNinePatchBackgroundTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivNinePatchBackgroundTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivNinePatchBackgroundTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Uri>> f56227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<DivAbsoluteEdgeInsetsTemplate> f56228b;

    /* JADX INFO: compiled from: DivNinePatchBackgroundTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivNinePatchBackgroundTemplate(@NotNull Field<Expression<Uri>> field, @NotNull Field<DivAbsoluteEdgeInsetsTemplate> field2) {
        this.f56227a = field;
        this.f56228b = field2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivNinePatchBackgroundTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivNinePatchBackgroundTemplate divNinePatchBackgroundTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivNinePatchBackgroundTemplate(ParsingEnvironment parsingEnvironment, DivNinePatchBackgroundTemplate divNinePatchBackgroundTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divNinePatchBackgroundTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().f5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
