package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFilterRtlMirrorTemplate.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DivFilterRtlMirrorTemplate implements JSONSerializable, JsonTemplate<DivFilterRtlMirror> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f55288a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivFilterRtlMirrorTemplate> f55289b = new sn.p<ParsingEnvironment, JSONObject, DivFilterRtlMirrorTemplate>() { // from class: com.yandex.div2.DivFilterRtlMirrorTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivFilterRtlMirrorTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivFilterRtlMirrorTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: compiled from: DivFilterRtlMirrorTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivFilterRtlMirrorTemplate() {
    }

    public DivFilterRtlMirrorTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivFilterRtlMirrorTemplate divFilterRtlMirrorTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        this();
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivFilterRtlMirrorTemplate(ParsingEnvironment parsingEnvironment, DivFilterRtlMirrorTemplate divFilterRtlMirrorTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divFilterRtlMirrorTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().l3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
