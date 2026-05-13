package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import androidx.annotation.RequiresApi;
import cn.w;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: DeletionRequest.kt */
/* JADX INFO: loaded from: classes7.dex */
@RequiresApi(33)
public final class DeletionRequest {

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int DELETION_MODE_ALL = 0;
    public static final int DELETION_MODE_EXCLUDE_INTERNAL_DATA = 1;
    public static final int MATCH_BEHAVIOR_DELETE = 0;
    public static final int MATCH_BEHAVIOR_PRESERVE = 1;
    private final int deletionMode;

    @NotNull
    private final List<Uri> domainUris;

    @NotNull
    private final Instant end;
    private final int matchBehavior;

    @NotNull
    private final List<Uri> originUris;

    @NotNull
    private final Instant start;

    /* JADX INFO: compiled from: DeletionRequest.kt */
    @RequiresApi(33)
    public static final class Builder {
        private final int deletionMode;

        @NotNull
        private List<? extends Uri> domainUris;

        @NotNull
        private Instant end;
        private final int matchBehavior;

        @NotNull
        private List<? extends Uri> originUris;

        @NotNull
        private Instant start;

        public Builder(int i10, int i11) {
            this.deletionMode = i10;
            this.matchBehavior = i11;
            Instant instant = Instant.MIN;
            p.j(instant, "MIN");
            this.start = instant;
            Instant instant2 = Instant.MAX;
            p.j(instant2, "MAX");
            this.end = instant2;
            this.domainUris = w.m();
            this.originUris = w.m();
        }

        @NotNull
        public final DeletionRequest build() {
            return new DeletionRequest(this.deletionMode, this.matchBehavior, this.start, this.end, this.domainUris, this.originUris);
        }

        @NotNull
        public final Builder setDomainUris(@NotNull List<? extends Uri> list) {
            p.k(list, "domainUris");
            this.domainUris = list;
            return this;
        }

        @NotNull
        public final Builder setEnd(@NotNull Instant instant) {
            p.k(instant, "end");
            this.end = instant;
            return this;
        }

        @NotNull
        public final Builder setOriginUris(@NotNull List<? extends Uri> list) {
            p.k(list, "originUris");
            this.originUris = list;
            return this;
        }

        @NotNull
        public final Builder setStart(@NotNull Instant instant) {
            p.k(instant, "start");
            this.start = instant;
            return this;
        }
    }

    /* JADX INFO: compiled from: DeletionRequest.kt */
    public static final class Companion {

        /* JADX INFO: compiled from: DeletionRequest.kt */
        @Retention(RetentionPolicy.SOURCE)
        public @interface DeletionMode {
        }

        /* JADX INFO: compiled from: DeletionRequest.kt */
        @Retention(RetentionPolicy.SOURCE)
        public @interface MatchBehavior {
        }

        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeletionRequest(int i10, int i11, @NotNull Instant instant, @NotNull Instant instant2, @NotNull List<? extends Uri> list, @NotNull List<? extends Uri> list2) {
        p.k(instant, "start");
        p.k(instant2, "end");
        p.k(list, "domainUris");
        p.k(list2, "originUris");
        this.deletionMode = i10;
        this.matchBehavior = i11;
        this.start = instant;
        this.end = instant2;
        this.domainUris = list;
        this.originUris = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DeletionRequest(int i10, int i11, Instant instant, Instant instant2, List list, List list2, int i12, i iVar) {
        if ((i12 & 4) != 0) {
            instant = Instant.MIN;
            p.j(instant, "MIN");
        }
        Instant instant3 = instant;
        if ((i12 & 8) != 0) {
            instant2 = Instant.MAX;
            p.j(instant2, "MAX");
        }
        this(i10, i11, instant3, instant2, (i12 & 16) != 0 ? w.m() : list, (i12 & 32) != 0 ? w.m() : list2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeletionRequest)) {
            return false;
        }
        DeletionRequest deletionRequest = (DeletionRequest) obj;
        return this.deletionMode == deletionRequest.deletionMode && p.f(new HashSet(this.domainUris), new HashSet(deletionRequest.domainUris)) && p.f(new HashSet(this.originUris), new HashSet(deletionRequest.originUris)) && p.f(this.start, deletionRequest.start) && p.f(this.end, deletionRequest.end) && this.matchBehavior == deletionRequest.matchBehavior;
    }

    public final int getDeletionMode() {
        return this.deletionMode;
    }

    @NotNull
    public final List<Uri> getDomainUris() {
        return this.domainUris;
    }

    @NotNull
    public final Instant getEnd() {
        return this.end;
    }

    public final int getMatchBehavior() {
        return this.matchBehavior;
    }

    @NotNull
    public final List<Uri> getOriginUris() {
        return this.originUris;
    }

    @NotNull
    public final Instant getStart() {
        return this.start;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.deletionMode) * 31) + this.domainUris.hashCode()) * 31) + this.originUris.hashCode()) * 31) + this.start.hashCode()) * 31) + this.end.hashCode()) * 31) + Integer.hashCode(this.matchBehavior);
    }

    @NotNull
    public String toString() {
        return "DeletionRequest { DeletionMode=" + (this.deletionMode == 0 ? "DELETION_MODE_ALL" : "DELETION_MODE_EXCLUDE_INTERNAL_DATA") + ", MatchBehavior=" + (this.matchBehavior == 0 ? "MATCH_BEHAVIOR_DELETE" : "MATCH_BEHAVIOR_PRESERVE") + ", Start=" + this.start + ", End=" + this.end + ", DomainUris=" + this.domainUris + ", OriginUris=" + this.originUris + " }";
    }
}
