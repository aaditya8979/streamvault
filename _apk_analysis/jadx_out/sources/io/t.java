package io;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import p000do.y1;

/* JADX INFO: compiled from: MainDispatchers.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final t f71728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f71729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final y1 f71730c;

    static {
        t tVar = new t();
        f71728a = tVar;
        f71729b = f0.f("kotlinx.coroutines.fast.service.loader", true);
        f71730c = tVar.a();
    }

    public final y1 a() {
        Object next;
        y1 y1VarE;
        try {
            List<s> listC = f71729b ? j.f71045a.c() : SequencesKt___SequencesKt.U(ao.r.g(ServiceLoader.load(s.class, s.class.getClassLoader()).iterator()));
            Iterator<T> it = listC.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iA = ((s) next).a();
                    do {
                        Object next2 = it.next();
                        int iA2 = ((s) next2).a();
                        if (iA < iA2) {
                            next = next2;
                            iA = iA2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            s sVar = (s) next;
            return (sVar == null || (y1VarE = u.e(sVar, listC)) == null) ? u.b(null, null, 3, null) : y1VarE;
        } catch (Throwable th2) {
            return u.b(th2, null, 2, null);
        }
    }
}
