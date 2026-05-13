package pc;

import androidx.annotation.NonNull;
import com.mgs.carparking.netbean.BlockListEntry;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.recommend.HomeRecommendMultipleListViewModel;
import java.util.List;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;

/* JADX INFO: compiled from: ItemHomeRecommendMultipleSlideViewModel.java */
/* JADX INFO: loaded from: classes5.dex */
public class m0 extends np.e<HomeRecommendMultipleListViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<BlockListEntry> f77228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SingleLiveEvent<RecommandVideosEntity> f77229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f77230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f77231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public pp.b f77232g;

    public m0(@NonNull HomeRecommendMultipleListViewModel homeRecommendMultipleListViewModel, List<BlockListEntry> list, int i10, boolean z10, String str) {
        super(homeRecommendMultipleListViewModel);
        this.f77229d = new SingleLiveEvent<>();
        this.f77232g = new pp.b(new pp.a() { // from class: pc.l0
            @Override // pp.a
            public final void call() {
                this.f77227a.c();
            }
        });
        this.f77228c = list;
        this.f75958b = str;
        this.f77230e = i10;
        this.f77231f = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        ((HomeRecommendMultipleListViewModel) this.f75954a).f44684p.setValue(this.f77229d.getValue());
    }
}
