package com.ironsource;

import com.ironsource.N7;
import com.unity3d.mediation.LevelPlay;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.id, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4077id implements N7, N7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final K3 f31958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final S4 f31959b;

    /* JADX INFO: renamed from: com.ironsource.id$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31960a;

        static {
            int[] iArr = new int[O3.values().length];
            try {
                iArr[O3.Delivery.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[O3.Pacing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[O3.ShowCount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f31960a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4077id() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public C4077id(@NotNull K3 k32, @NotNull S4 s42) {
        tn.p.k(k32, "cappingService");
        tn.p.k(s42, "deliveryHandler");
        this.f31958a = k32;
        this.f31959b = s42;
    }

    public /* synthetic */ C4077id(K3 k32, S4 s42, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? new K3(null, null, null, 7, null) : k32, (i10 & 2) != 0 ? new S4() : s42);
    }

    @Override // com.ironsource.N7
    @NotNull
    public synchronized M3 a(@NotNull String str, @NotNull LevelPlay.AdFormat adFormat) {
        tn.p.k(str, "placementName");
        tn.p.k(adFormat, "adFormat");
        String strA = new C4168nd(str, adFormat).a();
        M3 m3A = this.f31959b.a(strA);
        if (m3A.d()) {
            return m3A;
        }
        return this.f31958a.a(strA);
    }

    @Override // com.ironsource.N7.a
    @NotNull
    public synchronized Object a(@NotNull String str, @NotNull LevelPlay.AdFormat adFormat, @NotNull O3 o32, @NotNull InterfaceC4231r7 interfaceC4231r7) {
        Object objA;
        tn.p.k(str, "placementName");
        tn.p.k(adFormat, "adFormat");
        tn.p.k(o32, "cappingType");
        tn.p.k(interfaceC4231r7, "cappingConfig");
        String strA = new C4168nd(str, adFormat).a();
        int i10 = a.f31960a[o32.ordinal()];
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            objA = this.f31958a.a(strA, o32, interfaceC4231r7);
        } else {
            objA = this.f31959b.a(strA, o32, interfaceC4231r7);
        }
        return objA;
    }

    @Override // com.ironsource.N7.a
    public synchronized void b(@NotNull String str, @NotNull LevelPlay.AdFormat adFormat) {
        tn.p.k(str, "placementName");
        tn.p.k(adFormat, "adFormat");
        String strA = new C4168nd(str, adFormat).a();
        if (!this.f31959b.a(strA).d()) {
            this.f31958a.b(strA);
        }
    }
}
