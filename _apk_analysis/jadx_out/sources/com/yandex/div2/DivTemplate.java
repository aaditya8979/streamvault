package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTemplate.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class DivTemplate implements JSONSerializable, JsonTemplate<Div> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f57579a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivTemplate> f57580b = new sn.p<ParsingEnvironment, JSONObject, DivTemplate>() { // from class: com.yandex.div2.DivTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivTemplate.a.b(DivTemplate.f57579a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        public static /* synthetic */ DivTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        @NotNull
        public final DivTemplate a(@NotNull ParsingEnvironment parsingEnvironment, boolean z10, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().N4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class b extends DivTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivContainerTemplate f57581c;

        public b(@NotNull DivContainerTemplate divContainerTemplate) {
            super(null);
            this.f57581c = divContainerTemplate;
        }

        @NotNull
        public final DivContainerTemplate b() {
            return this.f57581c;
        }
    }

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class c extends DivTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivCustomTemplate f57582c;

        public c(@NotNull DivCustomTemplate divCustomTemplate) {
            super(null);
            this.f57582c = divCustomTemplate;
        }

        @NotNull
        public final DivCustomTemplate b() {
            return this.f57582c;
        }
    }

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class d extends DivTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivGalleryTemplate f57583c;

        public d(@NotNull DivGalleryTemplate divGalleryTemplate) {
            super(null);
            this.f57583c = divGalleryTemplate;
        }

        @NotNull
        public final DivGalleryTemplate b() {
            return this.f57583c;
        }
    }

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class e extends DivTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivGifImageTemplate f57584c;

        public e(@NotNull DivGifImageTemplate divGifImageTemplate) {
            super(null);
            this.f57584c = divGifImageTemplate;
        }

        @NotNull
        public final DivGifImageTemplate b() {
            return this.f57584c;
        }
    }

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class f extends DivTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivGridTemplate f57585c;

        public f(@NotNull DivGridTemplate divGridTemplate) {
            super(null);
            this.f57585c = divGridTemplate;
        }

        @NotNull
        public final DivGridTemplate b() {
            return this.f57585c;
        }
    }

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class g extends DivTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivImageTemplate f57586c;

        public g(@NotNull DivImageTemplate divImageTemplate) {
            super(null);
            this.f57586c = divImageTemplate;
        }

        @NotNull
        public final DivImageTemplate b() {
            return this.f57586c;
        }
    }

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class h extends DivTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivIndicatorTemplate f57587c;

        public h(@NotNull DivIndicatorTemplate divIndicatorTemplate) {
            super(null);
            this.f57587c = divIndicatorTemplate;
        }

        @NotNull
        public final DivIndicatorTemplate b() {
            return this.f57587c;
        }
    }

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class i extends DivTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivInputTemplate f57588c;

        public i(@NotNull DivInputTemplate divInputTemplate) {
            super(null);
            this.f57588c = divInputTemplate;
        }

        @NotNull
        public final DivInputTemplate b() {
            return this.f57588c;
        }
    }

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class j extends DivTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivPagerTemplate f57589c;

        public j(@NotNull DivPagerTemplate divPagerTemplate) {
            super(null);
            this.f57589c = divPagerTemplate;
        }

        @NotNull
        public final DivPagerTemplate b() {
            return this.f57589c;
        }
    }

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class k extends DivTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivSelectTemplate f57590c;

        public k(@NotNull DivSelectTemplate divSelectTemplate) {
            super(null);
            this.f57590c = divSelectTemplate;
        }

        @NotNull
        public final DivSelectTemplate b() {
            return this.f57590c;
        }
    }

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class l extends DivTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivSeparatorTemplate f57591c;

        public l(@NotNull DivSeparatorTemplate divSeparatorTemplate) {
            super(null);
            this.f57591c = divSeparatorTemplate;
        }

        @NotNull
        public final DivSeparatorTemplate b() {
            return this.f57591c;
        }
    }

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class m extends DivTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivSliderTemplate f57592c;

        public m(@NotNull DivSliderTemplate divSliderTemplate) {
            super(null);
            this.f57592c = divSliderTemplate;
        }

        @NotNull
        public final DivSliderTemplate b() {
            return this.f57592c;
        }
    }

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class n extends DivTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivStateTemplate f57593c;

        public n(@NotNull DivStateTemplate divStateTemplate) {
            super(null);
            this.f57593c = divStateTemplate;
        }

        @NotNull
        public final DivStateTemplate b() {
            return this.f57593c;
        }
    }

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class o extends DivTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivSwitchTemplate f57594c;

        public o(@NotNull DivSwitchTemplate divSwitchTemplate) {
            super(null);
            this.f57594c = divSwitchTemplate;
        }

        @NotNull
        public final DivSwitchTemplate b() {
            return this.f57594c;
        }
    }

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class p extends DivTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivTabsTemplate f57595c;

        public p(@NotNull DivTabsTemplate divTabsTemplate) {
            super(null);
            this.f57595c = divTabsTemplate;
        }

        @NotNull
        public final DivTabsTemplate b() {
            return this.f57595c;
        }
    }

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class q extends DivTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivTextTemplate f57596c;

        public q(@NotNull DivTextTemplate divTextTemplate) {
            super(null);
            this.f57596c = divTextTemplate;
        }

        @NotNull
        public final DivTextTemplate b() {
            return this.f57596c;
        }
    }

    /* JADX INFO: compiled from: DivTemplate.kt */
    public static final class r extends DivTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivVideoTemplate f57597c;

        public r(@NotNull DivVideoTemplate divVideoTemplate) {
            super(null);
            this.f57597c = divVideoTemplate;
        }

        @NotNull
        public final DivVideoTemplate b() {
            return this.f57597c;
        }
    }

    public DivTemplate() {
    }

    public /* synthetic */ DivTemplate(tn.i iVar) {
        this();
    }

    @NotNull
    public final Object a() {
        if (this instanceof g) {
            return ((g) this).b();
        }
        if (this instanceof e) {
            return ((e) this).b();
        }
        if (this instanceof q) {
            return ((q) this).b();
        }
        if (this instanceof l) {
            return ((l) this).b();
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
        if (this instanceof j) {
            return ((j) this).b();
        }
        if (this instanceof p) {
            return ((p) this).b();
        }
        if (this instanceof n) {
            return ((n) this).b();
        }
        if (this instanceof c) {
            return ((c) this).b();
        }
        if (this instanceof h) {
            return ((h) this).b();
        }
        if (this instanceof m) {
            return ((m) this).b();
        }
        if (this instanceof o) {
            return ((o) this).b();
        }
        if (this instanceof i) {
            return ((i) this).b();
        }
        if (this instanceof k) {
            return ((k) this).b();
        }
        if (this instanceof r) {
            return ((r) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final String getType() {
        if (this instanceof g) {
            return "image";
        }
        if (this instanceof e) {
            return "gif";
        }
        if (this instanceof q) {
            return "text";
        }
        if (this instanceof l) {
            return "separator";
        }
        if (this instanceof b) {
            return "container";
        }
        if (this instanceof f) {
            return "grid";
        }
        if (this instanceof d) {
            return "gallery";
        }
        if (this instanceof j) {
            return "pager";
        }
        if (this instanceof p) {
            return "tabs";
        }
        if (this instanceof n) {
            return "state";
        }
        if (this instanceof c) {
            return "custom";
        }
        if (this instanceof h) {
            return "indicator";
        }
        if (this instanceof m) {
            return "slider";
        }
        if (this instanceof o) {
            return "switch";
        }
        if (this instanceof i) {
            return "input";
        }
        if (this instanceof k) {
            return "select";
        }
        if (this instanceof r) {
            return "video";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().N4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
