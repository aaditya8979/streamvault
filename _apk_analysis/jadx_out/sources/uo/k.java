package uo;

import org.jetbrains.annotations.NotNull;
import tn.p;
import tn.t;

/* JADX INFO: compiled from: SerialKinds.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class k {

    /* JADX INFO: compiled from: SerialKinds.kt */
    public static final class a extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f85771a = new a();

        public a() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: SerialKinds.kt */
    public static final class b extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f85772a = new b();

        public b() {
            super(null);
        }
    }

    public k() {
    }

    public /* synthetic */ k(tn.i iVar) {
        this();
    }

    public int hashCode() {
        return toString().hashCode();
    }

    @NotNull
    public String toString() {
        String simpleName = t.b(getClass()).getSimpleName();
        p.h(simpleName);
        return simpleName;
    }
}
