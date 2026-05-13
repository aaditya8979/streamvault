package wc;

import androidx.annotation.DrawableRes;
import com.mgs.carparking.netbean.VideoCollectionBeanEntry;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CollectionContract.kt */
/* JADX INFO: loaded from: classes9.dex */
public interface b {
    void delete();

    void refresh(int i10);

    void setEdits(@DrawableRes int i10);

    void showData(@Nullable List<VideoCollectionBeanEntry> list);

    void video(@Nullable String str, int i10);

    void whole(@Nullable String str);
}
