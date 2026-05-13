package yads;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class wk implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f96406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yk f96407b;

    public wk(yk ykVar, Handler handler) {
        this.f96407b = ykVar;
        this.f96406a = handler;
    }

    public final void a(int i10) {
        pk pkVar;
        yk ykVar = this.f96407b;
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2 && ((pkVar = ykVar.f97196d) == null || pkVar.f93613b != 1)) {
                ykVar.b(3);
                return;
            } else {
                ykVar.a(0);
                ykVar.b(2);
                return;
            }
        }
        if (i10 == -1) {
            ykVar.a(-1);
            ykVar.a();
        } else if (i10 == 1) {
            ykVar.b(1);
            ykVar.a(1);
        } else {
            ykVar.getClass();
            ih1.d("AudioFocusManager", "Unknown focus change type: " + i10);
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i10) {
        this.f96406a.post(new Runnable() { // from class: bt.tb
            @Override // java.lang.Runnable
            public final void run() {
                this.f6310b.a(i10);
            }
        });
    }
}
