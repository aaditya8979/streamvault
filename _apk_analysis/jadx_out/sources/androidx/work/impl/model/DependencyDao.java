package androidx.work.impl.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DependencyDao.kt */
/* JADX INFO: loaded from: classes3.dex */
@Dao
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H'¨\u0006\u000e"}, d2 = {"Landroidx/work/impl/model/DependencyDao;", "", "Landroidx/work/impl/model/Dependency;", "dependency", "Lbn/r;", "insertDependency", "", "id", "", "hasCompletedAllPrerequisites", "", "getPrerequisites", "getDependentWorkIds", "hasDependents", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public interface DependencyDao {
    @Query("SELECT work_spec_id FROM dependency WHERE prerequisite_id=:id")
    @NotNull
    List<String> getDependentWorkIds(@NotNull String id2);

    @Query("SELECT prerequisite_id FROM dependency WHERE work_spec_id=:id")
    @NotNull
    List<String> getPrerequisites(@NotNull String id2);

    @Query("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=:id AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)")
    boolean hasCompletedAllPrerequisites(@NotNull String id2);

    @Query("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=:id")
    boolean hasDependents(@NotNull String id2);

    @Insert(onConflict = 5)
    void insertDependency(@NotNull Dependency dependency);
}
