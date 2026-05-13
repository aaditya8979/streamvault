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
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import androidx.annotation.IntRange;
import androidx.annotation.UiThread;
import bn.g;
import bo.a0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiAudio;
import com.inmobi.ads.exceptions.InvalidPlacementIdException;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.AudioAdEventListener;
import com.inmobi.media.C3476i4;
import com.inmobi.media.C3850x5;
import com.inmobi.media.F3;
import com.inmobi.media.J5;
import com.inmobi.media.Jg;
import com.inmobi.media.Ji;
import com.inmobi.media.Kb;
import com.inmobi.media.Ki;
import com.inmobi.media.L5;
import com.inmobi.media.N1;
import com.inmobi.media.Oj;
import com.inmobi.media.R1;
import com.inmobi.media.S8;
import com.inmobi.media.W1;
import com.inmobi.media.Y3;
import com.inmobi.media.core.config.models.AdConfig;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes5.dex */
public final class InMobiAudio extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAdEventListener f25072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public W1 f25073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f25074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Jg f25075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f25076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f25078g;

    public static final class a extends R1 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull InMobiAudio inMobiAudio) {
            super(inMobiAudio);
            p.k(inMobiAudio, "audio");
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(@NotNull InMobiAdRequestStatus inMobiAdRequestStatus) {
            AudioAdEventListener mPubListener$media_release;
            p.k(inMobiAdRequestStatus, "status");
            InMobiAudio inMobiAudio = a().get();
            if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
                return;
            }
            mPubListener$media_release.onAdLoadFailed(inMobiAudio, inMobiAdRequestStatus);
        }

        @Override // com.inmobi.media.R1, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(@NotNull AdMetaInfo adMetaInfo) {
            p.k(adMetaInfo, "info");
            super.onAdFetchSuccessful(adMetaInfo);
            InMobiAudio inMobiAudio = a().get();
            if (inMobiAudio == null) {
                return;
            }
            try {
                W1 mAdManager$media_release = inMobiAudio.getMAdManager$media_release();
                if (mAdManager$media_release != null) {
                    mAdManager$media_release.k();
                }
            } catch (IllegalStateException e10) {
                Kb.a((byte) 1, "InMobiAudio", e10.getMessage());
                AudioAdEventListener mPubListener$media_release = inMobiAudio.getMPubListener$media_release();
                if (mPubListener$media_release != null) {
                    mPubListener$media_release.onAdLoadFailed(inMobiAudio, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiAudio(@NotNull Context context, long j10) {
        super(context);
        p.k(context, GAMConfig.KEY_CONTEXT);
        a aVar = new a(this);
        Jg jg2 = new Jg();
        this.f25075d = jg2;
        if (!Ji.d()) {
            throw new SdkNotInitializedException("InMobiAudio");
        }
        if (context instanceof Activity) {
            this.f25074c = new WeakReference(context);
        }
        W1 w12 = new W1(aVar);
        this.f25073b = w12;
        jg2.f25731a = j10;
        w12.a(context, jg2, getFrameSizeString());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiAudio(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(attributeSet, "attributeSet");
        a aVar = new a(this);
        Jg jg2 = new Jg();
        this.f25075d = jg2;
        if (!Ji.d()) {
            throw new SdkNotInitializedException("InMobiAudio");
        }
        if (context instanceof Activity) {
            this.f25074c = new WeakReference(context);
        }
        this.f25073b = new W1(aVar);
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.inmobi.ads", "placementId");
        if (attributeValue != null) {
            long jA = a(attributeValue);
            if (jA == Long.MIN_VALUE) {
                throw new InvalidPlacementIdException();
            }
            jg2.f25731a = jA;
        }
        Context context2 = getContext();
        p.j(context2, "getContext(...)");
        W1 w12 = this.f25073b;
        if (w12 != null) {
            w12.a(context2, jg2, getFrameSizeString());
        }
    }

    public static long a(String str) {
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
            StringBuilder sb2 = new StringBuilder(str.subSequence(i10, length + 1).toString());
            if (!a0.J("plid-", sb2.substring(0, 5), true)) {
                Kb.a((byte) 1, "InMobiAudio", "Placement id value supplied in XML layout is not valid. Please make sure placement id is in plid-0123456789 format.");
                Kb.a((byte) 1, "InMobiAudio", "Invalid Placement id: " + str);
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
        } catch (NumberFormatException unused) {
            Kb.a((byte) 1, "InMobiAudio", "Placement id value supplied in XML layout is not valid. Audio creation failed.");
            Kb.a((byte) 1, "InMobiAudio", "Invalid Placement id: " + str);
            return Long.MIN_VALUE;
        } catch (StringIndexOutOfBoundsException unused2) {
            Kb.a((byte) 1, "InMobiAudio", "Placement id value supplied in XML layout is not valid. Please make sure placement id is in plid-0123456789 format.");
            Kb.a((byte) 1, "InMobiAudio", "Invalid Placement id: " + str);
            return Long.MIN_VALUE;
        }
    }

    public static final void a(InMobiAudio inMobiAudio) {
        W1 w12;
        W1 w13;
        try {
            boolean z10 = false;
            if (!(inMobiAudio.f25077f > 0 && inMobiAudio.f25078g > 0)) {
                Kb.a((byte) 1, "InMobiAudio", "The height or width of the audio ad can not be determined");
                W1 w14 = inMobiAudio.f25073b;
                if (w14 != null) {
                    w14.a((short) 108);
                }
                W1 w15 = inMobiAudio.f25073b;
                if (w15 != null) {
                    w15.a(w15.f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    return;
                }
                return;
            }
            long j10 = inMobiAudio.f25076e;
            if (j10 == 0 || (w13 = inMobiAudio.f25073b) == null || w13.a(j10)) {
                inMobiAudio.f25076e = SystemClock.elapsedRealtime();
                z10 = true;
            }
            if (!z10 || (w12 = inMobiAudio.f25073b) == null) {
                return;
            }
            w12.b(inMobiAudio.getFrameSizeString());
        } catch (Exception e10) {
            W1 w16 = inMobiAudio.f25073b;
            if (w16 != null) {
                w16.a((short) 105);
            }
            Kb.a((byte) 1, "InMobiAudio", "SDK encountered unexpected error while loading an ad");
            e10.getMessage();
        }
    }

    public static final boolean access$hasValidSize(InMobiAudio inMobiAudio) {
        return inMobiAudio.f25077f > 0 && inMobiAudio.f25078g > 0;
    }

    private final String getFrameSizeString() {
        return this.f25077f + VastAttributes.HORIZONTAL_POSITION + this.f25078g;
    }

    public final boolean a() {
        if (this.f25077f <= 0 || this.f25078g <= 0) {
            if (getLayoutParams() == null) {
                Kb.a((byte) 1, "InMobiAudio", "The layout params of the audio ad view must be set before calling load or call setAudioSize(int widthInDp, int heightInDp) before load");
                return false;
            }
            if (getLayoutParams().width == -2 || getLayoutParams().height == -2) {
                Kb.a((byte) 1, "InMobiAudio", "The height or width of a Audio ad can't be WRAP_CONTENT or call setAudioSize(int widthInDp, int heightInDp) before load");
                return false;
            }
            if (getLayoutParams() != null) {
                this.f25077f = F3.b(getLayoutParams().width / J5.b());
                this.f25078g = F3.b(getLayoutParams().height / J5.b());
            }
        }
        return true;
    }

    public final void b() {
        W1 w12;
        W1 w13;
        try {
            C3476i4 c3476i4 = Y3.f26611a;
            p.k(AdConfig.class, "clazz");
            C3476i4 c3476i42 = Y3.f26611a;
            if (!((AdConfig) c3476i42.a(AdConfig.class)).getAudio().isAudioEnabled()) {
                W1 w14 = this.f25073b;
                if (w14 != null) {
                    w14.a((short) 107);
                }
                W1 w15 = this.f25073b;
                if (w15 != null) {
                    w15.a(w15.f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.FEATURE_DISABLED));
                }
                Kb.a((byte) 1, "InMobi", "");
                return;
            }
            Jg jg2 = this.f25075d;
            jg2.getClass();
            p.k("NonAB", "<set-?>");
            jg2.f25737g = "NonAB";
            Context context = getContext();
            p.j(context, "getContext(...)");
            W1 w16 = this.f25073b;
            if (w16 != null) {
                w16.a(context, this.f25075d, getFrameSizeString());
            }
            W1 w17 = this.f25073b;
            boolean z10 = false;
            if (w17 != null) {
                N1 n12 = w17.f26516j;
                if (n12 != null && n12.f27506b == 7) {
                    w17.b((short) 15);
                    AudioAdEventListener audioAdEventListener = this.f25072a;
                    if (audioAdEventListener != null) {
                        audioAdEventListener.onAdLoadFailed(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
                    }
                    Kb.a((byte) 1, "InMobiAudio", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
                    return;
                }
            }
            if (!a()) {
                W1 w18 = this.f25073b;
                if (w18 != null) {
                    w18.a((short) 108);
                }
                W1 w19 = this.f25073b;
                if (w19 != null) {
                    w19.a(w19.f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID));
                    return;
                }
                return;
            }
            p.k(AdConfig.class, "clazz");
            if (((AdConfig) c3476i42.a(AdConfig.class)).getAudio().getMinDeviceVolume() > C3850x5.f28483a.a(Ji.f25747a, Ji.f25752f)) {
                W1 w110 = this.f25073b;
                if (w110 != null) {
                    w110.a((short) 106);
                }
                W1 w111 = this.f25073b;
                if (w111 != null) {
                    w111.a(w111.f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.DEVICE_AUDIO_LEVEL_LOW));
                    return;
                }
                return;
            }
            if (!(this.f25077f > 0 && this.f25078g > 0)) {
                Runnable runnable = new Runnable() { // from class: l9.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        InMobiAudio.a(this.f73750b);
                    }
                };
                g gVar = Oj.f26095a;
                p.k(runnable, "runnable");
                ((Handler) Oj.f26095a.getValue()).postDelayed(runnable, 200L);
                return;
            }
            long j10 = this.f25076e;
            if (j10 == 0 || (w13 = this.f25073b) == null || w13.a(j10)) {
                this.f25076e = SystemClock.elapsedRealtime();
                z10 = true;
            }
            if (!z10 || (w12 = this.f25073b) == null) {
                return;
            }
            w12.b(getFrameSizeString());
        } catch (Exception e10) {
            W1 w112 = this.f25073b;
            if (w112 != null) {
                w112.a((short) 105);
            }
            Kb.a((byte) 1, "InMobiAudio", "Unable to load ad; SDK encountered an unexpected error");
            e10.getMessage();
        }
    }

    @UiThread
    public final void destroy() {
        removeAllViews();
        W1 w12 = this.f25073b;
        if (w12 != null) {
            w12.h();
        }
        this.f25072a = null;
    }

    public final void disableHardwareAcceleration() {
        this.f25075d.f25734d = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53135i, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public final W1 getMAdManager$media_release() {
        return this.f25073b;
    }

    @Nullable
    public final AudioAdEventListener getMPubListener$media_release() {
        return this.f25072a;
    }

    @UiThread
    public final void load() {
        W1 w12 = this.f25073b;
        if (w12 != null) {
            w12.g();
        }
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            W1 w12 = this.f25073b;
            if (w12 != null) {
                w12.j();
            }
            if (getLayoutParams() != null) {
                this.f25077f = F3.b(getLayoutParams().width / J5.b());
                this.f25078g = F3.b(getLayoutParams().height / J5.b());
            }
            if (!(this.f25077f > 0 && this.f25078g > 0)) {
                setupViewSizeObserver();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                L5 l52 = J5.f25689a;
                Context context = getContext();
                WindowInsets rootWindowInsets = getRootWindowInsets();
                p.j(rootWindowInsets, "getRootWindowInsets(...)");
                J5.a(rootWindowInsets, context);
            }
        } catch (Exception e10) {
            Kb.a((byte) 1, "InMobiAudio", "InMobiAudio#onAttachedToWindow() handler threw unexpected error");
            e10.getMessage();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
            W1 w12 = this.f25073b;
            if (w12 != null) {
                w12.p();
            }
        } catch (Exception e10) {
            Kb.a((byte) 1, "InMobiAudio", "InMobiAudio.onDetachedFromWindow() handler threw unexpected error");
            e10.getMessage();
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

    public final void pause() {
        W1 w12;
        try {
            if (this.f25074c != null || (w12 = this.f25073b) == null) {
                return;
            }
            w12.i();
        } catch (Exception e10) {
            Kb.a((byte) 1, "InMobi", "Could not pause ad; SDK encountered an unexpected error");
            e10.getMessage();
        }
    }

    public final void resume() {
        W1 w12;
        try {
            if (this.f25074c != null || (w12 = this.f25073b) == null) {
                return;
            }
            w12.l();
        } catch (Exception e10) {
            Kb.a((byte) 1, "InMobi", "Could not resume ad; SDK encountered an unexpected error");
            e10.getMessage();
        }
    }

    public final void setAudioSize(@IntRange(from = 1) int i10, @IntRange(from = 1) int i11) {
        this.f25077f = i10;
        this.f25078g = i11;
    }

    public final void setContentUrl(@NotNull String str) {
        p.k(str, "contentUrl");
        this.f25075d.f25735e = str;
    }

    public final void setExtras(@Nullable Map<String, String> map) {
        if (map != null) {
            String str = map.get("tp");
            if (str != null && !TextUtils.isEmpty(str)) {
                Ki.f25816b = str;
            }
            String str2 = map.get("tp-v");
            if (str2 != null && !TextUtils.isEmpty(str2)) {
                Ki.f25815a = str2;
            }
        }
        this.f25075d.f25733c = map;
    }

    public final void setKeywords(@Nullable String str) {
        this.f25075d.f25732b = str;
    }

    public final void setListener(@NotNull AudioAdEventListener audioAdEventListener) {
        p.k(audioAdEventListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f25072a = audioAdEventListener;
    }

    public final void setMAdManager$media_release(@Nullable W1 w12) {
        this.f25073b = w12;
    }

    public final void setMPubListener$media_release(@Nullable AudioAdEventListener audioAdEventListener) {
        this.f25072a = audioAdEventListener;
    }

    @TargetApi(16)
    public final void setupViewSizeObserver() {
        getViewTreeObserver().addOnGlobalLayoutListener(new S8(this));
    }

    @UiThread
    public final void show() {
        W1 w12 = this.f25073b;
        if (w12 != null) {
            w12.n();
        }
        W1 w13 = this.f25073b;
        if (w13 != null) {
            w13.a(this);
        }
    }
}
