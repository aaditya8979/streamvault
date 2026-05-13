package oc;

import com.mgs.carparking.netbean.RecommandVideosEntity;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: VideoMoreContract.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface b {
    void isLoading(boolean z10);

    void loadNoNet(boolean z10);

    void onClick(@Nullable RecommandVideosEntity recommandVideosEntity);

    void resetNoMoreData();

    void showData(@Nullable List<RecommandVideosEntity> list);
}
