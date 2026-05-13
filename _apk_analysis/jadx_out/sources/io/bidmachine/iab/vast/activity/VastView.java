package io.bidmachine.iab.vast.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.ironsource.G5;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import io.bidmachine.iab.CacheControl;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.measurer.MraidAdMeasurer;
import io.bidmachine.iab.measurer.VastAdMeasurer;
import io.bidmachine.iab.mraid.MraidInterstitial;
import io.bidmachine.iab.mraid.MraidInterstitialListener;
import io.bidmachine.iab.utils.Assets;
import io.bidmachine.iab.utils.IabClickCallback;
import io.bidmachine.iab.utils.IabCloseWrapper;
import io.bidmachine.iab.utils.IabCountDownWrapper;
import io.bidmachine.iab.utils.IabCtaWrapper;
import io.bidmachine.iab.utils.IabElementStyle;
import io.bidmachine.iab.utils.IabElementWrapper;
import io.bidmachine.iab.utils.IabLoadingWrapper;
import io.bidmachine.iab.utils.IabMuteWrapper;
import io.bidmachine.iab.utils.IabProgressWrapper;
import io.bidmachine.iab.utils.IabRepeatWrapper;
import io.bidmachine.iab.utils.Utils;
import io.bidmachine.iab.vast.TrackingEvent;
import io.bidmachine.iab.vast.VastExtension;
import io.bidmachine.iab.vast.VastHelper;
import io.bidmachine.iab.vast.VastLog;
import io.bidmachine.iab.vast.VastPlaybackListener;
import io.bidmachine.iab.vast.VastRequest;
import io.bidmachine.iab.vast.VastRequestManager;
import io.bidmachine.iab.vast.VastSpecError;
import io.bidmachine.iab.vast.VastVideoLoadedListener;
import io.bidmachine.iab.vast.VastViewListener;
import io.bidmachine.iab.vast.VideoType;
import io.bidmachine.iab.vast.processor.VastAd;
import io.bidmachine.iab.vast.tags.AppodealExtensionTag;
import io.bidmachine.iab.vast.tags.CompanionTag;
import io.bidmachine.iab.vast.tags.PostBannerTag;
import io.bidmachine.iab.vast.view.IabVideoTexture;
import io.bidmachine.iab.view.CloseableLayout;
import io.bidmachine.rendering.model.PrivacySheetParams;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class VastView extends RelativeLayout implements IabClickCallback {
    private int A;
    private int B;
    private int C;
    private int D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private final List O;
    private final List P;
    private final Runnable Q;
    private final Runnable R;
    private final a S;
    private final a T;
    private final LinkedList U;
    private int V;
    private float W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f69538a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final a f69539a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IabVideoTexture f69540b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final TextureView.SurfaceTextureListener f69541b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FrameLayout f69542c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final MediaPlayer.OnCompletionListener f69543c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Surface f69544d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final MediaPlayer.OnErrorListener f69545d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FrameLayout f69546e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final MediaPlayer.OnPreparedListener f69547e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CloseableLayout f69548f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final MediaPlayer.OnVideoSizeChangedListener f69549f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public IabCloseWrapper f69550g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private VastHelper.OnScreenStateChangeListener f69551g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public IabCountDownWrapper f69552h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final View.OnTouchListener f69553h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public IabRepeatWrapper f69554i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final WebChromeClient f69555i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public IabMuteWrapper f69556j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final WebViewClient f69557j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public IabLoadingWrapper f69558k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public IabProgressWrapper f69559l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IabCtaWrapper f69560m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public MediaPlayer f69561n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f69562o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CompanionTag f69563p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CompanionTag f69564q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ImageView f69565r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public MraidInterstitial f69566s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public VastRequest f69567t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b0 f69568u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private VastViewListener f69569v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private VastPlaybackListener f69570w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private VastAdMeasurer f69571x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private MraidAdMeasurer f69572y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private a0 f69573z;

    public static class PostBannerAdMeasurer implements MraidAdMeasurer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final VastView f69574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MraidAdMeasurer f69575b;

        public PostBannerAdMeasurer(@NonNull VastView vastView, @NonNull MraidAdMeasurer mraidAdMeasurer) {
            this.f69574a = vastView;
            this.f69575b = mraidAdMeasurer;
        }

        @Override // io.bidmachine.iab.measurer.MraidAdMeasurer, io.bidmachine.iab.measurer.AdMeasurer
        public void onAdClicked() {
            this.f69575b.onAdClicked();
        }

        @Override // io.bidmachine.iab.measurer.MraidAdMeasurer, io.bidmachine.iab.measurer.AdMeasurer
        public void onAdShown() {
            this.f69575b.onAdShown();
        }

        @Override // io.bidmachine.iab.measurer.MraidAdMeasurer, io.bidmachine.iab.measurer.AdMeasurer
        public void onAdViewReady(@NonNull WebView webView) {
            this.f69575b.onAdViewReady(webView);
        }

        @Override // io.bidmachine.iab.measurer.MraidAdMeasurer, io.bidmachine.iab.measurer.AdMeasurer
        public void onError(@NonNull IabError iabError) {
            this.f69575b.onError(iabError);
        }

        @Override // io.bidmachine.iab.measurer.MraidAdMeasurer
        @NonNull
        public String prepareCreativeForMeasure(@NonNull String str) {
            return this.f69575b.prepareCreativeForMeasure(str);
        }

        @Override // io.bidmachine.iab.measurer.MraidAdMeasurer, io.bidmachine.iab.measurer.AdMeasurer
        public void registerAdContainer(@NonNull ViewGroup viewGroup) {
            this.f69575b.registerAdContainer(this.f69574a);
        }

        @Override // io.bidmachine.iab.measurer.MraidAdMeasurer, io.bidmachine.iab.measurer.AdMeasurer
        public void registerAdView(@NonNull WebView webView) {
            this.f69575b.registerAdView(webView);
        }
    }

    public interface a {
        void a(int i10, int i11, float f10);
    }

    public static abstract class a0 extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f69576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f69577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f69578c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Bitmap f69579d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f69580e;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a0 a0Var = a0.this;
                a0Var.a(a0Var.f69579d);
            }
        }

        public a0(Context context, Uri uri, String str) {
            this.f69576a = new WeakReference(context);
            this.f69577b = uri;
            this.f69578c = str;
            if (str == null && (uri == null || TextUtils.isEmpty(uri.getPath()) || !new File(uri.getPath()).exists())) {
                a((Bitmap) null);
            } else {
                start();
            }
        }

        public void a() {
            this.f69580e = true;
        }

        public abstract void a(Bitmap bitmap);

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Context context = (Context) this.f69576a.get();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            if (context != null) {
                try {
                    Uri uri = this.f69577b;
                    if (uri != null) {
                        mediaMetadataRetriever.setDataSource(context, uri);
                    } else {
                        String str = this.f69578c;
                        if (str != null) {
                            mediaMetadataRetriever.setDataSource(str, new HashMap());
                        }
                    }
                    this.f69579d = mediaMetadataRetriever.getFrameAtTime((Long.parseLong(mediaMetadataRetriever.extractMetadata(9)) / 2) * 1000, 2);
                } catch (Exception e10) {
                    VastLog.e("MediaFrameRetriever", e10.getMessage(), new Object[0]);
                }
            }
            try {
                mediaMetadataRetriever.release();
            } catch (IOException e11) {
                VastLog.e("MediaFrameRetriever", e11.getMessage(), new Object[0]);
            }
            if (this.f69580e) {
                return;
            }
            Utils.onUiThread(new a());
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (VastView.this.isPlaybackStarted()) {
                VastView.this.d();
            }
        }
    }

    public static class b0 implements Parcelable {
        public static final Parcelable.Creator<b0> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f69583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f69584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f69585c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f69586d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f69587e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f69588f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f69589g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f69590h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f69591i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f69592j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f69593k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f69594l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f69595m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f69596n;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b0 createFromParcel(Parcel parcel) {
                return new b0(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b0[] newArray(int i10) {
                return new b0[i10];
            }
        }

        public b0() {
            this.f69583a = null;
            this.f69584b = 5.0f;
            this.f69585c = 0;
            this.f69586d = 0;
            this.f69587e = true;
            this.f69588f = false;
            this.f69589g = false;
            this.f69590h = false;
            this.f69591i = false;
            this.f69592j = false;
            this.f69593k = false;
            this.f69594l = false;
            this.f69595m = true;
            this.f69596n = false;
        }

        public b0(Parcel parcel) {
            this.f69583a = null;
            this.f69584b = 5.0f;
            this.f69585c = 0;
            this.f69586d = 0;
            this.f69587e = true;
            this.f69588f = false;
            this.f69589g = false;
            this.f69590h = false;
            this.f69591i = false;
            this.f69592j = false;
            this.f69593k = false;
            this.f69594l = false;
            this.f69595m = true;
            this.f69596n = false;
            this.f69583a = parcel.readString();
            this.f69584b = parcel.readFloat();
            this.f69585c = parcel.readInt();
            this.f69586d = parcel.readInt();
            this.f69587e = parcel.readByte() != 0;
            this.f69588f = parcel.readByte() != 0;
            this.f69589g = parcel.readByte() != 0;
            this.f69590h = parcel.readByte() != 0;
            this.f69591i = parcel.readByte() != 0;
            this.f69592j = parcel.readByte() != 0;
            this.f69593k = parcel.readByte() != 0;
            this.f69594l = parcel.readByte() != 0;
            this.f69595m = parcel.readByte() != 0;
            this.f69596n = parcel.readByte() != 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f69583a);
            parcel.writeFloat(this.f69584b);
            parcel.writeInt(this.f69585c);
            parcel.writeInt(this.f69586d);
            parcel.writeByte(this.f69587e ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f69588f ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f69589g ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f69590h ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f69591i ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f69592j ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f69593k ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f69594l ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f69595m ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f69596n ? (byte) 1 : (byte) 0);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (VastView.this.isPlaybackStarted() && VastView.this.f69561n.isPlaying()) {
                    int duration = VastView.this.f69561n.getDuration();
                    int currentPosition = VastView.this.f69561n.getCurrentPosition();
                    if (currentPosition > 0) {
                        float f10 = (currentPosition * 100.0f) / duration;
                        VastView.this.S.a(duration, currentPosition, f10);
                        VastView.this.T.a(duration, currentPosition, f10);
                        VastView.this.f69539a0.a(duration, currentPosition, f10);
                        if (f10 > 105.0f) {
                            VastLog.e(VastView.this.f69538a, "Playback tracking: video hang detected", new Object[0]);
                            VastView.this.g();
                        }
                    }
                }
            } catch (Exception e10) {
                VastLog.e(VastView.this.f69538a, "Playback tracking exception: %s", e10.getMessage());
            }
            VastView.this.postDelayed(this, 16L);
        }
    }

    public class d implements a {
        public d() {
        }

        @Override // io.bidmachine.iab.vast.activity.VastView.a
        public void a(int i10, int i11, float f10) {
            IabCountDownWrapper iabCountDownWrapper;
            VastView vastView = VastView.this;
            b0 b0Var = vastView.f69568u;
            if (b0Var.f69591i || b0Var.f69584b == 0.0f || !vastView.a(vastView.f69567t)) {
                return;
            }
            VastView vastView2 = VastView.this;
            float f11 = vastView2.f69568u.f69584b * 1000.0f;
            float f12 = i11;
            float f13 = f11 - f12;
            int i12 = (int) ((f12 * 100.0f) / f11);
            VastLog.d(vastView2.f69538a, "Skip percent: %s", Integer.valueOf(i12));
            if (i12 < 100 && (iabCountDownWrapper = VastView.this.f69552h) != null) {
                iabCountDownWrapper.changePercentage(i12, (int) Math.ceil(((double) f13) / 1000.0d));
            }
            if (f13 <= 0.0f) {
                VastView vastView3 = VastView.this;
                b0 b0Var2 = vastView3.f69568u;
                b0Var2.f69584b = 0.0f;
                b0Var2.f69591i = true;
                vastView3.setCloseControlsVisible(true);
            }
        }
    }

    public class e implements a {
        public e() {
        }

        @Override // io.bidmachine.iab.vast.activity.VastView.a
        public void a(int i10, int i11, float f10) {
            VastView vastView = VastView.this;
            b0 b0Var = vastView.f69568u;
            if (b0Var.f69590h && b0Var.f69585c == 3) {
                return;
            }
            if (vastView.f69567t.getMaxDurationMillis() > 0 && i11 > VastView.this.f69567t.getMaxDurationMillis() && VastView.this.f69567t.getVideoType() == VideoType.Rewarded) {
                VastView vastView2 = VastView.this;
                vastView2.f69568u.f69591i = true;
                vastView2.setCloseControlsVisible(true);
            }
            VastView vastView3 = VastView.this;
            int i12 = vastView3.f69568u.f69585c;
            if (f10 > i12 * 25.0f) {
                if (i12 == 3) {
                    VastLog.d(vastView3.f69538a, "Video at third quartile: (%s)", Float.valueOf(f10));
                    VastView.this.c(TrackingEvent.thirdQuartile);
                    if (VastView.this.f69570w != null) {
                        VastView.this.f69570w.onVideoThirdQuartile();
                    }
                } else if (i12 == 0) {
                    VastLog.d(vastView3.f69538a, "Video at start: (%s)", Float.valueOf(f10));
                    VastView.this.c(TrackingEvent.start);
                    if (VastView.this.f69570w != null) {
                        VastView.this.f69570w.onVideoStarted(i10, VastView.this.f69568u.f69588f ? 0.0f : 1.0f);
                    }
                } else if (i12 == 1) {
                    VastLog.d(vastView3.f69538a, "Video at first quartile: (%s)", Float.valueOf(f10));
                    VastView.this.c(TrackingEvent.firstQuartile);
                    if (VastView.this.f69570w != null) {
                        VastView.this.f69570w.onVideoFirstQuartile();
                    }
                } else if (i12 == 2) {
                    VastLog.d(vastView3.f69538a, "Video at midpoint: (%s)", Float.valueOf(f10));
                    VastView.this.c(TrackingEvent.midpoint);
                    if (VastView.this.f69570w != null) {
                        VastView.this.f69570w.onVideoMidpoint();
                    }
                }
                VastView.this.f69568u.f69585c++;
            }
        }
    }

    public class f implements a {
        public f() {
        }

        @Override // io.bidmachine.iab.vast.activity.VastView.a
        public void a(int i10, int i11, float f10) {
            if (VastView.this.U.size() == 2 && ((Integer) VastView.this.U.getFirst()).intValue() > ((Integer) VastView.this.U.getLast()).intValue()) {
                VastLog.e(VastView.this.f69538a, "Playing progressing error: seek", new Object[0]);
                VastView.this.U.removeFirst();
            }
            if (VastView.this.U.size() == 19) {
                int iIntValue = ((Integer) VastView.this.U.getFirst()).intValue();
                int iIntValue2 = ((Integer) VastView.this.U.getLast()).intValue();
                VastLog.d(VastView.this.f69538a, "Playing progressing position: last=%d, first=%d)", Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue));
                if (iIntValue2 > iIntValue) {
                    VastView.this.U.removeFirst();
                } else {
                    VastView.l(VastView.this);
                    if (VastView.this.V >= 3) {
                        VastView.this.c(IabError.internal("Playing progressing error: video hang detected"));
                        return;
                    }
                }
            }
            try {
                VastView.this.U.addLast(Integer.valueOf(i11));
                if (i10 == 0 || i11 <= 0) {
                    return;
                }
                VastView vastView = VastView.this;
                if (vastView.f69559l != null) {
                    VastLog.d(vastView.f69538a, "Playing progressing percent: %s", Float.valueOf(f10));
                    if (VastView.this.W < f10) {
                        VastView.this.W = f10;
                        int i12 = i10 / 1000;
                        VastView.this.f69559l.changePercentage(f10, Math.min(i12, (int) Math.ceil(i11 / 1000.0f)), i12);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public class g implements TextureView.SurfaceTextureListener {
        public g() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            VastLog.d(VastView.this.f69538a, "onSurfaceTextureAvailable", new Object[0]);
            VastView.this.f69544d = new Surface(surfaceTexture);
            VastView.this.G = true;
            if (VastView.this.H) {
                VastView.this.H = false;
                VastView.this.startPlayback("onSurfaceTextureAvailable");
            } else if (VastView.this.isPlaybackStarted()) {
                VastView vastView = VastView.this;
                vastView.f69561n.setSurface(vastView.f69544d);
                VastView.this.r();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            VastLog.d(VastView.this.f69538a, "onSurfaceTextureDestroyed", new Object[0]);
            VastView vastView = VastView.this;
            vastView.f69544d = null;
            vastView.G = false;
            if (VastView.this.isPlaybackStarted()) {
                VastView.this.f69561n.setSurface(null);
                VastView.this.l();
            }
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            VastLog.d(VastView.this.f69538a, "onSurfaceTextureSizeChanged: %d/%d", Integer.valueOf(i10), Integer.valueOf(i11));
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public class h implements MediaPlayer.OnCompletionListener {
        public h() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            VastLog.d(VastView.this.f69538a, "MediaPlayer - onCompletion", new Object[0]);
            VastView.this.g();
        }
    }

    public class i implements MediaPlayer.OnErrorListener {
        public i() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            VastView.this.c(IabError.internal(String.format("MediaPlayer - onError: what - %s, extra - %s", Integer.valueOf(i10), Integer.valueOf(i11))));
            return true;
        }
    }

    public class j implements MediaPlayer.OnPreparedListener {
        public j() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            VastLog.d(VastView.this.f69538a, "MediaPlayer - onPrepared", new Object[0]);
            VastView vastView = VastView.this;
            if (vastView.f69568u.f69592j) {
                return;
            }
            vastView.c(TrackingEvent.creativeView);
            VastView.this.c(TrackingEvent.fullscreen);
            VastView.this.y();
            VastView.this.setLoadingViewVisibility(false);
            VastView.this.J = true;
            if (!VastView.this.f69568u.f69589g) {
                mediaPlayer.start();
                VastView.this.u();
            }
            VastView.this.x();
            int i10 = VastView.this.f69568u.f69586d;
            if (i10 > 0) {
                mediaPlayer.seekTo(i10);
                VastView.this.c(TrackingEvent.resume);
                if (VastView.this.f69570w != null) {
                    VastView.this.f69570w.onVideoResumed();
                }
            }
            VastView vastView2 = VastView.this;
            if (!vastView2.f69568u.f69595m) {
                vastView2.l();
            }
            VastView vastView3 = VastView.this;
            if (vastView3.f69568u.f69593k) {
                return;
            }
            vastView3.h();
            if (VastView.this.f69567t.shouldPreloadCompanion()) {
                VastView.this.a(false);
            }
        }
    }

    public class k implements MediaPlayer.OnVideoSizeChangedListener {
        public k() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
            VastLog.d(VastView.this.f69538a, "onVideoSizeChanged", new Object[0]);
            VastView.this.C = i10;
            VastView.this.D = i11;
            VastView.this.d();
        }
    }

    public class l implements View.OnClickListener {
        public l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (VastView.this.isPlaybackStarted() || VastView.this.f69568u.f69592j) {
                VastView.this.t();
            }
        }
    }

    public class m implements VastHelper.OnScreenStateChangeListener {
        public m() {
        }

        @Override // io.bidmachine.iab.vast.VastHelper.OnScreenStateChangeListener
        public void onScreenStateChange(boolean z10) {
            VastView.this.z();
        }
    }

    public class n implements View.OnTouchListener {
        public n() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0 && action != 1) {
                return false;
            }
            VastView.this.O.add(view);
            if (view.hasFocus()) {
                return false;
            }
            view.requestFocus();
            return false;
        }
    }

    public class o extends WebChromeClient {
        public o() {
        }

        private boolean a(JsResult jsResult) {
            jsResult.cancel();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            VastLog.d("JS alert", str2, new Object[0]);
            return a(jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            VastLog.d("JS confirm", str2, new Object[0]);
            return a(jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            VastLog.d("JS prompt", str2, new Object[0]);
            return a(jsPromptResult);
        }
    }

    public class p extends WebViewClient {
        public p() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            CreativeInfoManager.onResourceLoaded("io.bidmachine", webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            webView.setBackgroundColor(0);
            webView.setLayerType(1, null);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            VastView.this.o();
            return true;
        }

        public boolean safedk_VastView$p_shouldOverrideUrlLoading_0063ab364983e8de6468eabd45a826f2(WebView webView, WebResourceRequest webResourceRequest) {
            if (webResourceRequest.hasGesture()) {
                VastView.this.O.add(webView);
            }
            return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }

        public boolean safedk_VastView$p_shouldOverrideUrlLoading_438a7240a421470649d92e6db98f05cb(WebView webView, String str) {
            if (!VastView.this.O.contains(webView)) {
                return true;
            }
            VastLog.d(VastView.this.f69538a, "banner clicked", new Object[0]);
            VastView vastView = VastView.this;
            vastView.a(vastView.f69563p, str);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders("io.bidmachine", webView, webResourceRequest, super.shouldInterceptRequest(webView, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            return CreativeInfoManager.onWebViewResponse("io.bidmachine", webView, str, super.shouldInterceptRequest(webView, str));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Logger.d("BidMachine|SafeDK: Execution> Lio/bidmachine/iab/vast/activity/VastView$p;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
            boolean zSafedk_VastView$p_shouldOverrideUrlLoading_0063ab364983e8de6468eabd45a826f2 = safedk_VastView$p_shouldOverrideUrlLoading_0063ab364983e8de6468eabd45a826f2(webView, webResourceRequest);
            BrandSafetyUtils.onShouldOverrideUrlLoadingWithHeaders("io.bidmachine", webView, webResourceRequest, zSafedk_VastView$p_shouldOverrideUrlLoading_0063ab364983e8de6468eabd45a826f2);
            return zSafedk_VastView$p_shouldOverrideUrlLoading_0063ab364983e8de6468eabd45a826f2;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("BidMachine|SafeDK: Execution> Lio/bidmachine/iab/vast/activity/VastView$p;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean zSafedk_VastView$p_shouldOverrideUrlLoading_438a7240a421470649d92e6db98f05cb = safedk_VastView$p_shouldOverrideUrlLoading_438a7240a421470649d92e6db98f05cb(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading("io.bidmachine", webView, str, zSafedk_VastView$p_shouldOverrideUrlLoading_438a7240a421470649d92e6db98f05cb);
            return zSafedk_VastView$p_shouldOverrideUrlLoading_438a7240a421470649d92e6db98f05cb;
        }
    }

    public class q implements VastVideoLoadedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f69611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CacheControl f69612b;

        public q(boolean z10, CacheControl cacheControl) {
            this.f69611a = z10;
            this.f69612b = cacheControl;
        }

        @Override // io.bidmachine.iab.vast.VastVideoLoadedListener
        public void onError(VastRequest vastRequest, IabError iabError) {
            VastView vastView = VastView.this;
            vastView.b(vastView.f69569v, vastRequest, IabError.placeholder(String.format("Error loading video after showing with %s - %s", this.f69612b, iabError)));
        }

        @Override // io.bidmachine.iab.vast.VastVideoLoadedListener
        public void onSuccess(VastRequest vastRequest, VastAd vastAd) {
            VastView.this.a(vastRequest, vastAd, this.f69611a);
        }
    }

    public class r implements CloseableLayout.OnCloseClickListener {
        public r() {
        }

        @Override // io.bidmachine.iab.view.CloseableLayout.OnCloseClickListener
        public void onCloseClick() {
            VastView vastView = VastView.this;
            vastView.b(vastView.f69569v, VastView.this.f69567t, IabError.placeholder("Close button clicked"));
        }

        @Override // io.bidmachine.iab.view.CloseableLayout.OnCloseClickListener
        public void onCountDownFinish() {
        }
    }

    public class s implements View.OnClickListener {
        public s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VastView.this.i();
        }
    }

    public class t implements View.OnClickListener {
        public t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VastRequest vastRequest = VastView.this.f69567t;
            if (vastRequest != null && vastRequest.isR1()) {
                VastView vastView = VastView.this;
                if (!vastView.f69568u.f69594l && vastView.i()) {
                    return;
                }
            }
            if (VastView.this.I) {
                VastView.this.e();
            } else {
                VastView.this.handleBackPress();
            }
        }
    }

    public class u implements View.OnClickListener {
        public u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VastView.this.A();
        }
    }

    public class v implements View.OnClickListener {
        public v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VastView.this.q();
        }
    }

    public class w implements View.OnClickListener {
        public w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VastView.this.i();
        }
    }

    public class x extends a0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ WeakReference f69620f;

        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                VastView.this.i();
                VastView.this.e();
            }
        }

        public class b extends AnimatorListenerAdapter {
            public b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                VastView.this.f69542c.setVisibility(8);
            }
        }

        public class c implements View.OnClickListener {
            public c() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                VastView.this.i();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(Context context, Uri uri, String str, WeakReference weakReference) {
            super(context, uri, str);
            this.f69620f = weakReference;
        }

        @Override // io.bidmachine.iab.vast.activity.VastView.a0
        public void a(Bitmap bitmap) {
            View.OnClickListener cVar;
            ImageView imageView = (ImageView) this.f69620f.get();
            if (imageView != null) {
                if (bitmap == null) {
                    cVar = new a();
                } else {
                    imageView.setImageBitmap(bitmap);
                    imageView.setAlpha(0.0f);
                    imageView.animate().alpha(1.0f).setDuration(100L).setListener(new b()).start();
                    cVar = new c();
                }
                imageView.setOnClickListener(cVar);
            }
        }
    }

    public final class y implements MraidInterstitialListener {
        private y() {
        }

        public /* synthetic */ y(VastView vastView, l lVar) {
            this();
        }

        @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
        public void onCalendarEvent(MraidInterstitial mraidInterstitial, String str, IabClickCallback iabClickCallback) {
        }

        @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
        public void onClose(MraidInterstitial mraidInterstitial) {
            VastView.this.f();
        }

        @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
        public void onExpired(MraidInterstitial mraidInterstitial, IabError iabError) {
            VastView.this.a(iabError);
        }

        @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
        public void onLoadFailed(MraidInterstitial mraidInterstitial, IabError iabError) {
            VastView.this.b(iabError);
        }

        @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
        public void onLoaded(MraidInterstitial mraidInterstitial) {
            VastView vastView = VastView.this;
            if (vastView.f69568u.f69592j) {
                vastView.setLoadingViewVisibility(false);
                mraidInterstitial.showInView(VastView.this, false);
            }
        }

        @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
        public void onOpenPrivacySheet(MraidInterstitial mraidInterstitial, PrivacySheetParams privacySheetParams) {
        }

        @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
        public void onOpenUrl(MraidInterstitial mraidInterstitial, String str, IabClickCallback iabClickCallback) {
            iabClickCallback.clickHandled();
            VastView vastView = VastView.this;
            vastView.a(vastView.f69564q, str);
        }

        @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
        public void onPlayVideo(MraidInterstitial mraidInterstitial, String str) {
        }

        @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
        public void onShowFailed(MraidInterstitial mraidInterstitial, IabError iabError) {
            VastView.this.b(iabError);
        }

        @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
        public void onShown(MraidInterstitial mraidInterstitial) {
        }

        @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
        public void onStorePicture(MraidInterstitial mraidInterstitial, String str, IabClickCallback iabClickCallback) {
        }
    }

    public static class z extends View.BaseSavedState {
        public static final Parcelable.Creator<z> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b0 f69626a;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public z createFromParcel(Parcel parcel) {
                return new z(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public z[] newArray(int i10) {
                return new z[i10];
            }
        }

        public z(Parcel parcel) {
            super(parcel);
            this.f69626a = (b0) parcel.readParcelable(b0.class.getClassLoader());
        }

        public z(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f69626a, 0);
        }
    }

    public VastView(@NonNull Context context) {
        this(context, null);
    }

    public VastView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VastView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f69538a = "VastView-" + Integer.toHexString(hashCode());
        this.f69568u = new b0();
        this.A = 0;
        this.B = 0;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = true;
        this.N = false;
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new b();
        this.R = new c();
        this.S = new d();
        this.T = new e();
        this.U = new LinkedList();
        this.V = 0;
        this.W = 0.0f;
        this.f69539a0 = new f();
        g gVar = new g();
        this.f69541b0 = gVar;
        this.f69543c0 = new h();
        this.f69545d0 = new i();
        this.f69547e0 = new j();
        this.f69549f0 = new k();
        this.f69551g0 = new m();
        this.f69553h0 = new n();
        this.f69555i0 = new o();
        this.f69557j0 = new p();
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        setOnClickListener(new l());
        IabVideoTexture iabVideoTexture = new IabVideoTexture(context);
        this.f69540b = iabVideoTexture;
        iabVideoTexture.setSurfaceTextureListener(gVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f69542c = frameLayout;
        frameLayout.addView(this.f69540b, new FrameLayout.LayoutParams(-1, -1, 17));
        addView(this.f69542c, new RelativeLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f69546e = frameLayout2;
        frameLayout2.setBackgroundColor(0);
        addView(this.f69546e, new ViewGroup.LayoutParams(-1, -1));
        CloseableLayout closeableLayout = new CloseableLayout(getContext());
        this.f69548f = closeableLayout;
        closeableLayout.setBackgroundColor(0);
        addView(this.f69548f, new ViewGroup.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        setMute(!this.f69568u.f69588f);
    }

    private View a(Context context, CompanionTag companionTag) {
        boolean zIsTablet = Utils.isTablet(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(Utils.dpToPx(context, companionTag.getWidth() > 0 ? companionTag.getWidth() : zIsTablet ? 728.0f : 320.0f), Utils.dpToPx(context, companionTag.getHeight() > 0 ? companionTag.getHeight() : zIsTablet ? 90.0f : 50.0f));
        WebView webView = new WebView(context);
        webView.setId(Utils.generateViewId());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollContainer(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setScrollBarStyle(33554432);
        webView.setFocusableInTouchMode(false);
        webView.setBackgroundColor(0);
        webView.setOnTouchListener(this.f69553h0);
        webView.setWebViewClient(this.f69557j0);
        webView.setWebChromeClient(this.f69555i0);
        String html = companionTag.getHtml();
        if (html != null) {
            webView.loadDataWithBaseURL("", html, "text/html", G5.N, null);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(Utils.generateViewId());
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.addView(webView, new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    private ImageView a(Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return imageView;
    }

    private IabElementStyle a(VastExtension vastExtension, IabElementStyle iabElementStyle) {
        if (vastExtension == null) {
            return null;
        }
        if (iabElementStyle == null) {
            IabElementStyle iabElementStyle2 = new IabElementStyle();
            iabElementStyle2.setStrokeColor(vastExtension.getAssetsColor());
            iabElementStyle2.setFillColor(vastExtension.getAssetsBackgroundColor());
            return iabElementStyle2;
        }
        if (!iabElementStyle.hasStrokeColor()) {
            iabElementStyle.setStrokeColor(vastExtension.getAssetsColor());
        }
        if (!iabElementStyle.hasFillColor()) {
            iabElementStyle.setFillColor(vastExtension.getAssetsBackgroundColor());
        }
        return iabElementStyle;
    }

    private void a() {
        Iterator it = this.P.iterator();
        while (it.hasNext()) {
            ((IabElementWrapper) it.next()).cancelHide();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IabError iabError) {
        VastLog.e(this.f69538a, "handleCompanionExpired - %s", iabError);
        a(VastSpecError.GENERAL_COMPANION);
        if (this.f69564q != null) {
            k();
            a(true);
        }
    }

    private void a(TrackingEvent trackingEvent) {
        VastLog.d(this.f69538a, "Track Banner Event: %s", trackingEvent);
        CompanionTag companionTag = this.f69563p;
        if (companionTag != null) {
            a(companionTag.getTrackingEventListMap(), trackingEvent);
        }
    }

    private void a(VastExtension vastExtension) {
        if (vastExtension != null && !vastExtension.getCloseStyle().isVisible().booleanValue()) {
            IabCloseWrapper iabCloseWrapper = this.f69550g;
            if (iabCloseWrapper != null) {
                iabCloseWrapper.detach();
                return;
            }
            return;
        }
        if (this.f69550g == null) {
            IabCloseWrapper iabCloseWrapper2 = new IabCloseWrapper(new t());
            this.f69550g = iabCloseWrapper2;
            this.P.add(iabCloseWrapper2);
        }
        this.f69550g.attach(getContext(), this.f69546e, a(vastExtension, vastExtension != null ? vastExtension.getCloseStyle() : null));
    }

    private void a(VastExtension vastExtension, boolean z10) {
        if (z10 || !(vastExtension == null || vastExtension.getCtaStyle().isVisible().booleanValue())) {
            IabCtaWrapper iabCtaWrapper = this.f69560m;
            if (iabCtaWrapper != null) {
                iabCtaWrapper.detach();
                return;
            }
            return;
        }
        if (this.f69560m == null) {
            IabCtaWrapper iabCtaWrapper2 = new IabCtaWrapper(new s());
            this.f69560m = iabCtaWrapper2;
            this.P.add(iabCtaWrapper2);
        }
        this.f69560m.attach(getContext(), this.f69546e, a(vastExtension, vastExtension != null ? vastExtension.getCtaStyle() : null));
    }

    private void a(VastRequest vastRequest, VastAd vastAd, CacheControl cacheControl, boolean z10) {
        vastRequest.setVastVideoLoadedListener(new q(z10, cacheControl));
        f(vastAd.getAppodealExtension());
        setPlaceholderViewVisible(true);
        setLoadingViewVisibility(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(VastRequest vastRequest, VastAd vastAd, boolean z10) {
        AppodealExtensionTag appodealExtension = vastAd.getAppodealExtension();
        this.A = vastRequest.getPreferredVideoOrientation();
        this.f69563p = (appodealExtension == null || !appodealExtension.getCtaStyle().isVisible().booleanValue()) ? null : appodealExtension.getCompanionTag();
        if (this.f69563p == null) {
            this.f69563p = vastAd.getBanner(getContext());
        }
        i(appodealExtension);
        a(appodealExtension, this.f69562o != null);
        a(appodealExtension);
        b(appodealExtension);
        e(appodealExtension);
        h(appodealExtension);
        g(appodealExtension);
        d(appodealExtension);
        c(appodealExtension);
        setLoadingViewVisibility(false);
        VastAdMeasurer vastAdMeasurer = this.f69571x;
        if (vastAdMeasurer != null) {
            vastAdMeasurer.registerAdContainer(this);
            this.f69571x.registerAdView(this.f69540b);
        }
        VastViewListener vastViewListener = this.f69569v;
        if (vastViewListener != null) {
            vastViewListener.onOrientationRequested(this, vastRequest, this.f69568u.f69592j ? this.B : this.A);
        }
        if (!z10) {
            this.f69568u.f69583a = vastRequest.getId();
            b0 b0Var = this.f69568u;
            b0Var.f69595m = this.M;
            b0Var.f69596n = this.N;
            if (appodealExtension != null) {
                b0Var.f69588f = appodealExtension.isMuted();
            }
            this.f69568u.f69584b = vastRequest.getFusedVideoCloseTimeSec();
            VastAdMeasurer vastAdMeasurer2 = this.f69571x;
            if (vastAdMeasurer2 != null) {
                vastAdMeasurer2.onAdViewReady(this.f69540b);
                this.f69571x.onAdShown();
            }
            VastViewListener vastViewListener2 = this.f69569v;
            if (vastViewListener2 != null) {
                vastViewListener2.onShown(this, vastRequest);
            }
        }
        setCloseControlsVisible(a(vastRequest));
        startPlayback("load (restoring: " + z10 + ")");
    }

    private void a(VastSpecError vastSpecError) {
        VastRequest vastRequest = this.f69567t;
        if (vastRequest != null) {
            vastRequest.sendVastSpecError(vastSpecError);
        }
    }

    private void a(VastViewListener vastViewListener, VastRequest vastRequest, IabError iabError) {
        if (vastViewListener == null || vastRequest == null) {
            return;
        }
        vastViewListener.onShowFailed(this, vastRequest, iabError);
    }

    private void a(List list) {
        if (isLoaded()) {
            if (list == null || list.isEmpty()) {
                VastLog.d(this.f69538a, "\turl list is null", new Object[0]);
            } else {
                this.f69567t.fireUrls(list, null);
            }
        }
    }

    private void a(Map map, TrackingEvent trackingEvent) {
        if (map == null || map.isEmpty()) {
            VastLog.d(this.f69538a, "Processing Event - fail: %s (tracking event map is null or empty)", trackingEvent);
        } else {
            a((List) map.get(trackingEvent));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10) {
        IabError iabErrorBadContent;
        if (isLoaded()) {
            l lVar = null;
            if (!z10) {
                CompanionTag companion = this.f69567t.getVastAd().getCompanion(getAvailableWidth(), getAvailableHeight());
                if (this.f69564q != companion) {
                    this.B = (companion == null || !this.f69567t.shouldUseScreenSizeForCompanionOrientation()) ? this.A : Utils.orientationBySize(companion.getWidth(), companion.getHeight());
                    this.f69564q = companion;
                    MraidInterstitial mraidInterstitial = this.f69566s;
                    if (mraidInterstitial != null) {
                        mraidInterstitial.destroy();
                        this.f69566s = null;
                    }
                }
            }
            if (this.f69564q == null) {
                if (this.f69565r == null) {
                    this.f69565r = a(getContext());
                    return;
                }
                return;
            }
            if (this.f69566s == null) {
                p();
                String htmlForMraid = this.f69564q.getHtmlForMraid();
                if (htmlForMraid != null) {
                    AppodealExtensionTag appodealExtension = this.f69567t.getVastAd().getAppodealExtension();
                    PostBannerTag postBannerTag = appodealExtension != null ? appodealExtension.getPostBannerTag() : null;
                    MraidInterstitial.Builder listener = MraidInterstitial.newBuilder().setBaseUrl(null).setCacheControl(CacheControl.FullLoad).setCloseTime(this.f69567t.getCompanionCloseTime()).forceUseNativeCloseButton(this.f69567t.isForceUseNativeCloseTime()).setIsTag(false).setAdMeasurer(this.f69572y).setListener(new y(this, lVar));
                    if (postBannerTag != null) {
                        listener.setCloseStyle(postBannerTag.getCloseStyle());
                        listener.setCountDownStyle(postBannerTag.getCountDownStyle());
                        listener.setLoadingStyle(postBannerTag.getLoadingStyle());
                        listener.setProgressStyle(postBannerTag.getProgressStyle());
                        listener.setDurationSec(postBannerTag.getDurationSec());
                        listener.setProductLink(postBannerTag.getProductLink());
                        if (postBannerTag.isForceUseNativeClose()) {
                            listener.forceUseNativeCloseButton(true);
                        }
                        listener.setR1(postBannerTag.isR1());
                        listener.setR2(postBannerTag.isR2());
                    }
                    try {
                        MraidInterstitial mraidInterstitialBuild = listener.build(getContext());
                        this.f69566s = mraidInterstitialBuild;
                        mraidInterstitialBuild.load(htmlForMraid);
                        return;
                    } catch (Throwable th2) {
                        iabErrorBadContent = IabError.throwable("Exception during companion creation", th2);
                    }
                } else {
                    iabErrorBadContent = IabError.badContent("Companion creative is null");
                }
                b(iabErrorBadContent);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(VastRequest vastRequest) {
        return vastRequest.getVideoType() != VideoType.Rewarded || vastRequest.getMaxDurationMillis() <= 0;
    }

    private boolean a(VastRequest vastRequest, Boolean bool, boolean z10) {
        stopPlayback();
        if (!z10) {
            this.f69568u = new b0();
        }
        if (bool != null) {
            this.f69568u.f69587e = bool.booleanValue();
        }
        this.f69567t = vastRequest;
        if (vastRequest == null) {
            e();
            VastLog.e(this.f69538a, "VastRequest is null. Stop playing...", new Object[0]);
            return false;
        }
        VastAd vastAd = vastRequest.getVastAd();
        if (vastAd == null) {
            e();
            VastLog.e(this.f69538a, "VastAd is null. Stop playing...", new Object[0]);
            return false;
        }
        CacheControl cacheControl = vastRequest.getCacheControl();
        if (cacheControl == CacheControl.PartialLoad && !isVideoFileLoaded()) {
            a(vastRequest, vastAd, cacheControl, z10);
            return true;
        }
        if (cacheControl != CacheControl.Stream || isVideoFileLoaded()) {
            a(vastRequest, vastAd, z10);
            return true;
        }
        a(vastRequest, vastAd, cacheControl, z10);
        vastRequest.performCache(getContext().getApplicationContext(), null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(CompanionTag companionTag, String str) {
        VastRequest vastRequest = this.f69567t;
        ArrayList arrayList = null;
        VastAd vastAd = vastRequest != null ? vastRequest.getVastAd() : null;
        ArrayList<String> wrapperCompanionClickTrackingUrlList = vastAd != null ? vastAd.getWrapperCompanionClickTrackingUrlList() : null;
        List<String> companionClickTrackingList = companionTag != null ? companionTag.getCompanionClickTrackingList() : null;
        if (wrapperCompanionClickTrackingUrlList != null || companionClickTrackingList != null) {
            arrayList = new ArrayList();
            if (companionClickTrackingList != null) {
                arrayList.addAll(companionClickTrackingList);
            }
            if (wrapperCompanionClickTrackingUrlList != null) {
                arrayList.addAll(wrapperCompanionClickTrackingUrlList);
            }
        }
        return a(arrayList, str);
    }

    private boolean a(List list, String str) {
        VastLog.d(this.f69538a, "processClickThroughEvent: %s", str);
        this.f69568u.f69594l = true;
        if (str == null) {
            return false;
        }
        a(list);
        VastAdMeasurer vastAdMeasurer = this.f69571x;
        if (vastAdMeasurer != null) {
            vastAdMeasurer.onAdClicked();
        }
        if (this.f69569v != null && this.f69567t != null) {
            l();
            setLoadingViewVisibility(true);
            this.f69569v.onClick(this, this.f69567t, this, str);
        }
        return true;
    }

    private void b() {
        a0 a0Var = this.f69573z;
        if (a0Var != null) {
            a0Var.a();
            this.f69573z = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(IabError iabError) {
        VastRequest vastRequest;
        VastLog.e(this.f69538a, "handleCompanionShowError - %s", iabError);
        a(VastSpecError.GENERAL_COMPANION);
        a(this.f69569v, this.f69567t, iabError);
        if (this.f69564q != null) {
            k();
            b(true);
            return;
        }
        VastViewListener vastViewListener = this.f69569v;
        if (vastViewListener == null || (vastRequest = this.f69567t) == null) {
            return;
        }
        vastViewListener.onFinish(this, vastRequest, isFinished());
    }

    private void b(TrackingEvent trackingEvent) {
        VastLog.d(this.f69538a, "Track Companion Event: %s", trackingEvent);
        CompanionTag companionTag = this.f69564q;
        if (companionTag != null) {
            a(companionTag.getTrackingEventListMap(), trackingEvent);
        }
    }

    private void b(VastExtension vastExtension) {
        if (vastExtension != null && !vastExtension.getCountDownStyle().isVisible().booleanValue()) {
            IabCountDownWrapper iabCountDownWrapper = this.f69552h;
            if (iabCountDownWrapper != null) {
                iabCountDownWrapper.detach();
                return;
            }
            return;
        }
        if (this.f69552h == null) {
            IabCountDownWrapper iabCountDownWrapper2 = new IabCountDownWrapper(null);
            this.f69552h = iabCountDownWrapper2;
            this.P.add(iabCountDownWrapper2);
        }
        this.f69552h.attach(getContext(), this.f69546e, a(vastExtension, vastExtension != null ? vastExtension.getCountDownStyle() : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(VastViewListener vastViewListener, VastRequest vastRequest, IabError iabError) {
        a(vastViewListener, vastRequest, iabError);
        if (vastViewListener == null || vastRequest == null) {
            return;
        }
        vastViewListener.onFinish(this, vastRequest, false);
    }

    private void b(boolean z10) {
        VastViewListener vastViewListener;
        if (!isLoaded() || this.I) {
            return;
        }
        this.I = true;
        this.f69568u.f69592j = true;
        int i10 = getResources().getConfiguration().orientation;
        int i11 = this.B;
        if (i10 != i11 && (vastViewListener = this.f69569v) != null) {
            vastViewListener.onOrientationRequested(this, this.f69567t, i11);
        }
        IabProgressWrapper iabProgressWrapper = this.f69559l;
        if (iabProgressWrapper != null) {
            iabProgressWrapper.detach();
        }
        IabMuteWrapper iabMuteWrapper = this.f69556j;
        if (iabMuteWrapper != null) {
            iabMuteWrapper.detach();
        }
        IabRepeatWrapper iabRepeatWrapper = this.f69554i;
        if (iabRepeatWrapper != null) {
            iabRepeatWrapper.detach();
        }
        a();
        if (this.f69568u.f69596n) {
            if (this.f69565r == null) {
                this.f69565r = a(getContext());
            }
            this.f69565r.setImageBitmap(this.f69540b.getBitmap());
            addView(this.f69565r, new FrameLayout.LayoutParams(-1, -1));
            this.f69546e.bringToFront();
            return;
        }
        a(z10);
        if (this.f69564q == null) {
            setCloseControlsVisible(true);
            if (this.f69565r != null) {
                this.f69573z = new x(getContext(), this.f69567t.getFileUri(), this.f69567t.getVastAd().getPickedMediaFileTag().getText(), new WeakReference(this.f69565r));
            }
            addView(this.f69565r, new FrameLayout.LayoutParams(-1, -1));
        } else {
            setCloseControlsVisible(false);
            this.f69542c.setVisibility(8);
            o();
            IabCtaWrapper iabCtaWrapper = this.f69560m;
            if (iabCtaWrapper != null) {
                iabCtaWrapper.setVisibility(8);
            }
            MraidInterstitial mraidInterstitial = this.f69566s;
            if (mraidInterstitial == null) {
                setLoadingViewVisibility(false);
                b(IabError.internal("CompanionInterstitial is null"));
            } else if (mraidInterstitial.isReady()) {
                setLoadingViewVisibility(false);
                this.f69566s.showInView(this, false);
            } else {
                setLoadingViewVisibility(true);
            }
        }
        stopPlayback();
        this.f69546e.bringToFront();
        b(TrackingEvent.creativeView);
    }

    private void c() {
        removeCallbacks(this.R);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(IabError iabError) {
        VastLog.e(this.f69538a, "handlePlaybackError - %s", iabError);
        this.K = true;
        a(VastSpecError.SHOWING);
        a(this.f69569v, this.f69567t, iabError);
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(TrackingEvent trackingEvent) {
        VastLog.d(this.f69538a, "Track Event: %s", trackingEvent);
        VastRequest vastRequest = this.f69567t;
        VastAd vastAd = vastRequest != null ? vastRequest.getVastAd() : null;
        if (vastAd != null) {
            a(vastAd.getTrackingEventListMap(), trackingEvent);
        }
    }

    private void c(VastExtension vastExtension) {
        if (vastExtension == null || !vastExtension.isVideoClickable()) {
            return;
        }
        this.P.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        int i10;
        int i11 = this.C;
        if (i11 == 0 || (i10 = this.D) == 0) {
            VastLog.d(this.f69538a, "configureVideoSurface - skip: videoWidth or videoHeight is 0", new Object[0]);
        } else {
            this.f69540b.setVideoSize(i11, i10);
        }
    }

    private void d(VastExtension vastExtension) {
        if (vastExtension == null || vastExtension.getLoadingStyle().isVisible().booleanValue()) {
            if (this.f69558k == null) {
                this.f69558k = new IabLoadingWrapper(null);
            }
            this.f69558k.attach(getContext(), this, a(vastExtension, vastExtension != null ? vastExtension.getLoadingStyle() : null));
        } else {
            IabLoadingWrapper iabLoadingWrapper = this.f69558k;
            if (iabLoadingWrapper != null) {
                iabLoadingWrapper.detach();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        VastRequest vastRequest;
        VastLog.e(this.f69538a, "handleClose", new Object[0]);
        c(TrackingEvent.close);
        VastViewListener vastViewListener = this.f69569v;
        if (vastViewListener == null || (vastRequest = this.f69567t) == null) {
            return;
        }
        vastViewListener.onFinish(this, vastRequest, isFinished());
    }

    private void e(VastExtension vastExtension) {
        if (vastExtension != null && !vastExtension.getMuteStyle().isVisible().booleanValue()) {
            IabMuteWrapper iabMuteWrapper = this.f69556j;
            if (iabMuteWrapper != null) {
                iabMuteWrapper.detach();
                return;
            }
            return;
        }
        if (this.f69556j == null) {
            IabMuteWrapper iabMuteWrapper2 = new IabMuteWrapper(new u());
            this.f69556j = iabMuteWrapper2;
            this.P.add(iabMuteWrapper2);
        }
        this.f69556j.attach(getContext(), this.f69546e, a(vastExtension, vastExtension != null ? vastExtension.getMuteStyle() : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        VastRequest vastRequest;
        VastLog.e(this.f69538a, "handleCompanionClose", new Object[0]);
        b(TrackingEvent.close);
        VastViewListener vastViewListener = this.f69569v;
        if (vastViewListener == null || (vastRequest = this.f69567t) == null) {
            return;
        }
        vastViewListener.onFinish(this, vastRequest, isFinished());
    }

    private void f(VastExtension vastExtension) {
        this.f69548f.setCountDownStyle(a(vastExtension, vastExtension != null ? vastExtension.getCountDownStyle() : null));
        if (isFullscreen()) {
            this.f69548f.setCloseStyle(a(vastExtension, vastExtension != null ? vastExtension.getCloseStyle() : null));
            this.f69548f.setCloseClickListener(new r());
        }
        d(vastExtension);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        VastLog.d(this.f69538a, "handleComplete", new Object[0]);
        b0 b0Var = this.f69568u;
        b0Var.f69591i = true;
        if (!this.K && !b0Var.f69590h) {
            b0Var.f69590h = true;
            VastPlaybackListener vastPlaybackListener = this.f69570w;
            if (vastPlaybackListener != null) {
                vastPlaybackListener.onVideoCompleted();
            }
            VastViewListener vastViewListener = this.f69569v;
            if (vastViewListener != null) {
                vastViewListener.onComplete(this, this.f69567t);
            }
            VastRequest vastRequest = this.f69567t;
            if (vastRequest != null && vastRequest.isR2() && !this.f69568u.f69594l) {
                i();
            }
            c(TrackingEvent.complete);
        }
        if (this.f69568u.f69590h) {
            j();
        }
    }

    private void g(VastExtension vastExtension) {
        if (vastExtension != null && !vastExtension.getProgressStyle().isVisible().booleanValue()) {
            IabProgressWrapper iabProgressWrapper = this.f69559l;
            if (iabProgressWrapper != null) {
                iabProgressWrapper.detach();
                return;
            }
            return;
        }
        if (this.f69559l == null) {
            IabProgressWrapper iabProgressWrapper2 = new IabProgressWrapper(null);
            this.f69559l = iabProgressWrapper2;
            this.P.add(iabProgressWrapper2);
        }
        this.f69559l.attach(getContext(), this.f69546e, a(vastExtension, vastExtension != null ? vastExtension.getProgressStyle() : null));
        this.f69559l.changePercentage(0.0f, 0, 0);
    }

    private int getAvailableHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private int getAvailableWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        VastLog.d(this.f69538a, "handleImpressions", new Object[0]);
        VastRequest vastRequest = this.f69567t;
        if (vastRequest != null) {
            this.f69568u.f69593k = true;
            a(vastRequest.getVastAd().getImpressionUrlList());
        }
    }

    private void h(VastExtension vastExtension) {
        if (vastExtension == null || !vastExtension.getRepeatStyle().isVisible().booleanValue()) {
            IabRepeatWrapper iabRepeatWrapper = this.f69554i;
            if (iabRepeatWrapper != null) {
                iabRepeatWrapper.detach();
                return;
            }
            return;
        }
        if (this.f69554i == null) {
            IabRepeatWrapper iabRepeatWrapper2 = new IabRepeatWrapper(new v());
            this.f69554i = iabRepeatWrapper2;
            this.P.add(iabRepeatWrapper2);
        }
        this.f69554i.attach(getContext(), this.f69546e, a(vastExtension, vastExtension.getRepeatStyle()));
    }

    private void i(VastExtension vastExtension) {
        IabElementStyle iabElementStyleCopyWith;
        IabElementStyle iabElementStyleCopyWith2 = Assets.DEF_VIDEO_STYLE;
        if (vastExtension != null) {
            iabElementStyleCopyWith2 = iabElementStyleCopyWith2.copyWith(vastExtension.getVideoStyle());
        }
        if (vastExtension == null || !vastExtension.isVideoClickable()) {
            this.f69542c.setOnClickListener(null);
            this.f69542c.setClickable(false);
        } else {
            this.f69542c.setOnClickListener(new w());
        }
        this.f69542c.setBackgroundColor(iabElementStyleCopyWith2.getFillColor().intValue());
        o();
        if (this.f69563p == null || this.f69568u.f69592j) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.f69542c.setLayoutParams(layoutParams);
            return;
        }
        this.f69562o = a(getContext(), this.f69563p);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(this.f69562o.getLayoutParams());
        if ("inline".equals(iabElementStyleCopyWith2.getStyle())) {
            iabElementStyleCopyWith = Assets.DEF_INLINE_BANNER_STYLE;
            if (getResources().getConfiguration().orientation == 2) {
                layoutParams2.addRule(15);
                layoutParams3.height = -1;
                layoutParams3.addRule(10);
                layoutParams3.addRule(12);
                if (iabElementStyleCopyWith2.getHorizontalPosition().intValue() == 3) {
                    layoutParams2.addRule(9);
                    layoutParams2.addRule(0, this.f69562o.getId());
                    layoutParams3.addRule(11);
                } else {
                    layoutParams2.addRule(11);
                    layoutParams2.addRule(1, this.f69562o.getId());
                    layoutParams3.addRule(9);
                }
            } else {
                layoutParams2.addRule(14);
                layoutParams3.width = -1;
                layoutParams3.addRule(9);
                layoutParams3.addRule(11);
                if (iabElementStyleCopyWith2.getVerticalPosition().intValue() == 48) {
                    layoutParams2.addRule(10);
                    layoutParams2.addRule(2, this.f69562o.getId());
                    layoutParams3.addRule(12);
                } else {
                    layoutParams2.addRule(12);
                    layoutParams2.addRule(3, this.f69562o.getId());
                    layoutParams3.addRule(10);
                }
            }
        } else {
            IabElementStyle iabElementStyle = Assets.DEF_BANNER_STYLE;
            layoutParams2.addRule(13);
            iabElementStyleCopyWith = iabElementStyle;
        }
        if (vastExtension != null) {
            iabElementStyleCopyWith = iabElementStyleCopyWith.copyWith(vastExtension.getCtaStyle());
        }
        iabElementStyleCopyWith.applyPadding(getContext(), this.f69562o);
        iabElementStyleCopyWith.applyMargin(getContext(), layoutParams3);
        iabElementStyleCopyWith.applyRelativeAlignment(layoutParams3);
        this.f69562o.setBackgroundColor(iabElementStyleCopyWith.getFillColor().intValue());
        iabElementStyleCopyWith2.applyPadding(getContext(), this.f69542c);
        iabElementStyleCopyWith2.applyMargin(getContext(), layoutParams2);
        this.f69542c.setLayoutParams(layoutParams2);
        addView(this.f69562o, layoutParams3);
        a(TrackingEvent.creativeView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i() {
        VastLog.e(this.f69538a, "handleInfoClicked", new Object[0]);
        VastRequest vastRequest = this.f69567t;
        if (vastRequest != null) {
            return a(vastRequest.getVastAd().getClickTrackingUrlList(), this.f69567t.getVastAd().getClickThroughUrl());
        }
        return false;
    }

    private void j() {
        VastLog.d(this.f69538a, "finishVideoPlaying", new Object[0]);
        stopPlayback();
        VastRequest vastRequest = this.f69567t;
        if (vastRequest == null || vastRequest.isAutoClose() || !(this.f69567t.getVastAd().getAppodealExtension() == null || this.f69567t.getVastAd().getAppodealExtension().getPostBannerTag().isVisible())) {
            e();
            return;
        }
        if (isSkipEnabled()) {
            c(TrackingEvent.close);
        }
        setLoadingViewVisibility(false);
        o();
        s();
    }

    private void k() {
        if (this.f69565r != null) {
            p();
        } else {
            MraidInterstitial mraidInterstitial = this.f69566s;
            if (mraidInterstitial != null) {
                mraidInterstitial.destroy();
                this.f69566s = null;
                this.f69564q = null;
            }
        }
        this.I = false;
    }

    public static /* synthetic */ int l(VastView vastView) {
        int i10 = vastView.V;
        vastView.V = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (!isPlaybackStarted() || this.f69568u.f69589g) {
            return;
        }
        VastLog.d(this.f69538a, "pausePlayback", new Object[0]);
        b0 b0Var = this.f69568u;
        b0Var.f69589g = true;
        b0Var.f69586d = this.f69561n.getCurrentPosition();
        this.f69561n.pause();
        c();
        a();
        c(TrackingEvent.pause);
        VastPlaybackListener vastPlaybackListener = this.f69570w;
        if (vastPlaybackListener != null) {
            vastPlaybackListener.onVideoPaused();
        }
    }

    private void m() {
        VastLog.e(this.f69538a, "performVideoCloseClick", new Object[0]);
        stopPlayback();
        if (this.K) {
            e();
            return;
        }
        if (!this.f69568u.f69590h) {
            c(TrackingEvent.skip);
            VastPlaybackListener vastPlaybackListener = this.f69570w;
            if (vastPlaybackListener != null) {
                vastPlaybackListener.onVideoSkipped();
            }
        }
        VastRequest vastRequest = this.f69567t;
        if (vastRequest != null && vastRequest.getVideoType() == VideoType.Rewarded) {
            VastPlaybackListener vastPlaybackListener2 = this.f69570w;
            if (vastPlaybackListener2 != null) {
                vastPlaybackListener2.onVideoCompleted();
            }
            VastViewListener vastViewListener = this.f69569v;
            if (vastViewListener != null) {
                vastViewListener.onComplete(this, this.f69567t);
            }
        }
        j();
    }

    private void n() {
        try {
            if (!isLoaded() || this.f69568u.f69592j) {
                return;
            }
            if (this.f69561n == null) {
                MediaPlayer mediaPlayer = new MediaPlayer();
                this.f69561n = mediaPlayer;
                mediaPlayer.setLooping(false);
                this.f69561n.setAudioStreamType(3);
                this.f69561n.setOnCompletionListener(this.f69543c0);
                this.f69561n.setOnErrorListener(this.f69545d0);
                this.f69561n.setOnPreparedListener(this.f69547e0);
                this.f69561n.setOnVideoSizeChangedListener(this.f69549f0);
            }
            this.f69561n.setSurface(this.f69544d);
            Uri fileUri = isVideoFileLoaded() ? this.f69567t.getFileUri() : null;
            if (fileUri == null) {
                setLoadingViewVisibility(true);
                this.f69561n.setDataSource(this.f69567t.getVastAd().getPickedMediaFileTag().getText());
            } else {
                setLoadingViewVisibility(false);
                this.f69561n.setDataSource(getContext(), fileUri);
            }
            this.f69561n.prepareAsync();
        } catch (Exception e10) {
            VastLog.e(this.f69538a, e10);
            c(IabError.throwable("Exception during preparing MediaPlayer", e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        View view = this.f69562o;
        if (view != null) {
            Utils.removeFromParent(view);
            this.f69562o = null;
        }
    }

    private void p() {
        if (this.f69565r != null) {
            b();
            removeView(this.f69565r);
            this.f69565r = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        if (isLoaded()) {
            b0 b0Var = this.f69568u;
            b0Var.f69592j = false;
            b0Var.f69586d = 0;
            k();
            i(this.f69567t.getVastAd().getAppodealExtension());
            startPlayback("restartPlayback");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        b0 b0Var = this.f69568u;
        if (!b0Var.f69595m) {
            if (isPlaybackStarted()) {
                this.f69561n.start();
                this.f69561n.pause();
                setLoadingViewVisibility(false);
                return;
            } else {
                if (this.f69568u.f69592j) {
                    return;
                }
                startPlayback("resumePlayback (canAutoResume: false)");
                return;
            }
        }
        if (b0Var.f69589g && this.E) {
            VastLog.d(this.f69538a, "resumePlayback", new Object[0]);
            this.f69568u.f69589g = false;
            if (!isPlaybackStarted()) {
                if (this.f69568u.f69592j) {
                    return;
                }
                startPlayback("resumePlayback");
                return;
            }
            this.f69561n.start();
            y();
            u();
            setLoadingViewVisibility(false);
            c(TrackingEvent.resume);
            VastPlaybackListener vastPlaybackListener = this.f69570w;
            if (vastPlaybackListener != null) {
                vastPlaybackListener.onVideoResumed();
            }
        }
    }

    private void s() {
        b(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCloseControlsVisible(boolean z10) {
        this.L = z10;
        w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoadingViewVisibility(boolean z10) {
        IabLoadingWrapper iabLoadingWrapper = this.f69558k;
        if (iabLoadingWrapper == null) {
            return;
        }
        if (!z10) {
            iabLoadingWrapper.setVisibility(8);
        } else {
            iabLoadingWrapper.setVisibility(0);
            this.f69558k.bringToFront();
        }
    }

    private void setMute(boolean z10) {
        this.f69568u.f69588f = z10;
        x();
        c(this.f69568u.f69588f ? TrackingEvent.mute : TrackingEvent.unmute);
    }

    private void setPlaceholderViewVisible(boolean z10) {
        CloseableLayout closeableLayout = this.f69548f;
        VastRequest vastRequest = this.f69567t;
        closeableLayout.setCloseVisibility(z10, vastRequest != null ? vastRequest.getPlaceholderTimeoutSec() : 3.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        Iterator it = this.P.iterator();
        while (it.hasNext()) {
            ((IabElementWrapper) it.next()).toggleShow();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        v();
        c();
        this.R.run();
    }

    private void v() {
        this.U.clear();
        this.V = 0;
        this.W = 0.0f;
    }

    private void w() {
        boolean z10;
        boolean z11 = true;
        if (!this.L) {
            z10 = false;
            z11 = false;
        } else if (isSkipEnabled() || this.I) {
            z10 = false;
        } else {
            z10 = true;
            z11 = false;
        }
        IabCloseWrapper iabCloseWrapper = this.f69550g;
        if (iabCloseWrapper != null) {
            iabCloseWrapper.setVisibility(z11 ? 0 : 8);
        }
        IabCountDownWrapper iabCountDownWrapper = this.f69552h;
        if (iabCountDownWrapper != null) {
            iabCountDownWrapper.setVisibility(z10 ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        IabMuteWrapper iabMuteWrapper;
        float f10;
        VastPlaybackListener vastPlaybackListener;
        if (!isPlaybackStarted() || (iabMuteWrapper = this.f69556j) == null) {
            return;
        }
        iabMuteWrapper.setMuted(this.f69568u.f69588f);
        if (this.f69568u.f69588f) {
            f10 = 0.0f;
            this.f69561n.setVolume(0.0f, 0.0f);
            vastPlaybackListener = this.f69570w;
            if (vastPlaybackListener == null) {
                return;
            }
        } else {
            f10 = 1.0f;
            this.f69561n.setVolume(1.0f, 1.0f);
            vastPlaybackListener = this.f69570w;
            if (vastPlaybackListener == null) {
                return;
            }
        }
        vastPlaybackListener.onVideoVolumeChanged(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        if (isLoaded()) {
            t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        if (!this.E || !VastHelper.isScreenOn(getContext())) {
            l();
            return;
        }
        if (this.F) {
            this.F = false;
            startPlayback("onWindowFocusChanged");
        } else if (this.f69568u.f69592j) {
            setLoadingViewVisibility(false);
        } else {
            r();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        super.addView(view);
        this.f69546e.bringToFront();
    }

    @Override // io.bidmachine.iab.utils.IabClickCallback
    public void clickHandleCanceled() {
        if (isCompanionShown()) {
            setLoadingViewVisibility(false);
        } else {
            r();
        }
    }

    @Override // io.bidmachine.iab.utils.IabClickCallback
    public void clickHandleError() {
        if (isPlaybackStarted()) {
            r();
        } else if (isCompanionShown()) {
            f();
        } else {
            s();
        }
    }

    @Override // io.bidmachine.iab.utils.IabClickCallback
    public void clickHandled() {
        if (isCompanionShown()) {
            setLoadingViewVisibility(false);
        } else if (this.E) {
            r();
        } else {
            l();
        }
    }

    public void destroy() {
        MraidInterstitial mraidInterstitial = this.f69566s;
        if (mraidInterstitial != null) {
            mraidInterstitial.destroy();
            this.f69566s = null;
            this.f69564q = null;
        }
        this.f69569v = null;
        this.f69570w = null;
        this.f69571x = null;
        this.f69572y = null;
        a0 a0Var = this.f69573z;
        if (a0Var != null) {
            a0Var.a();
            this.f69573z = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean display(@Nullable VastRequest vastRequest, @Nullable Boolean bool) {
        return a(vastRequest, bool, false);
    }

    @Nullable
    public VastViewListener getListener() {
        return this.f69569v;
    }

    public void handleBackPress() {
        if (this.f69548f.isVisible() && this.f69548f.canBeClosed()) {
            b(this.f69569v, this.f69567t, IabError.placeholder("OnBackPress event fired"));
            return;
        }
        if (isSkipEnabled()) {
            if (!isCompanionShown()) {
                m();
                return;
            }
            VastRequest vastRequest = this.f69567t;
            if (vastRequest == null || vastRequest.getVideoType() != VideoType.NonRewarded) {
                return;
            }
            if (this.f69564q == null) {
                e();
                return;
            }
            MraidInterstitial mraidInterstitial = this.f69566s;
            if (mraidInterstitial != null) {
                mraidInterstitial.dispatchClose();
            } else {
                f();
            }
        }
    }

    public boolean isCompanionShown() {
        return this.f69568u.f69592j;
    }

    public boolean isFinished() {
        VastRequest vastRequest = this.f69567t;
        return vastRequest != null && ((vastRequest.getCompanionCloseTime() == 0.0f && this.f69568u.f69590h) || (this.f69567t.getCompanionCloseTime() > 0.0f && this.f69568u.f69592j));
    }

    public boolean isFullscreen() {
        return this.f69568u.f69587e;
    }

    public boolean isLoaded() {
        VastRequest vastRequest = this.f69567t;
        return (vastRequest == null || vastRequest.getVastAd() == null) ? false : true;
    }

    public boolean isPlaybackStarted() {
        return this.f69561n != null && this.J;
    }

    public boolean isSkipEnabled() {
        b0 b0Var = this.f69568u;
        return b0Var.f69591i || b0Var.f69584b == 0.0f;
    }

    public boolean isVideoFileLoaded() {
        VastRequest vastRequest = this.f69567t;
        return vastRequest != null && vastRequest.checkFile();
    }

    public void mute() {
        setMute(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.E) {
            startPlayback("onAttachedToWindow");
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (isLoaded()) {
            i(this.f69567t.getVastAd().getAppodealExtension());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopPlayback();
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
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z zVar = (z) parcelable;
        super.onRestoreInstanceState(zVar.getSuperState());
        b0 b0Var = zVar.f69626a;
        if (b0Var != null) {
            this.f69568u = b0Var;
        }
        VastRequest vastRequest = VastRequestManager.get(this.f69568u.f69583a);
        if (vastRequest != null) {
            a(vastRequest, (Boolean) null, true);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        if (isPlaybackStarted()) {
            this.f69568u.f69586d = this.f69561n.getCurrentPosition();
        }
        z zVar = new z(super.onSaveInstanceState());
        zVar.f69626a = this.f69568u;
        return zVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        removeCallbacks(this.Q);
        post(this.Q);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        VastLog.d(this.f69538a, "onWindowFocusChanged: %s", Boolean.valueOf(z10));
        this.E = z10;
        z();
    }

    public void pause() {
        setCanAutoResume(false);
        l();
    }

    public void resume() {
        setCanAutoResume(true);
        r();
    }

    public void setAdMeasurer(@Nullable VastAdMeasurer vastAdMeasurer) {
        this.f69571x = vastAdMeasurer;
    }

    public void setCanAutoResume(boolean z10) {
        this.M = z10;
        this.f69568u.f69595m = z10;
    }

    public void setCanIgnorePostBanner(boolean z10) {
        this.N = z10;
        this.f69568u.f69596n = z10;
    }

    public void setListener(@Nullable VastViewListener vastViewListener) {
        this.f69569v = vastViewListener;
    }

    public void setPlaybackListener(@Nullable VastPlaybackListener vastPlaybackListener) {
        this.f69570w = vastPlaybackListener;
    }

    public void setPostBannerAdMeasurer(@Nullable MraidAdMeasurer mraidAdMeasurer) {
        this.f69572y = mraidAdMeasurer != null ? new PostBannerAdMeasurer(this, mraidAdMeasurer) : null;
    }

    public void startPlayback(String str) {
        VastLog.d(this.f69538a, "startPlayback: %s", str);
        if (isLoaded()) {
            setPlaceholderViewVisible(false);
            if (this.f69568u.f69592j) {
                s();
                return;
            }
            if (!this.E) {
                this.F = true;
                return;
            }
            if (this.G) {
                stopPlayback();
                k();
                d();
                n();
                VastHelper.addScreenStateChangeListener(this, this.f69551g0);
            } else {
                this.H = true;
            }
            if (this.f69542c.getVisibility() != 0) {
                this.f69542c.setVisibility(0);
            }
        }
    }

    public void stopPlayback() {
        this.f69568u.f69589g = false;
        if (this.f69561n != null) {
            VastLog.d(this.f69538a, "stopPlayback", new Object[0]);
            try {
                if (this.f69561n.isPlaying()) {
                    this.f69561n.stop();
                }
                this.f69561n.setSurface(null);
                this.f69561n.release();
            } catch (Exception e10) {
                VastLog.e(this.f69538a, e10);
            }
            this.f69561n = null;
            this.J = false;
            this.K = false;
            c();
            VastHelper.removeScreenStateChangeListener(this);
        }
    }

    public void unmute() {
        setMute(false);
    }
}
