package com.ironsource;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class D4 implements A7 {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28908a;

        static {
            int[] iArr = new int[EnumC4364z4.values().length];
            try {
                iArr[EnumC4364z4.IADS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4364z4.UADS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4364z4.SHARED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC4364z4.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f28908a = iArr;
        }
    }

    @Override // com.ironsource.A7
    @Nullable
    public F4 a(@NotNull Context context, @NotNull EnumC4364z4 enumC4364z4) {
        C4 c42;
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(enumC4364z4, "source");
        int i10 = a.f28908a[enumC4364z4.ordinal()];
        if (i10 == 1) {
            c42 = new C4(context, "supersonic_shared_preferen");
        } else if (i10 == 2) {
            c42 = new C4(context, "unityads-installinfo");
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            c42 = new C4(context, E4.f29234c);
        }
        return c42;
    }
}
