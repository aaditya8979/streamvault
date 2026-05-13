package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdSize;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4011f1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f31650b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f31651c = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4117l0 f31652a;

    /* JADX INFO: renamed from: com.ironsource.f1$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.f1$b */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return fn.b.d(Integer.valueOf(((LevelPlayAdSize) t11).getWidth()), Integer.valueOf(((LevelPlayAdSize) t10).getWidth()));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.f1$c */
    public static final class c<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f31653a;

        public c(Comparator comparator) {
            this.f31653a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int iCompare = this.f31653a.compare(t10, t11);
            return iCompare != 0 ? iCompare : fn.b.d(Integer.valueOf(((LevelPlayAdSize) t11).getHeight()), Integer.valueOf(((LevelPlayAdSize) t10).getHeight()));
        }
    }

    public C4011f1(@NotNull C4117l0 c4117l0) {
        tn.p.k(c4117l0, "adSizeTools");
        this.f31652a = c4117l0;
    }

    private final int a(Integer num, Context context) {
        if (num == null || num.intValue() >= 0) {
            return num == null ? C3997e5.f31533a.b(context) : num.intValue();
        }
        IronLog.API.info(C4117l0.a(this.f31652a, "Width is invalid, screen width will be used", (String) null, 2, (Object) null));
        return C3997e5.f31533a.b(context);
    }

    private final List<LevelPlayAdSize> a() {
        return cn.f0.X0(this.f31652a.b(), new c(new b()));
    }

    private final List<LevelPlayAdSize> a(List<LevelPlayAdSize> list, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            LevelPlayAdSize levelPlayAdSize = (LevelPlayAdSize) obj;
            if (levelPlayAdSize.getHeight() <= i10 && levelPlayAdSize.getWidth() <= i11) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Nullable
    public final LevelPlayAdSize a(@NotNull Context context, @Nullable Integer num) {
        int i10;
        LevelPlayAdSize levelPlayAdSizeCreateCustomSize;
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        if (!this.f31652a.d()) {
            IronLog.API.error(C4117l0.a(this.f31652a, "The SDK must be successfully initialized to create an Adaptive Ad Size", (String) null, 2, (Object) null));
            return null;
        }
        Integer numB = this.f31652a.b(context);
        if (numB == null) {
            IronLog.API.error(C4117l0.a(this.f31652a, "Error getting max current orientation banner height", (String) null, 2, (Object) null));
            return null;
        }
        int iIntValue = numB.intValue();
        int iA = a(num, context);
        int iA2 = this.f31652a.a(iA);
        List<LevelPlayAdSize> listA = a();
        for (LevelPlayAdSize levelPlayAdSize : a(listA, iIntValue, iA)) {
            if (levelPlayAdSize.getWidth() <= iA && (levelPlayAdSize.getHeight() <= iA2 || iA2 == -1)) {
                iA2 = Math.max(iA2, levelPlayAdSize.getHeight());
                break;
            }
        }
        levelPlayAdSize = null;
        if (levelPlayAdSize == null) {
            int height = ((LevelPlayAdSize) cn.f0.F0(listA)).getHeight();
            i10 = height;
            levelPlayAdSizeCreateCustomSize = LevelPlayAdSize.Companion.createCustomSize(iA, height);
        } else {
            i10 = iA2;
            levelPlayAdSizeCreateCustomSize = levelPlayAdSize;
        }
        IronLog.INTERNAL.info(C4117l0.a(this.f31652a, "Adaptive: " + iA + VastAttributes.HORIZONTAL_POSITION + i10 + " Fallback: " + levelPlayAdSizeCreateCustomSize, (String) null, 2, (Object) null));
        return new LevelPlayAdSize(iA, i10, "CUSTOM", true, levelPlayAdSizeCreateCustomSize);
    }
}
