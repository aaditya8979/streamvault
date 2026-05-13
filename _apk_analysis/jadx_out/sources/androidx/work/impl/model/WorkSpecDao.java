package androidx.work.impl.model;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;
import androidx.work.Data;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WorkSpecDao.kt */
/* JADX INFO: loaded from: classes7.dex */
@Dao
@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0011\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\u0006H'J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH'J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000b0\u000fH'J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H'J\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H'J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0012\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0007\u001a\u00020\u0006H'J\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH'J\"\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u000b0\u000f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH'J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000b2\u0006\u0010$\u001a\u00020\u0006H'J\u001c\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u000b0\u000f2\u0006\u0010$\u001a\u00020\u0006H'J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000b2\u0006\u0010\n\u001a\u00020\u0006H'J\u001c\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u000b0\u000f2\u0006\u0010\n\u001a\u00020\u0006H'J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010$\u001a\u00020\u0006H'J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\n\u001a\u00020\u0006H'J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH'J\b\u0010.\u001a\u00020-H'J\u0018\u00100\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0019H'J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H'J\b\u00102\u001a\u00020\u0013H'J\u0016\u00104\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u00103\u001a\u00020\u0013H'J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u00105\u001a\u00020\u0013H'J\u000e\u00107\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH'J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH'J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u00109\u001a\u00020\u0019H'J\b\u0010;\u001a\u00020\u0004H'J\u0010\u0010<\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0010\u0010=\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006>"}, d2 = {"Landroidx/work/impl/model/WorkSpecDao;", "", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "Lbn/r;", "insertWorkSpec", "", "id", "delete", "getWorkSpec", "name", "", "Landroidx/work/impl/model/WorkSpec$IdAndState;", "getWorkSpecIdAndStatesForName", "getAllWorkSpecIds", "Landroidx/lifecycle/LiveData;", "getAllWorkSpecIdsLiveData", "Landroidx/work/WorkInfo$State;", "state", "", "setState", "incrementPeriodCount", "Landroidx/work/Data;", "output", "setOutput", "", "enqueueTime", "setLastEnqueuedTime", "incrementWorkSpecRunAttemptCount", "resetWorkSpecRunAttemptCount", "getState", "Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "getWorkStatusPojoForId", "ids", "getWorkStatusPojoForIds", "getWorkStatusPojoLiveDataForIds", "tag", "getWorkStatusPojoForTag", "getWorkStatusPojoLiveDataForTag", "getWorkStatusPojoForName", "getWorkStatusPojoLiveDataForName", "getInputsFromPrerequisites", "getUnfinishedWorkWithTag", "getUnfinishedWorkWithName", "getAllUnfinishedWork", "", "hasUnfinishedWork", "startTime", "markWorkSpecScheduled", "getScheduleRequestedAtLiveData", "resetScheduledState", "schedulerLimit", "getEligibleWorkForScheduling", "maxLimit", "getAllEligibleWorkSpecsForScheduling", "getScheduledWork", "getRunningWork", "startingAt", "getRecentlyCompletedWork", "pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast", "incrementGeneration", "updateWorkSpec", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
@SuppressLint({"UnknownNullness"})
public interface WorkSpecDao {
    @Query("DELETE FROM workspec WHERE id=:id")
    void delete(@NotNull String str);

    @Query("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT :maxLimit")
    @NotNull
    List<WorkSpec> getAllEligibleWorkSpecsForScheduling(int maxLimit);

    @Query("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)")
    @NotNull
    List<String> getAllUnfinishedWork();

    @Query("SELECT id FROM workspec")
    @NotNull
    List<String> getAllWorkSpecIds();

    @Query("SELECT id FROM workspec")
    @Transaction
    @NotNull
    LiveData<List<String>> getAllWorkSpecIdsLiveData();

    @Query("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(:schedulerLimit-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))")
    @NotNull
    List<WorkSpec> getEligibleWorkForScheduling(int schedulerLimit);

    @Query("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=:id)")
    @NotNull
    List<Data> getInputsFromPrerequisites(@NotNull String id2);

    @Query("SELECT * FROM workspec WHERE last_enqueue_time >= :startingAt AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC")
    @NotNull
    List<WorkSpec> getRecentlyCompletedWork(long startingAt);

    @Query("SELECT * FROM workspec WHERE state=1")
    @NotNull
    List<WorkSpec> getRunningWork();

    @Query("SELECT schedule_requested_at FROM workspec WHERE id=:id")
    @NotNull
    LiveData<Long> getScheduleRequestedAtLiveData(@NotNull String id2);

    @Query("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1")
    @NotNull
    List<WorkSpec> getScheduledWork();

    @Query("SELECT state FROM workspec WHERE id=:id")
    @Nullable
    WorkInfo.State getState(@NotNull String id2);

    @Query("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    @NotNull
    List<String> getUnfinishedWorkWithName(@NotNull String name);

    @Query("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    @NotNull
    List<String> getUnfinishedWorkWithTag(@NotNull String tag);

    @Query("SELECT * FROM workspec WHERE id=:id")
    @Nullable
    WorkSpec getWorkSpec(@NotNull String id2);

    @Query("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    @NotNull
    List<WorkSpec.IdAndState> getWorkSpecIdAndStatesForName(@NotNull String name);

    @Query("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id=:id")
    @Transaction
    @Nullable
    WorkSpec.WorkInfoPojo getWorkStatusPojoForId(@NotNull String id2);

    @Query("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (:ids)")
    @Transaction
    @NotNull
    List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForIds(@NotNull List<String> ids);

    @Query("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    @Transaction
    @NotNull
    List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForName(@NotNull String name);

    @Query("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    @Transaction
    @NotNull
    List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForTag(@NotNull String tag);

    @Query("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (:ids)")
    @Transaction
    @NotNull
    LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForIds(@NotNull List<String> ids);

    @Query("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    @Transaction
    @NotNull
    LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForName(@NotNull String name);

    @Query("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    @Transaction
    @NotNull
    LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForTag(@NotNull String tag);

    @Query("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1")
    boolean hasUnfinishedWork();

    @Query("UPDATE workspec SET generation=generation+1 WHERE id=:id")
    void incrementGeneration(@NotNull String str);

    @Query("UPDATE workspec SET period_count=period_count+1 WHERE id=:id")
    void incrementPeriodCount(@NotNull String str);

    @Query("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=:id")
    int incrementWorkSpecRunAttemptCount(@NotNull String id2);

    @Insert(onConflict = 5)
    void insertWorkSpec(@NotNull WorkSpec workSpec);

    @Query("UPDATE workspec SET schedule_requested_at=:startTime WHERE id=:id")
    int markWorkSpecScheduled(@NotNull String id2, long startTime);

    @Query("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))")
    void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();

    @Query("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)")
    int resetScheduledState();

    @Query("UPDATE workspec SET run_attempt_count=0 WHERE id=:id")
    int resetWorkSpecRunAttemptCount(@NotNull String id2);

    @Query("UPDATE workspec SET last_enqueue_time=:enqueueTime WHERE id=:id")
    void setLastEnqueuedTime(@NotNull String str, long j10);

    @Query("UPDATE workspec SET output=:output WHERE id=:id")
    void setOutput(@NotNull String str, @NotNull Data data);

    @Query("UPDATE workspec SET state=:state WHERE id=:id")
    int setState(@NotNull WorkInfo.State state, @NotNull String id2);

    @Update
    void updateWorkSpec(@NotNull WorkSpec workSpec);
}
