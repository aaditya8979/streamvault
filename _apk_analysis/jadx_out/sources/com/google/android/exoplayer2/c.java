package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import s7.m0;

/* JADX INFO: compiled from: AudioFocusManager.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioManager f21373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f21374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public b f21375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public com.google.android.exoplayer2.audio.a f21376d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21378f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AudioFocusRequest f21380h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f21381i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f21379g = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21377e = 0;

    /* JADX INFO: compiled from: AudioFocusManager.java */
    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f21382b;

        public a(Handler handler) {
            this.f21382b = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i10) {
            c.this.h(i10);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i10) {
            this.f21382b.post(new Runnable() { // from class: d6.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f59575b.b(i10);
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
        this.f21373a = (AudioManager) s7.a.e((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f21375c = bVar;
        this.f21374b = new a(handler);
    }

    public static int e(@Nullable com.google.android.exoplayer2.audio.a aVar) {
        if (aVar == null) {
            return 0;
        }
        switch (aVar.f21269d) {
            case 0:
                s7.q.i("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (aVar.f21267b == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                s7.q.i("AudioFocusManager", "Unidentified audio usage: " + aVar.f21269d);
                return 0;
            case 16:
                return m0.f79487a >= 19 ? 4 : 2;
        }
    }

    public final void a() {
        this.f21373a.abandonAudioFocus(this.f21374b);
    }

    public final void b() {
        if (this.f21377e == 0) {
            return;
        }
        if (m0.f79487a >= 26) {
            c();
        } else {
            a();
        }
        n(0);
    }

    @RequiresApi(26)
    public final void c() {
        AudioFocusRequest audioFocusRequest = this.f21380h;
        if (audioFocusRequest != null) {
            this.f21373a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    public final void f(int i10) {
        b bVar = this.f21375c;
        if (bVar != null) {
            bVar.executePlayerCommand(i10);
        }
    }

    public float g() {
        return this.f21379g;
    }

    public final void h(int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2 && !q()) {
                n(3);
                return;
            } else {
                f(0);
                n(2);
                return;
            }
        }
        if (i10 == -1) {
            f(-1);
            b();
        } else if (i10 == 1) {
            n(1);
            f(1);
        } else {
            s7.q.i("AudioFocusManager", "Unknown focus change type: " + i10);
        }
    }

    public void i() {
        this.f21375c = null;
        b();
    }

    public final int j() {
        if (this.f21377e == 1) {
            return 1;
        }
        if ((m0.f79487a >= 26 ? l() : k()) == 1) {
            n(1);
            return 1;
        }
        n(0);
        return -1;
    }

    public final int k() {
        return this.f21373a.requestAudioFocus(this.f21374b, m0.a0(((com.google.android.exoplayer2.audio.a) s7.a.e(this.f21376d)).f21269d), this.f21378f);
    }

    @RequiresApi(26)
    public final int l() {
        AudioFocusRequest audioFocusRequest = this.f21380h;
        if (audioFocusRequest == null || this.f21381i) {
            this.f21380h = (audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f21378f) : new AudioFocusRequest.Builder(this.f21380h)).setAudioAttributes(((com.google.android.exoplayer2.audio.a) s7.a.e(this.f21376d)).b().f21273a).setWillPauseWhenDucked(q()).setOnAudioFocusChangeListener(this.f21374b).build();
            this.f21381i = false;
        }
        return this.f21373a.requestAudioFocus(this.f21380h);
    }

    public void m(@Nullable com.google.android.exoplayer2.audio.a aVar) {
        if (m0.c(this.f21376d, aVar)) {
            return;
        }
        this.f21376d = aVar;
        int iE = e(aVar);
        this.f21378f = iE;
        boolean z10 = true;
        if (iE != 1 && iE != 0) {
            z10 = false;
        }
        s7.a.b(z10, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public final void n(int i10) {
        if (this.f21377e == i10) {
            return;
        }
        this.f21377e = i10;
        float f10 = i10 == 3 ? 0.2f : 1.0f;
        if (this.f21379g == f10) {
            return;
        }
        this.f21379g = f10;
        b bVar = this.f21375c;
        if (bVar != null) {
            bVar.setVolumeMultiplier(f10);
        }
    }

    public final boolean o(int i10) {
        return i10 == 1 || this.f21378f != 1;
    }

    public int p(boolean z10, int i10) {
        if (o(i10)) {
            b();
            return z10 ? 1 : -1;
        }
        if (z10) {
            return j();
        }
        return -1;
    }

    public final boolean q() {
        com.google.android.exoplayer2.audio.a aVar = this.f21376d;
        return aVar != null && aVar.f21267b == 1;
    }
}
