package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class ji {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f91229a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile hi f91230b;

    public static void a(Context context, at1 at1Var) {
        p000do.l0 l0VarA = kotlinx.coroutines.d.a(p000do.j2.b(null, 1, null).plus(p000do.w0.b()).plus(new y10(at1Var)));
        if (f91229a.getAndSet(true)) {
            return;
        }
        p000do.i.d(l0VarA, null, null, new ii(context, at1Var, l0VarA, null), 3, null);
    }
}
