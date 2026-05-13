package ys;

import java.util.LinkedHashMap;
import xyz.doikki.videoplayer.player.VideoView;

/* JADX INFO: compiled from: VideoViewManager.java */
/* JADX INFO: loaded from: classes12.dex */
public class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static f f98118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static e f98119d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap<String, VideoView> f98120a = new LinkedHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f98121b = a().f98102a;

    public static e a() {
        d(null);
        return f98119d;
    }

    public static f b() {
        if (f98118c == null) {
            synchronized (f.class) {
                if (f98118c == null) {
                    f98118c = new f();
                }
            }
        }
        return f98118c;
    }

    public static void d(e eVar) {
        if (f98119d == null) {
            synchronized (e.class) {
                if (f98119d == null) {
                    if (eVar == null) {
                        eVar = e.a().j();
                    }
                    f98119d = eVar;
                }
            }
        }
    }

    public boolean c() {
        return this.f98121b;
    }

    public void e(boolean z10) {
        this.f98121b = z10;
    }
}
