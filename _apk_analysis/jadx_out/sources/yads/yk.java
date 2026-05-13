package yads;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class yk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioManager f97193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wk f97194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public xk f97195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public pk f97196d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f97198f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AudioFocusRequest f97200h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f97199g = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f97197e = 0;

    public yk(Context context, Handler handler, wn0 wn0Var) {
        this.f97193a = (AudioManager) ni.a(context.getApplicationContext().getSystemService("audio"));
        this.f97195c = wn0Var;
        this.f97194b = new wk(this, handler);
    }

    public final int a(boolean z10, int i10) {
        int iRequestAudioFocus;
        if (i10 == 1 || this.f97198f != 1) {
            a();
            return z10 ? 1 : -1;
        }
        if (!z10) {
            return -1;
        }
        if (this.f97197e != 1) {
            if (ib3.f90737a >= 26) {
                AudioFocusRequest audioFocusRequest = this.f97200h;
                if (audioFocusRequest == null) {
                    AudioFocusRequest.Builder builder = audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f97198f) : new AudioFocusRequest.Builder(this.f97200h);
                    pk pkVar = this.f97196d;
                    boolean z11 = pkVar != null && pkVar.f93613b == 1;
                    pkVar.getClass();
                    if (pkVar.f93618g == null) {
                        pkVar.f93618g = new ok(pkVar);
                    }
                    this.f97200h = builder.setAudioAttributes(pkVar.f93618g.f93242a).setWillPauseWhenDucked(z11).setOnAudioFocusChangeListener(this.f97194b).build();
                }
                iRequestAudioFocus = this.f97193a.requestAudioFocus(this.f97200h);
            } else {
                AudioManager audioManager = this.f97193a;
                wk wkVar = this.f97194b;
                pk pkVar2 = this.f97196d;
                pkVar2.getClass();
                iRequestAudioFocus = audioManager.requestAudioFocus(wkVar, ib3.c(pkVar2.f93615d), this.f97198f);
            }
            if (iRequestAudioFocus != 1) {
                b(0);
                return -1;
            }
            b(1);
        }
        return 1;
    }

    public final void a() {
        if (this.f97197e == 0) {
            return;
        }
        if (ib3.f90737a >= 26) {
            AudioFocusRequest audioFocusRequest = this.f97200h;
            if (audioFocusRequest != null) {
                this.f97193a.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            this.f97193a.abandonAudioFocus(this.f97194b);
        }
        b(0);
    }

    public final void a(int i10) {
        xk xkVar = this.f97195c;
        if (xkVar != null) {
            wn0 wn0Var = (wn0) xkVar;
            zn0 zn0Var = wn0Var.f96456a;
            zn0Var.r();
            boolean z10 = zn0Var.Z.f88441l;
            zn0 zn0Var2 = wn0Var.f96456a;
            int i11 = 1;
            if (z10 && i10 != 1) {
                i11 = 2;
            }
            zn0Var2.a(i10, i11, z10);
        }
    }

    public final void b() {
        if (ib3.a(this.f97196d, (Object) null)) {
            return;
        }
        this.f97196d = null;
        this.f97198f = 0;
    }

    public final void b(int i10) {
        if (this.f97197e == i10) {
            return;
        }
        this.f97197e = i10;
        float f10 = i10 == 3 ? 0.2f : 1.0f;
        if (this.f97199g == f10) {
            return;
        }
        this.f97199g = f10;
        xk xkVar = this.f97195c;
        if (xkVar != null) {
            zn0 zn0Var = ((wn0) xkVar).f96456a;
            zn0Var.a(1, 2, Float.valueOf(zn0Var.T * zn0Var.f97720v.f97199g));
        }
    }
}
