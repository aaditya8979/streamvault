package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;
import yads.i52;
import yads.r53;

/* JADX INFO: loaded from: classes12.dex */
public final class TextAppearance implements Parcelable, i52 {

    @NotNull
    public static final Parcelable.Creator<TextAppearance> CREATOR = new r53();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f59284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f59285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f59286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f59287e;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f59288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f59289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f59290c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f59291d;

        @NotNull
        public final TextAppearance build() {
            return new TextAppearance(this.f59288a, this.f59289b, this.f59290c, this.f59291d, null);
        }

        @NotNull
        public final Builder setFontFamilyName(@Nullable String str) {
            this.f59291d = str;
            return this;
        }

        @NotNull
        public final Builder setFontStyle(int i10) {
            this.f59290c = i10;
            return this;
        }

        @NotNull
        public final Builder setTextColor(int i10) {
            this.f59288a = i10;
            return this;
        }

        @NotNull
        public final Builder setTextSize(float f10) {
            this.f59289b = f10;
            return this;
        }
    }

    private TextAppearance(int i10, float f10, int i11, String str) {
        this.f59284b = i10;
        this.f59285c = f10;
        this.f59286d = i11;
        this.f59287e = str;
    }

    public /* synthetic */ TextAppearance(int i10, float f10, int i11, String str, i iVar) {
        this(i10, f10, i11, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p.f(TextAppearance.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p.i(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.TextAppearance");
        TextAppearance textAppearance = (TextAppearance) obj;
        if (getTextColor() == textAppearance.getTextColor() && getTextSize() == textAppearance.getTextSize() && getFontStyle() == textAppearance.getFontStyle()) {
            return p.f(getFontFamilyName(), textAppearance.getFontFamilyName());
        }
        return false;
    }

    @Override // yads.i52
    @Nullable
    public String getFontFamilyName() {
        return this.f59287e;
    }

    @Override // yads.i52
    public int getFontStyle() {
        return this.f59286d;
    }

    @Override // yads.i52
    public int getTextColor() {
        return this.f59284b;
    }

    @Override // yads.i52
    public float getTextSize() {
        return this.f59285c;
    }

    public int hashCode() {
        int fontStyle = (getFontStyle() + ((Float.hashCode(getTextSize()) + (getTextColor() * 31)) * 31)) * 31;
        String fontFamilyName = getFontFamilyName();
        return fontStyle + (fontFamilyName != null ? fontFamilyName.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i10) {
        parcel.writeInt(this.f59284b);
        parcel.writeFloat(this.f59285c);
        parcel.writeInt(this.f59286d);
        parcel.writeString(this.f59287e);
    }
}
