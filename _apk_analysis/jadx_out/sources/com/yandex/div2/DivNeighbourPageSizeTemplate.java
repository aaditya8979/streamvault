package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivNeighbourPageSizeTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivNeighbourPageSizeTemplate implements JSONSerializable, JsonTemplate<DivNeighbourPageSize> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f56217b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivNeighbourPageSizeTemplate> f56218c = new sn.p<ParsingEnvironment, JSONObject, DivNeighbourPageSizeTemplate>() { // from class: com.yandex.div2.DivNeighbourPageSizeTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivNeighbourPageSizeTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivNeighbourPageSizeTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<DivFixedSizeTemplate> f56219a;

    /* JADX INFO: compiled from: DivNeighbourPageSizeTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivNeighbourPageSizeTemplate(@NotNull Field<DivFixedSizeTemplate> field) {
        this.f56219a = field;
    }

    public DivNeighbourPageSizeTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivNeighbourPageSizeTemplate divNeighbourPageSizeTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivNeighbourPageSizeTemplate(ParsingEnvironment parsingEnvironment, DivNeighbourPageSizeTemplate divNeighbourPageSizeTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divNeighbourPageSizeTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().c5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
