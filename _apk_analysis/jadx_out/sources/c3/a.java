package c3;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import com.facebook.internal.instrument.InstrumentData;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import k2.t;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;
import z2.b;

/* JADX INFO: compiled from: CrashShieldHandler.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010\u0007\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0001H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0001H\u0007J\b\u0010\n\u001a\u00020\bH\u0007J\u0012\u0010\u0005\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007R8\u0010\u000f\u001a&\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00010\u0001 \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010¨\u0006\u0014"}, d2 = {"Lc3/a;", "", "Lbn/r;", "a", "", "e", "o", "b", "", "d", "c", "", "kotlin.jvm.PlatformType", "", "Ljava/util/Set;", "crashingObjects", "Z", "enabled", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f6494a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Set<Object> crashingObjects = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static boolean enabled;

    /* JADX INFO: renamed from: c3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CrashShieldHandler.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0017¨\u0006\u0004"}, d2 = {"c3/a$a", "Ljava/lang/Runnable;", "Lbn/r;", "run", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class RunnableC0127a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Throwable f6497b;

        public RunnableC0127a(Throwable th2) {
            this.f6497b = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.d(this)) {
                return;
            }
            try {
                throw new RuntimeException(this.f6497b);
            } catch (Throwable th2) {
                a.b(th2, this);
            }
        }
    }

    public static final void a() {
        enabled = true;
    }

    public static final void b(@Nullable Throwable th2, @NotNull Object obj) {
        p.k(obj, "o");
        if (enabled) {
            crashingObjects.add(obj);
            if (t.p()) {
                b.c(th2);
                InstrumentData.a aVar = InstrumentData.a.f15378a;
                InstrumentData.a.b(th2, InstrumentData.Type.CrashShield).g();
            }
            e(th2);
        }
    }

    @VisibleForTesting
    public static final boolean c() {
        return false;
    }

    public static final boolean d(@NotNull Object o10) {
        p.k(o10, "o");
        return crashingObjects.contains(o10);
    }

    @VisibleForTesting
    public static final void e(@Nullable Throwable th2) {
        if (c()) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0127a(th2));
        }
    }
}
