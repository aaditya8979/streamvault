package com.yandex.mobile.ads.nativeads.template;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;
import yads.b11;
import yads.c52;

/* JADX INFO: loaded from: classes2.dex */
public final class HorizontalOffset implements c52, Parcelable {

    @NotNull
    public static final Parcelable.Creator<HorizontalOffset> CREATOR = new b11();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f59224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f59225c;

    public HorizontalOffset(float f10, float f11) {
        this.f59224b = f10;
        this.f59225c = f11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p.f(HorizontalOffset.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p.i(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.HorizontalOffset");
        HorizontalOffset horizontalOffset = (HorizontalOffset) obj;
        return getLeft() == horizontalOffset.getLeft() && getRight() == horizontalOffset.getRight();
    }

    @Override // yads.c52
    public float getLeft() {
        return this.f59224b;
    }

    @Override // yads.c52
    public float getRight() {
        return this.f59225c;
    }

    public int hashCode() {
        return Float.hashCode(getRight()) + (Float.hashCode(getLeft()) * 31);
    }

    @NotNull
    public String toString() {
        return getLeft() + ", " + getRight();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i10) {
        parcel.writeFloat(this.f59224b);
        parcel.writeFloat(this.f59225c);
    }
}
