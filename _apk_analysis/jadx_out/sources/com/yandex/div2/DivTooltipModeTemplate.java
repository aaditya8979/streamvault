package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivTooltipModeTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTooltipModeTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class DivTooltipModeTemplate implements JSONSerializable, JsonTemplate<DivTooltipMode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f58020a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivTooltipModeTemplate> f58021b = new sn.p<ParsingEnvironment, JSONObject, DivTooltipModeTemplate>() { // from class: com.yandex.div2.DivTooltipModeTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTooltipModeTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivTooltipModeTemplate.a.b(DivTooltipModeTemplate.f58020a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivTooltipModeTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        public static /* synthetic */ DivTooltipModeTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        @NotNull
        public final DivTooltipModeTemplate a(@NotNull ParsingEnvironment parsingEnvironment, boolean z10, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().T8().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivTooltipModeTemplate.kt */
    public static final class b extends DivTooltipModeTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivTooltipModeModalTemplate f58022c;

        public b(@NotNull DivTooltipModeModalTemplate divTooltipModeModalTemplate) {
            super(null);
            this.f58022c = divTooltipModeModalTemplate;
        }

        @NotNull
        public final DivTooltipModeModalTemplate b() {
            return this.f58022c;
        }
    }

    /* JADX INFO: compiled from: DivTooltipModeTemplate.kt */
    public static final class c extends DivTooltipModeTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivTooltipModeNonModalTemplate f58023c;

        public c(@NotNull DivTooltipModeNonModalTemplate divTooltipModeNonModalTemplate) {
            super(null);
            this.f58023c = divTooltipModeNonModalTemplate;
        }

        @NotNull
        public final DivTooltipModeNonModalTemplate b() {
            return this.f58023c;
        }
    }

    public DivTooltipModeTemplate() {
    }

    public /* synthetic */ DivTooltipModeTemplate(tn.i iVar) {
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
            return "non_modal";
        }
        if (this instanceof b) {
            return "modal";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().T8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
