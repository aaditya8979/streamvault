package com.yandex.mobile.ads.nativeads.template.appearance;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.ViewCompat;
import com.yandex.mobile.ads.nativeads.template.HorizontalOffset;
import com.yandex.mobile.ads.nativeads.template.SizeConstraint;
import com.yandex.mobile.ads.nativeads.template.appearance.BannerAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.ButtonAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.ImageAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.RatingAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.TextAppearance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;
import yads.kl3;
import yads.p10;
import yads.z42;

/* JADX INFO: loaded from: classes2.dex */
public final class NativeTemplateAppearance implements Parcelable, p10 {

    @NotNull
    public static final Parcelable.Creator<NativeTemplateAppearance> CREATOR = new z42();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f59252n = Color.parseColor("#7f7f7f");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f59253o = Color.parseColor("#ffd200");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f59254p = Color.parseColor("#ffd200");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f59255q = Color.parseColor("#f4c900");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BannerAppearance f59256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextAppearance f59257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TextAppearance f59258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TextAppearance f59259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TextAppearance f59260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TextAppearance f59261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TextAppearance f59262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final TextAppearance f59263i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ImageAppearance f59264j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ImageAppearance f59265k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ButtonAppearance f59266l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final RatingAppearance f59267m;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private BannerAppearance f59268a = b();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private ButtonAppearance f59278k = d();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ImageAppearance f59276i = g();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private ImageAppearance f59277j = f();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private RatingAppearance f59279l = h();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private TextAppearance f59269b = a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private TextAppearance f59270c = c();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private TextAppearance f59271d = e();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private TextAppearance f59272e = i();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private TextAppearance f59273f = j();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private TextAppearance f59274g = k();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private TextAppearance f59275h = l();

        private static TextAppearance a() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f59252n).setTextSize(15.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        private static BannerAppearance b() {
            return new BannerAppearance.Builder().setBackgroundColor(-1).setBorderColor(kl3.a(ViewCompat.MEASURED_STATE_MASK, 90.0f)).setBorderWidth(1.0f).setContentPadding(new HorizontalOffset(10.0f, 10.0f)).setImageMargins(new HorizontalOffset(0.0f, 10.0f)).build();
        }

        private static TextAppearance c() {
            return new TextAppearance.Builder().setTextColor(ViewCompat.MEASURED_STATE_MASK).setTextSize(13.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        private static ButtonAppearance d() {
            return new ButtonAppearance.Builder().setBorderColor(NativeTemplateAppearance.f59253o).setBorderWidth(1.0f).setNormalColor(-1).setPressedColor(NativeTemplateAppearance.f59254p).setTextAppearance(new TextAppearance.Builder().setTextColor(ViewCompat.MEASURED_STATE_MASK).setTextSize(13.0f).setFontFamilyName(null).setFontStyle(0).build()).build();
        }

        private static TextAppearance e() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f59252n).setTextSize(13.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        private static ImageAppearance f() {
            return new ImageAppearance.Builder().setWidthConstraint(new SizeConstraint(SizeConstraint.SizeConstraintType.FIXED, 16.0f)).build();
        }

        private static ImageAppearance g() {
            return new ImageAppearance.Builder().setWidthConstraint(new SizeConstraint(SizeConstraint.SizeConstraintType.PREFERRED_RATIO, 0.3f)).build();
        }

        private static RatingAppearance h() {
            return new RatingAppearance.Builder().setBackgroundStarColor(-3355444).setProgressStarColor(NativeTemplateAppearance.f59255q).build();
        }

        private static TextAppearance i() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f59252n).setTextSize(13.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        private static TextAppearance j() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f59252n).setTextSize(11.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        private static TextAppearance k() {
            return new TextAppearance.Builder().setTextColor(ViewCompat.MEASURED_STATE_MASK).setTextSize(15.0f).setFontFamilyName(null).setFontStyle(1).build();
        }

        private static TextAppearance l() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f59252n).setTextSize(13.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        @NotNull
        public final NativeTemplateAppearance build() {
            return new NativeTemplateAppearance(this.f59268a, this.f59269b, this.f59270c, this.f59271d, this.f59272e, this.f59273f, this.f59274g, this.f59275h, this.f59277j, this.f59276i, this.f59278k, this.f59279l, null);
        }
    }

    private NativeTemplateAppearance(BannerAppearance bannerAppearance, TextAppearance textAppearance, TextAppearance textAppearance2, TextAppearance textAppearance3, TextAppearance textAppearance4, TextAppearance textAppearance5, TextAppearance textAppearance6, TextAppearance textAppearance7, ImageAppearance imageAppearance, ImageAppearance imageAppearance2, ButtonAppearance buttonAppearance, RatingAppearance ratingAppearance) {
        this.f59256b = bannerAppearance;
        this.f59257c = textAppearance;
        this.f59258d = textAppearance2;
        this.f59259e = textAppearance3;
        this.f59260f = textAppearance4;
        this.f59261g = textAppearance5;
        this.f59262h = textAppearance6;
        this.f59263i = textAppearance7;
        this.f59264j = imageAppearance;
        this.f59265k = imageAppearance2;
        this.f59266l = buttonAppearance;
        this.f59267m = ratingAppearance;
    }

    public /* synthetic */ NativeTemplateAppearance(BannerAppearance bannerAppearance, TextAppearance textAppearance, TextAppearance textAppearance2, TextAppearance textAppearance3, TextAppearance textAppearance4, TextAppearance textAppearance5, TextAppearance textAppearance6, TextAppearance textAppearance7, ImageAppearance imageAppearance, ImageAppearance imageAppearance2, ButtonAppearance buttonAppearance, RatingAppearance ratingAppearance, i iVar) {
        this(bannerAppearance, textAppearance, textAppearance2, textAppearance3, textAppearance4, textAppearance5, textAppearance6, textAppearance7, imageAppearance, imageAppearance2, buttonAppearance, ratingAppearance);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p.f(NativeTemplateAppearance.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p.i(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.NativeTemplateAppearance");
        NativeTemplateAppearance nativeTemplateAppearance = (NativeTemplateAppearance) obj;
        if (p.f(getBannerAppearance(), nativeTemplateAppearance.getBannerAppearance()) && p.f(getAgeAppearance(), nativeTemplateAppearance.getAgeAppearance()) && p.f(getBodyAppearance(), nativeTemplateAppearance.getBodyAppearance()) && p.f(getDomainAppearance(), nativeTemplateAppearance.getDomainAppearance()) && p.f(getReviewCountAppearance(), nativeTemplateAppearance.getReviewCountAppearance()) && p.f(getSponsoredAppearance(), nativeTemplateAppearance.getSponsoredAppearance()) && p.f(getTitleAppearance(), nativeTemplateAppearance.getTitleAppearance()) && p.f(getWarningAppearance(), nativeTemplateAppearance.getWarningAppearance()) && p.f(getFaviconAppearance(), nativeTemplateAppearance.getFaviconAppearance()) && p.f(getImageAppearance(), nativeTemplateAppearance.getImageAppearance()) && p.f(getCallToActionAppearance(), nativeTemplateAppearance.getCallToActionAppearance())) {
            return p.f(getRatingAppearance(), nativeTemplateAppearance.getRatingAppearance());
        }
        return false;
    }

    @Override // yads.p10
    @NotNull
    public TextAppearance getAgeAppearance() {
        return this.f59257c;
    }

    @Override // yads.p10
    @NotNull
    public BannerAppearance getBannerAppearance() {
        return this.f59256b;
    }

    @Override // yads.p10
    @NotNull
    public TextAppearance getBodyAppearance() {
        return this.f59258d;
    }

    @Override // yads.p10
    @NotNull
    public ButtonAppearance getCallToActionAppearance() {
        return this.f59266l;
    }

    @Override // yads.p10
    @NotNull
    public TextAppearance getDomainAppearance() {
        return this.f59259e;
    }

    @Override // yads.p10
    @NotNull
    public ImageAppearance getFaviconAppearance() {
        return this.f59264j;
    }

    @Override // yads.p10
    @NotNull
    public ImageAppearance getImageAppearance() {
        return this.f59265k;
    }

    @Override // yads.p10
    @NotNull
    public RatingAppearance getRatingAppearance() {
        return this.f59267m;
    }

    @Override // yads.p10
    @NotNull
    public TextAppearance getReviewCountAppearance() {
        return this.f59260f;
    }

    @Override // yads.p10
    @NotNull
    public TextAppearance getSponsoredAppearance() {
        return this.f59261g;
    }

    @Override // yads.p10
    @NotNull
    public TextAppearance getTitleAppearance() {
        return this.f59262h;
    }

    @Override // yads.p10
    @NotNull
    public TextAppearance getWarningAppearance() {
        return this.f59263i;
    }

    public int hashCode() {
        return getRatingAppearance().hashCode() + ((getCallToActionAppearance().hashCode() + ((getImageAppearance().hashCode() + ((getFaviconAppearance().hashCode() + ((getWarningAppearance().hashCode() + ((getTitleAppearance().hashCode() + ((getSponsoredAppearance().hashCode() + ((getReviewCountAppearance().hashCode() + ((getDomainAppearance().hashCode() + ((getBodyAppearance().hashCode() + ((getAgeAppearance().hashCode() + (getBannerAppearance().hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i10) {
        this.f59256b.writeToParcel(parcel, i10);
        this.f59257c.writeToParcel(parcel, i10);
        this.f59258d.writeToParcel(parcel, i10);
        this.f59259e.writeToParcel(parcel, i10);
        this.f59260f.writeToParcel(parcel, i10);
        this.f59261g.writeToParcel(parcel, i10);
        this.f59262h.writeToParcel(parcel, i10);
        this.f59263i.writeToParcel(parcel, i10);
        this.f59264j.writeToParcel(parcel, i10);
        this.f59265k.writeToParcel(parcel, i10);
        this.f59266l.writeToParcel(parcel, i10);
        this.f59267m.writeToParcel(parcel, i10);
    }
}
