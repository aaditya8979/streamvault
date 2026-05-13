package androidx.work.impl.model;

import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.room.Relation;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkRequest;
import cn.x;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;
import zn.n;

/* JADX INFO: compiled from: WorkSpec.kt */
/* JADX INFO: loaded from: classes12.dex */
@Entity(indices = {@Index({"schedule_requested_at"}), @Index({"last_enqueue_time"})})
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b3\b\u0087\b\u0018\u0000 T2\u00020\u0001:\u0003TUVBÍ\u0001\u0012\u0006\u0010(\u001a\u00020\f\u0012\b\b\u0002\u0010)\u001a\u00020\u000f\u0012\u0006\u0010*\u001a\u00020\f\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010,\u001a\u00020\u0013\u0012\b\b\u0002\u0010-\u001a\u00020\u0013\u0012\b\b\u0002\u0010.\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010/\u001a\u00020\u0019\u0012\b\b\u0003\u00100\u001a\u00020\u001b\u0012\b\b\u0002\u00101\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u00102\u001a\u00020\u0002\u0012\b\b\u0002\u00103\u001a\u00020\u0002\u0012\b\b\u0002\u00104\u001a\u00020\u0002\u0012\b\b\u0002\u00105\u001a\u00020\n\u0012\b\b\u0002\u00106\u001a\u00020$\u0012\b\b\u0002\u00107\u001a\u00020\u001b\u0012\b\b\u0002\u00108\u001a\u00020\u001b¢\u0006\u0004\bN\u0010OB\u0019\b\u0016\u0012\u0006\u0010(\u001a\u00020\f\u0012\u0006\u0010P\u001a\u00020\f¢\u0006\u0004\bN\u0010QB\u0019\b\u0016\u0012\u0006\u0010R\u001a\u00020\f\u0012\u0006\u0010;\u001a\u00020\u0000¢\u0006\u0004\bN\u0010SJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\r\u001a\u00020\fH\u0016J\t\u0010\u000e\u001a\u00020\fHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J\t\u0010\u0011\u001a\u00020\fHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010\u0014\u001a\u00020\u0013HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0013HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0002HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0019HÆ\u0003J\t\u0010\u001c\u001a\u00020\u001bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u001dHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0002HÆ\u0003J\t\u0010 \u001a\u00020\u0002HÆ\u0003J\t\u0010!\u001a\u00020\u0002HÆ\u0003J\t\u0010\"\u001a\u00020\u0002HÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020$HÆ\u0003J\t\u0010&\u001a\u00020\u001bHÆ\u0003J\t\u0010'\u001a\u00020\u001bHÆ\u0003JÓ\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010(\u001a\u00020\f2\b\b\u0002\u0010)\u001a\u00020\u000f2\b\b\u0002\u0010*\u001a\u00020\f2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010,\u001a\u00020\u00132\b\b\u0002\u0010-\u001a\u00020\u00132\b\b\u0002\u0010.\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010/\u001a\u00020\u00192\b\b\u0003\u00100\u001a\u00020\u001b2\b\b\u0002\u00101\u001a\u00020\u001d2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u00102\u001a\u00020\u00022\b\b\u0002\u00103\u001a\u00020\u00022\b\b\u0002\u00104\u001a\u00020\u00022\b\b\u0002\u00105\u001a\u00020\n2\b\b\u0002\u00106\u001a\u00020$2\b\b\u0002\u00107\u001a\u00020\u001b2\b\b\u0002\u00108\u001a\u00020\u001bHÆ\u0001J\t\u0010:\u001a\u00020\u001bHÖ\u0001J\u0013\u0010<\u001a\u00020\n2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0014\u0010(\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010=R\u0016\u0010)\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b)\u0010>R\u0016\u0010*\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b*\u0010=R\u0018\u0010+\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b+\u0010=R\u0016\u0010,\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b,\u0010?R\u0016\u0010-\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b-\u0010?R\u0016\u0010.\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b.\u0010@R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010@R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\b\u0010@R\u0016\u0010/\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b/\u0010AR\u0016\u00100\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b0\u0010BR\u0016\u00101\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b1\u0010CR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010@R\u0016\u00102\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b2\u0010@R\u0016\u00103\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b3\u0010@R\u0016\u00104\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b4\u0010@R\u0016\u00105\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b5\u0010DR\u0016\u00106\u001a\u00020$8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b6\u0010ER\"\u00107\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u0010B\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001a\u00108\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010B\u001a\u0004\bJ\u0010GR\u0011\u0010K\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0011\u0010M\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bM\u0010L¨\u0006W"}, d2 = {"Landroidx/work/impl/model/WorkSpec;", "", "", "backoffDelayDuration", "Lbn/r;", "setBackoffDelayDuration", "intervalDuration", "setPeriodic", "flexDuration", "calculateNextRunTime", "", "hasConstraints", "", "toString", "component1", "Landroidx/work/WorkInfo$State;", "component2", "component3", "component4", "Landroidx/work/Data;", "component5", "component6", "component7", "component8", "component9", "Landroidx/work/Constraints;", "component10", "", "component11", "Landroidx/work/BackoffPolicy;", "component12", "component13", "component14", "component15", "component16", "component17", "Landroidx/work/OutOfQuotaPolicy;", "component18", "component19", "component20", "id", "state", "workerClassName", "inputMergerClassName", "input", "output", "initialDelay", "constraints", "runAttemptCount", "backoffPolicy", "lastEnqueueTime", "minimumRetentionDuration", "scheduleRequestedAt", "expedited", "outOfQuotaPolicy", "periodCount", "generation", "copy", "hashCode", "other", "equals", "Ljava/lang/String;", "Landroidx/work/WorkInfo$State;", "Landroidx/work/Data;", "J", "Landroidx/work/Constraints;", "I", "Landroidx/work/BackoffPolicy;", "Z", "Landroidx/work/OutOfQuotaPolicy;", "getPeriodCount", "()I", "setPeriodCount", "(I)V", "getGeneration", "isPeriodic", "()Z", "isBackedOff", "<init>", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;Ljava/lang/String;Ljava/lang/String;Landroidx/work/Data;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJJJZLandroidx/work/OutOfQuotaPolicy;II)V", "workerClassName_", "(Ljava/lang/String;Ljava/lang/String;)V", "newId", "(Ljava/lang/String;Landroidx/work/impl/model/WorkSpec;)V", VastTagName.COMPANION, "IdAndState", "WorkInfoPojo", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final /* data */ class WorkSpec {
    public static final long SCHEDULE_NOT_REQUESTED_YET = -1;

    @NotNull
    private static final String TAG;

    @NotNull
    public static final Function<List<WorkInfoPojo>, List<WorkInfo>> WORK_INFO_MAPPER;

    @ColumnInfo(name = "backoff_delay_duration")
    public long backoffDelayDuration;

    @ColumnInfo(name = "backoff_policy")
    @NotNull
    public BackoffPolicy backoffPolicy;

    @Embedded
    @NotNull
    public Constraints constraints;

    @ColumnInfo(name = "run_in_foreground")
    public boolean expedited;

    @ColumnInfo(name = "flex_duration")
    public long flexDuration;

    @ColumnInfo(defaultValue = "0")
    private final int generation;

    @PrimaryKey
    @ColumnInfo(name = "id")
    @NotNull
    public final String id;

    @ColumnInfo(name = "initial_delay")
    public long initialDelay;

    @ColumnInfo(name = "input")
    @NotNull
    public Data input;

    @ColumnInfo(name = "input_merger_class_name")
    @Nullable
    public String inputMergerClassName;

    @ColumnInfo(name = "interval_duration")
    public long intervalDuration;

    @ColumnInfo(name = "last_enqueue_time")
    public long lastEnqueueTime;

    @ColumnInfo(name = "minimum_retention_duration")
    public long minimumRetentionDuration;

    @ColumnInfo(name = "out_of_quota_policy")
    @NotNull
    public OutOfQuotaPolicy outOfQuotaPolicy;

    @ColumnInfo(name = "output")
    @NotNull
    public Data output;

    @ColumnInfo(defaultValue = "0", name = "period_count")
    private int periodCount;

    @ColumnInfo(name = "run_attempt_count")
    public int runAttemptCount;

    @ColumnInfo(name = "schedule_requested_at")
    public long scheduleRequestedAt;

    @ColumnInfo(name = "state")
    @NotNull
    public WorkInfo.State state;

    @ColumnInfo(name = "worker_class_name")
    @NotNull
    public String workerClassName;

    /* JADX INFO: compiled from: WorkSpec.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/work/impl/model/WorkSpec$IdAndState;", "", "id", "", "state", "Landroidx/work/WorkInfo$State;", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class IdAndState {

        @ColumnInfo(name = "id")
        @NotNull
        public String id;

        @ColumnInfo(name = "state")
        @NotNull
        public WorkInfo.State state;

        public IdAndState(@NotNull String str, @NotNull WorkInfo.State state) {
            p.k(str, "id");
            p.k(state, "state");
            this.id = str;
            this.state = state;
        }

        public static /* synthetic */ IdAndState copy$default(IdAndState idAndState, String str, WorkInfo.State state, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = idAndState.id;
            }
            if ((i10 & 2) != 0) {
                state = idAndState.state;
            }
            return idAndState.copy(str, state);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final WorkInfo.State getState() {
            return this.state;
        }

        @NotNull
        public final IdAndState copy(@NotNull String id2, @NotNull WorkInfo.State state) {
            p.k(id2, "id");
            p.k(state, "state");
            return new IdAndState(id2, state);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IdAndState)) {
                return false;
            }
            IdAndState idAndState = (IdAndState) other;
            return p.f(this.id, idAndState.id) && this.state == idAndState.state;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.state.hashCode();
        }

        @NotNull
        public String toString() {
            return "IdAndState(id=" + this.id + ", state=" + this.state + ')';
        }
    }

    /* JADX INFO: compiled from: WorkSpec.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0002\u0010\u000eJ\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\fHÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070\fHÆ\u0003J[\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\fHÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\tHÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001J\u0006\u00103\u001a\u000204R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u001fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001c¨\u00065"}, d2 = {"Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "", "id", "", "state", "Landroidx/work/WorkInfo$State;", "output", "Landroidx/work/Data;", "runAttemptCount", "", "generation", "tags", "", "progress", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;Landroidx/work/Data;IILjava/util/List;Ljava/util/List;)V", "getGeneration", "()I", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getOutput", "()Landroidx/work/Data;", "setOutput", "(Landroidx/work/Data;)V", "getProgress", "()Ljava/util/List;", "setProgress", "(Ljava/util/List;)V", "getRunAttemptCount", "setRunAttemptCount", "(I)V", "getState", "()Landroidx/work/WorkInfo$State;", "setState", "(Landroidx/work/WorkInfo$State;)V", "getTags", "setTags", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "toWorkInfo", "Landroidx/work/WorkInfo;", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class WorkInfoPojo {

        @ColumnInfo(name = "generation")
        private final int generation;

        @ColumnInfo(name = "id")
        @NotNull
        private String id;

        @ColumnInfo(name = "output")
        @NotNull
        private Data output;

        @Relation(entity = WorkProgress.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {"progress"})
        @NotNull
        private List<Data> progress;

        @ColumnInfo(name = "run_attempt_count")
        private int runAttemptCount;

        @ColumnInfo(name = "state")
        @NotNull
        private WorkInfo.State state;

        @Relation(entity = WorkTag.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {"tag"})
        @NotNull
        private List<String> tags;

        public WorkInfoPojo(@NotNull String str, @NotNull WorkInfo.State state, @NotNull Data data, int i10, int i11, @NotNull List<String> list, @NotNull List<Data> list2) {
            p.k(str, "id");
            p.k(state, "state");
            p.k(data, "output");
            p.k(list, "tags");
            p.k(list2, "progress");
            this.id = str;
            this.state = state;
            this.output = data;
            this.runAttemptCount = i10;
            this.generation = i11;
            this.tags = list;
            this.progress = list2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WorkInfoPojo copy$default(WorkInfoPojo workInfoPojo, String str, WorkInfo.State state, Data data, int i10, int i11, List list, List list2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = workInfoPojo.id;
            }
            if ((i12 & 2) != 0) {
                state = workInfoPojo.state;
            }
            WorkInfo.State state2 = state;
            if ((i12 & 4) != 0) {
                data = workInfoPojo.output;
            }
            Data data2 = data;
            if ((i12 & 8) != 0) {
                i10 = workInfoPojo.runAttemptCount;
            }
            int i13 = i10;
            if ((i12 & 16) != 0) {
                i11 = workInfoPojo.generation;
            }
            int i14 = i11;
            if ((i12 & 32) != 0) {
                list = workInfoPojo.tags;
            }
            List list3 = list;
            if ((i12 & 64) != 0) {
                list2 = workInfoPojo.progress;
            }
            return workInfoPojo.copy(str, state2, data2, i13, i14, list3, list2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final WorkInfo.State getState() {
            return this.state;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Data getOutput() {
            return this.output;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getRunAttemptCount() {
            return this.runAttemptCount;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final int getGeneration() {
            return this.generation;
        }

        @NotNull
        public final List<String> component6() {
            return this.tags;
        }

        @NotNull
        public final List<Data> component7() {
            return this.progress;
        }

        @NotNull
        public final WorkInfoPojo copy(@NotNull String id2, @NotNull WorkInfo.State state, @NotNull Data output, int runAttemptCount, int generation, @NotNull List<String> tags, @NotNull List<Data> progress) {
            p.k(id2, "id");
            p.k(state, "state");
            p.k(output, "output");
            p.k(tags, "tags");
            p.k(progress, "progress");
            return new WorkInfoPojo(id2, state, output, runAttemptCount, generation, tags, progress);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WorkInfoPojo)) {
                return false;
            }
            WorkInfoPojo workInfoPojo = (WorkInfoPojo) other;
            return p.f(this.id, workInfoPojo.id) && this.state == workInfoPojo.state && p.f(this.output, workInfoPojo.output) && this.runAttemptCount == workInfoPojo.runAttemptCount && this.generation == workInfoPojo.generation && p.f(this.tags, workInfoPojo.tags) && p.f(this.progress, workInfoPojo.progress);
        }

        public final int getGeneration() {
            return this.generation;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final Data getOutput() {
            return this.output;
        }

        @NotNull
        public final List<Data> getProgress() {
            return this.progress;
        }

        public final int getRunAttemptCount() {
            return this.runAttemptCount;
        }

        @NotNull
        public final WorkInfo.State getState() {
            return this.state;
        }

        @NotNull
        public final List<String> getTags() {
            return this.tags;
        }

        public int hashCode() {
            return (((((((((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.output.hashCode()) * 31) + Integer.hashCode(this.runAttemptCount)) * 31) + Integer.hashCode(this.generation)) * 31) + this.tags.hashCode()) * 31) + this.progress.hashCode();
        }

        public final void setId(@NotNull String str) {
            p.k(str, "<set-?>");
            this.id = str;
        }

        public final void setOutput(@NotNull Data data) {
            p.k(data, "<set-?>");
            this.output = data;
        }

        public final void setProgress(@NotNull List<Data> list) {
            p.k(list, "<set-?>");
            this.progress = list;
        }

        public final void setRunAttemptCount(int i10) {
            this.runAttemptCount = i10;
        }

        public final void setState(@NotNull WorkInfo.State state) {
            p.k(state, "<set-?>");
            this.state = state;
        }

        public final void setTags(@NotNull List<String> list) {
            p.k(list, "<set-?>");
            this.tags = list;
        }

        @NotNull
        public String toString() {
            return "WorkInfoPojo(id=" + this.id + ", state=" + this.state + ", output=" + this.output + ", runAttemptCount=" + this.runAttemptCount + ", generation=" + this.generation + ", tags=" + this.tags + ", progress=" + this.progress + ')';
        }

        @NotNull
        public final WorkInfo toWorkInfo() {
            return new WorkInfo(UUID.fromString(this.id), this.state, this.output, this.tags, this.progress.isEmpty() ^ true ? this.progress.get(0) : Data.EMPTY, this.runAttemptCount, this.generation);
        }
    }

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("WorkSpec");
        p.j(strTagWithPrefix, "tagWithPrefix(\"WorkSpec\")");
        TAG = strTagWithPrefix;
        WORK_INFO_MAPPER = new Function() { // from class: androidx.work.impl.model.a
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return WorkSpec.WORK_INFO_MAPPER$lambda$1((List) obj);
            }
        };
    }

    public WorkSpec(@NotNull String str, @NotNull WorkInfo.State state, @NotNull String str2, @Nullable String str3, @NotNull Data data, @NotNull Data data2, long j10, long j11, long j12, @NotNull Constraints constraints, @IntRange(from = 0) int i10, @NotNull BackoffPolicy backoffPolicy, long j13, long j14, long j15, long j16, boolean z10, @NotNull OutOfQuotaPolicy outOfQuotaPolicy, int i11, int i12) {
        p.k(str, "id");
        p.k(state, "state");
        p.k(str2, "workerClassName");
        p.k(data, "input");
        p.k(data2, "output");
        p.k(constraints, "constraints");
        p.k(backoffPolicy, "backoffPolicy");
        p.k(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.id = str;
        this.state = state;
        this.workerClassName = str2;
        this.inputMergerClassName = str3;
        this.input = data;
        this.output = data2;
        this.initialDelay = j10;
        this.intervalDuration = j11;
        this.flexDuration = j12;
        this.constraints = constraints;
        this.runAttemptCount = i10;
        this.backoffPolicy = backoffPolicy;
        this.backoffDelayDuration = j13;
        this.lastEnqueueTime = j14;
        this.minimumRetentionDuration = j15;
        this.scheduleRequestedAt = j16;
        this.expedited = z10;
        this.outOfQuotaPolicy = outOfQuotaPolicy;
        this.periodCount = i11;
        this.generation = i12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WorkSpec(String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j10, long j11, long j12, Constraints constraints, int i10, BackoffPolicy backoffPolicy, long j13, long j14, long j15, long j16, boolean z10, OutOfQuotaPolicy outOfQuotaPolicy, int i11, int i12, int i13, i iVar) {
        Data data3;
        Data data4;
        WorkInfo.State state2 = (i13 & 2) != 0 ? WorkInfo.State.ENQUEUED : state;
        String str4 = (i13 & 8) != 0 ? null : str3;
        if ((i13 & 16) != 0) {
            Data data5 = Data.EMPTY;
            p.j(data5, "EMPTY");
            data3 = data5;
        } else {
            data3 = data;
        }
        if ((i13 & 32) != 0) {
            Data data6 = Data.EMPTY;
            p.j(data6, "EMPTY");
            data4 = data6;
        } else {
            data4 = data2;
        }
        this(str, state2, str2, str4, data3, data4, (i13 & 64) != 0 ? 0L : j10, (i13 & 128) != 0 ? 0L : j11, (i13 & 256) != 0 ? 0L : j12, (i13 & 512) != 0 ? Constraints.NONE : constraints, (i13 & 1024) != 0 ? 0 : i10, (i13 & 2048) != 0 ? BackoffPolicy.EXPONENTIAL : backoffPolicy, (i13 & 4096) != 0 ? 30000L : j13, (i13 & 8192) != 0 ? 0L : j14, (i13 & 16384) != 0 ? 0L : j15, (32768 & i13) != 0 ? -1L : j16, (65536 & i13) != 0 ? false : z10, (131072 & i13) != 0 ? OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST : outOfQuotaPolicy, (262144 & i13) != 0 ? 0 : i11, (i13 & 524288) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkSpec(@NotNull String str, @NotNull WorkSpec workSpec) {
        this(str, workSpec.state, workSpec.workerClassName, workSpec.inputMergerClassName, new Data(workSpec.input), new Data(workSpec.output), workSpec.initialDelay, workSpec.intervalDuration, workSpec.flexDuration, new Constraints(workSpec.constraints), workSpec.runAttemptCount, workSpec.backoffPolicy, workSpec.backoffDelayDuration, workSpec.lastEnqueueTime, workSpec.minimumRetentionDuration, workSpec.scheduleRequestedAt, workSpec.expedited, workSpec.outOfQuotaPolicy, workSpec.periodCount, 0, 524288, null);
        p.k(str, "newId");
        p.k(workSpec, "other");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkSpec(@NotNull String str, @NotNull String str2) {
        this(str, null, str2, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 1048570, null);
        p.k(str, "id");
        p.k(str2, "workerClassName_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List WORK_INFO_MAPPER$lambda$1(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(x.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((WorkInfoPojo) it.next()).toWorkInfo());
        }
        return arrayList;
    }

    public final long calculateNextRunTime() {
        if (isBackedOff()) {
            return this.lastEnqueueTime + n.k(this.backoffPolicy == BackoffPolicy.LINEAR ? this.backoffDelayDuration * ((long) this.runAttemptCount) : (long) Math.scalb(this.backoffDelayDuration, this.runAttemptCount - 1), WorkRequest.MAX_BACKOFF_MILLIS);
        }
        if (!isPeriodic()) {
            long jCurrentTimeMillis = this.lastEnqueueTime;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return this.initialDelay + jCurrentTimeMillis;
        }
        int i10 = this.periodCount;
        long j10 = this.lastEnqueueTime;
        if (i10 == 0) {
            j10 += this.initialDelay;
        }
        long j11 = this.flexDuration;
        long j12 = this.intervalDuration;
        if (j11 != j12) {
            j = i10 == 0 ? ((long) (-1)) * j11 : 0L;
            j10 += j12;
        } else if (i10 != 0) {
            j = j12;
        }
        return j10 + j;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Constraints getConstraints() {
        return this.constraints;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getRunAttemptCount() {
        return this.runAttemptCount;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BackoffPolicy getBackoffPolicy() {
        return this.backoffPolicy;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final long getBackoffDelayDuration() {
        return this.backoffDelayDuration;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final long getLastEnqueueTime() {
        return this.lastEnqueueTime;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final long getMinimumRetentionDuration() {
        return this.minimumRetentionDuration;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final long getScheduleRequestedAt() {
        return this.scheduleRequestedAt;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getExpedited() {
        return this.expedited;
    }

    @NotNull
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final OutOfQuotaPolicy getOutOfQuotaPolicy() {
        return this.outOfQuotaPolicy;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getPeriodCount() {
        return this.periodCount;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final WorkInfo.State getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final int getGeneration() {
        return this.generation;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getWorkerClassName() {
        return this.workerClassName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getInputMergerClassName() {
        return this.inputMergerClassName;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Data getInput() {
        return this.input;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Data getOutput() {
        return this.output;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getInitialDelay() {
        return this.initialDelay;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getIntervalDuration() {
        return this.intervalDuration;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getFlexDuration() {
        return this.flexDuration;
    }

    @NotNull
    public final WorkSpec copy(@NotNull String id2, @NotNull WorkInfo.State state, @NotNull String workerClassName, @Nullable String inputMergerClassName, @NotNull Data input, @NotNull Data output, long initialDelay, long intervalDuration, long flexDuration, @NotNull Constraints constraints, @IntRange(from = 0) int runAttemptCount, @NotNull BackoffPolicy backoffPolicy, long backoffDelayDuration, long lastEnqueueTime, long minimumRetentionDuration, long scheduleRequestedAt, boolean expedited, @NotNull OutOfQuotaPolicy outOfQuotaPolicy, int periodCount, int generation) {
        p.k(id2, "id");
        p.k(state, "state");
        p.k(workerClassName, "workerClassName");
        p.k(input, "input");
        p.k(output, "output");
        p.k(constraints, "constraints");
        p.k(backoffPolicy, "backoffPolicy");
        p.k(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new WorkSpec(id2, state, workerClassName, inputMergerClassName, input, output, initialDelay, intervalDuration, flexDuration, constraints, runAttemptCount, backoffPolicy, backoffDelayDuration, lastEnqueueTime, minimumRetentionDuration, scheduleRequestedAt, expedited, outOfQuotaPolicy, periodCount, generation);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkSpec)) {
            return false;
        }
        WorkSpec workSpec = (WorkSpec) other;
        return p.f(this.id, workSpec.id) && this.state == workSpec.state && p.f(this.workerClassName, workSpec.workerClassName) && p.f(this.inputMergerClassName, workSpec.inputMergerClassName) && p.f(this.input, workSpec.input) && p.f(this.output, workSpec.output) && this.initialDelay == workSpec.initialDelay && this.intervalDuration == workSpec.intervalDuration && this.flexDuration == workSpec.flexDuration && p.f(this.constraints, workSpec.constraints) && this.runAttemptCount == workSpec.runAttemptCount && this.backoffPolicy == workSpec.backoffPolicy && this.backoffDelayDuration == workSpec.backoffDelayDuration && this.lastEnqueueTime == workSpec.lastEnqueueTime && this.minimumRetentionDuration == workSpec.minimumRetentionDuration && this.scheduleRequestedAt == workSpec.scheduleRequestedAt && this.expedited == workSpec.expedited && this.outOfQuotaPolicy == workSpec.outOfQuotaPolicy && this.periodCount == workSpec.periodCount && this.generation == workSpec.generation;
    }

    public final int getGeneration() {
        return this.generation;
    }

    public final int getPeriodCount() {
        return this.periodCount;
    }

    public final boolean hasConstraints() {
        return !p.f(Constraints.NONE, this.constraints);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v32, types: [int] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v41 */
    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.workerClassName.hashCode()) * 31;
        String str = this.inputMergerClassName;
        int iHashCode2 = (((((((((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.input.hashCode()) * 31) + this.output.hashCode()) * 31) + Long.hashCode(this.initialDelay)) * 31) + Long.hashCode(this.intervalDuration)) * 31) + Long.hashCode(this.flexDuration)) * 31) + this.constraints.hashCode()) * 31) + Integer.hashCode(this.runAttemptCount)) * 31) + this.backoffPolicy.hashCode()) * 31) + Long.hashCode(this.backoffDelayDuration)) * 31) + Long.hashCode(this.lastEnqueueTime)) * 31) + Long.hashCode(this.minimumRetentionDuration)) * 31) + Long.hashCode(this.scheduleRequestedAt)) * 31;
        boolean z10 = this.expedited;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return ((((((iHashCode2 + r12) * 31) + this.outOfQuotaPolicy.hashCode()) * 31) + Integer.hashCode(this.periodCount)) * 31) + Integer.hashCode(this.generation);
    }

    public final boolean isBackedOff() {
        return this.state == WorkInfo.State.ENQUEUED && this.runAttemptCount > 0;
    }

    public final boolean isPeriodic() {
        return this.intervalDuration != 0;
    }

    public final void setBackoffDelayDuration(long j10) {
        if (j10 > WorkRequest.MAX_BACKOFF_MILLIS) {
            Logger.get().warning(TAG, "Backoff delay duration exceeds maximum value");
        }
        if (j10 < 10000) {
            Logger.get().warning(TAG, "Backoff delay duration less than minimum value");
        }
        this.backoffDelayDuration = n.p(j10, 10000L, WorkRequest.MAX_BACKOFF_MILLIS);
    }

    public final void setPeriodCount(int i10) {
        this.periodCount = i10;
    }

    public final void setPeriodic(long j10) {
        if (j10 < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            Logger.get().warning(TAG, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        setPeriodic(n.f(j10, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS), n.f(j10, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS));
    }

    public final void setPeriodic(long j10, long j11) {
        if (j10 < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            Logger.get().warning(TAG, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.intervalDuration = n.f(j10, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS);
        if (j11 < 300000) {
            Logger.get().warning(TAG, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j11 > this.intervalDuration) {
            Logger.get().warning(TAG, "Flex duration greater than interval duration; Changed to " + j10);
        }
        this.flexDuration = n.p(j11, 300000L, this.intervalDuration);
    }

    @NotNull
    public String toString() {
        return "{WorkSpec: " + this.id + '}';
    }
}
