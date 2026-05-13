package od;

import android.view.ViewGroup;
import com.mgs.carparking.widgets.cardbanner.adapter.BannerViewHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BannerAdapter.kt */
/* JADX INFO: loaded from: classes7.dex */
public interface a {
    void a(@Nullable BannerViewHolder bannerViewHolder, int i10);

    @NotNull
    BannerViewHolder b(@Nullable ViewGroup viewGroup, int i10);

    int getCount();
}
