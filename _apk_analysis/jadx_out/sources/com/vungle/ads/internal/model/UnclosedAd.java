package com.vungle.ads.internal.model;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import io.bidmachine.iab.vast.tags.VastTagName;
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
import wo.r2;

/* JADX INFO: compiled from: UnclosedAd.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0019\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fB3\b\u0017\u0012\u0006\u0010 \u001a\u00020\f\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000eHÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000eHÆ\u0001J\t\u0010\u0014\u001a\u00020\u000eHÖ\u0001R \u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u0012\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010\u0015\u0012\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u001c¨\u0006&"}, d2 = {"Lcom/vungle/ads/internal/model/UnclosedAd;", "", "self", "Lvo/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lbn/r;", "write$Self", "other", "", "equals", "", "hashCode", "", "component1", "component2", "eventId", JsonStorageKeyNames.SESSION_ID_KEY, "copy", "toString", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "getEventId$annotations", "()V", "getSessionId", "setSessionId", "(Ljava/lang/String;)V", "getSessionId$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lwo/r2;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lwo/r2;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
@k
public final /* data */ class UnclosedAd {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String eventId;

    @NotNull
    private String sessionId;

    /* JADX INFO: compiled from: UnclosedAd.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/UnclosedAd$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/UnclosedAd;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<UnclosedAd> serializer() {
            return UnclosedAd$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UnclosedAd(int i10, String str, String str2, r2 r2Var) {
        if (1 != (i10 & 1)) {
            c2.a(i10, 1, UnclosedAd$$serializer.INSTANCE.getDescriptor());
        }
        this.eventId = str;
        if ((i10 & 2) == 0) {
            this.sessionId = "";
        } else {
            this.sessionId = str2;
        }
    }

    public UnclosedAd(@NotNull String str, @NotNull String str2) {
        p.k(str, "eventId");
        p.k(str2, JsonStorageKeyNames.SESSION_ID_KEY);
        this.eventId = str;
        this.sessionId = str2;
    }

    public /* synthetic */ UnclosedAd(String str, String str2, int i10, i iVar) {
        this(str, (i10 & 2) != 0 ? "" : str2);
    }

    public static /* synthetic */ UnclosedAd copy$default(UnclosedAd unclosedAd, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = unclosedAd.eventId;
        }
        if ((i10 & 2) != 0) {
            str2 = unclosedAd.sessionId;
        }
        return unclosedAd.copy(str, str2);
    }

    public static /* synthetic */ void getEventId$annotations() {
    }

    public static /* synthetic */ void getSessionId$annotations() {
    }

    public static final void write$Self(@NotNull UnclosedAd unclosedAd, @NotNull d dVar, @NotNull SerialDescriptor serialDescriptor) {
        p.k(unclosedAd, "self");
        p.k(dVar, "output");
        p.k(serialDescriptor, "serialDesc");
        dVar.q(serialDescriptor, 0, unclosedAd.eventId);
        if (dVar.r(serialDescriptor, 1) || !p.f(unclosedAd.sessionId, "")) {
            dVar.q(serialDescriptor, 1, unclosedAd.sessionId);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final UnclosedAd copy(@NotNull String eventId, @NotNull String sessionId) {
        p.k(eventId, "eventId");
        p.k(sessionId, JsonStorageKeyNames.SESSION_ID_KEY);
        return new UnclosedAd(eventId, sessionId);
    }

    public boolean equals(@Nullable Object other) {
        if (other == null || !p.f(UnclosedAd.class, other.getClass())) {
            return false;
        }
        UnclosedAd unclosedAd = (UnclosedAd) other;
        return p.f(this.eventId, unclosedAd.eventId) && p.f(this.sessionId, unclosedAd.sessionId);
    }

    @NotNull
    public final String getEventId() {
        return this.eventId;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return (this.eventId.hashCode() * 31) + this.sessionId.hashCode();
    }

    public final void setSessionId(@NotNull String str) {
        p.k(str, "<set-?>");
        this.sessionId = str;
    }

    @NotNull
    public String toString() {
        return "UnclosedAd(eventId=" + this.eventId + ", sessionId=" + this.sessionId + ')';
    }
}
