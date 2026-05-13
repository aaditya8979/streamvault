package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;
import yads.b52;
import yads.dr;

/* JADX INFO: loaded from: classes8.dex */
public final class ButtonAppearance implements Parcelable, b52 {

    @NotNull
    public static final Parcelable.Creator<ButtonAppearance> CREATOR = new dr();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextAppearance f59240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f59241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f59242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f59243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f59244f;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f59245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f59246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f59247c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f59248d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private TextAppearance f59249e;

        @NotNull
        public final ButtonAppearance build() {
            return new ButtonAppearance(this.f59249e, this.f59245a, this.f59246b, this.f59247c, this.f59248d, null);
        }

        @NotNull
        public final Builder setBorderColor(int i10) {
            this.f59245a = i10;
            return this;
        }

        @NotNull
        public final Builder setBorderWidth(float f10) {
            this.f59246b = f10;
            return this;
        }

        @NotNull
        public final Builder setNormalColor(int i10) {
            this.f59247c = i10;
            return this;
        }

        @NotNull
        public final Builder setPressedColor(int i10) {
            this.f59248d = i10;
            return this;
        }

        @NotNull
        public final Builder setTextAppearance(@Nullable TextAppearance textAppearance) {
            this.f59249e = textAppearance;
            return this;
        }
    }

    private ButtonAppearance(TextAppearance textAppearance, int i10, float f10, int i11, int i12) {
        this.f59240b = textAppearance;
        this.f59241c = i10;
        this.f59242d = f10;
        this.f59243e = i11;
        this.f59244f = i12;
    }

    public /* synthetic */ ButtonAppearance(TextAppearance textAppearance, int i10, float f10, int i11, int i12, i iVar) {
        this(textAppearance, i10, f10, i11, i12);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p.f(ButtonAppearance.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p.i(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.ButtonAppearance");
        ButtonAppearance buttonAppearance = (ButtonAppearance) obj;
        return p.f(getTextAppearance(), buttonAppearance.getTextAppearance()) && getBorderColor() == buttonAppearance.getBorderColor() && getBorderWidth() == buttonAppearance.getBorderWidth() && getNormalColor() == buttonAppearance.getNormalColor() && getPressedColor() == buttonAppearance.getPressedColor();
    }

    @Override // yads.b52
    public int getBorderColor() {
        return this.f59241c;
    }

    @Override // yads.b52
    public float getBorderWidth() {
        return this.f59242d;
    }

    @Override // yads.b52
    public int getNormalColor() {
        return this.f59243e;
    }

    @Override // yads.b52
    public int getPressedColor() {
        return this.f59244f;
    }

    @Override // yads.b52
    @Nullable
    public TextAppearance getTextAppearance() {
        return this.f59240b;
    }

    public int hashCode() {
        TextAppearance textAppearance = getTextAppearance();
        return getPressedColor() + ((getNormalColor() + ((Float.hashCode(getBorderWidth()) + ((getBorderColor() + ((textAppearance != null ? textAppearance.hashCode() : 0) * 31)) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i10) {
        TextAppearance textAppearance = this.f59240b;
        if (textAppearance == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textAppearance.writeToParcel(parcel, i10);
        }
        parcel.writeInt(this.f59241c);
        parcel.writeFloat(this.f59242d);
        parcel.writeInt(this.f59243e);
        parcel.writeInt(this.f59244f);
    }
}
