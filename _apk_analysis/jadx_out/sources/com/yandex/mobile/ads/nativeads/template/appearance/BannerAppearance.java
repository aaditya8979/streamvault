package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.nativeads.template.HorizontalOffset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;
import yads.a52;
import yads.qm;

/* JADX INFO: loaded from: classes10.dex */
public final class BannerAppearance implements Parcelable, a52 {

    @NotNull
    public static final Parcelable.Creator<BannerAppearance> CREATOR = new qm();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HorizontalOffset f59230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HorizontalOffset f59231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f59232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f59233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f59234f;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f59235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f59236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f59237c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private HorizontalOffset f59238d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private HorizontalOffset f59239e;

        @NotNull
        public final BannerAppearance build() {
            return new BannerAppearance(this.f59238d, this.f59239e, this.f59235a, this.f59236b, this.f59237c, null);
        }

        @NotNull
        public final Builder setBackgroundColor(int i10) {
            this.f59235a = i10;
            return this;
        }

        @NotNull
        public final Builder setBorderColor(int i10) {
            this.f59236b = i10;
            return this;
        }

        @NotNull
        public final Builder setBorderWidth(float f10) {
            this.f59237c = f10;
            return this;
        }

        @NotNull
        public final Builder setContentPadding(@Nullable HorizontalOffset horizontalOffset) {
            this.f59238d = horizontalOffset;
            return this;
        }

        @NotNull
        public final Builder setImageMargins(@Nullable HorizontalOffset horizontalOffset) {
            this.f59239e = horizontalOffset;
            return this;
        }
    }

    private BannerAppearance(HorizontalOffset horizontalOffset, HorizontalOffset horizontalOffset2, int i10, int i11, float f10) {
        this.f59230b = horizontalOffset;
        this.f59231c = horizontalOffset2;
        this.f59232d = i10;
        this.f59233e = i11;
        this.f59234f = f10;
    }

    public /* synthetic */ BannerAppearance(HorizontalOffset horizontalOffset, HorizontalOffset horizontalOffset2, int i10, int i11, float f10, i iVar) {
        this(horizontalOffset, horizontalOffset2, i10, i11, f10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p.f(BannerAppearance.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p.i(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.BannerAppearance");
        BannerAppearance bannerAppearance = (BannerAppearance) obj;
        return p.f(getContentPadding(), bannerAppearance.getContentPadding()) && p.f(getImageMargins(), bannerAppearance.getImageMargins()) && getBackgroundColor() == bannerAppearance.getBackgroundColor() && getBorderColor() == bannerAppearance.getBorderColor() && getBorderWidth() == bannerAppearance.getBorderWidth();
    }

    @Override // yads.a52
    public int getBackgroundColor() {
        return this.f59232d;
    }

    @Override // yads.a52
    public int getBorderColor() {
        return this.f59233e;
    }

    @Override // yads.a52
    public float getBorderWidth() {
        return this.f59234f;
    }

    @Override // yads.a52
    @Nullable
    public HorizontalOffset getContentPadding() {
        return this.f59230b;
    }

    @Override // yads.a52
    @Nullable
    public HorizontalOffset getImageMargins() {
        return this.f59231c;
    }

    public int hashCode() {
        HorizontalOffset contentPadding = getContentPadding();
        int iHashCode = (contentPadding != null ? contentPadding.hashCode() : 0) * 31;
        HorizontalOffset imageMargins = getImageMargins();
        return Float.hashCode(getBorderWidth()) + ((getBorderColor() + ((getBackgroundColor() + ((iHashCode + (imageMargins != null ? imageMargins.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i10) {
        HorizontalOffset horizontalOffset = this.f59230b;
        if (horizontalOffset == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            horizontalOffset.writeToParcel(parcel, i10);
        }
        HorizontalOffset horizontalOffset2 = this.f59231c;
        if (horizontalOffset2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            horizontalOffset2.writeToParcel(parcel, i10);
        }
        parcel.writeInt(this.f59232d);
        parcel.writeInt(this.f59233e);
        parcel.writeFloat(this.f59234f);
    }
}
