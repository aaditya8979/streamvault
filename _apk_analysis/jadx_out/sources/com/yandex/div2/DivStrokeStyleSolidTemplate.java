package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStrokeStyleSolidTemplate.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DivStrokeStyleSolidTemplate implements JSONSerializable, JsonTemplate<DivStrokeStyleSolid> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f57303a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivStrokeStyleSolidTemplate> f57304b = new sn.p<ParsingEnvironment, JSONObject, DivStrokeStyleSolidTemplate>() { // from class: com.yandex.div2.DivStrokeStyleSolidTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivStrokeStyleSolidTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivStrokeStyleSolidTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: compiled from: DivStrokeStyleSolidTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivStrokeStyleSolidTemplate() {
    }

    public DivStrokeStyleSolidTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivStrokeStyleSolidTemplate divStrokeStyleSolidTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        this();
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivStrokeStyleSolidTemplate(ParsingEnvironment parsingEnvironment, DivStrokeStyleSolidTemplate divStrokeStyleSolidTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divStrokeStyleSolidTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().M7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
