package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.VideoView;
import androidx.appcompat.widget.ActivityChooserModel;
import com.inmobi.media.C3459hc;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.InMobiVideoBridge;
import com.safedk.android.utils.Logger;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import me.goldze.mvvmhabit.base.ContainerActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.inmobi.media.hc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3459hc extends VideoView implements MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3580m9 f27288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3408fc f27289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f27290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC3434gc f27291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f27292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WeakReference f27293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f27294g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f27295h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f27296i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f27297j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f27298k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3459hc(Activity activity, InterfaceC3580m9 interfaceC3580m9) {
        super(activity);
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f27288a = interfaceC3580m9;
        setZOrderOnTop(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT < 28) {
            setDrawingCacheEnabled(true);
        }
        this.f27294g = 100;
        this.f27297j = -1;
        this.f27298k = 0;
        this.f27293f = new WeakReference(activity);
        Context context = Ji.f25747a;
        tn.p.k(this, "lifecycleCallbacks");
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        activity.getApplication().registerActivityLifecycleCallbacks(this);
    }

    public static final void a(C3459hc c3459hc, MediaPlayer mediaPlayer, int i10, int i11) {
        InterfaceC3580m9 interfaceC3580m9 = c3459hc.f27288a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("MediaRenderView", ">>> onVideoSizeChanged");
        }
        if (c3459hc.f27289b == null) {
            C3408fc c3408fc = new C3408fc(c3459hc.getContext());
            c3459hc.f27289b = c3408fc;
            c3408fc.setAnchorView(c3459hc);
            c3459hc.setMediaController(c3459hc.f27289b);
            c3459hc.requestLayout();
            c3459hc.requestFocus();
        }
    }

    private void safedk_videoview_hc_VideoViewPlay_1cd25093e0b187dede2869d94281a264() {
        Logger.d("InMobiVideo|SafeDK: Partial-Video> Lcom/inmobi/media/hc;->safedk_videoview_hc_VideoViewPlay_1cd25093e0b187dede2869d94281a264()V");
        if (SafeDK.aa()) {
            try {
                Logger.d("VideoBridge", "VideoViewPlay: player " + this + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                CreativeInfoManager.a(com.safedk.android.utils.g.f53135i, (Object) this);
                CreativeInfoManager.a(com.safedk.android.utils.g.f53135i, BrandSafetyUtils.a(this), false);
            } catch (Exception e10) {
                Logger.d("VideoBridge", "exception in VideoViewPlay: " + e10.getMessage());
            }
        }
        super.start();
    }

    public final void a() {
        InMobiVideoBridge.VideoViewSetVideoPath(this, this.f27296i);
        setOnCompletionListener(this);
        setOnPreparedListener(this);
        setOnErrorListener(this);
        if (this.f27289b == null) {
            C3408fc c3408fc = new C3408fc(getContext());
            this.f27289b = c3408fc;
            c3408fc.setAnchorView(this);
            setMediaController(this.f27289b);
        }
    }

    public final void b() {
        InterfaceC3580m9 interfaceC3580m9 = this.f27288a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("MediaRenderView", "Release the media render view");
        }
        InMobiVideoBridge.VideoViewStop(this);
        ViewGroup viewGroup = this.f27290c;
        if (viewGroup != null) {
            ViewParent parent = viewGroup.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.f27290c);
            }
            ViewParent parent2 = getParent();
            ViewGroup viewGroup3 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup3 != null) {
                viewGroup3.removeView(this);
            }
            setBackgroundColor(0);
            this.f27290c = null;
        }
        setMediaController(null);
        this.f27289b = null;
        InterfaceC3434gc interfaceC3434gc = this.f27291d;
        if (interfaceC3434gc != null) {
            tn.p.k(this, CampaignEx.JSON_KEY_AD_MP);
            InterfaceC3580m9 interfaceC3580m92 = ((C3807vc) interfaceC3434gc).f28360a.f28430b;
            if (interfaceC3580m92 != null) {
                ((C3605n9) interfaceC3580m92).a("MraidMediaProcessor", ">>> onPlayerCompleted");
            }
            ViewGroup viewContainer = getViewContainer();
            if (viewContainer != null) {
                ViewParent parent3 = viewContainer.getParent();
                ViewGroup viewGroup4 = parent3 instanceof ViewGroup ? (ViewGroup) parent3 : null;
                if (viewGroup4 != null) {
                    viewGroup4.removeView(viewContainer);
                }
            }
            setViewContainer(null);
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53135i, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public final int getCurrentAudioVolume() {
        return this.f27294g;
    }

    @Override // android.view.View
    @Nullable
    public final String getId() {
        return this.f27295h;
    }

    @Nullable
    public final InterfaceC3434gc getListener() {
        return this.f27291d;
    }

    public final int getMCurrentPosition() {
        return this.f27298k;
    }

    @Nullable
    public final String getPlaybackUrl() {
        return this.f27296i;
    }

    public final int getPreviousPosition() {
        return this.f27297j;
    }

    @Nullable
    public final ViewGroup getViewContainer() {
        return this.f27290c;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        tn.p.k(bundle, ContainerActivity.BUNDLE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        if (this.f27293f.get() == null || !tn.p.f(this.f27293f.get(), activity)) {
            return;
        }
        this.f27292e = false;
        start();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        Activity activity2 = (Activity) this.f27293f.get();
        if (activity2 == null || !tn.p.f(activity2, activity)) {
            return;
        }
        this.f27292e = true;
        if (getCurrentPosition() != 0) {
            this.f27298k = getCurrentPosition();
        }
        pause();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/hc;->onCompletion(Landroid/media/MediaPlayer;)V");
        CreativeInfoManager.onVideoCompleted(com.safedk.android.utils.g.f53135i, mediaPlayer);
        safedk_hc_onCompletion_b235d2fdaf12e000adbe1c2190f1d0c6(mediaPlayer);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        tn.p.k(mediaPlayer, CampaignEx.JSON_KEY_AD_MP);
        InterfaceC3580m9 interfaceC3580m9 = this.f27288a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).b("MediaRenderView", ">>> onError (" + i10 + ", " + i11 + ")");
        }
        b();
        return false;
    }

    @Override // android.widget.VideoView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        getHolder().setSizeFromLayout();
    }

    @Override // android.widget.VideoView, android.view.SurfaceView, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        tn.p.k(mediaPlayer, CampaignEx.JSON_KEY_AD_MP);
        InterfaceC3580m9 interfaceC3580m9 = this.f27288a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("MediaRenderView", ">>> onPrepared");
        }
        mediaPlayer.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: n9.w7
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer2, int i10, int i11) {
                C3459hc.a(this.f75674b, mediaPlayer2, i10, i11);
            }
        });
        int i10 = this.f27298k;
        if (i10 < getDuration()) {
            this.f27298k = i10;
            seekTo(i10);
        }
        InterfaceC3434gc interfaceC3434gc = this.f27291d;
        if (interfaceC3434gc != null) {
            tn.p.k(this, CampaignEx.JSON_KEY_AD_MP);
            InterfaceC3580m9 interfaceC3580m92 = ((C3807vc) interfaceC3434gc).f28360a.f28430b;
            if (interfaceC3580m92 != null) {
                ((C3605n9) interfaceC3580m92).a("MraidMediaProcessor", ">>> onPlayerPrepared");
            }
        }
        start();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        Context context;
        tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        super.onVisibilityChanged(view, i10);
        InterfaceC3580m9 interfaceC3580m9 = this.f27288a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("MediaRenderView", ">>> onVisibilityChanged (" + i10 + ")");
        }
        if (i10 != 0 || (context = Ji.f25747a) == null) {
            return;
        }
        setBackground(new BitmapDrawable(context.getResources(), (Bitmap) null));
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        InterfaceC3580m9 interfaceC3580m9 = this.f27288a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("MediaRenderView", ">>> onWindowVisibilityChanged (" + i10 + ")");
        }
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        InterfaceC3580m9 interfaceC3580m9 = this.f27288a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("MediaRenderView", "Pause media playback");
        }
        super.pause();
    }

    public void safedk_hc_onCompletion_b235d2fdaf12e000adbe1c2190f1d0c6(MediaPlayer mediaPlayer) {
        tn.p.k(mediaPlayer, CampaignEx.JSON_KEY_AD_MP);
        InterfaceC3580m9 interfaceC3580m9 = this.f27288a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("MediaRenderView", ">>> onCompletion");
        }
    }

    public final void setAudioMuted(boolean z10) {
    }

    public final void setCurrentAudioVolume(int i10) {
        this.f27294g = i10;
    }

    public final void setId(@Nullable String str) {
        this.f27295h = str;
    }

    public final void setListener(@Nullable InterfaceC3434gc interfaceC3434gc) {
        this.f27291d = interfaceC3434gc;
    }

    public final void setMCurrentPosition(int i10) {
        this.f27298k = i10;
    }

    public final void setPlaybackData(@NotNull String str) {
        String str2;
        tn.p.k(str, "url");
        byte[] bytes = str.getBytes(bo.c.f5639b);
        tn.p.j(bytes, "getBytes(...)");
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bytes) {
            if (((byte) (b10 & (-128))) > 0) {
                sb2.append("%");
                char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
                sb2.append(new String(new char[]{cArr[(b10 >> 4) & 15], cArr[(byte) (b10 & 15)]}));
            } else {
                sb2.append((char) b10);
            }
        }
        try {
            String string = sb2.toString();
            tn.p.j(string, "toString(...)");
            byte[] bytes2 = string.getBytes(bo.c.f5639b);
            tn.p.j(bytes2, "getBytes(...)");
            str2 = new String(bytes2, bo.c.f5644g);
        } catch (UnsupportedEncodingException unused) {
            str2 = "";
        }
        this.f27296i = str2;
        this.f27295h = "anonymous";
    }

    public final void setPlaybackUrl(@Nullable String str) {
        this.f27296i = str;
    }

    public final void setPlayerPrepared(boolean z10) {
    }

    public final void setPreviousPosition(int i10) {
        this.f27297j = i10;
    }

    public final void setViewContainer(@Nullable ViewGroup viewGroup) {
        this.f27290c = viewGroup;
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public final void start() {
        if (this.f27292e) {
            return;
        }
        InterfaceC3580m9 interfaceC3580m9 = this.f27288a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("MediaRenderView", "Start media playback");
        }
        safedk_videoview_hc_VideoViewPlay_1cd25093e0b187dede2869d94281a264();
    }
}
