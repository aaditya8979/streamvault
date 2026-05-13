package k;

import com.yk.e.pl.BaseAdPlayer;

/* JADX INFO: loaded from: classes8.dex */
public final class p implements BaseAdPlayer.IPlayerCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f72658a;

    public p(x xVar) {
        this.f72658a = xVar;
    }

    @Override // com.yk.e.pl.BaseAdPlayer.IPlayerCallback
    public final void onPlayComplete() {
    }

    @Override // com.yk.e.pl.BaseAdPlayer.IPlayerCallback
    public final void onPlayFailed(String str) {
        this.f72658a.a(str);
    }

    @Override // com.yk.e.pl.BaseAdPlayer.IPlayerCallback
    public final void onStartPlay() {
    }
}
