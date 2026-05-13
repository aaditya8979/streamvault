package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivStrokeStyleTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStrokeStyleTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class DivStrokeStyleTemplate implements JSONSerializable, JsonTemplate<DivStrokeStyle> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f57305a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivStrokeStyleTemplate> f57306b = new sn.p<ParsingEnvironment, JSONObject, DivStrokeStyleTemplate>() { // from class: com.yandex.div2.DivStrokeStyleTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivStrokeStyleTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivStrokeStyleTemplate.a.b(DivStrokeStyleTemplate.f57305a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivStrokeStyleTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        public static /* synthetic */ DivStrokeStyleTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        @NotNull
        public final DivStrokeStyleTemplate a(@NotNull ParsingEnvironment parsingEnvironment, boolean z10, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().J7().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivStrokeStyleTemplate.kt */
    public static final class b extends DivStrokeStyleTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivStrokeStyleDashedTemplate f57307c;

        public b(@NotNull DivStrokeStyleDashedTemplate divStrokeStyleDashedTemplate) {
            super(null);
            this.f57307c = divStrokeStyleDashedTemplate;
        }

        @NotNull
        public final DivStrokeStyleDashedTemplate b() {
            return this.f57307c;
        }
    }

    /* JADX INFO: compiled from: DivStrokeStyleTemplate.kt */
    public static final class c extends DivStrokeStyleTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivStrokeStyleSolidTemplate f57308c;

        public c(@NotNull DivStrokeStyleSolidTemplate divStrokeStyleSolidTemplate) {
            super(null);
            this.f57308c = divStrokeStyleSolidTemplate;
        }

        @NotNull
        public final DivStrokeStyleSolidTemplate b() {
            return this.f57308c;
        }
    }

    public DivStrokeStyleTemplate() {
    }

    public /* synthetic */ DivStrokeStyleTemplate(tn.i iVar) {
        this();
    }

    @NotNull
    public final Object a() {
        if (this instanceof c) {
            return ((c) this).b();
        }
        if (this instanceof b) {
            return ((b) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final String getType() {
        if (this instanceof c) {
            return "solid";
        }
        if (this instanceof b) {
            return "dashed";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().J7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
