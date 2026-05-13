package com.ironsource;

import android.content.Context;
import com.ironsource.InterfaceC4262t4;
import com.ironsource.InterfaceC4265t7;
import com.ironsource.environment.ContextProvider;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class K3 implements InterfaceC4265t7, InterfaceC4265t7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Xc f29719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4188of f29720b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29721a;

        static {
            int[] iArr = new int[O3.values().length];
            try {
                iArr[O3.Pacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[O3.ShowCount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[O3.Delivery.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f29721a = iArr;
        }
    }

    public K3() {
        this(null, null, null, 7, null);
    }

    public K3(@NotNull InterfaceC4262t4 interfaceC4262t4, @NotNull M7 m72, @NotNull T8 t82) {
        tn.p.k(interfaceC4262t4, "currentTimeProvider");
        tn.p.k(m72, "pacingDataRepository");
        tn.p.k(t82, "showCountDataRepository");
        this.f29719a = new Xc(interfaceC4262t4, m72);
        this.f29720b = new C4188of(interfaceC4262t4, t82);
    }

    public /* synthetic */ K3(InterfaceC4262t4 interfaceC4262t4, M7 m72, T8 t82, int i10, tn.i iVar) {
        interfaceC4262t4 = (i10 & 1) != 0 ? new InterfaceC4262t4.a() : interfaceC4262t4;
        if ((i10 & 2) != 0) {
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            tn.p.j(applicationContext, "getInstance().applicationContext");
            m72 = new Yc(new C4096jf(applicationContext, "pacing_service", null, 4, null));
        }
        if ((i10 & 4) != 0) {
            Context applicationContext2 = ContextProvider.getInstance().getApplicationContext();
            tn.p.j(applicationContext2, "getInstance().applicationContext");
            t82 = new C4152mf(new C4096jf(applicationContext2, "capping_service", null, 4, null));
        }
        this(interfaceC4262t4, m72, t82);
    }

    @Override // com.ironsource.InterfaceC4265t7
    @NotNull
    public synchronized M3 a(@NotNull String str) {
        tn.p.k(str, "identifier");
        M3 m3A = this.f29719a.a(str);
        if (m3A.d()) {
            return m3A;
        }
        return this.f29720b.a(str);
    }

    @Override // com.ironsource.InterfaceC4265t7.a
    @NotNull
    public synchronized Object a(@NotNull String str, @NotNull O3 o32, @NotNull InterfaceC4231r7 interfaceC4231r7) {
        Object objA;
        tn.p.k(str, "identifier");
        tn.p.k(o32, "cappingType");
        tn.p.k(interfaceC4231r7, "cappingConfig");
        int i10 = a.f29721a[o32.ordinal()];
        if (i10 == 1) {
            objA = this.f29719a.a(str, o32, interfaceC4231r7);
        } else if (i10 == 2) {
            objA = this.f29720b.a(str, o32, interfaceC4231r7);
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Result.a aVar = Result.Companion;
            objA = Result.m7534constructorimpl(bn.r.f5635a);
        }
        return objA;
    }

    @Override // com.ironsource.InterfaceC4265t7.a
    public synchronized void b(@NotNull String str) {
        tn.p.k(str, "identifier");
        this.f29719a.b(str);
        this.f29720b.b(str);
    }
}
