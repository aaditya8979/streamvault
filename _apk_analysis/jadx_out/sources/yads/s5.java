package yads;

import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public final class s5 implements f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z9 f94705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f94706b;

    public /* synthetic */ s5(uz1 uz1Var) {
        this(new z9(), new WeakReference(uz1Var));
    }

    public s5(z9 z9Var, WeakReference weakReference) {
        this.f94705a = z9Var;
        this.f94706b = weakReference;
        z9Var.a(this);
    }

    @Override // yads.f4
    public final void a(int i10, Bundle bundle) {
        uz1 uz1Var = (uz1) this.f94706b.get();
        if (uz1Var != null) {
            if (i10 == 19) {
                uz1Var.f95882a.b();
                uz1Var.f95883b.f89444f.f89057b.b(h1.f90190e);
            }
            if (i10 == 20) {
                uz1Var.f95883b.f89444f.f89057b.a(h1.f90190e);
                return;
            }
            switch (i10) {
                case 6:
                    uz1Var.f95882a.b();
                    uz1Var.f95883b.f89444f.f89057b.b(h1.f90189d);
                    break;
                case 7:
                    uz1Var.f95882a.b();
                    uz1Var.f95883b.f89444f.c();
                    break;
                case 8:
                    uz1Var.f95883b.f89444f.f89057b.a(h1.f90189d);
                    break;
                case 9:
                    boolean z10 = ad1.f87661a;
                    uz1Var.f95883b.f89444f.a();
                    break;
            }
        }
    }
}
