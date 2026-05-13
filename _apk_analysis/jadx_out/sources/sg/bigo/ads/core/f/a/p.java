package sg.bigo.ads.core.f.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class p {
    public sg.bigo.ads.core.f.a.a.a B;
    public List<sg.bigo.ads.core.c.a> C;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public String f83958m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public b f83959n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public String f83960o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public String f83961p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public String f83962q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public String f83963r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f83964s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f83965t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f83966u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f83967v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f83968w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f83969x = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ArrayList<n> f83946a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ArrayList<l> f83947b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ArrayList<c> f83948c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ArrayList<n> f83949d = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ArrayList<n> f83951f = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ArrayList<n> f83950e = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ArrayList<j> f83952g = new ArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final ArrayList<n> f83954i = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ArrayList<n> f83953h = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final ArrayList<n> f83955j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final ArrayList<n> f83956k = new ArrayList<>();

    @NonNull
    private final ArrayList<n> D = new ArrayList<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final ArrayList<n> f83957l = new ArrayList<>();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List<n> f83970y = new ArrayList();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final List<n> f83971z = new ArrayList();
    public final List<a> A = new ArrayList();

    public final void a(@NonNull List<n> list) {
        this.f83946a.addAll(list);
    }

    public final void b(@NonNull List<n> list) {
        this.D.addAll(list);
    }

    public final void c(@NonNull List<n> list) {
        this.f83957l.addAll(list);
    }

    public final void d(@NonNull List<n> list) {
        this.f83949d.addAll(list);
    }

    public final void e(@NonNull List<n> list) {
        this.f83951f.addAll(list);
    }

    public final void f(@NonNull List<n> list) {
        this.f83950e.addAll(list);
    }

    public final void g(@NonNull List<j> list) {
        this.f83952g.addAll(list);
    }

    public final void h(@NonNull List<n> list) {
        this.f83954i.addAll(list);
    }

    public final void i(@NonNull List<n> list) {
        this.f83953h.addAll(list);
    }

    public final void j(@NonNull List<n> list) {
        this.f83955j.addAll(list);
    }

    public final void k(@NonNull List<l> list) {
        this.f83947b.addAll(list);
        Collections.sort(this.f83947b);
    }

    public final void l(@NonNull List<c> list) {
        this.f83948c.addAll(list);
        Collections.sort(this.f83948c);
    }
}
