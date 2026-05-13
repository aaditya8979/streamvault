package nc;

import androidx.annotation.NonNull;
import com.mgs.carparking.netbean.BlockListEntry;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.HomeContentMultipleListViewModel;
import java.util.List;
import me.goldze.mvvmhabit.base.bus.event.SingleLiveEvent;

/* JADX INFO: compiled from: ItemHomeContentMultipleSlideViewModel.java */
/* JADX INFO: loaded from: classes12.dex */
public class c1 extends np.e<HomeContentMultipleListViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<BlockListEntry> f75753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SingleLiveEvent<RecommandVideosEntity> f75754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f75755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f75756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public pp.b f75757g;

    public c1(@NonNull HomeContentMultipleListViewModel homeContentMultipleListViewModel, List<BlockListEntry> list, int i10, boolean z10, String str) {
        super(homeContentMultipleListViewModel);
        this.f75754d = new SingleLiveEvent<>();
        this.f75757g = new pp.b(new pp.a() { // from class: nc.b1
            @Override // pp.a
            public final void call() {
                this.f75750a.c();
            }
        });
        this.f75753c = list;
        this.f75755e = i10;
        this.f75958b = str;
        this.f75756f = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        ((HomeContentMultipleListViewModel) this.f75954a).f44607m.setValue(this.f75754d.getValue());
    }
}
