package androidx.work.impl.model;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PreferenceDao.kt */
/* JADX INFO: loaded from: classes11.dex */
@Dao
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H'¨\u0006\r"}, d2 = {"Landroidx/work/impl/model/PreferenceDao;", "", "Landroidx/work/impl/model/Preference;", "preference", "Lbn/r;", "insertPreference", "", "key", "", "getLongValue", "(Ljava/lang/String;)Ljava/lang/Long;", "Landroidx/lifecycle/LiveData;", "getObservableLongValue", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public interface PreferenceDao {
    @Query("SELECT long_value FROM Preference where `key`=:key")
    @Nullable
    Long getLongValue(@NotNull String key);

    @Query("SELECT long_value FROM Preference where `key`=:key")
    @NotNull
    LiveData<Long> getObservableLongValue(@NotNull String key);

    @Insert(onConflict = 1)
    void insertPreference(@NotNull Preference preference);
}
