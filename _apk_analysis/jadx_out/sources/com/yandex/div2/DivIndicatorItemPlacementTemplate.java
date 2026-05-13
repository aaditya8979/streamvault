package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivIndicatorItemPlacementTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivIndicatorItemPlacementTemplate.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DivIndicatorItemPlacementTemplate implements JSONSerializable, JsonTemplate<DivIndicatorItemPlacement> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f55877a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivIndicatorItemPlacementTemplate> f55878b = new sn.p<ParsingEnvironment, JSONObject, DivIndicatorItemPlacementTemplate>() { // from class: com.yandex.div2.DivIndicatorItemPlacementTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivIndicatorItemPlacementTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivIndicatorItemPlacementTemplate.a.b(DivIndicatorItemPlacementTemplate.f55877a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivIndicatorItemPlacementTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        public static /* synthetic */ DivIndicatorItemPlacementTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        @NotNull
        public final DivIndicatorItemPlacementTemplate a(@NotNull ParsingEnvironment parsingEnvironment, boolean z10, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().b4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivIndicatorItemPlacementTemplate.kt */
    public static final class b extends DivIndicatorItemPlacementTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivDefaultIndicatorItemPlacementTemplate f55879c;

        public b(@NotNull DivDefaultIndicatorItemPlacementTemplate divDefaultIndicatorItemPlacementTemplate) {
            super(null);
            this.f55879c = divDefaultIndicatorItemPlacementTemplate;
        }

        @NotNull
        public final DivDefaultIndicatorItemPlacementTemplate b() {
            return this.f55879c;
        }
    }

    /* JADX INFO: compiled from: DivIndicatorItemPlacementTemplate.kt */
    public static final class c extends DivIndicatorItemPlacementTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivStretchIndicatorItemPlacementTemplate f55880c;

        public c(@NotNull DivStretchIndicatorItemPlacementTemplate divStretchIndicatorItemPlacementTemplate) {
            super(null);
            this.f55880c = divStretchIndicatorItemPlacementTemplate;
        }

        @NotNull
        public final DivStretchIndicatorItemPlacementTemplate b() {
            return this.f55880c;
        }
    }

    public DivIndicatorItemPlacementTemplate() {
    }

    public /* synthetic */ DivIndicatorItemPlacementTemplate(tn.i iVar) {
        this();
    }

    @NotNull
    public final Object a() {
        if (this instanceof b) {
            return ((b) this).b();
        }
        if (this instanceof c) {
            return ((c) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final String getType() {
        if (this instanceof b) {
            return "default";
        }
        if (this instanceof c) {
            return "stretch";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().b4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
