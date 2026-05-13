package z2;

import androidx.annotation.RestrictTo;
import com.facebook.internal.FeatureManager;
import k2.t;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InstrumentManager.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lz2/f;", "", "Lbn/r;", "d", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f98187a = new f();

    public static final void d() {
        if (t.p()) {
            FeatureManager featureManager = FeatureManager.f15284a;
            FeatureManager.a(FeatureManager.Feature.CrashReport, new FeatureManager.a() { // from class: z2.c
                @Override // com.facebook.internal.FeatureManager.a
                public final void a(boolean z10) {
                    f.e(z10);
                }
            });
            FeatureManager.a(FeatureManager.Feature.ErrorReport, new FeatureManager.a() { // from class: z2.d
                @Override // com.facebook.internal.FeatureManager.a
                public final void a(boolean z10) {
                    f.f(z10);
                }
            });
            FeatureManager.a(FeatureManager.Feature.AnrReport, new FeatureManager.a() { // from class: z2.e
                @Override // com.facebook.internal.FeatureManager.a
                public final void a(boolean z10) {
                    f.g(z10);
                }
            });
        }
    }

    public static final void e(boolean z10) {
        if (z10) {
            b3.c.INSTANCE.c();
            FeatureManager featureManager = FeatureManager.f15284a;
            if (FeatureManager.g(FeatureManager.Feature.CrashShield)) {
                b.b();
                c3.a.a();
            }
            if (FeatureManager.g(FeatureManager.Feature.ThreadCheck)) {
                e3.a.a();
            }
        }
    }

    public static final void f(boolean z10) {
        if (z10) {
            d3.e.d();
        }
    }

    public static final void g(boolean z10) {
        if (z10) {
            a3.e.c();
        }
    }
}
