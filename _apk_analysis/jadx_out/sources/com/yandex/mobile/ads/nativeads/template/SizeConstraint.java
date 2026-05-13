package com.yandex.mobile.ads.nativeads.template;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;
import yads.f52;
import yads.g52;
import yads.h52;

/* JADX INFO: loaded from: classes8.dex */
public final class SizeConstraint implements Parcelable, h52 {

    @NotNull
    public static final Parcelable.Creator<SizeConstraint> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SizeConstraintType f59226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f59227c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SizeConstraintType implements g52 {
        public static final SizeConstraintType FIXED;
        public static final SizeConstraintType FIXED_RATIO;
        public static final SizeConstraintType PREFERRED_RATIO;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ SizeConstraintType[] f59228c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f52 f59229b;

        static {
            SizeConstraintType sizeConstraintType = new SizeConstraintType("FIXED", 0, f52.f89485b);
            FIXED = sizeConstraintType;
            SizeConstraintType sizeConstraintType2 = new SizeConstraintType("FIXED_RATIO", 1, f52.f89486c);
            FIXED_RATIO = sizeConstraintType2;
            SizeConstraintType sizeConstraintType3 = new SizeConstraintType("PREFERRED_RATIO", 2, f52.f89487d);
            PREFERRED_RATIO = sizeConstraintType3;
            SizeConstraintType[] sizeConstraintTypeArr = {sizeConstraintType, sizeConstraintType2, sizeConstraintType3};
            f59228c = sizeConstraintTypeArr;
            kotlin.enums.a.a(sizeConstraintTypeArr);
        }

        private SizeConstraintType(String str, int i10, f52 f52Var) {
            this.f59229b = f52Var;
        }

        public static SizeConstraintType valueOf(String str) {
            return (SizeConstraintType) Enum.valueOf(SizeConstraintType.class, str);
        }

        public static SizeConstraintType[] values() {
            return (SizeConstraintType[]) f59228c.clone();
        }

        public final f52 a() {
            return this.f59229b;
        }
    }

    public SizeConstraint(@NotNull SizeConstraintType sizeConstraintType, float f10) {
        this.f59226b = sizeConstraintType;
        this.f59227c = f10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p.f(SizeConstraint.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p.i(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.SizeConstraint");
        SizeConstraint sizeConstraint = (SizeConstraint) obj;
        return getSizeConstraintType() == sizeConstraint.getSizeConstraintType() && getValue() == sizeConstraint.getValue();
    }

    @Override // yads.h52
    @NotNull
    public SizeConstraintType getSizeConstraintType() {
        return this.f59226b;
    }

    @Override // yads.h52
    public float getValue() {
        return this.f59227c;
    }

    public int hashCode() {
        return Float.hashCode(getValue()) + (getSizeConstraintType().hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i10) {
        parcel.writeString(this.f59226b.name());
        parcel.writeFloat(this.f59227c);
    }
}
