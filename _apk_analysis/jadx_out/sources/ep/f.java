package ep;

import ep.c;
import fp.k;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;

/* JADX INFO: compiled from: IDanmakuView.java */
/* JADX INFO: loaded from: classes11.dex */
public interface f {

    /* JADX INFO: compiled from: IDanmakuView.java */
    public interface a {
        boolean a(f fVar);

        boolean b(k kVar);

        boolean c(k kVar);
    }

    void a(fp.c cVar);

    void b(ip.a aVar, DanmakuContext danmakuContext);

    boolean d();

    void g(Long l10);

    k getCurrentVisibleDanmakus();

    a getOnDanmakuClickListener();

    float getXOff();

    float getYOff();

    void h(boolean z10);

    void hide();

    boolean isPaused();

    void pause();

    void release();

    void resume();

    void setCallback(c.d dVar);

    void show();

    void start();

    void toggle();
}
