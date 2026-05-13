package com.mbridge.msdk.dycreator.wrapper;

import com.mbridge.msdk.dycreator.listener.DyCountDownListenerWrapper;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class DyOption {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f37283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File f37284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CampaignEx f37285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private DyAdType f37286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f37287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f37288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f37289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f37290h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f37291i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f37292j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f37293k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f37294l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f37295m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f37296n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f37297o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f37298p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f37299q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private DyCountDownListenerWrapper f37300r;

    public static class Builder implements IViewOptionBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<String> f37301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private File f37302b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CampaignEx f37303c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private DyAdType f37304d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f37305e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f37306f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f37307g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f37308h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f37309i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f37310j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f37311k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f37312l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f37313m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f37314n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f37315o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f37316p;

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder adChoiceLink(String str) {
            this.f37306f = str;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public DyOption build() {
            return new DyOption(this);
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder campaignEx(CampaignEx campaignEx) {
            this.f37303c = campaignEx;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder canSkip(boolean z10) {
            this.f37305e = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder countDownTime(int i10) {
            this.f37315o = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder dyAdType(DyAdType dyAdType) {
            this.f37304d = dyAdType;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder file(File file) {
            this.f37302b = file;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder fileDirs(List<String> list) {
            this.f37301a = list;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isApkInfoVisible(boolean z10) {
            this.f37310j = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isClickButtonVisible(boolean z10) {
            this.f37308h = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isLogoVisible(boolean z10) {
            this.f37311k = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isScreenClick(boolean z10) {
            this.f37307g = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isShakeVisible(boolean z10) {
            this.f37309i = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder orientation(int i10) {
            this.f37314n = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder shakeStrenght(int i10) {
            this.f37312l = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder shakeTime(int i10) {
            this.f37313m = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder templateType(int i10) {
            this.f37316p = i10;
            return this;
        }
    }

    public interface IViewOptionBuilder {
        IViewOptionBuilder adChoiceLink(String str);

        DyOption build();

        IViewOptionBuilder campaignEx(CampaignEx campaignEx);

        IViewOptionBuilder canSkip(boolean z10);

        IViewOptionBuilder countDownTime(int i10);

        IViewOptionBuilder dyAdType(DyAdType dyAdType);

        IViewOptionBuilder file(File file);

        IViewOptionBuilder fileDirs(List<String> list);

        IViewOptionBuilder isApkInfoVisible(boolean z10);

        IViewOptionBuilder isClickButtonVisible(boolean z10);

        IViewOptionBuilder isLogoVisible(boolean z10);

        IViewOptionBuilder isScreenClick(boolean z10);

        IViewOptionBuilder isShakeVisible(boolean z10);

        IViewOptionBuilder orientation(int i10);

        IViewOptionBuilder shakeStrenght(int i10);

        IViewOptionBuilder shakeTime(int i10);

        IViewOptionBuilder templateType(int i10);
    }

    public DyOption(Builder builder) {
        this.f37283a = builder.f37301a;
        this.f37284b = builder.f37302b;
        this.f37285c = builder.f37303c;
        this.f37286d = builder.f37304d;
        this.f37289g = builder.f37305e;
        this.f37287e = builder.f37306f;
        this.f37288f = builder.f37307g;
        this.f37290h = builder.f37308h;
        this.f37292j = builder.f37310j;
        this.f37291i = builder.f37309i;
        this.f37293k = builder.f37311k;
        this.f37294l = builder.f37312l;
        this.f37295m = builder.f37313m;
        this.f37296n = builder.f37314n;
        this.f37297o = builder.f37315o;
        this.f37299q = builder.f37316p;
    }

    public String getAdChoiceLink() {
        return this.f37287e;
    }

    public CampaignEx getCampaignEx() {
        return this.f37285c;
    }

    public int getCountDownTime() {
        return this.f37297o;
    }

    public int getCurrentCountDown() {
        return this.f37298p;
    }

    public DyAdType getDyAdType() {
        return this.f37286d;
    }

    public File getFile() {
        return this.f37284b;
    }

    public List<String> getFileDirs() {
        return this.f37283a;
    }

    public int getOrientation() {
        return this.f37296n;
    }

    public int getShakeStrenght() {
        return this.f37294l;
    }

    public int getShakeTime() {
        return this.f37295m;
    }

    public int getTemplateType() {
        return this.f37299q;
    }

    public boolean isApkInfoVisible() {
        return this.f37292j;
    }

    public boolean isCanSkip() {
        return this.f37289g;
    }

    public boolean isClickButtonVisible() {
        return this.f37290h;
    }

    public boolean isClickScreen() {
        return this.f37288f;
    }

    public boolean isLogoVisible() {
        return this.f37293k;
    }

    public boolean isShakeVisible() {
        return this.f37291i;
    }

    public void setDyCountDownListener(int i10) {
        DyCountDownListenerWrapper dyCountDownListenerWrapper = this.f37300r;
        if (dyCountDownListenerWrapper != null) {
            dyCountDownListenerWrapper.getCountDownValue(i10);
        }
        this.f37298p = i10;
    }

    public void setDyCountDownListenerWrapper(DyCountDownListenerWrapper dyCountDownListenerWrapper) {
        this.f37300r = dyCountDownListenerWrapper;
    }
}
