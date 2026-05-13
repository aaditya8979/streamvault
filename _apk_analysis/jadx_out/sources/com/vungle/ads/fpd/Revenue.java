package com.vungle.ads.fpd;

import com.vungle.ads.internal.util.RangeUtil;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import so.k;
import tn.i;
import tn.p;
import vo.d;
import wo.c2;
import wo.l0;
import wo.r2;

/* JADX INFO: compiled from: Revenue.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 B2\u00020\u0001:\u0002CBB\u0007¢\u0006\u0004\b<\u00107BK\b\u0017\u0012\u0006\u0010>\u001a\u00020=\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010@\u001a\u0004\u0018\u00010?¢\u0006\u0004\b<\u0010AJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0007J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\tJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\tJ\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\tH\u0007J\u0018\u0010\u0017\u001a\u00020\u00002\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0007J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0018H\u0007J\u0010\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\tH\u0007J\u0010\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\tH\u0007J\u0010\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\tH\u0007J\u0010\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\tH\u0007J\u0010\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\tH\u0007J\u0010\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\tH\u0007J\u0010\u0010*\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\tH\u0007J\u0010\u0010,\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\tH\u0007J\u0010\u0010.\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\tH\u0007J\u0010\u00100\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\tH\u0007J\u0010\u00102\u001a\u00020\u00002\u0006\u00101\u001a\u00020\tH\u0007J\u0010\u00104\u001a\u00020\u00002\u0006\u00103\u001a\u00020\tH\u0007R\u001e\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\f\u00105\u0012\u0004\b6\u00107R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u000e\u00105\u0012\u0004\b8\u00107R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0010\u00105\u0012\u0004\b9\u00107R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0019\u0010:\u0012\u0004\b;\u00107¨\u0006D"}, d2 = {"Lcom/vungle/ads/fpd/Revenue;", "", "self", "Lvo/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lbn/r;", "write$Self", "", "totalEarningsUsd", "setTotalEarningsUsd", "iaaRevenueUSD", "setIAARevenueUSD", "iapRevenueUSD", "setIAPRevenueUSD", "totalRevenueUSD", "setTotalRevenueUSD", "earningsByPlacement", "setEarningsByPlacement", "", "", "topNAdomain", "setTopNAdomain", "", "isUserAPurchaser", "setIsUserAPurchaser", "isUserASubscriber", "setIsUserASubscriber", "last7DaysMedianSpendUsd", "setLast7DaysMedianSpendUsd", "last7DaysTotalSpendUsd", "setLast7DaysTotalSpendUsd", "last30DaysTotalSpendUsd", "setLast30DaysTotalSpendUsd", "last7DaysMeanSpendUsd", "setLast7DaysMeanSpendUsd", "last30DaysMedianSpendUsd", "setLast30DaysMedianSpendUsd", "last30DaysMeanSpendUsd", "setLast30DaysMeanSpendUsd", "last7DaysUserPltvUsd", "setLast7DaysUserPltvUsd", "last7DaysUserLtvUsd", "setLast7DaysUserLtvUsd", "last30DaysUserPltvUsd", "setLast30DaysUserPltvUsd", "last30DaysUserLtvUsd", "setLast30DaysUserLtvUsd", "last7DaysPlacementFillRate", "setLast7DaysPlacementFillRate", "last30DaysPlacementFillRate", "setLast30DaysPlacementFillRate", "Ljava/lang/Float;", "getIaaRevenueUSD$annotations", "()V", "getIapRevenueUSD$annotations", "getTotalRevenueUSD$annotations", "Ljava/lang/Boolean;", "isUserAPurchaser$annotations", "<init>", "", "seen1", "Lwo/r2;", "serializationConstructorMarker", "(ILjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;Lwo/r2;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
@k
public final class Revenue {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private Float iaaRevenueUSD;

    @Nullable
    private Float iapRevenueUSD;

    @Nullable
    private Boolean isUserAPurchaser;

    @Nullable
    private Float totalRevenueUSD;

    /* JADX INFO: compiled from: Revenue.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/fpd/Revenue$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/fpd/Revenue;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<Revenue> serializer() {
            return Revenue$$serializer.INSTANCE;
        }
    }

    public Revenue() {
    }

    public /* synthetic */ Revenue(int i10, Float f10, Float f11, Float f12, Boolean bool, r2 r2Var) {
        if ((i10 & 0) != 0) {
            c2.a(i10, 0, Revenue$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.iaaRevenueUSD = null;
        } else {
            this.iaaRevenueUSD = f10;
        }
        if ((i10 & 2) == 0) {
            this.iapRevenueUSD = null;
        } else {
            this.iapRevenueUSD = f11;
        }
        if ((i10 & 4) == 0) {
            this.totalRevenueUSD = null;
        } else {
            this.totalRevenueUSD = f12;
        }
        if ((i10 & 8) == 0) {
            this.isUserAPurchaser = null;
        } else {
            this.isUserAPurchaser = bool;
        }
    }

    private static /* synthetic */ void getIaaRevenueUSD$annotations() {
    }

    private static /* synthetic */ void getIapRevenueUSD$annotations() {
    }

    private static /* synthetic */ void getTotalRevenueUSD$annotations() {
    }

    private static /* synthetic */ void isUserAPurchaser$annotations() {
    }

    public static final void write$Self(@NotNull Revenue revenue, @NotNull d dVar, @NotNull SerialDescriptor serialDescriptor) {
        p.k(revenue, "self");
        p.k(dVar, "output");
        p.k(serialDescriptor, "serialDesc");
        if (dVar.r(serialDescriptor, 0) || revenue.iaaRevenueUSD != null) {
            dVar.f(serialDescriptor, 0, l0.f86565a, revenue.iaaRevenueUSD);
        }
        if (dVar.r(serialDescriptor, 1) || revenue.iapRevenueUSD != null) {
            dVar.f(serialDescriptor, 1, l0.f86565a, revenue.iapRevenueUSD);
        }
        if (dVar.r(serialDescriptor, 2) || revenue.totalRevenueUSD != null) {
            dVar.f(serialDescriptor, 2, l0.f86565a, revenue.totalRevenueUSD);
        }
        if (dVar.r(serialDescriptor, 3) || revenue.isUserAPurchaser != null) {
            dVar.f(serialDescriptor, 3, wo.i.f86540a, revenue.isUserAPurchaser);
        }
    }

    @NotNull
    public final Revenue setEarningsByPlacement(float earningsByPlacement) {
        return this;
    }

    @NotNull
    public final Revenue setIAARevenueUSD(float iaaRevenueUSD) {
        if (RangeUtil.isInRange$default(RangeUtil.INSTANCE, iaaRevenueUSD, 0.0f, 0.0f, 4, (Object) null)) {
            this.iaaRevenueUSD = Float.valueOf(iaaRevenueUSD);
        }
        return this;
    }

    @NotNull
    public final Revenue setIAPRevenueUSD(float iapRevenueUSD) {
        if (RangeUtil.isInRange$default(RangeUtil.INSTANCE, iapRevenueUSD, 0.0f, 0.0f, 4, (Object) null)) {
            this.iapRevenueUSD = Float.valueOf(iapRevenueUSD);
        }
        return this;
    }

    @NotNull
    public final Revenue setIsUserAPurchaser(boolean isUserAPurchaser) {
        this.isUserAPurchaser = Boolean.valueOf(isUserAPurchaser);
        return this;
    }

    @NotNull
    public final Revenue setIsUserASubscriber(boolean isUserASubscriber) {
        return this;
    }

    @NotNull
    public final Revenue setLast30DaysMeanSpendUsd(float last30DaysMeanSpendUsd) {
        return this;
    }

    @NotNull
    public final Revenue setLast30DaysMedianSpendUsd(float last30DaysMedianSpendUsd) {
        return this;
    }

    @NotNull
    public final Revenue setLast30DaysPlacementFillRate(float last30DaysPlacementFillRate) {
        return this;
    }

    @NotNull
    public final Revenue setLast30DaysTotalSpendUsd(float last30DaysTotalSpendUsd) {
        return this;
    }

    @NotNull
    public final Revenue setLast30DaysUserLtvUsd(float last30DaysUserLtvUsd) {
        return this;
    }

    @NotNull
    public final Revenue setLast30DaysUserPltvUsd(float last30DaysUserPltvUsd) {
        return this;
    }

    @NotNull
    public final Revenue setLast7DaysMeanSpendUsd(float last7DaysMeanSpendUsd) {
        return this;
    }

    @NotNull
    public final Revenue setLast7DaysMedianSpendUsd(float last7DaysMedianSpendUsd) {
        return this;
    }

    @NotNull
    public final Revenue setLast7DaysPlacementFillRate(float last7DaysPlacementFillRate) {
        return this;
    }

    @NotNull
    public final Revenue setLast7DaysTotalSpendUsd(float last7DaysTotalSpendUsd) {
        return this;
    }

    @NotNull
    public final Revenue setLast7DaysUserLtvUsd(float last7DaysUserLtvUsd) {
        return this;
    }

    @NotNull
    public final Revenue setLast7DaysUserPltvUsd(float last7DaysUserPltvUsd) {
        return this;
    }

    @NotNull
    public final Revenue setTopNAdomain(@Nullable List<String> topNAdomain) {
        return this;
    }

    @NotNull
    public final Revenue setTotalEarningsUsd(float totalEarningsUsd) {
        return this;
    }

    @NotNull
    public final Revenue setTotalRevenueUSD(float totalRevenueUSD) {
        if (RangeUtil.isInRange$default(RangeUtil.INSTANCE, totalRevenueUSD, 0.0f, 0.0f, 4, (Object) null)) {
            this.totalRevenueUSD = Float.valueOf(totalRevenueUSD);
        }
        return this;
    }
}
