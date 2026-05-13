package yads;

import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import kotlin.Pair;

/* JADX INFO: loaded from: classes12.dex */
public final class pp0 implements Player.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f93705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f93706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f93707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rp0 f93708d;

    public pp0(rp0 rp0Var) {
        this.f93708d = rp0Var;
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onIsPlayingChanged(boolean z10) {
        if (!z10) {
            if (this.f93706b) {
                return;
            }
            this.f93707c = true;
            rp0 rp0Var = this.f93708d;
            kf3 kf3Var = rp0Var.f94565k;
            cf3 cf3Var = rp0Var.f94564j;
            if (kf3Var == null || cf3Var == null) {
                return;
            }
            kf3Var.i();
            return;
        }
        if (!this.f93705a) {
            rp0 rp0Var2 = this.f93708d;
            kf3 kf3Var2 = rp0Var2.f94565k;
            cf3 cf3Var2 = rp0Var2.f94564j;
            if (kf3Var2 == null || cf3Var2 == null) {
                return;
            }
            this.f93705a = true;
            kf3Var2.c();
            return;
        }
        if (this.f93707c) {
            this.f93707c = false;
            rp0 rp0Var3 = this.f93708d;
            kf3 kf3Var3 = rp0Var3.f94565k;
            cf3 cf3Var3 = rp0Var3.f94564j;
            if (kf3Var3 == null || cf3Var3 == null) {
                return;
            }
            kf3Var3.f();
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackStateChanged(int i10) {
        if (i10 == 2) {
            this.f93706b = true;
            rp0 rp0Var = this.f93708d;
            kf3 kf3Var = rp0Var.f94565k;
            cf3 cf3Var = rp0Var.f94564j;
            if (kf3Var == null || cf3Var == null) {
                return;
            }
            kf3Var.b();
            return;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                return;
            }
            this.f93705a = false;
            rp0 rp0Var2 = this.f93708d;
            kf3 kf3Var2 = rp0Var2.f94565k;
            cf3 cf3Var2 = rp0Var2.f94564j;
            if (kf3Var2 == null || cf3Var2 == null) {
                return;
            }
            kf3Var2.d();
            return;
        }
        ((zb2) this.f93708d.f94561g.f93296b).a();
        rp0 rp0Var3 = this.f93708d;
        kf3 kf3Var3 = rp0Var3.f94565k;
        cf3 cf3Var3 = rp0Var3.f94564j;
        if (kf3Var3 != null && cf3Var3 != null) {
            kf3Var3.h();
        }
        if (this.f93706b) {
            this.f93706b = false;
            rp0 rp0Var4 = this.f93708d;
            kf3 kf3Var4 = rp0Var4.f94565k;
            cf3 cf3Var4 = rp0Var4.f94564j;
            if (kf3Var4 == null || cf3Var4 == null) {
                return;
            }
            kf3Var4.a();
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerError(PlaybackException playbackException) {
        rp0 rp0Var = this.f93708d;
        n62 n62Var = rp0Var.f94562h;
        n62 n62Var2 = rp0Var.f94563i;
        Pair pairA = (n62Var == null || n62Var2 == null) ? null : bn.h.a(n62Var, n62Var2);
        if (pairA != null && !this.f93708d.f94566l.contains(pairA)) {
            this.f93708d.f94566l.add(pairA);
            this.f93708d.a((cf3) pairA.getSecond());
            return;
        }
        this.f93705a = false;
        ((zb2) this.f93708d.f94561g.f93296b).a();
        this.f93708d.f94555a.stop();
        String message = playbackException.getMessage();
        qi3 qi3Var = this.f93708d.f94557c;
        fo2 fo2VarA = qi3Var.f94044b.a();
        fo2VarA.b(message, "error_message");
        qi3Var.f94043a.a(new eo2(co2.f88542l.a(), kotlin.collections.a.C(fo2VarA.f89652a), fo2VarA.f89653b));
        rp0 rp0Var2 = this.f93708d;
        kf3 kf3Var = rp0Var2.f94565k;
        cf3 cf3Var = rp0Var2.f94564j;
        if (kf3Var == null || cf3Var == null) {
            return;
        }
        rp0Var2.f94558d.getClass();
        kf3Var.a(new jf3(o52.a(playbackException), playbackException));
    }
}
