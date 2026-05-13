package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivAppearanceTransitionTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivAppearanceTransitionTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class DivAppearanceTransitionTemplate implements JSONSerializable, JsonTemplate<DivAppearanceTransition> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f54643a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivAppearanceTransitionTemplate> f54644b = new sn.p<ParsingEnvironment, JSONObject, DivAppearanceTransitionTemplate>() { // from class: com.yandex.div2.DivAppearanceTransitionTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivAppearanceTransitionTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivAppearanceTransitionTemplate.a.b(DivAppearanceTransitionTemplate.f54643a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivAppearanceTransitionTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        public static /* synthetic */ DivAppearanceTransitionTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        @NotNull
        public final DivAppearanceTransitionTemplate a(@NotNull ParsingEnvironment parsingEnvironment, boolean z10, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().A1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivAppearanceTransitionTemplate.kt */
    public static final class b extends DivAppearanceTransitionTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivFadeTransitionTemplate f54645c;

        public b(@NotNull DivFadeTransitionTemplate divFadeTransitionTemplate) {
            super(null);
            this.f54645c = divFadeTransitionTemplate;
        }

        @NotNull
        public final DivFadeTransitionTemplate b() {
            return this.f54645c;
        }
    }

    /* JADX INFO: compiled from: DivAppearanceTransitionTemplate.kt */
    public static final class c extends DivAppearanceTransitionTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivScaleTransitionTemplate f54646c;

        public c(@NotNull DivScaleTransitionTemplate divScaleTransitionTemplate) {
            super(null);
            this.f54646c = divScaleTransitionTemplate;
        }

        @NotNull
        public final DivScaleTransitionTemplate b() {
            return this.f54646c;
        }
    }

    /* JADX INFO: compiled from: DivAppearanceTransitionTemplate.kt */
    public static final class d extends DivAppearanceTransitionTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivAppearanceSetTransitionTemplate f54647c;

        public d(@NotNull DivAppearanceSetTransitionTemplate divAppearanceSetTransitionTemplate) {
            super(null);
            this.f54647c = divAppearanceSetTransitionTemplate;
        }

        @NotNull
        public final DivAppearanceSetTransitionTemplate b() {
            return this.f54647c;
        }
    }

    /* JADX INFO: compiled from: DivAppearanceTransitionTemplate.kt */
    public static final class e extends DivAppearanceTransitionTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivSlideTransitionTemplate f54648c;

        public e(@NotNull DivSlideTransitionTemplate divSlideTransitionTemplate) {
            super(null);
            this.f54648c = divSlideTransitionTemplate;
        }

        @NotNull
        public final DivSlideTransitionTemplate b() {
            return this.f54648c;
        }
    }

    public DivAppearanceTransitionTemplate() {
    }

    public /* synthetic */ DivAppearanceTransitionTemplate(tn.i iVar) {
        this();
    }

    @NotNull
    public final Object a() {
        if (this instanceof d) {
            return ((d) this).b();
        }
        if (this instanceof b) {
            return ((b) this).b();
        }
        if (this instanceof c) {
            return ((c) this).b();
        }
        if (this instanceof e) {
            return ((e) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final String getType() {
        if (this instanceof d) {
            return "set";
        }
        if (this instanceof b) {
            return "fade";
        }
        if (this instanceof c) {
            return "scale";
        }
        if (this instanceof e) {
            return "slide";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().A1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
