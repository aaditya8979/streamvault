package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivBackgroundTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivBackgroundTemplate.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class DivBackgroundTemplate implements JSONSerializable, JsonTemplate<DivBackground> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f54664a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivBackgroundTemplate> f54665b = new sn.p<ParsingEnvironment, JSONObject, DivBackgroundTemplate>() { // from class: com.yandex.div2.DivBackgroundTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivBackgroundTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivBackgroundTemplate.a.b(DivBackgroundTemplate.f54664a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivBackgroundTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        public static /* synthetic */ DivBackgroundTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        @NotNull
        public final DivBackgroundTemplate a(@NotNull ParsingEnvironment parsingEnvironment, boolean z10, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().G1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivBackgroundTemplate.kt */
    public static final class b extends DivBackgroundTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivImageBackgroundTemplate f54666c;

        public b(@NotNull DivImageBackgroundTemplate divImageBackgroundTemplate) {
            super(null);
            this.f54666c = divImageBackgroundTemplate;
        }

        @NotNull
        public final DivImageBackgroundTemplate b() {
            return this.f54666c;
        }
    }

    /* JADX INFO: compiled from: DivBackgroundTemplate.kt */
    public static final class c extends DivBackgroundTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivLinearGradientTemplate f54667c;

        public c(@NotNull DivLinearGradientTemplate divLinearGradientTemplate) {
            super(null);
            this.f54667c = divLinearGradientTemplate;
        }

        @NotNull
        public final DivLinearGradientTemplate b() {
            return this.f54667c;
        }
    }

    /* JADX INFO: compiled from: DivBackgroundTemplate.kt */
    public static final class d extends DivBackgroundTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivNinePatchBackgroundTemplate f54668c;

        public d(@NotNull DivNinePatchBackgroundTemplate divNinePatchBackgroundTemplate) {
            super(null);
            this.f54668c = divNinePatchBackgroundTemplate;
        }

        @NotNull
        public final DivNinePatchBackgroundTemplate b() {
            return this.f54668c;
        }
    }

    /* JADX INFO: compiled from: DivBackgroundTemplate.kt */
    public static final class e extends DivBackgroundTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivRadialGradientTemplate f54669c;

        public e(@NotNull DivRadialGradientTemplate divRadialGradientTemplate) {
            super(null);
            this.f54669c = divRadialGradientTemplate;
        }

        @NotNull
        public final DivRadialGradientTemplate b() {
            return this.f54669c;
        }
    }

    /* JADX INFO: compiled from: DivBackgroundTemplate.kt */
    public static final class f extends DivBackgroundTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivSolidBackgroundTemplate f54670c;

        public f(@NotNull DivSolidBackgroundTemplate divSolidBackgroundTemplate) {
            super(null);
            this.f54670c = divSolidBackgroundTemplate;
        }

        @NotNull
        public final DivSolidBackgroundTemplate b() {
            return this.f54670c;
        }
    }

    public DivBackgroundTemplate() {
    }

    public /* synthetic */ DivBackgroundTemplate(tn.i iVar) {
        this();
    }

    @NotNull
    public final Object a() {
        if (this instanceof c) {
            return ((c) this).b();
        }
        if (this instanceof e) {
            return ((e) this).b();
        }
        if (this instanceof b) {
            return ((b) this).b();
        }
        if (this instanceof f) {
            return ((f) this).b();
        }
        if (this instanceof d) {
            return ((d) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final String getType() {
        if (this instanceof c) {
            return "gradient";
        }
        if (this instanceof e) {
            return "radial_gradient";
        }
        if (this instanceof b) {
            return "image";
        }
        if (this instanceof f) {
            return "solid";
        }
        if (this instanceof d) {
            return "nine_patch_image";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().G1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
