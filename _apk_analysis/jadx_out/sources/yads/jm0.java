package yads;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class jm0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f91276h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f91277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f91278b = cn.w.m();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f91279c = kotlin.collections.a.j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f91280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f91281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f91282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f91283g;

    public final Map a() {
        return this.f91279c;
    }

    public final String b() {
        String str;
        synchronized (f91276h) {
            str = this.f91283g;
        }
        return str;
    }
}
