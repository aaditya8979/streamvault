package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTooltipModeModalTemplate.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivTooltipModeModalTemplate implements JSONSerializable, JsonTemplate<DivTooltipModeModal> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f58013a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivTooltipModeModalTemplate> f58014b = new sn.p<ParsingEnvironment, JSONObject, DivTooltipModeModalTemplate>() { // from class: com.yandex.div2.DivTooltipModeModalTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTooltipModeModalTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivTooltipModeModalTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: compiled from: DivTooltipModeModalTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivTooltipModeModalTemplate() {
    }

    public DivTooltipModeModalTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivTooltipModeModalTemplate divTooltipModeModalTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        this();
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivTooltipModeModalTemplate(ParsingEnvironment parsingEnvironment, DivTooltipModeModalTemplate divTooltipModeModalTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divTooltipModeModalTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().W8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
