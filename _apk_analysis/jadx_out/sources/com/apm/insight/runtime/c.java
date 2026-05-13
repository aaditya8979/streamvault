package com.apm.insight.runtime;

import androidx.annotation.NonNull;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.IOOMCallback;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: CallbackCenter.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ICrashCallback> f7499a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<ICrashCallback> f7500b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<ICrashCallback> f7501c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<ICrashCallback> f7502d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<IOOMCallback> f7503e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: com.apm.insight.runtime.c$1, reason: invalid class name */
    /* JADX INFO: compiled from: CallbackCenter.java */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7504a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f7504a = iArr;
            try {
                iArr[CrashType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7504a[CrashType.ANR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7504a[CrashType.JAVA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7504a[CrashType.LAUNCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7504a[CrashType.NATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @NonNull
    public final List<IOOMCallback> a() {
        return this.f7503e;
    }

    public final void a(ICrashCallback iCrashCallback, CrashType crashType) {
        int i10 = AnonymousClass1.f7504a[crashType.ordinal()];
        if (i10 == 1) {
            this.f7499a.add(iCrashCallback);
            this.f7500b.add(iCrashCallback);
            this.f7501c.add(iCrashCallback);
            this.f7502d.add(iCrashCallback);
            return;
        }
        if (i10 == 2) {
            this.f7502d.add(iCrashCallback);
            return;
        }
        if (i10 == 3) {
            this.f7500b.add(iCrashCallback);
        } else if (i10 == 4) {
            this.f7499a.add(iCrashCallback);
        } else {
            if (i10 != 5) {
                return;
            }
            this.f7501c.add(iCrashCallback);
        }
    }

    public final void a(IOOMCallback iOOMCallback) {
        this.f7503e.add(iOOMCallback);
    }

    @NonNull
    public final List<ICrashCallback> b() {
        return this.f7499a;
    }

    public final void b(ICrashCallback iCrashCallback, CrashType crashType) {
        int i10 = AnonymousClass1.f7504a[crashType.ordinal()];
        if (i10 == 1) {
            this.f7499a.remove(iCrashCallback);
            this.f7500b.remove(iCrashCallback);
            this.f7501c.remove(iCrashCallback);
            this.f7502d.remove(iCrashCallback);
            return;
        }
        if (i10 == 2) {
            this.f7502d.remove(iCrashCallback);
            return;
        }
        if (i10 == 3) {
            this.f7500b.remove(iCrashCallback);
        } else if (i10 == 4) {
            this.f7499a.remove(iCrashCallback);
        } else {
            if (i10 != 5) {
                return;
            }
            this.f7501c.remove(iCrashCallback);
        }
    }

    public final void b(IOOMCallback iOOMCallback) {
        this.f7503e.remove(iOOMCallback);
    }

    @NonNull
    public final List<ICrashCallback> c() {
        return this.f7500b;
    }

    @NonNull
    public final List<ICrashCallback> d() {
        return this.f7501c;
    }

    @NonNull
    public final List<ICrashCallback> e() {
        return this.f7502d;
    }
}
