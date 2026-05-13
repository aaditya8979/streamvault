package s2;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.UUID;
import k2.t;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: SessionInfo.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\u0006B'\b\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b)\u0010*J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR$\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u0011\u0010\u001bR$\u0010\u001e\u001a\u0004\u0018\u00010\u00058F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0007\u001a\u0004\b\u000b\u0010\t\"\u0004\b\u001d\u0010\u000eR$\u0010&\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0011\u0010(\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b \u0010'¨\u0006+"}, d2 = {"Ls2/l;", "", "Lbn/r;", "h", InneractiveMediationDefs.GENDER_MALE, "", "a", "Ljava/lang/Long;", "getSessionStartTime", "()Ljava/lang/Long;", "sessionStartTime", "b", "e", CampaignEx.JSON_KEY_AD_K, "(Ljava/lang/Long;)V", "sessionLastEventTime", "Ljava/util/UUID;", "c", "Ljava/util/UUID;", "d", "()Ljava/util/UUID;", "j", "(Ljava/util/UUID;)V", JsonStorageKeyNames.SESSION_ID_KEY, "", "<set-?>", "I", "()I", "interruptionCount", "i", "diskRestoreTime", "Ls2/n;", InneractiveMediationDefs.GENDER_FEMALE, "Ls2/n;", "g", "()Ls2/n;", "l", "(Ls2/n;)V", "sourceApplicationInfo", "()J", "sessionLength", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/util/UUID;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class l {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Long sessionStartTime;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Long sessionLastEventTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public UUID sessionId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int interruptionCount;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Long diskRestoreTime;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public n sourceApplicationInfo;

    /* JADX INFO: renamed from: s2.l$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SessionInfo.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\b¨\u0006\u000e"}, d2 = {"Ls2/l$a;", "", "Ls2/l;", "b", "Lbn/r;", "a", "", "INTERRUPTION_COUNT_KEY", "Ljava/lang/String;", "LAST_SESSION_INFO_END_KEY", "LAST_SESSION_INFO_START_KEY", "SESSION_ID_KEY", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(tn.i iVar) {
            this();
        }

        public final void a() {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(t.l()).edit();
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
            editorEdit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionId");
            editorEdit.apply();
            n.INSTANCE.a();
        }

        @Nullable
        public final l b() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(t.l());
            long j10 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
            long j11 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
            String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
            if (j10 == 0 || j11 == 0 || string == null) {
                return null;
            }
            l lVar = new l(Long.valueOf(j10), Long.valueOf(j11), null, 4, null);
            lVar.interruptionCount = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
            lVar.l(n.INSTANCE.b());
            lVar.i(Long.valueOf(System.currentTimeMillis()));
            UUID uuidFromString = UUID.fromString(string);
            p.j(uuidFromString, "fromString(sessionIDStr)");
            lVar.j(uuidFromString);
            return lVar;
        }
    }

    public l(@Nullable Long l10, @Nullable Long l11, @NotNull UUID uuid) {
        p.k(uuid, JsonStorageKeyNames.SESSION_ID_KEY);
        this.sessionStartTime = l10;
        this.sessionLastEventTime = l11;
        this.sessionId = uuid;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ l(Long l10, Long l11, UUID uuid, int i10, tn.i iVar) {
        if ((i10 & 4) != 0) {
            uuid = UUID.randomUUID();
            p.j(uuid, "randomUUID()");
        }
        this(l10, l11, uuid);
    }

    @Nullable
    public final Long b() {
        Long l10 = this.diskRestoreTime;
        if (l10 == null) {
            return 0L;
        }
        return l10;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getInterruptionCount() {
        return this.interruptionCount;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final UUID getSessionId() {
        return this.sessionId;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getSessionLastEventTime() {
        return this.sessionLastEventTime;
    }

    public final long f() {
        Long l10;
        if (this.sessionStartTime == null || (l10 = this.sessionLastEventTime) == null) {
            return 0L;
        }
        if (l10 != null) {
            return l10.longValue() - this.sessionStartTime.longValue();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final n getSourceApplicationInfo() {
        return this.sourceApplicationInfo;
    }

    public final void h() {
        this.interruptionCount++;
    }

    public final void i(@Nullable Long l10) {
        this.diskRestoreTime = l10;
    }

    public final void j(@NotNull UUID uuid) {
        p.k(uuid, "<set-?>");
        this.sessionId = uuid;
    }

    public final void k(@Nullable Long l10) {
        this.sessionLastEventTime = l10;
    }

    public final void l(@Nullable n nVar) {
        this.sourceApplicationInfo = nVar;
    }

    public final void m() {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(t.l()).edit();
        Long l10 = this.sessionStartTime;
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", l10 == null ? 0L : l10.longValue());
        Long l11 = this.sessionLastEventTime;
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", l11 != null ? l11.longValue() : 0L);
        editorEdit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.interruptionCount);
        editorEdit.putString("com.facebook.appevents.SessionInfo.sessionId", this.sessionId.toString());
        editorEdit.apply();
        n nVar = this.sourceApplicationInfo;
        if (nVar == null || nVar == null) {
            return;
        }
        nVar.a();
    }
}
