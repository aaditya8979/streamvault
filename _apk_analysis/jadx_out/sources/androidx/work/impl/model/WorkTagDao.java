package androidx.work.impl.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: WorkTagDao.kt */
/* JADX INFO: loaded from: classes11.dex */
@Dao
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\t\u001a\u00020\u0006H'J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0007\u001a\u00020\u0006H'J\u001e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0016¨\u0006\u0010"}, d2 = {"Landroidx/work/impl/model/WorkTagDao;", "", "Landroidx/work/impl/model/WorkTag;", "workTag", "Lbn/r;", "insert", "", "id", "deleteByWorkSpecId", "tag", "", "getWorkSpecIdsWithTag", "getTagsForWorkSpecId", "", "tags", "insertTags", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public interface WorkTagDao {

    /* JADX INFO: compiled from: WorkTagDao.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void insertTags(@NotNull WorkTagDao workTagDao, @NotNull String str, @NotNull Set<String> set) {
            p.k(str, "id");
            p.k(set, "tags");
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                workTagDao.insert(new WorkTag((String) it.next(), str));
            }
        }
    }

    @Query("DELETE FROM worktag WHERE work_spec_id=:id")
    void deleteByWorkSpecId(@NotNull String str);

    @Query("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=:id")
    @NotNull
    List<String> getTagsForWorkSpecId(@NotNull String id2);

    @Query("SELECT work_spec_id FROM worktag WHERE tag=:tag")
    @NotNull
    List<String> getWorkSpecIdsWithTag(@NotNull String tag);

    @Insert(onConflict = 5)
    void insert(@NotNull WorkTag workTag);

    void insertTags(@NotNull String str, @NotNull Set<String> set);
}
