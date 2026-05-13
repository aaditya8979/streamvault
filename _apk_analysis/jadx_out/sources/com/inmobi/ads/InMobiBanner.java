package com.inmobi.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import androidx.annotation.IntRange;
import androidx.annotation.UiThread;
import bn.g;
import bn.r;
import bo.a0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.banner.AudioListener;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.exceptions.InvalidPlacementIdException;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.BannerAdEventListener;
import com.inmobi.media.AbstractC3547l1;
import com.inmobi.media.C3269a2;
import com.inmobi.media.C3321c2;
import com.inmobi.media.C3372e2;
import com.inmobi.media.C3605n9;
import com.inmobi.media.F3;
import com.inmobi.media.HandlerC3347d2;
import com.inmobi.media.J5;
import com.inmobi.media.Jg;
import com.inmobi.media.Ji;
import com.inmobi.media.Kb;
import com.inmobi.media.Ki;
import com.inmobi.media.L5;
import com.inmobi.media.Oj;
import com.inmobi.media.U8;
import com.inmobi.media.V1;
import com.inmobi.media.V8;
import com.inmobi.media.Y1;
import com.inmobi.media.Z1;
import com.inmobi.media.ads.network.common.model.Ad;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.ironsource.V2;
import com.ironsource.Z7;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes7.dex */
public final class InMobiBanner extends RelativeLayout {

    @NotNull
    public static final U8 Companion = new U8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Y1 f25079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AudioListener f25080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public V1 f25081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C3372e2 f25082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f25083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f25085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HandlerC3347d2 f25086h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f25087i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f25088j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AnimationType f25089k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f25090l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public WeakReference f25091m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Jg f25092n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d f25093o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AnimationType {
        private static final /* synthetic */ kn.a $ENTRIES;
        private static final /* synthetic */ AnimationType[] $VALUES;
        public static final AnimationType ANIMATION_OFF = new AnimationType("ANIMATION_OFF", 0);
        public static final AnimationType ROTATE_HORIZONTAL_AXIS = new AnimationType("ROTATE_HORIZONTAL_AXIS", 1);
        public static final AnimationType ANIMATION_ALPHA = new AnimationType("ANIMATION_ALPHA", 2);
        public static final AnimationType ROTATE_VERTICAL_AXIS = new AnimationType("ROTATE_VERTICAL_AXIS", 3);

        private static final /* synthetic */ AnimationType[] $values() {
            return new AnimationType[]{ANIMATION_OFF, ROTATE_HORIZONTAL_AXIS, ANIMATION_ALPHA, ROTATE_VERTICAL_AXIS};
        }

        static {
            AnimationType[] animationTypeArr$values = $values();
            $VALUES = animationTypeArr$values;
            $ENTRIES = kotlin.enums.a.a(animationTypeArr$values);
        }

        private AnimationType(String str, int i10) {
        }

        @NotNull
        public static kn.a<AnimationType> getEntries() {
            return $ENTRIES;
        }

        public static AnimationType valueOf(String str) {
            return (AnimationType) Enum.valueOf(AnimationType.class, str);
        }

        public static AnimationType[] values() {
            return (AnimationType[]) $VALUES.clone();
        }
    }

    public static final class a extends C3321c2 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull InMobiBanner inMobiBanner) {
            super(inMobiBanner);
            p.k(inMobiBanner, "banner");
        }

        @Override // com.inmobi.media.C3321c2, com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.media.C3321c2, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(@NotNull InMobiAdRequestStatus inMobiAdRequestStatus) {
            p.k(inMobiAdRequestStatus, "status");
            InMobiBanner inMobiBanner = a().get();
            if (inMobiBanner == null) {
                return;
            }
            Y1 mPubListener$media_release = inMobiBanner.getMPubListener$media_release();
            if (mPubListener$media_release != null) {
                mPubListener$media_release.a(inMobiBanner, inMobiAdRequestStatus);
            }
            inMobiBanner.scheduleRefresh$media_release();
        }

        @Override // com.inmobi.media.C3321c2, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(@NotNull AdMetaInfo adMetaInfo) {
            p.k(adMetaInfo, "info");
            super.onAdFetchSuccessful(adMetaInfo);
            InMobiBanner inMobiBanner = a().get();
            if (inMobiBanner != null) {
                try {
                    C3372e2 mAdManager$media_release = inMobiBanner.getMAdManager$media_release();
                    if (mAdManager$media_release != null) {
                        mAdManager$media_release.o();
                    }
                } catch (IllegalStateException e10) {
                    String strAccess$getTAG$cp = InMobiBanner.access$getTAG$cp();
                    p.j(strAccess$getTAG$cp, "access$getTAG$cp(...)");
                    Kb.a((byte) 1, strAccess$getTAG$cp, e10.getMessage());
                    Y1 mPubListener$media_release = inMobiBanner.getMPubListener$media_release();
                    if (mPubListener$media_release != null) {
                        mPubListener$media_release.a(inMobiBanner, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiBanner(@NotNull Context context, long j10) {
        super(context);
        p.k(context, GAMConfig.KEY_CONTEXT);
        this.f25081c = V1.f26461d;
        this.f25083e = new a(this);
        this.f25085g = true;
        this.f25089k = AnimationType.ROTATE_HORIZONTAL_AXIS;
        Jg jg2 = new Jg();
        this.f25092n = jg2;
        this.f25093o = new d(this);
        if (!Ji.d()) {
            p.j("InMobiBanner", "TAG");
            throw new SdkNotInitializedException("InMobiBanner");
        }
        if (context instanceof Activity) {
            this.f25091m = new WeakReference(context);
        }
        this.f25082d = new C3372e2();
        jg2.f25731a = j10;
        a(this, context);
        C3372e2 c3372e2 = this.f25082d;
        this.f25084f = c3372e2 != null ? c3372e2.k() : 0;
        this.f25086h = new HandlerC3347d2(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiBanner(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(attributeSet, "attributeSet");
        this.f25081c = V1.f26461d;
        this.f25083e = new a(this);
        this.f25085g = true;
        this.f25089k = AnimationType.ROTATE_HORIZONTAL_AXIS;
        Jg jg2 = new Jg();
        this.f25092n = jg2;
        this.f25093o = new d(this);
        if (!Ji.d()) {
            p.j("InMobiBanner", "TAG");
            throw new SdkNotInitializedException("InMobiBanner");
        }
        if (context instanceof Activity) {
            this.f25091m = new WeakReference(context);
        }
        this.f25082d = new C3372e2();
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.inmobi.ads", "placementId");
        String attributeValue2 = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.inmobi.ads", V2.f30581b);
        if (attributeValue != null) {
            long jA = a(attributeValue);
            if (jA == Long.MIN_VALUE) {
                throw new InvalidPlacementIdException();
            }
            jg2.f25731a = jA;
        }
        Context context2 = getContext();
        p.j(context2, "getContext(...)");
        a(this, context2);
        C3372e2 c3372e2 = this.f25082d;
        this.f25084f = c3372e2 != null ? c3372e2.k() : 0;
        this.f25086h = new HandlerC3347d2(this);
        if (attributeValue2 != null) {
            try {
                int length = attributeValue2.length() - 1;
                int i10 = 0;
                boolean z10 = false;
                while (i10 <= length) {
                    boolean z11 = p.m(attributeValue2.charAt(!z10 ? i10 : length), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z11) {
                        i10++;
                    } else {
                        z10 = true;
                    }
                }
                setRefreshInterval(Integer.parseInt(attributeValue2.subSequence(i10, length + 1).toString()));
            } catch (NumberFormatException unused) {
                p.j("InMobiBanner", "TAG");
                Kb.a((byte) 1, "InMobiBanner", "Refresh interval value supplied in XML layout is not valid. Falling back to default value.");
            }
        }
    }

    public static final r a(InMobiBanner inMobiBanner, PublisherCallbacks publisherCallbacks, boolean z10) {
        C3372e2 c3372e2;
        inMobiBanner.a();
        long j10 = inMobiBanner.f25090l;
        if (j10 == 0 || (c3372e2 = inMobiBanner.f25082d) == null || c3372e2.a(j10)) {
            inMobiBanner.f25090l = SystemClock.elapsedRealtime();
            C3372e2 c3372e22 = inMobiBanner.f25082d;
            if (c3372e22 != null) {
                c3372e22.a(publisherCallbacks, inMobiBanner.getFrameSizeString(), z10);
            }
        }
        return r.f5635a;
    }

    public static final r a(InMobiBanner inMobiBanner, byte[] bArr) {
        C3605n9 c3605n9;
        C3372e2 c3372e2 = inMobiBanner.f25082d;
        if (c3372e2 != null && (c3605n9 = c3372e2.f25338f) != null) {
            p.j("InMobiBanner", "TAG");
            c3605n9.c("InMobiBanner", "load with response");
        }
        C3372e2 c3372e22 = inMobiBanner.f25082d;
        if (c3372e22 != null) {
            c3372e22.a(bArr, inMobiBanner.f25083e);
        }
        return r.f5635a;
    }

    public static void a(InMobiBanner inMobiBanner, Context context) {
        int iA;
        C3372e2 c3372e2 = inMobiBanner.f25082d;
        if (c3372e2 != null) {
            c3372e2.a(context, inMobiBanner.f25092n, inMobiBanner.getFrameSizeString());
        }
        C3372e2 c3372e22 = inMobiBanner.f25082d;
        if (c3372e22 != null) {
            int i10 = inMobiBanner.f25084f;
            iA = c3372e22.a(i10, i10);
        } else {
            iA = 0;
        }
        inMobiBanner.f25084f = iA;
    }

    public static final void a(InMobiBanner inMobiBanner, sn.a aVar) {
        C3605n9 c3605n9;
        C3605n9 c3605n92;
        try {
            if (inMobiBanner.f25087i > 0 && inMobiBanner.f25088j > 0) {
                aVar.invoke();
                return;
            }
            C3372e2 c3372e2 = inMobiBanner.f25082d;
            if (c3372e2 != null && (c3605n92 = c3372e2.f25338f) != null) {
                p.j("InMobiBanner", "TAG");
                c3605n92.b("InMobiBanner", "The height or width of the banner can not be determined");
            }
            C3372e2 c3372e22 = inMobiBanner.f25082d;
            if (c3372e22 != null) {
                c3372e22.a((short) 2171);
            }
            Y1 y12 = inMobiBanner.f25079a;
            if (y12 != null) {
                y12.a(inMobiBanner, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
            }
        } catch (Exception e10) {
            C3372e2 c3372e23 = inMobiBanner.f25082d;
            if (c3372e23 != null) {
                c3372e23.a((short) 2172);
            }
            Y1 y13 = inMobiBanner.f25079a;
            if (y13 != null) {
                y13.a(inMobiBanner, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
            C3372e2 c3372e24 = inMobiBanner.f25082d;
            if (c3372e24 == null || (c3605n9 = c3372e24.f25338f) == null) {
                return;
            }
            p.j("InMobiBanner", "TAG");
            c3605n9.a("InMobiBanner", "InMobiBanner$4.run() threw unexpected error: ", e10);
        }
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        return "InMobiBanner";
    }

    public static final boolean access$hasValidSize(InMobiBanner inMobiBanner) {
        return inMobiBanner.f25087i > 0 && inMobiBanner.f25088j > 0;
    }

    private final String getFrameSizeString() {
        return this.f25087i + VastAttributes.HORIZONTAL_POSITION + this.f25088j;
    }

    public static /* synthetic */ void getPreloadManager$annotations() {
    }

    public final long a(String str) {
        C3605n9 c3605n9;
        C3605n9 c3605n92;
        StringBuilder sb2;
        C3605n9 c3605n93;
        try {
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = p.m(str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            sb2 = new StringBuilder(str.subSequence(i10, length + 1).toString());
        } catch (NumberFormatException unused) {
            C3372e2 c3372e2 = this.f25082d;
            if (c3372e2 != null && (c3605n92 = c3372e2.f25338f) != null) {
                p.j("InMobiBanner", "TAG");
                c3605n92.b("InMobiBanner", "Invalid Placement id: " + str);
            }
        } catch (StringIndexOutOfBoundsException unused2) {
            C3372e2 c3372e22 = this.f25082d;
            if (c3372e22 != null && (c3605n9 = c3372e22.f25338f) != null) {
                p.j("InMobiBanner", "TAG");
                c3605n9.b("InMobiBanner", "Invalid Placement id: " + str);
            }
        }
        if (!a0.J("plid-", sb2.substring(0, 5), true)) {
            C3372e2 c3372e23 = this.f25082d;
            if (c3372e23 != null && (c3605n93 = c3372e23.f25338f) != null) {
                p.j("InMobiBanner", "TAG");
                c3605n93.b("InMobiBanner", "Invalid Placement id: " + str);
                return Long.MIN_VALUE;
            }
            return Long.MIN_VALUE;
        }
        String strSubstring = sb2.substring(5, sb2.length());
        p.h(strSubstring);
        int length2 = strSubstring.length() - 1;
        int i11 = 0;
        boolean z12 = false;
        while (i11 <= length2) {
            boolean z13 = p.m(strSubstring.charAt(!z12 ? i11 : length2), 32) <= 0;
            if (z12) {
                if (!z13) {
                    break;
                }
                length2--;
            } else if (z13) {
                i11++;
            } else {
                z12 = true;
            }
        }
        return Long.parseLong(strSubstring.subSequence(i11, length2 + 1).toString());
    }

    public final void a() {
        HandlerC3347d2 handlerC3347d2 = this.f25086h;
        if (handlerC3347d2 != null) {
            handlerC3347d2.removeMessages(1);
        }
    }

    public final void a(final PublisherCallbacks publisherCallbacks, String str, final boolean z10) {
        C3605n9 c3605n9;
        C3605n9 c3605n92;
        C3605n9 c3605n93;
        C3605n9 c3605n94;
        C3605n9 c3605n95;
        try {
            Jg jg2 = this.f25092n;
            jg2.getClass();
            p.k(str, "<set-?>");
            jg2.f25737g = str;
            C3372e2 c3372e2 = this.f25082d;
            if (c3372e2 == null || !c3372e2.l()) {
                Context context = getContext();
                p.j(context, "getContext(...)");
                a(this, context);
                C3372e2 c3372e22 = this.f25082d;
                if (c3372e22 != null) {
                    c3372e22.g();
                }
                C3372e2 c3372e23 = this.f25082d;
                if (c3372e23 != null && (c3605n92 = c3372e23.f25338f) != null) {
                    p.j("InMobiBanner", "TAG");
                    c3605n92.a("InMobiBanner", "load called - placementType - " + str + Z7.f30794r + this);
                }
                a("load", new sn.a() { // from class: l9.c
                    @Override // sn.a
                    public final Object invoke() {
                        return InMobiBanner.a(this.f73753b, publisherCallbacks, z10);
                    }
                });
                return;
            }
            C3372e2 c3372e24 = this.f25082d;
            if (c3372e24 != null) {
                c3372e24.g();
            }
            C3372e2 c3372e25 = this.f25082d;
            if (c3372e25 != null && (c3605n95 = c3372e25.f25338f) != null) {
                p.j("InMobiBanner", "TAG");
                c3605n95.a("InMobiBanner", "load called - placementType - " + str + Z7.f30794r + this);
            }
            C3372e2 c3372e26 = this.f25082d;
            if (c3372e26 != null && (c3605n94 = c3372e26.f25338f) != null) {
                p.j("InMobiBanner", "TAG");
                c3605n94.b("InMobiBanner", "load already in progress");
            }
            C3372e2 c3372e27 = this.f25082d;
            if (c3372e27 != null) {
                c3372e27.b((short) 2169);
            }
            Y1 y12 = this.f25079a;
            if (y12 != null) {
                y12.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
            }
            C3372e2 c3372e28 = this.f25082d;
            if (c3372e28 != null && (c3605n93 = c3372e28.f25338f) != null) {
                p.j("InMobiBanner", "TAG");
                c3605n93.b("InMobiBanner", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
            }
            Kb.a((byte) 1, "InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
        } catch (Exception e10) {
            C3372e2 c3372e29 = this.f25082d;
            if (c3372e29 != null) {
                c3372e29.a((short) 2172);
            }
            Y1 y13 = this.f25079a;
            if (y13 != null) {
                y13.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
            C3372e2 c3372e210 = this.f25082d;
            if (c3372e210 == null || (c3605n9 = c3372e210.f25338f) == null) {
                return;
            }
            p.j("InMobiBanner", "TAG");
            c3605n9.a("InMobiBanner", "Load failed with unexpected error: ", e10);
        }
    }

    public final void a(String str, final sn.a aVar) {
        C3605n9 c3605n9;
        C3605n9 c3605n92;
        C3372e2 c3372e2 = this.f25082d;
        if (c3372e2 != null && (c3605n92 = c3372e2.f25338f) != null) {
            p.j("InMobiBanner", "TAG");
            c3605n92.c("InMobiBanner", "validateSizeAndLoad");
        }
        if (b(str)) {
            if (this.f25087i > 0 && this.f25088j > 0) {
                aVar.invoke();
                return;
            }
            Runnable runnable = new Runnable() { // from class: l9.b
                @Override // java.lang.Runnable
                public final void run() {
                    InMobiBanner.a(this.f73751b, aVar);
                }
            };
            g gVar = Oj.f26095a;
            p.k(runnable, "runnable");
            ((Handler) Oj.f26095a.getValue()).postDelayed(runnable, 200L);
            return;
        }
        C3372e2 c3372e22 = this.f25082d;
        if (c3372e22 != null && (c3605n9 = c3372e22.f25338f) != null) {
            p.j("InMobiBanner", "TAG");
            c3605n9.b("InMobiBanner", "invalid banner size. fail.");
        }
        C3372e2 c3372e23 = this.f25082d;
        if (c3372e23 != null) {
            c3372e23.a((short) 2170);
        }
        Y1 y12 = this.f25079a;
        if (y12 != null) {
            y12.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
        }
    }

    public final boolean b() {
        C3605n9 c3605n9;
        C3372e2 c3372e2 = this.f25082d;
        if (c3372e2 == null || (c3605n9 = c3372e2.f25338f) == null) {
            return true;
        }
        p.j("InMobiBanner", "TAG");
        c3605n9.c("InMobiBanner", "checkStateAndLogError");
        return true;
    }

    public final boolean b(String str) {
        C3605n9 c3605n9;
        C3605n9 c3605n92;
        if (this.f25087i > 0 && this.f25088j > 0) {
            return true;
        }
        if (getLayoutParams() == null) {
            C3372e2 c3372e2 = this.f25082d;
            if (c3372e2 != null && (c3605n92 = c3372e2.f25338f) != null) {
                p.j("InMobiBanner", "TAG");
                c3605n92.b("InMobiBanner", "The layout params of the banner must be set before calling " + str + " or call setBannerSize(int widthInDp, int heightInDp) before " + str);
            }
            return false;
        }
        if (getLayoutParams().width != -2 && getLayoutParams().height != -2) {
            if (getLayoutParams() == null) {
                return true;
            }
            this.f25087i = F3.b(getLayoutParams().width / J5.b());
            this.f25088j = F3.b(getLayoutParams().height / J5.b());
            return true;
        }
        C3372e2 c3372e22 = this.f25082d;
        if (c3372e22 != null && (c3605n9 = c3372e22.f25338f) != null) {
            p.j("InMobiBanner", "TAG");
            c3605n9.b("InMobiBanner", "The height or width of a Banner ad can't be WRAP_CONTENT or call setBannerSize(int widthInDp, int heightInDp) before " + str);
        }
        return false;
    }

    @UiThread
    public final void destroy() {
        a();
        removeAllViews();
        C3372e2 c3372e2 = this.f25082d;
        if (c3372e2 != null) {
            c3372e2.j();
        }
        this.f25079a = null;
    }

    public final void disableHardwareAcceleration() {
        this.f25092n.f25734d = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53135i, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @NotNull
    public final V1 getAudioStatusInternal$media_release() {
        return this.f25081c;
    }

    @Nullable
    public final C3372e2 getMAdManager$media_release() {
        return this.f25082d;
    }

    @Nullable
    public final AudioListener getMAudioListener$media_release() {
        return this.f25080b;
    }

    @Nullable
    public final Y1 getMPubListener$media_release() {
        return this.f25079a;
    }

    @NotNull
    public final Jg getMPubSettings$media_release() {
        return this.f25092n;
    }

    public final long getPlacementId() {
        return this.f25092n.f25731a;
    }

    @NotNull
    public final PreloadManager getPreloadManager() {
        return this.f25093o;
    }

    public final void getSignals() {
        C3372e2 c3372e2 = this.f25082d;
        if (c3372e2 != null) {
            c3372e2.a(this.f25083e);
        }
    }

    public final boolean isAudioAd() {
        C3269a2 c3269a2;
        Ad adB;
        C3372e2 c3372e2 = this.f25082d;
        if (c3372e2 == null || (c3269a2 = c3372e2.f27082l) == null || (adB = c3269a2.b(0)) == null) {
            return false;
        }
        MetaInfo metaInfo = adB.getMetaInfo();
        return p.f(metaInfo != null ? metaInfo.getCreativeType() : null, "audio");
    }

    @UiThread
    public final void load() {
        b();
        a((PublisherCallbacks) this.f25083e, "NonAB", false);
    }

    @UiThread
    public final void load(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        b();
        this.f25091m = context instanceof Activity ? new WeakReference(context) : null;
        a((PublisherCallbacks) this.f25083e, "NonAB", false);
    }

    public final void load(@Nullable final byte[] bArr) {
        b();
        Jg jg2 = this.f25092n;
        jg2.getClass();
        p.k("AB", "<set-?>");
        jg2.f25737g = "AB";
        if (getLayoutParams() != null) {
            this.f25087i = F3.b(getLayoutParams().width / J5.b());
            this.f25088j = F3.b(getLayoutParams().height / J5.b());
        }
        C3372e2 c3372e2 = this.f25082d;
        if (c3372e2 == null || c3372e2.f27080j == null || c3372e2.f27081k == null || c3372e2.f25333a == 0) {
            Context context = getContext();
            p.j(context, "getContext(...)");
            a(this, context);
        }
        C3372e2 c3372e22 = this.f25082d;
        if (c3372e22 != null) {
            c3372e22.g();
        }
        a("load(byte[])", new sn.a() { // from class: l9.d
            @Override // sn.a
            public final Object invoke() {
                return InMobiBanner.a(this.f73756b, bArr);
            }
        });
    }

    public final void notifyLoss(int i10, double d10) {
        String strA = "loss notification failed to trigger";
        if (this.f25082d == null) {
            Kb.a((byte) 1, "InMobi", "loss notification failed to trigger");
            r rVar = r.f5635a;
        }
        C3372e2 c3372e2 = this.f25082d;
        if (c3372e2 != null) {
            if (c3372e2.f() != null) {
                AbstractC3547l1 abstractC3547l1F = c3372e2.f();
                strA = abstractC3547l1F != null ? abstractC3547l1F.a(i10, d10) : null;
            }
            if (strA == null || strA.length() <= 0) {
                return;
            }
            Kb.a((byte) 1, "InMobi", strA);
        }
    }

    public final void notifyWin(double d10) {
        String strA = "win notification failed to trigger";
        if (this.f25082d == null) {
            Kb.a((byte) 1, "InMobi", "win notification failed to trigger");
            r rVar = r.f5635a;
        }
        C3372e2 c3372e2 = this.f25082d;
        if (c3372e2 != null) {
            if (c3372e2.f() != null) {
                AbstractC3547l1 abstractC3547l1F = c3372e2.f();
                strA = abstractC3547l1F != null ? abstractC3547l1F.a(d10) : null;
            }
            if (strA == null || strA.length() <= 0) {
                return;
            }
            Kb.a((byte) 1, "InMobi", strA);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        C3605n9 c3605n9;
        try {
            super.onAttachedToWindow();
            C3372e2 c3372e2 = this.f25082d;
            if (c3372e2 != null) {
                c3372e2.n();
            }
            if (getLayoutParams() != null) {
                this.f25087i = F3.b(getLayoutParams().width / J5.b());
                this.f25088j = F3.b(getLayoutParams().height / J5.b());
            }
            if (!(this.f25087i > 0 && this.f25088j > 0)) {
                setupBannerSizeObserver();
            }
            scheduleRefresh$media_release();
            if (Build.VERSION.SDK_INT >= 29) {
                L5 l52 = J5.f25689a;
                Context context = getContext();
                WindowInsets rootWindowInsets = getRootWindowInsets();
                p.j(rootWindowInsets, "getRootWindowInsets(...)");
                J5.a(rootWindowInsets, context);
            }
        } catch (Exception e10) {
            C3372e2 c3372e22 = this.f25082d;
            if (c3372e22 == null || (c3605n9 = c3372e22.f25338f) == null) {
                return;
            }
            p.j("InMobiBanner", "TAG");
            c3605n9.a("InMobiBanner", "InMobiBanner#onAttachedToWindow() handler threw unexpected error: ", e10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        C3605n9 c3605n9;
        try {
            super.onDetachedFromWindow();
            a();
            C3372e2 c3372e2 = this.f25082d;
            if (c3372e2 != null) {
                c3372e2.t();
            }
        } catch (Exception e10) {
            C3372e2 c3372e22 = this.f25082d;
            if (c3372e22 == null || (c3605n9 = c3372e22.f25338f) == null) {
                return;
            }
            p.j("InMobiBanner", "TAG");
            c3605n9.a("InMobiBanner", "InMobiBanner.onDetachedFromWindow() handler threw unexpected error: ", e10);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull View view, int i10) {
        C3605n9 c3605n9;
        p.k(view, "changedView");
        try {
            super.onVisibilityChanged(view, i10);
            if (i10 == 0) {
                scheduleRefresh$media_release();
            } else {
                a();
            }
        } catch (Exception e10) {
            C3372e2 c3372e2 = this.f25082d;
            if (c3372e2 == null || (c3605n9 = c3372e2.f25338f) == null) {
                return;
            }
            p.j("InMobiBanner", "TAG");
            c3605n9.a("InMobiBanner", "InMobiBanner$1.onVisibilityChanged() handler threw unexpected error: ", e10);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        C3605n9 c3605n9;
        try {
            super.onWindowFocusChanged(z10);
            if (z10) {
                scheduleRefresh$media_release();
            } else {
                a();
            }
        } catch (Exception e10) {
            C3372e2 c3372e2 = this.f25082d;
            if (c3372e2 == null || (c3605n9 = c3372e2.f25338f) == null) {
                return;
            }
            p.j("InMobiBanner", "TAG");
            c3605n9.a("InMobiBanner", "InMobiBanner$1.onWindowFocusChanged() handler threw unexpected error: ", e10);
        }
    }

    public final void pause() {
        C3605n9 c3605n9;
        C3372e2 c3372e2;
        try {
            if (this.f25091m != null || (c3372e2 = this.f25082d) == null) {
                return;
            }
            c3372e2.m();
        } catch (Exception e10) {
            C3372e2 c3372e22 = this.f25082d;
            if (c3372e22 == null || (c3605n9 = c3372e22.f25338f) == null) {
                return;
            }
            p.j("InMobiBanner", "TAG");
            c3605n9.a("InMobiBanner", "SDK encountered unexpected error in pausing ad; ", e10);
        }
    }

    public final void refreshBanner$media_release() {
        a((PublisherCallbacks) this.f25083e, "NonAB", true);
    }

    public final void resume() {
        C3605n9 c3605n9;
        C3372e2 c3372e2;
        try {
            if (this.f25091m != null || (c3372e2 = this.f25082d) == null) {
                return;
            }
            c3372e2.p();
        } catch (Exception e10) {
            C3372e2 c3372e22 = this.f25082d;
            if (c3372e22 == null || (c3605n9 = c3372e22.f25338f) == null) {
                return;
            }
            p.j("InMobiBanner", "TAG");
            c3605n9.a("InMobiBanner", "SDK encountered unexpected error in resuming ad; ", e10);
        }
    }

    public final void scheduleRefresh$media_release() {
        HandlerC3347d2 handlerC3347d2;
        if (isShown() && hasWindowFocus()) {
            HandlerC3347d2 handlerC3347d22 = this.f25086h;
            if (handlerC3347d22 != null) {
                handlerC3347d22.removeMessages(1);
            }
            C3372e2 c3372e2 = this.f25082d;
            if (c3372e2 == null || !c3372e2.i() || !this.f25085g || (handlerC3347d2 = this.f25086h) == null) {
                return;
            }
            handlerC3347d2.sendEmptyMessageDelayed(1, this.f25084f * 1000);
        }
    }

    public final void setAnimationType(@NotNull AnimationType animationType) {
        p.k(animationType, "animationType");
        this.f25089k = animationType;
    }

    public final void setAudioListener(@NotNull AudioListener audioListener) {
        p.k(audioListener, "audioListener");
        this.f25080b = audioListener;
        V1 v12 = this.f25081c;
        if (v12 == V1.f26461d || audioListener == null) {
            return;
        }
        V1.f26459b.getClass();
        p.k(v12, "item");
        int iOrdinal = v12.ordinal();
        audioListener.onAudioStatusChanged(this, iOrdinal != 1 ? iOrdinal != 2 ? AudioStatus.COMPLETED : AudioStatus.PAUSED : AudioStatus.PLAYING);
    }

    public final void setAudioStatusInternal$media_release(@NotNull V1 v12) {
        p.k(v12, "<set-?>");
        this.f25081c = v12;
    }

    public final void setBannerSize(@IntRange(from = 1) int i10, @IntRange(from = 1) int i11) {
        this.f25087i = i10;
        this.f25088j = i11;
    }

    public final void setContentUrl(@NotNull String str) {
        p.k(str, "contentUrl");
        this.f25092n.f25735e = str;
    }

    public final void setEnableAutoRefresh(boolean z10) {
        C3605n9 c3605n9;
        try {
            if (this.f25085g == z10) {
                return;
            }
            this.f25085g = z10;
            if (z10) {
                scheduleRefresh$media_release();
            } else {
                a();
            }
        } catch (Exception e10) {
            C3372e2 c3372e2 = this.f25082d;
            if (c3372e2 == null || (c3605n9 = c3372e2.f25338f) == null) {
                return;
            }
            p.j("InMobiBanner", "TAG");
            c3605n9.a("InMobiBanner", "Setting up auto-refresh failed with unexpected error: ", e10);
        }
    }

    public final void setExtras(@Nullable Map<String, String> map) {
        if (map != null) {
            String str = map.get("tp");
            if (!TextUtils.isEmpty(str)) {
                Ki.f25816b = str;
            }
            String str2 = map.get("tp-v");
            if (!TextUtils.isEmpty(str2)) {
                Ki.f25815a = str2;
            }
        }
        this.f25092n.f25733c = map;
    }

    public final void setKeywords(@Nullable String str) {
        this.f25092n.f25732b = str;
    }

    public final void setListener(@NotNull BannerAdEventListener bannerAdEventListener) {
        p.k(bannerAdEventListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f25079a = new Z1(bannerAdEventListener);
    }

    public final void setMAdManager$media_release(@Nullable C3372e2 c3372e2) {
        this.f25082d = c3372e2;
    }

    public final void setMAudioListener$media_release(@Nullable AudioListener audioListener) {
        this.f25080b = audioListener;
    }

    public final void setMPubListener$media_release(@Nullable Y1 y12) {
        this.f25079a = y12;
    }

    public final void setRefreshInterval(int i10) {
        C3605n9 c3605n9;
        try {
            Jg jg2 = this.f25092n;
            jg2.getClass();
            p.k("NonAB", "<set-?>");
            jg2.f25737g = "NonAB";
            Context context = getContext();
            p.j(context, "getContext(...)");
            a(this, context);
            C3372e2 c3372e2 = this.f25082d;
            this.f25084f = c3372e2 != null ? c3372e2.a(i10, this.f25084f) : 0;
        } catch (Exception e10) {
            C3372e2 c3372e22 = this.f25082d;
            if (c3372e22 == null || (c3605n9 = c3372e22.f25338f) == null) {
                return;
            }
            p.j("InMobiBanner", "TAG");
            c3605n9.a("InMobiBanner", "Setting refresh interval failed with unexpected error: ", e10);
        }
    }

    public final void setWatermarkData(@NotNull WatermarkData watermarkData) {
        p.k(watermarkData, "watermarkData");
        C3372e2 c3372e2 = this.f25082d;
        if (c3372e2 != null) {
            c3372e2.a(watermarkData);
        }
    }

    @TargetApi(16)
    public final void setupBannerSizeObserver() {
        getViewTreeObserver().addOnGlobalLayoutListener(new V8(this));
    }

    @UiThread
    public final void swapAdUnitsAndDisplayAd$media_release() {
        C3605n9 c3605n9;
        C3372e2 c3372e2 = this.f25082d;
        if (c3372e2 != null) {
            c3372e2.s();
        }
        try {
            Animation animationA = b.a(this.f25089k, getWidth(), getHeight());
            C3372e2 c3372e22 = this.f25082d;
            if (c3372e22 != null) {
                c3372e22.a(this);
            }
            if (animationA != null) {
                startAnimation(animationA);
            }
        } catch (Exception e10) {
            C3372e2 c3372e23 = this.f25082d;
            if (c3372e23 == null || (c3605n9 = c3372e23.f25338f) == null) {
                return;
            }
            p.j("InMobiBanner", "TAG");
            c3605n9.a("InMobiBanner", "Unexpected error while displaying Banner Ad : ", e10);
        }
    }
}
