package lo;

import bn.r;
import io.e0;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import org.jetbrains.annotations.NotNull;
import p000do.k;
import sn.q;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final q<Object, Object, Object, Object> f73884a = a.f73890b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final e0 f73885b = new e0("STATE_REG");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final e0 f73886c = new e0("STATE_COMPLETED");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final e0 f73887d = new e0("STATE_CANCELLED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final e0 f73888e = new e0("NO_RESULT");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final e0 f73889f = new e0("PARAM_CLAUSE_0");

    /* JADX INFO: compiled from: Select.kt */
    public static final class a implements q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f73890b = new a();

        @Override // sn.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    public static final TrySelectDetailedResult a(int i10) {
        if (i10 == 0) {
            return TrySelectDetailedResult.SUCCESSFUL;
        }
        if (i10 == 1) {
            return TrySelectDetailedResult.REREGISTER;
        }
        if (i10 == 2) {
            return TrySelectDetailedResult.CANCELLED;
        }
        if (i10 == 3) {
            return TrySelectDetailedResult.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i10).toString());
    }

    @NotNull
    public static final e0 i() {
        return f73889f;
    }

    public static final boolean j(k<? super r> kVar, q<? super Throwable, Object, ? super kotlin.coroutines.d, r> qVar) {
        Object objE = kVar.E(r.f5635a, null, qVar);
        if (objE == null) {
            return false;
        }
        kVar.A(objE);
        return true;
    }
}
