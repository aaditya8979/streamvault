package z0;

import java.io.File;

/* JADX INFO: compiled from: Config.java */
/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f98125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1.c f98126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1.a f98127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c1.b f98128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b1.b f98129e;

    public c(File file, a1.c cVar, a1.a aVar, c1.b bVar, b1.b bVar2) {
        this.f98125a = file;
        this.f98126b = cVar;
        this.f98127c = aVar;
        this.f98128d = bVar;
        this.f98129e = bVar2;
    }

    public File a(String str) {
        return new File(this.f98125a, this.f98126b.a(str));
    }
}
