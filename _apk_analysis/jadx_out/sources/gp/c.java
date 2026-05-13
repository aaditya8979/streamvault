package gp;

import androidx.compose.material.TextFieldImplKt;

/* JADX INFO: compiled from: CachingPolicy.java */
/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f62707h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f62708i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f62709j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f62710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f62711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f62712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f62713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f62714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f62715f = 20;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f62716g = TextFieldImplKt.AnimationDuration;

    static {
        c cVar = new c(16, 0.3f, 0L, 50, 0.01f);
        f62707h = cVar;
        f62708i = new c(16, 0.5f, -1L, 50, 0.005f);
        f62709j = cVar;
    }

    public c(int i10, float f10, long j10, int i11, float f11) {
        this.f62711b = 0.3f;
        this.f62712c = 0L;
        this.f62713d = 0.01f;
        this.f62714e = 0;
        this.f62710a = i10;
        this.f62710a = 32;
        this.f62711b = f10;
        this.f62712c = j10;
        this.f62714e = i11;
        this.f62713d = f11;
    }
}
