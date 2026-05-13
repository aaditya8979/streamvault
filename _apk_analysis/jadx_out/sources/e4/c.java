package e4;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: AudioFocusManager.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioManager f60038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f60039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public b f60040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public g4.c f60041d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f60043f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AudioFocusRequest f60045h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f60046i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f60044g = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f60042e = 0;

    /* JADX INFO: compiled from: AudioFocusManager.java */
    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f60047b;

        public a(Handler handler) {
            this.f60047b = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i10) {
            c.this.g(i10);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i10) {
            this.f60047b.post(new Runnable() { // from class: e4.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f60036b.b(i10);
                }
            });
        }
    }

    /* JADX INFO: compiled from: AudioFocusManager.java */
    public interface b {
        void executePlayerCommand(int i10);

        void setVolumeMultiplier(float f10);
    }

    public c(Context context, Handler handler, b bVar) {
        this.f60038a = (AudioManager) context.getApplicationContext().getSystemService("audio");
        this.f60040c = bVar;
        this.f60039b = new a(handler);
    }

    public final void a() {
        if (this.f60042e == 0) {
            return;
        }
        if (a6.k0.f3574a >= 26) {
            c();
        } else {
            b();
        }
        l(0);
    }

    public final void b() {
        this.f60038a.abandonAudioFocus(this.f60039b);
    }

    @RequiresApi(26)
    public final void c() {
        AudioFocusRequest audioFocusRequest = this.f60045h;
        if (audioFocusRequest != null) {
            this.f60038a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    public final void e(int i10) {
        b bVar = this.f60040c;
        if (bVar != null) {
            bVar.executePlayerCommand(i10);
        }
    }

    public float f() {
        return this.f60044g;
    }

    public final void g(int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2 && !o()) {
                l(3);
                return;
            } else {
                e(0);
                l(2);
                return;
            }
        }
        if (i10 == -1) {
            e(-1);
            a();
        } else if (i10 == 1) {
            l(1);
            e(1);
        } else {
            a6.m.h("AudioFocusManager", "Unknown focus change type: " + i10);
        }
    }

    public void h() {
        this.f60040c = null;
        a();
    }

    public final int i() {
        if (this.f60042e == 1) {
            return 1;
        }
        if ((a6.k0.f3574a >= 26 ? k() : j()) == 1) {
            l(1);
            return 1;
        }
        l(0);
        return -1;
    }

    public final int j() {
        return this.f60038a.requestAudioFocus(this.f60039b, a6.k0.U(((g4.c) a6.a.e(this.f60041d)).f61936c), this.f60043f);
    }

    @RequiresApi(26)
    public final int k() {
        AudioFocusRequest audioFocusRequest = this.f60045h;
        if (audioFocusRequest == null || this.f60046i) {
            this.f60045h = (audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f60043f) : new AudioFocusRequest.Builder(this.f60045h)).setAudioAttributes(((g4.c) a6.a.e(this.f60041d)).a()).setWillPauseWhenDucked(o()).setOnAudioFocusChangeListener(this.f60039b).build();
            this.f60046i = false;
        }
        return this.f60038a.requestAudioFocus(this.f60045h);
    }

    public final void l(int i10) {
        if (this.f60042e == i10) {
            return;
        }
        this.f60042e = i10;
        float f10 = i10 == 3 ? 0.2f : 1.0f;
        if (this.f60044g == f10) {
            return;
        }
        this.f60044g = f10;
        b bVar = this.f60040c;
        if (bVar != null) {
            bVar.setVolumeMultiplier(f10);
        }
    }

    public final boolean m(int i10) {
        return i10 == 1 || this.f60043f != 1;
    }

    public int n(boolean z10, int i10) {
        if (m(i10)) {
            a();
            return z10 ? 1 : -1;
        }
        if (z10) {
            return i();
        }
        return -1;
    }

    public final boolean o() {
        g4.c cVar = this.f60041d;
        return cVar != null && cVar.f61934a == 1;
    }
}
