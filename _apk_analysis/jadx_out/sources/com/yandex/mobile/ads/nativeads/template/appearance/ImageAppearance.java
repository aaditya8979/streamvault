package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.nativeads.template.SizeConstraint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;
import yads.d52;
import yads.g31;

/* JADX INFO: loaded from: classes11.dex */
public final class ImageAppearance implements Parcelable, d52 {

    @NotNull
    public static final Parcelable.Creator<ImageAppearance> CREATOR = new g31();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SizeConstraint f59250b;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private SizeConstraint f59251a;

        @NotNull
        public final ImageAppearance build() {
            return new ImageAppearance(this.f59251a, null);
        }

        @NotNull
        public final Builder setWidthConstraint(@Nullable SizeConstraint sizeConstraint) {
            this.f59251a = sizeConstraint;
            return this;
        }
    }

    private ImageAppearance(SizeConstraint sizeConstraint) {
        this.f59250b = sizeConstraint;
    }

    public /* synthetic */ ImageAppearance(SizeConstraint sizeConstraint, i iVar) {
        this(sizeConstraint);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p.f(ImageAppearance.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p.i(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.ImageAppearance");
        return p.f(getWidthConstraint(), ((ImageAppearance) obj).getWidthConstraint());
    }

    @Override // yads.d52
    @Nullable
    public SizeConstraint getWidthConstraint() {
        return this.f59250b;
    }

    public int hashCode() {
        SizeConstraint widthConstraint = getWidthConstraint();
        if (widthConstraint != null) {
            return widthConstraint.hashCode();
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i10) {
        SizeConstraint sizeConstraint = this.f59250b;
        if (sizeConstraint == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sizeConstraint.writeToParcel(parcel, i10);
        }
    }
}
