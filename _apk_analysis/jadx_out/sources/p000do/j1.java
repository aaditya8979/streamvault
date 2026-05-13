package p000do;

import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.coroutines.b;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import p000do.j1;
import sn.l;
import tn.i;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class j1 extends h0 implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f59859b = new a(null);

    /* JADX INFO: compiled from: Executors.kt */
    public static final class a extends b<h0, j1> {
        public a() {
            super(h0.Key, new l() { // from class: do.i1
                @Override // sn.l
                public final Object invoke(Object obj) {
                    return j1.a.d((d.b) obj);
                }
            });
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public static final j1 d(d.b bVar) {
            if (bVar instanceof j1) {
                return (j1) bVar;
            }
            return null;
        }
    }

    @NotNull
    public abstract Executor I();
}
