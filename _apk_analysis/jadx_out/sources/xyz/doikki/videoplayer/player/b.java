package xyz.doikki.videoplayer.player;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.Map;

/* JADX INFO: compiled from: AndroidMediaPlayer.java */
/* JADX INFO: loaded from: classes10.dex */
public class b extends xyz.doikki.videoplayer.player.a implements MediaPlayer.OnErrorListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnInfoListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediaPlayer f87186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f87187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f87188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f87189e;

    /* JADX INFO: compiled from: AndroidMediaPlayer.java */
    public class a extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MediaPlayer f87190b;

        public a(MediaPlayer mediaPlayer) {
            this.f87190b = mediaPlayer;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f87190b.release();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public b(Context context) {
        this.f87188d = context.getApplicationContext();
    }

    @Override // xyz.doikki.videoplayer.player.a
    public int getBufferedPercentage() {
        return this.f87187c;
    }

    @Override // xyz.doikki.videoplayer.player.a
    public long getCurrentPosition() {
        return this.f87186b.getCurrentPosition();
    }

    @Override // xyz.doikki.videoplayer.player.a
    public long getDuration() {
        return this.f87186b.getDuration();
    }

    @Override // xyz.doikki.videoplayer.player.a
    public float getSpeed() {
        try {
            float speed = this.f87186b.getPlaybackParams().getSpeed();
            if (speed == 0.0f) {
                return 1.0f;
            }
            return speed;
        } catch (Exception unused) {
            return 1.0f;
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public long getTcpSpeed() {
        return 0L;
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void initPlayer() {
        this.f87186b = new MediaPlayer();
        setOptions();
        this.f87186b.setAudioStreamType(3);
        this.f87186b.setOnErrorListener(this);
        this.f87186b.setOnCompletionListener(this);
        this.f87186b.setOnInfoListener(this);
        this.f87186b.setOnBufferingUpdateListener(this);
        this.f87186b.setOnPreparedListener(this);
        this.f87186b.setOnVideoSizeChangedListener(this);
    }

    @Override // xyz.doikki.videoplayer.player.a
    public boolean isPlaying() {
        return this.f87186b.isPlaying();
    }

    public final boolean isVideo() {
        try {
            for (MediaPlayer.TrackInfo trackInfo : this.f87186b.getTrackInfo()) {
                if (trackInfo.getTrackType() == 1) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
        this.f87187c = i10;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        this.mPlayerEventListener.onCompletion();
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        this.mPlayerEventListener.onError();
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
        if (i10 != 3) {
            this.mPlayerEventListener.onInfo(i10, i11);
            return true;
        }
        if (!this.f87189e) {
            return true;
        }
        this.mPlayerEventListener.onInfo(i10, i11);
        this.f87189e = false;
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        this.mPlayerEventListener.onPrepared();
        start();
        if (isVideo()) {
            return;
        }
        this.mPlayerEventListener.onInfo(3, 0);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        int videoWidth = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        if (videoWidth == 0 || videoHeight == 0) {
            return;
        }
        this.mPlayerEventListener.onVideoSizeChanged(videoWidth, videoHeight);
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void pause() {
        try {
            this.f87186b.pause();
        } catch (IllegalStateException unused) {
            this.mPlayerEventListener.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void prepareAsync() {
        try {
            this.f87189e = true;
            this.f87186b.prepareAsync();
        } catch (IllegalStateException unused) {
            this.mPlayerEventListener.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void release() {
        this.f87186b.setOnErrorListener(null);
        this.f87186b.setOnCompletionListener(null);
        this.f87186b.setOnInfoListener(null);
        this.f87186b.setOnBufferingUpdateListener(null);
        this.f87186b.setOnPreparedListener(null);
        this.f87186b.setOnVideoSizeChangedListener(null);
        stop();
        MediaPlayer mediaPlayer = this.f87186b;
        this.f87186b = null;
        new a(mediaPlayer).start();
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void reset() {
        stop();
        this.f87186b.reset();
        this.f87186b.setSurface(null);
        this.f87186b.setDisplay(null);
        this.f87186b.setVolume(1.0f, 1.0f);
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void seekTo(long j10) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f87186b.seekTo(j10, 3);
            } else {
                this.f87186b.seekTo((int) j10);
            }
        } catch (IllegalStateException unused) {
            this.mPlayerEventListener.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setDataSource(AssetFileDescriptor assetFileDescriptor) {
        try {
            this.f87186b.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        } catch (Exception unused) {
            this.mPlayerEventListener.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setDataSource(String str, Map<String, String> map) {
        try {
            this.f87186b.setDataSource(this.f87188d, Uri.parse(str), map);
        } catch (Exception unused) {
            this.mPlayerEventListener.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setDisplay(SurfaceHolder surfaceHolder) {
        try {
            this.f87186b.setDisplay(surfaceHolder);
        } catch (Exception unused) {
            this.mPlayerEventListener.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setLooping(boolean z10) {
        this.f87186b.setLooping(z10);
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setOptions() {
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setSpeed(float f10) {
        try {
            MediaPlayer mediaPlayer = this.f87186b;
            mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(f10));
        } catch (Exception unused) {
            this.mPlayerEventListener.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setSurface(Surface surface) {
        try {
            this.f87186b.setSurface(surface);
        } catch (Exception unused) {
            this.mPlayerEventListener.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setVolume(float f10, float f11) {
        this.f87186b.setVolume(f10, f11);
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void start() {
        try {
            this.f87186b.start();
        } catch (IllegalStateException unused) {
            this.mPlayerEventListener.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void stop() {
        try {
            this.f87186b.stop();
        } catch (IllegalStateException unused) {
            this.mPlayerEventListener.onError();
        }
    }
}
