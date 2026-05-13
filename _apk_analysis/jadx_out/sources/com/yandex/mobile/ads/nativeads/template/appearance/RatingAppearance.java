package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;
import yads.e52;
import yads.sl2;

/* JADX INFO: loaded from: classes5.dex */
public final class RatingAppearance implements Parcelable, e52 {

    @NotNull
    public static final Parcelable.Creator<RatingAppearance> CREATOR = new sl2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f59280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f59281c;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f59282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f59283b;

        @NotNull
        public final RatingAppearance build() {
            return new RatingAppearance(this.f59282a, this.f59283b, null);
        }

        @NotNull
        public final Builder setBackgroundStarColor(int i10) {
            this.f59282a = i10;
            return this;
        }

        @NotNull
        public final Builder setProgressStarColor(int i10) {
            this.f59283b = i10;
            return this;
        }
    }

    private RatingAppearance(int i10, int i11) {
        this.f59280b = i10;
        this.f59281c = i11;
    }

    public /* synthetic */ RatingAppearance(int i10, int i11, i iVar) {
        this(i10, i11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p.f(RatingAppearance.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p.i(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.RatingAppearance");
        RatingAppearance ratingAppearance = (RatingAppearance) obj;
        return getBackgroundStarColor() == ratingAppearance.getBackgroundStarColor() && getProgressStarColor() == ratingAppearance.getProgressStarColor();
    }

    @Override // yads.e52
    public int getBackgroundStarColor() {
        return this.f59280b;
    }

    @Override // yads.e52
    public int getProgressStarColor() {
        return this.f59281c;
    }

    public int hashCode() {
        return getProgressStarColor() + (getBackgroundStarColor() * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i10) {
        parcel.writeInt(this.f59280b);
        parcel.writeInt(this.f59281c);
    }
}
