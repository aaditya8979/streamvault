package eh;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.util.Log;
import com.yzq.zxinglibrary.R$raw;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: compiled from: BeepManager.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, Closeable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f61138f = a.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f61139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MediaPlayer f61140c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f61141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f61142e;

    public a(Activity activity) {
        this.f61139b = activity;
        h();
    }

    public final MediaPlayer a(Context context) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(3);
        mediaPlayer.setOnCompletionListener(this);
        mediaPlayer.setOnErrorListener(this);
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = context.getResources().openRawResourceFd(R$raw.beep);
            try {
                mediaPlayer.setDataSource(assetFileDescriptorOpenRawResourceFd.getFileDescriptor(), assetFileDescriptorOpenRawResourceFd.getStartOffset(), assetFileDescriptorOpenRawResourceFd.getLength());
                assetFileDescriptorOpenRawResourceFd.close();
                mediaPlayer.setVolume(0.1f, 0.1f);
                mediaPlayer.prepare();
                return mediaPlayer;
            } catch (Throwable th2) {
                assetFileDescriptorOpenRawResourceFd.close();
                throw th2;
            }
        } catch (IOException e10) {
            Log.w(f61138f, e10);
            mediaPlayer.release();
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        MediaPlayer mediaPlayer = this.f61140c;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f61140c = null;
        }
    }

    @SuppressLint({"MissingPermission"})
    public synchronized void d() {
        MediaPlayer mediaPlayer;
        if (this.f61141d && (mediaPlayer = this.f61140c) != null) {
            mediaPlayer.start();
        }
        if (this.f61142e) {
            ((Vibrator) this.f61139b.getSystemService("vibrator")).vibrate(200L);
        }
    }

    public void e(boolean z10) {
        this.f61141d = z10;
    }

    public void f(boolean z10) {
        this.f61142e = z10;
    }

    public synchronized void h() {
        if (this.f61141d && this.f61140c == null) {
            this.f61139b.setVolumeControlStream(3);
            this.f61140c = a(this.f61139b);
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        mediaPlayer.seekTo(0);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public synchronized boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        if (i10 == 100) {
            this.f61139b.finish();
        } else {
            mediaPlayer.release();
            this.f61140c = null;
            h();
        }
        return true;
    }
}
