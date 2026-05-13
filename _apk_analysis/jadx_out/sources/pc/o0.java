package pc;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.mgs.carparking.netbean.BlockListEntry;
import com.mgs.carparking.ui.channelcontent.SpecialDetailNewActivity;
import com.mgs.carparking.ui.homecontent.recommend.HomeRecommendMultipleListViewModel;

/* JADX INFO: compiled from: ItemHomeRecommendMultipleSpecialListItemViewModel.java */
/* JADX INFO: loaded from: classes5.dex */
public class o0 extends np.c<HomeRecommendMultipleListViewModel> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BlockListEntry f77235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f77236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public pp.b f77237d;

    public o0(@NonNull HomeRecommendMultipleListViewModel homeRecommendMultipleListViewModel, BlockListEntry blockListEntry, int i10) {
        super(homeRecommendMultipleListViewModel);
        this.f77237d = new pp.b(new pp.a() { // from class: pc.n0
            @Override // pp.a
            public final void call() {
                this.f77233a.b();
            }
        });
        this.f77235b = blockListEntry;
        this.f77236c = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        Bundle bundle = new Bundle();
        bundle.putInt("id", this.f77235b.getTopic_id());
        ((HomeRecommendMultipleListViewModel) this.f75954a).startActivity(SpecialDetailNewActivity.class, bundle);
    }
}
