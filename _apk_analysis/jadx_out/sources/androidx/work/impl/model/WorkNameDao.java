package androidx.work.impl.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WorkNameDao.kt */
/* JADX INFO: loaded from: classes7.dex */
@Dao
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\n\u001a\u00020\u0006H'¨\u0006\f"}, d2 = {"Landroidx/work/impl/model/WorkNameDao;", "", "Landroidx/work/impl/model/WorkName;", "workName", "Lbn/r;", "insert", "", "name", "", "getWorkSpecIdsWithName", "workSpecId", "getNamesForWorkSpecId", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public interface WorkNameDao {
    @Query("SELECT name FROM workname WHERE work_spec_id=:workSpecId")
    @NotNull
    List<String> getNamesForWorkSpecId(@NotNull String workSpecId);

    @Query("SELECT work_spec_id FROM workname WHERE name=:name")
    @NotNull
    List<String> getWorkSpecIdsWithName(@NotNull String name);

    @Insert(onConflict = 5)
    void insert(@NotNull WorkName workName);
}
