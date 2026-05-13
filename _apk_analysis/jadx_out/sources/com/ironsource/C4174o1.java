package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4174o1 implements InterfaceC4192p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final IronSource.a f33130a;

    /* JADX INFO: renamed from: com.ironsource.o1$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33131a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f33131a = iArr;
        }
    }

    public C4174o1(@NotNull IronSource.a aVar) {
        tn.p.k(aVar, "adFormat");
        this.f33130a = aVar;
    }

    @Override // com.ironsource.InterfaceC4192p1
    @NotNull
    public InterfaceC4209q1 a(@NotNull InterfaceC4118l1 interfaceC4118l1) {
        tn.p.k(interfaceC4118l1, "eventBaseData");
        int i10 = a.f33131a[this.f33130a.ordinal()];
        if (i10 == 1) {
            return new G9(interfaceC4118l1);
        }
        if (i10 == 2) {
            return new Yd(interfaceC4118l1);
        }
        if (i10 == 3) {
            return new R2(interfaceC4118l1);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + this.f33130a);
    }
}
