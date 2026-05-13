package com.yandex.div.internal.viewpool;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import so.k;
import tn.i;
import tn.p;
import vo.d;
import wo.c2;
import wo.r2;
import wo.w2;

/* JADX INFO: compiled from: ViewPreCreationProfile.kt */
/* JADX INFO: loaded from: classes6.dex */
@k
public final class ViewPreCreationProfile {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final PreCreationModel custom;

    @NotNull
    private final PreCreationModel gallery;

    @NotNull
    private final PreCreationModel gifImage;

    @NotNull
    private final PreCreationModel grid;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Nullable
    private final String f53988id;

    @NotNull
    private final PreCreationModel image;

    @NotNull
    private final PreCreationModel indicator;

    @NotNull
    private final PreCreationModel input;

    @NotNull
    private final PreCreationModel linearContainer;

    @NotNull
    private final PreCreationModel overlapContainer;

    @NotNull
    private final PreCreationModel pager;

    @NotNull
    private final PreCreationModel select;

    @NotNull
    private final PreCreationModel slider;

    @NotNull
    private final PreCreationModel state;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    @NotNull
    private final PreCreationModel f3285switch;

    @NotNull
    private final PreCreationModel tab;

    @NotNull
    private final PreCreationModel text;

    @NotNull
    private final PreCreationModel video;

    @NotNull
    private final PreCreationModel wrapContainer;

    /* JADX INFO: compiled from: ViewPreCreationProfile.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<ViewPreCreationProfile> serializer() {
            return ViewPreCreationProfile$$serializer.INSTANCE;
        }
    }

    public ViewPreCreationProfile() {
        this((String) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, 524287, (i) null);
    }

    public /* synthetic */ ViewPreCreationProfile(int i10, String str, PreCreationModel preCreationModel, PreCreationModel preCreationModel2, PreCreationModel preCreationModel3, PreCreationModel preCreationModel4, PreCreationModel preCreationModel5, PreCreationModel preCreationModel6, PreCreationModel preCreationModel7, PreCreationModel preCreationModel8, PreCreationModel preCreationModel9, PreCreationModel preCreationModel10, PreCreationModel preCreationModel11, PreCreationModel preCreationModel12, PreCreationModel preCreationModel13, PreCreationModel preCreationModel14, PreCreationModel preCreationModel15, PreCreationModel preCreationModel16, PreCreationModel preCreationModel17, PreCreationModel preCreationModel18, r2 r2Var) {
        if ((i10 & 0) != 0) {
            c2.a(i10, 0, ViewPreCreationProfile$$serializer.INSTANCE.getDescriptor());
        }
        this.f53988id = (i10 & 1) == 0 ? null : str;
        this.text = (i10 & 2) == 0 ? new PreCreationModel(20, 0, 0, 6, (i) null) : preCreationModel;
        this.image = (i10 & 4) == 0 ? new PreCreationModel(20, 0, 0, 6, (i) null) : preCreationModel2;
        this.gifImage = (i10 & 8) == 0 ? new PreCreationModel(3, 0, 0, 6, (i) null) : preCreationModel3;
        this.overlapContainer = (i10 & 16) == 0 ? new PreCreationModel(8, 0, 0, 6, (i) null) : preCreationModel4;
        this.linearContainer = (i10 & 32) == 0 ? new PreCreationModel(12, 0, 0, 6, (i) null) : preCreationModel5;
        this.wrapContainer = (i10 & 64) == 0 ? new PreCreationModel(4, 0, 0, 6, (i) null) : preCreationModel6;
        this.grid = (i10 & 128) == 0 ? new PreCreationModel(4, 0, 0, 6, (i) null) : preCreationModel7;
        this.gallery = (i10 & 256) == 0 ? new PreCreationModel(6, 0, 0, 6, (i) null) : preCreationModel8;
        this.pager = (i10 & 512) == 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel9;
        this.tab = (i10 & 1024) == 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel10;
        this.state = (i10 & 2048) == 0 ? new PreCreationModel(4, 0, 0, 6, (i) null) : preCreationModel11;
        this.custom = (i10 & 4096) == 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel12;
        this.indicator = (i10 & 8192) == 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel13;
        this.slider = (i10 & 16384) == 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel14;
        this.input = (32768 & i10) == 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel15;
        this.select = (65536 & i10) == 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel16;
        this.video = (131072 & i10) == 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel17;
        this.f3285switch = (i10 & 262144) == 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel18;
    }

    public ViewPreCreationProfile(@Nullable String str, @NotNull PreCreationModel preCreationModel, @NotNull PreCreationModel preCreationModel2, @NotNull PreCreationModel preCreationModel3, @NotNull PreCreationModel preCreationModel4, @NotNull PreCreationModel preCreationModel5, @NotNull PreCreationModel preCreationModel6, @NotNull PreCreationModel preCreationModel7, @NotNull PreCreationModel preCreationModel8, @NotNull PreCreationModel preCreationModel9, @NotNull PreCreationModel preCreationModel10, @NotNull PreCreationModel preCreationModel11, @NotNull PreCreationModel preCreationModel12, @NotNull PreCreationModel preCreationModel13, @NotNull PreCreationModel preCreationModel14, @NotNull PreCreationModel preCreationModel15, @NotNull PreCreationModel preCreationModel16, @NotNull PreCreationModel preCreationModel17, @NotNull PreCreationModel preCreationModel18) {
        this.f53988id = str;
        this.text = preCreationModel;
        this.image = preCreationModel2;
        this.gifImage = preCreationModel3;
        this.overlapContainer = preCreationModel4;
        this.linearContainer = preCreationModel5;
        this.wrapContainer = preCreationModel6;
        this.grid = preCreationModel7;
        this.gallery = preCreationModel8;
        this.pager = preCreationModel9;
        this.tab = preCreationModel10;
        this.state = preCreationModel11;
        this.custom = preCreationModel12;
        this.indicator = preCreationModel13;
        this.slider = preCreationModel14;
        this.input = preCreationModel15;
        this.select = preCreationModel16;
        this.video = preCreationModel17;
        this.f3285switch = preCreationModel18;
    }

    public /* synthetic */ ViewPreCreationProfile(String str, PreCreationModel preCreationModel, PreCreationModel preCreationModel2, PreCreationModel preCreationModel3, PreCreationModel preCreationModel4, PreCreationModel preCreationModel5, PreCreationModel preCreationModel6, PreCreationModel preCreationModel7, PreCreationModel preCreationModel8, PreCreationModel preCreationModel9, PreCreationModel preCreationModel10, PreCreationModel preCreationModel11, PreCreationModel preCreationModel12, PreCreationModel preCreationModel13, PreCreationModel preCreationModel14, PreCreationModel preCreationModel15, PreCreationModel preCreationModel16, PreCreationModel preCreationModel17, PreCreationModel preCreationModel18, int i10, i iVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? new PreCreationModel(20, 0, 0, 6, (i) null) : preCreationModel, (i10 & 4) != 0 ? new PreCreationModel(20, 0, 0, 6, (i) null) : preCreationModel2, (i10 & 8) != 0 ? new PreCreationModel(3, 0, 0, 6, (i) null) : preCreationModel3, (i10 & 16) != 0 ? new PreCreationModel(8, 0, 0, 6, (i) null) : preCreationModel4, (i10 & 32) != 0 ? new PreCreationModel(12, 0, 0, 6, (i) null) : preCreationModel5, (i10 & 64) != 0 ? new PreCreationModel(4, 0, 0, 6, (i) null) : preCreationModel6, (i10 & 128) != 0 ? new PreCreationModel(4, 0, 0, 6, (i) null) : preCreationModel7, (i10 & 256) != 0 ? new PreCreationModel(6, 0, 0, 6, (i) null) : preCreationModel8, (i10 & 512) != 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel9, (i10 & 1024) != 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel10, (i10 & 2048) != 0 ? new PreCreationModel(4, 0, 0, 6, (i) null) : preCreationModel11, (i10 & 4096) != 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel12, (i10 & 8192) != 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel13, (i10 & 16384) != 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel14, (i10 & 32768) != 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel15, (i10 & 65536) != 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel16, (i10 & 131072) != 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel17, (i10 & 262144) != 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel18);
    }

    public static final /* synthetic */ void write$Self(ViewPreCreationProfile viewPreCreationProfile, d dVar, SerialDescriptor serialDescriptor) {
        if (dVar.r(serialDescriptor, 0) || viewPreCreationProfile.f53988id != null) {
            dVar.f(serialDescriptor, 0, w2.f86635a, viewPreCreationProfile.f53988id);
        }
        if (dVar.r(serialDescriptor, 1) || !p.f(viewPreCreationProfile.text, new PreCreationModel(20, 0, 0, 6, (i) null))) {
            dVar.g(serialDescriptor, 1, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.text);
        }
        if (dVar.r(serialDescriptor, 2) || !p.f(viewPreCreationProfile.image, new PreCreationModel(20, 0, 0, 6, (i) null))) {
            dVar.g(serialDescriptor, 2, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.image);
        }
        if (dVar.r(serialDescriptor, 3) || !p.f(viewPreCreationProfile.gifImage, new PreCreationModel(3, 0, 0, 6, (i) null))) {
            dVar.g(serialDescriptor, 3, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.gifImage);
        }
        if (dVar.r(serialDescriptor, 4) || !p.f(viewPreCreationProfile.overlapContainer, new PreCreationModel(8, 0, 0, 6, (i) null))) {
            dVar.g(serialDescriptor, 4, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.overlapContainer);
        }
        if (dVar.r(serialDescriptor, 5) || !p.f(viewPreCreationProfile.linearContainer, new PreCreationModel(12, 0, 0, 6, (i) null))) {
            dVar.g(serialDescriptor, 5, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.linearContainer);
        }
        if (dVar.r(serialDescriptor, 6) || !p.f(viewPreCreationProfile.wrapContainer, new PreCreationModel(4, 0, 0, 6, (i) null))) {
            dVar.g(serialDescriptor, 6, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.wrapContainer);
        }
        if (dVar.r(serialDescriptor, 7) || !p.f(viewPreCreationProfile.grid, new PreCreationModel(4, 0, 0, 6, (i) null))) {
            dVar.g(serialDescriptor, 7, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.grid);
        }
        if (dVar.r(serialDescriptor, 8) || !p.f(viewPreCreationProfile.gallery, new PreCreationModel(6, 0, 0, 6, (i) null))) {
            dVar.g(serialDescriptor, 8, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.gallery);
        }
        if (dVar.r(serialDescriptor, 9) || !p.f(viewPreCreationProfile.pager, new PreCreationModel(2, 0, 0, 6, (i) null))) {
            dVar.g(serialDescriptor, 9, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.pager);
        }
        if (dVar.r(serialDescriptor, 10) || !p.f(viewPreCreationProfile.tab, new PreCreationModel(2, 0, 0, 6, (i) null))) {
            dVar.g(serialDescriptor, 10, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.tab);
        }
        if (dVar.r(serialDescriptor, 11) || !p.f(viewPreCreationProfile.state, new PreCreationModel(4, 0, 0, 6, (i) null))) {
            dVar.g(serialDescriptor, 11, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.state);
        }
        if (dVar.r(serialDescriptor, 12) || !p.f(viewPreCreationProfile.custom, new PreCreationModel(2, 0, 0, 6, (i) null))) {
            dVar.g(serialDescriptor, 12, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.custom);
        }
        if (dVar.r(serialDescriptor, 13) || !p.f(viewPreCreationProfile.indicator, new PreCreationModel(2, 0, 0, 6, (i) null))) {
            dVar.g(serialDescriptor, 13, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.indicator);
        }
        if (dVar.r(serialDescriptor, 14) || !p.f(viewPreCreationProfile.slider, new PreCreationModel(2, 0, 0, 6, (i) null))) {
            dVar.g(serialDescriptor, 14, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.slider);
        }
        if (dVar.r(serialDescriptor, 15) || !p.f(viewPreCreationProfile.input, new PreCreationModel(2, 0, 0, 6, (i) null))) {
            dVar.g(serialDescriptor, 15, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.input);
        }
        if (dVar.r(serialDescriptor, 16) || !p.f(viewPreCreationProfile.select, new PreCreationModel(2, 0, 0, 6, (i) null))) {
            dVar.g(serialDescriptor, 16, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.select);
        }
        if (dVar.r(serialDescriptor, 17) || !p.f(viewPreCreationProfile.video, new PreCreationModel(2, 0, 0, 6, (i) null))) {
            dVar.g(serialDescriptor, 17, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.video);
        }
        if (dVar.r(serialDescriptor, 18) || !p.f(viewPreCreationProfile.f3285switch, new PreCreationModel(2, 0, 0, 6, (i) null))) {
            dVar.g(serialDescriptor, 18, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.f3285switch);
        }
    }

    @NotNull
    public final ViewPreCreationProfile copy(@Nullable String str, @NotNull PreCreationModel preCreationModel, @NotNull PreCreationModel preCreationModel2, @NotNull PreCreationModel preCreationModel3, @NotNull PreCreationModel preCreationModel4, @NotNull PreCreationModel preCreationModel5, @NotNull PreCreationModel preCreationModel6, @NotNull PreCreationModel preCreationModel7, @NotNull PreCreationModel preCreationModel8, @NotNull PreCreationModel preCreationModel9, @NotNull PreCreationModel preCreationModel10, @NotNull PreCreationModel preCreationModel11, @NotNull PreCreationModel preCreationModel12, @NotNull PreCreationModel preCreationModel13, @NotNull PreCreationModel preCreationModel14, @NotNull PreCreationModel preCreationModel15, @NotNull PreCreationModel preCreationModel16, @NotNull PreCreationModel preCreationModel17, @NotNull PreCreationModel preCreationModel18) {
        return new ViewPreCreationProfile(str, preCreationModel, preCreationModel2, preCreationModel3, preCreationModel4, preCreationModel5, preCreationModel6, preCreationModel7, preCreationModel8, preCreationModel9, preCreationModel10, preCreationModel11, preCreationModel12, preCreationModel13, preCreationModel14, preCreationModel15, preCreationModel16, preCreationModel17, preCreationModel18);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewPreCreationProfile)) {
            return false;
        }
        ViewPreCreationProfile viewPreCreationProfile = (ViewPreCreationProfile) obj;
        return p.f(this.f53988id, viewPreCreationProfile.f53988id) && p.f(this.text, viewPreCreationProfile.text) && p.f(this.image, viewPreCreationProfile.image) && p.f(this.gifImage, viewPreCreationProfile.gifImage) && p.f(this.overlapContainer, viewPreCreationProfile.overlapContainer) && p.f(this.linearContainer, viewPreCreationProfile.linearContainer) && p.f(this.wrapContainer, viewPreCreationProfile.wrapContainer) && p.f(this.grid, viewPreCreationProfile.grid) && p.f(this.gallery, viewPreCreationProfile.gallery) && p.f(this.pager, viewPreCreationProfile.pager) && p.f(this.tab, viewPreCreationProfile.tab) && p.f(this.state, viewPreCreationProfile.state) && p.f(this.custom, viewPreCreationProfile.custom) && p.f(this.indicator, viewPreCreationProfile.indicator) && p.f(this.slider, viewPreCreationProfile.slider) && p.f(this.input, viewPreCreationProfile.input) && p.f(this.select, viewPreCreationProfile.select) && p.f(this.video, viewPreCreationProfile.video) && p.f(this.f3285switch, viewPreCreationProfile.f3285switch);
    }

    @NotNull
    public final PreCreationModel getCustom() {
        return this.custom;
    }

    @NotNull
    public final PreCreationModel getGallery() {
        return this.gallery;
    }

    @NotNull
    public final PreCreationModel getGifImage() {
        return this.gifImage;
    }

    @NotNull
    public final PreCreationModel getGrid() {
        return this.grid;
    }

    @Nullable
    public final String getId() {
        return this.f53988id;
    }

    @NotNull
    public final PreCreationModel getImage() {
        return this.image;
    }

    @NotNull
    public final PreCreationModel getIndicator() {
        return this.indicator;
    }

    @NotNull
    public final PreCreationModel getInput() {
        return this.input;
    }

    @NotNull
    public final PreCreationModel getLinearContainer() {
        return this.linearContainer;
    }

    @NotNull
    public final PreCreationModel getOverlapContainer() {
        return this.overlapContainer;
    }

    @NotNull
    public final PreCreationModel getPager() {
        return this.pager;
    }

    @NotNull
    public final PreCreationModel getSelect() {
        return this.select;
    }

    @NotNull
    public final PreCreationModel getSlider() {
        return this.slider;
    }

    @NotNull
    public final PreCreationModel getState() {
        return this.state;
    }

    @NotNull
    public final PreCreationModel getSwitch() {
        return this.f3285switch;
    }

    @NotNull
    public final PreCreationModel getTab() {
        return this.tab;
    }

    @NotNull
    public final PreCreationModel getText() {
        return this.text;
    }

    @NotNull
    public final PreCreationModel getVideo() {
        return this.video;
    }

    @NotNull
    public final PreCreationModel getWrapContainer() {
        return this.wrapContainer;
    }

    public int hashCode() {
        String str = this.f53988id;
        return ((((((((((((((((((((((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.text.hashCode()) * 31) + this.image.hashCode()) * 31) + this.gifImage.hashCode()) * 31) + this.overlapContainer.hashCode()) * 31) + this.linearContainer.hashCode()) * 31) + this.wrapContainer.hashCode()) * 31) + this.grid.hashCode()) * 31) + this.gallery.hashCode()) * 31) + this.pager.hashCode()) * 31) + this.tab.hashCode()) * 31) + this.state.hashCode()) * 31) + this.custom.hashCode()) * 31) + this.indicator.hashCode()) * 31) + this.slider.hashCode()) * 31) + this.input.hashCode()) * 31) + this.select.hashCode()) * 31) + this.video.hashCode()) * 31) + this.f3285switch.hashCode();
    }

    @NotNull
    public String toString() {
        return "ViewPreCreationProfile(id=" + this.f53988id + ", text=" + this.text + ", image=" + this.image + ", gifImage=" + this.gifImage + ", overlapContainer=" + this.overlapContainer + ", linearContainer=" + this.linearContainer + ", wrapContainer=" + this.wrapContainer + ", grid=" + this.grid + ", gallery=" + this.gallery + ", pager=" + this.pager + ", tab=" + this.tab + ", state=" + this.state + ", custom=" + this.custom + ", indicator=" + this.indicator + ", slider=" + this.slider + ", input=" + this.input + ", select=" + this.select + ", video=" + this.video + ", switch=" + this.f3285switch + ')';
    }
}
