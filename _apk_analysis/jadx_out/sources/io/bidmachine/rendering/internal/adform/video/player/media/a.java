package io.bidmachine.rendering.internal.adform.video.player.media;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.View;
import io.bidmachine.rendering.model.Error;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class a extends io.bidmachine.rendering.internal.adform.video.player.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Context f70083l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final MediaPlayer f70084m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.adform.video.player.media.b f70085n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f70086o = 1.0f;

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.adform.video.player.media.a$a, reason: collision with other inner class name */
    public class C0822a implements io.bidmachine.rendering.internal.adform.video.player.media.c {
        public C0822a() {
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.media.c
        public void a() {
            if (a.this.F()) {
                a.this.b(new Error("Surface Destroyed"));
            }
        }
    }

    public class b implements MediaPlayer.OnCompletionListener {
        public b() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            a.this.L();
        }
    }

    public class c implements MediaPlayer.OnErrorListener {
        public c() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            a.this.a(new Error("MediaPlayer - onError (what - " + i10 + ", extra - " + i11 + ")"));
            return true;
        }
    }

    public class d implements MediaPlayer.OnPreparedListener {
        public d() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            mediaPlayer.seekTo(1);
            a.this.v();
        }
    }

    public class e implements MediaPlayer.OnSeekCompleteListener {
        public e() {
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            a aVar = a.this;
            aVar.b(aVar.r());
        }
    }

    public a(Context context) {
        this.f70083l = context.getApplicationContext();
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f70084m = mediaPlayer;
        mediaPlayer.setLooping(false);
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).setUsage(1).build());
        mediaPlayer.setOnPreparedListener(new d());
        mediaPlayer.setOnErrorListener(new c());
        mediaPlayer.setOnSeekCompleteListener(new e());
        mediaPlayer.setOnCompletionListener(new b());
        io.bidmachine.rendering.internal.adform.video.player.media.b bVar = new io.bidmachine.rendering.internal.adform.video.player.media.b(context);
        this.f70085n = bVar;
        bVar.setListener(new C0822a());
        bVar.setMediaPlayer(mediaPlayer);
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    public void B() {
        super.B();
        t();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    public void C() {
        super.C();
        u();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a, io.bidmachine.rendering.internal.adform.video.player.b
    public void a() {
        super.a();
        this.f70085n.a();
        this.f70084m.reset();
        this.f70084m.release();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    public void a(float f10) {
        this.f70084m.setVolume(f10, f10);
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    public void a(long j10) {
        this.f70084m.seekTo((int) j10);
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    public long b() {
        return this.f70084m.getCurrentPosition();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    public void b(Uri uri) throws IOException {
        this.f70084m.reset();
        this.f70084m.setDataSource(this.f70083l, uri);
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    public long c() {
        return this.f70084m.getDuration();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    public void c(float f10) {
        this.f70086o = f10;
        super.c(f10);
        b(f10);
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    public float d() {
        return this.f70086o;
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    public boolean f() {
        return this.f70084m.isPlaying();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    public boolean h() {
        return false;
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    public void j() {
        this.f70084m.pause();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    public void k() {
        this.f70084m.start();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    public void n() {
        this.f70084m.prepareAsync();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a
    public void o() {
        this.f70084m.stop();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.a, io.bidmachine.rendering.internal.adform.video.player.b
    public View p() {
        return this.f70085n;
    }
}
