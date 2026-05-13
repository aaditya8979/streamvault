package he;

import android.graphics.Path;

/* JADX INFO: compiled from: ClipPathManager.java */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f63495a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f63496b = null;

    /* JADX INFO: compiled from: ClipPathManager.java */
    public interface a {
        Path a(int i10, int i11);
    }

    public Path a() {
        return this.f63495a;
    }

    public void b(a aVar) {
        this.f63496b = aVar;
    }

    public void c(int i10, int i11) {
        this.f63495a.reset();
        a aVar = this.f63496b;
        Path pathA = aVar != null ? aVar.a(i10, i11) : null;
        if (pathA != null) {
            this.f63495a.set(pathA);
        }
    }
}
