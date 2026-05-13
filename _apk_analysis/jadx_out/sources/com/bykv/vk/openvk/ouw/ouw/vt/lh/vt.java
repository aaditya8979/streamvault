package com.bykv.vk.openvk.ouw.ouw.vt.lh;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.annotation.RequiresApi;
import com.bykv.vk.openvk.ouw.ouw.vt.lh.lh;
import com.ironsource.C3978d4;
import java.io.FileDescriptor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes8.dex */
public final class vt extends com.bykv.vk.openvk.ouw.ouw.vt.lh.ouw {
    private com.bykv.vk.openvk.ouw.ouw.vt.ouw.ouw bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private final Object f11293cf;
    private final ouw pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final MediaPlayer f11294ra;
    private volatile boolean ryl;
    private Surface tlj;

    public static class ouw implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {
        private final WeakReference<vt> ouw;

        public ouw(vt vtVar) {
            this.ouw = new WeakReference<>(vtVar);
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
            vt vtVar;
            try {
                vtVar = this.ouw.get();
            } catch (Throwable th2) {
                com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.lh("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onBufferingUpdate error: ", th2);
            }
            if (vtVar != null) {
                try {
                    lh.ouw ouwVar = vtVar.f11291lh;
                    if (ouwVar != null) {
                        ouwVar.ouw(vtVar, i10);
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.lh("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnBufferingUpdate error: ", th3);
                    return;
                }
                com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.lh("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onBufferingUpdate error: ", th2);
            }
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public final void onCompletion(MediaPlayer mediaPlayer) {
            vt vtVar;
            try {
                vtVar = this.ouw.get();
            } catch (Throwable th2) {
                com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.lh("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onCompletion error: ", th2);
            }
            if (vtVar != null) {
                try {
                    lh.vt vtVar2 = vtVar.vt;
                    if (vtVar2 != null) {
                        vtVar2.bly();
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.lh("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnCompletion error: ", th3);
                    return;
                }
                com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.lh("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onCompletion error: ", th2);
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            try {
                com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("CSJ_VIDEO", "onError: ", Integer.valueOf(i10), Integer.valueOf(i11));
                vt vtVar = this.ouw.get();
                if (vtVar != null) {
                    if (vtVar.ouw(i10, i11)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.lh("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onError error: ", th2);
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public final boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
            try {
                com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("CSJ_VIDEO", "onInfo: ");
                vt vtVar = this.ouw.get();
                if (vtVar != null) {
                    vtVar.vt(i10, i11);
                }
                return false;
            } catch (Throwable th2) {
                com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.lh("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onInfo error: ", th2);
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public final void onPrepared(MediaPlayer mediaPlayer) {
            vt vtVar;
            try {
                vtVar = this.ouw.get();
            } catch (Throwable th2) {
                com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.lh("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onPrepared error: ", th2);
            }
            if (vtVar != null) {
                try {
                    lh.fkw fkwVar = vtVar.ouw;
                    if (fkwVar != null) {
                        fkwVar.tlj();
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.lh("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnPrepared error: ", th3);
                    return;
                }
                com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.lh("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onPrepared error: ", th2);
            }
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public final void onSeekComplete(MediaPlayer mediaPlayer) {
            vt vtVar;
            try {
                vtVar = this.ouw.get();
            } catch (Throwable th2) {
                com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.lh("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onSeekComplete error: ", th2);
            }
            if (vtVar != null) {
                try {
                    lh.le leVar = vtVar.yu;
                    if (leVar != null) {
                        leVar.cf();
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.lh("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnSeekComplete error: ", th3);
                    return;
                }
                com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.lh("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onSeekComplete error: ", th2);
            }
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
            vt vtVar;
            try {
                vtVar = this.ouw.get();
            } catch (Throwable th2) {
                com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.lh("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onVideoSizeChanged error: ", th2);
            }
            if (vtVar != null) {
                try {
                    lh.ra raVar = vtVar.fkw;
                    if (raVar != null) {
                        raVar.vt(i10, i11);
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.lh("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnVideoSizeChanged error: ", th3);
                    return;
                }
                com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.lh("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onVideoSizeChanged error: ", th2);
            }
        }
    }

    public vt() {
        MediaPlayer mediaPlayer;
        Object obj = new Object();
        this.f11293cf = obj;
        synchronized (obj) {
            mediaPlayer = new MediaPlayer();
            this.f11294ra = mediaPlayer;
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                Class<?> cls = Class.forName("android.media.MediaTimeProvider");
                Class<?> cls2 = Class.forName("android.media.SubtitleController");
                Class<?> cls3 = Class.forName("android.media.SubtitleController$Anchor");
                Object objNewInstance = cls2.getConstructor(Context.class, cls, Class.forName("android.media.SubtitleController$Listener")).newInstance(com.bykv.vk.openvk.ouw.ouw.ouw.lh.ouw(), null, null);
                Field declaredField = cls2.getDeclaredField("mHandler");
                declaredField.setAccessible(true);
                try {
                    declaredField.set(objNewInstance, new Handler());
                    declaredField.setAccessible(false);
                    mediaPlayer.getClass().getMethod("setSubtitleAnchor", cls2, cls3).invoke(mediaPlayer, objNewInstance, null);
                } catch (Throwable th2) {
                    try {
                        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.lh("CSJ_VIDEO", "subtitleInstance error: ", th2);
                        declaredField.setAccessible(false);
                    } catch (Throwable th3) {
                        declaredField.setAccessible(false);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.lh("CSJ_VIDEO", "setSubtitleController error: ", th4);
            }
        }
        try {
            this.f11294ra.setAudioStreamType(3);
        } catch (Throwable th5) {
            com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.lh("CSJ_VIDEO", "setAudioStreamType error: ", th5);
        }
        this.pno = new ouw(this);
        rn();
    }

    private void ko() {
        com.bykv.vk.openvk.ouw.ouw.vt.ouw.ouw ouwVar = this.bly;
        if (ouwVar != null) {
            try {
                ouwVar.close();
            } catch (Throwable th2) {
                com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.lh("CSJ_VIDEO", "releaseMediaDataSource error: ", th2);
            }
            this.bly = null;
        }
    }

    private void rn() {
        this.f11294ra.setOnPreparedListener(this.pno);
        this.f11294ra.setOnBufferingUpdateListener(this.pno);
        this.f11294ra.setOnCompletionListener(this.pno);
        this.f11294ra.setOnSeekCompleteListener(this.pno);
        this.f11294ra.setOnVideoSizeChangedListener(this.pno);
        this.f11294ra.setOnErrorListener(this.pno);
        this.f11294ra.setOnInfoListener(this.pno);
    }

    private void zih() {
        try {
            Surface surface = this.tlj;
            if (surface != null) {
                surface.release();
                this.tlj = null;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    public final long bly() {
        try {
            return this.f11294ra.getDuration();
        } catch (Throwable th2) {
            com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.lh("CSJ_VIDEO", "getDuration error: ", th2);
            return 0L;
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    public final void cf() throws Throwable {
        try {
            this.f11294ra.reset();
        } catch (Throwable th2) {
            com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.lh("CSJ_VIDEO", "reset error: ", th2);
        }
        ko();
        ouw();
        rn();
    }

    public final void finalize() throws Throwable {
        super.finalize();
        zih();
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    public final void fkw() throws Throwable {
        this.f11294ra.pause();
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    public final int jg() {
        MediaPlayer mediaPlayer = this.f11294ra;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    public final void le() {
        MediaPlayer mediaPlayer = this.f11294ra;
        if (mediaPlayer != null) {
            mediaPlayer.prepareAsync();
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    public final void lh() throws Throwable {
        this.f11294ra.start();
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    public final int mwh() {
        MediaPlayer mediaPlayer = this.f11294ra;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    public final void ouw(long j10, int i10) throws Throwable {
        if (Build.VERSION.SDK_INT < 26) {
            this.f11294ra.seekTo((int) j10);
            return;
        }
        if (i10 == 0) {
            this.f11294ra.seekTo((int) j10, 0);
            return;
        }
        if (i10 == 1) {
            this.f11294ra.seekTo((int) j10, 1);
            return;
        }
        if (i10 == 2) {
            this.f11294ra.seekTo((int) j10, 2);
        } else if (i10 != 3) {
            this.f11294ra.seekTo((int) j10);
        } else {
            this.f11294ra.seekTo((int) j10, 3);
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    @TargetApi(14)
    public final void ouw(Surface surface) {
        zih();
        this.tlj = surface;
        this.f11294ra.setSurface(surface);
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    public final void ouw(SurfaceHolder surfaceHolder) throws Throwable {
        synchronized (this.f11293cf) {
            try {
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            if (!this.ryl && surfaceHolder != null && surfaceHolder.getSurface() != null && this.f11290le) {
                this.f11294ra.setDisplay(surfaceHolder);
            }
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    @RequiresApi(api = 23)
    public final synchronized void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar) {
        this.bly = com.bykv.vk.openvk.ouw.ouw.vt.ouw.ouw.ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.ouw(), lhVar);
        com.bykv.vk.openvk.ouw.ouw.vt.ouw.vt.lh.ouw(lhVar);
        this.f11294ra.setDataSource(this.bly);
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    @RequiresApi(api = 23)
    public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.vt vtVar) throws Throwable {
        this.f11294ra.setPlaybackParams(this.f11294ra.getPlaybackParams().setSpeed(vtVar.ouw));
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    public final void ouw(FileDescriptor fileDescriptor) throws Throwable {
        this.f11294ra.setDataSource(fileDescriptor);
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    public final void ouw(String str) throws Throwable {
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.equalsIgnoreCase(C3978d4.i.f31327b)) {
            this.f11294ra.setDataSource(str);
        } else {
            this.f11294ra.setDataSource(uri.getPath());
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    public final long pno() {
        try {
            return this.f11294ra.getCurrentPosition();
        } catch (Throwable th2) {
            com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.lh("CSJ_VIDEO", "getCurrentPosition error: ", th2);
            return 0L;
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    public final void ra() throws Throwable {
        this.f11294ra.setScreenOnWhilePlaying(true);
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    public final void ryl() throws Throwable {
        this.f11294ra.setLooping(false);
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    public final void tlj() throws Throwable {
        synchronized (this.f11293cf) {
            if (!this.ryl) {
                this.f11294ra.release();
                this.ryl = true;
                zih();
                ko();
                ouw();
                rn();
            }
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    public final PlaybackParams vt() throws IllegalStateException {
        return this.f11294ra.getPlaybackParams();
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    public final void vt(boolean z10) throws Throwable {
        MediaPlayer mediaPlayer = this.f11294ra;
        if (mediaPlayer == null) {
            return;
        }
        if (z10) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } else {
            mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh
    public final void yu() throws Throwable {
        this.f11294ra.stop();
    }
}
