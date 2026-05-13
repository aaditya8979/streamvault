package master.flame.danmaku.danmaku.model.android;

import android.graphics.Typeface;
import fp.b;
import fp.i;
import gp.c;
import gp.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class DanmakuContext implements Cloneable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List<WeakReference<a>> f74040q;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f74044u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f74045v;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Typeface f74025b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f74026c = b.f61772a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f74027d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f74028e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f74029f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f74030g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f74031h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f74032i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f74033j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<Integer> f74034k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f74035l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f74036m = 1.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<Integer> f74037n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<Integer> f74038o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List<String> f74039p = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f74041r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f74042s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f74043t = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public fp.a f74046w = new gp.a();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public i f74047x = new i();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ep.b f74048y = new ep.b();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public d f74049z = d.a();
    public c A = c.f62709j;
    public byte B = 0;

    public enum DanmakuConfigTag {
        FT_DANMAKU_VISIBILITY,
        FB_DANMAKU_VISIBILITY,
        L2R_DANMAKU_VISIBILITY,
        R2L_DANMAKU_VISIBILIY,
        SPECIAL_DANMAKU_VISIBILITY,
        TYPEFACE,
        TRANSPARENCY,
        SCALE_TEXTSIZE,
        MAXIMUM_NUMS_IN_SCREEN,
        DANMAKU_STYLE,
        DANMAKU_BOLD,
        COLOR_VALUE_WHITE_LIST,
        USER_ID_BLACK_LIST,
        USER_HASH_BLACK_LIST,
        SCROLL_SPEED_FACTOR,
        BLOCK_GUEST_DANMAKU,
        DUPLICATE_MERGING_ENABLED,
        MAXIMUN_LINES,
        OVERLAPPING_ENABLE,
        ALIGN_BOTTOM,
        DANMAKU_MARGIN,
        DANMAKU_SYNC;

        public boolean isVisibilityRelatedTag() {
            return equals(FT_DANMAKU_VISIBILITY) || equals(FB_DANMAKU_VISIBILITY) || equals(L2R_DANMAKU_VISIBILITY) || equals(R2L_DANMAKU_VISIBILIY) || equals(SPECIAL_DANMAKU_VISIBILITY) || equals(COLOR_VALUE_WHITE_LIST) || equals(USER_ID_BLACK_LIST);
        }
    }

    public interface a {
        boolean a(DanmakuContext danmakuContext, DanmakuConfigTag danmakuConfigTag, Object... objArr);
    }

    public static DanmakuContext a() {
        return new DanmakuContext();
    }

    public fp.a b() {
        return this.f74046w;
    }

    public boolean c() {
        return this.f74043t;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean e() {
        return this.f74042s;
    }

    public boolean f() {
        return this.f74044u;
    }

    public boolean g() {
        return this.f74045v;
    }

    public final void h(DanmakuConfigTag danmakuConfigTag, Object... objArr) {
        List<WeakReference<a>> list = this.f74040q;
        if (list != null) {
            Iterator<WeakReference<a>> it = list.iterator();
            while (it.hasNext()) {
                a aVar = it.next().get();
                if (aVar != null) {
                    aVar.a(this, danmakuConfigTag, objArr);
                }
            }
        }
    }

    public DanmakuContext i(Map<Integer, Boolean> map) {
        this.f74045v = map != null;
        if (map == null) {
            this.f74048y.i("1019_Filter", false);
        } else {
            n("1019_Filter", map, false);
        }
        this.f74047x.b();
        h(DanmakuConfigTag.OVERLAPPING_ENABLE, map);
        return this;
    }

    public void j(a aVar) {
        if (aVar == null || this.f74040q == null) {
            this.f74040q = Collections.synchronizedList(new ArrayList());
        }
        Iterator<WeakReference<a>> it = this.f74040q.iterator();
        while (it.hasNext()) {
            if (aVar.equals(it.next().get())) {
                return;
            }
        }
        this.f74040q.add(new WeakReference<>(aVar));
    }

    public DanmakuContext k(int i10) {
        if (this.f74028e != i10) {
            this.f74028e = i10;
            this.f74046w.f(i10);
            this.f74047x.b();
            this.f74047x.g();
            h(DanmakuConfigTag.DANMAKU_MARGIN, Integer.valueOf(i10));
        }
        return this;
    }

    public DanmakuContext l(int i10, float... fArr) {
        this.f74046w.b(i10, fArr);
        h(DanmakuConfigTag.DANMAKU_STYLE, Integer.valueOf(i10), fArr);
        return this;
    }

    public DanmakuContext m(boolean z10) {
        if (this.f74042s != z10) {
            this.f74042s = z10;
            this.f74047x.b();
            h(DanmakuConfigTag.DUPLICATE_MERGING_ENABLED, Boolean.valueOf(z10));
        }
        return this;
    }

    public final <T> void n(String str, T t10, boolean z10) {
        this.f74048y.d(str, z10).b(t10);
    }

    public DanmakuContext o(Map<Integer, Integer> map) {
        this.f74044u = map != null;
        if (map == null) {
            this.f74048y.i("1018_Filter", false);
        } else {
            n("1018_Filter", map, false);
        }
        this.f74047x.b();
        h(DanmakuConfigTag.MAXIMUN_LINES, map);
        return this;
    }

    public DanmakuContext p(float f10) {
        if (this.f74027d != f10) {
            this.f74027d = f10;
            this.f74046w.q();
            this.f74046w.v(f10);
            this.f74047x.d();
            this.f74047x.g();
            h(DanmakuConfigTag.SCALE_TEXTSIZE, Float.valueOf(f10));
        }
        return this;
    }

    public DanmakuContext q(float f10) {
        if (this.f74036m != f10) {
            this.f74036m = f10;
            this.f74049z.h(f10);
            this.f74047x.d();
            this.f74047x.g();
            h(DanmakuConfigTag.SCROLL_SPEED_FACTOR, Float.valueOf(f10));
        }
        return this;
    }

    public void r() {
        List<WeakReference<a>> list = this.f74040q;
        if (list != null) {
            list.clear();
            this.f74040q = null;
        }
    }
}
