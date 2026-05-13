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

/* JADX INFO: compiled from: SessionContext.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 -2\u00020\u0001:\u0002.-B\u0007¢\u0006\u0004\b(\u0010'B'\b\u0017\u0012\u0006\u0010)\u001a\u00020\u000f\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b(\u0010,J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0007J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000fH\u0007J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\tH\u0007J\u0010\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\fH\u0007J\u0018\u0010\u001a\u001a\u00020\u00002\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0018H\u0007J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\tH\u0007J\u0010\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\tH\u0007J\u0010\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u000fH\u0007J\u0010\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u000fH\u0007J\u0010\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\tH\u0007R\u001e\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\n\u0010%\u0012\u0004\b&\u0010'¨\u0006/"}, d2 = {"Lcom/vungle/ads/fpd/SessionContext;", "", "self", "Lvo/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lbn/r;", "write$Self", "", "levelPercentile", "setLevelPercentile", "", "page", "setPage", "", "timeSpent", "setTimeSpent", "signupDate", "setSignupDate", "userScorePercentile", "setUserScorePercentile", "userID", "setUserID", "", "friends", "setFriends", "userLevelPercentile", "setUserLevelPercentile", "healthPercentile", "setHealthPercentile", "sessionStartTime", "setSessionStartTime", "sessionDuration", "setSessionDuration", "inGamePurchasesUSD", "setInGamePurchasesUSD", "Ljava/lang/Float;", "getLevelPercentile$annotations", "()V", "<init>", "seen1", "Lwo/r2;", "serializationConstructorMarker", "(ILjava/lang/Float;Lwo/r2;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
@k
public final class SessionContext {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private Float levelPercentile;

    /* JADX INFO: compiled from: SessionContext.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/fpd/SessionContext$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/fpd/SessionContext;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<SessionContext> serializer() {
            return SessionContext$$serializer.INSTANCE;
        }
    }

    public SessionContext() {
    }

    public /* synthetic */ SessionContext(int i10, Float f10, r2 r2Var) {
        if ((i10 & 0) != 0) {
            c2.a(i10, 0, SessionContext$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.levelPercentile = null;
        } else {
            this.levelPercentile = f10;
        }
    }

    private static /* synthetic */ void getLevelPercentile$annotations() {
    }

    public static final void write$Self(@NotNull SessionContext sessionContext, @NotNull d dVar, @NotNull SerialDescriptor serialDescriptor) {
        p.k(sessionContext, "self");
        p.k(dVar, "output");
        p.k(serialDescriptor, "serialDesc");
        boolean z10 = true;
        if (!dVar.r(serialDescriptor, 0) && sessionContext.levelPercentile == null) {
            z10 = false;
        }
        if (z10) {
            dVar.f(serialDescriptor, 0, l0.f86565a, sessionContext.levelPercentile);
        }
    }

    @NotNull
    public final SessionContext setFriends(@Nullable List<String> friends) {
        return this;
    }

    @NotNull
    public final SessionContext setHealthPercentile(float healthPercentile) {
        return this;
    }

    @NotNull
    public final SessionContext setInGamePurchasesUSD(float inGamePurchasesUSD) {
        return this;
    }

    @NotNull
    public final SessionContext setLevelPercentile(float levelPercentile) {
        if (RangeUtil.INSTANCE.isInRange(levelPercentile, 0.0f, 100.0f)) {
            this.levelPercentile = Float.valueOf(levelPercentile);
        }
        return this;
    }

    @NotNull
    public final SessionContext setPage(@NotNull String page) {
        p.k(page, "page");
        return this;
    }

    @NotNull
    public final SessionContext setSessionDuration(int sessionDuration) {
        return this;
    }

    @NotNull
    public final SessionContext setSessionStartTime(int sessionStartTime) {
        return this;
    }

    @NotNull
    public final SessionContext setSignupDate(int signupDate) {
        return this;
    }

    @NotNull
    public final SessionContext setTimeSpent(int timeSpent) {
        return this;
    }

    @NotNull
    public final SessionContext setUserID(@NotNull String userID) {
        p.k(userID, "userID");
        return this;
    }

    @NotNull
    public final SessionContext setUserLevelPercentile(float userLevelPercentile) {
        return this;
    }

    @NotNull
    public final SessionContext setUserScorePercentile(float userScorePercentile) {
        return this;
    }
}
