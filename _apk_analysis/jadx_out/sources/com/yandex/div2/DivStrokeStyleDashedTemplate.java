package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStrokeStyleDashedTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivStrokeStyleDashedTemplate implements JSONSerializable, JsonTemplate<DivStrokeStyleDashed> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f57298a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivStrokeStyleDashedTemplate> f57299b = new sn.p<ParsingEnvironment, JSONObject, DivStrokeStyleDashedTemplate>() { // from class: com.yandex.div2.DivStrokeStyleDashedTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivStrokeStyleDashedTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivStrokeStyleDashedTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: compiled from: DivStrokeStyleDashedTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivStrokeStyleDashedTemplate() {
    }

    public DivStrokeStyleDashedTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivStrokeStyleDashedTemplate divStrokeStyleDashedTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        this();
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivStrokeStyleDashedTemplate(ParsingEnvironment parsingEnvironment, DivStrokeStyleDashedTemplate divStrokeStyleDashedTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divStrokeStyleDashedTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().G7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
